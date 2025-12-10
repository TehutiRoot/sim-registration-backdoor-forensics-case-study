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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration.MrtrPostpaidRegistrationViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class MrtrPostpaidRegistrationViewModelFactory_Factory implements Factory<MrtrPostpaidRegistrationViewModelFactory> {

    /* renamed from: a */
    public final Provider f106507a;

    /* renamed from: b */
    public final Provider f106508b;

    /* renamed from: c */
    public final Provider f106509c;

    /* renamed from: d */
    public final Provider f106510d;

    /* renamed from: e */
    public final Provider f106511e;

    /* renamed from: f */
    public final Provider f106512f;

    public MrtrPostpaidRegistrationViewModelFactory_Factory(Provider<MrtrPostpaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<CompressImage> provider3, Provider<Rx2ThreadService> provider4, Provider<FileUtil> provider5, Provider<MrtrErrorService> provider6) {
        this.f106507a = provider;
        this.f106508b = provider2;
        this.f106509c = provider3;
        this.f106510d = provider4;
        this.f106511e = provider5;
        this.f106512f = provider6;
    }

    public static MrtrPostpaidRegistrationViewModelFactory_Factory create(Provider<MrtrPostpaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<CompressImage> provider3, Provider<Rx2ThreadService> provider4, Provider<FileUtil> provider5, Provider<MrtrErrorService> provider6) {
        return new MrtrPostpaidRegistrationViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static MrtrPostpaidRegistrationViewModelFactory newInstance(MrtrPostpaidRepository mrtrPostpaidRepository, ConfigurationRepository configurationRepository, CompressImage compressImage, Rx2ThreadService rx2ThreadService, FileUtil fileUtil, MrtrErrorService mrtrErrorService) {
        return new MrtrPostpaidRegistrationViewModelFactory(mrtrPostpaidRepository, configurationRepository, compressImage, rx2ThreadService, fileUtil, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public MrtrPostpaidRegistrationViewModelFactory get() {
        return newInstance((MrtrPostpaidRepository) this.f106507a.get(), (ConfigurationRepository) this.f106508b.get(), (CompressImage) this.f106509c.get(), (Rx2ThreadService) this.f106510d.get(), (FileUtil) this.f106511e.get(), (MrtrErrorService) this.f106512f.get());
    }
}