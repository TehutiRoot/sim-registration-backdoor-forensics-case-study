package th.p047co.dtac.android.dtacone.configuration;

import com.google.android.gms.vision.face.FaceDetector;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.ApplicationModule_ProvideFaceDetectorFactory */
/* loaded from: classes7.dex */
public final class ApplicationModule_ProvideFaceDetectorFactory implements Factory<FaceDetector> {

    /* renamed from: a */
    public final ApplicationModule f83103a;

    public ApplicationModule_ProvideFaceDetectorFactory(ApplicationModule applicationModule) {
        this.f83103a = applicationModule;
    }

    public static ApplicationModule_ProvideFaceDetectorFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideFaceDetectorFactory(applicationModule);
    }

    public static FaceDetector provideFaceDetector(ApplicationModule applicationModule) {
        return (FaceDetector) Preconditions.checkNotNullFromProvides(applicationModule.provideFaceDetector());
    }

    @Override // javax.inject.Provider
    public FaceDetector get() {
        return provideFaceDetector(this.f83103a);
    }
}
