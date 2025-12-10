package th.p047co.dtac.android.dtacone.viewmodel.device_sale;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.device_sale.DeviceSaleRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.device_sale.DeviceSaleCampaignViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class DeviceSaleCampaignViewModelFactory_Factory implements Factory<DeviceSaleCampaignViewModelFactory> {

    /* renamed from: a */
    public final Provider f105474a;

    /* renamed from: b */
    public final Provider f105475b;

    /* renamed from: c */
    public final Provider f105476c;

    /* renamed from: d */
    public final Provider f105477d;

    public DeviceSaleCampaignViewModelFactory_Factory(Provider<DeviceSaleRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4) {
        this.f105474a = provider;
        this.f105475b = provider2;
        this.f105476c = provider3;
        this.f105477d = provider4;
    }

    public static DeviceSaleCampaignViewModelFactory_Factory create(Provider<DeviceSaleRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4) {
        return new DeviceSaleCampaignViewModelFactory_Factory(provider, provider2, provider3, provider4);
    }

    public static DeviceSaleCampaignViewModelFactory newInstance(DeviceSaleRepository deviceSaleRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, MrtrErrorService mrtrErrorService) {
        return new DeviceSaleCampaignViewModelFactory(deviceSaleRepository, configurationRepository, rx2ThreadService, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public DeviceSaleCampaignViewModelFactory get() {
        return newInstance((DeviceSaleRepository) this.f105474a.get(), (ConfigurationRepository) this.f105475b.get(), (Rx2ThreadService) this.f105476c.get(), (MrtrErrorService) this.f105477d.get());
    }
}