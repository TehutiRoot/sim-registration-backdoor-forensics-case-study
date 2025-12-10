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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.viewModel.OneMnpViewModel_Factory */
/* loaded from: classes10.dex */
public final class OneMnpViewModel_Factory implements Factory<OneMnpViewModel> {

    /* renamed from: a */
    public final Provider f92235a;

    /* renamed from: b */
    public final Provider f92236b;

    /* renamed from: c */
    public final Provider f92237c;

    /* renamed from: d */
    public final Provider f92238d;

    /* renamed from: e */
    public final Provider f92239e;

    /* renamed from: f */
    public final Provider f92240f;

    /* renamed from: g */
    public final Provider f92241g;

    /* renamed from: h */
    public final Provider f92242h;

    public OneMnpViewModel_Factory(Provider<CompressImage> provider, Provider<OneMnpRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4, Provider<ConfigurationRepository> provider5, Provider<RtrRx2Repository> provider6, Provider<FileUtil> provider7, Provider<PreferencesViewModel> provider8) {
        this.f92235a = provider;
        this.f92236b = provider2;
        this.f92237c = provider3;
        this.f92238d = provider4;
        this.f92239e = provider5;
        this.f92240f = provider6;
        this.f92241g = provider7;
        this.f92242h = provider8;
    }

    public static OneMnpViewModel_Factory create(Provider<CompressImage> provider, Provider<OneMnpRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4, Provider<ConfigurationRepository> provider5, Provider<RtrRx2Repository> provider6, Provider<FileUtil> provider7, Provider<PreferencesViewModel> provider8) {
        return new OneMnpViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static OneMnpViewModel newInstance(CompressImage compressImage, OneMnpRepository oneMnpRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService, ConfigurationRepository configurationRepository, RtrRx2Repository rtrRx2Repository, FileUtil fileUtil, PreferencesViewModel preferencesViewModel) {
        return new OneMnpViewModel(compressImage, oneMnpRepository, rx2ThreadService, oneErrorService, configurationRepository, rtrRx2Repository, fileUtil, preferencesViewModel);
    }

    @Override // javax.inject.Provider
    public OneMnpViewModel get() {
        return newInstance((CompressImage) this.f92235a.get(), (OneMnpRepository) this.f92236b.get(), (Rx2ThreadService) this.f92237c.get(), (OneErrorService) this.f92238d.get(), (ConfigurationRepository) this.f92239e.get(), (RtrRx2Repository) this.f92240f.get(), (FileUtil) this.f92241g.get(), (PreferencesViewModel) this.f92242h.get());
    }
}