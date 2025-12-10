package th.p047co.dtac.android.dtacone.viewmodel.take_photo;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.facedector.FaceDetector;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.take_photo.FaceRecognitionViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class FaceRecognitionViewModelFactory_Factory implements Factory<FaceRecognitionViewModelFactory> {

    /* renamed from: a */
    public final Provider f107065a;

    public FaceRecognitionViewModelFactory_Factory(Provider<FaceDetector> provider) {
        this.f107065a = provider;
    }

    public static FaceRecognitionViewModelFactory_Factory create(Provider<FaceDetector> provider) {
        return new FaceRecognitionViewModelFactory_Factory(provider);
    }

    public static FaceRecognitionViewModelFactory newInstance(FaceDetector faceDetector) {
        return new FaceRecognitionViewModelFactory(faceDetector);
    }

    @Override // javax.inject.Provider
    public FaceRecognitionViewModelFactory get() {
        return newInstance((FaceDetector) this.f107065a.get());
    }
}