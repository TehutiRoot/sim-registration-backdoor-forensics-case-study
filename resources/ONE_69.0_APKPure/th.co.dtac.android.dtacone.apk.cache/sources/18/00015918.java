package th.p047co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.compressor.CompressImage;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.mrtr_postpaid.MrtrPostpaidRepository;
import th.p047co.dtac.android.dtacone.util.FileUtil;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration.MrtrPostpaidRegistrationViewModel_Factory */
/* loaded from: classes9.dex */
public final class MrtrPostpaidRegistrationViewModel_Factory implements Factory<MrtrPostpaidRegistrationViewModel> {

    /* renamed from: a */
    public final Provider f106513a;

    /* renamed from: b */
    public final Provider f106514b;

    /* renamed from: c */
    public final Provider f106515c;

    /* renamed from: d */
    public final Provider f106516d;

    /* renamed from: e */
    public final Provider f106517e;

    /* renamed from: f */
    public final Provider f106518f;

    public MrtrPostpaidRegistrationViewModel_Factory(Provider<MrtrPostpaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<CompressImage> provider3, Provider<Rx2ThreadService> provider4, Provider<FileUtil> provider5, Provider<MrtrErrorService> provider6) {
        this.f106513a = provider;
        this.f106514b = provider2;
        this.f106515c = provider3;
        this.f106516d = provider4;
        this.f106517e = provider5;
        this.f106518f = provider6;
    }

    public static MrtrPostpaidRegistrationViewModel_Factory create(Provider<MrtrPostpaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<CompressImage> provider3, Provider<Rx2ThreadService> provider4, Provider<FileUtil> provider5, Provider<MrtrErrorService> provider6) {
        return new MrtrPostpaidRegistrationViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static MrtrPostpaidRegistrationViewModel newInstance(MrtrPostpaidRepository mrtrPostpaidRepository, ConfigurationRepository configurationRepository, CompressImage compressImage, Rx2ThreadService rx2ThreadService, FileUtil fileUtil, MrtrErrorService mrtrErrorService) {
        return new MrtrPostpaidRegistrationViewModel(mrtrPostpaidRepository, configurationRepository, compressImage, rx2ThreadService, fileUtil, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public MrtrPostpaidRegistrationViewModel get() {
        return newInstance((MrtrPostpaidRepository) this.f106513a.get(), (ConfigurationRepository) this.f106514b.get(), (CompressImage) this.f106515c.get(), (Rx2ThreadService) this.f106516d.get(), (FileUtil) this.f106517e.get(), (MrtrErrorService) this.f106518f.get());
    }
}