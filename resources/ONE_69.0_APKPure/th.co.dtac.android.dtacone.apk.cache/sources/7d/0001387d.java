package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.repository.OnePostpaidRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidCampaignViewModelFactory_Factory */
/* loaded from: classes10.dex */
public final class OnePostpaidCampaignViewModelFactory_Factory implements Factory<OnePostpaidCampaignViewModelFactory> {

    /* renamed from: a */
    public final Provider f94507a;

    /* renamed from: b */
    public final Provider f94508b;

    /* renamed from: c */
    public final Provider f94509c;

    public OnePostpaidCampaignViewModelFactory_Factory(Provider<OnePostpaidRepository> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3) {
        this.f94507a = provider;
        this.f94508b = provider2;
        this.f94509c = provider3;
    }

    public static OnePostpaidCampaignViewModelFactory_Factory create(Provider<OnePostpaidRepository> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3) {
        return new OnePostpaidCampaignViewModelFactory_Factory(provider, provider2, provider3);
    }

    public static OnePostpaidCampaignViewModelFactory newInstance(OnePostpaidRepository onePostpaidRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService) {
        return new OnePostpaidCampaignViewModelFactory(onePostpaidRepository, rx2ThreadService, oneErrorService);
    }

    @Override // javax.inject.Provider
    public OnePostpaidCampaignViewModelFactory get() {
        return newInstance((OnePostpaidRepository) this.f94507a.get(), (Rx2ThreadService) this.f94508b.get(), (OneErrorService) this.f94509c.get());
    }
}