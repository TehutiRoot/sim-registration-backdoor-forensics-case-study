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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.esim.ESimViewModel_Factory */
/* loaded from: classes9.dex */
public final class ESimViewModel_Factory implements Factory<ESimViewModel> {

    /* renamed from: a */
    public final Provider f105888a;

    /* renamed from: b */
    public final Provider f105889b;

    /* renamed from: c */
    public final Provider f105890c;

    /* renamed from: d */
    public final Provider f105891d;

    /* renamed from: e */
    public final Provider f105892e;

    /* renamed from: f */
    public final Provider f105893f;

    /* renamed from: g */
    public final Provider f105894g;

    /* renamed from: h */
    public final Provider f105895h;

    public ESimViewModel_Factory(Provider<ESimRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<CompressImage> provider4, Provider<Compressor> provider5, Provider<BitmapUtil> provider6, Provider<PreferencesRepository> provider7, Provider<MrtrErrorService> provider8) {
        this.f105888a = provider;
        this.f105889b = provider2;
        this.f105890c = provider3;
        this.f105891d = provider4;
        this.f105892e = provider5;
        this.f105893f = provider6;
        this.f105894g = provider7;
        this.f105895h = provider8;
    }

    public static ESimViewModel_Factory create(Provider<ESimRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<CompressImage> provider4, Provider<Compressor> provider5, Provider<BitmapUtil> provider6, Provider<PreferencesRepository> provider7, Provider<MrtrErrorService> provider8) {
        return new ESimViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static ESimViewModel newInstance(ESimRepository eSimRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, CompressImage compressImage, Compressor compressor, BitmapUtil bitmapUtil, PreferencesRepository preferencesRepository, MrtrErrorService mrtrErrorService) {
        return new ESimViewModel(eSimRepository, configurationRepository, rx2ThreadService, compressImage, compressor, bitmapUtil, preferencesRepository, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public ESimViewModel get() {
        return newInstance((ESimRepository) this.f105888a.get(), (ConfigurationRepository) this.f105889b.get(), (Rx2ThreadService) this.f105890c.get(), (CompressImage) this.f105891d.get(), (Compressor) this.f105892e.get(), (BitmapUtil) this.f105893f.get(), (PreferencesRepository) this.f105894g.get(), (MrtrErrorService) this.f105895h.get());
    }
}