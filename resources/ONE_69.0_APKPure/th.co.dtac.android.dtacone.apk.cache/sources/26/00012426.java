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
/* renamed from: th.co.dtac.android.dtacone.presenter.newsfeed.NewsNotificationPresenter_Factory */
/* loaded from: classes8.dex */
public final class NewsNotificationPresenter_Factory implements Factory<NewsNotificationPresenter> {

    /* renamed from: a */
    public final Provider f86096a;

    /* renamed from: b */
    public final Provider f86097b;

    /* renamed from: c */
    public final Provider f86098c;

    /* renamed from: d */
    public final Provider f86099d;

    /* renamed from: e */
    public final Provider f86100e;

    public NewsNotificationPresenter_Factory(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3, Provider<RtrRepository> provider4, Provider<RtrRx2Repository> provider5) {
        this.f86096a = provider;
        this.f86097b = provider2;
        this.f86098c = provider3;
        this.f86099d = provider4;
        this.f86100e = provider5;
    }

    public static NewsNotificationPresenter_Factory create(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<ServerErrorService> provider3, Provider<RtrRepository> provider4, Provider<RtrRx2Repository> provider5) {
        return new NewsNotificationPresenter_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static NewsNotificationPresenter newInstance(RTRApi rTRApi, RxThreadService rxThreadService, ServerErrorService serverErrorService, RtrRepository rtrRepository, RtrRx2Repository rtrRx2Repository) {
        return new NewsNotificationPresenter(rTRApi, rxThreadService, serverErrorService, rtrRepository, rtrRx2Repository);
    }

    @Override // javax.inject.Provider
    public NewsNotificationPresenter get() {
        return newInstance((RTRApi) this.f86096a.get(), (RxThreadService) this.f86097b.get(), (ServerErrorService) this.f86098c.get(), (RtrRepository) this.f86099d.get(), (RtrRx2Repository) this.f86100e.get());
    }
}