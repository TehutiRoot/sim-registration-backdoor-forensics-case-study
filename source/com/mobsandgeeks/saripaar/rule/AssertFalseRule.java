package com.mobsandgeeks.saripaar.rule;

import com.mobsandgeeks.saripaar.AnnotationRule;
import com.mobsandgeeks.saripaar.annotation.AssertFalse;

/* loaded from: classes5.dex */
public class AssertFalseRule extends AnnotationRule<AssertFalse, Boolean> {
    public AssertFalseRule(AssertFalse assertFalse) {
        super(assertFalse);
    }

    @Override // com.mobsandgeeks.saripaar.Rule
    public boolean isValid(Boolean bool) {
        if (bool != null) {
            return !bool.booleanValue();
        }
        throw new IllegalArgumentException("'data' cannot be null.");
    }
}
