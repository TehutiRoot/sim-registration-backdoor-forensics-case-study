package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.multipart.MultiPartService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.mrtr_prepaid_reregist.MrtrPrepaidReregistRepository;
import th.p047co.dtac.android.dtacone.util.FileUtil;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.SingletonRepositoryModule_ProvideMrtrPrepaidReregistRepositoryFactory */
/* loaded from: classes7.dex */
public final class C14191x95665f0e implements Factory<MrtrPrepaidReregistRepository> {

    /* renamed from: a */
    public final SingletonRepositoryModule f83269a;

    /* renamed from: b */
    public final Provider f83270b;

    /* renamed from: c */
    public final Provider f83271c;

    /* renamed from: d */
    public final Provider f83272d;

    /* renamed from: e */
    public final Provider f83273e;

    /* renamed from: f */
    public final Provider f83274f;

    public C14191x95665f0e(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<FileUtil> provider3, Provider<MultiPartService> provider4, Provider<ConfigurationRepository> provider5) {
        this.f83269a = singletonRepositoryModule;
        this.f83270b = provider;
        this.f83271c = provider2;
        this.f83272d = provider3;
        this.f83273e = provider4;
        this.f83274f = provider5;
    }

    public static C14191x95665f0e create(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<FileUtil> provider3, Provider<MultiPartService> provider4, Provider<ConfigurationRepository> provider5) {
        return new C14191x95665f0e(singletonRepositoryModule, provider, provider2, provider3, provider4, provider5);
    }

    public static MrtrPrepaidReregistRepository provideMrtrPrepaidReregistRepository(SingletonRepositoryModule singletonRepositoryModule, RTRApiRx2 rTRApiRx2, RtrRx2Repository rtrRx2Repository, FileUtil fileUtil, MultiPartService multiPartService, ConfigurationRepository configurationRepository) {
        return (MrtrPrepaidReregistRepository) Preconditions.checkNotNullFromProvides(singletonRepositoryModule.provideMrtrPrepaidReregistRepository(rTRApiRx2, rtrRx2Repository, fileUtil, multiPartService, configurationRepository));
    }

    @Override // javax.inject.Provider
    public MrtrPrepaidReregistRepository get() {
        return provideMrtrPrepaidReregistRepository(this.f83269a, (RTRApiRx2) this.f83270b.get(), (RtrRx2Repository) this.f83271c.get(), (FileUtil) this.f83272d.get(), (MultiPartService) this.f83273e.get(), (ConfigurationRepository) this.f83274f.get());
    }
}
