package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.util.validation.creditCard.OneCreditCardNumberValidate;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutCredit;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.activity.OnePostpaidRegistrationActivity;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company.OnePostpaidCampaignCreditFragment$initView$1 */
/* loaded from: classes10.dex */
public final class OnePostpaidCampaignCreditFragment$initView$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OnePostpaidCampaignCreditFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidCampaignCreditFragment$initView$1(OnePostpaidCampaignCreditFragment onePostpaidCampaignCreditFragment) {
        super(0);
        this.this$0 = onePostpaidCampaignCreditFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        OneTextInputLayoutCredit oneTextInputLayoutCredit;
        OnePostpaidRegistrationActivity m12025m;
        try {
            oneTextInputLayoutCredit = this.this$0.f94220m;
            if (oneTextInputLayoutCredit == null) {
                Intrinsics.throwUninitializedPropertyAccessException("creditInputLayout");
                oneTextInputLayoutCredit = null;
            }
            new OneCreditCardNumberValidate().validate(oneTextInputLayoutCredit.getText());
            m12025m = this.this$0.m12025m();
            m12025m.replaceFragment(OnePostpaidCampaignListFragment.Companion.newInstance(), OnePostpaidCampaignListFragment.TAG);
        } catch (ValidatedRuleException e) {
            this.this$0.showDialogOne(e.getResId());
        }
    }
}