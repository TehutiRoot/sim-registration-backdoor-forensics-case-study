package com.mobsandgeeks.saripaar.rule;

import com.mobsandgeeks.saripaar.AnnotationRule;
import com.mobsandgeeks.saripaar.annotation.Domain;
import commons.validator.routines.DomainValidator;

/* loaded from: classes5.dex */
public class DomainRule extends AnnotationRule<Domain, String> {
    public DomainRule(Domain domain) {
        super(domain);
    }

    @Override // com.mobsandgeeks.saripaar.Rule
    public boolean isValid(String str) {
        return DomainValidator.getInstance(((Domain) this.mRuleAnnotation).allowLocal()).isValid(str);
    }
}