package th.p047co.dtac.android.dtacone.view.appOne.campaign.view_model;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.view.appOne.campaign.repository.OneCampaignRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.campaign.view_model.OneCampaignViewModelFactory_Factory */
/* loaded from: classes10.dex */
public final class OneCampaignViewModelFactory_Factory implements Factory<OneCampaignViewModelFactory> {

    /* renamed from: a */
    public final Provider f89026a;

    /* renamed from: b */
    public final Provider f89027b;

    /* renamed from: c */
    public final Provider f89028c;

    /* renamed from: d */
    public final Provider f89029d;

    /* renamed from: e */
    public final Provider f89030e;

    /* renamed from: f */
    public final Provider f89031f;

    public OneCampaignViewModelFactory_Factory(Provider<OneCampaignRepository> provider, Provider<PreferencesViewModel> provider2, Provider<PreferencesRepository> provider3, Provider<ConfigurationRepository> provider4, Provider<Rx2ThreadService> provider5, Provider<OneErrorService> provider6) {
        this.f89026a = provider;
        this.f89027b = provider2;
        this.f89028c = provider3;
        this.f89029d = provider4;
        this.f89030e = provider5;
        this.f89031f = provider6;
    }

    public static OneCampaignViewModelFactory_Factory create(Provider<OneCampaignRepository> provider, Provider<PreferencesViewModel> provider2, Provider<PreferencesRepository> provider3, Provider<ConfigurationRepository> provider4, Provider<Rx2ThreadService> provider5, Provider<OneErrorService> provider6) {
        return new OneCampaignViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static OneCampaignViewModelFactory newInstance(OneCampaignRepository oneCampaignRepository, PreferencesViewModel preferencesViewModel, PreferencesRepository preferencesRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService) {
        return new OneCampaignViewModelFactory(oneCampaignRepository, preferencesViewModel, preferencesRepository, configurationRepository, rx2ThreadService, oneErrorService);
    }

    @Override // javax.inject.Provider
    public OneCampaignViewModelFactory get() {
        return newInstance((OneCampaignRepository) this.f89026a.get(), (PreferencesViewModel) this.f89027b.get(), (PreferencesRepository) this.f89028c.get(), (ConfigurationRepository) this.f89029d.get(), (Rx2ThreadService) this.f89030e.get(), (OneErrorService) this.f89031f.get());
    }
}