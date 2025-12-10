package th.p047co.dtac.android.dtacone.presenter.login;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.manager.messaging.FirebaseMessagingTopic;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.login.LoginPresenter_Factory */
/* loaded from: classes8.dex */
public final class LoginPresenter_Factory implements Factory<LoginPresenter> {

    /* renamed from: a */
    public final Provider f85931a;

    /* renamed from: b */
    public final Provider f85932b;

    /* renamed from: c */
    public final Provider f85933c;

    /* renamed from: d */
    public final Provider f85934d;

    /* renamed from: e */
    public final Provider f85935e;

    /* renamed from: f */
    public final Provider f85936f;

    /* renamed from: g */
    public final Provider f85937g;

    /* renamed from: h */
    public final Provider f85938h;

    public LoginPresenter_Factory(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3, Provider<TemporaryCache> provider4, Provider<RtrRepository> provider5, Provider<PreferencesRepository> provider6, Provider<FirebaseMessagingTopic> provider7, Provider<Context> provider8) {
        this.f85931a = provider;
        this.f85932b = provider2;
        this.f85933c = provider3;
        this.f85934d = provider4;
        this.f85935e = provider5;
        this.f85936f = provider6;
        this.f85937g = provider7;
        this.f85938h = provider8;
    }

    public static LoginPresenter_Factory create(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3, Provider<TemporaryCache> provider4, Provider<RtrRepository> provider5, Provider<PreferencesRepository> provider6, Provider<FirebaseMessagingTopic> provider7, Provider<Context> provider8) {
        return new LoginPresenter_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static LoginPresenter newInstance(RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService, TemporaryCache temporaryCache, RtrRepository rtrRepository, PreferencesRepository preferencesRepository, FirebaseMessagingTopic firebaseMessagingTopic, Context context) {
        return new LoginPresenter(rTRApi, rxThreadService, serverErrorService, temporaryCache, rtrRepository, preferencesRepository, firebaseMessagingTopic, context);
    }

    @Override // javax.inject.Provider
    public LoginPresenter get() {
        return newInstance((RTRApi) this.f85931a.get(), (RxThreadService) this.f85932b.get(), (ServerErrorService) this.f85933c.get(), (TemporaryCache) this.f85934d.get(), (RtrRepository) this.f85935e.get(), (PreferencesRepository) this.f85936f.get(), (FirebaseMessagingTopic) this.f85937g.get(), (Context) this.f85938h.get());
    }
}