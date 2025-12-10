package th.p047co.dtac.android.dtacone.util.validation.register;

import java.util.Iterator;
import th.p047co.dtac.android.dtacone.model.RegisterOwnerCollection;
import th.p047co.dtac.android.dtacone.util.validation.ValidationRule;
import th.p047co.dtac.android.dtacone.util.validation.Validator;
import th.p047co.dtac.android.dtacone.util.validation.password.PasswordValidator;
import th.p047co.dtac.android.dtacone.util.validation.phone_number.PhoneNumberValidator;

/* renamed from: th.co.dtac.android.dtacone.util.validation.register.RegisterOwnerValidator */
/* loaded from: classes8.dex */
public class RegisterOwnerValidator extends Validator<RegisterOwnerCollection> {
    public RegisterOwnerValidator() {
        this.validationRules.add(new RtrCodeLengthRule());
    }

    @Override // th.p047co.dtac.android.dtacone.util.validation.Validator
    public boolean validate(RegisterOwnerCollection registerOwnerCollection) {
        Iterator it = this.validationRules.iterator();
        while (it.hasNext()) {
            ((ValidationRule) it.next()).validate(registerOwnerCollection);
        }
        new PhoneNumberValidator().validate(registerOwnerCollection.getPhoneNumber());
        new PasswordValidator().validate(registerOwnerCollection);
        return true;
    }
}