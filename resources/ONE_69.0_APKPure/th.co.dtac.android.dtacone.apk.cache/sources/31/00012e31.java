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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.viewModel.OneDeviceSaleTrueViewModel_Factory */
/* loaded from: classes10.dex */
public final class OneDeviceSaleTrueViewModel_Factory implements Factory<OneDeviceSaleTrueViewModel> {

    /* renamed from: a */
    public final Provider f90073a;

    /* renamed from: b */
    public final Provider f90074b;

    /* renamed from: c */
    public final Provider f90075c;

    /* renamed from: d */
    public final Provider f90076d;

    /* renamed from: e */
    public final Provider f90077e;

    /* renamed from: f */
    public final Provider f90078f;

    /* renamed from: g */
    public final Provider f90079g;

    public OneDeviceSaleTrueViewModel_Factory(Provider<OneDeviceSaleTrueRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4, Provider<FileUtil> provider5, Provider<ImageUtil> provider6, Provider<PreferencesViewModel> provider7) {
        this.f90073a = provider;
        this.f90074b = provider2;
        this.f90075c = provider3;
        this.f90076d = provider4;
        this.f90077e = provider5;
        this.f90078f = provider6;
        this.f90079g = provider7;
    }

    public static OneDeviceSaleTrueViewModel_Factory create(Provider<OneDeviceSaleTrueRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4, Provider<FileUtil> provider5, Provider<ImageUtil> provider6, Provider<PreferencesViewModel> provider7) {
        return new OneDeviceSaleTrueViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static OneDeviceSaleTrueViewModel newInstance(OneDeviceSaleTrueRepository oneDeviceSaleTrueRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService, FileUtil fileUtil, ImageUtil imageUtil, PreferencesViewModel preferencesViewModel) {
        return new OneDeviceSaleTrueViewModel(oneDeviceSaleTrueRepository, configurationRepository, rx2ThreadService, oneErrorService, fileUtil, imageUtil, preferencesViewModel);
    }

    @Override // javax.inject.Provider
    public OneDeviceSaleTrueViewModel get() {
        return newInstance((OneDeviceSaleTrueRepository) this.f90073a.get(), (ConfigurationRepository) this.f90074b.get(), (Rx2ThreadService) this.f90075c.get(), (OneErrorService) this.f90076d.get(), (FileUtil) this.f90077e.get(), (ImageUtil) this.f90078f.get(), (PreferencesViewModel) this.f90079g.get());
    }
}