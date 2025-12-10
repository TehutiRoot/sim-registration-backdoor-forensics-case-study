package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.repository.OneOnlineRegisterRepository;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.SingletonRepositoryModule_ProvideOneOnlineRegisterRepositoryFactory */
/* loaded from: classes7.dex */
public final class C14200xd81c4fa7 implements Factory<OneOnlineRegisterRepository> {

    /* renamed from: a */
    public final SingletonRepositoryModule f83334a;

    /* renamed from: b */
    public final Provider f83335b;

    public C14200xd81c4fa7(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider) {
        this.f83334a = singletonRepositoryModule;
        this.f83335b = provider;
    }

    public static C14200xd81c4fa7 create(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider) {
        return new C14200xd81c4fa7(singletonRepositoryModule, provider);
    }

    public static OneOnlineRegisterRepository provideOneOnlineRegisterRepository(SingletonRepositoryModule singletonRepositoryModule, RTRApiRx2 rTRApiRx2) {
        return (OneOnlineRegisterRepository) Preconditions.checkNotNullFromProvides(singletonRepositoryModule.provideOneOnlineRegisterRepository(rTRApiRx2));
    }

    @Override // javax.inject.Provider
    public OneOnlineRegisterRepository get() {
        return provideOneOnlineRegisterRepository(this.f83334a, (RTRApiRx2) this.f83335b.get());
    }
}
