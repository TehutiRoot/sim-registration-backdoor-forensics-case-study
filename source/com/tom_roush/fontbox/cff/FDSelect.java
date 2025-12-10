package com.tom_roush.fontbox.cff;

/* loaded from: classes5.dex */
public abstract class FDSelect {
    protected final CFFCIDFont owner;

    public FDSelect(CFFCIDFont cFFCIDFont) {
        this.owner = cFFCIDFont;
    }

    public abstract int getFDIndex(int i);
}
