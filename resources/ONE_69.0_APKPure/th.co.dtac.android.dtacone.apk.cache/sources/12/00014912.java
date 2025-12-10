package th.p047co.dtac.android.dtacone.view.fragment.buy_dol;

import androidx.appcompat.widget.AppCompatCheckBox;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.databinding.FragmentBuyDolCreditcardListBinding;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.buy_dol.BuyDolCreditCardFragment$applyValidation$7 */
/* loaded from: classes9.dex */
public final class BuyDolCreditCardFragment$applyValidation$7 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ BuyDolCreditCardFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyDolCreditCardFragment$applyValidation$7(BuyDolCreditCardFragment buyDolCreditCardFragment) {
        super(1);
        this.this$0 = buyDolCreditCardFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke2(bool);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Boolean it) {
        FragmentBuyDolCreditcardListBinding m8974p0;
        if (Intrinsics.areEqual(it, Boolean.FALSE)) {
            m8974p0 = this.this$0.m8974p0();
            AppCompatCheckBox appCompatCheckBox = m8974p0.checkboxSaveCredit;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            appCompatCheckBox.setChecked(it.booleanValue());
        }
    }
}