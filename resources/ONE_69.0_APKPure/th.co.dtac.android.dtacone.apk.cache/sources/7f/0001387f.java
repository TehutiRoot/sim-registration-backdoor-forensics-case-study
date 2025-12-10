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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidPackageSetFactory_Factory */
/* loaded from: classes10.dex */
public final class OnePostpaidPackageSetFactory_Factory implements Factory<OnePostpaidPackageSetFactory> {

    /* renamed from: a */
    public final Provider f94511a;

    public OnePostpaidPackageSetFactory_Factory(Provider<RxThreadService> provider) {
        this.f94511a = provider;
    }

    public static OnePostpaidPackageSetFactory_Factory create(Provider<RxThreadService> provider) {
        return new OnePostpaidPackageSetFactory_Factory(provider);
    }

    public static OnePostpaidPackageSetFactory newInstance(RxThreadService rxThreadService) {
        return new OnePostpaidPackageSetFactory(rxThreadService);
    }

    @Override // javax.inject.Provider
    public OnePostpaidPackageSetFactory get() {
        return newInstance((RxThreadService) this.f94511a.get());
    }
}