package th.p047co.dtac.android.dtacone.presenter.login;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.manager.messaging.FirebaseMessagingTopic;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.login.LogoutPresenter_Factory */
/* loaded from: classes8.dex */
public final class LogoutPresenter_Factory implements Factory<LogoutPresenter> {

    /* renamed from: a */
    public final Provider f85947a;

    /* renamed from: b */
    public final Provider f85948b;

    /* renamed from: c */
    public final Provider f85949c;

    /* renamed from: d */
    public final Provider f85950d;

    /* renamed from: e */
    public final Provider f85951e;

    /* renamed from: f */
    public final Provider f85952f;

    public LogoutPresenter_Factory(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<RtrRepository> provider3, Provider<PreferencesRepository> provider4, Provider<FirebaseMessagingTopic> provider5, Provider<PreferencesViewModel> provider6) {
        this.f85947a = provider;
        this.f85948b = provider2;
        this.f85949c = provider3;
        this.f85950d = provider4;
        this.f85951e = provider5;
        this.f85952f = provider6;
    }

    public static LogoutPresenter_Factory create(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<RtrRepository> provider3, Provider<PreferencesRepository> provider4, Provider<FirebaseMessagingTopic> provider5, Provider<PreferencesViewModel> provider6) {
        return new LogoutPresenter_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static LogoutPresenter newInstance(RTRApi rTRApi, RxThreadService rxThreadService, RtrRepository rtrRepository, PreferencesRepository preferencesRepository, FirebaseMessagingTopic firebaseMessagingTopic, PreferencesViewModel preferencesViewModel) {
        return new LogoutPresenter(rTRApi, rxThreadService, rtrRepository, preferencesRepository, firebaseMessagingTopic, preferencesViewModel);
    }

    @Override // javax.inject.Provider
    public LogoutPresenter get() {
        return newInstance((RTRApi) this.f85947a.get(), (RxThreadService) this.f85948b.get(), (RtrRepository) this.f85949c.get(), (PreferencesRepository) this.f85950d.get(), (FirebaseMessagingTopic) this.f85951e.get(), (PreferencesViewModel) this.f85952f.get());
    }
}