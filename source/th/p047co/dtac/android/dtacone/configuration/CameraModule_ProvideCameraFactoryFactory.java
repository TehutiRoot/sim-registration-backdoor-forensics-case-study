package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import th.p047co.dtac.android.dtacone.view.fragment.take_photo.camera.CameraFactory;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.CameraModule_ProvideCameraFactoryFactory */
/* loaded from: classes7.dex */
public final class CameraModule_ProvideCameraFactoryFactory implements Factory<CameraFactory> {

    /* renamed from: a */
    public final CameraModule f83112a;

    public CameraModule_ProvideCameraFactoryFactory(CameraModule cameraModule) {
        this.f83112a = cameraModule;
    }

    public static CameraModule_ProvideCameraFactoryFactory create(CameraModule cameraModule) {
        return new CameraModule_ProvideCameraFactoryFactory(cameraModule);
    }

    public static CameraFactory provideCameraFactory(CameraModule cameraModule) {
        return (CameraFactory) Preconditions.checkNotNullFromProvides(cameraModule.provideCameraFactory());
    }

    @Override // javax.inject.Provider
    public CameraFactory get() {
        return provideCameraFactory(this.f83112a);
    }
}
