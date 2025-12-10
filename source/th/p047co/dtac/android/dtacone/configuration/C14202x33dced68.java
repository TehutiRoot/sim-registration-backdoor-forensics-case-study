package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.data.remote.devicer_sale.OneDeviceSaleApi;
import th.p047co.dtac.android.dtacone.data.remote.postpaid.OnePostpaidApi;
import th.p047co.dtac.android.dtacone.manager.service.UdidService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.util.FileUtil;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.repository.OnePostpaidRepository;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.SingletonRepositoryModule_ProvideOnePostpaidReregistRepositoryFactory */
/* loaded from: classes7.dex */
public final class C14202x33dced68 implements Factory<OnePostpaidRepository> {

    /* renamed from: a */
    public final SingletonRepositoryModule f83338a;

    /* renamed from: b */
    public final Provider f83339b;

    /* renamed from: c */
    public final Provider f83340c;

    /* renamed from: d */
    public final Provider f83341d;

    /* renamed from: e */
    public final Provider f83342e;

    /* renamed from: f */
    public final Provider f83343f;

    /* renamed from: g */
    public final Provider f83344g;

    /* renamed from: h */
    public final Provider f83345h;

    /* renamed from: i */
    public final Provider f83346i;

    /* renamed from: j */
    public final Provider f83347j;

    public C14202x33dced68(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<OnePostpaidApi> provider2, Provider<OneDeviceSaleApi> provider3, Provider<RtrRx2Repository> provider4, Provider<PreferencesRepository> provider5, Provider<ConfigurationRepository> provider6, Provider<FileUtil> provider7, Provider<PreferencesViewModel> provider8, Provider<UdidService> provider9) {
        this.f83338a = singletonRepositoryModule;
        this.f83339b = provider;
        this.f83340c = provider2;
        this.f83341d = provider3;
        this.f83342e = provider4;
        this.f83343f = provider5;
        this.f83344g = provider6;
        this.f83345h = provider7;
        this.f83346i = provider8;
        this.f83347j = provider9;
    }

    public static C14202x33dced68 create(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<OnePostpaidApi> provider2, Provider<OneDeviceSaleApi> provider3, Provider<RtrRx2Repository> provider4, Provider<PreferencesRepository> provider5, Provider<ConfigurationRepository> provider6, Provider<FileUtil> provider7, Provider<PreferencesViewModel> provider8, Provider<UdidService> provider9) {
        return new C14202x33dced68(singletonRepositoryModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static OnePostpaidRepository provideOnePostpaidReregistRepository(SingletonRepositoryModule singletonRepositoryModule, RTRApiRx2 rTRApiRx2, OnePostpaidApi onePostpaidApi, OneDeviceSaleApi oneDeviceSaleApi, RtrRx2Repository rtrRx2Repository, PreferencesRepository preferencesRepository, ConfigurationRepository configurationRepository, FileUtil fileUtil, PreferencesViewModel preferencesViewModel, UdidService udidService) {
        return (OnePostpaidRepository) Preconditions.checkNotNullFromProvides(singletonRepositoryModule.provideOnePostpaidReregistRepository(rTRApiRx2, onePostpaidApi, oneDeviceSaleApi, rtrRx2Repository, preferencesRepository, configurationRepository, fileUtil, preferencesViewModel, udidService));
    }

    @Override // javax.inject.Provider
    public OnePostpaidRepository get() {
        return provideOnePostpaidReregistRepository(this.f83338a, (RTRApiRx2) this.f83339b.get(), (OnePostpaidApi) this.f83340c.get(), (OneDeviceSaleApi) this.f83341d.get(), (RtrRx2Repository) this.f83342e.get(), (PreferencesRepository) this.f83343f.get(), (ConfigurationRepository) this.f83344g.get(), (FileUtil) this.f83345h.get(), (PreferencesViewModel) this.f83346i.get(), (UdidService) this.f83347j.get());
    }
}
