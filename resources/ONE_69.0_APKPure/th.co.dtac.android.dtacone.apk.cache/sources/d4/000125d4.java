package th.p047co.dtac.android.dtacone.presenter.updateprepaid;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.multipart.MultiPartService;
import th.p047co.dtac.android.dtacone.manager.service.RTRApi;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.updateprepaid.UpdatePrepaidUploadImagePresenter_Factory */
/* loaded from: classes8.dex */
public final class UpdatePrepaidUploadImagePresenter_Factory implements Factory<UpdatePrepaidUploadImagePresenter> {

    /* renamed from: a */
    public final Provider f86726a;

    /* renamed from: b */
    public final Provider f86727b;

    /* renamed from: c */
    public final Provider f86728c;

    public UpdatePrepaidUploadImagePresenter_Factory(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<MultiPartService> provider3) {
        this.f86726a = provider;
        this.f86727b = provider2;
        this.f86728c = provider3;
    }

    public static UpdatePrepaidUploadImagePresenter_Factory create(Provider<RTRApi> provider, Provider<RxThreadService> provider2, Provider<MultiPartService> provider3) {
        return new UpdatePrepaidUploadImagePresenter_Factory(provider, provider2, provider3);
    }

    public static UpdatePrepaidUploadImagePresenter newInstance(RTRApi rTRApi, RxThreadService rxThreadService, MultiPartService multiPartService) {
        return new UpdatePrepaidUploadImagePresenter(rTRApi, rxThreadService, multiPartService);
    }

    @Override // javax.inject.Provider
    public UpdatePrepaidUploadImagePresenter get() {
        return newInstance((RTRApi) this.f86726a.get(), (RxThreadService) this.f86727b.get(), (MultiPartService) this.f86728c.get());
    }
}