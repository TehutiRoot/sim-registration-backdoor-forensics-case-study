package th.p047co.dtac.android.dtacone.view.appOne.activateSim.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.activateSim.repository.OneActivateSimRepositoryImpl_Factory */
/* loaded from: classes10.dex */
public final class OneActivateSimRepositoryImpl_Factory implements Factory<OneActivateSimRepositoryImpl> {

    /* renamed from: a */
    public final Provider f88236a;

    public OneActivateSimRepositoryImpl_Factory(Provider<RTRApiRx2> provider) {
        this.f88236a = provider;
    }

    public static OneActivateSimRepositoryImpl_Factory create(Provider<RTRApiRx2> provider) {
        return new OneActivateSimRepositoryImpl_Factory(provider);
    }

    public static OneActivateSimRepositoryImpl newInstance(RTRApiRx2 rTRApiRx2) {
        return new OneActivateSimRepositoryImpl(rTRApiRx2);
    }

    @Override // javax.inject.Provider
    public OneActivateSimRepositoryImpl get() {
        return newInstance((RTRApiRx2) this.f88236a.get());
    }
}