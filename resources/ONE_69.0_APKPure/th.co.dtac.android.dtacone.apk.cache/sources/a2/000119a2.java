package th.p047co.dtac.android.dtacone.manager.face;

import com.google.android.gms.vision.face.FaceDetector;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.manager.face.FaceDetection_Factory */
/* loaded from: classes7.dex */
public final class FaceDetection_Factory implements Factory<FaceDetection> {

    /* renamed from: a */
    public final Provider f85041a;

    /* renamed from: b */
    public final Provider f85042b;

    /* renamed from: c */
    public final Provider f85043c;

    public FaceDetection_Factory(Provider<FaceDetector> provider, Provider<com.google.mlkit.vision.face.FaceDetector> provider2, Provider<PreferencesRepository> provider3) {
        this.f85041a = provider;
        this.f85042b = provider2;
        this.f85043c = provider3;
    }

    public static FaceDetection_Factory create(Provider<FaceDetector> provider, Provider<com.google.mlkit.vision.face.FaceDetector> provider2, Provider<PreferencesRepository> provider3) {
        return new FaceDetection_Factory(provider, provider2, provider3);
    }

    public static FaceDetection newInstance(FaceDetector faceDetector, com.google.mlkit.vision.face.FaceDetector faceDetector2, PreferencesRepository preferencesRepository) {
        return new FaceDetection(faceDetector, faceDetector2, preferencesRepository);
    }

    @Override // javax.inject.Provider
    public FaceDetection get() {
        return newInstance((FaceDetector) this.f85041a.get(), (com.google.mlkit.vision.face.FaceDetector) this.f85042b.get(), (PreferencesRepository) this.f85043c.get());
    }
}