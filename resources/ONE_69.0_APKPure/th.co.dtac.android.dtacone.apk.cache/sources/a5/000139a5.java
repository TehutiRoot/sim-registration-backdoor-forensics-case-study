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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidValidateBarcodeViewModel_Factory */
/* loaded from: classes10.dex */
public final class OnePostpaidValidateBarcodeViewModel_Factory implements Factory<OnePostpaidValidateBarcodeViewModel> {

    /* renamed from: a */
    public final Provider f94717a;

    /* renamed from: b */
    public final Provider f94718b;

    /* renamed from: c */
    public final Provider f94719c;

    /* renamed from: d */
    public final Provider f94720d;

    /* renamed from: e */
    public final Provider f94721e;

    public OnePostpaidValidateBarcodeViewModel_Factory(Provider<OnePostpaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4, Provider<CardReaderService> provider5) {
        this.f94717a = provider;
        this.f94718b = provider2;
        this.f94719c = provider3;
        this.f94720d = provider4;
        this.f94721e = provider5;
    }

    public static OnePostpaidValidateBarcodeViewModel_Factory create(Provider<OnePostpaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4, Provider<CardReaderService> provider5) {
        return new OnePostpaidValidateBarcodeViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static OnePostpaidValidateBarcodeViewModel newInstance(OnePostpaidRepository onePostpaidRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService, CardReaderService cardReaderService) {
        return new OnePostpaidValidateBarcodeViewModel(onePostpaidRepository, configurationRepository, rx2ThreadService, oneErrorService, cardReaderService);
    }

    @Override // javax.inject.Provider
    public OnePostpaidValidateBarcodeViewModel get() {
        return newInstance((OnePostpaidRepository) this.f94717a.get(), (ConfigurationRepository) this.f94718b.get(), (Rx2ThreadService) this.f94719c.get(), (OneErrorService) this.f94720d.get(), (CardReaderService) this.f94721e.get());
    }
}