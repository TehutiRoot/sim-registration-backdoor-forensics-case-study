package android.content;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import coil.network.NetworkObserver;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: coil.network.RealNetworkObserver */
/* loaded from: classes3.dex */
public final class RealNetworkObserver implements NetworkObserver {

    /* renamed from: a */
    public final ConnectivityManager f40657a;

    /* renamed from: b */
    public final NetworkObserver.Listener f40658b;

    /* renamed from: c */
    public final RealNetworkObserver$networkCallback$1 f40659c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.net.ConnectivityManager$NetworkCallback, coil.network.RealNetworkObserver$networkCallback$1] */
    public RealNetworkObserver(ConnectivityManager connectivityManager, NetworkObserver.Listener listener) {
        this.f40657a = connectivityManager;
        this.f40658b = listener;
        ?? r4 = new ConnectivityManager.NetworkCallback() { // from class: coil.network.RealNetworkObserver$networkCallback$1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(@NotNull Network network) {
                RealNetworkObserver.m51042a(RealNetworkObserver.this, network, true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(@NotNull Network network) {
                RealNetworkObserver.m51042a(RealNetworkObserver.this, network, false);
            }
        };
        this.f40659c = r4;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), (ConnectivityManager.NetworkCallback) r4);
    }

    /* renamed from: a */
    public static final /* synthetic */ void m51042a(RealNetworkObserver realNetworkObserver, Network network, boolean z) {
        realNetworkObserver.m51040c(network, z);
    }

    /* renamed from: b */
    public final boolean m51041b(Network network) {
        NetworkCapabilities networkCapabilities = this.f40657a.getNetworkCapabilities(network);
        if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void m51040c(Network network, boolean z) {
        boolean m51041b;
        Network[] allNetworks = this.f40657a.getAllNetworks();
        int length = allNetworks.length;
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Network network2 = allNetworks[i];
            if (Intrinsics.areEqual(network2, network)) {
                m51041b = z;
            } else {
                m51041b = m51041b(network2);
            }
            if (m51041b) {
                z2 = true;
                break;
            }
            i++;
        }
        this.f40658b.onConnectivityChange(z2);
    }

    @Override // coil.network.NetworkObserver
    public boolean isOnline() {
        for (Network network : this.f40657a.getAllNetworks()) {
            if (m51041b(network)) {
                return true;
            }
        }
        return false;
    }

    @Override // coil.network.NetworkObserver
    public void shutdown() {
        this.f40657a.unregisterNetworkCallback(this.f40659c);
    }
}
