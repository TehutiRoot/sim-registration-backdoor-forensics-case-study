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
/* renamed from: th.co.dtac.android.dtacone.presenter.buy_dol.BuyDolListBankPresenter_Factory */
/* loaded from: classes8.dex */
public final class BuyDolListBankPresenter_Factory implements Factory<BuyDolListBankPresenter> {

    /* renamed from: a */
    public final Provider f85442a;

    /* renamed from: b */
    public final Provider f85443b;

    /* renamed from: c */
    public final Provider f85444c;

    public BuyDolListBankPresenter_Factory(Provider<RTRApi> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f85442a = provider;
        this.f85443b = provider2;
        this.f85444c = provider3;
    }

    public static BuyDolListBankPresenter_Factory create(Provider<RTRApi> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new BuyDolListBankPresenter_Factory(provider, provider2, provider3);
    }

    public static BuyDolListBankPresenter newInstance(RTRApi rTRApi, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService) {
        return new BuyDolListBankPresenter(rTRApi, rx2ThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public BuyDolListBankPresenter get() {
        return newInstance((RTRApi) this.f85442a.get(), (Rx2ThreadService) this.f85443b.get(), (ServerErrorService) this.f85444c.get());
    }
}