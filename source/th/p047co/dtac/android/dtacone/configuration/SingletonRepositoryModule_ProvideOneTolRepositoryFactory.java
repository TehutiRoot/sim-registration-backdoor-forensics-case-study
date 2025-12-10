package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.data.remote.oneTol.OneTolApi;
import th.p047co.dtac.android.dtacone.manager.service.UdidService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.util.FileUtil;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.view.appOne.tol.repository.OneTolRepository;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.SingletonRepositoryModule_ProvideOneTolRepositoryFactory */
/* loaded from: classes7.dex */
public final class SingletonRepositoryModule_ProvideOneTolRepositoryFactory implements Factory<OneTolRepository> {

    /* renamed from: a */
    public final SingletonRepositoryModule f83388a;

    /* renamed from: b */
    public final Provider f83389b;

    /* renamed from: c */
    public final Provider f83390c;

    /* renamed from: d */
    public final Provider f83391d;

    /* renamed from: e */
    public final Provider f83392e;

    /* renamed from: f */
    public final Provider f83393f;

    /* renamed from: g */
    public final Provider f83394g;

    /* renamed from: h */
    public final Provider f83395h;

    /* renamed from: i */
    public final Provider f83396i;

    /* renamed from: j */
    public final Provider f83397j;

    public SingletonRepositoryModule_ProvideOneTolRepositoryFactory(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<OneTolApi> provider2, Provider<RtrRx2Repository> provider3, Provider<PreferencesRepository> provider4, Provider<ConfigurationRepository> provider5, Provider<BitmapUtil> provider6, Provider<FileUtil> provider7, Provider<PreferencesViewModel> provider8, Provider<UdidService> provider9) {
        this.f83388a = singletonRepositoryModule;
        this.f83389b = provider;
        this.f83390c = provider2;
        this.f83391d = provider3;
        this.f83392e = provider4;
        this.f83393f = provider5;
        this.f83394g = provider6;
        this.f83395h = provider7;
        this.f83396i = provider8;
        this.f83397j = provider9;
    }

    public static SingletonRepositoryModule_ProvideOneTolRepositoryFactory create(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<OneTolApi> provider2, Provider<RtrRx2Repository> provider3, Provider<PreferencesRepository> provider4, Provider<ConfigurationRepository> provider5, Provider<BitmapUtil> provider6, Provider<FileUtil> provider7, Provider<PreferencesViewModel> provider8, Provider<UdidService> provider9) {
        return new SingletonRepositoryModule_ProvideOneTolRepositoryFactory(singletonRepositoryModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static OneTolRepository provideOneTolRepository(SingletonRepositoryModule singletonRepositoryModule, RTRApiRx2 rTRApiRx2, OneTolApi oneTolApi, RtrRx2Repository rtrRx2Repository, PreferencesRepository preferencesRepository, ConfigurationRepository configurationRepository, BitmapUtil bitmapUtil, FileUtil fileUtil, PreferencesViewModel preferencesViewModel, UdidService udidService) {
        return (OneTolRepository) Preconditions.checkNotNullFromProvides(singletonRepositoryModule.provideOneTolRepository(rTRApiRx2, oneTolApi, rtrRx2Repository, preferencesRepository, configurationRepository, bitmapUtil, fileUtil, preferencesViewModel, udidService));
    }

    @Override // javax.inject.Provider
    public OneTolRepository get() {
        return provideOneTolRepository(this.f83388a, (RTRApiRx2) this.f83389b.get(), (OneTolApi) this.f83390c.get(), (RtrRx2Repository) this.f83391d.get(), (PreferencesRepository) this.f83392e.get(), (ConfigurationRepository) this.f83393f.get(), (BitmapUtil) this.f83394g.get(), (FileUtil) this.f83395h.get(), (PreferencesViewModel) this.f83396i.get(), (UdidService) this.f83397j.get());
    }
}
