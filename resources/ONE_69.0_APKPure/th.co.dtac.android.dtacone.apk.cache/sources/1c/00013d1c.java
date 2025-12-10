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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.viewmodel.OnePrepaidViewModelFactory_Factory */
/* loaded from: classes10.dex */
public final class OnePrepaidViewModelFactory_Factory implements Factory<OnePrepaidViewModelFactory> {

    /* renamed from: a */
    public final Provider f96027a;

    /* renamed from: b */
    public final Provider f96028b;

    /* renamed from: c */
    public final Provider f96029c;

    /* renamed from: d */
    public final Provider f96030d;

    /* renamed from: e */
    public final Provider f96031e;

    /* renamed from: f */
    public final Provider f96032f;

    public OnePrepaidViewModelFactory_Factory(Provider<OnePrepaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4, Provider<PreferencesViewModel> provider5, Provider<CompressImage> provider6) {
        this.f96027a = provider;
        this.f96028b = provider2;
        this.f96029c = provider3;
        this.f96030d = provider4;
        this.f96031e = provider5;
        this.f96032f = provider6;
    }

    public static OnePrepaidViewModelFactory_Factory create(Provider<OnePrepaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4, Provider<PreferencesViewModel> provider5, Provider<CompressImage> provider6) {
        return new OnePrepaidViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static OnePrepaidViewModelFactory newInstance(OnePrepaidRepository onePrepaidRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService, PreferencesViewModel preferencesViewModel, CompressImage compressImage) {
        return new OnePrepaidViewModelFactory(onePrepaidRepository, configurationRepository, rx2ThreadService, oneErrorService, preferencesViewModel, compressImage);
    }

    @Override // javax.inject.Provider
    public OnePrepaidViewModelFactory get() {
        return newInstance((OnePrepaidRepository) this.f96027a.get(), (ConfigurationRepository) this.f96028b.get(), (Rx2ThreadService) this.f96029c.get(), (OneErrorService) this.f96030d.get(), (PreferencesViewModel) this.f96031e.get(), (CompressImage) this.f96032f.get());
    }
}