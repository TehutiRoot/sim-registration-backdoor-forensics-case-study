package th.p047co.dtac.android.dtacone.util.image;

import android.location.LocationManager;
import android.telephony.TelephonyManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.manager.locale.LanguageService;
import th.p047co.dtac.android.dtacone.manager.service.UdidService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.util.image.LoadImageUtil_Factory */
/* loaded from: classes8.dex */
public final class LoadImageUtil_Factory implements Factory<LoadImageUtil> {

    /* renamed from: a */
    public final Provider f87196a;

    /* renamed from: b */
    public final Provider f87197b;

    /* renamed from: c */
    public final Provider f87198c;

    /* renamed from: d */
    public final Provider f87199d;

    /* renamed from: e */
    public final Provider f87200e;

    /* renamed from: f */
    public final Provider f87201f;

    public LoadImageUtil_Factory(Provider<TemporaryCache> provider, Provider<UdidService> provider2, Provider<TelephonyManager> provider3, Provider<LocationManager> provider4, Provider<LanguageService> provider5, Provider<RtrRepository> provider6) {
        this.f87196a = provider;
        this.f87197b = provider2;
        this.f87198c = provider3;
        this.f87199d = provider4;
        this.f87200e = provider5;
        this.f87201f = provider6;
    }

    public static LoadImageUtil_Factory create(Provider<TemporaryCache> provider, Provider<UdidService> provider2, Provider<TelephonyManager> provider3, Provider<LocationManager> provider4, Provider<LanguageService> provider5, Provider<RtrRepository> provider6) {
        return new LoadImageUtil_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static LoadImageUtil newInstance(TemporaryCache temporaryCache, UdidService udidService, TelephonyManager telephonyManager, LocationManager locationManager, LanguageService languageService, RtrRepository rtrRepository) {
        return new LoadImageUtil(temporaryCache, udidService, telephonyManager, locationManager, languageService, rtrRepository);
    }

    @Override // javax.inject.Provider
    public LoadImageUtil get() {
        return newInstance((TemporaryCache) this.f87196a.get(), (UdidService) this.f87197b.get(), (TelephonyManager) this.f87198c.get(), (LocationManager) this.f87199d.get(), (LanguageService) this.f87200e.get(), (RtrRepository) this.f87201f.get());
    }
}