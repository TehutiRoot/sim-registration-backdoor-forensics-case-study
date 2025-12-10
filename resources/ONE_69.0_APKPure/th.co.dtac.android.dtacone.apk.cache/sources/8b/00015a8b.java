package th.p047co.dtac.android.dtacone.viewmodel.ocr;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.ocr.OCRSubscriberViewModel_Factory */
/* loaded from: classes9.dex */
public final class OCRSubscriberViewModel_Factory implements Factory<OCRSubscriberViewModel> {

    /* renamed from: a */
    public final Provider f106956a;

    /* renamed from: b */
    public final Provider f106957b;

    /* renamed from: c */
    public final Provider f106958c;

    /* renamed from: d */
    public final Provider f106959d;

    public OCRSubscriberViewModel_Factory(Provider<ConfigurationRepository> provider, Provider<Rx2ThreadService> provider2, Provider<MrtrErrorService> provider3, Provider<BitmapUtil> provider4) {
        this.f106956a = provider;
        this.f106957b = provider2;
        this.f106958c = provider3;
        this.f106959d = provider4;
    }

    public static OCRSubscriberViewModel_Factory create(Provider<ConfigurationRepository> provider, Provider<Rx2ThreadService> provider2, Provider<MrtrErrorService> provider3, Provider<BitmapUtil> provider4) {
        return new OCRSubscriberViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static OCRSubscriberViewModel newInstance(ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, MrtrErrorService mrtrErrorService, BitmapUtil bitmapUtil) {
        return new OCRSubscriberViewModel(configurationRepository, rx2ThreadService, mrtrErrorService, bitmapUtil);
    }

    @Override // javax.inject.Provider
    public OCRSubscriberViewModel get() {
        return newInstance((ConfigurationRepository) this.f106956a.get(), (Rx2ThreadService) this.f106957b.get(), (MrtrErrorService) this.f106958c.get(), (BitmapUtil) this.f106959d.get());
    }
}