package th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepositoryImpl_Factory */
/* loaded from: classes10.dex */
public final class OnePrepaidRepositoryImpl_Factory implements Factory<OnePrepaidRepositoryImpl> {

    /* renamed from: a */
    public final Provider f95945a;

    /* renamed from: b */
    public final Provider f95946b;

    /* renamed from: c */
    public final Provider f95947c;

    /* renamed from: d */
    public final Provider f95948d;

    /* renamed from: e */
    public final Provider f95949e;

    /* renamed from: f */
    public final Provider f95950f;

    /* renamed from: g */
    public final Provider f95951g;

    public OnePrepaidRepositoryImpl_Factory(Provider<RTRApiRx2> provider, Provider<OneChangeOwnerApi> provider2, Provider<FileUtil> provider3, Provider<ConfigurationRepository> provider4, Provider<RtrRx2Repository> provider5, Provider<PreferencesViewModel> provider6, Provider<UdidService> provider7) {
        this.f95945a = provider;
        this.f95946b = provider2;
        this.f95947c = provider3;
        this.f95948d = provider4;
        this.f95949e = provider5;
        this.f95950f = provider6;
        this.f95951g = provider7;
    }

    public static OnePrepaidRepositoryImpl_Factory create(Provider<RTRApiRx2> provider, Provider<OneChangeOwnerApi> provider2, Provider<FileUtil> provider3, Provider<ConfigurationRepository> provider4, Provider<RtrRx2Repository> provider5, Provider<PreferencesViewModel> provider6, Provider<UdidService> provider7) {
        return new OnePrepaidRepositoryImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static OnePrepaidRepositoryImpl newInstance(RTRApiRx2 rTRApiRx2, OneChangeOwnerApi oneChangeOwnerApi, FileUtil fileUtil, ConfigurationRepository configurationRepository, RtrRx2Repository rtrRx2Repository, PreferencesViewModel preferencesViewModel, UdidService udidService) {
        return new OnePrepaidRepositoryImpl(rTRApiRx2, oneChangeOwnerApi, fileUtil, configurationRepository, rtrRx2Repository, preferencesViewModel, udidService);
    }

    @Override // javax.inject.Provider
    public OnePrepaidRepositoryImpl get() {
        return newInstance((RTRApiRx2) this.f95945a.get(), (OneChangeOwnerApi) this.f95946b.get(), (FileUtil) this.f95947c.get(), (ConfigurationRepository) this.f95948d.get(), (RtrRx2Repository) this.f95949e.get(), (PreferencesViewModel) this.f95950f.get(), (UdidService) this.f95951g.get());
    }
}