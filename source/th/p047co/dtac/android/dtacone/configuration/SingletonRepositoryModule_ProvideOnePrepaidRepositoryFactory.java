package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.OneChangeOwner.OneChangeOwnerApi;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.service.UdidService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.util.FileUtil;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.SingletonRepositoryModule_ProvideOnePrepaidRepositoryFactory */
/* loaded from: classes7.dex */
public final class SingletonRepositoryModule_ProvideOnePrepaidRepositoryFactory implements Factory<OnePrepaidRepository> {

    /* renamed from: a */
    public final SingletonRepositoryModule f83362a;

    /* renamed from: b */
    public final Provider f83363b;

    /* renamed from: c */
    public final Provider f83364c;

    /* renamed from: d */
    public final Provider f83365d;

    /* renamed from: e */
    public final Provider f83366e;

    /* renamed from: f */
    public final Provider f83367f;

    /* renamed from: g */
    public final Provider f83368g;

    /* renamed from: h */
    public final Provider f83369h;

    public SingletonRepositoryModule_ProvideOnePrepaidRepositoryFactory(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<OneChangeOwnerApi> provider2, Provider<FileUtil> provider3, Provider<ConfigurationRepository> provider4, Provider<RtrRx2Repository> provider5, Provider<PreferencesViewModel> provider6, Provider<UdidService> provider7) {
        this.f83362a = singletonRepositoryModule;
        this.f83363b = provider;
        this.f83364c = provider2;
        this.f83365d = provider3;
        this.f83366e = provider4;
        this.f83367f = provider5;
        this.f83368g = provider6;
        this.f83369h = provider7;
    }

    public static SingletonRepositoryModule_ProvideOnePrepaidRepositoryFactory create(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<OneChangeOwnerApi> provider2, Provider<FileUtil> provider3, Provider<ConfigurationRepository> provider4, Provider<RtrRx2Repository> provider5, Provider<PreferencesViewModel> provider6, Provider<UdidService> provider7) {
        return new SingletonRepositoryModule_ProvideOnePrepaidRepositoryFactory(singletonRepositoryModule, provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static OnePrepaidRepository provideOnePrepaidRepository(SingletonRepositoryModule singletonRepositoryModule, RTRApiRx2 rTRApiRx2, OneChangeOwnerApi oneChangeOwnerApi, FileUtil fileUtil, ConfigurationRepository configurationRepository, RtrRx2Repository rtrRx2Repository, PreferencesViewModel preferencesViewModel, UdidService udidService) {
        return (OnePrepaidRepository) Preconditions.checkNotNullFromProvides(singletonRepositoryModule.provideOnePrepaidRepository(rTRApiRx2, oneChangeOwnerApi, fileUtil, configurationRepository, rtrRx2Repository, preferencesViewModel, udidService));
    }

    @Override // javax.inject.Provider
    public OnePrepaidRepository get() {
        return provideOnePrepaidRepository(this.f83362a, (RTRApiRx2) this.f83363b.get(), (OneChangeOwnerApi) this.f83364c.get(), (FileUtil) this.f83365d.get(), (ConfigurationRepository) this.f83366e.get(), (RtrRx2Repository) this.f83367f.get(), (PreferencesViewModel) this.f83368g.get(), (UdidService) this.f83369h.get());
    }
}
