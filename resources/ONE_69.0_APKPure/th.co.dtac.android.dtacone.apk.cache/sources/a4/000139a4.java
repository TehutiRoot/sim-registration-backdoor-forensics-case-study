package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.cardreader.CardReaderService;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.repository.OnePostpaidRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidValidateBarcodeViewModelFactory_Factory */
/* loaded from: classes10.dex */
public final class OnePostpaidValidateBarcodeViewModelFactory_Factory implements Factory<OnePostpaidValidateBarcodeViewModelFactory> {

    /* renamed from: a */
    public final Provider f94712a;

    /* renamed from: b */
    public final Provider f94713b;

    /* renamed from: c */
    public final Provider f94714c;

    /* renamed from: d */
    public final Provider f94715d;

    /* renamed from: e */
    public final Provider f94716e;

    public OnePostpaidValidateBarcodeViewModelFactory_Factory(Provider<OnePostpaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4, Provider<CardReaderService> provider5) {
        this.f94712a = provider;
        this.f94713b = provider2;
        this.f94714c = provider3;
        this.f94715d = provider4;
        this.f94716e = provider5;
    }

    public static OnePostpaidValidateBarcodeViewModelFactory_Factory create(Provider<OnePostpaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4, Provider<CardReaderService> provider5) {
        return new OnePostpaidValidateBarcodeViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static OnePostpaidValidateBarcodeViewModelFactory newInstance(OnePostpaidRepository onePostpaidRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService, CardReaderService cardReaderService) {
        return new OnePostpaidValidateBarcodeViewModelFactory(onePostpaidRepository, configurationRepository, rx2ThreadService, oneErrorService, cardReaderService);
    }

    @Override // javax.inject.Provider
    public OnePostpaidValidateBarcodeViewModelFactory get() {
        return newInstance((OnePostpaidRepository) this.f94712a.get(), (ConfigurationRepository) this.f94713b.get(), (Rx2ThreadService) this.f94714c.get(), (OneErrorService) this.f94715d.get(), (CardReaderService) this.f94716e.get());
    }
}