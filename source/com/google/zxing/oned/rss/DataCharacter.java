package com.google.zxing.oned.rss;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes5.dex */
public class DataCharacter {

    /* renamed from: a */
    public final int f57899a;

    /* renamed from: b */
    public final int f57900b;

    public DataCharacter(int i, int i2) {
        this.f57899a = i;
        this.f57900b = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DataCharacter)) {
            return false;
        }
        DataCharacter dataCharacter = (DataCharacter) obj;
        if (this.f57899a != dataCharacter.f57899a || this.f57900b != dataCharacter.f57900b) {
            return false;
        }
        return true;
    }

    public final int getChecksumPortion() {
        return this.f57900b;
    }

    public final int getValue() {
        return this.f57899a;
    }

    public final int hashCode() {
        return this.f57899a ^ this.f57900b;
    }

    public final String toString() {
        return this.f57899a + "(" + this.f57900b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
