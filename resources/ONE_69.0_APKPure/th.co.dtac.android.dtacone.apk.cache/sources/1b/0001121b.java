package th.p047co.dtac.android.dtacone.app_one.widget;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.util.credit_card.CardType;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "cardType", "Lth/co/dtac/android/dtacone/util/credit_card/CardType;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutCredit$validationFrom$1 */
/* loaded from: classes7.dex */
public final class OneTextInputLayoutCredit$validationFrom$1 extends Lambda implements Function1<CardType, Unit> {
    final /* synthetic */ OneTextInputLayoutCredit this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTextInputLayoutCredit$validationFrom$1(OneTextInputLayoutCredit oneTextInputLayoutCredit) {
        super(1);
        this.this$0 = oneTextInputLayoutCredit;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CardType cardType) {
        invoke2(cardType);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(CardType cardType) {
        OneTextInputLayoutCredit oneTextInputLayoutCredit = this.this$0;
        Intrinsics.checkNotNullExpressionValue(cardType, "cardType");
        oneTextInputLayoutCredit.m20051h(cardType);
    }
}