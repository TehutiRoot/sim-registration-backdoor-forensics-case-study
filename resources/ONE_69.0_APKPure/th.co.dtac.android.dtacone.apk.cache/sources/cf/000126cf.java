package th.p047co.dtac.android.dtacone.util.appOne;

import android.location.LocationManager;
import android.telephony.TelephonyManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.manager.locale.LanguageService;
import th.p047co.dtac.android.dtacone.manager.service.UdidService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.util.appOne.OneLoadImageUtil_Factory */
/* loaded from: classes8.dex */
public final class OneLoadImageUtil_Factory implements Factory<OneLoadImageUtil> {

    /* renamed from: a */
    public final Provider f87099a;

    /* renamed from: b */
    public final Provider f87100b;

    /* renamed from: c */
    public final Provider f87101c;

    /* renamed from: d */
    public final Provider f87102d;

    /* renamed from: e */
    public final Provider f87103e;

    /* renamed from: f */
    public final Provider f87104f;

    /* renamed from: g */
    public final Provider f87105g;

    /* renamed from: h */
    public final Provider f87106h;

    /* renamed from: i */
    public final Provider f87107i;

    public OneLoadImageUtil_Factory(Provider<TemporaryCache> provider, Provider<UdidService> provider2, Provider<TelephonyManager> provider3, Provider<LocationManager> provider4, Provider<LanguageService> provider5, Provider<RtrRx2Repository> provider6, Provider<PreferencesViewModel> provider7, Provider<RtrRepository> provider8, Provider<PreferencesRepository> provider9) {
        this.f87099a = provider;
        this.f87100b = provider2;
        this.f87101c = provider3;
        this.f87102d = provider4;
        this.f87103e = provider5;
        this.f87104f = provider6;
        this.f87105g = provider7;
        this.f87106h = provider8;
        this.f87107i = provider9;
    }

    public static OneLoadImageUtil_Factory create(Provider<TemporaryCache> provider, Provider<UdidService> provider2, Provider<TelephonyManager> provider3, Provider<LocationManager> provider4, Provider<LanguageService> provider5, Provider<RtrRx2Repository> provider6, Provider<PreferencesViewModel> provider7, Provider<RtrRepository> provider8, Provider<PreferencesRepository> provider9) {
        return new OneLoadImageUtil_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static OneLoadImageUtil newInstance(TemporaryCache temporaryCache, UdidService udidService, TelephonyManager telephonyManager, LocationManager locationManager, LanguageService languageService, RtrRx2Repository rtrRx2Repository, PreferencesViewModel preferencesViewModel, RtrRepository rtrRepository, PreferencesRepository preferencesRepository) {
        return new OneLoadImageUtil(temporaryCache, udidService, telephonyManager, locationManager, languageService, rtrRx2Repository, preferencesViewModel, rtrRepository, preferencesRepository);
    }

    @Override // javax.inject.Provider
    public OneLoadImageUtil get() {
        return newInstance((TemporaryCache) this.f87099a.get(), (UdidService) this.f87100b.get(), (TelephonyManager) this.f87101c.get(), (LocationManager) this.f87102d.get(), (LanguageService) this.f87103e.get(), (RtrRx2Repository) this.f87104f.get(), (PreferencesViewModel) this.f87105g.get(), (RtrRepository) this.f87106h.get(), (PreferencesRepository) this.f87107i.get());
    }
}