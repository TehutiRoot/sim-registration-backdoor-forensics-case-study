package com.mobsandgeeks.saripaar.rule;

import com.mobsandgeeks.saripaar.AnnotationRule;
import com.mobsandgeeks.saripaar.annotation.DecimalMax;
import commons.validator.routines.DoubleValidator;

/* loaded from: classes5.dex */
public class DecimalMaxRule extends AnnotationRule<DecimalMax, Double> {
    public DecimalMaxRule(DecimalMax decimalMax) {
        super(decimalMax);
    }

    @Override // com.mobsandgeeks.saripaar.Rule
    public boolean isValid(Double d) {
        if (d != null) {
            return DoubleValidator.getInstance().maxValue(d, ((DecimalMax) this.mRuleAnnotation).value());
        }
        throw new IllegalArgumentException("'Double' cannot be null.");
    }
}
