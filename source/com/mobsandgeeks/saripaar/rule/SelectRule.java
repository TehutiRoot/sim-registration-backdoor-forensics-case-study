package com.mobsandgeeks.saripaar.rule;

import com.mobsandgeeks.saripaar.AnnotationRule;
import com.mobsandgeeks.saripaar.annotation.Select;

/* loaded from: classes5.dex */
public class SelectRule extends AnnotationRule<Select, Integer> {
    public SelectRule(Select select) {
        super(select);
    }

    @Override // com.mobsandgeeks.saripaar.Rule
    public boolean isValid(Integer num) {
        if (num != null) {
            return ((Select) this.mRuleAnnotation).defaultSelection() != num.intValue();
        }
        throw new IllegalArgumentException("'index' cannot be null.");
    }
}
