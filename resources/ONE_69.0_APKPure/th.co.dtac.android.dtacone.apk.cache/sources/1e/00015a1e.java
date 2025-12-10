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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_registration.MrtrPrepaidRegistrationViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class MrtrPrepaidRegistrationViewModelFactory_Factory implements Factory<MrtrPrepaidRegistrationViewModelFactory> {

    /* renamed from: a */
    public final Provider f106750a;

    /* renamed from: b */
    public final Provider f106751b;

    /* renamed from: c */
    public final Provider f106752c;

    /* renamed from: d */
    public final Provider f106753d;

    /* renamed from: e */
    public final Provider f106754e;

    /* renamed from: f */
    public final Provider f106755f;

    /* renamed from: g */
    public final Provider f106756g;

    public MrtrPrepaidRegistrationViewModelFactory_Factory(Provider<MrtrPrepaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<CompressImage> provider4, Provider<Compressor> provider5, Provider<BitmapUtil> provider6, Provider<MrtrErrorService> provider7) {
        this.f106750a = provider;
        this.f106751b = provider2;
        this.f106752c = provider3;
        this.f106753d = provider4;
        this.f106754e = provider5;
        this.f106755f = provider6;
        this.f106756g = provider7;
    }

    public static MrtrPrepaidRegistrationViewModelFactory_Factory create(Provider<MrtrPrepaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<CompressImage> provider4, Provider<Compressor> provider5, Provider<BitmapUtil> provider6, Provider<MrtrErrorService> provider7) {
        return new MrtrPrepaidRegistrationViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static MrtrPrepaidRegistrationViewModelFactory newInstance(MrtrPrepaidRepository mrtrPrepaidRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, CompressImage compressImage, Compressor compressor, BitmapUtil bitmapUtil, MrtrErrorService mrtrErrorService) {
        return new MrtrPrepaidRegistrationViewModelFactory(mrtrPrepaidRepository, configurationRepository, rx2ThreadService, compressImage, compressor, bitmapUtil, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public MrtrPrepaidRegistrationViewModelFactory get() {
        return newInstance((MrtrPrepaidRepository) this.f106750a.get(), (ConfigurationRepository) this.f106751b.get(), (Rx2ThreadService) this.f106752c.get(), (CompressImage) this.f106753d.get(), (Compressor) this.f106754e.get(), (BitmapUtil) this.f106755f.get(), (MrtrErrorService) this.f106756g.get());
    }
}