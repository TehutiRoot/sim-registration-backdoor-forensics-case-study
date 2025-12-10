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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_registration.MrtrPrepaidValidateBarcodeViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class MrtrPrepaidValidateBarcodeViewModelFactory_Factory implements Factory<MrtrPrepaidValidateBarcodeViewModelFactory> {

    /* renamed from: a */
    public final Provider f106792a;

    /* renamed from: b */
    public final Provider f106793b;

    /* renamed from: c */
    public final Provider f106794c;

    /* renamed from: d */
    public final Provider f106795d;

    /* renamed from: e */
    public final Provider f106796e;

    /* renamed from: f */
    public final Provider f106797f;

    public MrtrPrepaidValidateBarcodeViewModelFactory_Factory(Provider<MrtrPrepaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4, Provider<BitmapUtil> provider5, Provider<CardReaderService> provider6) {
        this.f106792a = provider;
        this.f106793b = provider2;
        this.f106794c = provider3;
        this.f106795d = provider4;
        this.f106796e = provider5;
        this.f106797f = provider6;
    }

    public static MrtrPrepaidValidateBarcodeViewModelFactory_Factory create(Provider<MrtrPrepaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4, Provider<BitmapUtil> provider5, Provider<CardReaderService> provider6) {
        return new MrtrPrepaidValidateBarcodeViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static MrtrPrepaidValidateBarcodeViewModelFactory newInstance(MrtrPrepaidRepository mrtrPrepaidRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, MrtrErrorService mrtrErrorService, BitmapUtil bitmapUtil, CardReaderService cardReaderService) {
        return new MrtrPrepaidValidateBarcodeViewModelFactory(mrtrPrepaidRepository, configurationRepository, rx2ThreadService, mrtrErrorService, bitmapUtil, cardReaderService);
    }

    @Override // javax.inject.Provider
    public MrtrPrepaidValidateBarcodeViewModelFactory get() {
        return newInstance((MrtrPrepaidRepository) this.f106792a.get(), (ConfigurationRepository) this.f106793b.get(), (Rx2ThreadService) this.f106794c.get(), (MrtrErrorService) this.f106795d.get(), (BitmapUtil) this.f106796e.get(), (CardReaderService) this.f106797f.get());
    }
}