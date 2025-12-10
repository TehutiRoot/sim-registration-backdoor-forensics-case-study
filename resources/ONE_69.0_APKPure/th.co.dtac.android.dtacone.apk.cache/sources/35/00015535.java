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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.device_sale.DeviceSaleCampaignViewModel_Factory */
/* loaded from: classes9.dex */
public final class DeviceSaleCampaignViewModel_Factory implements Factory<DeviceSaleCampaignViewModel> {

    /* renamed from: a */
    public final Provider f105478a;

    /* renamed from: b */
    public final Provider f105479b;

    /* renamed from: c */
    public final Provider f105480c;

    /* renamed from: d */
    public final Provider f105481d;

    public DeviceSaleCampaignViewModel_Factory(Provider<DeviceSaleRepository> provider, Provider<Rx2ThreadService> provider2, Provider<ConfigurationRepository> provider3, Provider<MrtrErrorService> provider4) {
        this.f105478a = provider;
        this.f105479b = provider2;
        this.f105480c = provider3;
        this.f105481d = provider4;
    }

    public static DeviceSaleCampaignViewModel_Factory create(Provider<DeviceSaleRepository> provider, Provider<Rx2ThreadService> provider2, Provider<ConfigurationRepository> provider3, Provider<MrtrErrorService> provider4) {
        return new DeviceSaleCampaignViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static DeviceSaleCampaignViewModel newInstance(DeviceSaleRepository deviceSaleRepository, Rx2ThreadService rx2ThreadService, ConfigurationRepository configurationRepository, MrtrErrorService mrtrErrorService) {
        return new DeviceSaleCampaignViewModel(deviceSaleRepository, rx2ThreadService, configurationRepository, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public DeviceSaleCampaignViewModel get() {
        return newInstance((DeviceSaleRepository) this.f105478a.get(), (Rx2ThreadService) this.f105479b.get(), (ConfigurationRepository) this.f105480c.get(), (MrtrErrorService) this.f105481d.get());
    }
}