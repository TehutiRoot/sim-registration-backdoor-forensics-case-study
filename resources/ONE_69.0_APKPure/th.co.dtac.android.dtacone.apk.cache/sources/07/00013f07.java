package th.p047co.dtac.android.dtacone.view.appOne.sellerID.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.sellerID.repository.OneShopListRepositoryImpl_Factory */
/* loaded from: classes10.dex */
public final class OneShopListRepositoryImpl_Factory implements Factory<OneShopListRepositoryImpl> {

    /* renamed from: a */
    public final Provider f97152a;

    public OneShopListRepositoryImpl_Factory(Provider<RTRApiRx2> provider) {
        this.f97152a = provider;
    }

    public static OneShopListRepositoryImpl_Factory create(Provider<RTRApiRx2> provider) {
        return new OneShopListRepositoryImpl_Factory(provider);
    }

    public static OneShopListRepositoryImpl newInstance(RTRApiRx2 rTRApiRx2) {
        return new OneShopListRepositoryImpl(rTRApiRx2);
    }

    @Override // javax.inject.Provider
    public OneShopListRepositoryImpl get() {
        return newInstance((RTRApiRx2) this.f97152a.get());
    }
}