package th.p047co.dtac.android.dtacone.presenter.prepaid;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.prepaid.OCRPresenter_Factory */
/* loaded from: classes8.dex */
public final class OCRPresenter_Factory implements Factory<OCRPresenter> {

    /* renamed from: a */
    public final Provider f86166a;

    /* renamed from: b */
    public final Provider f86167b;

    public OCRPresenter_Factory(Provider<BitmapUtil> provider, Provider<Rx2ThreadService> provider2) {
        this.f86166a = provider;
        this.f86167b = provider2;
    }

    public static OCRPresenter_Factory create(Provider<BitmapUtil> provider, Provider<Rx2ThreadService> provider2) {
        return new OCRPresenter_Factory(provider, provider2);
    }

    public static OCRPresenter newInstance(BitmapUtil bitmapUtil, Rx2ThreadService rx2ThreadService) {
        return new OCRPresenter(bitmapUtil, rx2ThreadService);
    }

    @Override // javax.inject.Provider
    public OCRPresenter get() {
        return newInstance((BitmapUtil) this.f86166a.get(), (Rx2ThreadService) this.f86167b.get());
    }
}