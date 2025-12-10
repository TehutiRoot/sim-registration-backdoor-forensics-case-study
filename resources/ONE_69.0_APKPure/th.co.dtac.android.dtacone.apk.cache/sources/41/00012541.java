package th.p047co.dtac.android.dtacone.presenter.sellerID;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.sellerID.ShopListPresenter_Factory */
/* loaded from: classes8.dex */
public final class ShopListPresenter_Factory implements Factory<ShopListPresenter> {

    /* renamed from: a */
    public final Provider f86481a;

    /* renamed from: b */
    public final Provider f86482b;

    /* renamed from: c */
    public final Provider f86483c;

    public ShopListPresenter_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f86481a = provider;
        this.f86482b = provider2;
        this.f86483c = provider3;
    }

    public static ShopListPresenter_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new ShopListPresenter_Factory(provider, provider2, provider3);
    }

    public static ShopListPresenter newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService) {
        return new ShopListPresenter(rTRApiRx2, rx2ThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public ShopListPresenter get() {
        return newInstance((RTRApiRx2) this.f86481a.get(), (Rx2ThreadService) this.f86482b.get(), (ServerErrorService) this.f86483c.get());
    }
}