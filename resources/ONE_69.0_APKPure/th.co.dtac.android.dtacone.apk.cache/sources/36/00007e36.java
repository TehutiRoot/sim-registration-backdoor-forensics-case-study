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
    public final ConnectivityManager f40669a;

    /* renamed from: b */
    public final NetworkObserver.Listener f40670b;

    /* renamed from: c */
    public final RealNetworkObserver$networkCallback$1 f40671c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.net.ConnectivityManager$NetworkCallback, coil.network.RealNetworkObserver$networkCallback$1] */
    public RealNetworkObserver(ConnectivityManager connectivityManager, NetworkObserver.Listener listener) {
        this.f40669a = connectivityManager;
        this.f40670b = listener;
        ?? r4 = new ConnectivityManager.NetworkCallback() { // from class: coil.network.RealNetworkObserver$networkCallback$1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(@NotNull Network network) {
                RealNetworkObserver.m51039a(RealNetworkObserver.this, network, true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(@NotNull Network network) {
                RealNetworkObserver.m51039a(RealNetworkObserver.this, network, false);
            }
        };
        this.f40671c = r4;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), (ConnectivityManager.NetworkCallback) r4);
    }

    /* renamed from: a */
    public static final /* synthetic */ void m51039a(RealNetworkObserver realNetworkObserver, Network network, boolean z) {
        realNetworkObserver.m51037c(network, z);
    }

    /* renamed from: b */
    public final boolean m51038b(Network network) {
        NetworkCapabilities networkCapabilities = this.f40669a.getNetworkCapabilities(network);
        if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void m51037c(Network network, boolean z) {
        boolean m51038b;
        Network[] allNetworks = this.f40669a.getAllNetworks();
        int length = allNetworks.length;
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Network network2 = allNetworks[i];
            if (Intrinsics.areEqual(network2, network)) {
                m51038b = z;
            } else {
                m51038b = m51038b(network2);
            }
            if (m51038b) {
                z2 = true;
                break;
            }
            i++;
        }
        this.f40670b.onConnectivityChange(z2);
    }

    @Override // coil.network.NetworkObserver
    public boolean isOnline() {
        for (Network network : this.f40669a.getAllNetworks()) {
            if (m51038b(network)) {
                return true;
            }
        }
        return false;
    }

    @Override // coil.network.NetworkObserver
    public void shutdown() {
        this.f40669a.unregisterNetworkCallback(this.f40671c);
    }
}