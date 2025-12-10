package th.p047co.dtac.android.dtacone.util.validation.password;

import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.BaseUserCollection;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.util.validation.ValidationRule;

/* renamed from: th.co.dtac.android.dtacone.util.validation.password.PasswordMatchedRule */
/* loaded from: classes8.dex */
public class PasswordMatchedRule implements ValidationRule<BaseUserCollection> {
    @Override // th.p047co.dtac.android.dtacone.util.validation.ValidationRule
    public void validate(BaseUserCollection baseUserCollection) {
        if (!baseUserCollection.getPassword().equals(baseUserCollection.getConfirmPassword())) {
            throw new ValidatedRuleException(R.string.password_not_match);
        }
    }
}