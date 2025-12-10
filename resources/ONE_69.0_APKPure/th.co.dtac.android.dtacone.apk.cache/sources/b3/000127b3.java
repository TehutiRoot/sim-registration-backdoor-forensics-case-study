package th.p047co.dtac.android.dtacone.util.validation.register;

import java.util.Iterator;
import th.p047co.dtac.android.dtacone.model.register.RegisterCollection;
import th.p047co.dtac.android.dtacone.util.validation.ValidationRule;
import th.p047co.dtac.android.dtacone.util.validation.Validator;
import th.p047co.dtac.android.dtacone.util.validation.phone_number.PhoneNumberValidator;

/* renamed from: th.co.dtac.android.dtacone.util.validation.register.RegisterValidator */
/* loaded from: classes8.dex */
public class RegisterValidator extends Validator<RegisterCollection> {
    public RegisterValidator() {
        this.validationRules.add(new RegisterRtrCodeLengthRule());
    }

    @Override // th.p047co.dtac.android.dtacone.util.validation.Validator
    public boolean validate(RegisterCollection registerCollection) {
        Iterator it = this.validationRules.iterator();
        while (it.hasNext()) {
            ((ValidationRule) it.next()).validate(registerCollection);
        }
        new PhoneNumberValidator().validate(registerCollection.getPhoneNumber());
        return true;
    }
}