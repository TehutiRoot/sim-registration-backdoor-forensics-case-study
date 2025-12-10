package th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_registration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.cardreader.CardReaderService;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.mrtr_prepaid.MrtrPrepaidRepository;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_registration.MrtrPrepaidValidateBarcodeViewModel_Factory */
/* loaded from: classes9.dex */
public final class MrtrPrepaidValidateBarcodeViewModel_Factory implements Factory<MrtrPrepaidValidateBarcodeViewModel> {

    /* renamed from: a */
    public final Provider f106798a;

    /* renamed from: b */
    public final Provider f106799b;

    /* renamed from: c */
    public final Provider f106800c;

    /* renamed from: d */
    public final Provider f106801d;

    /* renamed from: e */
    public final Provider f106802e;

    /* renamed from: f */
    public final Provider f106803f;

    public MrtrPrepaidValidateBarcodeViewModel_Factory(Provider<MrtrPrepaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4, Provider<BitmapUtil> provider5, Provider<CardReaderService> provider6) {
        this.f106798a = provider;
        this.f106799b = provider2;
        this.f106800c = provider3;
        this.f106801d = provider4;
        this.f106802e = provider5;
        this.f106803f = provider6;
    }

    public static MrtrPrepaidValidateBarcodeViewModel_Factory create(Provider<MrtrPrepaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4, Provider<BitmapUtil> provider5, Provider<CardReaderService> provider6) {
        return new MrtrPrepaidValidateBarcodeViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static MrtrPrepaidValidateBarcodeViewModel newInstance(MrtrPrepaidRepository mrtrPrepaidRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, MrtrErrorService mrtrErrorService, BitmapUtil bitmapUtil, CardReaderService cardReaderService) {
        return new MrtrPrepaidValidateBarcodeViewModel(mrtrPrepaidRepository, configurationRepository, rx2ThreadService, mrtrErrorService, bitmapUtil, cardReaderService);
    }

    @Override // javax.inject.Provider
    public MrtrPrepaidValidateBarcodeViewModel get() {
        return newInstance((MrtrPrepaidRepository) this.f106798a.get(), (ConfigurationRepository) this.f106799b.get(), (Rx2ThreadService) this.f106800c.get(), (MrtrErrorService) this.f106801d.get(), (BitmapUtil) this.f106802e.get(), (CardReaderService) this.f106803f.get());
    }
}