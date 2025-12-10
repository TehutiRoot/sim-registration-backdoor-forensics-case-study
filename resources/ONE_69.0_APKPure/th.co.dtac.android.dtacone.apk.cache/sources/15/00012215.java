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

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* renamed from: th.co.dtac.android.dtacone.presenter.buy_dol.BuyDolConsentPresenter_Factory */
/* loaded from: classes8.dex */
public final class BuyDolConsentPresenter_Factory implements Factory<BuyDolConsentPresenter> {

    /* renamed from: a */
    public final Provider f85419a;

    /* renamed from: b */
    public final Provider f85420b;

    /* renamed from: c */
    public final Provider f85421c;

    /* renamed from: d */
    public final Provider f85422d;

    public BuyDolConsentPresenter_Factory(Provider<RTRApi> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<RtrRepository> provider4) {
        this.f85419a = provider;
        this.f85420b = provider2;
        this.f85421c = provider3;
        this.f85422d = provider4;
    }

    public static BuyDolConsentPresenter_Factory create(Provider<RTRApi> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<RtrRepository> provider4) {
        return new BuyDolConsentPresenter_Factory(provider, provider2, provider3, provider4);
    }

    public static BuyDolConsentPresenter newInstance(RTRApi rTRApi, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService, RtrRepository rtrRepository) {
        return new BuyDolConsentPresenter(rTRApi, rx2ThreadService, serverErrorService, rtrRepository);
    }

    @Override // javax.inject.Provider
    public BuyDolConsentPresenter get() {
        return newInstance((RTRApi) this.f85419a.get(), (Rx2ThreadService) this.f85420b.get(), (ServerErrorService) this.f85421c.get(), (RtrRepository) this.f85422d.get());
    }
}