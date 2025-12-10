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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineTakePhotoViewModel_Factory */
/* loaded from: classes10.dex */
public final class OneRegisterTrueOnlineTakePhotoViewModel_Factory implements Factory<OneRegisterTrueOnlineTakePhotoViewModel> {

    /* renamed from: a */
    public final Provider f98159a;

    /* renamed from: b */
    public final Provider f98160b;

    /* renamed from: c */
    public final Provider f98161c;

    public OneRegisterTrueOnlineTakePhotoViewModel_Factory(Provider<FaceDetection> provider, Provider<BitmapUtil> provider2, Provider<PreferencesRepository> provider3) {
        this.f98159a = provider;
        this.f98160b = provider2;
        this.f98161c = provider3;
    }

    public static OneRegisterTrueOnlineTakePhotoViewModel_Factory create(Provider<FaceDetection> provider, Provider<BitmapUtil> provider2, Provider<PreferencesRepository> provider3) {
        return new OneRegisterTrueOnlineTakePhotoViewModel_Factory(provider, provider2, provider3);
    }

    public static OneRegisterTrueOnlineTakePhotoViewModel newInstance(FaceDetection faceDetection, BitmapUtil bitmapUtil, PreferencesRepository preferencesRepository) {
        return new OneRegisterTrueOnlineTakePhotoViewModel(faceDetection, bitmapUtil, preferencesRepository);
    }

    @Override // javax.inject.Provider
    public OneRegisterTrueOnlineTakePhotoViewModel get() {
        return newInstance((FaceDetection) this.f98159a.get(), (BitmapUtil) this.f98160b.get(), (PreferencesRepository) this.f98161c.get());
    }
}