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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.device_sale.DeviceSalePaymentViewModel_Factory */
/* loaded from: classes9.dex */
public final class DeviceSalePaymentViewModel_Factory implements Factory<DeviceSalePaymentViewModel> {

    /* renamed from: a */
    public final Provider f105486a;

    public DeviceSalePaymentViewModel_Factory(Provider<DeviceSaleRepository> provider) {
        this.f105486a = provider;
    }

    public static DeviceSalePaymentViewModel_Factory create(Provider<DeviceSaleRepository> provider) {
        return new DeviceSalePaymentViewModel_Factory(provider);
    }

    public static DeviceSalePaymentViewModel newInstance(DeviceSaleRepository deviceSaleRepository) {
        return new DeviceSalePaymentViewModel(deviceSaleRepository);
    }

    @Override // javax.inject.Provider
    public DeviceSalePaymentViewModel get() {
        return newInstance((DeviceSaleRepository) this.f105486a.get());
    }
}