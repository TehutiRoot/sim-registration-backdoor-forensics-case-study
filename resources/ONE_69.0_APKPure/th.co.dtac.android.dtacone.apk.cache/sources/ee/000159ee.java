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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_multi_sim.MrtrPrepaidMultiSimViewModel_Factory */
/* loaded from: classes9.dex */
public final class MrtrPrepaidMultiSimViewModel_Factory implements Factory<MrtrPrepaidMultiSimViewModel> {

    /* renamed from: a */
    public final Provider f106713a;

    /* renamed from: b */
    public final Provider f106714b;

    /* renamed from: c */
    public final Provider f106715c;

    /* renamed from: d */
    public final Provider f106716d;

    /* renamed from: e */
    public final Provider f106717e;

    public MrtrPrepaidMultiSimViewModel_Factory(Provider<MrtrPrepaidMultiSimRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<CompressImage> provider4, Provider<MrtrErrorService> provider5) {
        this.f106713a = provider;
        this.f106714b = provider2;
        this.f106715c = provider3;
        this.f106716d = provider4;
        this.f106717e = provider5;
    }

    public static MrtrPrepaidMultiSimViewModel_Factory create(Provider<MrtrPrepaidMultiSimRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<CompressImage> provider4, Provider<MrtrErrorService> provider5) {
        return new MrtrPrepaidMultiSimViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static MrtrPrepaidMultiSimViewModel newInstance(MrtrPrepaidMultiSimRepository mrtrPrepaidMultiSimRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, CompressImage compressImage, MrtrErrorService mrtrErrorService) {
        return new MrtrPrepaidMultiSimViewModel(mrtrPrepaidMultiSimRepository, configurationRepository, rx2ThreadService, compressImage, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public MrtrPrepaidMultiSimViewModel get() {
        return newInstance((MrtrPrepaidMultiSimRepository) this.f106713a.get(), (ConfigurationRepository) this.f106714b.get(), (Rx2ThreadService) this.f106715c.get(), (CompressImage) this.f106716d.get(), (MrtrErrorService) this.f106717e.get());
    }
}