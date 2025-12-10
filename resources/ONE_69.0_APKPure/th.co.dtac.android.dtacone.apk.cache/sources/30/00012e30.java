package th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.viewModel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.util.FileUtil;
import th.p047co.dtac.android.dtacone.util.image.ImageUtil;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.repository.OneDeviceSaleTrueRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.viewModel.OneDeviceSaleTrueViewModelFactory_Factory */
/* loaded from: classes10.dex */
public final class OneDeviceSaleTrueViewModelFactory_Factory implements Factory<OneDeviceSaleTrueViewModelFactory> {

    /* renamed from: a */
    public final Provider f90066a;

    /* renamed from: b */
    public final Provider f90067b;

    /* renamed from: c */
    public final Provider f90068c;

    /* renamed from: d */
    public final Provider f90069d;

    /* renamed from: e */
    public final Provider f90070e;

    /* renamed from: f */
    public final Provider f90071f;

    /* renamed from: g */
    public final Provider f90072g;

    public OneDeviceSaleTrueViewModelFactory_Factory(Provider<OneDeviceSaleTrueRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4, Provider<FileUtil> provider5, Provider<ImageUtil> provider6, Provider<PreferencesViewModel> provider7) {
        this.f90066a = provider;
        this.f90067b = provider2;
        this.f90068c = provider3;
        this.f90069d = provider4;
        this.f90070e = provider5;
        this.f90071f = provider6;
        this.f90072g = provider7;
    }

    public static OneDeviceSaleTrueViewModelFactory_Factory create(Provider<OneDeviceSaleTrueRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4, Provider<FileUtil> provider5, Provider<ImageUtil> provider6, Provider<PreferencesViewModel> provider7) {
        return new OneDeviceSaleTrueViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static OneDeviceSaleTrueViewModelFactory newInstance(OneDeviceSaleTrueRepository oneDeviceSaleTrueRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService, FileUtil fileUtil, ImageUtil imageUtil, PreferencesViewModel preferencesViewModel) {
        return new OneDeviceSaleTrueViewModelFactory(oneDeviceSaleTrueRepository, configurationRepository, rx2ThreadService, oneErrorService, fileUtil, imageUtil, preferencesViewModel);
    }

    @Override // javax.inject.Provider
    public OneDeviceSaleTrueViewModelFactory get() {
        return newInstance((OneDeviceSaleTrueRepository) this.f90066a.get(), (ConfigurationRepository) this.f90067b.get(), (Rx2ThreadService) this.f90068c.get(), (OneErrorService) this.f90069d.get(), (FileUtil) this.f90070e.get(), (ImageUtil) this.f90071f.get(), (PreferencesViewModel) this.f90072g.get());
    }
}