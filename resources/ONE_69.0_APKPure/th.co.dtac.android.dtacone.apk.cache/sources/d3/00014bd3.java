package th.p047co.dtac.android.dtacone.view.fragment.device_sale.payment;

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
/* renamed from: th.co.dtac.android.dtacone.view.fragment.device_sale.payment.DeviceSalePaymentInfoFragment$initView$7$1 */
/* loaded from: classes9.dex */
public final class DeviceSalePaymentInfoFragment$initView$7$1 extends Lambda implements Function1<CharSequence, Unit> {
    final /* synthetic */ DeviceSalePaymentInfoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSalePaymentInfoFragment$initView$7$1(DeviceSalePaymentInfoFragment deviceSalePaymentInfoFragment) {
        super(1);
        this.this$0 = deviceSalePaymentInfoFragment;
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
        EditText editText4;
        EditText editText5;
        EditText editText6;
        TextView textView = this.this$0.f100242k;
        EditText editText7 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvTotalAmount");
            textView = null;
        }
        BigDecimal bigDecimal = new BigDecimal(AbstractC19741eO1.replace$default(textView.getText().toString(), ",", "", false, 4, (Object) null));
        editText = this.this$0.f100249r;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etCreditCardAmount");
            editText = null;
        }
        Editable text = editText.getText();
        if (text == null || text.length() == 0) {
            editText2 = this.this$0.f100249r;
            if (editText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("etCreditCardAmount");
                editText2 = null;
            }
            Editable text2 = editText2.getText();
            if (text2 == null || text2.length() == 0) {
                editText3 = this.this$0.f100251t;
                if (editText3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("etCashRemainForCombine");
                } else {
                    editText7 = editText3;
                }
                String bigDecimal2 = bigDecimal.toString();
                Intrinsics.checkNotNullExpressionValue(bigDecimal2, "totalAmount.toString()");
                editText7.setText(MoneyFormatExtKt.toMoneyFormatNoFloating(bigDecimal2));
                return;
            }
            return;
        }
        try {
            editText4 = this.this$0.f100249r;
            if (editText4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("etCreditCardAmount");
                editText4 = null;
            }
            BigDecimal bigDecimal3 = new BigDecimal(AbstractC19741eO1.replace$default(editText4.getText().toString(), ",", "", false, 4, (Object) null));
            if (bigDecimal3.compareTo(bigDecimal) == 1) {
                editText5 = this.this$0.f100251t;
                if (editText5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("etCashRemainForCombine");
                } else {
                    editText7 = editText5;
                }
                editText7.setText("0");
                return;
            }
            BigDecimal subtract = bigDecimal.subtract(bigDecimal3);
            Intrinsics.checkNotNullExpressionValue(subtract, "subtract(...)");
            editText6 = this.this$0.f100251t;
            if (editText6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("etCashRemainForCombine");
            } else {
                editText7 = editText6;
            }
            String bigDecimal4 = subtract.toString();
            Intrinsics.checkNotNullExpressionValue(bigDecimal4, "cashRemain.toString()");
            editText7.setText(MoneyFormatExtKt.toMoneyFormatNoFloating(bigDecimal4));
        } catch (Exception unused) {
        }
    }
}