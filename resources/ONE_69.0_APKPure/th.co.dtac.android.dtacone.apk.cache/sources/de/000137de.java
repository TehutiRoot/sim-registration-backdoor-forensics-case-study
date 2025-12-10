package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.payment;

import android.text.Editable;
import android.widget.TextView;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;
import th.p047co.dtac.android.dtacone.extension.format.MoneyFormatExtKt;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.payment.OnePostpaidPaymentFragment$initView$4$1 */
/* loaded from: classes10.dex */
public final class OnePostpaidPaymentFragment$initView$4$1 extends Lambda implements Function1<CharSequence, Unit> {
    final /* synthetic */ OnePostpaidPaymentFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidPaymentFragment$initView$4$1(OnePostpaidPaymentFragment onePostpaidPaymentFragment) {
        super(1);
        this.this$0 = onePostpaidPaymentFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
        invoke2(charSequence);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(CharSequence charSequence) {
        OneCustomClearableEditText oneCustomClearableEditText;
        OneCustomClearableEditText oneCustomClearableEditText2;
        OneCustomClearableEditText oneCustomClearableEditText3;
        TextView textView;
        OneCustomClearableEditText oneCustomClearableEditText4;
        OneCustomClearableEditText oneCustomClearableEditText5;
        oneCustomClearableEditText = this.this$0.f94167v;
        OneCustomClearableEditText oneCustomClearableEditText6 = null;
        if (oneCustomClearableEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etCreditCardAmount");
            oneCustomClearableEditText = null;
        }
        Editable text = oneCustomClearableEditText.getText();
        if (text == null || text.length() == 0) {
            oneCustomClearableEditText2 = this.this$0.f94167v;
            if (oneCustomClearableEditText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("etCreditCardAmount");
                oneCustomClearableEditText2 = null;
            }
            Editable text2 = oneCustomClearableEditText2.getText();
            if (text2 == null || text2.length() == 0) {
                oneCustomClearableEditText3 = this.this$0.f94169x;
                if (oneCustomClearableEditText3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("etCashRemainForCombine");
                } else {
                    oneCustomClearableEditText6 = oneCustomClearableEditText3;
                }
                oneCustomClearableEditText6.setText("0");
                return;
            }
            return;
        }
        try {
            textView = this.this$0.f94155j;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvTotalAmount");
                textView = null;
            }
            BigDecimal bigDecimal = new BigDecimal(AbstractC19741eO1.replace$default(textView.getText().toString(), ",", "", false, 4, (Object) null));
            oneCustomClearableEditText4 = this.this$0.f94167v;
            if (oneCustomClearableEditText4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("etCreditCardAmount");
                oneCustomClearableEditText4 = null;
            }
            BigDecimal bigDecimal2 = new BigDecimal(AbstractC19741eO1.replace$default(String.valueOf(oneCustomClearableEditText4.getText()), ",", "", false, 4, (Object) null));
            if (bigDecimal2.compareTo(bigDecimal) != 1) {
                BigDecimal subtract = bigDecimal.subtract(bigDecimal2);
                Intrinsics.checkNotNullExpressionValue(subtract, "subtract(...)");
                oneCustomClearableEditText5 = this.this$0.f94169x;
                if (oneCustomClearableEditText5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("etCashRemainForCombine");
                } else {
                    oneCustomClearableEditText6 = oneCustomClearableEditText5;
                }
                String bigDecimal3 = subtract.toString();
                Intrinsics.checkNotNullExpressionValue(bigDecimal3, "cashRemain.toString()");
                oneCustomClearableEditText6.setText(MoneyFormatExtKt.toMoneyFormatNoFloating(bigDecimal3));
            }
        } catch (Exception unused) {
        }
    }
}