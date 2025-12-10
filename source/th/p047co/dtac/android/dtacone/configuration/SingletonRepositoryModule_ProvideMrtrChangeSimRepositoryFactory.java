package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.mrtr_change_sim.MrtrChangeSimRepository;
import th.p047co.dtac.android.dtacone.util.FileUtil;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.SingletonRepositoryModule_ProvideMrtrChangeSimRepositoryFactory */
/* loaded from: classes7.dex */
public final class SingletonRepositoryModule_ProvideMrtrChangeSimRepositoryFactory implements Factory<MrtrChangeSimRepository> {

    /* renamed from: a */
    public final SingletonRepositoryModule f83238a;

    /* renamed from: b */
    public final Provider f83239b;

    /* renamed from: c */
    public final Provider f83240c;

    /* renamed from: d */
    public final Provider f83241d;

    /* renamed from: e */
    public final Provider f83242e;

    public SingletonRepositoryModule_ProvideMrtrChangeSimRepositoryFactory(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3, Provider<FileUtil> provider4) {
        this.f83238a = singletonRepositoryModule;
        this.f83239b = provider;
        this.f83240c = provider2;
        this.f83241d = provider3;
        this.f83242e = provider4;
    }

    public static SingletonRepositoryModule_ProvideMrtrChangeSimRepositoryFactory create(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3, Provider<FileUtil> provider4) {
        return new SingletonRepositoryModule_ProvideMrtrChangeSimRepositoryFactory(singletonRepositoryModule, provider, provider2, provider3, provider4);
    }

    public static MrtrChangeSimRepository provideMrtrChangeSimRepository(SingletonRepositoryModule singletonRepositoryModule, RTRApiRx2 rTRApiRx2, RtrRx2Repository rtrRx2Repository, ConfigurationRepository configurationRepository, FileUtil fileUtil) {
        return (MrtrChangeSimRepository) Preconditions.checkNotNullFromProvides(singletonRepositoryModule.provideMrtrChangeSimRepository(rTRApiRx2, rtrRx2Repository, configurationRepository, fileUtil));
    }

    @Override // javax.inject.Provider
    public MrtrChangeSimRepository get() {
        return provideMrtrChangeSimRepository(this.f83238a, (RTRApiRx2) this.f83239b.get(), (RtrRx2Repository) this.f83240c.get(), (ConfigurationRepository) this.f83241d.get(), (FileUtil) this.f83242e.get());
    }
}
