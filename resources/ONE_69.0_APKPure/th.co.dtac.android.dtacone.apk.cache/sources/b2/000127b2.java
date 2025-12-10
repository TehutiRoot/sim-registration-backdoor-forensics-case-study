package th.p047co.dtac.android.dtacone.util.validation.register;

import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.model.register.RegisterCollection;
import th.p047co.dtac.android.dtacone.util.validation.ValidationRule;

/* renamed from: th.co.dtac.android.dtacone.util.validation.register.RegisterRtrCodeLengthRule */
/* loaded from: classes8.dex */
public class RegisterRtrCodeLengthRule implements ValidationRule<RegisterCollection> {
    public static final int SPECIFIC_LENGTH = 8;

    @Override // th.p047co.dtac.android.dtacone.util.validation.ValidationRule
    public void validate(RegisterCollection registerCollection) {
        if (registerCollection == null || registerCollection.getRtrCode().length() != 8) {
            throw new ValidatedRuleException(R.string.rtr_code_must_be_length_of_8);
        }
    }
}