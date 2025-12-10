package th.p047co.dtac.android.dtacone.viewmodel.mrtr_pre2post;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.compressor.CompressImage;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.mrtr_pre2post.MrtrPre2PostRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_pre2post.MrtrPre2PostViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class MrtrPre2PostViewModelFactory_Factory implements Factory<MrtrPre2PostViewModelFactory> {

    /* renamed from: a */
    public final Provider f106660a;

    /* renamed from: b */
    public final Provider f106661b;

    /* renamed from: c */
    public final Provider f106662c;

    /* renamed from: d */
    public final Provider f106663d;

    /* renamed from: e */
    public final Provider f106664e;

    public MrtrPre2PostViewModelFactory_Factory(Provider<ConfigurationRepository> provider, Provider<MrtrPre2PostRepository> provider2, Provider<CompressImage> provider3, Provider<Rx2ThreadService> provider4, Provider<MrtrErrorService> provider5) {
        this.f106660a = provider;
        this.f106661b = provider2;
        this.f106662c = provider3;
        this.f106663d = provider4;
        this.f106664e = provider5;
    }

    public static MrtrPre2PostViewModelFactory_Factory create(Provider<ConfigurationRepository> provider, Provider<MrtrPre2PostRepository> provider2, Provider<CompressImage> provider3, Provider<Rx2ThreadService> provider4, Provider<MrtrErrorService> provider5) {
        return new MrtrPre2PostViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static MrtrPre2PostViewModelFactory newInstance(ConfigurationRepository configurationRepository, MrtrPre2PostRepository mrtrPre2PostRepository, CompressImage compressImage, Rx2ThreadService rx2ThreadService, MrtrErrorService mrtrErrorService) {
        return new MrtrPre2PostViewModelFactory(configurationRepository, mrtrPre2PostRepository, compressImage, rx2ThreadService, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public MrtrPre2PostViewModelFactory get() {
        return newInstance((ConfigurationRepository) this.f106660a.get(), (MrtrPre2PostRepository) this.f106661b.get(), (CompressImage) this.f106662c.get(), (Rx2ThreadService) this.f106663d.get(), (MrtrErrorService) this.f106664e.get());
    }
}