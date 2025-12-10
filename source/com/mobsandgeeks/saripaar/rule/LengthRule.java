package com.mobsandgeeks.saripaar.rule;

import com.mobsandgeeks.saripaar.AnnotationRule;
import com.mobsandgeeks.saripaar.annotation.Length;

/* loaded from: classes5.dex */
public class LengthRule extends AnnotationRule<Length, String> {
    public LengthRule(Length length) {
        super(length);
    }

    private void assertMinMax(int i, int i2) {
        if (i <= i2) {
            return;
        }
        throw new IllegalStateException(String.format("'min' (%d) should be less than or equal to 'max' (%d).", Integer.valueOf(i), Integer.valueOf(i2)));
    }

    @Override // com.mobsandgeeks.saripaar.Rule
    public boolean isValid(String str) {
        if (str != null) {
            int min = ((Length) this.mRuleAnnotation).min();
            int max = ((Length) this.mRuleAnnotation).max();
            assertMinMax(min, max);
            if (((Length) this.mRuleAnnotation).trim()) {
                str = str.trim();
            }
            int length = str.length();
            return (min == Integer.MIN_VALUE || length >= min) && (max == Integer.MAX_VALUE || length <= max);
        }
        throw new IllegalArgumentException("'text' cannot be null.");
    }
}
