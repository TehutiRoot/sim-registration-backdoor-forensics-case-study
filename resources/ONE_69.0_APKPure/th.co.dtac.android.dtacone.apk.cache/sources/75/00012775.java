package th.p047co.dtac.android.dtacone.util.validation.card;

import th.p047co.dtac.android.dtacone.model.register.RegisterCollection;
import th.p047co.dtac.android.dtacone.util.validation.Validator;

/* renamed from: th.co.dtac.android.dtacone.util.validation.card.IdCardValidator */
/* loaded from: classes8.dex */
public class IdCardValidator extends Validator<RegisterCollection> {
    public IdCardValidator() {
        this.validationRules.add(new IdCardLengthRule());
    }

    @Override // th.p047co.dtac.android.dtacone.util.validation.Validator
    public boolean validate(RegisterCollection registerCollection) {
        return super.validate((IdCardValidator) registerCollection);
    }
}