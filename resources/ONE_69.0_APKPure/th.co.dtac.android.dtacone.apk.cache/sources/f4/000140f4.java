package th.p047co.dtac.android.dtacone.view.appOne.tol.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.repository.OneTolRepository_Factory */
/* loaded from: classes10.dex */
public final class OneTolRepository_Factory implements Factory<OneTolRepository> {

    /* renamed from: a */
    public final Provider f98066a;

    /* renamed from: b */
    public final Provider f98067b;

    /* renamed from: c */
    public final Provider f98068c;

    /* renamed from: d */
    public final Provider f98069d;

    /* renamed from: e */
    public final Provider f98070e;

    /* renamed from: f */
    public final Provider f98071f;

    /* renamed from: g */
    public final Provider f98072g;

    /* renamed from: h */
    public final Provider f98073h;

    /* renamed from: i */
    public final Provider f98074i;

    public OneTolRepository_Factory(Provider<RTRApiRx2> provider, Provider<OneTolApi> provider2, Provider<RtrRx2Repository> provider3, Provider<PreferencesRepository> provider4, Provider<ConfigurationRepository> provider5, Provider<BitmapUtil> provider6, Provider<FileUtil> provider7, Provider<PreferencesViewModel> provider8, Provider<UdidService> provider9) {
        this.f98066a = provider;
        this.f98067b = provider2;
        this.f98068c = provider3;
        this.f98069d = provider4;
        this.f98070e = provider5;
        this.f98071f = provider6;
        this.f98072g = provider7;
        this.f98073h = provider8;
        this.f98074i = provider9;
    }

    public static OneTolRepository_Factory create(Provider<RTRApiRx2> provider, Provider<OneTolApi> provider2, Provider<RtrRx2Repository> provider3, Provider<PreferencesRepository> provider4, Provider<ConfigurationRepository> provider5, Provider<BitmapUtil> provider6, Provider<FileUtil> provider7, Provider<PreferencesViewModel> provider8, Provider<UdidService> provider9) {
        return new OneTolRepository_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static OneTolRepository newInstance(RTRApiRx2 rTRApiRx2, OneTolApi oneTolApi, RtrRx2Repository rtrRx2Repository, PreferencesRepository preferencesRepository, ConfigurationRepository configurationRepository, BitmapUtil bitmapUtil, FileUtil fileUtil, PreferencesViewModel preferencesViewModel, UdidService udidService) {
        return new OneTolRepository(rTRApiRx2, oneTolApi, rtrRx2Repository, preferencesRepository, configurationRepository, bitmapUtil, fileUtil, preferencesViewModel, udidService);
    }

    @Override // javax.inject.Provider
    public OneTolRepository get() {
        return newInstance((RTRApiRx2) this.f98066a.get(), (OneTolApi) this.f98067b.get(), (RtrRx2Repository) this.f98068c.get(), (PreferencesRepository) this.f98069d.get(), (ConfigurationRepository) this.f98070e.get(), (BitmapUtil) this.f98071f.get(), (FileUtil) this.f98072g.get(), (PreferencesViewModel) this.f98073h.get(), (UdidService) this.f98074i.get());
    }
}