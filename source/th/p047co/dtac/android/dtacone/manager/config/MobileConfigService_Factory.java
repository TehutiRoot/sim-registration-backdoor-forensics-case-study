package th.p047co.dtac.android.dtacone.manager.config;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.manager.locale.LanguageService;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.manager.config.MobileConfigService_Factory */
/* loaded from: classes7.dex */
public final class MobileConfigService_Factory implements Factory<MobileConfigService> {

    /* renamed from: a */
    public final Provider f84922a;

    /* renamed from: b */
    public final Provider f84923b;

    /* renamed from: c */
    public final Provider f84924c;

    /* renamed from: d */
    public final Provider f84925d;

    /* renamed from: e */
    public final Provider f84926e;

    /* renamed from: f */
    public final Provider f84927f;

    public MobileConfigService_Factory(Provider<Application> provider, Provider<RTRApi> provider2, Provider<LanguageService> provider3, Provider<PreferencesRepository> provider4, Provider<ConfigRepository> provider5, Provider<RxThreadService> provider6) {
        this.f84922a = provider;
        this.f84923b = provider2;
        this.f84924c = provider3;
        this.f84925d = provider4;
        this.f84926e = provider5;
        this.f84927f = provider6;
    }

    public static MobileConfigService_Factory create(Provider<Application> provider, Provider<RTRApi> provider2, Provider<LanguageService> provider3, Provider<PreferencesRepository> provider4, Provider<ConfigRepository> provider5, Provider<RxThreadService> provider6) {
        return new MobileConfigService_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static MobileConfigService newInstance(Application application, RTRApi rTRApi, LanguageService languageService, PreferencesRepository preferencesRepository, ConfigRepository configRepository, RxThreadService rxThreadService) {
        return new MobileConfigService(application, rTRApi, languageService, preferencesRepository, configRepository, rxThreadService);
    }

    @Override // javax.inject.Provider
    public MobileConfigService get() {
        return newInstance((Application) this.f84922a.get(), (RTRApi) this.f84923b.get(), (LanguageService) this.f84924c.get(), (PreferencesRepository) this.f84925d.get(), (ConfigRepository) this.f84926e.get(), (RxThreadService) this.f84927f.get());
    }
}
