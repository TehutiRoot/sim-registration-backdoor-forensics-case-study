package th.p047co.dtac.android.dtacone.presenter.face;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.p051rx.RxBitmap;
import th.p047co.dtac.android.dtacone.p051rx.RxFaceDetection;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.face.FacePresenter_Factory */
/* loaded from: classes8.dex */
public final class FacePresenter_Factory implements Factory<FacePresenter> {

    /* renamed from: a */
    public final Provider f85777a;

    /* renamed from: b */
    public final Provider f85778b;

    /* renamed from: c */
    public final Provider f85779c;

    /* renamed from: d */
    public final Provider f85780d;

    /* renamed from: e */
    public final Provider f85781e;

    public FacePresenter_Factory(Provider<BitmapUtil> provider, Provider<RxFaceDetection> provider2, Provider<PreferencesRepository> provider3, Provider<RxBitmap> provider4, Provider<Rx2ThreadService> provider5) {
        this.f85777a = provider;
        this.f85778b = provider2;
        this.f85779c = provider3;
        this.f85780d = provider4;
        this.f85781e = provider5;
    }

    public static FacePresenter_Factory create(Provider<BitmapUtil> provider, Provider<RxFaceDetection> provider2, Provider<PreferencesRepository> provider3, Provider<RxBitmap> provider4, Provider<Rx2ThreadService> provider5) {
        return new FacePresenter_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static FacePresenter newInstance(BitmapUtil bitmapUtil, RxFaceDetection rxFaceDetection, PreferencesRepository preferencesRepository, RxBitmap rxBitmap, Rx2ThreadService rx2ThreadService) {
        return new FacePresenter(bitmapUtil, rxFaceDetection, preferencesRepository, rxBitmap, rx2ThreadService);
    }

    @Override // javax.inject.Provider
    public FacePresenter get() {
        return newInstance((BitmapUtil) this.f85777a.get(), (RxFaceDetection) this.f85778b.get(), (PreferencesRepository) this.f85779c.get(), (RxBitmap) this.f85780d.get(), (Rx2ThreadService) this.f85781e.get());
    }
}