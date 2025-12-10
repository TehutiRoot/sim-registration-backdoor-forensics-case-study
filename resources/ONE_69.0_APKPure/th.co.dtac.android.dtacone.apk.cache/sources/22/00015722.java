package th.p047co.dtac.android.dtacone.viewmodel.face_recognition.recognition;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.compressor.CompressImage;
import th.p047co.dtac.android.dtacone.manager.multipart.MultiPartService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.face_recognition.recognition.FaceRecognitionViewModel_Factory */
/* loaded from: classes9.dex */
public final class FaceRecognitionViewModel_Factory implements Factory<FaceRecognitionViewModel> {

    /* renamed from: a */
    public final Provider f105938a;

    /* renamed from: b */
    public final Provider f105939b;

    /* renamed from: c */
    public final Provider f105940c;

    /* renamed from: d */
    public final Provider f105941d;

    /* renamed from: e */
    public final Provider f105942e;

    /* renamed from: f */
    public final Provider f105943f;

    public FaceRecognitionViewModel_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<CompressImage> provider4, Provider<ConfigurationRepository> provider5, Provider<MultiPartService> provider6) {
        this.f105938a = provider;
        this.f105939b = provider2;
        this.f105940c = provider3;
        this.f105941d = provider4;
        this.f105942e = provider5;
        this.f105943f = provider6;
    }

    public static FaceRecognitionViewModel_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<CompressImage> provider4, Provider<ConfigurationRepository> provider5, Provider<MultiPartService> provider6) {
        return new FaceRecognitionViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static FaceRecognitionViewModel newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService, CompressImage compressImage, ConfigurationRepository configurationRepository, MultiPartService multiPartService) {
        return new FaceRecognitionViewModel(rTRApiRx2, rx2ThreadService, serverErrorService, compressImage, configurationRepository, multiPartService);
    }

    @Override // javax.inject.Provider
    public FaceRecognitionViewModel get() {
        return newInstance((RTRApiRx2) this.f105938a.get(), (Rx2ThreadService) this.f105939b.get(), (ServerErrorService) this.f105940c.get(), (CompressImage) this.f105941d.get(), (ConfigurationRepository) this.f105942e.get(), (MultiPartService) this.f105943f.get());
    }
}