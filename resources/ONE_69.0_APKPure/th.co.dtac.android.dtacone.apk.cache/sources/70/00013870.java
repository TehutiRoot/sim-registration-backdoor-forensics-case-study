package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.repository.OnePostpaidRepository_Factory */
/* loaded from: classes10.dex */
public final class OnePostpaidRepository_Factory implements Factory<OnePostpaidRepository> {

    /* renamed from: a */
    public final Provider f94484a;

    /* renamed from: b */
    public final Provider f94485b;

    /* renamed from: c */
    public final Provider f94486c;

    /* renamed from: d */
    public final Provider f94487d;

    /* renamed from: e */
    public final Provider f94488e;

    /* renamed from: f */
    public final Provider f94489f;

    /* renamed from: g */
    public final Provider f94490g;

    /* renamed from: h */
    public final Provider f94491h;

    /* renamed from: i */
    public final Provider f94492i;

    public OnePostpaidRepository_Factory(Provider<RTRApiRx2> provider, Provider<OnePostpaidApi> provider2, Provider<OneDeviceSaleApi> provider3, Provider<RtrRx2Repository> provider4, Provider<PreferencesRepository> provider5, Provider<ConfigurationRepository> provider6, Provider<FileUtil> provider7, Provider<PreferencesViewModel> provider8, Provider<UdidService> provider9) {
        this.f94484a = provider;
        this.f94485b = provider2;
        this.f94486c = provider3;
        this.f94487d = provider4;
        this.f94488e = provider5;
        this.f94489f = provider6;
        this.f94490g = provider7;
        this.f94491h = provider8;
        this.f94492i = provider9;
    }

    public static OnePostpaidRepository_Factory create(Provider<RTRApiRx2> provider, Provider<OnePostpaidApi> provider2, Provider<OneDeviceSaleApi> provider3, Provider<RtrRx2Repository> provider4, Provider<PreferencesRepository> provider5, Provider<ConfigurationRepository> provider6, Provider<FileUtil> provider7, Provider<PreferencesViewModel> provider8, Provider<UdidService> provider9) {
        return new OnePostpaidRepository_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static OnePostpaidRepository newInstance(RTRApiRx2 rTRApiRx2, OnePostpaidApi onePostpaidApi, OneDeviceSaleApi oneDeviceSaleApi, RtrRx2Repository rtrRx2Repository, PreferencesRepository preferencesRepository, ConfigurationRepository configurationRepository, FileUtil fileUtil, PreferencesViewModel preferencesViewModel, UdidService udidService) {
        return new OnePostpaidRepository(rTRApiRx2, onePostpaidApi, oneDeviceSaleApi, rtrRx2Repository, preferencesRepository, configurationRepository, fileUtil, preferencesViewModel, udidService);
    }

    @Override // javax.inject.Provider
    public OnePostpaidRepository get() {
        return newInstance((RTRApiRx2) this.f94484a.get(), (OnePostpaidApi) this.f94485b.get(), (OneDeviceSaleApi) this.f94486c.get(), (RtrRx2Repository) this.f94487d.get(), (PreferencesRepository) this.f94488e.get(), (ConfigurationRepository) this.f94489f.get(), (FileUtil) this.f94490g.get(), (PreferencesViewModel) this.f94491h.get(), (UdidService) this.f94492i.get());
    }
}