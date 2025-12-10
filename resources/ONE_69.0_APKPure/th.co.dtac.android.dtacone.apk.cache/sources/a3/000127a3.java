package th.p047co.dtac.android.dtacone.util.validation.phone_number;

import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.util.format.PhoneNumberFormat;
import th.p047co.dtac.android.dtacone.util.validation.ValidationRule;

/* renamed from: th.co.dtac.android.dtacone.util.validation.phone_number.PhoneNumberLeadingRule */
/* loaded from: classes8.dex */
public class PhoneNumberLeadingRule implements ValidationRule<String> {
    @Override // th.p047co.dtac.android.dtacone.util.validation.ValidationRule
    public void validate(String str) {
        if (!PhoneNumberFormat.isBeginWithCountryCode(str) && !str.startsWith("0")) {
            throw new ValidatedRuleException(R.string.phone_number_must_leading_with_zero_or_double_six);
        }
    }
}