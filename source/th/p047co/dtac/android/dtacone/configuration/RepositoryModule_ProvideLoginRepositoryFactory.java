package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.repository.login.LoginRepository;

@ScopeMetadata("th.co.dtac.android.dtacone.configuration.PerActivity")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.RepositoryModule_ProvideLoginRepositoryFactory */
/* loaded from: classes7.dex */
public final class RepositoryModule_ProvideLoginRepositoryFactory implements Factory<LoginRepository> {

    /* renamed from: a */
    public final RepositoryModule f83198a;

    /* renamed from: b */
    public final Provider f83199b;

    /* renamed from: c */
    public final Provider f83200c;

    /* renamed from: d */
    public final Provider f83201d;

    /* renamed from: e */
    public final Provider f83202e;

    public RepositoryModule_ProvideLoginRepositoryFactory(RepositoryModule repositoryModule, Provider<RTRApiRx2> provider, Provider<TemporaryCache> provider2, Provider<RtrRx2Repository> provider3, Provider<RtrRepository> provider4) {
        this.f83198a = repositoryModule;
        this.f83199b = provider;
        this.f83200c = provider2;
        this.f83201d = provider3;
        this.f83202e = provider4;
    }

    public static RepositoryModule_ProvideLoginRepositoryFactory create(RepositoryModule repositoryModule, Provider<RTRApiRx2> provider, Provider<TemporaryCache> provider2, Provider<RtrRx2Repository> provider3, Provider<RtrRepository> provider4) {
        return new RepositoryModule_ProvideLoginRepositoryFactory(repositoryModule, provider, provider2, provider3, provider4);
    }

    public static LoginRepository provideLoginRepository(RepositoryModule repositoryModule, RTRApiRx2 rTRApiRx2, TemporaryCache temporaryCache, RtrRx2Repository rtrRx2Repository, RtrRepository rtrRepository) {
        return (LoginRepository) Preconditions.checkNotNullFromProvides(repositoryModule.provideLoginRepository(rTRApiRx2, temporaryCache, rtrRx2Repository, rtrRepository));
    }

    @Override // javax.inject.Provider
    public LoginRepository get() {
        return provideLoginRepository(this.f83198a, (RTRApiRx2) this.f83199b.get(), (TemporaryCache) this.f83200c.get(), (RtrRx2Repository) this.f83201d.get(), (RtrRepository) this.f83202e.get());
    }
}
