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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_mnp.MrtrMnpViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class MrtrMnpViewModelFactory_Factory implements Factory<MrtrMnpViewModelFactory> {

    /* renamed from: a */
    public final Provider f106388a;

    /* renamed from: b */
    public final Provider f106389b;

    /* renamed from: c */
    public final Provider f106390c;

    /* renamed from: d */
    public final Provider f106391d;

    /* renamed from: e */
    public final Provider f106392e;

    /* renamed from: f */
    public final Provider f106393f;

    /* renamed from: g */
    public final Provider f106394g;

    public MrtrMnpViewModelFactory_Factory(Provider<MrtrMnpRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<CompressImage> provider4, Provider<Compressor> provider5, Provider<BitmapUtil> provider6, Provider<MrtrErrorService> provider7) {
        this.f106388a = provider;
        this.f106389b = provider2;
        this.f106390c = provider3;
        this.f106391d = provider4;
        this.f106392e = provider5;
        this.f106393f = provider6;
        this.f106394g = provider7;
    }

    public static MrtrMnpViewModelFactory_Factory create(Provider<MrtrMnpRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<CompressImage> provider4, Provider<Compressor> provider5, Provider<BitmapUtil> provider6, Provider<MrtrErrorService> provider7) {
        return new MrtrMnpViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static MrtrMnpViewModelFactory newInstance(MrtrMnpRepository mrtrMnpRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, CompressImage compressImage, Compressor compressor, BitmapUtil bitmapUtil, MrtrErrorService mrtrErrorService) {
        return new MrtrMnpViewModelFactory(mrtrMnpRepository, configurationRepository, rx2ThreadService, compressImage, compressor, bitmapUtil, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public MrtrMnpViewModelFactory get() {
        return newInstance((MrtrMnpRepository) this.f106388a.get(), (ConfigurationRepository) this.f106389b.get(), (Rx2ThreadService) this.f106390c.get(), (CompressImage) this.f106391d.get(), (Compressor) this.f106392e.get(), (BitmapUtil) this.f106393f.get(), (MrtrErrorService) this.f106394g.get());
    }
}