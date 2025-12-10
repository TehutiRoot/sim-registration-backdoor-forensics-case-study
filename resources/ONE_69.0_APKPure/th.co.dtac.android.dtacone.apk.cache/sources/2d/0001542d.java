package th.p047co.dtac.android.dtacone.viewmodel.change_sim;

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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.change_sim.ChangeSimVerifyReasonViewModel_Factory */
/* loaded from: classes9.dex */
public final class ChangeSimVerifyReasonViewModel_Factory implements Factory<ChangeSimVerifyReasonViewModel> {

    /* renamed from: a */
    public final Provider f105213a;

    /* renamed from: b */
    public final Provider f105214b;

    /* renamed from: c */
    public final Provider f105215c;

    public ChangeSimVerifyReasonViewModel_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f105213a = provider;
        this.f105214b = provider2;
        this.f105215c = provider3;
    }

    public static ChangeSimVerifyReasonViewModel_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new ChangeSimVerifyReasonViewModel_Factory(provider, provider2, provider3);
    }

    public static ChangeSimVerifyReasonViewModel newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService) {
        return new ChangeSimVerifyReasonViewModel(rTRApiRx2, rx2ThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public ChangeSimVerifyReasonViewModel get() {
        return newInstance((RTRApiRx2) this.f105213a.get(), (Rx2ThreadService) this.f105214b.get(), (ServerErrorService) this.f105215c.get());
    }
}