package th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_multi_sim;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.compressor.CompressImage;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.mrtr_prepaid_multi_sim.MrtrPrepaidMultiSimRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_multi_sim.MrtrPrepaidMultiSimViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class MrtrPrepaidMultiSimViewModelFactory_Factory implements Factory<MrtrPrepaidMultiSimViewModelFactory> {

    /* renamed from: a */
    public final Provider f106708a;

    /* renamed from: b */
    public final Provider f106709b;

    /* renamed from: c */
    public final Provider f106710c;

    /* renamed from: d */
    public final Provider f106711d;

    /* renamed from: e */
    public final Provider f106712e;

    public MrtrPrepaidMultiSimViewModelFactory_Factory(Provider<MrtrPrepaidMultiSimRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<CompressImage> provider4, Provider<MrtrErrorService> provider5) {
        this.f106708a = provider;
        this.f106709b = provider2;
        this.f106710c = provider3;
        this.f106711d = provider4;
        this.f106712e = provider5;
    }

    public static MrtrPrepaidMultiSimViewModelFactory_Factory create(Provider<MrtrPrepaidMultiSimRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<CompressImage> provider4, Provider<MrtrErrorService> provider5) {
        return new MrtrPrepaidMultiSimViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static MrtrPrepaidMultiSimViewModelFactory newInstance(MrtrPrepaidMultiSimRepository mrtrPrepaidMultiSimRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, CompressImage compressImage, MrtrErrorService mrtrErrorService) {
        return new MrtrPrepaidMultiSimViewModelFactory(mrtrPrepaidMultiSimRepository, configurationRepository, rx2ThreadService, compressImage, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public MrtrPrepaidMultiSimViewModelFactory get() {
        return newInstance((MrtrPrepaidMultiSimRepository) this.f106708a.get(), (ConfigurationRepository) this.f106709b.get(), (Rx2ThreadService) this.f106710c.get(), (CompressImage) this.f106711d.get(), (MrtrErrorService) this.f106712e.get());
    }
}