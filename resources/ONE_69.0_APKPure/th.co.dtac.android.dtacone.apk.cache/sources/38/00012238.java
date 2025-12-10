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
/* renamed from: th.co.dtac.android.dtacone.presenter.buy_dol.BuyDolPaymentInfoPresenter_Factory */
/* loaded from: classes8.dex */
public final class BuyDolPaymentInfoPresenter_Factory implements Factory<BuyDolPaymentInfoPresenter> {

    /* renamed from: a */
    public final Provider f85464a;

    /* renamed from: b */
    public final Provider f85465b;

    /* renamed from: c */
    public final Provider f85466c;

    public BuyDolPaymentInfoPresenter_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f85464a = provider;
        this.f85465b = provider2;
        this.f85466c = provider3;
    }

    public static BuyDolPaymentInfoPresenter_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new BuyDolPaymentInfoPresenter_Factory(provider, provider2, provider3);
    }

    public static BuyDolPaymentInfoPresenter newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService) {
        return new BuyDolPaymentInfoPresenter(rTRApiRx2, rx2ThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public BuyDolPaymentInfoPresenter get() {
        return newInstance((RTRApiRx2) this.f85464a.get(), (Rx2ThreadService) this.f85465b.get(), (ServerErrorService) this.f85466c.get());
    }
}