package th.p047co.dtac.android.dtacone.presenter.newsfeed;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.newsfeed.NewsFeedPresenter_Factory */
/* loaded from: classes8.dex */
public final class NewsFeedPresenter_Factory implements Factory<NewsFeedPresenter> {

    /* renamed from: a */
    public final Provider f86084a;

    /* renamed from: b */
    public final Provider f86085b;

    /* renamed from: c */
    public final Provider f86086c;

    /* renamed from: d */
    public final Provider f86087d;

    /* renamed from: e */
    public final Provider f86088e;

    public NewsFeedPresenter_Factory(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3, Provider<RtrRepository> provider4, Provider<RtrRx2Repository> provider5) {
        this.f86084a = provider;
        this.f86085b = provider2;
        this.f86086c = provider3;
        this.f86087d = provider4;
        this.f86088e = provider5;
    }

    public static NewsFeedPresenter_Factory create(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3, Provider<RtrRepository> provider4, Provider<RtrRx2Repository> provider5) {
        return new NewsFeedPresenter_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static NewsFeedPresenter newInstance(RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService, RtrRepository rtrRepository, RtrRx2Repository rtrRx2Repository) {
        return new NewsFeedPresenter(rTRApi, rxThreadService, serverErrorService, rtrRepository, rtrRx2Repository);
    }

    @Override // javax.inject.Provider
    public NewsFeedPresenter get() {
        return newInstance((RTRApi) this.f86084a.get(), (RxThreadService) this.f86085b.get(), (ServerErrorService) this.f86086c.get(), (RtrRepository) this.f86087d.get(), (RtrRx2Repository) this.f86088e.get());
    }
}