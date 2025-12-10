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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.viewmodel.OneDeviceSaleProfileInfoViewModel_Factory */
/* loaded from: classes10.dex */
public final class OneDeviceSaleProfileInfoViewModel_Factory implements Factory<OneDeviceSaleProfileInfoViewModel> {

    /* renamed from: a */
    public final Provider f90648a;

    /* renamed from: b */
    public final Provider f90649b;

    /* renamed from: c */
    public final Provider f90650c;

    public OneDeviceSaleProfileInfoViewModel_Factory(Provider<OneDeviceSaleRepository> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3) {
        this.f90648a = provider;
        this.f90649b = provider2;
        this.f90650c = provider3;
    }

    public static OneDeviceSaleProfileInfoViewModel_Factory create(Provider<OneDeviceSaleRepository> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3) {
        return new OneDeviceSaleProfileInfoViewModel_Factory(provider, provider2, provider3);
    }

    public static OneDeviceSaleProfileInfoViewModel newInstance(OneDeviceSaleRepository oneDeviceSaleRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService) {
        return new OneDeviceSaleProfileInfoViewModel(oneDeviceSaleRepository, rx2ThreadService, oneErrorService);
    }

    @Override // javax.inject.Provider
    public OneDeviceSaleProfileInfoViewModel get() {
        return newInstance((OneDeviceSaleRepository) this.f90648a.get(), (Rx2ThreadService) this.f90649b.get(), (OneErrorService) this.f90650c.get());
    }
}