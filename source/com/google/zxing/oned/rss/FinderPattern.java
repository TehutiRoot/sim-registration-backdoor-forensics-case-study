package com.google.zxing.oned.rss;

import com.google.zxing.ResultPoint;

/* loaded from: classes5.dex */
public final class FinderPattern {

    /* renamed from: a */
    public final int f57901a;

    /* renamed from: b */
    public final int[] f57902b;

    /* renamed from: c */
    public final ResultPoint[] f57903c;

    public FinderPattern(int i, int[] iArr, int i2, int i3, int i4) {
        this.f57901a = i;
        this.f57902b = iArr;
        float f = i2;
        float f2 = i4;
        this.f57903c = new ResultPoint[]{new ResultPoint(f, f2), new ResultPoint(i3, f2)};
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FinderPattern) || this.f57901a != ((FinderPattern) obj).f57901a) {
            return false;
        }
        return true;
    }

    public ResultPoint[] getResultPoints() {
        return this.f57903c;
    }

    public int[] getStartEnd() {
        return this.f57902b;
    }

    public int getValue() {
        return this.f57901a;
    }

    public int hashCode() {
        return this.f57901a;
    }
}
