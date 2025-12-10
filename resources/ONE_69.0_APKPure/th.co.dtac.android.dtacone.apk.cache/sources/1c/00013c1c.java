package th.p047co.dtac.android.dtacone.view.appOne.pre2post.viewModel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.manager.compressor.CompressImage;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.util.FileUtil;
import th.p047co.dtac.android.dtacone.util.image.ImageUtil;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.repository.OnePre2PostRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.viewModel.OnePre2PostViewModelFactory_Factory */
/* loaded from: classes10.dex */
public final class OnePre2PostViewModelFactory_Factory implements Factory<OnePre2PostViewModelFactory> {

    /* renamed from: a */
    public final Provider f95604a;

    /* renamed from: b */
    public final Provider f95605b;

    /* renamed from: c */
    public final Provider f95606c;

    /* renamed from: d */
    public final Provider f95607d;

    /* renamed from: e */
    public final Provider f95608e;

    /* renamed from: f */
    public final Provider f95609f;

    /* renamed from: g */
    public final Provider f95610g;

    /* renamed from: h */
    public final Provider f95611h;

    /* renamed from: i */
    public final Provider f95612i;

    public OnePre2PostViewModelFactory_Factory(Provider<ConfigurationRepository> provider, Provider<OnePre2PostRepository> provider2, Provider<RtrRx2Repository> provider3, Provider<Rx2ThreadService> provider4, Provider<OneErrorService> provider5, Provider<FileUtil> provider6, Provider<CompressImage> provider7, Provider<PreferencesViewModel> provider8, Provider<ImageUtil> provider9) {
        this.f95604a = provider;
        this.f95605b = provider2;
        this.f95606c = provider3;
        this.f95607d = provider4;
        this.f95608e = provider5;
        this.f95609f = provider6;
        this.f95610g = provider7;
        this.f95611h = provider8;
        this.f95612i = provider9;
    }

    public static OnePre2PostViewModelFactory_Factory create(Provider<ConfigurationRepository> provider, Provider<OnePre2PostRepository> provider2, Provider<RtrRx2Repository> provider3, Provider<Rx2ThreadService> provider4, Provider<OneErrorService> provider5, Provider<FileUtil> provider6, Provider<CompressImage> provider7, Provider<PreferencesViewModel> provider8, Provider<ImageUtil> provider9) {
        return new OnePre2PostViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static OnePre2PostViewModelFactory newInstance(ConfigurationRepository configurationRepository, OnePre2PostRepository onePre2PostRepository, RtrRx2Repository rtrRx2Repository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService, FileUtil fileUtil, CompressImage compressImage, PreferencesViewModel preferencesViewModel, ImageUtil imageUtil) {
        return new OnePre2PostViewModelFactory(configurationRepository, onePre2PostRepository, rtrRx2Repository, rx2ThreadService, oneErrorService, fileUtil, compressImage, preferencesViewModel, imageUtil);
    }

    @Override // javax.inject.Provider
    public OnePre2PostViewModelFactory get() {
        return newInstance((ConfigurationRepository) this.f95604a.get(), (OnePre2PostRepository) this.f95605b.get(), (RtrRx2Repository) this.f95606c.get(), (Rx2ThreadService) this.f95607d.get(), (OneErrorService) this.f95608e.get(), (FileUtil) this.f95609f.get(), (CompressImage) this.f95610g.get(), (PreferencesViewModel) this.f95611h.get(), (ImageUtil) this.f95612i.get());
    }
}