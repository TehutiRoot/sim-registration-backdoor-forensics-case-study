package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.OneChangeOwner.OneChangeOwnerApi;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.service.UdidService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.util.FileUtil;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.SingletonRepositoryModule_ProvideOneMnpRepositoryFactory */
/* loaded from: classes7.dex */
public final class SingletonRepositoryModule_ProvideOneMnpRepositoryFactory implements Factory<OneMnpRepository> {

    /* renamed from: a */
    public final SingletonRepositoryModule f83303a;

    /* renamed from: b */
    public final Provider f83304b;

    /* renamed from: c */
    public final Provider f83305c;

    /* renamed from: d */
    public final Provider f83306d;

    /* renamed from: e */
    public final Provider f83307e;

    /* renamed from: f */
    public final Provider f83308f;

    /* renamed from: g */
    public final Provider f83309g;

    /* renamed from: h */
    public final Provider f83310h;

    public SingletonRepositoryModule_ProvideOneMnpRepositoryFactory(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<OneChangeOwnerApi> provider2, Provider<PreferencesRepository> provider3, Provider<ConfigurationRepository> provider4, Provider<FileUtil> provider5, Provider<RtrRx2Repository> provider6, Provider<UdidService> provider7) {
        this.f83303a = singletonRepositoryModule;
        this.f83304b = provider;
        this.f83305c = provider2;
        this.f83306d = provider3;
        this.f83307e = provider4;
        this.f83308f = provider5;
        this.f83309g = provider6;
        this.f83310h = provider7;
    }

    public static SingletonRepositoryModule_ProvideOneMnpRepositoryFactory create(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<OneChangeOwnerApi> provider2, Provider<PreferencesRepository> provider3, Provider<ConfigurationRepository> provider4, Provider<FileUtil> provider5, Provider<RtrRx2Repository> provider6, Provider<UdidService> provider7) {
        return new SingletonRepositoryModule_ProvideOneMnpRepositoryFactory(singletonRepositoryModule, provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static OneMnpRepository provideOneMnpRepository(SingletonRepositoryModule singletonRepositoryModule, RTRApiRx2 rTRApiRx2, OneChangeOwnerApi oneChangeOwnerApi, PreferencesRepository preferencesRepository, ConfigurationRepository configurationRepository, FileUtil fileUtil, RtrRx2Repository rtrRx2Repository, UdidService udidService) {
        return (OneMnpRepository) Preconditions.checkNotNullFromProvides(singletonRepositoryModule.provideOneMnpRepository(rTRApiRx2, oneChangeOwnerApi, preferencesRepository, configurationRepository, fileUtil, rtrRx2Repository, udidService));
    }

    @Override // javax.inject.Provider
    public OneMnpRepository get() {
        return provideOneMnpRepository(this.f83303a, (RTRApiRx2) this.f83304b.get(), (OneChangeOwnerApi) this.f83305c.get(), (PreferencesRepository) this.f83306d.get(), (ConfigurationRepository) this.f83307e.get(), (FileUtil) this.f83308f.get(), (RtrRx2Repository) this.f83309g.get(), (UdidService) this.f83310h.get());
    }
}
