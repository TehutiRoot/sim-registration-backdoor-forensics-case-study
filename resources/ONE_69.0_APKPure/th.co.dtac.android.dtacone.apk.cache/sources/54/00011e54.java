package th.p047co.dtac.android.dtacone.model.error;

import androidx.annotation.StringRes;

/* renamed from: th.co.dtac.android.dtacone.model.error.ValidatedRuleException */
/* loaded from: classes8.dex */
public class ValidatedRuleException extends IllegalArgumentException {
    private int resId;

    public ValidatedRuleException(@StringRes int i) {
        this.resId = i;
    }

    public int getResId() {
        return this.resId;
    }
}