package th.p047co.dtac.android.dtacone.presenter.updateprepaid;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.updateprepaid.UpdatePrepaidProfileSubmitPresenter_Factory */
/* loaded from: classes8.dex */
public final class UpdatePrepaidProfileSubmitPresenter_Factory implements Factory<UpdatePrepaidProfileSubmitPresenter> {

    /* renamed from: a */
    public final Provider f86717a;

    /* renamed from: b */
    public final Provider f86718b;

    /* renamed from: c */
    public final Provider f86719c;

    public UpdatePrepaidProfileSubmitPresenter_Factory(Provider<RTRApi> provider, Provider<ServerErrorService> provider2, Provider<RxThreadService> provider3) {
        this.f86717a = provider;
        this.f86718b = provider2;
        this.f86719c = provider3;
    }

    public static UpdatePrepaidProfileSubmitPresenter_Factory create(Provider<RTRApi> provider, Provider<ServerErrorService> provider2, Provider<RxThreadService> provider3) {
        return new UpdatePrepaidProfileSubmitPresenter_Factory(provider, provider2, provider3);
    }

    public static UpdatePrepaidProfileSubmitPresenter newInstance(RTRApi rTRApi, ServerErrorService serverErrorService, RxThreadService rxThreadService) {
        return new UpdatePrepaidProfileSubmitPresenter(rTRApi, serverErrorService, rxThreadService);
    }

    @Override // javax.inject.Provider
    public UpdatePrepaidProfileSubmitPresenter get() {
        return newInstance((RTRApi) this.f86717a.get(), (ServerErrorService) this.f86718b.get(), (RxThreadService) this.f86719c.get());
    }
}