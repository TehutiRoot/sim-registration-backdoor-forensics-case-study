package th.p047co.dtac.android.dtacone.presenter.sim_card;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.bus.RxBus;
import th.p047co.dtac.android.dtacone.manager.cardreader.CardReaderService;
import th.p047co.dtac.android.dtacone.manager.cardreader.SimCardCommand;
import th.p047co.dtac.android.dtacone.manager.cardreader.bluetooth.BluetoothService;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.sim_card.SimCardReaderPresenter_Factory */
/* loaded from: classes8.dex */
public final class SimCardReaderPresenter_Factory implements Factory<SimCardReaderPresenter> {

    /* renamed from: a */
    public final Provider f86534a;

    /* renamed from: b */
    public final Provider f86535b;

    /* renamed from: c */
    public final Provider f86536c;

    /* renamed from: d */
    public final Provider f86537d;

    /* renamed from: e */
    public final Provider f86538e;

    public SimCardReaderPresenter_Factory(Provider<SimCardCommand> provider, Provider<RxThreadService> provider2, Provider<CardReaderService> provider3, Provider<RxBus<Object>> provider4, Provider<BluetoothService> provider5) {
        this.f86534a = provider;
        this.f86535b = provider2;
        this.f86536c = provider3;
        this.f86537d = provider4;
        this.f86538e = provider5;
    }

    public static SimCardReaderPresenter_Factory create(Provider<SimCardCommand> provider, Provider<RxThreadService> provider2, Provider<CardReaderService> provider3, Provider<RxBus<Object>> provider4, Provider<BluetoothService> provider5) {
        return new SimCardReaderPresenter_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static SimCardReaderPresenter newInstance(SimCardCommand simCardCommand, RxThreadService rxThreadService, CardReaderService cardReaderService, RxBus<Object> rxBus, BluetoothService bluetoothService) {
        return new SimCardReaderPresenter(simCardCommand, rxThreadService, cardReaderService, rxBus, bluetoothService);
    }

    @Override // javax.inject.Provider
    public SimCardReaderPresenter get() {
        return newInstance((SimCardCommand) this.f86534a.get(), (RxThreadService) this.f86535b.get(), (CardReaderService) this.f86536c.get(), (RxBus) this.f86537d.get(), (BluetoothService) this.f86538e.get());
    }
}