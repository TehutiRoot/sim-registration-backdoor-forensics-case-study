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
/* renamed from: th.co.dtac.android.dtacone.app_one.repository.OneForgotPasswordRepositoryImpl_Factory */
/* loaded from: classes7.dex */
public final class OneForgotPasswordRepositoryImpl_Factory implements Factory<OneForgotPasswordRepositoryImpl> {

    /* renamed from: a */
    public final Provider f82450a;

    public OneForgotPasswordRepositoryImpl_Factory(Provider<RTRApiRx2> provider) {
        this.f82450a = provider;
    }

    public static OneForgotPasswordRepositoryImpl_Factory create(Provider<RTRApiRx2> provider) {
        return new OneForgotPasswordRepositoryImpl_Factory(provider);
    }

    public static OneForgotPasswordRepositoryImpl newInstance(RTRApiRx2 rTRApiRx2) {
        return new OneForgotPasswordRepositoryImpl(rTRApiRx2);
    }

    @Override // javax.inject.Provider
    public OneForgotPasswordRepositoryImpl get() {
        return newInstance((RTRApiRx2) this.f82450a.get());
    }
}