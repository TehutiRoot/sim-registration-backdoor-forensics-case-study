package th.p047co.dtac.android.dtacone.p051rx;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.face.FaceDetection;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.rx.RxFaceDetection_Factory */
/* loaded from: classes8.dex */
public final class RxFaceDetection_Factory implements Factory<RxFaceDetection> {

    /* renamed from: a */
    public final Provider f86994a;

    /* renamed from: b */
    public final Provider f86995b;

    public RxFaceDetection_Factory(Provider<FaceDetection> provider, Provider<Rx2ThreadService> provider2) {
        this.f86994a = provider;
        this.f86995b = provider2;
    }

    public static RxFaceDetection_Factory create(Provider<FaceDetection> provider, Provider<Rx2ThreadService> provider2) {
        return new RxFaceDetection_Factory(provider, provider2);
    }

    public static RxFaceDetection newInstance(FaceDetection faceDetection, Rx2ThreadService rx2ThreadService) {
        return new RxFaceDetection(faceDetection, rx2ThreadService);
    }

    @Override // javax.inject.Provider
    public RxFaceDetection get() {
        return newInstance((FaceDetection) this.f86994a.get(), (Rx2ThreadService) this.f86995b.get());
    }
}