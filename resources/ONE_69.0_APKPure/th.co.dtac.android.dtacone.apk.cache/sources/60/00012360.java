package th.p047co.dtac.android.dtacone.presenter.face;

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
/* renamed from: th.co.dtac.android.dtacone.presenter.face.FaceRecognitionComparePresenter_Factory */
/* loaded from: classes8.dex */
public final class FaceRecognitionComparePresenter_Factory implements Factory<FaceRecognitionComparePresenter> {

    /* renamed from: a */
    public final Provider f85790a;

    /* renamed from: b */
    public final Provider f85791b;

    /* renamed from: c */
    public final Provider f85792c;

    /* renamed from: d */
    public final Provider f85793d;

    public FaceRecognitionComparePresenter_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<MultiPartService> provider4) {
        this.f85790a = provider;
        this.f85791b = provider2;
        this.f85792c = provider3;
        this.f85793d = provider4;
    }

    public static FaceRecognitionComparePresenter_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<MultiPartService> provider4) {
        return new FaceRecognitionComparePresenter_Factory(provider, provider2, provider3, provider4);
    }

    public static FaceRecognitionComparePresenter newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService, MultiPartService multiPartService) {
        return new FaceRecognitionComparePresenter(rTRApiRx2, rx2ThreadService, serverErrorService, multiPartService);
    }

    @Override // javax.inject.Provider
    public FaceRecognitionComparePresenter get() {
        return newInstance((RTRApiRx2) this.f85790a.get(), (Rx2ThreadService) this.f85791b.get(), (ServerErrorService) this.f85792c.get(), (MultiPartService) this.f85793d.get());
    }
}