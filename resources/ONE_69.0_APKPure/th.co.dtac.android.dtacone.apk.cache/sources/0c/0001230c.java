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
/* renamed from: th.co.dtac.android.dtacone.presenter.dtacAtHome.CheckMapPresenter_Factory */
/* loaded from: classes8.dex */
public final class CheckMapPresenter_Factory implements Factory<CheckMapPresenter> {

    /* renamed from: a */
    public final Provider f85729a;

    /* renamed from: b */
    public final Provider f85730b;

    /* renamed from: c */
    public final Provider f85731c;

    public CheckMapPresenter_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f85729a = provider;
        this.f85730b = provider2;
        this.f85731c = provider3;
    }

    public static CheckMapPresenter_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new CheckMapPresenter_Factory(provider, provider2, provider3);
    }

    public static CheckMapPresenter newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService) {
        return new CheckMapPresenter(rTRApiRx2, rx2ThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public CheckMapPresenter get() {
        return newInstance((RTRApiRx2) this.f85729a.get(), (Rx2ThreadService) this.f85730b.get(), (ServerErrorService) this.f85731c.get());
    }
}