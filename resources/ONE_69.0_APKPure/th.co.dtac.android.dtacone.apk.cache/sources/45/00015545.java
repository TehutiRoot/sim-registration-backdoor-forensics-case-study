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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.device_sale.DeviceSaleProfileInfoViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class DeviceSaleProfileInfoViewModelFactory_Factory implements Factory<DeviceSaleProfileInfoViewModelFactory> {

    /* renamed from: a */
    public final Provider f105502a;

    /* renamed from: b */
    public final Provider f105503b;

    /* renamed from: c */
    public final Provider f105504c;

    /* renamed from: d */
    public final Provider f105505d;

    public DeviceSaleProfileInfoViewModelFactory_Factory(Provider<DeviceSaleRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4) {
        this.f105502a = provider;
        this.f105503b = provider2;
        this.f105504c = provider3;
        this.f105505d = provider4;
    }

    public static DeviceSaleProfileInfoViewModelFactory_Factory create(Provider<DeviceSaleRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4) {
        return new DeviceSaleProfileInfoViewModelFactory_Factory(provider, provider2, provider3, provider4);
    }

    public static DeviceSaleProfileInfoViewModelFactory newInstance(DeviceSaleRepository deviceSaleRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, MrtrErrorService mrtrErrorService) {
        return new DeviceSaleProfileInfoViewModelFactory(deviceSaleRepository, configurationRepository, rx2ThreadService, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public DeviceSaleProfileInfoViewModelFactory get() {
        return newInstance((DeviceSaleRepository) this.f105502a.get(), (ConfigurationRepository) this.f105503b.get(), (Rx2ThreadService) this.f105504c.get(), (MrtrErrorService) this.f105505d.get());
    }
}