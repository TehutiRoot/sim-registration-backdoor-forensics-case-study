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
import th.p047co.dtac.android.dtacone.repository.mrtr_mnp.MrtrMnpRepository;
import th.p047co.dtac.android.dtacone.util.FileUtil;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.SingletonRepositoryModule_ProvideMrtrMnpRepositoryFactory */
/* loaded from: classes7.dex */
public final class SingletonRepositoryModule_ProvideMrtrMnpRepositoryFactory implements Factory<MrtrMnpRepository> {

    /* renamed from: a */
    public final SingletonRepositoryModule f83243a;

    /* renamed from: b */
    public final Provider f83244b;

    /* renamed from: c */
    public final Provider f83245c;

    /* renamed from: d */
    public final Provider f83246d;

    /* renamed from: e */
    public final Provider f83247e;

    /* renamed from: f */
    public final Provider f83248f;

    public SingletonRepositoryModule_ProvideMrtrMnpRepositoryFactory(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<PreferencesRepository> provider3, Provider<ConfigurationRepository> provider4, Provider<FileUtil> provider5) {
        this.f83243a = singletonRepositoryModule;
        this.f83244b = provider;
        this.f83245c = provider2;
        this.f83246d = provider3;
        this.f83247e = provider4;
        this.f83248f = provider5;
    }

    public static SingletonRepositoryModule_ProvideMrtrMnpRepositoryFactory create(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<PreferencesRepository> provider3, Provider<ConfigurationRepository> provider4, Provider<FileUtil> provider5) {
        return new SingletonRepositoryModule_ProvideMrtrMnpRepositoryFactory(singletonRepositoryModule, provider, provider2, provider3, provider4, provider5);
    }

    public static MrtrMnpRepository provideMrtrMnpRepository(SingletonRepositoryModule singletonRepositoryModule, RTRApiRx2 rTRApiRx2, RtrRx2Repository rtrRx2Repository, PreferencesRepository preferencesRepository, ConfigurationRepository configurationRepository, FileUtil fileUtil) {
        return (MrtrMnpRepository) Preconditions.checkNotNullFromProvides(singletonRepositoryModule.provideMrtrMnpRepository(rTRApiRx2, rtrRx2Repository, preferencesRepository, configurationRepository, fileUtil));
    }

    @Override // javax.inject.Provider
    public MrtrMnpRepository get() {
        return provideMrtrMnpRepository(this.f83243a, (RTRApiRx2) this.f83244b.get(), (RtrRx2Repository) this.f83245c.get(), (PreferencesRepository) this.f83246d.get(), (ConfigurationRepository) this.f83247e.get(), (FileUtil) this.f83248f.get());
    }
}
