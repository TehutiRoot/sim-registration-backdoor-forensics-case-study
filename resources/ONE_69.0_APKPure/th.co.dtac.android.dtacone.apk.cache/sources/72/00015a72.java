package th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_reregist;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.compressor.CompressImage;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.mrtr_prepaid_reregist.MrtrPrepaidReregistRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_reregist.MrtrPrepaidReregistViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class MrtrPrepaidReregistViewModelFactory_Factory implements Factory<MrtrPrepaidReregistViewModelFactory> {

    /* renamed from: a */
    public final Provider f106896a;

    /* renamed from: b */
    public final Provider f106897b;

    /* renamed from: c */
    public final Provider f106898c;

    /* renamed from: d */
    public final Provider f106899d;

    /* renamed from: e */
    public final Provider f106900e;

    public MrtrPrepaidReregistViewModelFactory_Factory(Provider<MrtrPrepaidReregistRepository> provider, Provider<CompressImage> provider2, Provider<ConfigurationRepository> provider3, Provider<Rx2ThreadService> provider4, Provider<MrtrErrorService> provider5) {
        this.f106896a = provider;
        this.f106897b = provider2;
        this.f106898c = provider3;
        this.f106899d = provider4;
        this.f106900e = provider5;
    }

    public static MrtrPrepaidReregistViewModelFactory_Factory create(Provider<MrtrPrepaidReregistRepository> provider, Provider<CompressImage> provider2, Provider<ConfigurationRepository> provider3, Provider<Rx2ThreadService> provider4, Provider<MrtrErrorService> provider5) {
        return new MrtrPrepaidReregistViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static MrtrPrepaidReregistViewModelFactory newInstance(MrtrPrepaidReregistRepository mrtrPrepaidReregistRepository, CompressImage compressImage, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, MrtrErrorService mrtrErrorService) {
        return new MrtrPrepaidReregistViewModelFactory(mrtrPrepaidReregistRepository, compressImage, configurationRepository, rx2ThreadService, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public MrtrPrepaidReregistViewModelFactory get() {
        return newInstance((MrtrPrepaidReregistRepository) this.f106896a.get(), (CompressImage) this.f106897b.get(), (ConfigurationRepository) this.f106898c.get(), (Rx2ThreadService) this.f106899d.get(), (MrtrErrorService) this.f106900e.get());
    }
}