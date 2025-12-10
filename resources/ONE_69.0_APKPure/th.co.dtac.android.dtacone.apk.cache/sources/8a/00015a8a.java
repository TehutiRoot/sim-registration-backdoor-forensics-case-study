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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.ocr.OCRSubscriberViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class OCRSubscriberViewModelFactory_Factory implements Factory<OCRSubscriberViewModelFactory> {

    /* renamed from: a */
    public final Provider f106952a;

    /* renamed from: b */
    public final Provider f106953b;

    /* renamed from: c */
    public final Provider f106954c;

    /* renamed from: d */
    public final Provider f106955d;

    public OCRSubscriberViewModelFactory_Factory(Provider<ConfigurationRepository> provider, Provider<Rx2ThreadService> provider2, Provider<MrtrErrorService> provider3, Provider<BitmapUtil> provider4) {
        this.f106952a = provider;
        this.f106953b = provider2;
        this.f106954c = provider3;
        this.f106955d = provider4;
    }

    public static OCRSubscriberViewModelFactory_Factory create(Provider<ConfigurationRepository> provider, Provider<Rx2ThreadService> provider2, Provider<MrtrErrorService> provider3, Provider<BitmapUtil> provider4) {
        return new OCRSubscriberViewModelFactory_Factory(provider, provider2, provider3, provider4);
    }

    public static OCRSubscriberViewModelFactory newInstance(ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, MrtrErrorService mrtrErrorService, BitmapUtil bitmapUtil) {
        return new OCRSubscriberViewModelFactory(configurationRepository, rx2ThreadService, mrtrErrorService, bitmapUtil);
    }

    @Override // javax.inject.Provider
    public OCRSubscriberViewModelFactory get() {
        return newInstance((ConfigurationRepository) this.f106952a.get(), (Rx2ThreadService) this.f106953b.get(), (MrtrErrorService) this.f106954c.get(), (BitmapUtil) this.f106955d.get());
    }
}