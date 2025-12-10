package th.p047co.dtac.android.dtacone.util.validation.phone_number;

import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.util.string.StringUtil;
import th.p047co.dtac.android.dtacone.util.validation.ValidationRule;

/* renamed from: th.co.dtac.android.dtacone.util.validation.phone_number.PhoneNumberEmptyRule */
/* loaded from: classes8.dex */
public class PhoneNumberEmptyRule implements ValidationRule<String> {
    @Override // th.p047co.dtac.android.dtacone.util.validation.ValidationRule
    public void validate(String str) {
        if (str != null) {
            if (!StringUtil.hasText(str)) {
                throw new ValidatedRuleException(R.string.common_otp_request_please_enter_phone_number);
            }
            return;
        }
        throw new ValidatedRuleException(R.string.common_otp_request_please_enter_phone_number);
    }
}