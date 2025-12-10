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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.viewmodel.OneDeviceSaleViewModel_Factory */
/* loaded from: classes10.dex */
public final class OneDeviceSaleViewModel_Factory implements Factory<OneDeviceSaleViewModel> {

    /* renamed from: a */
    public final Provider f90743a;

    /* renamed from: b */
    public final Provider f90744b;

    /* renamed from: c */
    public final Provider f90745c;

    /* renamed from: d */
    public final Provider f90746d;

    /* renamed from: e */
    public final Provider f90747e;

    /* renamed from: f */
    public final Provider f90748f;

    public OneDeviceSaleViewModel_Factory(Provider<OneDeviceSaleRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<BitmapUtil> provider4, Provider<OneErrorService> provider5, Provider<PreferencesViewModel> provider6) {
        this.f90743a = provider;
        this.f90744b = provider2;
        this.f90745c = provider3;
        this.f90746d = provider4;
        this.f90747e = provider5;
        this.f90748f = provider6;
    }

    public static OneDeviceSaleViewModel_Factory create(Provider<OneDeviceSaleRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<BitmapUtil> provider4, Provider<OneErrorService> provider5, Provider<PreferencesViewModel> provider6) {
        return new OneDeviceSaleViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static OneDeviceSaleViewModel newInstance(OneDeviceSaleRepository oneDeviceSaleRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, BitmapUtil bitmapUtil, OneErrorService oneErrorService, PreferencesViewModel preferencesViewModel) {
        return new OneDeviceSaleViewModel(oneDeviceSaleRepository, configurationRepository, rx2ThreadService, bitmapUtil, oneErrorService, preferencesViewModel);
    }

    @Override // javax.inject.Provider
    public OneDeviceSaleViewModel get() {
        return newInstance((OneDeviceSaleRepository) this.f90743a.get(), (ConfigurationRepository) this.f90744b.get(), (Rx2ThreadService) this.f90745c.get(), (BitmapUtil) this.f90746d.get(), (OneErrorService) this.f90747e.get(), (PreferencesViewModel) this.f90748f.get());
    }
}