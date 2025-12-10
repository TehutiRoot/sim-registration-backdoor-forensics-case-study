package th.p047co.dtac.android.dtacone.util.validation.pin;

import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.util.validation.ValidationRule;

/* renamed from: th.co.dtac.android.dtacone.util.validation.pin.PinLengthRule */
/* loaded from: classes8.dex */
public class PinLengthRule implements ValidationRule<String> {
    @Override // th.p047co.dtac.android.dtacone.util.validation.ValidationRule
    public void validate(String str) {
        if (str == null || str.isEmpty() || str.length() != 8) {
            throw new ValidatedRuleException(R.string.enter_pin_8_digits);
        }
    }
}