package th.p047co.dtac.android.dtacone.util.validation.login;

import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.model.login.LoginCollection;
import th.p047co.dtac.android.dtacone.util.string.StringUtil;
import th.p047co.dtac.android.dtacone.util.validation.ValidationRule;

/* renamed from: th.co.dtac.android.dtacone.util.validation.login.LoginEmptyRule */
/* loaded from: classes8.dex */
public class LoginEmptyRule implements ValidationRule<LoginCollection> {
    @Override // th.p047co.dtac.android.dtacone.util.validation.ValidationRule
    public void validate(LoginCollection loginCollection) {
        if (StringUtil.hasText(loginCollection.getUsername())) {
            if (!StringUtil.hasText(loginCollection.getPassword())) {
                throw new ValidatedRuleException(R.string.please_enter_password);
            }
            return;
        }
        throw new ValidatedRuleException(R.string.please_enter_subscriber_number);
    }
}