package th.p047co.dtac.android.dtacone.util.validation.person;

import th.p047co.dtac.android.dtacone.util.validation.Validator;

/* renamed from: th.co.dtac.android.dtacone.util.validation.person.PersonValidator */
/* loaded from: classes8.dex */
public class PersonValidator extends Validator<String> {
    public PersonValidator() {
        this.validationRules.add(new PersonIdLengthRule());
    }
}