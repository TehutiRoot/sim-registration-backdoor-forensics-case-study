package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.mrtr_postpaid.MrtrPostpaidRepository;
import th.p047co.dtac.android.dtacone.util.FileUtil;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.SingletonRepositoryModule_ProvideMrtrPostpaidReregistRepositoryFactory */
/* loaded from: classes7.dex */
public final class C14189x473fa265 implements Factory<MrtrPostpaidRepository> {

    /* renamed from: a */
    public final SingletonRepositoryModule f83249a;

    /* renamed from: b */
    public final Provider f83250b;

    /* renamed from: c */
    public final Provider f83251c;

    /* renamed from: d */
    public final Provider f83252d;

    /* renamed from: e */
    public final Provider f83253e;

    /* renamed from: f */
    public final Provider f83254f;

    public C14189x473fa265(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<PreferencesRepository> provider3, Provider<ConfigurationRepository> provider4, Provider<FileUtil> provider5) {
        this.f83249a = singletonRepositoryModule;
        this.f83250b = provider;
        this.f83251c = provider2;
        this.f83252d = provider3;
        this.f83253e = provider4;
        this.f83254f = provider5;
    }

    public static C14189x473fa265 create(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<PreferencesRepository> provider3, Provider<ConfigurationRepository> provider4, Provider<FileUtil> provider5) {
        return new C14189x473fa265(singletonRepositoryModule, provider, provider2, provider3, provider4, provider5);
    }

    public static MrtrPostpaidRepository provideMrtrPostpaidReregistRepository(SingletonRepositoryModule singletonRepositoryModule, RTRApiRx2 rTRApiRx2, RtrRx2Repository rtrRx2Repository, PreferencesRepository preferencesRepository, ConfigurationRepository configurationRepository, FileUtil fileUtil) {
        return (MrtrPostpaidRepository) Preconditions.checkNotNullFromProvides(singletonRepositoryModule.provideMrtrPostpaidReregistRepository(rTRApiRx2, rtrRx2Repository, preferencesRepository, configurationRepository, fileUtil));
    }

    @Override // javax.inject.Provider
    public MrtrPostpaidRepository get() {
        return provideMrtrPostpaidReregistRepository(this.f83249a, (RTRApiRx2) this.f83250b.get(), (RtrRx2Repository) this.f83251c.get(), (PreferencesRepository) this.f83252d.get(), (ConfigurationRepository) this.f83253e.get(), (FileUtil) this.f83254f.get());
    }
}
