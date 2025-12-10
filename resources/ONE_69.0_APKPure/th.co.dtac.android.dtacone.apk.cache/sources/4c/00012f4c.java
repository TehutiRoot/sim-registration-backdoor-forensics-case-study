package th.p047co.dtac.android.dtacone.view.appOne.device_sale.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.repository.OneDeviceSaleRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.viewmodel.OneDeviceSaleCampaignViewModel_Factory */
/* loaded from: classes10.dex */
public final class OneDeviceSaleCampaignViewModel_Factory implements Factory<OneDeviceSaleCampaignViewModel> {

    /* renamed from: a */
    public final Provider f90580a;

    /* renamed from: b */
    public final Provider f90581b;

    /* renamed from: c */
    public final Provider f90582c;

    /* renamed from: d */
    public final Provider f90583d;

    public OneDeviceSaleCampaignViewModel_Factory(Provider<OneDeviceSaleRepository> provider, Provider<Rx2ThreadService> provider2, Provider<ConfigurationRepository> provider3, Provider<OneErrorService> provider4) {
        this.f90580a = provider;
        this.f90581b = provider2;
        this.f90582c = provider3;
        this.f90583d = provider4;
    }

    public static OneDeviceSaleCampaignViewModel_Factory create(Provider<OneDeviceSaleRepository> provider, Provider<Rx2ThreadService> provider2, Provider<ConfigurationRepository> provider3, Provider<OneErrorService> provider4) {
        return new OneDeviceSaleCampaignViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static OneDeviceSaleCampaignViewModel newInstance(OneDeviceSaleRepository oneDeviceSaleRepository, Rx2ThreadService rx2ThreadService, ConfigurationRepository configurationRepository, OneErrorService oneErrorService) {
        return new OneDeviceSaleCampaignViewModel(oneDeviceSaleRepository, rx2ThreadService, configurationRepository, oneErrorService);
    }

    @Override // javax.inject.Provider
    public OneDeviceSaleCampaignViewModel get() {
        return newInstance((OneDeviceSaleRepository) this.f90580a.get(), (Rx2ThreadService) this.f90581b.get(), (ConfigurationRepository) this.f90582c.get(), (OneErrorService) this.f90583d.get());
    }
}