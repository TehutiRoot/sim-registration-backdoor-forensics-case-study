package th.p047co.dtac.android.dtacone.configuration;

import android.net.ConnectivityManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.AndroidModule_ProvideConnectivityFactory */
/* loaded from: classes7.dex */
public final class AndroidModule_ProvideConnectivityFactory implements Factory<ConnectivityManager> {

    /* renamed from: a */
    public final AndroidModule f83067a;

    public AndroidModule_ProvideConnectivityFactory(AndroidModule androidModule) {
        this.f83067a = androidModule;
    }

    public static AndroidModule_ProvideConnectivityFactory create(AndroidModule androidModule) {
        return new AndroidModule_ProvideConnectivityFactory(androidModule);
    }

    public static ConnectivityManager provideConnectivity(AndroidModule androidModule) {
        return (ConnectivityManager) Preconditions.checkNotNullFromProvides(androidModule.m19638g());
    }

    @Override // javax.inject.Provider
    public ConnectivityManager get() {
        return provideConnectivity(this.f83067a);
    }
}
