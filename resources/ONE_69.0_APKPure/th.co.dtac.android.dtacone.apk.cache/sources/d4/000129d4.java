package th.p047co.dtac.android.dtacone.view.appOne.buyDol.fragment;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "str", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.fragment.OneBuyDolCreditCardFragment$creditNumberChange$1 */
/* loaded from: classes10.dex */
public final class OneBuyDolCreditCardFragment$creditNumberChange$1 extends Lambda implements Function1<CharSequence, String> {
    public static final OneBuyDolCreditCardFragment$creditNumberChange$1 INSTANCE = new OneBuyDolCreditCardFragment$creditNumberChange$1();

    public OneBuyDolCreditCardFragment$creditNumberChange$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(@NotNull CharSequence str) {
        Intrinsics.checkNotNullParameter(str, "str");
        return PhoneNumberExtKt.toRemoveSpecialChar(str.toString());
    }
}