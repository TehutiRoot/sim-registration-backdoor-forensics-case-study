package th.p047co.dtac.android.dtacone.presenter.buy_dol;

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
/* renamed from: th.co.dtac.android.dtacone.presenter.buy_dol.BuyDolListDirectAccountPresenter_Factory */
/* loaded from: classes8.dex */
public final class BuyDolListDirectAccountPresenter_Factory implements Factory<BuyDolListDirectAccountPresenter> {

    /* renamed from: a */
    public final Provider f85456a;

    /* renamed from: b */
    public final Provider f85457b;

    /* renamed from: c */
    public final Provider f85458c;

    public BuyDolListDirectAccountPresenter_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f85456a = provider;
        this.f85457b = provider2;
        this.f85458c = provider3;
    }

    public static BuyDolListDirectAccountPresenter_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new BuyDolListDirectAccountPresenter_Factory(provider, provider2, provider3);
    }

    public static BuyDolListDirectAccountPresenter newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService) {
        return new BuyDolListDirectAccountPresenter(rTRApiRx2, rx2ThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public BuyDolListDirectAccountPresenter get() {
        return newInstance((RTRApiRx2) this.f85456a.get(), (Rx2ThreadService) this.f85457b.get(), (ServerErrorService) this.f85458c.get());
    }
}