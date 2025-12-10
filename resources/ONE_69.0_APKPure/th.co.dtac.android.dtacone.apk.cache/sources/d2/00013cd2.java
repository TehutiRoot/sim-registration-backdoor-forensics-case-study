package th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.manager.compressor.CompressImage;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.viewmodel.OnePrepaidValidationViewModelFactory_Factory */
/* loaded from: classes10.dex */
public final class OnePrepaidValidationViewModelFactory_Factory implements Factory<OnePrepaidValidationViewModelFactory> {

    /* renamed from: a */
    public final Provider f95972a;

    /* renamed from: b */
    public final Provider f95973b;

    /* renamed from: c */
    public final Provider f95974c;

    /* renamed from: d */
    public final Provider f95975d;

    /* renamed from: e */
    public final Provider f95976e;

    /* renamed from: f */
    public final Provider f95977f;

    public OnePrepaidValidationViewModelFactory_Factory(Provider<OnePrepaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4, Provider<PreferencesViewModel> provider5, Provider<CompressImage> provider6) {
        this.f95972a = provider;
        this.f95973b = provider2;
        this.f95974c = provider3;
        this.f95975d = provider4;
        this.f95976e = provider5;
        this.f95977f = provider6;
    }

    public static OnePrepaidValidationViewModelFactory_Factory create(Provider<OnePrepaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4, Provider<PreferencesViewModel> provider5, Provider<CompressImage> provider6) {
        return new OnePrepaidValidationViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static OnePrepaidValidationViewModelFactory newInstance(OnePrepaidRepository onePrepaidRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService, PreferencesViewModel preferencesViewModel, CompressImage compressImage) {
        return new OnePrepaidValidationViewModelFactory(onePrepaidRepository, configurationRepository, rx2ThreadService, oneErrorService, preferencesViewModel, compressImage);
    }

    @Override // javax.inject.Provider
    public OnePrepaidValidationViewModelFactory get() {
        return newInstance((OnePrepaidRepository) this.f95972a.get(), (ConfigurationRepository) this.f95973b.get(), (Rx2ThreadService) this.f95974c.get(), (OneErrorService) this.f95975d.get(), (PreferencesViewModel) this.f95976e.get(), (CompressImage) this.f95977f.get());
    }
}