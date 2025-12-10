package th.p047co.dtac.android.dtacone.view.appOne.consent_nontelco.viewModel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.consent_nontelco.viewModel.OneConsentNonTelcoViewModel_Factory */
/* loaded from: classes10.dex */
public final class OneConsentNonTelcoViewModel_Factory implements Factory<OneConsentNonTelcoViewModel> {

    /* renamed from: a */
    public final Provider f89651a;

    /* renamed from: b */
    public final Provider f89652b;

    /* renamed from: c */
    public final Provider f89653c;

    public OneConsentNonTelcoViewModel_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3) {
        this.f89651a = provider;
        this.f89652b = provider2;
        this.f89653c = provider3;
    }

    public static OneConsentNonTelcoViewModel_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3) {
        return new OneConsentNonTelcoViewModel_Factory(provider, provider2, provider3);
    }

    public static OneConsentNonTelcoViewModel newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService) {
        return new OneConsentNonTelcoViewModel(rTRApiRx2, rx2ThreadService, oneErrorService);
    }

    @Override // javax.inject.Provider
    public OneConsentNonTelcoViewModel get() {
        return newInstance((RTRApiRx2) this.f89651a.get(), (Rx2ThreadService) this.f89652b.get(), (OneErrorService) this.f89653c.get());
    }
}