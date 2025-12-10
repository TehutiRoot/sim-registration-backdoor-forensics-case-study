package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.util.validation.OneAdvancePaymentValidate;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutText;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.activity.OnePostpaidRegistrationActivity;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.mail.OnePostpaidMailingFragment;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company.OnePostpaidAdditionalAdvancePaymentTrueFragment$initView$1 */
/* loaded from: classes10.dex */
public final class OnePostpaidAdditionalAdvancePaymentTrueFragment$initView$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OnePostpaidAdditionalAdvancePaymentTrueFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidAdditionalAdvancePaymentTrueFragment$initView$1(OnePostpaidAdditionalAdvancePaymentTrueFragment onePostpaidAdditionalAdvancePaymentTrueFragment) {
        super(0);
        this.this$0 = onePostpaidAdditionalAdvancePaymentTrueFragment;
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
        OnePostpaidRegistrationActivity m12027m;
        try {
            oneTextInputLayoutText = this.this$0.f94206m;
            if (oneTextInputLayoutText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("priceTextInputLayout");
                oneTextInputLayoutText = null;
            }
            new OneAdvancePaymentValidate().validate(oneTextInputLayoutText.getText());
            m12027m = this.this$0.m12027m();
            m12027m.replaceFragment(OnePostpaidTrueProtectFragment.Companion.newInstance(), OnePostpaidMailingFragment.class.getName());
        } catch (ValidatedRuleException e) {
            this.this$0.showDialogOne(e.getResId());
        }
    }
}