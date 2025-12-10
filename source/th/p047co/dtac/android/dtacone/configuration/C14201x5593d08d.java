package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.repository.OneOwnerManagementRepository;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.SingletonRepositoryModule_ProvideOneOwnerManagementRepositoryFactory */
/* loaded from: classes7.dex */
public final class C14201x5593d08d implements Factory<OneOwnerManagementRepository> {

    /* renamed from: a */
    public final SingletonRepositoryModule f83336a;

    /* renamed from: b */
    public final Provider f83337b;

    public C14201x5593d08d(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider) {
        this.f83336a = singletonRepositoryModule;
        this.f83337b = provider;
    }

    public static C14201x5593d08d create(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider) {
        return new C14201x5593d08d(singletonRepositoryModule, provider);
    }

    public static OneOwnerManagementRepository provideOneOwnerManagementRepository(SingletonRepositoryModule singletonRepositoryModule, RTRApiRx2 rTRApiRx2) {
        return (OneOwnerManagementRepository) Preconditions.checkNotNullFromProvides(singletonRepositoryModule.provideOneOwnerManagementRepository(rTRApiRx2));
    }

    @Override // javax.inject.Provider
    public OneOwnerManagementRepository get() {
        return provideOneOwnerManagementRepository(this.f83336a, (RTRApiRx2) this.f83337b.get());
    }
}
