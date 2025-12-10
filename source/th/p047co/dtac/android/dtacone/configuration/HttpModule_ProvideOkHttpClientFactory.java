package th.p047co.dtac.android.dtacone.configuration;

import android.app.Application;
import android.location.LocationManager;
import android.telephony.TelephonyManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.manager.locale.LanguageService;
import th.p047co.dtac.android.dtacone.manager.service.UdidService;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.HttpModule_ProvideOkHttpClientFactory */
/* loaded from: classes7.dex */
public final class HttpModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {

    /* renamed from: a */
    public final HttpModule f83135a;

    /* renamed from: b */
    public final Provider f83136b;

    /* renamed from: c */
    public final Provider f83137c;

    /* renamed from: d */
    public final Provider f83138d;

    /* renamed from: e */
    public final Provider f83139e;

    /* renamed from: f */
    public final Provider f83140f;

    /* renamed from: g */
    public final Provider f83141g;

    /* renamed from: h */
    public final Provider f83142h;

    /* renamed from: i */
    public final Provider f83143i;

    /* renamed from: j */
    public final Provider f83144j;

    /* renamed from: k */
    public final Provider f83145k;

    public HttpModule_ProvideOkHttpClientFactory(HttpModule httpModule, Provider<TemporaryCache> provider, Provider<UdidService> provider2, Provider<TelephonyManager> provider3, Provider<LocationManager> provider4, Provider<LanguageService> provider5, Provider<RtrRx2Repository> provider6, Provider<Application> provider7, Provider<PreferencesRepository> provider8, Provider<PreferencesViewModel> provider9, Provider<RtrRepository> provider10) {
        this.f83135a = httpModule;
        this.f83136b = provider;
        this.f83137c = provider2;
        this.f83138d = provider3;
        this.f83139e = provider4;
        this.f83140f = provider5;
        this.f83141g = provider6;
        this.f83142h = provider7;
        this.f83143i = provider8;
        this.f83144j = provider9;
        this.f83145k = provider10;
    }

    public static HttpModule_ProvideOkHttpClientFactory create(HttpModule httpModule, Provider<TemporaryCache> provider, Provider<UdidService> provider2, Provider<TelephonyManager> provider3, Provider<LocationManager> provider4, Provider<LanguageService> provider5, Provider<RtrRx2Repository> provider6, Provider<Application> provider7, Provider<PreferencesRepository> provider8, Provider<PreferencesViewModel> provider9, Provider<RtrRepository> provider10) {
        return new HttpModule_ProvideOkHttpClientFactory(httpModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static OkHttpClient provideOkHttpClient(HttpModule httpModule, TemporaryCache temporaryCache, UdidService udidService, TelephonyManager telephonyManager, LocationManager locationManager, LanguageService languageService, RtrRx2Repository rtrRx2Repository, Application application, PreferencesRepository preferencesRepository, PreferencesViewModel preferencesViewModel, RtrRepository rtrRepository) {
        return (OkHttpClient) Preconditions.checkNotNullFromProvides(httpModule.m19613j(temporaryCache, udidService, telephonyManager, locationManager, languageService, rtrRx2Repository, application, preferencesRepository, preferencesViewModel, rtrRepository));
    }

    @Override // javax.inject.Provider
    public OkHttpClient get() {
        return provideOkHttpClient(this.f83135a, (TemporaryCache) this.f83136b.get(), (UdidService) this.f83137c.get(), (TelephonyManager) this.f83138d.get(), (LocationManager) this.f83139e.get(), (LanguageService) this.f83140f.get(), (RtrRx2Repository) this.f83141g.get(), (Application) this.f83142h.get(), (PreferencesRepository) this.f83143i.get(), (PreferencesViewModel) this.f83144j.get(), (RtrRepository) this.f83145k.get());
    }
}
