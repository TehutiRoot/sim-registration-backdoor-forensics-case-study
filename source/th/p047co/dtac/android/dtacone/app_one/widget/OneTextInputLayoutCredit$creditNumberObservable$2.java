package th.p047co.dtac.android.dtacone.app_one.widget;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.util.credit_card.CardType;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m28850d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/util/credit_card/CardType;", "kotlin.jvm.PlatformType", "it", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutCredit$creditNumberObservable$2 */
/* loaded from: classes7.dex */
public final class OneTextInputLayoutCredit$creditNumberObservable$2 extends Lambda implements Function1<Throwable, CardType> {
    public static final OneTextInputLayoutCredit$creditNumberObservable$2 INSTANCE = new OneTextInputLayoutCredit$creditNumberObservable$2();

    public OneTextInputLayoutCredit$creditNumberObservable$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CardType invoke(@NotNull Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return CardType.UNKNOWN;
    }
}
