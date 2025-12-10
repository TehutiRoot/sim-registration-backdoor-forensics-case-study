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
/* renamed from: th.co.dtac.android.dtacone.presenter.change_sim.ChangeSimGetRegisterCardTypePresenter_Factory */
/* loaded from: classes8.dex */
public final class ChangeSimGetRegisterCardTypePresenter_Factory implements Factory<ChangeSimGetRegisterCardTypePresenter> {

    /* renamed from: a */
    public final Provider f85647a;

    /* renamed from: b */
    public final Provider f85648b;

    /* renamed from: c */
    public final Provider f85649c;

    public ChangeSimGetRegisterCardTypePresenter_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        this.f85647a = provider;
        this.f85648b = provider2;
        this.f85649c = provider3;
    }

    public static ChangeSimGetRegisterCardTypePresenter_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3) {
        return new ChangeSimGetRegisterCardTypePresenter_Factory(provider, provider2, provider3);
    }

    public static ChangeSimGetRegisterCardTypePresenter newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService) {
        return new ChangeSimGetRegisterCardTypePresenter(rTRApiRx2, rx2ThreadService, serverErrorService);
    }

    @Override // javax.inject.Provider
    public ChangeSimGetRegisterCardTypePresenter get() {
        return newInstance((RTRApiRx2) this.f85647a.get(), (Rx2ThreadService) this.f85648b.get(), (ServerErrorService) this.f85649c.get());
    }
}