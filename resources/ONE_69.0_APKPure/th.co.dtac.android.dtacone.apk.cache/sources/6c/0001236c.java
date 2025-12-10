package th.p047co.dtac.android.dtacone.presenter.face_detection;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.face.FaceDetection;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.face_detection.FaceDetectionPresenter_Factory */
/* loaded from: classes8.dex */
public final class FaceDetectionPresenter_Factory implements Factory<FaceDetectionPresenter> {

    /* renamed from: a */
    public final Provider f85804a;

    /* renamed from: b */
    public final Provider f85805b;

    /* renamed from: c */
    public final Provider f85806c;

    public FaceDetectionPresenter_Factory(Provider<FaceDetection> provider, Provider<Rx2ThreadService> provider2, Provider<BitmapUtil> provider3) {
        this.f85804a = provider;
        this.f85805b = provider2;
        this.f85806c = provider3;
    }

    public static FaceDetectionPresenter_Factory create(Provider<FaceDetection> provider, Provider<Rx2ThreadService> provider2, Provider<BitmapUtil> provider3) {
        return new FaceDetectionPresenter_Factory(provider, provider2, provider3);
    }

    public static FaceDetectionPresenter newInstance(FaceDetection faceDetection, Rx2ThreadService rx2ThreadService, BitmapUtil bitmapUtil) {
        return new FaceDetectionPresenter(faceDetection, rx2ThreadService, bitmapUtil);
    }

    @Override // javax.inject.Provider
    public FaceDetectionPresenter get() {
        return newInstance((FaceDetection) this.f85804a.get(), (Rx2ThreadService) this.f85805b.get(), (BitmapUtil) this.f85806c.get());
    }
}