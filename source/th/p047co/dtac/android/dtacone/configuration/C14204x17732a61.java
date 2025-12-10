package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.repository.OneRetailerProfileUpdateRepository;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.SingletonRepositoryModule_ProvideOneRetailerProfileUpdateRepositoryFactory */
/* loaded from: classes7.dex */
public final class C14204x17732a61 implements Factory<OneRetailerProfileUpdateRepository> {

    /* renamed from: a */
    public final SingletonRepositoryModule f83376a;

    /* renamed from: b */
    public final Provider f83377b;

    public C14204x17732a61(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider) {
        this.f83376a = singletonRepositoryModule;
        this.f83377b = provider;
    }

    public static C14204x17732a61 create(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider) {
        return new C14204x17732a61(singletonRepositoryModule, provider);
    }

    public static OneRetailerProfileUpdateRepository provideOneRetailerProfileUpdateRepository(SingletonRepositoryModule singletonRepositoryModule, RTRApiRx2 rTRApiRx2) {
        return (OneRetailerProfileUpdateRepository) Preconditions.checkNotNullFromProvides(singletonRepositoryModule.provideOneRetailerProfileUpdateRepository(rTRApiRx2));
    }

    @Override // javax.inject.Provider
    public OneRetailerProfileUpdateRepository get() {
        return provideOneRetailerProfileUpdateRepository(this.f83376a, (RTRApiRx2) this.f83377b.get());
    }
}
