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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.campaign.view_model.OneCampaignViewModel_Factory */
/* loaded from: classes10.dex */
public final class OneCampaignViewModel_Factory implements Factory<OneCampaignViewModel> {

    /* renamed from: a */
    public final Provider f89032a;

    /* renamed from: b */
    public final Provider f89033b;

    /* renamed from: c */
    public final Provider f89034c;

    /* renamed from: d */
    public final Provider f89035d;

    /* renamed from: e */
    public final Provider f89036e;

    /* renamed from: f */
    public final Provider f89037f;

    public OneCampaignViewModel_Factory(Provider<OneCampaignRepository> provider, Provider<PreferencesViewModel> provider2, Provider<PreferencesRepository> provider3, Provider<ConfigurationRepository> provider4, Provider<Rx2ThreadService> provider5, Provider<OneErrorService> provider6) {
        this.f89032a = provider;
        this.f89033b = provider2;
        this.f89034c = provider3;
        this.f89035d = provider4;
        this.f89036e = provider5;
        this.f89037f = provider6;
    }

    public static OneCampaignViewModel_Factory create(Provider<OneCampaignRepository> provider, Provider<PreferencesViewModel> provider2, Provider<PreferencesRepository> provider3, Provider<ConfigurationRepository> provider4, Provider<Rx2ThreadService> provider5, Provider<OneErrorService> provider6) {
        return new OneCampaignViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static OneCampaignViewModel newInstance(OneCampaignRepository oneCampaignRepository, PreferencesViewModel preferencesViewModel, PreferencesRepository preferencesRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService) {
        return new OneCampaignViewModel(oneCampaignRepository, preferencesViewModel, preferencesRepository, configurationRepository, rx2ThreadService, oneErrorService);
    }

    @Override // javax.inject.Provider
    public OneCampaignViewModel get() {
        return newInstance((OneCampaignRepository) this.f89032a.get(), (PreferencesViewModel) this.f89033b.get(), (PreferencesRepository) this.f89034c.get(), (ConfigurationRepository) this.f89035d.get(), (Rx2ThreadService) this.f89036e.get(), (OneErrorService) this.f89037f.get());
    }
}