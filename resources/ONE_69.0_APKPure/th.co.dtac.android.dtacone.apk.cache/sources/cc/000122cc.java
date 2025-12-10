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
/* renamed from: th.co.dtac.android.dtacone.presenter.change_sim.ChangeSimReadConcentPresenter_Factory */
/* loaded from: classes8.dex */
public final class ChangeSimReadConcentPresenter_Factory implements Factory<ChangeSimReadConcentPresenter> {

    /* renamed from: a */
    public final Provider f85656a;

    /* renamed from: b */
    public final Provider f85657b;

    /* renamed from: c */
    public final Provider f85658c;

    public ChangeSimReadConcentPresenter_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f85656a = provider;
        this.f85657b = provider2;
        this.f85658c = provider3;
    }

    public static ChangeSimReadConcentPresenter_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new ChangeSimReadConcentPresenter_Factory(provider, provider2, provider3);
    }

    public static ChangeSimReadConcentPresenter newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService) {
        return new ChangeSimReadConcentPresenter(rTRApiRx2, rx2ThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public ChangeSimReadConcentPresenter get() {
        return newInstance((RTRApiRx2) this.f85656a.get(), (Rx2ThreadService) this.f85657b.get(), (ServerErrorService) this.f85658c.get());
    }
}