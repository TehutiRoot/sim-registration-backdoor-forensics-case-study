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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.viewmodel.OneDeviceSaleCampaignViewModelFactory_Factory */
/* loaded from: classes10.dex */
public final class OneDeviceSaleCampaignViewModelFactory_Factory implements Factory<OneDeviceSaleCampaignViewModelFactory> {

    /* renamed from: a */
    public final Provider f90576a;

    /* renamed from: b */
    public final Provider f90577b;

    /* renamed from: c */
    public final Provider f90578c;

    /* renamed from: d */
    public final Provider f90579d;

    public OneDeviceSaleCampaignViewModelFactory_Factory(Provider<OneDeviceSaleRepository> provider, Provider<Rx2ThreadService> provider2, Provider<ConfigurationRepository> provider3, Provider<OneErrorService> provider4) {
        this.f90576a = provider;
        this.f90577b = provider2;
        this.f90578c = provider3;
        this.f90579d = provider4;
    }

    public static OneDeviceSaleCampaignViewModelFactory_Factory create(Provider<OneDeviceSaleRepository> provider, Provider<Rx2ThreadService> provider2, Provider<ConfigurationRepository> provider3, Provider<OneErrorService> provider4) {
        return new OneDeviceSaleCampaignViewModelFactory_Factory(provider, provider2, provider3, provider4);
    }

    public static OneDeviceSaleCampaignViewModelFactory newInstance(OneDeviceSaleRepository oneDeviceSaleRepository, Rx2ThreadService rx2ThreadService, ConfigurationRepository configurationRepository, OneErrorService oneErrorService) {
        return new OneDeviceSaleCampaignViewModelFactory(oneDeviceSaleRepository, rx2ThreadService, configurationRepository, oneErrorService);
    }

    @Override // javax.inject.Provider
    public OneDeviceSaleCampaignViewModelFactory get() {
        return newInstance((OneDeviceSaleRepository) this.f90576a.get(), (Rx2ThreadService) this.f90577b.get(), (ConfigurationRepository) this.f90578c.get(), (OneErrorService) this.f90579d.get());
    }
}