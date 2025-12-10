package th.p047co.dtac.android.dtacone.util.validation.otp;

import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.OTPVerifyCollection;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.util.validation.ValidationRule;

/* renamed from: th.co.dtac.android.dtacone.util.validation.otp.OtpLengthRule */
/* loaded from: classes8.dex */
public class OtpLengthRule implements ValidationRule<OTPVerifyCollection> {
    @Override // th.p047co.dtac.android.dtacone.util.validation.ValidationRule
    public void validate(OTPVerifyCollection oTPVerifyCollection) {
        if (oTPVerifyCollection.getOtp() != null && !oTPVerifyCollection.getOtp().isEmpty()) {
            if (oTPVerifyCollection.getOtp().length() != 4) {
                throw new ValidatedRuleException(R.string.otp_must_be_at_least_4_digits);
            }
            return;
        }
        throw new ValidatedRuleException(R.string.please_input_otp);
    }
}