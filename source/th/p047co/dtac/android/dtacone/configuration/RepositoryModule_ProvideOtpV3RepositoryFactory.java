package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.repository.otp_v3.OtpV3Repository;

@ScopeMetadata("th.co.dtac.android.dtacone.configuration.PerActivity")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.RepositoryModule_ProvideOtpV3RepositoryFactory */
/* loaded from: classes7.dex */
public final class RepositoryModule_ProvideOtpV3RepositoryFactory implements Factory<OtpV3Repository> {

    /* renamed from: a */
    public final RepositoryModule f83203a;

    /* renamed from: b */
    public final Provider f83204b;

    public RepositoryModule_ProvideOtpV3RepositoryFactory(RepositoryModule repositoryModule, Provider<RTRApiRx2> provider) {
        this.f83203a = repositoryModule;
        this.f83204b = provider;
    }

    public static RepositoryModule_ProvideOtpV3RepositoryFactory create(RepositoryModule repositoryModule, Provider<RTRApiRx2> provider) {
        return new RepositoryModule_ProvideOtpV3RepositoryFactory(repositoryModule, provider);
    }

    public static OtpV3Repository provideOtpV3Repository(RepositoryModule repositoryModule, RTRApiRx2 rTRApiRx2) {
        return (OtpV3Repository) Preconditions.checkNotNullFromProvides(repositoryModule.provideOtpV3Repository(rTRApiRx2));
    }

    @Override // javax.inject.Provider
    public OtpV3Repository get() {
        return provideOtpV3Repository(this.f83203a, (RTRApiRx2) this.f83204b.get());
    }
}
