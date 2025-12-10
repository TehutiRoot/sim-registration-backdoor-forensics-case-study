package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import th.p047co.dtac.android.dtacone.facedector.FaceDetector;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.FaceDetectorModule_ProvoideFaceDetectorFactory */
/* loaded from: classes7.dex */
public final class FaceDetectorModule_ProvoideFaceDetectorFactory implements Factory<FaceDetector> {

    /* renamed from: a */
    public final FaceDetectorModule f83123a;

    public FaceDetectorModule_ProvoideFaceDetectorFactory(FaceDetectorModule faceDetectorModule) {
        this.f83123a = faceDetectorModule;
    }

    public static FaceDetectorModule_ProvoideFaceDetectorFactory create(FaceDetectorModule faceDetectorModule) {
        return new FaceDetectorModule_ProvoideFaceDetectorFactory(faceDetectorModule);
    }

    public static FaceDetector provoideFaceDetector(FaceDetectorModule faceDetectorModule) {
        return (FaceDetector) Preconditions.checkNotNullFromProvides(faceDetectorModule.provoideFaceDetector());
    }

    @Override // javax.inject.Provider
    public FaceDetector get() {
        return provoideFaceDetector(this.f83123a);
    }
}
