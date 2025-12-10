package th.p047co.dtac.android.dtacone.view.appOne.buyDol.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.repository.OneBuyDolRepositoryImpl_Factory */
/* loaded from: classes10.dex */
public final class OneBuyDolRepositoryImpl_Factory implements Factory<OneBuyDolRepositoryImpl> {

    /* renamed from: a */
    public final Provider f88623a;

    public OneBuyDolRepositoryImpl_Factory(Provider<RTRApiRx2> provider) {
        this.f88623a = provider;
    }

    public static OneBuyDolRepositoryImpl_Factory create(Provider<RTRApiRx2> provider) {
        return new OneBuyDolRepositoryImpl_Factory(provider);
    }

    public static OneBuyDolRepositoryImpl newInstance(RTRApiRx2 rTRApiRx2) {
        return new OneBuyDolRepositoryImpl(rTRApiRx2);
    }

    @Override // javax.inject.Provider
    public OneBuyDolRepositoryImpl get() {
        return newInstance((RTRApiRx2) this.f88623a.get());
    }
}