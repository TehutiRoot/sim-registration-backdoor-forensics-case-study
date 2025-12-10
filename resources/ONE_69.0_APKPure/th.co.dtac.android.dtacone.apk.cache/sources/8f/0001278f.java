package th.p047co.dtac.android.dtacone.util.validation.password;

import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.BaseUserCollection;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.util.validation.ValidationRule;

/* renamed from: th.co.dtac.android.dtacone.util.validation.password.PasswordLengthRule */
/* loaded from: classes8.dex */
public class PasswordLengthRule implements ValidationRule<BaseUserCollection> {
    @Override // th.p047co.dtac.android.dtacone.util.validation.ValidationRule
    public void validate(BaseUserCollection baseUserCollection) {
        int length = baseUserCollection.getPassword().length();
        if (length != baseUserCollection.getMinPasswordLength() && length != baseUserCollection.getMaxPasswordLength()) {
            throw new ValidatedRuleException(R.string.please_set_password_be_4_or_6_length);
        }
    }
}