package th.p047co.dtac.android.dtacone.util.validation.card;

import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.model.register.RegisterCollection;
import th.p047co.dtac.android.dtacone.util.validation.ValidationRule;

/* renamed from: th.co.dtac.android.dtacone.util.validation.card.IdCardLengthRule */
/* loaded from: classes8.dex */
public class IdCardLengthRule implements ValidationRule<RegisterCollection> {
    @Override // th.p047co.dtac.android.dtacone.util.validation.ValidationRule
    public void validate(RegisterCollection registerCollection) {
        if (registerCollection.getIdCard() == null || !(registerCollection.getIdCard() == null || registerCollection.getIdCard().length() == 5)) {
            throw new ValidatedRuleException(R.string.register_pid_must_be_5_digits_length);
        }
    }
}