package th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.onlineRegister.repository.OneOnlineRegisterRepository_Factory */
/* loaded from: classes10.dex */
public final class OneOnlineRegisterRepository_Factory implements Factory<OneOnlineRegisterRepository> {

    /* renamed from: a */
    public final Provider f92913a;

    public OneOnlineRegisterRepository_Factory(Provider<RTRApiRx2> provider) {
        this.f92913a = provider;
    }

    public static OneOnlineRegisterRepository_Factory create(Provider<RTRApiRx2> provider) {
        return new OneOnlineRegisterRepository_Factory(provider);
    }

    public static OneOnlineRegisterRepository newInstance(RTRApiRx2 rTRApiRx2) {
        return new OneOnlineRegisterRepository(rTRApiRx2);
    }

    @Override // javax.inject.Provider
    public OneOnlineRegisterRepository get() {
        return newInstance((RTRApiRx2) this.f92913a.get());
    }
}