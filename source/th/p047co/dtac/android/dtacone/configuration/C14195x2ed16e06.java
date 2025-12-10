package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.data.remote.oneDeviceSaleTrue.OneDeviceSaleTrueApi;
import th.p047co.dtac.android.dtacone.data.remote.postpaid.OnePostpaidApi;
import th.p047co.dtac.android.dtacone.data.remote.pre2post.OnePre2PostApi;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.util.FileUtil;
import th.p047co.dtac.android.dtacone.util.image.ImageUtil;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.repository.OneDeviceSaleTrueRepository;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.SingletonRepositoryModule_ProvideOneNewDeviceSaleRepositoryFactory */
/* loaded from: classes7.dex */
public final class C14195x2ed16e06 implements Factory<OneDeviceSaleTrueRepository> {

    /* renamed from: a */
    public final SingletonRepositoryModule f83311a;

    /* renamed from: b */
    public final Provider f83312b;

    /* renamed from: c */
    public final Provider f83313c;

    /* renamed from: d */
    public final Provider f83314d;

    /* renamed from: e */
    public final Provider f83315e;

    /* renamed from: f */
    public final Provider f83316f;

    /* renamed from: g */
    public final Provider f83317g;

    /* renamed from: h */
    public final Provider f83318h;

    /* renamed from: i */
    public final Provider f83319i;

    public C14195x2ed16e06(SingletonRepositoryModule singletonRepositoryModule, Provider<ConfigurationRepository> provider, Provider<OneDeviceSaleTrueApi> provider2, Provider<RtrRx2Repository> provider3, Provider<RTRApiRx2> provider4, Provider<OnePre2PostApi> provider5, Provider<OnePostpaidApi> provider6, Provider<ImageUtil> provider7, Provider<FileUtil> provider8) {
        this.f83311a = singletonRepositoryModule;
        this.f83312b = provider;
        this.f83313c = provider2;
        this.f83314d = provider3;
        this.f83315e = provider4;
        this.f83316f = provider5;
        this.f83317g = provider6;
        this.f83318h = provider7;
        this.f83319i = provider8;
    }

    public static C14195x2ed16e06 create(SingletonRepositoryModule singletonRepositoryModule, Provider<ConfigurationRepository> provider, Provider<OneDeviceSaleTrueApi> provider2, Provider<RtrRx2Repository> provider3, Provider<RTRApiRx2> provider4, Provider<OnePre2PostApi> provider5, Provider<OnePostpaidApi> provider6, Provider<ImageUtil> provider7, Provider<FileUtil> provider8) {
        return new C14195x2ed16e06(singletonRepositoryModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static OneDeviceSaleTrueRepository provideOneNewDeviceSaleRepository(SingletonRepositoryModule singletonRepositoryModule, ConfigurationRepository configurationRepository, OneDeviceSaleTrueApi oneDeviceSaleTrueApi, RtrRx2Repository rtrRx2Repository, RTRApiRx2 rTRApiRx2, OnePre2PostApi onePre2PostApi, OnePostpaidApi onePostpaidApi, ImageUtil imageUtil, FileUtil fileUtil) {
        return (OneDeviceSaleTrueRepository) Preconditions.checkNotNullFromProvides(singletonRepositoryModule.provideOneNewDeviceSaleRepository(configurationRepository, oneDeviceSaleTrueApi, rtrRx2Repository, rTRApiRx2, onePre2PostApi, onePostpaidApi, imageUtil, fileUtil));
    }

    @Override // javax.inject.Provider
    public OneDeviceSaleTrueRepository get() {
        return provideOneNewDeviceSaleRepository(this.f83311a, (ConfigurationRepository) this.f83312b.get(), (OneDeviceSaleTrueApi) this.f83313c.get(), (RtrRx2Repository) this.f83314d.get(), (RTRApiRx2) this.f83315e.get(), (OnePre2PostApi) this.f83316f.get(), (OnePostpaidApi) this.f83317g.get(), (ImageUtil) this.f83318h.get(), (FileUtil) this.f83319i.get());
    }
}
