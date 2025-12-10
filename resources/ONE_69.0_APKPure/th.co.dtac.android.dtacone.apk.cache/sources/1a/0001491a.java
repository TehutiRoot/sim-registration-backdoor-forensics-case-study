package th.p047co.dtac.android.dtacone.view.fragment.buy_dol;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.buy_dol.BuyDolCreditCardFragment$cvvObservable$1 */
/* loaded from: classes9.dex */
public final class BuyDolCreditCardFragment$cvvObservable$1 extends Lambda implements Function1<CharSequence, String> {
    public static final BuyDolCreditCardFragment$cvvObservable$1 INSTANCE = new BuyDolCreditCardFragment$cvvObservable$1();

    public BuyDolCreditCardFragment$cvvObservable$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(@NotNull CharSequence it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return StringsKt__StringsKt.trim(it.toString()).toString();
    }
}