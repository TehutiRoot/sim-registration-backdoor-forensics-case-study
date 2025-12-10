package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import th.p047co.dtac.android.dtacone.manager.bus.RxBus;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.ApplicationModule_ProvideRxBusFactory */
/* loaded from: classes7.dex */
public final class ApplicationModule_ProvideRxBusFactory implements Factory<RxBus<Object>> {

    /* renamed from: a */
    public final ApplicationModule f83111a;

    public ApplicationModule_ProvideRxBusFactory(ApplicationModule applicationModule) {
        this.f83111a = applicationModule;
    }

    public static ApplicationModule_ProvideRxBusFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideRxBusFactory(applicationModule);
    }

    public static RxBus<Object> provideRxBus(ApplicationModule applicationModule) {
        return (RxBus) Preconditions.checkNotNullFromProvides(applicationModule.provideRxBus());
    }

    @Override // javax.inject.Provider
    public RxBus<Object> get() {
        return provideRxBus(this.f83111a);
    }
}
