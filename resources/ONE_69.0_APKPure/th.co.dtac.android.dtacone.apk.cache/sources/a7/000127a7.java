package th.p047co.dtac.android.dtacone.util.validation.phone_number;

import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.util.format.PhoneNumberFormat;
import th.p047co.dtac.android.dtacone.util.validation.ValidationRule;

/* renamed from: th.co.dtac.android.dtacone.util.validation.phone_number.PhoneNumberWithCountryCallingCodeLengthRuleA */
/* loaded from: classes8.dex */
public class PhoneNumberWithCountryCallingCodeLengthRuleA implements ValidationRule<String> {
    public static final int WITH_COUNTRY_CALLING_CODE_MAXIMUM_LENGTH = 14;
    public static final int WITH_COUNTRY_CALLING_CODE_MINIMUM_LENGTH = 11;

    /* renamed from: a */
    public final boolean m16723a(int i) {
        return i > 14;
    }

    /* renamed from: b */
    public final boolean m16722b(int i) {
        return i < 11;
    }

    @Override // th.p047co.dtac.android.dtacone.util.validation.ValidationRule
    public void validate(String str) {
        int length = str.length();
        if (PhoneNumberFormat.isBeginWithCountryCode(str)) {
            if (!m16722b(length)) {
                if (m16723a(length)) {
                    throw new ValidatedRuleException(R.string.phone_number_format_invalid);
                }
                return;
            }
            throw new ValidatedRuleException(R.string.common_otp_request_please_enter_ten_digit_phone_number);
        }
    }
}