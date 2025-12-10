package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.repository.mrtr_prepaid.MrtrPrepaidRepository;
import th.p047co.dtac.android.dtacone.util.FileUtil;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.SingletonRepositoryModule_ProvideMrtrPrepaidRepositoryFactory */
/* loaded from: classes7.dex */
public final class SingletonRepositoryModule_ProvideMrtrPrepaidRepositoryFactory implements Factory<MrtrPrepaidRepository> {

    /* renamed from: a */
    public final SingletonRepositoryModule f83265a;

    /* renamed from: b */
    public final Provider f83266b;

    /* renamed from: c */
    public final Provider f83267c;

    /* renamed from: d */
    public final Provider f83268d;

    public SingletonRepositoryModule_ProvideMrtrPrepaidRepositoryFactory(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<FileUtil> provider3) {
        this.f83265a = singletonRepositoryModule;
        this.f83266b = provider;
        this.f83267c = provider2;
        this.f83268d = provider3;
    }

    public static SingletonRepositoryModule_ProvideMrtrPrepaidRepositoryFactory create(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<FileUtil> provider3) {
        return new SingletonRepositoryModule_ProvideMrtrPrepaidRepositoryFactory(singletonRepositoryModule, provider, provider2, provider3);
    }

    public static MrtrPrepaidRepository provideMrtrPrepaidRepository(SingletonRepositoryModule singletonRepositoryModule, RTRApiRx2 rTRApiRx2, RtrRx2Repository rtrRx2Repository, FileUtil fileUtil) {
        return (MrtrPrepaidRepository) Preconditions.checkNotNullFromProvides(singletonRepositoryModule.provideMrtrPrepaidRepository(rTRApiRx2, rtrRx2Repository, fileUtil));
    }

    @Override // javax.inject.Provider
    public MrtrPrepaidRepository get() {
        return provideMrtrPrepaidRepository(this.f83265a, (RTRApiRx2) this.f83266b.get(), (RtrRx2Repository) this.f83267c.get(), (FileUtil) this.f83268d.get());
    }
}
