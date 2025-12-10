package th.p047co.dtac.android.dtacone.view.appOne.home.viewModel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.home.viewModel.OneNewsFeedViewModel_Factory */
/* loaded from: classes10.dex */
public final class OneNewsFeedViewModel_Factory implements Factory<OneNewsFeedViewModel> {

    /* renamed from: a */
    public final Provider f91333a;

    /* renamed from: b */
    public final Provider f91334b;

    /* renamed from: c */
    public final Provider f91335c;

    /* renamed from: d */
    public final Provider f91336d;

    /* renamed from: e */
    public final Provider f91337e;

    public OneNewsFeedViewModel_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3, Provider<RtrRepository> provider4, Provider<RtrRx2Repository> provider5) {
        this.f91333a = provider;
        this.f91334b = provider2;
        this.f91335c = provider3;
        this.f91336d = provider4;
        this.f91337e = provider5;
    }

    public static OneNewsFeedViewModel_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3, Provider<RtrRepository> provider4, Provider<RtrRx2Repository> provider5) {
        return new OneNewsFeedViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static OneNewsFeedViewModel newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService, RtrRepository rtrRepository, RtrRx2Repository rtrRx2Repository) {
        return new OneNewsFeedViewModel(rTRApiRx2, rx2ThreadService, oneErrorService, rtrRepository, rtrRx2Repository);
    }

    @Override // javax.inject.Provider
    public OneNewsFeedViewModel get() {
        return newInstance((RTRApiRx2) this.f91333a.get(), (Rx2ThreadService) this.f91334b.get(), (OneErrorService) this.f91335c.get(), (RtrRepository) this.f91336d.get(), (RtrRx2Repository) this.f91337e.get());
    }
}