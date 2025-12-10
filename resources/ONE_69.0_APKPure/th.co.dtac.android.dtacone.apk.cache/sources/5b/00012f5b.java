package th.p047co.dtac.android.dtacone.view.appOne.device_sale.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.viewmodel.OneDeviceSalePackageSetViewModel_Factory */
/* loaded from: classes10.dex */
public final class OneDeviceSalePackageSetViewModel_Factory implements Factory<OneDeviceSalePackageSetViewModel> {

    /* renamed from: a */
    public final Provider f90590a;

    public OneDeviceSalePackageSetViewModel_Factory(Provider<RxThreadService> provider) {
        this.f90590a = provider;
    }

    public static OneDeviceSalePackageSetViewModel_Factory create(Provider<RxThreadService> provider) {
        return new OneDeviceSalePackageSetViewModel_Factory(provider);
    }

    public static OneDeviceSalePackageSetViewModel newInstance(RxThreadService rxThreadService) {
        return new OneDeviceSalePackageSetViewModel(rxThreadService);
    }

    @Override // javax.inject.Provider
    public OneDeviceSalePackageSetViewModel get() {
        return newInstance((RxThreadService) this.f90590a.get());
    }
}