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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePricePlansViewModel_Factory */
/* loaded from: classes10.dex */
public final class OnePricePlansViewModel_Factory implements Factory<OnePricePlansViewModel> {

    /* renamed from: a */
    public final Provider f94757a;

    /* renamed from: b */
    public final Provider f94758b;

    /* renamed from: c */
    public final Provider f94759c;

    public OnePricePlansViewModel_Factory(Provider<OnePostpaidRepository> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3) {
        this.f94757a = provider;
        this.f94758b = provider2;
        this.f94759c = provider3;
    }

    public static OnePricePlansViewModel_Factory create(Provider<OnePostpaidRepository> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3) {
        return new OnePricePlansViewModel_Factory(provider, provider2, provider3);
    }

    public static OnePricePlansViewModel newInstance(OnePostpaidRepository onePostpaidRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService) {
        return new OnePricePlansViewModel(onePostpaidRepository, rx2ThreadService, oneErrorService);
    }

    @Override // javax.inject.Provider
    public OnePricePlansViewModel get() {
        return newInstance((OnePostpaidRepository) this.f94757a.get(), (Rx2ThreadService) this.f94758b.get(), (OneErrorService) this.f94759c.get());
    }
}