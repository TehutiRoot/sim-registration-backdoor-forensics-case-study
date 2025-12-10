package th.p047co.dtac.android.dtacone.viewmodel.mrtr_change_sim;

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
import th.p047co.dtac.android.dtacone.repository.mrtr_change_sim.MrtrChangeSimRepository;
import th.p047co.dtac.android.dtacone.util.FileUtil;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_change_sim.MrtrChangeSimViewModel_Factory */
/* loaded from: classes9.dex */
public final class MrtrChangeSimViewModel_Factory implements Factory<MrtrChangeSimViewModel> {

    /* renamed from: a */
    public final Provider f106310a;

    /* renamed from: b */
    public final Provider f106311b;

    /* renamed from: c */
    public final Provider f106312c;

    /* renamed from: d */
    public final Provider f106313d;

    /* renamed from: e */
    public final Provider f106314e;

    /* renamed from: f */
    public final Provider f106315f;

    /* renamed from: g */
    public final Provider f106316g;

    /* renamed from: h */
    public final Provider f106317h;

    public MrtrChangeSimViewModel_Factory(Provider<MrtrChangeSimRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<CompressImage> provider4, Provider<Compressor> provider5, Provider<BitmapUtil> provider6, Provider<FileUtil> provider7, Provider<MrtrErrorService> provider8) {
        this.f106310a = provider;
        this.f106311b = provider2;
        this.f106312c = provider3;
        this.f106313d = provider4;
        this.f106314e = provider5;
        this.f106315f = provider6;
        this.f106316g = provider7;
        this.f106317h = provider8;
    }

    public static MrtrChangeSimViewModel_Factory create(Provider<MrtrChangeSimRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<CompressImage> provider4, Provider<Compressor> provider5, Provider<BitmapUtil> provider6, Provider<FileUtil> provider7, Provider<MrtrErrorService> provider8) {
        return new MrtrChangeSimViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static MrtrChangeSimViewModel newInstance(MrtrChangeSimRepository mrtrChangeSimRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, CompressImage compressImage, Compressor compressor, BitmapUtil bitmapUtil, FileUtil fileUtil, MrtrErrorService mrtrErrorService) {
        return new MrtrChangeSimViewModel(mrtrChangeSimRepository, configurationRepository, rx2ThreadService, compressImage, compressor, bitmapUtil, fileUtil, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public MrtrChangeSimViewModel get() {
        return newInstance((MrtrChangeSimRepository) this.f106310a.get(), (ConfigurationRepository) this.f106311b.get(), (Rx2ThreadService) this.f106312c.get(), (CompressImage) this.f106313d.get(), (Compressor) this.f106314e.get(), (BitmapUtil) this.f106315f.get(), (FileUtil) this.f106316g.get(), (MrtrErrorService) this.f106317h.get());
    }
}