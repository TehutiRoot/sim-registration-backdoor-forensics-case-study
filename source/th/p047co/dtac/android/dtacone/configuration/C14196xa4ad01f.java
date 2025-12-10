package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.view.appOne.notification.repository.OneNewsNotificationRepository;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.SingletonRepositoryModule_ProvideOneNewsNotificationRepositoryFactory */
/* loaded from: classes7.dex */
public final class C14196xa4ad01f implements Factory<OneNewsNotificationRepository> {

    /* renamed from: a */
    public final SingletonRepositoryModule f83320a;

    /* renamed from: b */
    public final Provider f83321b;

    public C14196xa4ad01f(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider) {
        this.f83320a = singletonRepositoryModule;
        this.f83321b = provider;
    }

    public static C14196xa4ad01f create(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider) {
        return new C14196xa4ad01f(singletonRepositoryModule, provider);
    }

    public static OneNewsNotificationRepository provideOneNewsNotificationRepository(SingletonRepositoryModule singletonRepositoryModule, RTRApiRx2 rTRApiRx2) {
        return (OneNewsNotificationRepository) Preconditions.checkNotNullFromProvides(singletonRepositoryModule.provideOneNewsNotificationRepository(rTRApiRx2));
    }

    @Override // javax.inject.Provider
    public OneNewsNotificationRepository get() {
        return provideOneNewsNotificationRepository(this.f83320a, (RTRApiRx2) this.f83321b.get());
    }
}
