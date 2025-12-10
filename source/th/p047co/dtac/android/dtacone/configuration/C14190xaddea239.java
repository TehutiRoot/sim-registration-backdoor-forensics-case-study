package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.repository.mrtr_prepaid_multi_sim.MrtrPrepaidMultiSimRepository;
import th.p047co.dtac.android.dtacone.util.FileUtil;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.SingletonRepositoryModule_ProvideMrtrPrepaidMultiSimRepositoryFactory */
/* loaded from: classes7.dex */
public final class C14190xaddea239 implements Factory<MrtrPrepaidMultiSimRepository> {

    /* renamed from: a */
    public final SingletonRepositoryModule f83261a;

    /* renamed from: b */
    public final Provider f83262b;

    /* renamed from: c */
    public final Provider f83263c;

    /* renamed from: d */
    public final Provider f83264d;

    public C14190xaddea239(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<FileUtil> provider3) {
        this.f83261a = singletonRepositoryModule;
        this.f83262b = provider;
        this.f83263c = provider2;
        this.f83264d = provider3;
    }

    public static C14190xaddea239 create(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<FileUtil> provider3) {
        return new C14190xaddea239(singletonRepositoryModule, provider, provider2, provider3);
    }

    public static MrtrPrepaidMultiSimRepository provideMrtrPrepaidMultiSimRepository(SingletonRepositoryModule singletonRepositoryModule, RTRApiRx2 rTRApiRx2, RtrRx2Repository rtrRx2Repository, FileUtil fileUtil) {
        return (MrtrPrepaidMultiSimRepository) Preconditions.checkNotNullFromProvides(singletonRepositoryModule.provideMrtrPrepaidMultiSimRepository(rTRApiRx2, rtrRx2Repository, fileUtil));
    }

    @Override // javax.inject.Provider
    public MrtrPrepaidMultiSimRepository get() {
        return provideMrtrPrepaidMultiSimRepository(this.f83261a, (RTRApiRx2) this.f83262b.get(), (RtrRx2Repository) this.f83263c.get(), (FileUtil) this.f83264d.get());
    }
}
