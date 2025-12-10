package th.p047co.dtac.android.dtacone.presenter.prepaid;

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
import th.p047co.dtac.android.dtacone.util.FileUtil;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.util.bitmap.draw.DrawBitmap;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.prepaid.PrepaidSmartCardPresenter_Factory */
/* loaded from: classes8.dex */
public final class PrepaidSmartCardPresenter_Factory implements Factory<PrepaidSmartCardPresenter> {

    /* renamed from: a */
    public final Provider f86216a;

    /* renamed from: b */
    public final Provider f86217b;

    /* renamed from: c */
    public final Provider f86218c;

    /* renamed from: d */
    public final Provider f86219d;

    /* renamed from: e */
    public final Provider f86220e;

    /* renamed from: f */
    public final Provider f86221f;

    /* renamed from: g */
    public final Provider f86222g;

    /* renamed from: h */
    public final Provider f86223h;

    /* renamed from: i */
    public final Provider f86224i;

    public PrepaidSmartCardPresenter_Factory(Provider<IdCardCommand> provider, Provider<RxThreadService> provider2, Provider<CardReaderService> provider3, Provider<RxBus<Object>> provider4, Provider<DrawBitmap> provider5, Provider<BitmapUtil> provider6, Provider<BluetoothService> provider7, Provider<FileUtil> provider8, Provider<TemporaryCache> provider9) {
        this.f86216a = provider;
        this.f86217b = provider2;
        this.f86218c = provider3;
        this.f86219d = provider4;
        this.f86220e = provider5;
        this.f86221f = provider6;
        this.f86222g = provider7;
        this.f86223h = provider8;
        this.f86224i = provider9;
    }

    public static PrepaidSmartCardPresenter_Factory create(Provider<IdCardCommand> provider, Provider<RxThreadService> provider2, Provider<CardReaderService> provider3, Provider<RxBus<Object>> provider4, Provider<DrawBitmap> provider5, Provider<BitmapUtil> provider6, Provider<BluetoothService> provider7, Provider<FileUtil> provider8, Provider<TemporaryCache> provider9) {
        return new PrepaidSmartCardPresenter_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static PrepaidSmartCardPresenter newInstance(IdCardCommand idCardCommand, RxThreadService rxThreadService, CardReaderService cardReaderService, RxBus<Object> rxBus, DrawBitmap drawBitmap, BitmapUtil bitmapUtil, BluetoothService bluetoothService, FileUtil fileUtil, TemporaryCache temporaryCache) {
        return new PrepaidSmartCardPresenter(idCardCommand, rxThreadService, cardReaderService, rxBus, drawBitmap, bitmapUtil, bluetoothService, fileUtil, temporaryCache);
    }

    @Override // javax.inject.Provider
    public PrepaidSmartCardPresenter get() {
        return newInstance((IdCardCommand) this.f86216a.get(), (RxThreadService) this.f86217b.get(), (CardReaderService) this.f86218c.get(), (RxBus) this.f86219d.get(), (DrawBitmap) this.f86220e.get(), (BitmapUtil) this.f86221f.get(), (BluetoothService) this.f86222g.get(), (FileUtil) this.f86223h.get(), (TemporaryCache) this.f86224i.get());
    }
}