package th.p047co.dtac.android.dtacone.viewmodel.customerenquiry;

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

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.customerenquiry.CustomerSmartCardPresenter_Factory */
/* loaded from: classes9.dex */
public final class CustomerSmartCardPresenter_Factory implements Factory<CustomerSmartCardPresenter> {

    /* renamed from: a */
    public final Provider f105259a;

    /* renamed from: b */
    public final Provider f105260b;

    /* renamed from: c */
    public final Provider f105261c;

    /* renamed from: d */
    public final Provider f105262d;

    /* renamed from: e */
    public final Provider f105263e;

    /* renamed from: f */
    public final Provider f105264f;

    public CustomerSmartCardPresenter_Factory(Provider<IdCardCommand> provider, Provider<RxThreadService> provider2, Provider<CardReaderService> provider3, Provider<RxBus<Object>> provider4, Provider<BluetoothService> provider5, Provider<TemporaryCache> provider6) {
        this.f105259a = provider;
        this.f105260b = provider2;
        this.f105261c = provider3;
        this.f105262d = provider4;
        this.f105263e = provider5;
        this.f105264f = provider6;
    }

    public static CustomerSmartCardPresenter_Factory create(Provider<IdCardCommand> provider, Provider<RxThreadService> provider2, Provider<CardReaderService> provider3, Provider<RxBus<Object>> provider4, Provider<BluetoothService> provider5, Provider<TemporaryCache> provider6) {
        return new CustomerSmartCardPresenter_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static CustomerSmartCardPresenter newInstance(IdCardCommand idCardCommand, RxThreadService rxThreadService, CardReaderService cardReaderService, RxBus<Object> rxBus, BluetoothService bluetoothService, TemporaryCache temporaryCache) {
        return new CustomerSmartCardPresenter(idCardCommand, rxThreadService, cardReaderService, rxBus, bluetoothService, temporaryCache);
    }

    @Override // javax.inject.Provider
    public CustomerSmartCardPresenter get() {
        return newInstance((IdCardCommand) this.f105259a.get(), (RxThreadService) this.f105260b.get(), (CardReaderService) this.f105261c.get(), (RxBus) this.f105262d.get(), (BluetoothService) this.f105263e.get(), (TemporaryCache) this.f105264f.get());
    }
}