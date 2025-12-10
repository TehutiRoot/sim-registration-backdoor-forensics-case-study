package th.p047co.dtac.android.dtacone.configuration;

import android.location.LocationManager;
import android.telephony.TelephonyManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.manager.locale.LanguageService;
import th.p047co.dtac.android.dtacone.manager.service.UdidService;
import th.p047co.dtac.android.dtacone.util.image.LoadImageUtil;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.HttpModule_ProvideLoadImageUtilFactory */
/* loaded from: classes7.dex */
public final class HttpModule_ProvideLoadImageUtilFactory implements Factory<LoadImageUtil> {

    /* renamed from: a */
    public final HttpModule f83126a;

    /* renamed from: b */
    public final Provider f83127b;

    /* renamed from: c */
    public final Provider f83128c;

    /* renamed from: d */
    public final Provider f83129d;

    /* renamed from: e */
    public final Provider f83130e;

    /* renamed from: f */
    public final Provider f83131f;

    /* renamed from: g */
    public final Provider f83132g;

    public HttpModule_ProvideLoadImageUtilFactory(HttpModule httpModule, Provider<TemporaryCache> provider, Provider<UdidService> provider2, Provider<TelephonyManager> provider3, Provider<LocationManager> provider4, Provider<LanguageService> provider5, Provider<RtrRepository> provider6) {
        this.f83126a = httpModule;
        this.f83127b = provider;
        this.f83128c = provider2;
        this.f83129d = provider3;
        this.f83130e = provider4;
        this.f83131f = provider5;
        this.f83132g = provider6;
    }

    public static HttpModule_ProvideLoadImageUtilFactory create(HttpModule httpModule, Provider<TemporaryCache> provider, Provider<UdidService> provider2, Provider<TelephonyManager> provider3, Provider<LocationManager> provider4, Provider<LanguageService> provider5, Provider<RtrRepository> provider6) {
        return new HttpModule_ProvideLoadImageUtilFactory(httpModule, provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static LoadImageUtil provideLoadImageUtil(HttpModule httpModule, TemporaryCache temporaryCache, UdidService udidService, TelephonyManager telephonyManager, LocationManager locationManager, LanguageService languageService, RtrRepository rtrRepository) {
        return (LoadImageUtil) Preconditions.checkNotNullFromProvides(httpModule.m19615h(temporaryCache, udidService, telephonyManager, locationManager, languageService, rtrRepository));
    }

    @Override // javax.inject.Provider
    public LoadImageUtil get() {
        return provideLoadImageUtil(this.f83126a, (TemporaryCache) this.f83127b.get(), (UdidService) this.f83128c.get(), (TelephonyManager) this.f83129d.get(), (LocationManager) this.f83130e.get(), (LanguageService) this.f83131f.get(), (RtrRepository) this.f83132g.get());
    }
}
