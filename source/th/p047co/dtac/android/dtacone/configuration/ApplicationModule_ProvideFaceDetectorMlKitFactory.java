package th.p047co.dtac.android.dtacone.configuration;

import com.google.mlkit.vision.face.FaceDetector;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.ApplicationModule_ProvideFaceDetectorMlKitFactory */
/* loaded from: classes7.dex */
public final class ApplicationModule_ProvideFaceDetectorMlKitFactory implements Factory<FaceDetector> {

    /* renamed from: a */
    public final ApplicationModule f83104a;

    public ApplicationModule_ProvideFaceDetectorMlKitFactory(ApplicationModule applicationModule) {
        this.f83104a = applicationModule;
    }

    public static ApplicationModule_ProvideFaceDetectorMlKitFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideFaceDetectorMlKitFactory(applicationModule);
    }

    public static FaceDetector provideFaceDetectorMlKit(ApplicationModule applicationModule) {
        return (FaceDetector) Preconditions.checkNotNullFromProvides(applicationModule.provideFaceDetectorMlKit());
    }

    @Override // javax.inject.Provider
    public FaceDetector get() {
        return provideFaceDetectorMlKit(this.f83104a);
    }
}
