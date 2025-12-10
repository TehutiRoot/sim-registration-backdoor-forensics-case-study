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
/* renamed from: th.co.dtac.android.dtacone.presenter.buy_dol.BuyDolListCardPresenter_Factory */
/* loaded from: classes8.dex */
public final class BuyDolListCardPresenter_Factory implements Factory<BuyDolListCardPresenter> {

    /* renamed from: a */
    public final Provider f85449a;

    /* renamed from: b */
    public final Provider f85450b;

    public BuyDolListCardPresenter_Factory(Provider<RTRApi> provider, Provider<Rx2ThreadService> provider2) {
        this.f85449a = provider;
        this.f85450b = provider2;
    }

    public static BuyDolListCardPresenter_Factory create(Provider<RTRApi> provider, Provider<Rx2ThreadService> provider2) {
        return new BuyDolListCardPresenter_Factory(provider, provider2);
    }

    public static BuyDolListCardPresenter newInstance(RTRApi rTRApi, Rx2ThreadService rx2ThreadService) {
        return new BuyDolListCardPresenter(rTRApi, rx2ThreadService);
    }

    @Override // javax.inject.Provider
    public BuyDolListCardPresenter get() {
        return newInstance((RTRApi) this.f85449a.get(), (Rx2ThreadService) this.f85450b.get());
    }
}