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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.face_recognition.recognition.FaceRecognitionViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class FaceRecognitionViewModelFactory_Factory implements Factory<FaceRecognitionViewModelFactory> {

    /* renamed from: a */
    public final Provider f105932a;

    /* renamed from: b */
    public final Provider f105933b;

    /* renamed from: c */
    public final Provider f105934c;

    /* renamed from: d */
    public final Provider f105935d;

    /* renamed from: e */
    public final Provider f105936e;

    /* renamed from: f */
    public final Provider f105937f;

    public FaceRecognitionViewModelFactory_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<CompressImage> provider4, Provider<ConfigurationRepository> provider5, Provider<MultiPartService> provider6) {
        this.f105932a = provider;
        this.f105933b = provider2;
        this.f105934c = provider3;
        this.f105935d = provider4;
        this.f105936e = provider5;
        this.f105937f = provider6;
    }

    public static FaceRecognitionViewModelFactory_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<CompressImage> provider4, Provider<ConfigurationRepository> provider5, Provider<MultiPartService> provider6) {
        return new FaceRecognitionViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static FaceRecognitionViewModelFactory newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService, CompressImage compressImage, ConfigurationRepository configurationRepository, MultiPartService multiPartService) {
        return new FaceRecognitionViewModelFactory(rTRApiRx2, rx2ThreadService, serverErrorService, compressImage, configurationRepository, multiPartService);
    }

    @Override // javax.inject.Provider
    public FaceRecognitionViewModelFactory get() {
        return newInstance((RTRApiRx2) this.f105932a.get(), (Rx2ThreadService) this.f105933b.get(), (ServerErrorService) this.f105934c.get(), (CompressImage) this.f105935d.get(), (ConfigurationRepository) this.f105936e.get(), (MultiPartService) this.f105937f.get());
    }
}