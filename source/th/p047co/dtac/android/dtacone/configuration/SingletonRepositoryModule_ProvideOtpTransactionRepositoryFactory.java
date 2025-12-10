package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.repository.otp_transaction.OtpTransactionRepository;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.SingletonRepositoryModule_ProvideOtpTransactionRepositoryFactory */
/* loaded from: classes7.dex */
public final class SingletonRepositoryModule_ProvideOtpTransactionRepositoryFactory implements Factory<OtpTransactionRepository> {

    /* renamed from: a */
    public final SingletonRepositoryModule f83401a;

    /* renamed from: b */
    public final Provider f83402b;

    public SingletonRepositoryModule_ProvideOtpTransactionRepositoryFactory(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider) {
        this.f83401a = singletonRepositoryModule;
        this.f83402b = provider;
    }

    public static SingletonRepositoryModule_ProvideOtpTransactionRepositoryFactory create(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider) {
        return new SingletonRepositoryModule_ProvideOtpTransactionRepositoryFactory(singletonRepositoryModule, provider);
    }

    public static OtpTransactionRepository provideOtpTransactionRepository(SingletonRepositoryModule singletonRepositoryModule, RTRApiRx2 rTRApiRx2) {
        return (OtpTransactionRepository) Preconditions.checkNotNullFromProvides(singletonRepositoryModule.provideOtpTransactionRepository(rTRApiRx2));
    }

    @Override // javax.inject.Provider
    public OtpTransactionRepository get() {
        return provideOtpTransactionRepository(this.f83401a, (RTRApiRx2) this.f83402b.get());
    }
}
