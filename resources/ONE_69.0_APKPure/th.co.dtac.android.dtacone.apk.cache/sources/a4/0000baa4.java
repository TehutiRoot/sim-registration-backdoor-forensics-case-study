package com.mobsandgeeks.saripaar.rule;

import android.content.Context;
import com.mobsandgeeks.saripaar.ContextualAnnotationRule;
import com.mobsandgeeks.saripaar.ValidationContext;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;

/* loaded from: classes5.dex */
public class NotEmptyRule extends ContextualAnnotationRule<NotEmpty, String> {
    public NotEmptyRule(ValidationContext validationContext, NotEmpty notEmpty) {
        super(validationContext, notEmpty);
    }

    @Override // com.mobsandgeeks.saripaar.Rule
    public boolean isValid(String str) {
        String emptyText;
        boolean z = false;
        if (str != null) {
            if (((NotEmpty) this.mRuleAnnotation).trim()) {
                str = str.trim();
            }
            Context context = this.mValidationContext.getContext();
            if (((NotEmpty) this.mRuleAnnotation).emptyTextResId() != -1) {
                emptyText = context.getString(((NotEmpty) this.mRuleAnnotation).emptyTextResId());
            } else {
                emptyText = ((NotEmpty) this.mRuleAnnotation).emptyText();
            }
            if (emptyText.equals(str) || "".equals(str)) {
                z = true;
            }
        }
        return !z;
    }
}