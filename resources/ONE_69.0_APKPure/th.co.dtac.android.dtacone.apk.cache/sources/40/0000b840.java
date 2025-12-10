package com.google.zxing.oned.rss;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes5.dex */
public class DataCharacter {

    /* renamed from: a */
    public final int f57911a;

    /* renamed from: b */
    public final int f57912b;

    public DataCharacter(int i, int i2) {
        this.f57911a = i;
        this.f57912b = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DataCharacter)) {
            return false;
        }
        DataCharacter dataCharacter = (DataCharacter) obj;
        if (this.f57911a != dataCharacter.f57911a || this.f57912b != dataCharacter.f57912b) {
            return false;
        }
        return true;
    }

    public final int getChecksumPortion() {
        return this.f57912b;
    }

    public final int getValue() {
        return this.f57911a;
    }

    public final int hashCode() {
        return this.f57911a ^ this.f57912b;
    }

    public final String toString() {
        return this.f57911a + "(" + this.f57912b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}