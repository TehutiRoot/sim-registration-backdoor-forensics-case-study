package th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.viewModel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.repository.OneOwnerManagementRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.ownerManagement.viewModel.OneOwnerManagementViewModel_Factory */
/* loaded from: classes10.dex */
public final class OneOwnerManagementViewModel_Factory implements Factory<OneOwnerManagementViewModel> {

    /* renamed from: a */
    public final Provider f93175a;

    /* renamed from: b */
    public final Provider f93176b;

    /* renamed from: c */
    public final Provider f93177c;

    /* renamed from: d */
    public final Provider f93178d;

    /* renamed from: e */
    public final Provider f93179e;

    public OneOwnerManagementViewModel_Factory(Provider<OneOwnerManagementRepository> provider, Provider<RtrRx2Repository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4, Provider<ConfigurationRepository> provider5) {
        this.f93175a = provider;
        this.f93176b = provider2;
        this.f93177c = provider3;
        this.f93178d = provider4;
        this.f93179e = provider5;
    }

    public static OneOwnerManagementViewModel_Factory create(Provider<OneOwnerManagementRepository> provider, Provider<RtrRx2Repository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4, Provider<ConfigurationRepository> provider5) {
        return new OneOwnerManagementViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static OneOwnerManagementViewModel newInstance(OneOwnerManagementRepository oneOwnerManagementRepository, RtrRx2Repository rtrRx2Repository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService, ConfigurationRepository configurationRepository) {
        return new OneOwnerManagementViewModel(oneOwnerManagementRepository, rtrRx2Repository, rx2ThreadService, oneErrorService, configurationRepository);
    }

    @Override // javax.inject.Provider
    public OneOwnerManagementViewModel get() {
        return newInstance((OneOwnerManagementRepository) this.f93175a.get(), (RtrRx2Repository) this.f93176b.get(), (Rx2ThreadService) this.f93177c.get(), (OneErrorService) this.f93178d.get(), (ConfigurationRepository) this.f93179e.get());
    }
}