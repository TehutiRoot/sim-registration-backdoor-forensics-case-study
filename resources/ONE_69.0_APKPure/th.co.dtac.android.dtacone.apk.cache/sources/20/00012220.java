package th.p047co.dtac.android.dtacone.presenter.buy_dol;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* renamed from: th.co.dtac.android.dtacone.presenter.buy_dol.BuyDolHistoryPresenter_Factory */
/* loaded from: classes8.dex */
public final class BuyDolHistoryPresenter_Factory implements Factory<BuyDolHistoryPresenter> {

    /* renamed from: a */
    public final Provider f85434a;

    /* renamed from: b */
    public final Provider f85435b;

    /* renamed from: c */
    public final Provider f85436c;

    public BuyDolHistoryPresenter_Factory(Provider<RTRApi> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f85434a = provider;
        this.f85435b = provider2;
        this.f85436c = provider3;
    }

    public static BuyDolHistoryPresenter_Factory create(Provider<RTRApi> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new BuyDolHistoryPresenter_Factory(provider, provider2, provider3);
    }

    public static BuyDolHistoryPresenter newInstance(RTRApi rTRApi, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService) {
        return new BuyDolHistoryPresenter(rTRApi, rx2ThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public BuyDolHistoryPresenter get() {
        return newInstance((RTRApi) this.f85434a.get(), (Rx2ThreadService) this.f85435b.get(), (ServerErrorService) this.f85436c.get());
    }
}