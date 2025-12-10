package th.p047co.dtac.android.dtacone.view.appOne.device_sale.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.repository.OneDeviceSaleRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.viewmodel.OneDeviceSaleProfileInfoViewModelFactory_Factory */
/* loaded from: classes10.dex */
public final class OneDeviceSaleProfileInfoViewModelFactory_Factory implements Factory<OneDeviceSaleProfileInfoViewModelFactory> {

    /* renamed from: a */
    public final Provider f90645a;

    /* renamed from: b */
    public final Provider f90646b;

    /* renamed from: c */
    public final Provider f90647c;

    public OneDeviceSaleProfileInfoViewModelFactory_Factory(Provider<OneDeviceSaleRepository> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3) {
        this.f90645a = provider;
        this.f90646b = provider2;
        this.f90647c = provider3;
    }

    public static OneDeviceSaleProfileInfoViewModelFactory_Factory create(Provider<OneDeviceSaleRepository> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3) {
        return new OneDeviceSaleProfileInfoViewModelFactory_Factory(provider, provider2, provider3);
    }

    public static OneDeviceSaleProfileInfoViewModelFactory newInstance(OneDeviceSaleRepository oneDeviceSaleRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService) {
        return new OneDeviceSaleProfileInfoViewModelFactory(oneDeviceSaleRepository, rx2ThreadService, oneErrorService);
    }

    @Override // javax.inject.Provider
    public OneDeviceSaleProfileInfoViewModelFactory get() {
        return newInstance((OneDeviceSaleRepository) this.f90645a.get(), (Rx2ThreadService) this.f90646b.get(), (OneErrorService) this.f90647c.get());
    }
}