package th.p047co.dtac.android.dtacone.presenter.buy_dol;

import android.app.Application;
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
/* renamed from: th.co.dtac.android.dtacone.presenter.buy_dol.BuyDolTokenPresenter_Factory */
/* loaded from: classes8.dex */
public final class BuyDolTokenPresenter_Factory implements Factory<BuyDolTokenPresenter> {

    /* renamed from: a */
    public final Provider f85488a;

    /* renamed from: b */
    public final Provider f85489b;

    /* renamed from: c */
    public final Provider f85490c;

    /* renamed from: d */
    public final Provider f85491d;

    public BuyDolTokenPresenter_Factory(Provider<Rx2ThreadService> provider, Provider<ServerErrorService> provider2, Provider<Application> provider3, Provider<RTRApi> provider4) {
        this.f85488a = provider;
        this.f85489b = provider2;
        this.f85490c = provider3;
        this.f85491d = provider4;
    }

    public static BuyDolTokenPresenter_Factory create(Provider<Rx2ThreadService> provider, Provider<ServerErrorService> provider2, Provider<Application> provider3, Provider<RTRApi> provider4) {
        return new BuyDolTokenPresenter_Factory(provider, provider2, provider3, provider4);
    }

    public static BuyDolTokenPresenter newInstance(Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService, Application application, RTRApi rTRApi) {
        return new BuyDolTokenPresenter(rx2ThreadService, serverErrorService, application, rTRApi);
    }

    @Override // javax.inject.Provider
    public BuyDolTokenPresenter get() {
        return newInstance((Rx2ThreadService) this.f85488a.get(), (ServerErrorService) this.f85489b.get(), (Application) this.f85490c.get(), (RTRApi) this.f85491d.get());
    }
}