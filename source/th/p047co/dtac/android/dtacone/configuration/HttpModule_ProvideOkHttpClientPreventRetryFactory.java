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
@QualifierMetadata({"javax.inject.Named"})
/* renamed from: th.co.dtac.android.dtacone.configuration.HttpModule_ProvideOkHttpClientPreventRetryFactory */
/* loaded from: classes7.dex */
public final class HttpModule_ProvideOkHttpClientPreventRetryFactory implements Factory<OkHttpClient> {

    /* renamed from: a */
    public final HttpModule f83146a;

    /* renamed from: b */
    public final Provider f83147b;

    /* renamed from: c */
    public final Provider f83148c;

    /* renamed from: d */
    public final Provider f83149d;

    /* renamed from: e */
    public final Provider f83150e;

    /* renamed from: f */
    public final Provider f83151f;

    /* renamed from: g */
    public final Provider f83152g;

    /* renamed from: h */
    public final Provider f83153h;

    /* renamed from: i */
    public final Provider f83154i;

    /* renamed from: j */
    public final Provider f83155j;

    /* renamed from: k */
    public final Provider f83156k;

    public HttpModule_ProvideOkHttpClientPreventRetryFactory(HttpModule httpModule, Provider<TemporaryCache> provider, Provider<UdidService> provider2, Provider<TelephonyManager> provider3, Provider<LocationManager> provider4, Provider<LanguageService> provider5, Provider<RtrRx2Repository> provider6, Provider<Application> provider7, Provider<PreferencesRepository> provider8, Provider<PreferencesViewModel> provider9, Provider<RtrRepository> provider10) {
        this.f83146a = httpModule;
        this.f83147b = provider;
        this.f83148c = provider2;
        this.f83149d = provider3;
        this.f83150e = provider4;
        this.f83151f = provider5;
        this.f83152g = provider6;
        this.f83153h = provider7;
        this.f83154i = provider8;
        this.f83155j = provider9;
        this.f83156k = provider10;
    }

    public static HttpModule_ProvideOkHttpClientPreventRetryFactory create(HttpModule httpModule, Provider<TemporaryCache> provider, Provider<UdidService> provider2, Provider<TelephonyManager> provider3, Provider<LocationManager> provider4, Provider<LanguageService> provider5, Provider<RtrRx2Repository> provider6, Provider<Application> provider7, Provider<PreferencesRepository> provider8, Provider<PreferencesViewModel> provider9, Provider<RtrRepository> provider10) {
        return new HttpModule_ProvideOkHttpClientPreventRetryFactory(httpModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static OkHttpClient provideOkHttpClientPreventRetry(HttpModule httpModule, TemporaryCache temporaryCache, UdidService udidService, TelephonyManager telephonyManager, LocationManager locationManager, LanguageService languageService, RtrRx2Repository rtrRx2Repository, Application application, PreferencesRepository preferencesRepository, PreferencesViewModel preferencesViewModel, RtrRepository rtrRepository) {
        return (OkHttpClient) Preconditions.checkNotNullFromProvides(httpModule.m19612k(temporaryCache, udidService, telephonyManager, locationManager, languageService, rtrRx2Repository, application, preferencesRepository, preferencesViewModel, rtrRepository));
    }

    @Override // javax.inject.Provider
    public OkHttpClient get() {
        return provideOkHttpClientPreventRetry(this.f83146a, (TemporaryCache) this.f83147b.get(), (UdidService) this.f83148c.get(), (TelephonyManager) this.f83149d.get(), (LocationManager) this.f83150e.get(), (LanguageService) this.f83151f.get(), (RtrRx2Repository) this.f83152g.get(), (Application) this.f83153h.get(), (PreferencesRepository) this.f83154i.get(), (PreferencesViewModel) this.f83155j.get(), (RtrRepository) this.f83156k.get());
    }
}
