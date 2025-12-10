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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.device_sale.DeviceSaleViewModel_Factory */
/* loaded from: classes9.dex */
public final class DeviceSaleViewModel_Factory implements Factory<DeviceSaleViewModel> {

    /* renamed from: a */
    public final Provider f105625a;

    /* renamed from: b */
    public final Provider f105626b;

    /* renamed from: c */
    public final Provider f105627c;

    /* renamed from: d */
    public final Provider f105628d;

    /* renamed from: e */
    public final Provider f105629e;

    public DeviceSaleViewModel_Factory(Provider<DeviceSaleRepository> provider, Provider<Rx2ThreadService> provider2, Provider<ConfigurationRepository> provider3, Provider<BitmapUtil> provider4, Provider<MrtrErrorService> provider5) {
        this.f105625a = provider;
        this.f105626b = provider2;
        this.f105627c = provider3;
        this.f105628d = provider4;
        this.f105629e = provider5;
    }

    public static DeviceSaleViewModel_Factory create(Provider<DeviceSaleRepository> provider, Provider<Rx2ThreadService> provider2, Provider<ConfigurationRepository> provider3, Provider<BitmapUtil> provider4, Provider<MrtrErrorService> provider5) {
        return new DeviceSaleViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static DeviceSaleViewModel newInstance(DeviceSaleRepository deviceSaleRepository, Rx2ThreadService rx2ThreadService, ConfigurationRepository configurationRepository, BitmapUtil bitmapUtil, MrtrErrorService mrtrErrorService) {
        return new DeviceSaleViewModel(deviceSaleRepository, rx2ThreadService, configurationRepository, bitmapUtil, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public DeviceSaleViewModel get() {
        return newInstance((DeviceSaleRepository) this.f105625a.get(), (Rx2ThreadService) this.f105626b.get(), (ConfigurationRepository) this.f105627c.get(), (BitmapUtil) this.f105628d.get(), (MrtrErrorService) this.f105629e.get());
    }
}