package th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.manager.face.FaceDetection;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineTakePhotoViewModelFactory_Factory */
/* loaded from: classes10.dex */
public final class OneRegisterTrueOnlineTakePhotoViewModelFactory_Factory implements Factory<OneRegisterTrueOnlineTakePhotoViewModelFactory> {

    /* renamed from: a */
    public final Provider f98156a;

    /* renamed from: b */
    public final Provider f98157b;

    /* renamed from: c */
    public final Provider f98158c;

    public OneRegisterTrueOnlineTakePhotoViewModelFactory_Factory(Provider<FaceDetection> provider, Provider<BitmapUtil> provider2, Provider<PreferencesRepository> provider3) {
        this.f98156a = provider;
        this.f98157b = provider2;
        this.f98158c = provider3;
    }

    public static OneRegisterTrueOnlineTakePhotoViewModelFactory_Factory create(Provider<FaceDetection> provider, Provider<BitmapUtil> provider2, Provider<PreferencesRepository> provider3) {
        return new OneRegisterTrueOnlineTakePhotoViewModelFactory_Factory(provider, provider2, provider3);
    }

    public static OneRegisterTrueOnlineTakePhotoViewModelFactory newInstance(FaceDetection faceDetection, BitmapUtil bitmapUtil, PreferencesRepository preferencesRepository) {
        return new OneRegisterTrueOnlineTakePhotoViewModelFactory(faceDetection, bitmapUtil, preferencesRepository);
    }

    @Override // javax.inject.Provider
    public OneRegisterTrueOnlineTakePhotoViewModelFactory get() {
        return newInstance((FaceDetection) this.f98156a.get(), (BitmapUtil) this.f98157b.get(), (PreferencesRepository) this.f98158c.get());
    }
}