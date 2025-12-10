package th.p047co.dtac.android.dtacone.presenter.buy_dol;

import co.omise.android.models.Card;
import co.omise.android.models.Token;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.buy_dol.token.CardToken;
import th.p047co.dtac.android.dtacone.model.buy_dol.token.TokenResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/buy_dol/token/TokenResponse;", "kotlin.jvm.PlatformType", "it", "Lco/omise/android/models/Token;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.buy_dol.BuyDolTokenPresenter$getTokenObservable$2 */
/* loaded from: classes8.dex */
public final class BuyDolTokenPresenter$getTokenObservable$2 extends Lambda implements Function1<Token, TokenResponse> {
    public static final BuyDolTokenPresenter$getTokenObservable$2 INSTANCE = new BuyDolTokenPresenter$getTokenObservable$2();

    public BuyDolTokenPresenter$getTokenObservable$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final TokenResponse invoke(@NotNull Token it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Card card = it.getCard();
        return new TokenResponse(it.getId(), card != null ? new CardToken(card.getId(), card.getFinancing(), card.getLastDigits(), card.getBrand(), Integer.valueOf(card.getExpirationMonth()), Integer.valueOf(card.getExpirationYear()), card.getFingerprint(), card.getName(), Boolean.valueOf(card.getSecurityCodeCheck()), null, 512, null) : null);
    }
}