package th.p047co.dtac.android.dtacone.presenter.sellerID;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.manager.messaging.FirebaseMessagingTopic;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.sellerID.ChangeTokenForPromoterPresenter_Factory */
/* loaded from: classes8.dex */
public final class ChangeTokenForPromoterPresenter_Factory implements Factory<ChangeTokenForPromoterPresenter> {

    /* renamed from: a */
    public final Provider f86461a;

    /* renamed from: b */
    public final Provider f86462b;

    /* renamed from: c */
    public final Provider f86463c;

    /* renamed from: d */
    public final Provider f86464d;

    /* renamed from: e */
    public final Provider f86465e;

    /* renamed from: f */
    public final Provider f86466f;

    /* renamed from: g */
    public final Provider f86467g;

    /* renamed from: h */
    public final Provider f86468h;

    /* renamed from: i */
    public final Provider f86469i;

    /* renamed from: j */
    public final Provider f86470j;

    /* renamed from: k */
    public final Provider f86471k;

    public ChangeTokenForPromoterPresenter_Factory(Provider<RTRApiRx2> provider, Provider<TemporaryCache> provider2, Provider<RtrRx2Repository> provider3, Provider<ConfigurationRepository> provider4, Provider<Rx2ThreadService> provider5, Provider<PreferencesRepository> provider6, Provider<ServerErrorService> provider7, Provider<FirebaseMessagingTopic> provider8, Provider<PreferencesViewModel> provider9, Provider<RtrRepository> provider10, Provider<RtrRx2Repository> provider11) {
        this.f86461a = provider;
        this.f86462b = provider2;
        this.f86463c = provider3;
        this.f86464d = provider4;
        this.f86465e = provider5;
        this.f86466f = provider6;
        this.f86467g = provider7;
        this.f86468h = provider8;
        this.f86469i = provider9;
        this.f86470j = provider10;
        this.f86471k = provider11;
    }

    public static ChangeTokenForPromoterPresenter_Factory create(Provider<RTRApiRx2> provider, Provider<TemporaryCache> provider2, Provider<RtrRx2Repository> provider3, Provider<ConfigurationRepository> provider4, Provider<Rx2ThreadService> provider5, Provider<PreferencesRepository> provider6, Provider<ServerErrorService> provider7, Provider<FirebaseMessagingTopic> provider8, Provider<PreferencesViewModel> provider9, Provider<RtrRepository> provider10, Provider<RtrRx2Repository> provider11) {
        return new ChangeTokenForPromoterPresenter_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    public static ChangeTokenForPromoterPresenter newInstance(RTRApiRx2 rTRApiRx2, TemporaryCache temporaryCache, RtrRx2Repository rtrRx2Repository, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, PreferencesRepository preferencesRepository, ServerErrorService serverErrorService, FirebaseMessagingTopic firebaseMessagingTopic, PreferencesViewModel preferencesViewModel, RtrRepository rtrRepository, RtrRx2Repository rtrRx2Repository2) {
        return new ChangeTokenForPromoterPresenter(rTRApiRx2, temporaryCache, rtrRx2Repository, configurationRepository, rx2ThreadService, preferencesRepository, serverErrorService, firebaseMessagingTopic, preferencesViewModel, rtrRepository, rtrRx2Repository2);
    }

    @Override // javax.inject.Provider
    public ChangeTokenForPromoterPresenter get() {
        return newInstance((RTRApiRx2) this.f86461a.get(), (TemporaryCache) this.f86462b.get(), (RtrRx2Repository) this.f86463c.get(), (ConfigurationRepository) this.f86464d.get(), (Rx2ThreadService) this.f86465e.get(), (PreferencesRepository) this.f86466f.get(), (ServerErrorService) this.f86467g.get(), (FirebaseMessagingTopic) this.f86468h.get(), (PreferencesViewModel) this.f86469i.get(), (RtrRepository) this.f86470j.get(), (RtrRx2Repository) this.f86471k.get());
    }
}