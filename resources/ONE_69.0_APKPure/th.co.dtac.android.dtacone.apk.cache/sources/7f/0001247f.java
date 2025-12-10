package th.p047co.dtac.android.dtacone.presenter.prepaid;

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
/* renamed from: th.co.dtac.android.dtacone.presenter.prepaid.PrepaidScanBarcodePresenter_Factory */
/* loaded from: classes8.dex */
public final class PrepaidScanBarcodePresenter_Factory implements Factory<PrepaidScanBarcodePresenter> {

    /* renamed from: a */
    public final Provider f86202a;

    /* renamed from: b */
    public final Provider f86203b;

    /* renamed from: c */
    public final Provider f86204c;

    /* renamed from: d */
    public final Provider f86205d;

    /* renamed from: e */
    public final Provider f86206e;

    public PrepaidScanBarcodePresenter_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<BitmapUtil> provider4, Provider<CardReaderService> provider5) {
        this.f86202a = provider;
        this.f86203b = provider2;
        this.f86204c = provider3;
        this.f86205d = provider4;
        this.f86206e = provider5;
    }

    public static PrepaidScanBarcodePresenter_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<BitmapUtil> provider4, Provider<CardReaderService> provider5) {
        return new PrepaidScanBarcodePresenter_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static PrepaidScanBarcodePresenter newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService, BitmapUtil bitmapUtil, CardReaderService cardReaderService) {
        return new PrepaidScanBarcodePresenter(rTRApiRx2, rx2ThreadService, serverErrorService, bitmapUtil, cardReaderService);
    }

    @Override // javax.inject.Provider
    public PrepaidScanBarcodePresenter get() {
        return newInstance((RTRApiRx2) this.f86202a.get(), (Rx2ThreadService) this.f86203b.get(), (ServerErrorService) this.f86204c.get(), (BitmapUtil) this.f86205d.get(), (CardReaderService) this.f86206e.get());
    }
}