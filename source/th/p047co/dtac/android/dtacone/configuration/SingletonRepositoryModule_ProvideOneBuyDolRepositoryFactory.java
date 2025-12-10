package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.repository.OneBuyDolRepository;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.SingletonRepositoryModule_ProvideOneBuyDolRepositoryFactory */
/* loaded from: classes7.dex */
public final class SingletonRepositoryModule_ProvideOneBuyDolRepositoryFactory implements Factory<OneBuyDolRepository> {

    /* renamed from: a */
    public final SingletonRepositoryModule f83277a;

    /* renamed from: b */
    public final Provider f83278b;

    /* renamed from: c */
    public final Provider f83279c;

    public SingletonRepositoryModule_ProvideOneBuyDolRepositoryFactory(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2) {
        this.f83277a = singletonRepositoryModule;
        this.f83278b = provider;
        this.f83279c = provider2;
    }

    public static SingletonRepositoryModule_ProvideOneBuyDolRepositoryFactory create(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2) {
        return new SingletonRepositoryModule_ProvideOneBuyDolRepositoryFactory(singletonRepositoryModule, provider, provider2);
    }

    public static OneBuyDolRepository provideOneBuyDolRepository(SingletonRepositoryModule singletonRepositoryModule, RTRApiRx2 rTRApiRx2, RtrRx2Repository rtrRx2Repository) {
        return (OneBuyDolRepository) Preconditions.checkNotNullFromProvides(singletonRepositoryModule.provideOneBuyDolRepository(rTRApiRx2, rtrRx2Repository));
    }

    @Override // javax.inject.Provider
    public OneBuyDolRepository get() {
        return provideOneBuyDolRepository(this.f83277a, (RTRApiRx2) this.f83278b.get(), (RtrRx2Repository) this.f83279c.get());
    }
}
