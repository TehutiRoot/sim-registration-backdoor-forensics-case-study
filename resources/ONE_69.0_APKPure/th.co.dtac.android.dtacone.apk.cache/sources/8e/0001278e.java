package th.p047co.dtac.android.dtacone.util.validation.otp;

import th.p047co.dtac.android.dtacone.model.OTPVerifyCollection;
import th.p047co.dtac.android.dtacone.util.validation.Validator;

/* renamed from: th.co.dtac.android.dtacone.util.validation.otp.OtpValidator */
/* loaded from: classes8.dex */
public class OtpValidator extends Validator<OTPVerifyCollection> {
    public OtpValidator() {
        this.validationRules.add(new OtpLengthRule());
    }
}