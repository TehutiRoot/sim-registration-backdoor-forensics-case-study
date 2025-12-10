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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.esim.ESimPostpaidViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class ESimPostpaidViewModelFactory_Factory implements Factory<ESimPostpaidViewModelFactory> {

    /* renamed from: a */
    public final Provider f105781a;

    /* renamed from: b */
    public final Provider f105782b;

    /* renamed from: c */
    public final Provider f105783c;

    /* renamed from: d */
    public final Provider f105784d;

    /* renamed from: e */
    public final Provider f105785e;

    /* renamed from: f */
    public final Provider f105786f;

    public ESimPostpaidViewModelFactory_Factory(Provider<ESimRepository> provider, Provider<CompressImage> provider2, Provider<FileUtil> provider3, Provider<ConfigurationRepository> provider4, Provider<Rx2ThreadService> provider5, Provider<MrtrErrorService> provider6) {
        this.f105781a = provider;
        this.f105782b = provider2;
        this.f105783c = provider3;
        this.f105784d = provider4;
        this.f105785e = provider5;
        this.f105786f = provider6;
    }

    public static ESimPostpaidViewModelFactory_Factory create(Provider<ESimRepository> provider, Provider<CompressImage> provider2, Provider<FileUtil> provider3, Provider<ConfigurationRepository> provider4, Provider<Rx2ThreadService> provider5, Provider<MrtrErrorService> provider6) {
        return new ESimPostpaidViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static ESimPostpaidViewModelFactory newInstance(ESimRepository eSimRepository, CompressImage compressImage, FileUtil fileUtil, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, MrtrErrorService mrtrErrorService) {
        return new ESimPostpaidViewModelFactory(eSimRepository, compressImage, fileUtil, configurationRepository, rx2ThreadService, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public ESimPostpaidViewModelFactory get() {
        return newInstance((ESimRepository) this.f105781a.get(), (CompressImage) this.f105782b.get(), (FileUtil) this.f105783c.get(), (ConfigurationRepository) this.f105784d.get(), (Rx2ThreadService) this.f105785e.get(), (MrtrErrorService) this.f105786f.get());
    }
}