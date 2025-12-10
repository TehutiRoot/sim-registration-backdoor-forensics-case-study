package th.p047co.dtac.android.dtacone.util.validation.person;

import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.util.string.StringUtil;
import th.p047co.dtac.android.dtacone.util.validation.ValidationRule;

/* renamed from: th.co.dtac.android.dtacone.util.validation.person.PassPortLengthRule */
/* loaded from: classes8.dex */
public class PassPortLengthRule implements ValidationRule<String> {
    @Override // th.p047co.dtac.android.dtacone.util.validation.ValidationRule
    public void validate(String str) {
        if (!StringUtil.hasText(str)) {
            throw new ValidatedRuleException(R.string.common_sim_owner_informaion_please_enter_passport_card);
        }
    }
}