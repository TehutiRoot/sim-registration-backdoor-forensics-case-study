package th.p047co.dtac.android.dtacone.util.validation.password;

import th.p047co.dtac.android.dtacone.model.BaseUserCollection;
import th.p047co.dtac.android.dtacone.util.validation.Validator;

/* renamed from: th.co.dtac.android.dtacone.util.validation.password.PasswordValidator */
/* loaded from: classes8.dex */
public class PasswordValidator extends Validator<BaseUserCollection> {
    public PasswordValidator() {
        this.validationRules.add(new PasswordMatchedRule());
        this.validationRules.add(new PasswordLengthRule());
    }
}