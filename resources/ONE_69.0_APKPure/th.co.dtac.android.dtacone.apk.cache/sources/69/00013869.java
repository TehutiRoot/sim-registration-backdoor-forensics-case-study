package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.presenter;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.bus.RxBus;
import th.p047co.dtac.android.dtacone.manager.cardreader.CardReaderService;
import th.p047co.dtac.android.dtacone.manager.cardreader.IdCardCommand;
import th.p047co.dtac.android.dtacone.manager.cardreader.bluetooth.BluetoothService;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.util.bitmap.draw.DrawBitmap;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.presenter.OnePostpaidIdCardReaderPresenter_Factory */
/* loaded from: classes10.dex */
public final class OnePostpaidIdCardReaderPresenter_Factory implements Factory<OnePostpaidIdCardReaderPresenter> {

    /* renamed from: a */
    public final Provider f94467a;

    /* renamed from: b */
    public final Provider f94468b;

    /* renamed from: c */
    public final Provider f94469c;

    /* renamed from: d */
    public final Provider f94470d;

    /* renamed from: e */
    public final Provider f94471e;

    /* renamed from: f */
    public final Provider f94472f;

    /* renamed from: g */
    public final Provider f94473g;

    public OnePostpaidIdCardReaderPresenter_Factory(Provider<IdCardCommand> provider, Provider<RxThreadService> provider2, Provider<CardReaderService> provider3, Provider<RxBus<Object>> provider4, Provider<BitmapUtil> provider5, Provider<BluetoothService> provider6, Provider<DrawBitmap> provider7) {
        this.f94467a = provider;
        this.f94468b = provider2;
        this.f94469c = provider3;
        this.f94470d = provider4;
        this.f94471e = provider5;
        this.f94472f = provider6;
        this.f94473g = provider7;
    }

    public static OnePostpaidIdCardReaderPresenter_Factory create(Provider<IdCardCommand> provider, Provider<RxThreadService> provider2, Provider<CardReaderService> provider3, Provider<RxBus<Object>> provider4, Provider<BitmapUtil> provider5, Provider<BluetoothService> provider6, Provider<DrawBitmap> provider7) {
        return new OnePostpaidIdCardReaderPresenter_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static OnePostpaidIdCardReaderPresenter newInstance(IdCardCommand idCardCommand, RxThreadService rxThreadService, CardReaderService cardReaderService, RxBus<Object> rxBus, BitmapUtil bitmapUtil, BluetoothService bluetoothService, DrawBitmap drawBitmap) {
        return new OnePostpaidIdCardReaderPresenter(idCardCommand, rxThreadService, cardReaderService, rxBus, bitmapUtil, bluetoothService, drawBitmap);
    }

    @Override // javax.inject.Provider
    public OnePostpaidIdCardReaderPresenter get() {
        return newInstance((IdCardCommand) this.f94467a.get(), (RxThreadService) this.f94468b.get(), (CardReaderService) this.f94469c.get(), (RxBus) this.f94470d.get(), (BitmapUtil) this.f94471e.get(), (BluetoothService) this.f94472f.get(), (DrawBitmap) this.f94473g.get());
    }
}