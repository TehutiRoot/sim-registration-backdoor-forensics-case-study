package th.p047co.dtac.android.dtacone.util.validation.phone_number;

import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.util.validation.ValidationRule;

/* renamed from: th.co.dtac.android.dtacone.util.validation.phone_number.PhoneNumberBeginWithDoubleZeroRule */
/* loaded from: classes8.dex */
public class PhoneNumberBeginWithDoubleZeroRule implements ValidationRule<String> {
    @Override // th.p047co.dtac.android.dtacone.util.validation.ValidationRule
    public void validate(String str) {
        if (str.startsWith("00")) {
            throw new ValidatedRuleException(R.string.subscriber_number_cannot_leading_with_double_zero);
        }
    }
}