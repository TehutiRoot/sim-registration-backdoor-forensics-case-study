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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.viewmodel.OneDeviceSalePackageSetFactory_Factory */
/* loaded from: classes10.dex */
public final class OneDeviceSalePackageSetFactory_Factory implements Factory<OneDeviceSalePackageSetFactory> {

    /* renamed from: a */
    public final Provider f90585a;

    public OneDeviceSalePackageSetFactory_Factory(Provider<RxThreadService> provider) {
        this.f90585a = provider;
    }

    public static OneDeviceSalePackageSetFactory_Factory create(Provider<RxThreadService> provider) {
        return new OneDeviceSalePackageSetFactory_Factory(provider);
    }

    public static OneDeviceSalePackageSetFactory newInstance(RxThreadService rxThreadService) {
        return new OneDeviceSalePackageSetFactory(rxThreadService);
    }

    @Override // javax.inject.Provider
    public OneDeviceSalePackageSetFactory get() {
        return newInstance((RxThreadService) this.f90585a.get());
    }
}