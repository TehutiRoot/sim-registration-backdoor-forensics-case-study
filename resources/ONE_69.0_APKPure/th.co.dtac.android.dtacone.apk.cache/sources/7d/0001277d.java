package th.p047co.dtac.android.dtacone.util.validation.login;

import th.p047co.dtac.android.dtacone.model.login.LoginCollection;
import th.p047co.dtac.android.dtacone.util.validation.Validator;

/* renamed from: th.co.dtac.android.dtacone.util.validation.login.LoginValidator */
/* loaded from: classes8.dex */
public class LoginValidator extends Validator<LoginCollection> {
    public LoginValidator() {
        this.validationRules.add(new LoginEmptyRule());
    }
}