package th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_registration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import id.zelory.compressor.Compressor;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.compressor.CompressImage;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.mrtr_prepaid.MrtrPrepaidRepository;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_registration.MrtrPrepaidRegistrationViewModel_Factory */
/* loaded from: classes9.dex */
public final class MrtrPrepaidRegistrationViewModel_Factory implements Factory<MrtrPrepaidRegistrationViewModel> {

    /* renamed from: a */
    public final Provider f106757a;

    /* renamed from: b */
    public final Provider f106758b;

    /* renamed from: c */
    public final Provider f106759c;

    /* renamed from: d */
    public final Provider f106760d;

    /* renamed from: e */
    public final Provider f106761e;

    /* renamed from: f */
    public final Provider f106762f;

    /* renamed from: g */
    public final Provider f106763g;

    public MrtrPrepaidRegistrationViewModel_Factory(Provider<MrtrPrepaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<CompressImage> provider4, Provider<Compressor> provider5, Provider<BitmapUtil> provider6, Provider<MrtrErrorService> provider7) {
        this.f106757a = provider;
        this.f106758b = provider2;
        this.f106759c = provider3;
        this.f106760d = provider4;
        this.f106761e = provider5;
        this.f106762f = provider6;
        this.f106763g = provider7;
    }

    public static MrtrPrepaidRegistrationViewModel_Factory create(Provider<MrtrPrepaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<CompressImage> provider4, Provider<Compressor> provider5, Provider<BitmapUtil> provider6, Provider<MrtrErrorService> provider7) {
        return new MrtrPrepaidRegistrationViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static MrtrPrepaidRegistrationViewModel newInstance(MrtrPrepaidRepository mrtrPrepaidRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, CompressImage compressImage, Compressor compressor, BitmapUtil bitmapUtil, MrtrErrorService mrtrErrorService) {
        return new MrtrPrepaidRegistrationViewModel(mrtrPrepaidRepository, configurationRepository, rx2ThreadService, compressImage, compressor, bitmapUtil, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public MrtrPrepaidRegistrationViewModel get() {
        return newInstance((MrtrPrepaidRepository) this.f106757a.get(), (ConfigurationRepository) this.f106758b.get(), (Rx2ThreadService) this.f106759c.get(), (CompressImage) this.f106760d.get(), (Compressor) this.f106761e.get(), (BitmapUtil) this.f106762f.get(), (MrtrErrorService) this.f106763g.get());
    }
}