package th.p047co.dtac.android.dtacone.presenter.buy_dol;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* renamed from: th.co.dtac.android.dtacone.presenter.buy_dol.BuyDolDeleteCardPresenter_Factory */
/* loaded from: classes8.dex */
public final class BuyDolDeleteCardPresenter_Factory implements Factory<BuyDolDeleteCardPresenter> {

    /* renamed from: a */
    public final Provider f85427a;

    /* renamed from: b */
    public final Provider f85428b;

    public BuyDolDeleteCardPresenter_Factory(Provider<RTRApi> provider, Provider<Rx2ThreadService> provider2) {
        this.f85427a = provider;
        this.f85428b = provider2;
    }

    public static BuyDolDeleteCardPresenter_Factory create(Provider<RTRApi> provider, Provider<Rx2ThreadService> provider2) {
        return new BuyDolDeleteCardPresenter_Factory(provider, provider2);
    }

    public static BuyDolDeleteCardPresenter newInstance(RTRApi rTRApi, Rx2ThreadService rx2ThreadService) {
        return new BuyDolDeleteCardPresenter(rTRApi, rx2ThreadService);
    }

    @Override // javax.inject.Provider
    public BuyDolDeleteCardPresenter get() {
        return newInstance((RTRApi) this.f85427a.get(), (Rx2ThreadService) this.f85428b.get());
    }
}