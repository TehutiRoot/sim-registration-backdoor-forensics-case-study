package th.p047co.dtac.android.dtacone.viewmodel.esim;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.compressor.CompressImage;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.esim.ESimRepository;
import th.p047co.dtac.android.dtacone.util.FileUtil;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.esim.ESimPostpaidViewModel_Factory */
/* loaded from: classes9.dex */
public final class ESimPostpaidViewModel_Factory implements Factory<ESimPostpaidViewModel> {

    /* renamed from: a */
    public final Provider f105787a;

    /* renamed from: b */
    public final Provider f105788b;

    /* renamed from: c */
    public final Provider f105789c;

    /* renamed from: d */
    public final Provider f105790d;

    /* renamed from: e */
    public final Provider f105791e;

    /* renamed from: f */
    public final Provider f105792f;

    public ESimPostpaidViewModel_Factory(Provider<ESimRepository> provider, Provider<CompressImage> provider2, Provider<FileUtil> provider3, Provider<ConfigurationRepository> provider4, Provider<Rx2ThreadService> provider5, Provider<MrtrErrorService> provider6) {
        this.f105787a = provider;
        this.f105788b = provider2;
        this.f105789c = provider3;
        this.f105790d = provider4;
        this.f105791e = provider5;
        this.f105792f = provider6;
    }

    public static ESimPostpaidViewModel_Factory create(Provider<ESimRepository> provider, Provider<CompressImage> provider2, Provider<FileUtil> provider3, Provider<ConfigurationRepository> provider4, Provider<Rx2ThreadService> provider5, Provider<MrtrErrorService> provider6) {
        return new ESimPostpaidViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static ESimPostpaidViewModel newInstance(ESimRepository eSimRepository, CompressImage compressImage, FileUtil fileUtil, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, MrtrErrorService mrtrErrorService) {
        return new ESimPostpaidViewModel(eSimRepository, compressImage, fileUtil, configurationRepository, rx2ThreadService, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public ESimPostpaidViewModel get() {
        return newInstance((ESimRepository) this.f105787a.get(), (CompressImage) this.f105788b.get(), (FileUtil) this.f105789c.get(), (ConfigurationRepository) this.f105790d.get(), (Rx2ThreadService) this.f105791e.get(), (MrtrErrorService) this.f105792f.get());
    }
}