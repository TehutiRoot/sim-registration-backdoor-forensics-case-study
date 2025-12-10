package th.p047co.dtac.android.dtacone.manager.locale;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.manager.bus.RxBus;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.manager.locale.LanguageService_Factory */
/* loaded from: classes7.dex */
public final class LanguageService_Factory implements Factory<LanguageService> {

    /* renamed from: a */
    public final Provider f84950a;

    /* renamed from: b */
    public final Provider f84951b;

    /* renamed from: c */
    public final Provider f84952c;

    /* renamed from: d */
    public final Provider f84953d;

    /* renamed from: e */
    public final Provider f84954e;

    public LanguageService_Factory(Provider<Application> provider, Provider<PreferencesRepository> provider2, Provider<RxBus<Object>> provider3, Provider<MessageRepository> provider4, Provider<RxThreadService> provider5) {
        this.f84950a = provider;
        this.f84951b = provider2;
        this.f84952c = provider3;
        this.f84953d = provider4;
        this.f84954e = provider5;
    }

    public static LanguageService_Factory create(Provider<Application> provider, Provider<PreferencesRepository> provider2, Provider<RxBus<Object>> provider3, Provider<MessageRepository> provider4, Provider<RxThreadService> provider5) {
        return new LanguageService_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static LanguageService newInstance(Application application, PreferencesRepository preferencesRepository, RxBus<Object> rxBus, MessageRepository messageRepository, RxThreadService rxThreadService) {
        return new LanguageService(application, preferencesRepository, rxBus, messageRepository, rxThreadService);
    }

    @Override // javax.inject.Provider
    public LanguageService get() {
        return newInstance((Application) this.f84950a.get(), (PreferencesRepository) this.f84951b.get(), (RxBus) this.f84952c.get(), (MessageRepository) this.f84953d.get(), (RxThreadService) this.f84954e.get());
    }
}
