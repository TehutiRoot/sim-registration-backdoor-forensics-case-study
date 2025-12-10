package th.p047co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.cardreader.CardReaderService;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.mrtr_postpaid.MrtrPostpaidRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration.MrtrPostpaidValidateBarcodeViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class MrtrPostpaidValidateBarcodeViewModelFactory_Factory implements Factory<MrtrPostpaidValidateBarcodeViewModelFactory> {

    /* renamed from: a */
    public final Provider f106540a;

    /* renamed from: b */
    public final Provider f106541b;

    /* renamed from: c */
    public final Provider f106542c;

    /* renamed from: d */
    public final Provider f106543d;

    /* renamed from: e */
    public final Provider f106544e;

    public MrtrPostpaidValidateBarcodeViewModelFactory_Factory(Provider<MrtrPostpaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4, Provider<CardReaderService> provider5) {
        this.f106540a = provider;
        this.f106541b = provider2;
        this.f106542c = provider3;
        this.f106543d = provider4;
        this.f106544e = provider5;
    }

    public static MrtrPostpaidValidateBarcodeViewModelFactory_Factory create(Provider<MrtrPostpaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4, Provider<CardReaderService> provider5) {
        return new MrtrPostpaidValidateBarcodeViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static MrtrPostpaidValidateBarcodeViewModelFactory newInstance(MrtrPostpaidRepository mrtrPostpaidRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, MrtrErrorService mrtrErrorService, CardReaderService cardReaderService) {
        return new MrtrPostpaidValidateBarcodeViewModelFactory(mrtrPostpaidRepository, configurationRepository, rx2ThreadService, mrtrErrorService, cardReaderService);
    }

    @Override // javax.inject.Provider
    public MrtrPostpaidValidateBarcodeViewModelFactory get() {
        return newInstance((MrtrPostpaidRepository) this.f106540a.get(), (ConfigurationRepository) this.f106541b.get(), (Rx2ThreadService) this.f106542c.get(), (MrtrErrorService) this.f106543d.get(), (CardReaderService) this.f106544e.get());
    }
}