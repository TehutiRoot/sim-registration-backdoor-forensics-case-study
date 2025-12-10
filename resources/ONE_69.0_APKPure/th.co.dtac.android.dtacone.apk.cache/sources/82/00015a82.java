package th.p047co.dtac.android.dtacone.viewmodel.news;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.manager.messaging.FirebaseMessagingTopic;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.news.NewsViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class NewsViewModelFactory_Factory implements Factory<NewsViewModelFactory> {

    /* renamed from: a */
    public final Provider f106931a;

    /* renamed from: b */
    public final Provider f106932b;

    /* renamed from: c */
    public final Provider f106933c;

    /* renamed from: d */
    public final Provider f106934d;

    /* renamed from: e */
    public final Provider f106935e;

    /* renamed from: f */
    public final Provider f106936f;

    /* renamed from: g */
    public final Provider f106937g;

    public NewsViewModelFactory_Factory(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3, Provider<PreferencesRepository> provider4, Provider<FirebaseMessagingTopic> provider5, Provider<RtrRepository> provider6, Provider<RtrRx2Repository> provider7) {
        this.f106931a = provider;
        this.f106932b = provider2;
        this.f106933c = provider3;
        this.f106934d = provider4;
        this.f106935e = provider5;
        this.f106936f = provider6;
        this.f106937g = provider7;
    }

    public static NewsViewModelFactory_Factory create(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3, Provider<PreferencesRepository> provider4, Provider<FirebaseMessagingTopic> provider5, Provider<RtrRepository> provider6, Provider<RtrRx2Repository> provider7) {
        return new NewsViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static NewsViewModelFactory newInstance(RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService, PreferencesRepository preferencesRepository, FirebaseMessagingTopic firebaseMessagingTopic, RtrRepository rtrRepository, RtrRx2Repository rtrRx2Repository) {
        return new NewsViewModelFactory(rTRApi, rxThreadService, serverErrorService, preferencesRepository, firebaseMessagingTopic, rtrRepository, rtrRx2Repository);
    }

    @Override // javax.inject.Provider
    public NewsViewModelFactory get() {
        return newInstance((RTRApi) this.f106931a.get(), (RxThreadService) this.f106932b.get(), (ServerErrorService) this.f106933c.get(), (PreferencesRepository) this.f106934d.get(), (FirebaseMessagingTopic) this.f106935e.get(), (RtrRepository) this.f106936f.get(), (RtrRx2Repository) this.f106937g.get());
    }
}