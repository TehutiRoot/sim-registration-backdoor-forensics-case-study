package th.p047co.dtac.android.dtacone.configuration;

import com.google.android.gms.vision.face.FaceDetector;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.manager.face.FaceDetection;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.ApplicationModule_ProvideFaceDetectionFactory */
/* loaded from: classes7.dex */
public final class ApplicationModule_ProvideFaceDetectionFactory implements Factory<FaceDetection> {

    /* renamed from: a */
    public final ApplicationModule f83099a;

    /* renamed from: b */
    public final Provider f83100b;

    /* renamed from: c */
    public final Provider f83101c;

    /* renamed from: d */
    public final Provider f83102d;

    public ApplicationModule_ProvideFaceDetectionFactory(ApplicationModule applicationModule, Provider<FaceDetector> provider, Provider<com.google.mlkit.vision.face.FaceDetector> provider2, Provider<PreferencesRepository> provider3) {
        this.f83099a = applicationModule;
        this.f83100b = provider;
        this.f83101c = provider2;
        this.f83102d = provider3;
    }

    public static ApplicationModule_ProvideFaceDetectionFactory create(ApplicationModule applicationModule, Provider<FaceDetector> provider, Provider<com.google.mlkit.vision.face.FaceDetector> provider2, Provider<PreferencesRepository> provider3) {
        return new ApplicationModule_ProvideFaceDetectionFactory(applicationModule, provider, provider2, provider3);
    }

    public static FaceDetection provideFaceDetection(ApplicationModule applicationModule, FaceDetector faceDetector, com.google.mlkit.vision.face.FaceDetector faceDetector2, PreferencesRepository preferencesRepository) {
        return (FaceDetection) Preconditions.checkNotNullFromProvides(applicationModule.provideFaceDetection(faceDetector, faceDetector2, preferencesRepository));
    }

    @Override // javax.inject.Provider
    public FaceDetection get() {
        return provideFaceDetection(this.f83099a, (FaceDetector) this.f83100b.get(), (com.google.mlkit.vision.face.FaceDetector) this.f83101c.get(), (PreferencesRepository) this.f83102d.get());
    }
}
