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
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.device_sale.DeviceSaleViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class DeviceSaleViewModelFactory_Factory implements Factory<DeviceSaleViewModelFactory> {

    /* renamed from: a */
    public final Provider f105620a;

    /* renamed from: b */
    public final Provider f105621b;

    /* renamed from: c */
    public final Provider f105622c;

    /* renamed from: d */
    public final Provider f105623d;

    /* renamed from: e */
    public final Provider f105624e;

    public DeviceSaleViewModelFactory_Factory(Provider<DeviceSaleRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<BitmapUtil> provider4, Provider<MrtrErrorService> provider5) {
        this.f105620a = provider;
        this.f105621b = provider2;
        this.f105622c = provider3;
        this.f105623d = provider4;
        this.f105624e = provider5;
    }

    public static DeviceSaleViewModelFactory_Factory create(Provider<DeviceSaleRepository> provider, Provider<ConfigurationRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<BitmapUtil> provider4, Provider<MrtrErrorService> provider5) {
        return new DeviceSaleViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static DeviceSaleViewModelFactory newInstance(DeviceSaleRepository deviceSaleRepository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, BitmapUtil bitmapUtil, MrtrErrorService mrtrErrorService) {
        return new DeviceSaleViewModelFactory(deviceSaleRepository, configurationRepository, rx2ThreadService, bitmapUtil, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public DeviceSaleViewModelFactory get() {
        return newInstance((DeviceSaleRepository) this.f105620a.get(), (ConfigurationRepository) this.f105621b.get(), (Rx2ThreadService) this.f105622c.get(), (BitmapUtil) this.f105623d.get(), (MrtrErrorService) this.f105624e.get());
    }
}