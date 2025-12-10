package th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.ownerManagement.repository.OneOwnerManagementRepositoryImpl_Factory */
/* loaded from: classes10.dex */
public final class OneOwnerManagementRepositoryImpl_Factory implements Factory<OneOwnerManagementRepositoryImpl> {

    /* renamed from: a */
    public final Provider f93152a;

    public OneOwnerManagementRepositoryImpl_Factory(Provider<RTRApiRx2> provider) {
        this.f93152a = provider;
    }

    public static OneOwnerManagementRepositoryImpl_Factory create(Provider<RTRApiRx2> provider) {
        return new OneOwnerManagementRepositoryImpl_Factory(provider);
    }

    public static OneOwnerManagementRepositoryImpl newInstance(RTRApiRx2 rTRApiRx2) {
        return new OneOwnerManagementRepositoryImpl(rTRApiRx2);
    }

    @Override // javax.inject.Provider
    public OneOwnerManagementRepositoryImpl get() {
        return newInstance((RTRApiRx2) this.f93152a.get());
    }
}