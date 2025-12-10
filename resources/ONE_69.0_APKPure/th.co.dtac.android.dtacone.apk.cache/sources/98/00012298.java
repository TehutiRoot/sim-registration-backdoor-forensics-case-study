package th.p047co.dtac.android.dtacone.presenter.card_reader;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.bus.RxBus;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.card_reader.CardReaderEventPresenter_Factory */
/* loaded from: classes8.dex */
public final class CardReaderEventPresenter_Factory implements Factory<CardReaderEventPresenter> {

    /* renamed from: a */
    public final Provider f85584a;

    /* renamed from: b */
    public final Provider f85585b;

    public CardReaderEventPresenter_Factory(Provider<RxBus<Object>> provider, Provider<RxThreadService> provider2) {
        this.f85584a = provider;
        this.f85585b = provider2;
    }

    public static CardReaderEventPresenter_Factory create(Provider<RxBus<Object>> provider, Provider<RxThreadService> provider2) {
        return new CardReaderEventPresenter_Factory(provider, provider2);
    }

    public static CardReaderEventPresenter newInstance(RxBus<Object> rxBus, RxThreadService rxThreadService) {
        return new CardReaderEventPresenter(rxBus, rxThreadService);
    }

    @Override // javax.inject.Provider
    public CardReaderEventPresenter get() {
        return newInstance((RxBus) this.f85584a.get(), (RxThreadService) this.f85585b.get());
    }
}