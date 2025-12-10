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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.ownerManagement.viewModel.OneOwnerManagementViewModelFactory_Factory */
/* loaded from: classes10.dex */
public final class OneOwnerManagementViewModelFactory_Factory implements Factory<OneOwnerManagementViewModelFactory> {

    /* renamed from: a */
    public final Provider f93170a;

    /* renamed from: b */
    public final Provider f93171b;

    /* renamed from: c */
    public final Provider f93172c;

    /* renamed from: d */
    public final Provider f93173d;

    /* renamed from: e */
    public final Provider f93174e;

    public OneOwnerManagementViewModelFactory_Factory(Provider<OneOwnerManagementRepository> provider, Provider<RtrRx2Repository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4, Provider<ConfigurationRepository> provider5) {
        this.f93170a = provider;
        this.f93171b = provider2;
        this.f93172c = provider3;
        this.f93173d = provider4;
        this.f93174e = provider5;
    }

    public static OneOwnerManagementViewModelFactory_Factory create(Provider<OneOwnerManagementRepository> provider, Provider<RtrRx2Repository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4, Provider<ConfigurationRepository> provider5) {
        return new OneOwnerManagementViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static OneOwnerManagementViewModelFactory newInstance(OneOwnerManagementRepository oneOwnerManagementRepository, RtrRx2Repository rtrRx2Repository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService, ConfigurationRepository configurationRepository) {
        return new OneOwnerManagementViewModelFactory(oneOwnerManagementRepository, rtrRx2Repository, rx2ThreadService, oneErrorService, configurationRepository);
    }

    @Override // javax.inject.Provider
    public OneOwnerManagementViewModelFactory get() {
        return newInstance((OneOwnerManagementRepository) this.f93170a.get(), (RtrRx2Repository) this.f93171b.get(), (Rx2ThreadService) this.f93172c.get(), (OneErrorService) this.f93173d.get(), (ConfigurationRepository) this.f93174e.get());
    }
}