package com.mobsandgeeks.saripaar;

import android.content.Context;
import android.view.View;
import java.util.List;

/* loaded from: classes5.dex */
public class ValidationError {
    private final List<Rule> failedRules;
    private final View view;

    public ValidationError(View view, List<Rule> list) {
        this.view = view;
        this.failedRules = list;
    }

    public String getCollatedErrorMessage(Context context) {
        StringBuilder sb = new StringBuilder();
        for (Rule rule : this.failedRules) {
            String trim = rule.getMessage(context).trim();
            if (trim.length() > 0) {
                sb.append(trim);
                sb.append('\n');
            }
        }
        return sb.toString().trim();
    }

    public List<Rule> getFailedRules() {
        return this.failedRules;
    }

    public View getView() {
        return this.view;
    }

    public String toString() {
        return "ValidationError{view=" + this.view + ", failedRules=" + this.failedRules + '}';
    }
}