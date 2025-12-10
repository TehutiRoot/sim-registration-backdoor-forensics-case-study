package th.p047co.dtac.android.dtacone.viewmodel.postpaid_registration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.postpaid_registration.PostpaidPackageSetViewModel_Factory */
/* loaded from: classes9.dex */
public final class PostpaidPackageSetViewModel_Factory implements Factory<PostpaidPackageSetViewModel> {

    /* renamed from: a */
    public final Provider f107022a;

    public PostpaidPackageSetViewModel_Factory(Provider<RxThreadService> provider) {
        this.f107022a = provider;
    }

    public static PostpaidPackageSetViewModel_Factory create(Provider<RxThreadService> provider) {
        return new PostpaidPackageSetViewModel_Factory(provider);
    }

    public static PostpaidPackageSetViewModel newInstance(RxThreadService rxThreadService) {
        return new PostpaidPackageSetViewModel(rxThreadService);
    }

    @Override // javax.inject.Provider
    public PostpaidPackageSetViewModel get() {
        return newInstance((RxThreadService) this.f107022a.get());
    }
}