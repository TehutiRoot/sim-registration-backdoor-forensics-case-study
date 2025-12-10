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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.consent_nontelco.viewModel.OneConsentNonTelcoViewModelFactory_Factory */
/* loaded from: classes10.dex */
public final class OneConsentNonTelcoViewModelFactory_Factory implements Factory<OneConsentNonTelcoViewModelFactory> {

    /* renamed from: a */
    public final Provider f89648a;

    /* renamed from: b */
    public final Provider f89649b;

    /* renamed from: c */
    public final Provider f89650c;

    public OneConsentNonTelcoViewModelFactory_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3) {
        this.f89648a = provider;
        this.f89649b = provider2;
        this.f89650c = provider3;
    }

    public static OneConsentNonTelcoViewModelFactory_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3) {
        return new OneConsentNonTelcoViewModelFactory_Factory(provider, provider2, provider3);
    }

    public static OneConsentNonTelcoViewModelFactory newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService) {
        return new OneConsentNonTelcoViewModelFactory(rTRApiRx2, rx2ThreadService, oneErrorService);
    }

    @Override // javax.inject.Provider
    public OneConsentNonTelcoViewModelFactory get() {
        return newInstance((RTRApiRx2) this.f89648a.get(), (Rx2ThreadService) this.f89649b.get(), (OneErrorService) this.f89650c.get());
    }
}