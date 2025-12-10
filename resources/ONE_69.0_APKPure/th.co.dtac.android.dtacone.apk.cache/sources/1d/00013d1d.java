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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.viewmodel.OnePrepaidViewModel_Factory */
/* loaded from: classes10.dex */
public final class OnePrepaidViewModel_Factory implements Factory<OnePrepaidViewModel> {

    /* renamed from: a */
    public final Provider f96033a;

    /* renamed from: b */
    public final Provider f96034b;

    /* renamed from: c */
    public final Provider f96035c;

    /* renamed from: d */
    public final Provider f96036d;

    /* renamed from: e */
    public final Provider f96037e;

    /* renamed from: f */
    public final Provider f96038f;

    public OnePrepaidViewModel_Factory(Provider<OnePrepaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4, Provider<PreferencesViewModel> provider5, Provider<CompressImage> provider6) {
        this.f96033a = provider;
        this.f96034b = provider2;
        this.f96035c = provider3;
        this.f96036d = provider4;
        this.f96037e = provider5;
        this.f96038f = provider6;
    }

    public static OnePrepaidViewModel_Factory create(Provider<OnePrepaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4, Provider<PreferencesViewModel> provider5, Provider<CompressImage> provider6) {
        return new OnePrepaidViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static OnePrepaidViewModel newInstance(OnePrepaidRepository onePrepaidRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService, PreferencesViewModel preferencesViewModel, CompressImage compressImage) {
        return new OnePrepaidViewModel(onePrepaidRepository, configurationRepository, rx2ThreadService, oneErrorService, preferencesViewModel, compressImage);
    }

    @Override // javax.inject.Provider
    public OnePrepaidViewModel get() {
        return newInstance((OnePrepaidRepository) this.f96033a.get(), (ConfigurationRepository) this.f96034b.get(), (Rx2ThreadService) this.f96035c.get(), (OneErrorService) this.f96036d.get(), (PreferencesViewModel) this.f96037e.get(), (CompressImage) this.f96038f.get());
    }
}