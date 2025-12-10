package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.app_one.repository.OneForgotPasswordRepository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.SingletonRepositoryModule_ProvideOneForgotPasswordRepositoryFactory */
/* loaded from: classes7.dex */
public final class C14194xa8f10fdf implements Factory<OneForgotPasswordRepository> {

    /* renamed from: a */
    public final SingletonRepositoryModule f83301a;

    /* renamed from: b */
    public final Provider f83302b;

    public C14194xa8f10fdf(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider) {
        this.f83301a = singletonRepositoryModule;
        this.f83302b = provider;
    }

    public static C14194xa8f10fdf create(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider) {
        return new C14194xa8f10fdf(singletonRepositoryModule, provider);
    }

    public static OneForgotPasswordRepository provideOneForgotPasswordRepository(SingletonRepositoryModule singletonRepositoryModule, RTRApiRx2 rTRApiRx2) {
        return (OneForgotPasswordRepository) Preconditions.checkNotNullFromProvides(singletonRepositoryModule.provideOneForgotPasswordRepository(rTRApiRx2));
    }

    @Override // javax.inject.Provider
    public OneForgotPasswordRepository get() {
        return provideOneForgotPasswordRepository(this.f83301a, (RTRApiRx2) this.f83302b.get());
    }
}
