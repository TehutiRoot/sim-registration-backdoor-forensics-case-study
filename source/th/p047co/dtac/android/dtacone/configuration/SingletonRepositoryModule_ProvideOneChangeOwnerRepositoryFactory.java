package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.OneChangeOwner.OneChangeOwnerApi;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.util.FileUtil;
import th.p047co.dtac.android.dtacone.view.appOne.change_owner.repository.OneChangeOwnerRepository;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.SingletonRepositoryModule_ProvideOneChangeOwnerRepositoryFactory */
/* loaded from: classes7.dex */
public final class SingletonRepositoryModule_ProvideOneChangeOwnerRepositoryFactory implements Factory<OneChangeOwnerRepository> {

    /* renamed from: a */
    public final SingletonRepositoryModule f83284a;

    /* renamed from: b */
    public final Provider f83285b;

    /* renamed from: c */
    public final Provider f83286c;

    /* renamed from: d */
    public final Provider f83287d;

    /* renamed from: e */
    public final Provider f83288e;

    /* renamed from: f */
    public final Provider f83289f;

    public SingletonRepositoryModule_ProvideOneChangeOwnerRepositoryFactory(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<OneChangeOwnerApi> provider2, Provider<RtrRx2Repository> provider3, Provider<FileUtil> provider4, Provider<ConfigurationRepository> provider5) {
        this.f83284a = singletonRepositoryModule;
        this.f83285b = provider;
        this.f83286c = provider2;
        this.f83287d = provider3;
        this.f83288e = provider4;
        this.f83289f = provider5;
    }

    public static SingletonRepositoryModule_ProvideOneChangeOwnerRepositoryFactory create(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<OneChangeOwnerApi> provider2, Provider<RtrRx2Repository> provider3, Provider<FileUtil> provider4, Provider<ConfigurationRepository> provider5) {
        return new SingletonRepositoryModule_ProvideOneChangeOwnerRepositoryFactory(singletonRepositoryModule, provider, provider2, provider3, provider4, provider5);
    }

    public static OneChangeOwnerRepository provideOneChangeOwnerRepository(SingletonRepositoryModule singletonRepositoryModule, RTRApiRx2 rTRApiRx2, OneChangeOwnerApi oneChangeOwnerApi, RtrRx2Repository rtrRx2Repository, FileUtil fileUtil, ConfigurationRepository configurationRepository) {
        return (OneChangeOwnerRepository) Preconditions.checkNotNullFromProvides(singletonRepositoryModule.provideOneChangeOwnerRepository(rTRApiRx2, oneChangeOwnerApi, rtrRx2Repository, fileUtil, configurationRepository));
    }

    @Override // javax.inject.Provider
    public OneChangeOwnerRepository get() {
        return provideOneChangeOwnerRepository(this.f83284a, (RTRApiRx2) this.f83285b.get(), (OneChangeOwnerApi) this.f83286c.get(), (RtrRx2Repository) this.f83287d.get(), (FileUtil) this.f83288e.get(), (ConfigurationRepository) this.f83289f.get());
    }
}
