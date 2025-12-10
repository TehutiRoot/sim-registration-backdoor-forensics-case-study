package com.mobsandgeeks.saripaar;

import android.content.Context;

/* loaded from: classes5.dex */
public abstract class Rule<VALIDATABLE> {
    protected final int mSequence;

    public Rule(int i) {
        this.mSequence = i;
    }

    public abstract String getMessage(Context context);

    public final int getSequence() {
        return this.mSequence;
    }

    public abstract boolean isValid(VALIDATABLE validatable);
}
