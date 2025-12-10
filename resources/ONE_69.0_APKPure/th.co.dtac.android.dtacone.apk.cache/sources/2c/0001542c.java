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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.change_sim.ChangeSimVerifyReasonViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class ChangeSimVerifyReasonViewModelFactory_Factory implements Factory<ChangeSimVerifyReasonViewModelFactory> {

    /* renamed from: a */
    public final Provider f105210a;

    /* renamed from: b */
    public final Provider f105211b;

    /* renamed from: c */
    public final Provider f105212c;

    public ChangeSimVerifyReasonViewModelFactory_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f105210a = provider;
        this.f105211b = provider2;
        this.f105212c = provider3;
    }

    public static ChangeSimVerifyReasonViewModelFactory_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new ChangeSimVerifyReasonViewModelFactory_Factory(provider, provider2, provider3);
    }

    public static ChangeSimVerifyReasonViewModelFactory newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService) {
        return new ChangeSimVerifyReasonViewModelFactory(rTRApiRx2, rx2ThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public ChangeSimVerifyReasonViewModelFactory get() {
        return newInstance((RTRApiRx2) this.f105210a.get(), (Rx2ThreadService) this.f105211b.get(), (ServerErrorService) this.f105212c.get());
    }
}