package com.mobsandgeeks.saripaar.rule;

import com.mobsandgeeks.saripaar.AnnotationRule;
import com.mobsandgeeks.saripaar.annotation.Min;
import commons.validator.routines.IntegerValidator;

/* loaded from: classes5.dex */
public class MinRule extends AnnotationRule<Min, Integer> {
    public MinRule(Min min) {
        super(min);
    }

    @Override // com.mobsandgeeks.saripaar.Rule
    public boolean isValid(Integer num) {
        if (num != null) {
            return IntegerValidator.getInstance().minValue(num, ((Min) this.mRuleAnnotation).value());
        }
        throw new IllegalArgumentException("'Integer' cannot be null.");
    }
}