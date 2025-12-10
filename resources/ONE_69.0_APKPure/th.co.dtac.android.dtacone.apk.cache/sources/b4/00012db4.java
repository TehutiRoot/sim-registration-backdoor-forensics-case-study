package th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.repository.OneDeviceSaleTrueRepository_Factory */
/* loaded from: classes10.dex */
public final class OneDeviceSaleTrueRepository_Factory implements Factory<OneDeviceSaleTrueRepository> {

    /* renamed from: a */
    public final Provider f89992a;

    /* renamed from: b */
    public final Provider f89993b;

    /* renamed from: c */
    public final Provider f89994c;

    /* renamed from: d */
    public final Provider f89995d;

    /* renamed from: e */
    public final Provider f89996e;

    /* renamed from: f */
    public final Provider f89997f;

    /* renamed from: g */
    public final Provider f89998g;

    /* renamed from: h */
    public final Provider f89999h;

    public OneDeviceSaleTrueRepository_Factory(Provider<ConfigurationRepository> provider, Provider<OneDeviceSaleTrueApi> provider2, Provider<RTRApiRx2> provider3, Provider<OnePre2PostApi> provider4, Provider<OnePostpaidApi> provider5, Provider<RtrRx2Repository> provider6, Provider<ImageUtil> provider7, Provider<FileUtil> provider8) {
        this.f89992a = provider;
        this.f89993b = provider2;
        this.f89994c = provider3;
        this.f89995d = provider4;
        this.f89996e = provider5;
        this.f89997f = provider6;
        this.f89998g = provider7;
        this.f89999h = provider8;
    }

    public static OneDeviceSaleTrueRepository_Factory create(Provider<ConfigurationRepository> provider, Provider<OneDeviceSaleTrueApi> provider2, Provider<RTRApiRx2> provider3, Provider<OnePre2PostApi> provider4, Provider<OnePostpaidApi> provider5, Provider<RtrRx2Repository> provider6, Provider<ImageUtil> provider7, Provider<FileUtil> provider8) {
        return new OneDeviceSaleTrueRepository_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static OneDeviceSaleTrueRepository newInstance(ConfigurationRepository configurationRepository, OneDeviceSaleTrueApi oneDeviceSaleTrueApi, RTRApiRx2 rTRApiRx2, OnePre2PostApi onePre2PostApi, OnePostpaidApi onePostpaidApi, RtrRx2Repository rtrRx2Repository, ImageUtil imageUtil, FileUtil fileUtil) {
        return new OneDeviceSaleTrueRepository(configurationRepository, oneDeviceSaleTrueApi, rTRApiRx2, onePre2PostApi, onePostpaidApi, rtrRx2Repository, imageUtil, fileUtil);
    }

    @Override // javax.inject.Provider
    public OneDeviceSaleTrueRepository get() {
        return newInstance((ConfigurationRepository) this.f89992a.get(), (OneDeviceSaleTrueApi) this.f89993b.get(), (RTRApiRx2) this.f89994c.get(), (OnePre2PostApi) this.f89995d.get(), (OnePostpaidApi) this.f89996e.get(), (RtrRx2Repository) this.f89997f.get(), (ImageUtil) this.f89998g.get(), (FileUtil) this.f89999h.get());
    }
}