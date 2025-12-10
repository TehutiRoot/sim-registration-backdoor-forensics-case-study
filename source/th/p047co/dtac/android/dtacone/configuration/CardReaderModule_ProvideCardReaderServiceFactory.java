package th.p047co.dtac.android.dtacone.configuration;

import android.app.Application;
import android.hardware.usb.UsbManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.manager.bus.RxBus;
import th.p047co.dtac.android.dtacone.manager.cardreader.CardReaderHandler;
import th.p047co.dtac.android.dtacone.manager.cardreader.CardReaderService;
import th.p047co.dtac.android.dtacone.manager.cardreader.bluetooth.BluetoothService;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.CardReaderModule_ProvideCardReaderServiceFactory */
/* loaded from: classes7.dex */
public final class CardReaderModule_ProvideCardReaderServiceFactory implements Factory<CardReaderService> {

    /* renamed from: a */
    public final CardReaderModule f83115a;

    /* renamed from: b */
    public final Provider f83116b;

    /* renamed from: c */
    public final Provider f83117c;

    /* renamed from: d */
    public final Provider f83118d;

    /* renamed from: e */
    public final Provider f83119e;

    /* renamed from: f */
    public final Provider f83120f;

    /* renamed from: g */
    public final Provider f83121g;

    /* renamed from: h */
    public final Provider f83122h;

    public CardReaderModule_ProvideCardReaderServiceFactory(CardReaderModule cardReaderModule, Provider<UsbManager> provider, Provider<CardReaderHandler> provider2, Provider<RxBus<Object>> provider3, Provider<RxThreadService> provider4, Provider<Application> provider5, Provider<BluetoothService> provider6, Provider<TemporaryCache> provider7) {
        this.f83115a = cardReaderModule;
        this.f83116b = provider;
        this.f83117c = provider2;
        this.f83118d = provider3;
        this.f83119e = provider4;
        this.f83120f = provider5;
        this.f83121g = provider6;
        this.f83122h = provider7;
    }

    public static CardReaderModule_ProvideCardReaderServiceFactory create(CardReaderModule cardReaderModule, Provider<UsbManager> provider, Provider<CardReaderHandler> provider2, Provider<RxBus<Object>> provider3, Provider<RxThreadService> provider4, Provider<Application> provider5, Provider<BluetoothService> provider6, Provider<TemporaryCache> provider7) {
        return new CardReaderModule_ProvideCardReaderServiceFactory(cardReaderModule, provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static CardReaderService provideCardReaderService(CardReaderModule cardReaderModule, UsbManager usbManager, CardReaderHandler cardReaderHandler, RxBus<Object> rxBus, RxThreadService rxThreadService, Application application, BluetoothService bluetoothService, TemporaryCache temporaryCache) {
        return (CardReaderService) Preconditions.checkNotNullFromProvides(cardReaderModule.provideCardReaderService(usbManager, cardReaderHandler, rxBus, rxThreadService, application, bluetoothService, temporaryCache));
    }

    @Override // javax.inject.Provider
    public CardReaderService get() {
        return provideCardReaderService(this.f83115a, (UsbManager) this.f83116b.get(), (CardReaderHandler) this.f83117c.get(), (RxBus) this.f83118d.get(), (RxThreadService) this.f83119e.get(), (Application) this.f83120f.get(), (BluetoothService) this.f83121g.get(), (TemporaryCache) this.f83122h.get());
    }
}
