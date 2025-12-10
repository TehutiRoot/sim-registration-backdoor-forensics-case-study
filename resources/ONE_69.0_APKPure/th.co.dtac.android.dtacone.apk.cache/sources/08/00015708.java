package th.p047co.dtac.android.dtacone.viewmodel.face_recognition.detection;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.p051rx.RxFaceDetection;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.face_recognition.detection.FaceDetectionViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class FaceDetectionViewModelFactory_Factory implements Factory<FaceDetectionViewModelFactory> {

    /* renamed from: a */
    public final Provider f105909a;

    /* renamed from: b */
    public final Provider f105910b;

    /* renamed from: c */
    public final Provider f105911c;

    public FaceDetectionViewModelFactory_Factory(Provider<RxFaceDetection> provider, Provider<PreferencesRepository> provider2, Provider<Rx2ThreadService> provider3) {
        this.f105909a = provider;
        this.f105910b = provider2;
        this.f105911c = provider3;
    }

    public static FaceDetectionViewModelFactory_Factory create(Provider<RxFaceDetection> provider, Provider<PreferencesRepository> provider2, Provider<Rx2ThreadService> provider3) {
        return new FaceDetectionViewModelFactory_Factory(provider, provider2, provider3);
    }

    public static FaceDetectionViewModelFactory newInstance(RxFaceDetection rxFaceDetection, PreferencesRepository preferencesRepository, Rx2ThreadService rx2ThreadService) {
        return new FaceDetectionViewModelFactory(rxFaceDetection, preferencesRepository, rx2ThreadService);
    }

    @Override // javax.inject.Provider
    public FaceDetectionViewModelFactory get() {
        return newInstance((RxFaceDetection) this.f105909a.get(), (PreferencesRepository) this.f105910b.get(), (Rx2ThreadService) this.f105911c.get());
    }
}