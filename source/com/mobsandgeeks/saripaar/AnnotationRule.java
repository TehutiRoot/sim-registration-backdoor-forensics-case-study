package com.mobsandgeeks.saripaar;

import android.content.Context;
import java.lang.annotation.Annotation;

/* loaded from: classes5.dex */
public abstract class AnnotationRule<RULE_ANNOTATION extends Annotation, DATA_TYPE> extends Rule<DATA_TYPE> {
    protected final RULE_ANNOTATION mRuleAnnotation;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AnnotationRule(RULE_ANNOTATION r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L11
            java.lang.String r0 = "sequence"
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.Object r0 = com.mobsandgeeks.saripaar.Reflector.getAttributeValue(r3, r0, r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L12
        L11:
            r0 = -1
        L12:
            r2.<init>(r0)
            if (r3 == 0) goto L1a
            r2.mRuleAnnotation = r3
            return
        L1a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "'ruleAnnotation' cannot be null."
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobsandgeeks.saripaar.AnnotationRule.<init>(java.lang.annotation.Annotation):void");
    }

    @Override // com.mobsandgeeks.saripaar.Rule
    public String getMessage(Context context) {
        int intValue = ((Integer) Reflector.getAttributeValue(this.mRuleAnnotation, "messageResId", Integer.class)).intValue();
        if (intValue != -1) {
            return context.getString(intValue);
        }
        return (String) Reflector.getAttributeValue(this.mRuleAnnotation, "message", String.class);
    }
}
