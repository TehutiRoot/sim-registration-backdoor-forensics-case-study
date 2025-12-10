package th.p047co.dtac.android.dtacone.util.network;

import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.util.network.NetworkUtil_Factory */
/* loaded from: classes8.dex */
public final class NetworkUtil_Factory implements Factory<NetworkUtil> {

    /* renamed from: a */
    public final Provider f87211a;

    /* renamed from: b */
    public final Provider f87212b;

    public NetworkUtil_Factory(Provider<TelephonyManager> provider, Provider<ConnectivityManager> provider2) {
        this.f87211a = provider;
        this.f87212b = provider2;
    }

    public static NetworkUtil_Factory create(Provider<TelephonyManager> provider, Provider<ConnectivityManager> provider2) {
        return new NetworkUtil_Factory(provider, provider2);
    }

    public static NetworkUtil newInstance(TelephonyManager telephonyManager, ConnectivityManager connectivityManager) {
        return new NetworkUtil(telephonyManager, connectivityManager);
    }

    @Override // javax.inject.Provider
    public NetworkUtil get() {
        return newInstance((TelephonyManager) this.f87211a.get(), (ConnectivityManager) this.f87212b.get());
    }
}