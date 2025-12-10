package th.p047co.dtac.android.dtacone.view.appOne.device_sale.fragment.device_campaign;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.util.validation.OneAdvancePaymentValidate;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutText;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.activity.OneDeviceSaleActivity;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.fragment.OneDeviceSaleSummaryFragment;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.fragment.device_campaign.OneDeviceSaleAdditionalAdvancePaymentFragment$initView$2 */
/* loaded from: classes10.dex */
public final class OneDeviceSaleAdditionalAdvancePaymentFragment$initView$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OneDeviceSaleAdditionalAdvancePaymentFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSaleAdditionalAdvancePaymentFragment$initView$2(OneDeviceSaleAdditionalAdvancePaymentFragment oneDeviceSaleAdditionalAdvancePaymentFragment) {
        super(0);
        this.this$0 = oneDeviceSaleAdditionalAdvancePaymentFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        OneTextInputLayoutText oneTextInputLayoutText;
        OneDeviceSaleActivity m14566m;
        OneDeviceSaleActivity m14566m2;
        try {
            oneTextInputLayoutText = this.this$0.f90427m;
            if (oneTextInputLayoutText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("priceTextInputLayout");
                oneTextInputLayoutText = null;
            }
            String text = oneTextInputLayoutText.getText();
            if (Intrinsics.areEqual(text, "0")) {
                AbstractC19741eO1.replace$default(text, "0", "", false, 4, (Object) null);
            }
            new OneAdvancePaymentValidate().validate(text);
            Float floatOrNull = AbstractC19395cO1.toFloatOrNull(AbstractC19741eO1.replace$default(text, ",", "", false, 4, (Object) null));
            if (floatOrNull != null) {
                this.this$0.getViewModel().storeExtraAdvanceAmount(floatOrNull.floatValue());
            }
            m14566m = this.this$0.m14566m();
            m14566m.clearSignatureNiceNumber();
            m14566m2 = this.this$0.m14566m();
            m14566m2.replaceFragment(OneDeviceSaleSummaryFragment.Companion.newInstance(), null);
        } catch (ValidatedRuleException e) {
            this.this$0.showDialogOne(e.getResId());
        }
    }
}