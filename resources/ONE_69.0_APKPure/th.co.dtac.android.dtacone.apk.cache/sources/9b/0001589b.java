package th.p047co.dtac.android.dtacone.viewmodel.mrtr_mnp;

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
import th.p047co.dtac.android.dtacone.repository.mrtr_mnp.MrtrMnpRepository;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_mnp.MrtrMnpViewModel_Factory */
/* loaded from: classes9.dex */
public final class MrtrMnpViewModel_Factory implements Factory<MrtrMnpViewModel> {

    /* renamed from: a */
    public final Provider f106395a;

    /* renamed from: b */
    public final Provider f106396b;

    /* renamed from: c */
    public final Provider f106397c;

    /* renamed from: d */
    public final Provider f106398d;

    /* renamed from: e */
    public final Provider f106399e;

    /* renamed from: f */
    public final Provider f106400f;

    /* renamed from: g */
    public final Provider f106401g;

    public MrtrMnpViewModel_Factory(Provider<MrtrMnpRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<CompressImage> provider4, Provider<Compressor> provider5, Provider<BitmapUtil> provider6, Provider<MrtrErrorService> provider7) {
        this.f106395a = provider;
        this.f106396b = provider2;
        this.f106397c = provider3;
        this.f106398d = provider4;
        this.f106399e = provider5;
        this.f106400f = provider6;
        this.f106401g = provider7;
    }

    public static MrtrMnpViewModel_Factory create(Provider<MrtrMnpRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<CompressImage> provider4, Provider<Compressor> provider5, Provider<BitmapUtil> provider6, Provider<MrtrErrorService> provider7) {
        return new MrtrMnpViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static MrtrMnpViewModel newInstance(MrtrMnpRepository mrtrMnpRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, CompressImage compressImage, Compressor compressor, BitmapUtil bitmapUtil, MrtrErrorService mrtrErrorService) {
        return new MrtrMnpViewModel(mrtrMnpRepository, configurationRepository, rx2ThreadService, compressImage, compressor, bitmapUtil, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public MrtrMnpViewModel get() {
        return newInstance((MrtrMnpRepository) this.f106395a.get(), (ConfigurationRepository) this.f106396b.get(), (Rx2ThreadService) this.f106397c.get(), (CompressImage) this.f106398d.get(), (Compressor) this.f106399e.get(), (BitmapUtil) this.f106400f.get(), (MrtrErrorService) this.f106401g.get());
    }
}