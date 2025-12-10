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
import th.p047co.dtac.android.dtacone.data.remote.devicer_sale.OneDeviceSaleApi;
import th.p047co.dtac.android.dtacone.data.remote.oneDeviceSaleTrue.OneDeviceSaleTrueApi;
import th.p047co.dtac.android.dtacone.data.remote.postpaid.OnePostpaidApi;
import th.p047co.dtac.android.dtacone.data.remote.pre2post.OnePre2PostApi;
import th.p047co.dtac.android.dtacone.manager.compressor.CompressImage;
import th.p047co.dtac.android.dtacone.manager.service.UdidService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.util.FileUtil;
import th.p047co.dtac.android.dtacone.util.image.ImageUtil;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.repository.OnePre2PostRepository;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.SingletonRepositoryModule_ProvideOnePre2PostRepositoryFactory */
/* loaded from: classes7.dex */
public final class SingletonRepositoryModule_ProvideOnePre2PostRepositoryFactory implements Factory<OnePre2PostRepository> {

    /* renamed from: a */
    public final SingletonRepositoryModule f83348a;

    /* renamed from: b */
    public final Provider f83349b;

    /* renamed from: c */
    public final Provider f83350c;

    /* renamed from: d */
    public final Provider f83351d;

    /* renamed from: e */
    public final Provider f83352e;

    /* renamed from: f */
    public final Provider f83353f;

    /* renamed from: g */
    public final Provider f83354g;

    /* renamed from: h */
    public final Provider f83355h;

    /* renamed from: i */
    public final Provider f83356i;

    /* renamed from: j */
    public final Provider f83357j;

    /* renamed from: k */
    public final Provider f83358k;

    /* renamed from: l */
    public final Provider f83359l;

    /* renamed from: m */
    public final Provider f83360m;

    /* renamed from: n */
    public final Provider f83361n;

    public SingletonRepositoryModule_ProvideOnePre2PostRepositoryFactory(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<OnePostpaidApi> provider2, Provider<OnePre2PostApi> provider3, Provider<OneDeviceSaleApi> provider4, Provider<RtrRx2Repository> provider5, Provider<OneDeviceSaleTrueApi> provider6, Provider<ConfigurationRepository> provider7, Provider<FileUtil> provider8, Provider<CompressImage> provider9, Provider<UdidService> provider10, Provider<PreferencesViewModel> provider11, Provider<PreferencesRepository> provider12, Provider<ImageUtil> provider13) {
        this.f83348a = singletonRepositoryModule;
        this.f83349b = provider;
        this.f83350c = provider2;
        this.f83351d = provider3;
        this.f83352e = provider4;
        this.f83353f = provider5;
        this.f83354g = provider6;
        this.f83355h = provider7;
        this.f83356i = provider8;
        this.f83357j = provider9;
        this.f83358k = provider10;
        this.f83359l = provider11;
        this.f83360m = provider12;
        this.f83361n = provider13;
    }

    public static SingletonRepositoryModule_ProvideOnePre2PostRepositoryFactory create(SingletonRepositoryModule singletonRepositoryModule, Provider<RTRApiRx2> provider, Provider<OnePostpaidApi> provider2, Provider<OnePre2PostApi> provider3, Provider<OneDeviceSaleApi> provider4, Provider<RtrRx2Repository> provider5, Provider<OneDeviceSaleTrueApi> provider6, Provider<ConfigurationRepository> provider7, Provider<FileUtil> provider8, Provider<CompressImage> provider9, Provider<UdidService> provider10, Provider<PreferencesViewModel> provider11, Provider<PreferencesRepository> provider12, Provider<ImageUtil> provider13) {
        return new SingletonRepositoryModule_ProvideOnePre2PostRepositoryFactory(singletonRepositoryModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13);
    }

    public static OnePre2PostRepository provideOnePre2PostRepository(SingletonRepositoryModule singletonRepositoryModule, RTRApiRx2 rTRApiRx2, OnePostpaidApi onePostpaidApi, OnePre2PostApi onePre2PostApi, OneDeviceSaleApi oneDeviceSaleApi, RtrRx2Repository rtrRx2Repository, OneDeviceSaleTrueApi oneDeviceSaleTrueApi, ConfigurationRepository configurationRepository, FileUtil fileUtil, CompressImage compressImage, UdidService udidService, PreferencesViewModel preferencesViewModel, PreferencesRepository preferencesRepository, ImageUtil imageUtil) {
        return (OnePre2PostRepository) Preconditions.checkNotNullFromProvides(singletonRepositoryModule.provideOnePre2PostRepository(rTRApiRx2, onePostpaidApi, onePre2PostApi, oneDeviceSaleApi, rtrRx2Repository, oneDeviceSaleTrueApi, configurationRepository, fileUtil, compressImage, udidService, preferencesViewModel, preferencesRepository, imageUtil));
    }

    @Override // javax.inject.Provider
    public OnePre2PostRepository get() {
        return provideOnePre2PostRepository(this.f83348a, (RTRApiRx2) this.f83349b.get(), (OnePostpaidApi) this.f83350c.get(), (OnePre2PostApi) this.f83351d.get(), (OneDeviceSaleApi) this.f83352e.get(), (RtrRx2Repository) this.f83353f.get(), (OneDeviceSaleTrueApi) this.f83354g.get(), (ConfigurationRepository) this.f83355h.get(), (FileUtil) this.f83356i.get(), (CompressImage) this.f83357j.get(), (UdidService) this.f83358k.get(), (PreferencesViewModel) this.f83359l.get(), (PreferencesRepository) this.f83360m.get(), (ImageUtil) this.f83361n.get());
    }
}
