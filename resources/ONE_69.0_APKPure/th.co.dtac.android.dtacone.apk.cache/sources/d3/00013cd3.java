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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.viewmodel.OnePrepaidValidationViewModel_Factory */
/* loaded from: classes10.dex */
public final class OnePrepaidValidationViewModel_Factory implements Factory<OnePrepaidValidationViewModel> {

    /* renamed from: a */
    public final Provider f95978a;

    /* renamed from: b */
    public final Provider f95979b;

    /* renamed from: c */
    public final Provider f95980c;

    /* renamed from: d */
    public final Provider f95981d;

    /* renamed from: e */
    public final Provider f95982e;

    /* renamed from: f */
    public final Provider f95983f;

    public OnePrepaidValidationViewModel_Factory(Provider<OnePrepaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4, Provider<PreferencesViewModel> provider5, Provider<CompressImage> provider6) {
        this.f95978a = provider;
        this.f95979b = provider2;
        this.f95980c = provider3;
        this.f95981d = provider4;
        this.f95982e = provider5;
        this.f95983f = provider6;
    }

    public static OnePrepaidValidationViewModel_Factory create(Provider<OnePrepaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4, Provider<PreferencesViewModel> provider5, Provider<CompressImage> provider6) {
        return new OnePrepaidValidationViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static OnePrepaidValidationViewModel newInstance(OnePrepaidRepository onePrepaidRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService, PreferencesViewModel preferencesViewModel, CompressImage compressImage) {
        return new OnePrepaidValidationViewModel(onePrepaidRepository, configurationRepository, rx2ThreadService, oneErrorService, preferencesViewModel, compressImage);
    }

    @Override // javax.inject.Provider
    public OnePrepaidValidationViewModel get() {
        return newInstance((OnePrepaidRepository) this.f95978a.get(), (ConfigurationRepository) this.f95979b.get(), (Rx2ThreadService) this.f95980c.get(), (OneErrorService) this.f95981d.get(), (PreferencesViewModel) this.f95982e.get(), (CompressImage) this.f95983f.get());
    }
}