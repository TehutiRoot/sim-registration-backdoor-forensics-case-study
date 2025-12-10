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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration.MrtrPostpaidValidateBarcodeViewModel_Factory */
/* loaded from: classes9.dex */
public final class MrtrPostpaidValidateBarcodeViewModel_Factory implements Factory<MrtrPostpaidValidateBarcodeViewModel> {

    /* renamed from: a */
    public final Provider f106545a;

    /* renamed from: b */
    public final Provider f106546b;

    /* renamed from: c */
    public final Provider f106547c;

    /* renamed from: d */
    public final Provider f106548d;

    /* renamed from: e */
    public final Provider f106549e;

    public MrtrPostpaidValidateBarcodeViewModel_Factory(Provider<MrtrPostpaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4, Provider<CardReaderService> provider5) {
        this.f106545a = provider;
        this.f106546b = provider2;
        this.f106547c = provider3;
        this.f106548d = provider4;
        this.f106549e = provider5;
    }

    public static MrtrPostpaidValidateBarcodeViewModel_Factory create(Provider<MrtrPostpaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4, Provider<CardReaderService> provider5) {
        return new MrtrPostpaidValidateBarcodeViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static MrtrPostpaidValidateBarcodeViewModel newInstance(MrtrPostpaidRepository mrtrPostpaidRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, MrtrErrorService mrtrErrorService, CardReaderService cardReaderService) {
        return new MrtrPostpaidValidateBarcodeViewModel(mrtrPostpaidRepository, configurationRepository, rx2ThreadService, mrtrErrorService, cardReaderService);
    }

    @Override // javax.inject.Provider
    public MrtrPostpaidValidateBarcodeViewModel get() {
        return newInstance((MrtrPostpaidRepository) this.f106545a.get(), (ConfigurationRepository) this.f106546b.get(), (Rx2ThreadService) this.f106547c.get(), (MrtrErrorService) this.f106548d.get(), (CardReaderService) this.f106549e.get());
    }
}