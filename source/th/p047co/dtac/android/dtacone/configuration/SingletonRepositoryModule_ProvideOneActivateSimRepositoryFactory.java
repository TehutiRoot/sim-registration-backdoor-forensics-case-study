package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.view.appOne.activateSim.repository.OneActivateSimRepository;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.SingletonRepositoryModule_ProvideOneActivateSimRepositoryFactory */
/* loaded from: classes7.dex */
public final class SingletonRepositoryModule_ProvideOneActivateSimRepositoryFactory implements Factory<OneActivateSimRepository> {

    /* renamed from: a */
    public final SingletonRepositoryModule f83275a;

    /* renamed from: b */
    public final Provider f83276b;

    public SingletonRepositoryModule_ProvideOneActivateSimRepositoryFactory(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider) {
        this.f83275a = singletonRepositoryModule;
        this.f83276b = provider;
    }

    public static SingletonRepositoryModule_ProvideOneActivateSimRepositoryFactory create(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider) {
        return new SingletonRepositoryModule_ProvideOneActivateSimRepositoryFactory(singletonRepositoryModule, provider);
    }

    public static OneActivateSimRepository provideOneActivateSimRepository(SingletonRepositoryModule singletonRepositoryModule, RTRApiRx2 rTRApiRx2) {
        return (OneActivateSimRepository) Preconditions.checkNotNullFromProvides(singletonRepositoryModule.provideOneActivateSimRepository(rTRApiRx2));
    }

    @Override // javax.inject.Provider
    public OneActivateSimRepository get() {
        return provideOneActivateSimRepository(this.f83275a, (RTRApiRx2) this.f83276b.get());
    }
}
