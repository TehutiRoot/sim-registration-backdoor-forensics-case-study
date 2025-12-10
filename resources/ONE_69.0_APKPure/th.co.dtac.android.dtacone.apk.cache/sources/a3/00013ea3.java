package th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.repository.OneRetailerProfileUpdateRepositoryImpl_Factory */
/* loaded from: classes10.dex */
public final class OneRetailerProfileUpdateRepositoryImpl_Factory implements Factory<OneRetailerProfileUpdateRepositoryImpl> {

    /* renamed from: a */
    public final Provider f96993a;

    public OneRetailerProfileUpdateRepositoryImpl_Factory(Provider<RTRApiRx2> provider) {
        this.f96993a = provider;
    }

    public static OneRetailerProfileUpdateRepositoryImpl_Factory create(Provider<RTRApiRx2> provider) {
        return new OneRetailerProfileUpdateRepositoryImpl_Factory(provider);
    }

    public static OneRetailerProfileUpdateRepositoryImpl newInstance(RTRApiRx2 rTRApiRx2) {
        return new OneRetailerProfileUpdateRepositoryImpl(rTRApiRx2);
    }

    @Override // javax.inject.Provider
    public OneRetailerProfileUpdateRepositoryImpl get() {
        return newInstance((RTRApiRx2) this.f96993a.get());
    }
}