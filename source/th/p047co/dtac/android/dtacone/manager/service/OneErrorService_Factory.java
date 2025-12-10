package th.p047co.dtac.android.dtacone.manager.service;

import android.app.Activity;
import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.manager.messaging.FirebaseMessagingTopic;

@ScopeMetadata("th.co.dtac.android.dtacone.configuration.PerActivity")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.manager.service.OneErrorService_Factory */
/* loaded from: classes7.dex */
public final class OneErrorService_Factory implements Factory<OneErrorService> {

    /* renamed from: a */
    public final Provider f85001a;

    /* renamed from: b */
    public final Provider f85002b;

    /* renamed from: c */
    public final Provider f85003c;

    /* renamed from: d */
    public final Provider f85004d;

    /* renamed from: e */
    public final Provider f85005e;

    /* renamed from: f */
    public final Provider f85006f;

    /* renamed from: g */
    public final Provider f85007g;

    public OneErrorService_Factory(Provider<Activity> provider, Provider<Gson> provider2, Provider<TemporaryCache> provider3, Provider<RtrRx2Repository> provider4, Provider<FirebaseMessagingTopic> provider5, Provider<PreferencesRepository> provider6, Provider<PreferencesViewModel> provider7) {
        this.f85001a = provider;
        this.f85002b = provider2;
        this.f85003c = provider3;
        this.f85004d = provider4;
        this.f85005e = provider5;
        this.f85006f = provider6;
        this.f85007g = provider7;
    }

    public static OneErrorService_Factory create(Provider<Activity> provider, Provider<Gson> provider2, Provider<TemporaryCache> provider3, Provider<RtrRx2Repository> provider4, Provider<FirebaseMessagingTopic> provider5, Provider<PreferencesRepository> provider6, Provider<PreferencesViewModel> provider7) {
        return new OneErrorService_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static OneErrorService newInstance(Activity activity, Gson gson, TemporaryCache temporaryCache, RtrRx2Repository rtrRx2Repository, FirebaseMessagingTopic firebaseMessagingTopic, PreferencesRepository preferencesRepository, PreferencesViewModel preferencesViewModel) {
        return new OneErrorService(activity, gson, temporaryCache, rtrRx2Repository, firebaseMessagingTopic, preferencesRepository, preferencesViewModel);
    }

    @Override // javax.inject.Provider
    public OneErrorService get() {
        return newInstance((Activity) this.f85001a.get(), (Gson) this.f85002b.get(), (TemporaryCache) this.f85003c.get(), (RtrRx2Repository) this.f85004d.get(), (FirebaseMessagingTopic) this.f85005e.get(), (PreferencesRepository) this.f85006f.get(), (PreferencesViewModel) this.f85007g.get());
    }
}
