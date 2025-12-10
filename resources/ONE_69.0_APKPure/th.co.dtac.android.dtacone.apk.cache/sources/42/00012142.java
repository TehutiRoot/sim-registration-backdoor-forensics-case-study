package th.p047co.dtac.android.dtacone.presenter.activate_dol;

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
/* renamed from: th.co.dtac.android.dtacone.presenter.activate_dol.DolRequestOtpPresenter_Factory */
/* loaded from: classes8.dex */
public final class DolRequestOtpPresenter_Factory implements Factory<DolRequestOtpPresenter> {

    /* renamed from: a */
    public final Provider f85223a;

    /* renamed from: b */
    public final Provider f85224b;

    /* renamed from: c */
    public final Provider f85225c;

    public DolRequestOtpPresenter_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f85223a = provider;
        this.f85224b = provider2;
        this.f85225c = provider3;
    }

    public static DolRequestOtpPresenter_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new DolRequestOtpPresenter_Factory(provider, provider2, provider3);
    }

    public static DolRequestOtpPresenter newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService) {
        return new DolRequestOtpPresenter(rTRApiRx2, rx2ThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public DolRequestOtpPresenter get() {
        return newInstance((RTRApiRx2) this.f85223a.get(), (Rx2ThreadService) this.f85224b.get(), (ServerErrorService) this.f85225c.get());
    }
}