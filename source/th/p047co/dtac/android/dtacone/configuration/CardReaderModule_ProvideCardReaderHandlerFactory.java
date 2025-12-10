package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.bus.RxBus;
import th.p047co.dtac.android.dtacone.manager.cardreader.CardReaderHandler;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.configuration.CardReaderModule_ProvideCardReaderHandlerFactory */
/* loaded from: classes7.dex */
public final class CardReaderModule_ProvideCardReaderHandlerFactory implements Factory<CardReaderHandler> {

    /* renamed from: a */
    public final CardReaderModule f83113a;

    /* renamed from: b */
    public final Provider f83114b;

    public CardReaderModule_ProvideCardReaderHandlerFactory(CardReaderModule cardReaderModule, Provider<RxBus<Object>> provider) {
        this.f83113a = cardReaderModule;
        this.f83114b = provider;
    }

    public static CardReaderModule_ProvideCardReaderHandlerFactory create(CardReaderModule cardReaderModule, Provider<RxBus<Object>> provider) {
        return new CardReaderModule_ProvideCardReaderHandlerFactory(cardReaderModule, provider);
    }

    public static CardReaderHandler provideCardReaderHandler(CardReaderModule cardReaderModule, RxBus<Object> rxBus) {
        return (CardReaderHandler) Preconditions.checkNotNullFromProvides(cardReaderModule.provideCardReaderHandler(rxBus));
    }

    @Override // javax.inject.Provider
    public CardReaderHandler get() {
        return provideCardReaderHandler(this.f83113a, (RxBus) this.f83114b.get());
    }
}
