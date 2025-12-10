package th.p047co.dtac.android.dtacone.app_one.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.app_one.repository.OneRegistrationRepositoryImpl_Factory */
/* loaded from: classes7.dex */
public final class OneRegistrationRepositoryImpl_Factory implements Factory<OneRegistrationRepositoryImpl> {

    /* renamed from: a */
    public final Provider f82362a;

    public OneRegistrationRepositoryImpl_Factory(Provider<RTRApiRx2> provider) {
        this.f82362a = provider;
    }

    public static OneRegistrationRepositoryImpl_Factory create(Provider<RTRApiRx2> provider) {
        return new OneRegistrationRepositoryImpl_Factory(provider);
    }

    public static OneRegistrationRepositoryImpl newInstance(RTRApiRx2 rTRApiRx2) {
        return new OneRegistrationRepositoryImpl(rTRApiRx2);
    }

    @Override // javax.inject.Provider
    public OneRegistrationRepositoryImpl get() {
        return newInstance((RTRApiRx2) this.f82362a.get());
    }
}
