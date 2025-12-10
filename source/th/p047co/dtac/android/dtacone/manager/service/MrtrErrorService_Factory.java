package th.p047co.dtac.android.dtacone.manager.service;

import android.app.Activity;
import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.manager.messaging.FirebaseMessagingTopic;

@ScopeMetadata("th.co.dtac.android.dtacone.configuration.PerActivity")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.manager.service.MrtrErrorService_Factory */
/* loaded from: classes7.dex */
public final class MrtrErrorService_Factory implements Factory<MrtrErrorService> {

    /* renamed from: a */
    public final Provider f84985a;

    /* renamed from: b */
    public final Provider f84986b;

    /* renamed from: c */
    public final Provider f84987c;

    /* renamed from: d */
    public final Provider f84988d;

    /* renamed from: e */
    public final Provider f84989e;

    /* renamed from: f */
    public final Provider f84990f;

    public MrtrErrorService_Factory(Provider<Activity> provider, Provider<Gson> provider2, Provider<TemporaryCache> provider3, Provider<RtrRx2Repository> provider4, Provider<FirebaseMessagingTopic> provider5, Provider<PreferencesRepository> provider6) {
        this.f84985a = provider;
        this.f84986b = provider2;
        this.f84987c = provider3;
        this.f84988d = provider4;
        this.f84989e = provider5;
        this.f84990f = provider6;
    }

    public static MrtrErrorService_Factory create(Provider<Activity> provider, Provider<Gson> provider2, Provider<TemporaryCache> provider3, Provider<RtrRx2Repository> provider4, Provider<FirebaseMessagingTopic> provider5, Provider<PreferencesRepository> provider6) {
        return new MrtrErrorService_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static MrtrErrorService newInstance(Activity activity, Gson gson, TemporaryCache temporaryCache, RtrRx2Repository rtrRx2Repository, FirebaseMessagingTopic firebaseMessagingTopic, PreferencesRepository preferencesRepository) {
        return new MrtrErrorService(activity, gson, temporaryCache, rtrRx2Repository, firebaseMessagingTopic, preferencesRepository);
    }

    @Override // javax.inject.Provider
    public MrtrErrorService get() {
        return newInstance((Activity) this.f84985a.get(), (Gson) this.f84986b.get(), (TemporaryCache) this.f84987c.get(), (RtrRx2Repository) this.f84988d.get(), (FirebaseMessagingTopic) this.f84989e.get(), (PreferencesRepository) this.f84990f.get());
    }
}
