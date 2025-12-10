package th.p047co.dtac.android.dtacone.view.fragment.eSIM.payment;

import android.text.Editable;
import android.widget.EditText;
import android.widget.TextView;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.extension.format.MoneyFormatExtKt;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.eSIM.payment.ESimPaymentFragment$initView$4$1 */
/* loaded from: classes9.dex */
public final class ESimPaymentFragment$initView$4$1 extends Lambda implements Function1<CharSequence, Unit> {
    final /* synthetic */ ESimPaymentFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ESimPaymentFragment$initView$4$1(ESimPaymentFragment eSimPaymentFragment) {
        super(1);
        this.this$0 = eSimPaymentFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
        invoke2(charSequence);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(CharSequence charSequence) {
        EditText editText;
        EditText editText2;
        EditText editText3;
        TextView textView;
        TextView textView2;
        EditText editText4;
        EditText editText5;
        editText = this.this$0.f100829r;
        EditText editText6 = null;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etCreditCardAmount");
            editText = null;
        }
        Editable text = editText.getText();
        if (text == null || text.length() == 0) {
            editText2 = this.this$0.f100829r;
            if (editText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("etCreditCardAmount");
                editText2 = null;
            }
            Editable text2 = editText2.getText();
            if (text2 == null || text2.length() == 0) {
                editText3 = this.this$0.f100831t;
                if (editText3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("etCashRemainForCombine");
                    editText3 = null;
                }
                textView = this.this$0.f100820i;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvTotalAmount");
                } else {
                    editText6 = textView;
                }
                editText3.setText(editText6.getText());
                return;
            }
            return;
        }
        textView2 = this.this$0.f100820i;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvTotalAmount");
            textView2 = null;
        }
        BigDecimal bigDecimal = new BigDecimal(AbstractC19741eO1.replace$default(textView2.getText().toString(), ",", "", false, 4, (Object) null));
        editText4 = this.this$0.f100829r;
        if (editText4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etCreditCardAmount");
            editText4 = null;
        }
        BigDecimal bigDecimal2 = new BigDecimal(AbstractC19741eO1.replace$default(editText4.getText().toString(), ",", "", false, 4, (Object) null));
        if (bigDecimal2.compareTo(bigDecimal) != 1) {
            BigDecimal subtract = bigDecimal.subtract(bigDecimal2);
            Intrinsics.checkNotNullExpressionValue(subtract, "subtract(...)");
            editText5 = this.this$0.f100831t;
            if (editText5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("etCashRemainForCombine");
            } else {
                editText6 = editText5;
            }
            String bigDecimal3 = subtract.toString();
            Intrinsics.checkNotNullExpressionValue(bigDecimal3, "cashRemain.toString()");
            editText6.setText(MoneyFormatExtKt.toMoneyFormatNoFloating(bigDecimal3));
        }
    }
}