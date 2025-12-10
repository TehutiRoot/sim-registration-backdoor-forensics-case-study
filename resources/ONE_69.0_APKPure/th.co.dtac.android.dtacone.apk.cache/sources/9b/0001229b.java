package th.p047co.dtac.android.dtacone.presenter.card_reader;

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
/* renamed from: th.co.dtac.android.dtacone.presenter.card_reader.IdCardReaderPresenter_Factory */
/* loaded from: classes8.dex */
public final class IdCardReaderPresenter_Factory implements Factory<IdCardReaderPresenter> {

    /* renamed from: a */
    public final Provider f85594a;

    /* renamed from: b */
    public final Provider f85595b;

    /* renamed from: c */
    public final Provider f85596c;

    /* renamed from: d */
    public final Provider f85597d;

    /* renamed from: e */
    public final Provider f85598e;

    /* renamed from: f */
    public final Provider f85599f;

    /* renamed from: g */
    public final Provider f85600g;

    /* renamed from: h */
    public final Provider f85601h;

    public IdCardReaderPresenter_Factory(Provider<IdCardCommand> provider, Provider<RxThreadService> provider2, Provider<CardReaderService> provider3, Provider<RxBus<Object>> provider4, Provider<BitmapUtil> provider5, Provider<BluetoothService> provider6, Provider<DrawBitmap> provider7, Provider<TemporaryCache> provider8) {
        this.f85594a = provider;
        this.f85595b = provider2;
        this.f85596c = provider3;
        this.f85597d = provider4;
        this.f85598e = provider5;
        this.f85599f = provider6;
        this.f85600g = provider7;
        this.f85601h = provider8;
    }

    public static IdCardReaderPresenter_Factory create(Provider<IdCardCommand> provider, Provider<RxThreadService> provider2, Provider<CardReaderService> provider3, Provider<RxBus<Object>> provider4, Provider<BitmapUtil> provider5, Provider<BluetoothService> provider6, Provider<DrawBitmap> provider7, Provider<TemporaryCache> provider8) {
        return new IdCardReaderPresenter_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static IdCardReaderPresenter newInstance(IdCardCommand idCardCommand, RxThreadService rxThreadService, CardReaderService cardReaderService, RxBus<Object> rxBus, BitmapUtil bitmapUtil, BluetoothService bluetoothService, DrawBitmap drawBitmap, TemporaryCache temporaryCache) {
        return new IdCardReaderPresenter(idCardCommand, rxThreadService, cardReaderService, rxBus, bitmapUtil, bluetoothService, drawBitmap, temporaryCache);
    }

    @Override // javax.inject.Provider
    public IdCardReaderPresenter get() {
        return newInstance((IdCardCommand) this.f85594a.get(), (RxThreadService) this.f85595b.get(), (CardReaderService) this.f85596c.get(), (RxBus) this.f85597d.get(), (BitmapUtil) this.f85598e.get(), (BluetoothService) this.f85599f.get(), (DrawBitmap) this.f85600g.get(), (TemporaryCache) this.f85601h.get());
    }
}