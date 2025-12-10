package com.tom_roush.pdfbox.cos;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes5.dex */
public final class COSInteger extends COSNumber {

    /* renamed from: b */
    public final long f59758b;

    /* renamed from: c */
    public final boolean f59759c;

    /* renamed from: d */
    public static final COSInteger[] f59757d = new COSInteger[357];
    public static final COSInteger ZERO = get(0);
    public static final COSInteger ONE = get(1);
    public static final COSInteger TWO = get(2);
    public static final COSInteger THREE = get(3);
    protected static final COSInteger OUT_OF_RANGE_MAX = m32780d(true);
    protected static final COSInteger OUT_OF_RANGE_MIN = m32780d(false);

    public COSInteger(long j, boolean z) {
        this.f59758b = j;
        this.f59759c = z;
    }

    /* renamed from: d */
    public static COSInteger m32780d(boolean z) {
        if (z) {
            return new COSInteger(Long.MAX_VALUE, false);
        }
        return new COSInteger(Long.MIN_VALUE, false);
    }

    public static COSInteger get(long j) {
        if (-100 <= j && j <= 256) {
            int i = ((int) j) + 100;
            COSInteger[] cOSIntegerArr = f59757d;
            if (cOSIntegerArr[i] == null) {
                cOSIntegerArr[i] = new COSInteger(j, true);
            }
            return cOSIntegerArr[i];
        }
        return new COSInteger(j, true);
    }

    @Override // com.tom_roush.pdfbox.cos.COSBase
    public Object accept(ICOSVisitor iCOSVisitor) throws IOException {
        return iCOSVisitor.visitFromInt(this);
    }

    @Override // com.tom_roush.pdfbox.cos.COSNumber
    public double doubleValue() {
        return this.f59758b;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof COSInteger) && ((COSInteger) obj).intValue() == intValue()) {
            return true;
        }
        return false;
    }

    @Override // com.tom_roush.pdfbox.cos.COSNumber
    public float floatValue() {
        return (float) this.f59758b;
    }

    public int hashCode() {
        long j = this.f59758b;
        return (int) (j ^ (j >> 32));
    }

    @Override // com.tom_roush.pdfbox.cos.COSNumber
    public int intValue() {
        return (int) this.f59758b;
    }

    public boolean isValid() {
        return this.f59759c;
    }

    @Override // com.tom_roush.pdfbox.cos.COSNumber
    public long longValue() {
        return this.f59758b;
    }

    public String toString() {
        return "COSInt{" + this.f59758b + "}";
    }

    public void writePDF(OutputStream outputStream) throws IOException {
        outputStream.write(String.valueOf(this.f59758b).getBytes("ISO-8859-1"));
    }
}