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
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.repository.OneDeviceSaleRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.viewmodel.OneDeviceSaleViewModelFactory_Factory */
/* loaded from: classes10.dex */
public final class OneDeviceSaleViewModelFactory_Factory implements Factory<OneDeviceSaleViewModelFactory> {

    /* renamed from: a */
    public final Provider f90737a;

    /* renamed from: b */
    public final Provider f90738b;

    /* renamed from: c */
    public final Provider f90739c;

    /* renamed from: d */
    public final Provider f90740d;

    /* renamed from: e */
    public final Provider f90741e;

    /* renamed from: f */
    public final Provider f90742f;

    public OneDeviceSaleViewModelFactory_Factory(Provider<OneDeviceSaleRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<BitmapUtil> provider4, Provider<OneErrorService> provider5, Provider<PreferencesViewModel> provider6) {
        this.f90737a = provider;
        this.f90738b = provider2;
        this.f90739c = provider3;
        this.f90740d = provider4;
        this.f90741e = provider5;
        this.f90742f = provider6;
    }

    public static OneDeviceSaleViewModelFactory_Factory create(Provider<OneDeviceSaleRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<BitmapUtil> provider4, Provider<OneErrorService> provider5, Provider<PreferencesViewModel> provider6) {
        return new OneDeviceSaleViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static OneDeviceSaleViewModelFactory newInstance(OneDeviceSaleRepository oneDeviceSaleRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, BitmapUtil bitmapUtil, OneErrorService oneErrorService, PreferencesViewModel preferencesViewModel) {
        return new OneDeviceSaleViewModelFactory(oneDeviceSaleRepository, configurationRepository, rx2ThreadService, bitmapUtil, oneErrorService, preferencesViewModel);
    }

    @Override // javax.inject.Provider
    public OneDeviceSaleViewModelFactory get() {
        return newInstance((OneDeviceSaleRepository) this.f90737a.get(), (ConfigurationRepository) this.f90738b.get(), (Rx2ThreadService) this.f90739c.get(), (BitmapUtil) this.f90740d.get(), (OneErrorService) this.f90741e.get(), (PreferencesViewModel) this.f90742f.get());
    }
}