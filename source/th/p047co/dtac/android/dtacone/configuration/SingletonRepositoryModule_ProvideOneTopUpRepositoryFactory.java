package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.view.appOne.topup.repository.OneTopUpRepository;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.SingletonRepositoryModule_ProvideOneTopUpRepositoryFactory */
/* loaded from: classes7.dex */
public final class SingletonRepositoryModule_ProvideOneTopUpRepositoryFactory implements Factory<OneTopUpRepository> {

    /* renamed from: a */
    public final SingletonRepositoryModule f83398a;

    /* renamed from: b */
    public final Provider f83399b;

    /* renamed from: c */
    public final Provider f83400c;

    public SingletonRepositoryModule_ProvideOneTopUpRepositoryFactory(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2) {
        this.f83398a = singletonRepositoryModule;
        this.f83399b = provider;
        this.f83400c = provider2;
    }

    public static SingletonRepositoryModule_ProvideOneTopUpRepositoryFactory create(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2) {
        return new SingletonRepositoryModule_ProvideOneTopUpRepositoryFactory(singletonRepositoryModule, provider, provider2);
    }

    public static OneTopUpRepository provideOneTopUpRepository(SingletonRepositoryModule singletonRepositoryModule, RTRApiRx2 rTRApiRx2, RtrRx2Repository rtrRx2Repository) {
        return (OneTopUpRepository) Preconditions.checkNotNullFromProvides(singletonRepositoryModule.provideOneTopUpRepository(rTRApiRx2, rtrRx2Repository));
    }

    @Override // javax.inject.Provider
    public OneTopUpRepository get() {
        return provideOneTopUpRepository(this.f83398a, (RTRApiRx2) this.f83399b.get(), (RtrRx2Repository) this.f83400c.get());
    }
}
