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
/* renamed from: th.co.dtac.android.dtacone.presenter.buy_dol.BuyDolAddBankPresenter_Factory */
/* loaded from: classes8.dex */
public final class BuyDolAddBankPresenter_Factory implements Factory<BuyDolAddBankPresenter> {

    /* renamed from: a */
    public final Provider f85384a;

    /* renamed from: b */
    public final Provider f85385b;

    /* renamed from: c */
    public final Provider f85386c;

    public BuyDolAddBankPresenter_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f85384a = provider;
        this.f85385b = provider2;
        this.f85386c = provider3;
    }

    public static BuyDolAddBankPresenter_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new BuyDolAddBankPresenter_Factory(provider, provider2, provider3);
    }

    public static BuyDolAddBankPresenter newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService) {
        return new BuyDolAddBankPresenter(rTRApiRx2, rx2ThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public BuyDolAddBankPresenter get() {
        return newInstance((RTRApiRx2) this.f85384a.get(), (Rx2ThreadService) this.f85385b.get(), (ServerErrorService) this.f85386c.get());
    }
}