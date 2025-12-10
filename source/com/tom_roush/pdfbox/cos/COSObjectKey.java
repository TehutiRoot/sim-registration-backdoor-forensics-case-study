package com.tom_roush.pdfbox.cos;

import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes5.dex */
public class COSObjectKey implements Comparable<COSObjectKey> {

    /* renamed from: a */
    public final long f59856a;

    /* renamed from: b */
    public int f59857b;

    public COSObjectKey(COSObject cOSObject) {
        this(cOSObject.getObjectNumber(), cOSObject.getGenerationNumber());
    }

    public boolean equals(Object obj) {
        COSObjectKey cOSObjectKey;
        if (obj instanceof COSObjectKey) {
            cOSObjectKey = (COSObjectKey) obj;
        } else {
            cOSObjectKey = null;
        }
        if (cOSObjectKey != null && cOSObjectKey.getNumber() == getNumber() && cOSObjectKey.getGeneration() == getGeneration()) {
            return true;
        }
        return false;
    }

    public void fixGeneration(int i) {
        this.f59857b = i;
    }

    public int getGeneration() {
        return this.f59857b;
    }

    public long getNumber() {
        return this.f59856a;
    }

    public int hashCode() {
        return Long.valueOf((this.f59856a << 4) + this.f59857b).hashCode();
    }

    public String toString() {
        return this.f59856a + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + this.f59857b + " R";
    }

    public COSObjectKey(long j, int i) {
        this.f59856a = j;
        this.f59857b = i;
    }

    @Override // java.lang.Comparable
    public int compareTo(COSObjectKey cOSObjectKey) {
        if (getNumber() < cOSObjectKey.getNumber()) {
            return -1;
        }
        if (getNumber() > cOSObjectKey.getNumber()) {
            return 1;
        }
        if (getGeneration() < cOSObjectKey.getGeneration()) {
            return -1;
        }
        return getGeneration() > cOSObjectKey.getGeneration() ? 1 : 0;
    }
}
