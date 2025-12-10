package th.p047co.dtac.android.dtacone.view.appOne.mnp.viewModel;

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
import th.p047co.dtac.android.dtacone.view.appOne.mnp.repository.OneMnpRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.viewModel.OneMnpViewModelFactory_Factory */
/* loaded from: classes10.dex */
public final class OneMnpViewModelFactory_Factory implements Factory<OneMnpViewModelFactory> {

    /* renamed from: a */
    public final Provider f92227a;

    /* renamed from: b */
    public final Provider f92228b;

    /* renamed from: c */
    public final Provider f92229c;

    /* renamed from: d */
    public final Provider f92230d;

    /* renamed from: e */
    public final Provider f92231e;

    /* renamed from: f */
    public final Provider f92232f;

    /* renamed from: g */
    public final Provider f92233g;

    /* renamed from: h */
    public final Provider f92234h;

    public OneMnpViewModelFactory_Factory(Provider<CompressImage> provider, Provider<OneMnpRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4, Provider<ConfigurationRepository> provider5, Provider<RtrRx2Repository> provider6, Provider<FileUtil> provider7, Provider<PreferencesViewModel> provider8) {
        this.f92227a = provider;
        this.f92228b = provider2;
        this.f92229c = provider3;
        this.f92230d = provider4;
        this.f92231e = provider5;
        this.f92232f = provider6;
        this.f92233g = provider7;
        this.f92234h = provider8;
    }

    public static OneMnpViewModelFactory_Factory create(Provider<CompressImage> provider, Provider<OneMnpRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4, Provider<ConfigurationRepository> provider5, Provider<RtrRx2Repository> provider6, Provider<FileUtil> provider7, Provider<PreferencesViewModel> provider8) {
        return new OneMnpViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static OneMnpViewModelFactory newInstance(CompressImage compressImage, OneMnpRepository oneMnpRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService, ConfigurationRepository configurationRepository, RtrRx2Repository rtrRx2Repository, FileUtil fileUtil, PreferencesViewModel preferencesViewModel) {
        return new OneMnpViewModelFactory(compressImage, oneMnpRepository, rx2ThreadService, oneErrorService, configurationRepository, rtrRx2Repository, fileUtil, preferencesViewModel);
    }

    @Override // javax.inject.Provider
    public OneMnpViewModelFactory get() {
        return newInstance((CompressImage) this.f92227a.get(), (OneMnpRepository) this.f92228b.get(), (Rx2ThreadService) this.f92229c.get(), (OneErrorService) this.f92230d.get(), (ConfigurationRepository) this.f92231e.get(), (RtrRx2Repository) this.f92232f.get(), (FileUtil) this.f92233g.get(), (PreferencesViewModel) this.f92234h.get());
    }
}