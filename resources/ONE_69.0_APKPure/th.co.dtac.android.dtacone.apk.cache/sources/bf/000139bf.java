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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePricePlansViewModelFactory_Factory */
/* loaded from: classes10.dex */
public final class OnePricePlansViewModelFactory_Factory implements Factory<OnePricePlansViewModelFactory> {

    /* renamed from: a */
    public final Provider f94754a;

    /* renamed from: b */
    public final Provider f94755b;

    /* renamed from: c */
    public final Provider f94756c;

    public OnePricePlansViewModelFactory_Factory(Provider<OnePostpaidRepository> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3) {
        this.f94754a = provider;
        this.f94755b = provider2;
        this.f94756c = provider3;
    }

    public static OnePricePlansViewModelFactory_Factory create(Provider<OnePostpaidRepository> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3) {
        return new OnePricePlansViewModelFactory_Factory(provider, provider2, provider3);
    }

    public static OnePricePlansViewModelFactory newInstance(OnePostpaidRepository onePostpaidRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService) {
        return new OnePricePlansViewModelFactory(onePostpaidRepository, rx2ThreadService, oneErrorService);
    }

    @Override // javax.inject.Provider
    public OnePricePlansViewModelFactory get() {
        return newInstance((OnePostpaidRepository) this.f94754a.get(), (Rx2ThreadService) this.f94755b.get(), (OneErrorService) this.f94756c.get());
    }
}