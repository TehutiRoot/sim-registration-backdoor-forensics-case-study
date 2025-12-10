package th.p047co.dtac.android.dtacone.util.validation.person;

import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.util.string.StringUtil;
import th.p047co.dtac.android.dtacone.util.validation.ValidationRule;

/* renamed from: th.co.dtac.android.dtacone.util.validation.person.PersonIdLengthRule */
/* loaded from: classes8.dex */
public class PersonIdLengthRule implements ValidationRule<String> {
    @Override // th.p047co.dtac.android.dtacone.util.validation.ValidationRule
    public void validate(String str) {
        if (StringUtil.hasText(str)) {
            if (StringUtil.hasText(str) && str.length() != 13) {
                throw new ValidatedRuleException(R.string.common_sim_owner_informaion_please_enter_id_card_deficient);
            }
            return;
        }
        throw new ValidatedRuleException(R.string.common_sim_owner_informaion_please_enter_id_card);
    }
}