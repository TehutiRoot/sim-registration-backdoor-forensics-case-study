package com.mobsandgeeks.saripaar.rule;

import android.content.Context;
import com.mobsandgeeks.saripaar.ContextualAnnotationRule;
import com.mobsandgeeks.saripaar.ValidationContext;
import com.mobsandgeeks.saripaar.annotation.Future;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes5.dex */
public class FutureRule extends ContextualAnnotationRule<Future, String> {
    public FutureRule(ValidationContext validationContext, Future future) {
        super(validationContext, future);
    }

    private DateFormat getDateFormat() {
        String dateFormat;
        Context context = this.mValidationContext.getContext();
        int dateFormatResId = ((Future) this.mRuleAnnotation).dateFormatResId();
        if (dateFormatResId != -1) {
            dateFormat = context.getString(dateFormatResId);
        } else {
            dateFormat = ((Future) this.mRuleAnnotation).dateFormat();
        }
        return new SimpleDateFormat(dateFormat);
    }

    @Override // com.mobsandgeeks.saripaar.Rule
    public boolean isValid(String str) {
        Date date;
        try {
            date = getDateFormat().parse(str);
        } catch (ParseException unused) {
            date = null;
        }
        return date != null && date.after(new Date());
    }
}