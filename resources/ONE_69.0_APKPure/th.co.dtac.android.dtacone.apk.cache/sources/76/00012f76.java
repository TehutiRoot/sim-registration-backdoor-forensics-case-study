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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.viewmodel.OneDeviceSalePackagesViewModelFactory_Factory */
/* loaded from: classes10.dex */
public final class OneDeviceSalePackagesViewModelFactory_Factory implements Factory<OneDeviceSalePackagesViewModelFactory> {

    /* renamed from: a */
    public final Provider f90621a;

    /* renamed from: b */
    public final Provider f90622b;

    /* renamed from: c */
    public final Provider f90623c;

    /* renamed from: d */
    public final Provider f90624d;

    /* renamed from: e */
    public final Provider f90625e;

    public OneDeviceSalePackagesViewModelFactory_Factory(Provider<OneDeviceSaleRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4, Provider<PreferencesViewModel> provider5) {
        this.f90621a = provider;
        this.f90622b = provider2;
        this.f90623c = provider3;
        this.f90624d = provider4;
        this.f90625e = provider5;
    }

    public static OneDeviceSalePackagesViewModelFactory_Factory create(Provider<OneDeviceSaleRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4, Provider<PreferencesViewModel> provider5) {
        return new OneDeviceSalePackagesViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static OneDeviceSalePackagesViewModelFactory newInstance(OneDeviceSaleRepository oneDeviceSaleRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService, PreferencesViewModel preferencesViewModel) {
        return new OneDeviceSalePackagesViewModelFactory(oneDeviceSaleRepository, configurationRepository, rx2ThreadService, oneErrorService, preferencesViewModel);
    }

    @Override // javax.inject.Provider
    public OneDeviceSalePackagesViewModelFactory get() {
        return newInstance((OneDeviceSaleRepository) this.f90621a.get(), (ConfigurationRepository) this.f90622b.get(), (Rx2ThreadService) this.f90623c.get(), (OneErrorService) this.f90624d.get(), (PreferencesViewModel) this.f90625e.get());
    }
}