package th.p047co.dtac.android.dtacone.util.validation.person;

import java.util.regex.Pattern;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.util.validation.ValidationRule;

/* renamed from: th.co.dtac.android.dtacone.util.validation.person.EmailFormatRule */
/* loaded from: classes8.dex */
public class EmailFormatRule implements ValidationRule<String> {
    @Override // th.p047co.dtac.android.dtacone.util.validation.ValidationRule
    public void validate(String str) {
        Pattern compile = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$", 2);
        if (str == null || !compile.matcher(str).matches()) {
            throw new ValidatedRuleException(R.string.email_invalidate);
        }
    }
}