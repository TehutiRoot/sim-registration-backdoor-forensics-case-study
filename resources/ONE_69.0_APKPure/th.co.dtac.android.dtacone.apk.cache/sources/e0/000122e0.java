package th.p047co.dtac.android.dtacone.presenter.change_sim;

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
/* renamed from: th.co.dtac.android.dtacone.presenter.change_sim.ChangeSimVerifyReasonPresenter_Factory */
/* loaded from: classes8.dex */
public final class ChangeSimVerifyReasonPresenter_Factory implements Factory<ChangeSimVerifyReasonPresenter> {

    /* renamed from: a */
    public final Provider f85683a;

    /* renamed from: b */
    public final Provider f85684b;

    /* renamed from: c */
    public final Provider f85685c;

    public ChangeSimVerifyReasonPresenter_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f85683a = provider;
        this.f85684b = provider2;
        this.f85685c = provider3;
    }

    public static ChangeSimVerifyReasonPresenter_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new ChangeSimVerifyReasonPresenter_Factory(provider, provider2, provider3);
    }

    public static ChangeSimVerifyReasonPresenter newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService) {
        return new ChangeSimVerifyReasonPresenter(rTRApiRx2, rx2ThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public ChangeSimVerifyReasonPresenter get() {
        return newInstance((RTRApiRx2) this.f85683a.get(), (Rx2ThreadService) this.f85684b.get(), (ServerErrorService) this.f85685c.get());
    }
}