package th.p047co.dtac.android.dtacone.view.appOne.device_sale.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.repository.OneDeviceSaleRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.viewmodel.OneDeviceSalePackagesViewModel_Factory */
/* loaded from: classes10.dex */
public final class OneDeviceSalePackagesViewModel_Factory implements Factory<OneDeviceSalePackagesViewModel> {

    /* renamed from: a */
    public final Provider f90626a;

    /* renamed from: b */
    public final Provider f90627b;

    /* renamed from: c */
    public final Provider f90628c;

    /* renamed from: d */
    public final Provider f90629d;

    /* renamed from: e */
    public final Provider f90630e;

    public OneDeviceSalePackagesViewModel_Factory(Provider<OneDeviceSaleRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4, Provider<PreferencesViewModel> provider5) {
        this.f90626a = provider;
        this.f90627b = provider2;
        this.f90628c = provider3;
        this.f90629d = provider4;
        this.f90630e = provider5;
    }

    public static OneDeviceSalePackagesViewModel_Factory create(Provider<OneDeviceSaleRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4, Provider<PreferencesViewModel> provider5) {
        return new OneDeviceSalePackagesViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static OneDeviceSalePackagesViewModel newInstance(OneDeviceSaleRepository oneDeviceSaleRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService, PreferencesViewModel preferencesViewModel) {
        return new OneDeviceSalePackagesViewModel(oneDeviceSaleRepository, configurationRepository, rx2ThreadService, oneErrorService, preferencesViewModel);
    }

    @Override // javax.inject.Provider
    public OneDeviceSalePackagesViewModel get() {
        return newInstance((OneDeviceSaleRepository) this.f90626a.get(), (ConfigurationRepository) this.f90627b.get(), (Rx2ThreadService) this.f90628c.get(), (OneErrorService) this.f90629d.get(), (PreferencesViewModel) this.f90630e.get());
    }
}