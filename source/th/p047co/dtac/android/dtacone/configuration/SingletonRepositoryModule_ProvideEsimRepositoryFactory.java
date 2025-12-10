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
import th.p047co.dtac.android.dtacone.repository.esim.ESimRepository;
import th.p047co.dtac.android.dtacone.util.FileUtil;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.SingletonRepositoryModule_ProvideEsimRepositoryFactory */
/* loaded from: classes7.dex */
public final class SingletonRepositoryModule_ProvideEsimRepositoryFactory implements Factory<ESimRepository> {

    /* renamed from: a */
    public final SingletonRepositoryModule f83232a;

    /* renamed from: b */
    public final Provider f83233b;

    /* renamed from: c */
    public final Provider f83234c;

    /* renamed from: d */
    public final Provider f83235d;

    /* renamed from: e */
    public final Provider f83236e;

    /* renamed from: f */
    public final Provider f83237f;

    public SingletonRepositoryModule_ProvideEsimRepositoryFactory(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<PreferencesRepository> provider3, Provider<ConfigurationRepository> provider4, Provider<FileUtil> provider5) {
        this.f83232a = singletonRepositoryModule;
        this.f83233b = provider;
        this.f83234c = provider2;
        this.f83235d = provider3;
        this.f83236e = provider4;
        this.f83237f = provider5;
    }

    public static SingletonRepositoryModule_ProvideEsimRepositoryFactory create(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<PreferencesRepository> provider3, Provider<ConfigurationRepository> provider4, Provider<FileUtil> provider5) {
        return new SingletonRepositoryModule_ProvideEsimRepositoryFactory(singletonRepositoryModule, provider, provider2, provider3, provider4, provider5);
    }

    public static ESimRepository provideEsimRepository(SingletonRepositoryModule singletonRepositoryModule, RTRApiRx2 rTRApiRx2, RtrRx2Repository rtrRx2Repository, PreferencesRepository preferencesRepository, ConfigurationRepository configurationRepository, FileUtil fileUtil) {
        return (ESimRepository) Preconditions.checkNotNullFromProvides(singletonRepositoryModule.provideEsimRepository(rTRApiRx2, rtrRx2Repository, preferencesRepository, configurationRepository, fileUtil));
    }

    @Override // javax.inject.Provider
    public ESimRepository get() {
        return provideEsimRepository(this.f83232a, (RTRApiRx2) this.f83233b.get(), (RtrRx2Repository) this.f83234c.get(), (PreferencesRepository) this.f83235d.get(), (ConfigurationRepository) this.f83236e.get(), (FileUtil) this.f83237f.get());
    }
}
