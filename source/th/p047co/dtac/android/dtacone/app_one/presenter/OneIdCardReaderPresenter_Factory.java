package th.p047co.dtac.android.dtacone.app_one.presenter;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
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
/* renamed from: th.co.dtac.android.dtacone.app_one.presenter.OneIdCardReaderPresenter_Factory */
/* loaded from: classes7.dex */
public final class OneIdCardReaderPresenter_Factory implements Factory<OneIdCardReaderPresenter> {

    /* renamed from: a */
    public final Provider f82314a;

    /* renamed from: b */
    public final Provider f82315b;

    /* renamed from: c */
    public final Provider f82316c;

    /* renamed from: d */
    public final Provider f82317d;

    /* renamed from: e */
    public final Provider f82318e;

    /* renamed from: f */
    public final Provider f82319f;

    /* renamed from: g */
    public final Provider f82320g;

    /* renamed from: h */
    public final Provider f82321h;

    public OneIdCardReaderPresenter_Factory(Provider<IdCardCommand> provider, Provider<RxThreadService> provider2, Provider<CardReaderService> provider3, Provider<RxBus<Object>> provider4, Provider<BitmapUtil> provider5, Provider<BluetoothService> provider6, Provider<DrawBitmap> provider7, Provider<TemporaryCache> provider8) {
        this.f82314a = provider;
        this.f82315b = provider2;
        this.f82316c = provider3;
        this.f82317d = provider4;
        this.f82318e = provider5;
        this.f82319f = provider6;
        this.f82320g = provider7;
        this.f82321h = provider8;
    }

    public static OneIdCardReaderPresenter_Factory create(Provider<IdCardCommand> provider, Provider<RxThreadService> provider2, Provider<CardReaderService> provider3, Provider<RxBus<Object>> provider4, Provider<BitmapUtil> provider5, Provider<BluetoothService> provider6, Provider<DrawBitmap> provider7, Provider<TemporaryCache> provider8) {
        return new OneIdCardReaderPresenter_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static OneIdCardReaderPresenter newInstance(IdCardCommand idCardCommand, RxThreadService rxThreadService, CardReaderService cardReaderService, RxBus<Object> rxBus, BitmapUtil bitmapUtil, BluetoothService bluetoothService, DrawBitmap drawBitmap, TemporaryCache temporaryCache) {
        return new OneIdCardReaderPresenter(idCardCommand, rxThreadService, cardReaderService, rxBus, bitmapUtil, bluetoothService, drawBitmap, temporaryCache);
    }

    @Override // javax.inject.Provider
    public OneIdCardReaderPresenter get() {
        return newInstance((IdCardCommand) this.f82314a.get(), (RxThreadService) this.f82315b.get(), (CardReaderService) this.f82316c.get(), (RxBus) this.f82317d.get(), (BitmapUtil) this.f82318e.get(), (BluetoothService) this.f82319f.get(), (DrawBitmap) this.f82320g.get(), (TemporaryCache) this.f82321h.get());
    }
}
