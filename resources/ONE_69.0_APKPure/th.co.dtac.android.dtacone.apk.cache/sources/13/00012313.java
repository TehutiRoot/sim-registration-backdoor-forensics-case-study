package th.p047co.dtac.android.dtacone.presenter.dtacAtHome;

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
/* renamed from: th.co.dtac.android.dtacone.presenter.dtacAtHome.DtacAtHomeRequestOtpPresenter_Factory */
/* loaded from: classes8.dex */
public final class DtacAtHomeRequestOtpPresenter_Factory implements Factory<DtacAtHomeRequestOtpPresenter> {

    /* renamed from: a */
    public final Provider f85738a;

    /* renamed from: b */
    public final Provider f85739b;

    /* renamed from: c */
    public final Provider f85740c;

    public DtacAtHomeRequestOtpPresenter_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f85738a = provider;
        this.f85739b = provider2;
        this.f85740c = provider3;
    }

    public static DtacAtHomeRequestOtpPresenter_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new DtacAtHomeRequestOtpPresenter_Factory(provider, provider2, provider3);
    }

    public static DtacAtHomeRequestOtpPresenter newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService) {
        return new DtacAtHomeRequestOtpPresenter(rTRApiRx2, rx2ThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public DtacAtHomeRequestOtpPresenter get() {
        return newInstance((RTRApiRx2) this.f85738a.get(), (Rx2ThreadService) this.f85739b.get(), (ServerErrorService) this.f85740c.get());
    }
}