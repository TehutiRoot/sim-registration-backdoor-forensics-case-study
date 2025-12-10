package th.p047co.dtac.android.dtacone.view.appOne.notification.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.notification.repository.OneNewsNotificationRepositoryImpl_Factory */
/* loaded from: classes10.dex */
public final class OneNewsNotificationRepositoryImpl_Factory implements Factory<OneNewsNotificationRepositoryImpl> {

    /* renamed from: a */
    public final Provider f92468a;

    public OneNewsNotificationRepositoryImpl_Factory(Provider<RTRApiRx2> provider) {
        this.f92468a = provider;
    }

    public static OneNewsNotificationRepositoryImpl_Factory create(Provider<RTRApiRx2> provider) {
        return new OneNewsNotificationRepositoryImpl_Factory(provider);
    }

    public static OneNewsNotificationRepositoryImpl newInstance(RTRApiRx2 rTRApiRx2) {
        return new OneNewsNotificationRepositoryImpl(rTRApiRx2);
    }

    @Override // javax.inject.Provider
    public OneNewsNotificationRepositoryImpl get() {
        return newInstance((RTRApiRx2) this.f92468a.get());
    }
}