package com.mobsandgeeks.saripaar;

import java.lang.annotation.Annotation;

/* loaded from: classes5.dex */
public abstract class ContextualAnnotationRule<RULE_ANNOTATION extends Annotation, DATA_TYPE> extends AnnotationRule<RULE_ANNOTATION, DATA_TYPE> {
    protected ValidationContext mValidationContext;

    public ContextualAnnotationRule(ValidationContext validationContext, RULE_ANNOTATION rule_annotation) {
        super(rule_annotation);
        if (validationContext != null) {
            this.mValidationContext = validationContext;
            return;
        }
        throw new IllegalArgumentException("'validationContext' cannot be null.");
    }
}
