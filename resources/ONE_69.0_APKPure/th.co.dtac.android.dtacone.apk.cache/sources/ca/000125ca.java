package th.p047co.dtac.android.dtacone.presenter.updateprepaid;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.util.FileUtil;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.updateprepaid.UpdatePrepaidCameraPresenter_Factory */
/* loaded from: classes8.dex */
public final class UpdatePrepaidCameraPresenter_Factory implements Factory<UpdatePrepaidCameraPresenter> {

    /* renamed from: a */
    public final Provider f86707a;

    /* renamed from: b */
    public final Provider f86708b;

    /* renamed from: c */
    public final Provider f86709c;

    /* renamed from: d */
    public final Provider f86710d;

    public UpdatePrepaidCameraPresenter_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<FileUtil> provider4) {
        this.f86707a = provider;
        this.f86708b = provider2;
        this.f86709c = provider3;
        this.f86710d = provider4;
    }

    public static UpdatePrepaidCameraPresenter_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<FileUtil> provider4) {
        return new UpdatePrepaidCameraPresenter_Factory(provider, provider2, provider3, provider4);
    }

    public static UpdatePrepaidCameraPresenter newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService, FileUtil fileUtil) {
        return new UpdatePrepaidCameraPresenter(rTRApiRx2, rx2ThreadService, serverErrorService, fileUtil);
    }

    @Override // javax.inject.Provider
    public UpdatePrepaidCameraPresenter get() {
        return newInstance((RTRApiRx2) this.f86707a.get(), (Rx2ThreadService) this.f86708b.get(), (ServerErrorService) this.f86709c.get(), (FileUtil) this.f86710d.get());
    }
}