package com.mobsandgeeks.saripaar.rule;

import com.mobsandgeeks.saripaar.AnnotationRule;
import com.mobsandgeeks.saripaar.annotation.DecimalMin;
import commons.validator.routines.DoubleValidator;

/* loaded from: classes5.dex */
public class DecimalMinRule extends AnnotationRule<DecimalMin, Double> {
    public DecimalMinRule(DecimalMin decimalMin) {
        super(decimalMin);
    }

    @Override // com.mobsandgeeks.saripaar.Rule
    public boolean isValid(Double d) {
        if (d != null) {
            return DoubleValidator.getInstance().minValue(d, ((DecimalMin) this.mRuleAnnotation).value());
        }
        throw new IllegalArgumentException("'Double' cannot be null.");
    }
}
