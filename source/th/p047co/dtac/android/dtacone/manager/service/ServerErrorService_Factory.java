package th.p047co.dtac.android.dtacone.manager.service;

import android.app.Activity;
import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.manager.messaging.FirebaseMessagingTopic;

@ScopeMetadata("th.co.dtac.android.dtacone.configuration.PerActivity")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.manager.service.ServerErrorService_Factory */
/* loaded from: classes7.dex */
public final class ServerErrorService_Factory implements Factory<ServerErrorService> {

    /* renamed from: a */
    public final Provider f85027a;

    /* renamed from: b */
    public final Provider f85028b;

    /* renamed from: c */
    public final Provider f85029c;

    /* renamed from: d */
    public final Provider f85030d;

    /* renamed from: e */
    public final Provider f85031e;

    /* renamed from: f */
    public final Provider f85032f;

    /* renamed from: g */
    public final Provider f85033g;

    public ServerErrorService_Factory(Provider<Activity> provider, Provider<Gson> provider2, Provider<TemporaryCache> provider3, Provider<RtrRepository> provider4, Provider<RtrRx2Repository> provider5, Provider<FirebaseMessagingTopic> provider6, Provider<PreferencesRepository> provider7) {
        this.f85027a = provider;
        this.f85028b = provider2;
        this.f85029c = provider3;
        this.f85030d = provider4;
        this.f85031e = provider5;
        this.f85032f = provider6;
        this.f85033g = provider7;
    }

    public static ServerErrorService_Factory create(Provider<Activity> provider, Provider<Gson> provider2, Provider<TemporaryCache> provider3, Provider<RtrRepository> provider4, Provider<RtrRx2Repository> provider5, Provider<FirebaseMessagingTopic> provider6, Provider<PreferencesRepository> provider7) {
        return new ServerErrorService_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static ServerErrorService newInstance(Activity activity, Gson gson, TemporaryCache temporaryCache, RtrRepository rtrRepository, RtrRx2Repository rtrRx2Repository, FirebaseMessagingTopic firebaseMessagingTopic, PreferencesRepository preferencesRepository) {
        return new ServerErrorService(activity, gson, temporaryCache, rtrRepository, rtrRx2Repository, firebaseMessagingTopic, preferencesRepository);
    }

    @Override // javax.inject.Provider
    public ServerErrorService get() {
        return newInstance((Activity) this.f85027a.get(), (Gson) this.f85028b.get(), (TemporaryCache) this.f85029c.get(), (RtrRepository) this.f85030d.get(), (RtrRx2Repository) this.f85031e.get(), (FirebaseMessagingTopic) this.f85032f.get(), (PreferencesRepository) this.f85033g.get());
    }
}
