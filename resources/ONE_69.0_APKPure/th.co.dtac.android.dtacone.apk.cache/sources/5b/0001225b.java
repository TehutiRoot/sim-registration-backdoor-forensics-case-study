package th.p047co.dtac.android.dtacone.presenter.buy_dol;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.buy_dol.BuyDolVerifyOtpPresenter_Factory */
/* loaded from: classes8.dex */
public final class BuyDolVerifyOtpPresenter_Factory implements Factory<BuyDolVerifyOtpPresenter> {

    /* renamed from: a */
    public final Provider f85507a;

    /* renamed from: b */
    public final Provider f85508b;

    /* renamed from: c */
    public final Provider f85509c;

    /* renamed from: d */
    public final Provider f85510d;

    public BuyDolVerifyOtpPresenter_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<TemporaryCache> provider4) {
        this.f85507a = provider;
        this.f85508b = provider2;
        this.f85509c = provider3;
        this.f85510d = provider4;
    }

    public static BuyDolVerifyOtpPresenter_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<TemporaryCache> provider4) {
        return new BuyDolVerifyOtpPresenter_Factory(provider, provider2, provider3, provider4);
    }

    public static BuyDolVerifyOtpPresenter newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService, TemporaryCache temporaryCache) {
        return new BuyDolVerifyOtpPresenter(rTRApiRx2, rx2ThreadService, serverErrorService, temporaryCache);
    }

    @Override // javax.inject.Provider
    public BuyDolVerifyOtpPresenter get() {
        return newInstance((RTRApiRx2) this.f85507a.get(), (Rx2ThreadService) this.f85508b.get(), (ServerErrorService) this.f85509c.get(), (TemporaryCache) this.f85510d.get());
    }
}