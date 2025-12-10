package th.p047co.dtac.android.dtacone.presenter.change_sim;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.multipart.MultiPartService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.change_sim.ChangeSimConfirmSimPresenter_Factory */
/* loaded from: classes8.dex */
public final class ChangeSimConfirmSimPresenter_Factory implements Factory<ChangeSimConfirmSimPresenter> {

    /* renamed from: a */
    public final Provider f85637a;

    /* renamed from: b */
    public final Provider f85638b;

    /* renamed from: c */
    public final Provider f85639c;

    /* renamed from: d */
    public final Provider f85640d;

    public ChangeSimConfirmSimPresenter_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<MultiPartService> provider4) {
        this.f85637a = provider;
        this.f85638b = provider2;
        this.f85639c = provider3;
        this.f85640d = provider4;
    }

    public static ChangeSimConfirmSimPresenter_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<MultiPartService> provider4) {
        return new ChangeSimConfirmSimPresenter_Factory(provider, provider2, provider3, provider4);
    }

    public static ChangeSimConfirmSimPresenter newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService, MultiPartService multiPartService) {
        return new ChangeSimConfirmSimPresenter(rTRApiRx2, rx2ThreadService, serverErrorService, multiPartService);
    }

    @Override // javax.inject.Provider
    public ChangeSimConfirmSimPresenter get() {
        return newInstance((RTRApiRx2) this.f85637a.get(), (Rx2ThreadService) this.f85638b.get(), (ServerErrorService) this.f85639c.get(), (MultiPartService) this.f85640d.get());
    }
}