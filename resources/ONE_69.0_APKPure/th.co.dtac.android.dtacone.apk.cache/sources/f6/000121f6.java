package th.p047co.dtac.android.dtacone.presenter.buy_dol;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.manager.service.UdidService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* renamed from: th.co.dtac.android.dtacone.presenter.buy_dol.BuyDolAcceptConsentPresenter_Factory */
/* loaded from: classes8.dex */
public final class BuyDolAcceptConsentPresenter_Factory implements Factory<BuyDolAcceptConsentPresenter> {

    /* renamed from: a */
    public final Provider f85374a;

    /* renamed from: b */
    public final Provider f85375b;

    /* renamed from: c */
    public final Provider f85376c;

    /* renamed from: d */
    public final Provider f85377d;

    /* renamed from: e */
    public final Provider f85378e;

    public BuyDolAcceptConsentPresenter_Factory(Provider<RTRApi> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<UdidService> provider4, Provider<RtrRepository> provider5) {
        this.f85374a = provider;
        this.f85375b = provider2;
        this.f85376c = provider3;
        this.f85377d = provider4;
        this.f85378e = provider5;
    }

    public static BuyDolAcceptConsentPresenter_Factory create(Provider<RTRApi> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<UdidService> provider4, Provider<RtrRepository> provider5) {
        return new BuyDolAcceptConsentPresenter_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static BuyDolAcceptConsentPresenter newInstance(RTRApi rTRApi, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService, UdidService udidService, RtrRepository rtrRepository) {
        return new BuyDolAcceptConsentPresenter(rTRApi, rx2ThreadService, serverErrorService, udidService, rtrRepository);
    }

    @Override // javax.inject.Provider
    public BuyDolAcceptConsentPresenter get() {
        return newInstance((RTRApi) this.f85374a.get(), (Rx2ThreadService) this.f85375b.get(), (ServerErrorService) this.f85376c.get(), (UdidService) this.f85377d.get(), (RtrRepository) this.f85378e.get());
    }
}