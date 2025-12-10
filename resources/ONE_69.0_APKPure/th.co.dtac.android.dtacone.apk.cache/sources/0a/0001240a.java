package th.p047co.dtac.android.dtacone.presenter.multi_sim;

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
/* renamed from: th.co.dtac.android.dtacone.presenter.multi_sim.MrtrPrepaidScanBarcodePresenter_Factory */
/* loaded from: classes8.dex */
public final class MrtrPrepaidScanBarcodePresenter_Factory implements Factory<MrtrPrepaidScanBarcodePresenter> {

    /* renamed from: a */
    public final Provider f86025a;

    /* renamed from: b */
    public final Provider f86026b;

    public MrtrPrepaidScanBarcodePresenter_Factory(Provider<Rx2ThreadService> provider, Provider<BitmapUtil> provider2) {
        this.f86025a = provider;
        this.f86026b = provider2;
    }

    public static MrtrPrepaidScanBarcodePresenter_Factory create(Provider<Rx2ThreadService> provider, Provider<BitmapUtil> provider2) {
        return new MrtrPrepaidScanBarcodePresenter_Factory(provider, provider2);
    }

    public static MrtrPrepaidScanBarcodePresenter newInstance(Rx2ThreadService rx2ThreadService, BitmapUtil bitmapUtil) {
        return new MrtrPrepaidScanBarcodePresenter(rx2ThreadService, bitmapUtil);
    }

    @Override // javax.inject.Provider
    public MrtrPrepaidScanBarcodePresenter get() {
        return newInstance((Rx2ThreadService) this.f86025a.get(), (BitmapUtil) this.f86026b.get());
    }
}