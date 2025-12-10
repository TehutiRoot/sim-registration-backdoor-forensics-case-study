package th.p047co.dtac.android.dtacone.util.validation.phone_number;

import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.util.format.PhoneNumberFormat;
import th.p047co.dtac.android.dtacone.util.validation.ValidationRule;

/* renamed from: th.co.dtac.android.dtacone.util.validation.phone_number.PhoneNumberWithoutCountryCallingCodeLengthRuleA */
/* loaded from: classes8.dex */
public class PhoneNumberWithoutCountryCallingCodeLengthRuleA implements ValidationRule<String> {
    public static final int WITHOUT_COUNTRY_CALLING_CODE_MAXIMUM_LENGTH = 13;
    public static final int WITHOUT_COUNTRY_CALLING_CODE_MINIMUM_LENGTH = 10;

    /* renamed from: a */
    private boolean m16721a(int i) {
        return i > 13;
    }

    /* renamed from: b */
    private boolean m16720b(int i) {
        return i < 10;
    }

    @Override // th.p047co.dtac.android.dtacone.util.validation.ValidationRule
    public void validate(String str) {
        int length = str.length();
        if (PhoneNumberFormat.isBeginWithCountryCode(str)) {
            return;
        }
        if (!m16720b(length)) {
            if (m16721a(length)) {
                throw new ValidatedRuleException(R.string.phone_number_format_invalid);
            }
            return;
        }
        throw new ValidatedRuleException(R.string.common_otp_request_please_enter_ten_digit_phone_number);
    }
}