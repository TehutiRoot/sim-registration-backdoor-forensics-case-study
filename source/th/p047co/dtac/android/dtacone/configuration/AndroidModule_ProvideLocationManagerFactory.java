package th.p047co.dtac.android.dtacone.configuration;

import android.location.LocationManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.AndroidModule_ProvideLocationManagerFactory */
/* loaded from: classes7.dex */
public final class AndroidModule_ProvideLocationManagerFactory implements Factory<LocationManager> {

    /* renamed from: a */
    public final AndroidModule f83074a;

    public AndroidModule_ProvideLocationManagerFactory(AndroidModule androidModule) {
        this.f83074a = androidModule;
    }

    public static AndroidModule_ProvideLocationManagerFactory create(AndroidModule androidModule) {
        return new AndroidModule_ProvideLocationManagerFactory(androidModule);
    }

    public static LocationManager provideLocationManager(AndroidModule androidModule) {
        return (LocationManager) Preconditions.checkNotNullFromProvides(androidModule.m19632m());
    }

    @Override // javax.inject.Provider
    public LocationManager get() {
        return provideLocationManager(this.f83074a);
    }
}
