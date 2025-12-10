package th.p047co.dtac.android.dtacone.util.validation.person;

import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.util.validation.ValidationRule;

/* renamed from: th.co.dtac.android.dtacone.util.validation.person.LastNameLengthRule */
/* loaded from: classes8.dex */
public class LastNameLengthRule implements ValidationRule<String> {
    @Override // th.p047co.dtac.android.dtacone.util.validation.ValidationRule
    public void validate(String str) {
        if (str != null && str.isEmpty()) {
            throw new ValidatedRuleException(R.string.common_sim_owner_informaion_please_enter_lastname);
        }
    }
}