package th.p047co.dtac.android.dtacone.viewmodel.device_sale;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.repository.device_sale.DeviceSaleRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.device_sale.DeviceSalePaymentViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class DeviceSalePaymentViewModelFactory_Factory implements Factory<DeviceSalePaymentViewModelFactory> {

    /* renamed from: a */
    public final Provider f105485a;

    public DeviceSalePaymentViewModelFactory_Factory(Provider<DeviceSaleRepository> provider) {
        this.f105485a = provider;
    }

    public static DeviceSalePaymentViewModelFactory_Factory create(Provider<DeviceSaleRepository> provider) {
        return new DeviceSalePaymentViewModelFactory_Factory(provider);
    }

    public static DeviceSalePaymentViewModelFactory newInstance(DeviceSaleRepository deviceSaleRepository) {
        return new DeviceSalePaymentViewModelFactory(deviceSaleRepository);
    }

    @Override // javax.inject.Provider
    public DeviceSalePaymentViewModelFactory get() {
        return newInstance((DeviceSaleRepository) this.f105485a.get());
    }
}