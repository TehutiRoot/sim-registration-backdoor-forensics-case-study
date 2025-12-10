package th.p047co.dtac.android.dtacone.util.validation.price;

import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.util.validation.ValidationRule;

/* renamed from: th.co.dtac.android.dtacone.util.validation.price.PriceEmptyRule */
/* loaded from: classes8.dex */
public class PriceEmptyRule implements ValidationRule<Integer> {
    @Override // th.p047co.dtac.android.dtacone.util.validation.ValidationRule
    public void validate(Integer num) {
        if (num == null) {
            throw new ValidatedRuleException(R.string.please_select_topup_amount);
        }
    }
}