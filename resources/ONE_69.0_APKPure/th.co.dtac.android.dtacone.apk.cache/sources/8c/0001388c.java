package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidPackageSetViewModel_Factory */
/* loaded from: classes10.dex */
public final class OnePostpaidPackageSetViewModel_Factory implements Factory<OnePostpaidPackageSetViewModel> {

    /* renamed from: a */
    public final Provider f94516a;

    public OnePostpaidPackageSetViewModel_Factory(Provider<RxThreadService> provider) {
        this.f94516a = provider;
    }

    public static OnePostpaidPackageSetViewModel_Factory create(Provider<RxThreadService> provider) {
        return new OnePostpaidPackageSetViewModel_Factory(provider);
    }

    public static OnePostpaidPackageSetViewModel newInstance(RxThreadService rxThreadService) {
        return new OnePostpaidPackageSetViewModel(rxThreadService);
    }

    @Override // javax.inject.Provider
    public OnePostpaidPackageSetViewModel get() {
        return newInstance((RxThreadService) this.f94516a.get());
    }
}