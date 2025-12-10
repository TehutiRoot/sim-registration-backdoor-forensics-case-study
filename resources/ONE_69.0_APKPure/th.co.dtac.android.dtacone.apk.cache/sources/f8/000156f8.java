package th.p047co.dtac.android.dtacone.viewmodel.esim;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import id.zelory.compressor.Compressor;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.manager.compressor.CompressImage;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.esim.ESimRepository;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.esim.ESimViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class ESimViewModelFactory_Factory implements Factory<ESimViewModelFactory> {

    /* renamed from: a */
    public final Provider f105880a;

    /* renamed from: b */
    public final Provider f105881b;

    /* renamed from: c */
    public final Provider f105882c;

    /* renamed from: d */
    public final Provider f105883d;

    /* renamed from: e */
    public final Provider f105884e;

    /* renamed from: f */
    public final Provider f105885f;

    /* renamed from: g */
    public final Provider f105886g;

    /* renamed from: h */
    public final Provider f105887h;

    public ESimViewModelFactory_Factory(Provider<ESimRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<CompressImage> provider4, Provider<Compressor> provider5, Provider<BitmapUtil> provider6, Provider<PreferencesRepository> provider7, Provider<MrtrErrorService> provider8) {
        this.f105880a = provider;
        this.f105881b = provider2;
        this.f105882c = provider3;
        this.f105883d = provider4;
        this.f105884e = provider5;
        this.f105885f = provider6;
        this.f105886g = provider7;
        this.f105887h = provider8;
    }

    public static ESimViewModelFactory_Factory create(Provider<ESimRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<CompressImage> provider4, Provider<Compressor> provider5, Provider<BitmapUtil> provider6, Provider<PreferencesRepository> provider7, Provider<MrtrErrorService> provider8) {
        return new ESimViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static ESimViewModelFactory newInstance(ESimRepository eSimRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, CompressImage compressImage, Compressor compressor, BitmapUtil bitmapUtil, PreferencesRepository preferencesRepository, MrtrErrorService mrtrErrorService) {
        return new ESimViewModelFactory(eSimRepository, configurationRepository, rx2ThreadService, compressImage, compressor, bitmapUtil, preferencesRepository, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public ESimViewModelFactory get() {
        return newInstance((ESimRepository) this.f105880a.get(), (ConfigurationRepository) this.f105881b.get(), (Rx2ThreadService) this.f105882c.get(), (CompressImage) this.f105883d.get(), (Compressor) this.f105884e.get(), (BitmapUtil) this.f105885f.get(), (PreferencesRepository) this.f105886g.get(), (MrtrErrorService) this.f105887h.get());
    }
}