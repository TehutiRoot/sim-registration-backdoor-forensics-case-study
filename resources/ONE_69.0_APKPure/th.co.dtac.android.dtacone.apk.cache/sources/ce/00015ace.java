package th.p047co.dtac.android.dtacone.viewmodel.self_update;

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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.self_update.RtrProfileViewModel_Factory */
/* loaded from: classes9.dex */
public final class RtrProfileViewModel_Factory implements Factory<RtrProfileViewModel> {

    /* renamed from: a */
    public final Provider f107048a;

    /* renamed from: b */
    public final Provider f107049b;

    /* renamed from: c */
    public final Provider f107050c;

    public RtrProfileViewModel_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f107048a = provider;
        this.f107049b = provider2;
        this.f107050c = provider3;
    }

    public static RtrProfileViewModel_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new RtrProfileViewModel_Factory(provider, provider2, provider3);
    }

    public static RtrProfileViewModel newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService) {
        return new RtrProfileViewModel(rTRApiRx2, rx2ThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public RtrProfileViewModel get() {
        return newInstance((RTRApiRx2) this.f107048a.get(), (Rx2ThreadService) this.f107049b.get(), (ServerErrorService) this.f107050c.get());
    }
}