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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_change_sim.MrtrChangeSimViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class MrtrChangeSimViewModelFactory_Factory implements Factory<MrtrChangeSimViewModelFactory> {

    /* renamed from: a */
    public final Provider f106302a;

    /* renamed from: b */
    public final Provider f106303b;

    /* renamed from: c */
    public final Provider f106304c;

    /* renamed from: d */
    public final Provider f106305d;

    /* renamed from: e */
    public final Provider f106306e;

    /* renamed from: f */
    public final Provider f106307f;

    /* renamed from: g */
    public final Provider f106308g;

    /* renamed from: h */
    public final Provider f106309h;

    public MrtrChangeSimViewModelFactory_Factory(Provider<MrtrChangeSimRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<CompressImage> provider4, Provider<Compressor> provider5, Provider<BitmapUtil> provider6, Provider<FileUtil> provider7, Provider<MrtrErrorService> provider8) {
        this.f106302a = provider;
        this.f106303b = provider2;
        this.f106304c = provider3;
        this.f106305d = provider4;
        this.f106306e = provider5;
        this.f106307f = provider6;
        this.f106308g = provider7;
        this.f106309h = provider8;
    }

    public static MrtrChangeSimViewModelFactory_Factory create(Provider<MrtrChangeSimRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<CompressImage> provider4, Provider<Compressor> provider5, Provider<BitmapUtil> provider6, Provider<FileUtil> provider7, Provider<MrtrErrorService> provider8) {
        return new MrtrChangeSimViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static MrtrChangeSimViewModelFactory newInstance(MrtrChangeSimRepository mrtrChangeSimRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, CompressImage compressImage, Compressor compressor, BitmapUtil bitmapUtil, FileUtil fileUtil, MrtrErrorService mrtrErrorService) {
        return new MrtrChangeSimViewModelFactory(mrtrChangeSimRepository, configurationRepository, rx2ThreadService, compressImage, compressor, bitmapUtil, fileUtil, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public MrtrChangeSimViewModelFactory get() {
        return newInstance((MrtrChangeSimRepository) this.f106302a.get(), (ConfigurationRepository) this.f106303b.get(), (Rx2ThreadService) this.f106304c.get(), (CompressImage) this.f106305d.get(), (Compressor) this.f106306e.get(), (BitmapUtil) this.f106307f.get(), (FileUtil) this.f106308g.get(), (MrtrErrorService) this.f106309h.get());
    }
}