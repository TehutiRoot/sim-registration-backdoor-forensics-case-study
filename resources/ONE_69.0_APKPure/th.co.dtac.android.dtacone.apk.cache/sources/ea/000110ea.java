package th.p047co.dtac.android.dtacone.app_one.presenter;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.cardreader.CardReaderService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.app_one.presenter.OnePrepaidScanBarcodePresenter_Factory */
/* loaded from: classes7.dex */
public final class OnePrepaidScanBarcodePresenter_Factory implements Factory<OnePrepaidScanBarcodePresenter> {

    /* renamed from: a */
    public final Provider f82421a;

    /* renamed from: b */
    public final Provider f82422b;

    /* renamed from: c */
    public final Provider f82423c;

    /* renamed from: d */
    public final Provider f82424d;

    /* renamed from: e */
    public final Provider f82425e;

    public OnePrepaidScanBarcodePresenter_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<BitmapUtil> provider4, Provider<CardReaderService> provider5) {
        this.f82421a = provider;
        this.f82422b = provider2;
        this.f82423c = provider3;
        this.f82424d = provider4;
        this.f82425e = provider5;
    }

    public static OnePrepaidScanBarcodePresenter_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<BitmapUtil> provider4, Provider<CardReaderService> provider5) {
        return new OnePrepaidScanBarcodePresenter_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static OnePrepaidScanBarcodePresenter newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService, BitmapUtil bitmapUtil, CardReaderService cardReaderService) {
        return new OnePrepaidScanBarcodePresenter(rTRApiRx2, rx2ThreadService, serverErrorService, bitmapUtil, cardReaderService);
    }

    @Override // javax.inject.Provider
    public OnePrepaidScanBarcodePresenter get() {
        return newInstance((RTRApiRx2) this.f82421a.get(), (Rx2ThreadService) this.f82422b.get(), (ServerErrorService) this.f82423c.get(), (BitmapUtil) this.f82424d.get(), (CardReaderService) this.f82425e.get());
    }
}