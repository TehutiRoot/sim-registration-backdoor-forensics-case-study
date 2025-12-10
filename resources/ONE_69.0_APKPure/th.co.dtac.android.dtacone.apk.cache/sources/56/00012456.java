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
/* renamed from: th.co.dtac.android.dtacone.presenter.prepaid.MrtrScanBarcodePresenter_Factory */
/* loaded from: classes8.dex */
public final class MrtrScanBarcodePresenter_Factory implements Factory<MrtrScanBarcodePresenter> {

    /* renamed from: a */
    public final Provider f86151a;

    /* renamed from: b */
    public final Provider f86152b;

    /* renamed from: c */
    public final Provider f86153c;

    /* renamed from: d */
    public final Provider f86154d;

    /* renamed from: e */
    public final Provider f86155e;

    public MrtrScanBarcodePresenter_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<BitmapUtil> provider4, Provider<CardReaderService> provider5) {
        this.f86151a = provider;
        this.f86152b = provider2;
        this.f86153c = provider3;
        this.f86154d = provider4;
        this.f86155e = provider5;
    }

    public static MrtrScanBarcodePresenter_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<BitmapUtil> provider4, Provider<CardReaderService> provider5) {
        return new MrtrScanBarcodePresenter_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static MrtrScanBarcodePresenter newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService, BitmapUtil bitmapUtil, CardReaderService cardReaderService) {
        return new MrtrScanBarcodePresenter(rTRApiRx2, rx2ThreadService, serverErrorService, bitmapUtil, cardReaderService);
    }

    @Override // javax.inject.Provider
    public MrtrScanBarcodePresenter get() {
        return newInstance((RTRApiRx2) this.f86151a.get(), (Rx2ThreadService) this.f86152b.get(), (ServerErrorService) this.f86153c.get(), (BitmapUtil) this.f86154d.get(), (CardReaderService) this.f86155e.get());
    }
}