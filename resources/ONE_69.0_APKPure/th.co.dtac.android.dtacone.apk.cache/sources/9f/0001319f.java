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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.home.viewModel.OneNewsFeedViewModelFactory_Factory */
/* loaded from: classes10.dex */
public final class OneNewsFeedViewModelFactory_Factory implements Factory<OneNewsFeedViewModelFactory> {

    /* renamed from: a */
    public final Provider f91328a;

    /* renamed from: b */
    public final Provider f91329b;

    /* renamed from: c */
    public final Provider f91330c;

    /* renamed from: d */
    public final Provider f91331d;

    /* renamed from: e */
    public final Provider f91332e;

    public OneNewsFeedViewModelFactory_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3, Provider<RtrRepository> provider4, Provider<RtrRx2Repository> provider5) {
        this.f91328a = provider;
        this.f91329b = provider2;
        this.f91330c = provider3;
        this.f91331d = provider4;
        this.f91332e = provider5;
    }

    public static OneNewsFeedViewModelFactory_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3, Provider<RtrRepository> provider4, Provider<RtrRx2Repository> provider5) {
        return new OneNewsFeedViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static OneNewsFeedViewModelFactory newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService, RtrRepository rtrRepository, RtrRx2Repository rtrRx2Repository) {
        return new OneNewsFeedViewModelFactory(rTRApiRx2, rx2ThreadService, oneErrorService, rtrRepository, rtrRx2Repository);
    }

    @Override // javax.inject.Provider
    public OneNewsFeedViewModelFactory get() {
        return newInstance((RTRApiRx2) this.f91328a.get(), (Rx2ThreadService) this.f91329b.get(), (OneErrorService) this.f91330c.get(), (RtrRepository) this.f91331d.get(), (RtrRx2Repository) this.f91332e.get());
    }
}