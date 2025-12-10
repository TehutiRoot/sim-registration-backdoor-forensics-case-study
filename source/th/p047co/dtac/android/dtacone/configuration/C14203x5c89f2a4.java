package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.app_one.repository.OneRegistrationRepository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.SingletonRepositoryModule_ProvideOneRegistrationRepositoryFactory */
/* loaded from: classes7.dex */
public final class C14203x5c89f2a4 implements Factory<OneRegistrationRepository> {

    /* renamed from: a */
    public final SingletonRepositoryModule f83374a;

    /* renamed from: b */
    public final Provider f83375b;

    public C14203x5c89f2a4(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider) {
        this.f83374a = singletonRepositoryModule;
        this.f83375b = provider;
    }

    public static C14203x5c89f2a4 create(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider) {
        return new C14203x5c89f2a4(singletonRepositoryModule, provider);
    }

    public static OneRegistrationRepository provideOneRegistrationRepository(SingletonRepositoryModule singletonRepositoryModule, RTRApiRx2 rTRApiRx2) {
        return (OneRegistrationRepository) Preconditions.checkNotNullFromProvides(singletonRepositoryModule.provideOneRegistrationRepository(rTRApiRx2));
    }

    @Override // javax.inject.Provider
    public OneRegistrationRepository get() {
        return provideOneRegistrationRepository(this.f83374a, (RTRApiRx2) this.f83375b.get());
    }
}
