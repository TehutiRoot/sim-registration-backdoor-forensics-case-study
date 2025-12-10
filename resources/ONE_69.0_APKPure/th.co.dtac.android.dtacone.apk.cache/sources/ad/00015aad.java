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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.postpaid_registration.PostpaidPackageSetFactory_Factory */
/* loaded from: classes9.dex */
public final class PostpaidPackageSetFactory_Factory implements Factory<PostpaidPackageSetFactory> {

    /* renamed from: a */
    public final Provider f107017a;

    public PostpaidPackageSetFactory_Factory(Provider<RxThreadService> provider) {
        this.f107017a = provider;
    }

    public static PostpaidPackageSetFactory_Factory create(Provider<RxThreadService> provider) {
        return new PostpaidPackageSetFactory_Factory(provider);
    }

    public static PostpaidPackageSetFactory newInstance(RxThreadService rxThreadService) {
        return new PostpaidPackageSetFactory(rxThreadService);
    }

    @Override // javax.inject.Provider
    public PostpaidPackageSetFactory get() {
        return newInstance((RxThreadService) this.f107017a.get());
    }
}