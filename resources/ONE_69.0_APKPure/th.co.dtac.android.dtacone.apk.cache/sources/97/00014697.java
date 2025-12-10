package th.p047co.dtac.android.dtacone.view.appOne.topup.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.topup.repository.OneTopUpRepositoryImpl_Factory */
/* loaded from: classes10.dex */
public final class OneTopUpRepositoryImpl_Factory implements Factory<OneTopUpRepositoryImpl> {

    /* renamed from: a */
    public final Provider f98521a;

    /* renamed from: b */
    public final Provider f98522b;

    public OneTopUpRepositoryImpl_Factory(Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2) {
        this.f98521a = provider;
        this.f98522b = provider2;
    }

    public static OneTopUpRepositoryImpl_Factory create(Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2) {
        return new OneTopUpRepositoryImpl_Factory(provider, provider2);
    }

    public static OneTopUpRepositoryImpl newInstance(RTRApiRx2 rTRApiRx2, RtrRx2Repository rtrRx2Repository) {
        return new OneTopUpRepositoryImpl(rTRApiRx2, rtrRx2Repository);
    }

    @Override // javax.inject.Provider
    public OneTopUpRepositoryImpl get() {
        return newInstance((RTRApiRx2) this.f98521a.get(), (RtrRx2Repository) this.f98522b.get());
    }
}