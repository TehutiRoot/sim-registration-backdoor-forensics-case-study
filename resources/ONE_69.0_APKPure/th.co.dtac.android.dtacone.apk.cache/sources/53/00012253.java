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
/* renamed from: th.co.dtac.android.dtacone.presenter.buy_dol.BuyDolTransactionPresenter_Factory */
/* loaded from: classes8.dex */
public final class BuyDolTransactionPresenter_Factory implements Factory<BuyDolTransactionPresenter> {

    /* renamed from: a */
    public final Provider f85497a;

    /* renamed from: b */
    public final Provider f85498b;

    /* renamed from: c */
    public final Provider f85499c;

    public BuyDolTransactionPresenter_Factory(Provider<RTRApi> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f85497a = provider;
        this.f85498b = provider2;
        this.f85499c = provider3;
    }

    public static BuyDolTransactionPresenter_Factory create(Provider<RTRApi> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new BuyDolTransactionPresenter_Factory(provider, provider2, provider3);
    }

    public static BuyDolTransactionPresenter newInstance(RTRApi rTRApi, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService) {
        return new BuyDolTransactionPresenter(rTRApi, rx2ThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public BuyDolTransactionPresenter get() {
        return newInstance((RTRApi) this.f85497a.get(), (Rx2ThreadService) this.f85498b.get(), (ServerErrorService) this.f85499c.get());
    }
}