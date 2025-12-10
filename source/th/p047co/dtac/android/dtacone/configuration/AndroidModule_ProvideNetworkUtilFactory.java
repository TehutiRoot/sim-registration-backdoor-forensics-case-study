package th.p047co.dtac.android.dtacone.configuration;

import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.util.network.NetworkUtil;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.AndroidModule_ProvideNetworkUtilFactory */
/* loaded from: classes7.dex */
public final class AndroidModule_ProvideNetworkUtilFactory implements Factory<NetworkUtil> {

    /* renamed from: a */
    public final AndroidModule f83077a;

    /* renamed from: b */
    public final Provider f83078b;

    /* renamed from: c */
    public final Provider f83079c;

    public AndroidModule_ProvideNetworkUtilFactory(AndroidModule androidModule, Provider<TelephonyManager> provider, Provider<ConnectivityManager> provider2) {
        this.f83077a = androidModule;
        this.f83078b = provider;
        this.f83079c = provider2;
    }

    public static AndroidModule_ProvideNetworkUtilFactory create(AndroidModule androidModule, Provider<TelephonyManager> provider, Provider<ConnectivityManager> provider2) {
        return new AndroidModule_ProvideNetworkUtilFactory(androidModule, provider, provider2);
    }

    public static NetworkUtil provideNetworkUtil(AndroidModule androidModule, TelephonyManager telephonyManager, ConnectivityManager connectivityManager) {
        return (NetworkUtil) Preconditions.checkNotNullFromProvides(androidModule.m19629p(telephonyManager, connectivityManager));
    }

    @Override // javax.inject.Provider
    public NetworkUtil get() {
        return provideNetworkUtil(this.f83077a, (TelephonyManager) this.f83078b.get(), (ConnectivityManager) this.f83079c.get());
    }
}
