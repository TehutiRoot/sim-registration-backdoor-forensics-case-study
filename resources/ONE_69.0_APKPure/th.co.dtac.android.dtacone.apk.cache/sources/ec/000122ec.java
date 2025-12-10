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
/* renamed from: th.co.dtac.android.dtacone.presenter.change_sim.ChangeSimVerifyWriteSimPresenter_Factory */
/* loaded from: classes8.dex */
public final class ChangeSimVerifyWriteSimPresenter_Factory implements Factory<ChangeSimVerifyWriteSimPresenter> {

    /* renamed from: a */
    public final Provider f85694a;

    /* renamed from: b */
    public final Provider f85695b;

    /* renamed from: c */
    public final Provider f85696c;

    public ChangeSimVerifyWriteSimPresenter_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f85694a = provider;
        this.f85695b = provider2;
        this.f85696c = provider3;
    }

    public static ChangeSimVerifyWriteSimPresenter_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new ChangeSimVerifyWriteSimPresenter_Factory(provider, provider2, provider3);
    }

    public static ChangeSimVerifyWriteSimPresenter newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService) {
        return new ChangeSimVerifyWriteSimPresenter(rTRApiRx2, rx2ThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public ChangeSimVerifyWriteSimPresenter get() {
        return newInstance((RTRApiRx2) this.f85694a.get(), (Rx2ThreadService) this.f85695b.get(), (ServerErrorService) this.f85696c.get());
    }
}