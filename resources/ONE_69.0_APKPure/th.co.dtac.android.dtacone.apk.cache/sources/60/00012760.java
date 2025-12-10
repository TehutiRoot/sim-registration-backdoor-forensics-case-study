package th.p047co.dtac.android.dtacone.util.validation;

import java.util.ArrayList;
import java.util.List;

/* renamed from: th.co.dtac.android.dtacone.util.validation.Validator */
/* loaded from: classes8.dex */
public class Validator<T> {
    protected List<ValidationRule<T>> validationRules = new ArrayList();

    public boolean validate(T t) {
        for (ValidationRule<T> validationRule : this.validationRules) {
            validationRule.validate(t);
        }
        return true;
    }
}