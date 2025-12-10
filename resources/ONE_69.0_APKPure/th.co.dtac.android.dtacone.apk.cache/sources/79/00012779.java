package th.p047co.dtac.android.dtacone.util.validation.change_sim;

import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.util.validation.ValidationRule;

/* renamed from: th.co.dtac.android.dtacone.util.validation.change_sim.ChangeSimReasonValidator */
/* loaded from: classes8.dex */
public class ChangeSimReasonValidator implements ValidationRule<String> {
    @Override // th.p047co.dtac.android.dtacone.util.validation.ValidationRule
    public void validate(String str) {
        if (str != null && str.isEmpty()) {
            throw new ValidatedRuleException(R.string.please_choose_change_sim_reason);
        }
    }
}