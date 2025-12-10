package com.google.zxing.oned.rss;

import com.google.zxing.ResultPoint;

/* loaded from: classes5.dex */
public final class FinderPattern {

    /* renamed from: a */
    public final int f57913a;

    /* renamed from: b */
    public final int[] f57914b;

    /* renamed from: c */
    public final ResultPoint[] f57915c;

    public FinderPattern(int i, int[] iArr, int i2, int i3, int i4) {
        this.f57913a = i;
        this.f57914b = iArr;
        float f = i2;
        float f2 = i4;
        this.f57915c = new ResultPoint[]{new ResultPoint(f, f2), new ResultPoint(i3, f2)};
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FinderPattern) || this.f57913a != ((FinderPattern) obj).f57913a) {
            return false;
        }
        return true;
    }

    public ResultPoint[] getResultPoints() {
        return this.f57915c;
    }

    public int[] getStartEnd() {
        return this.f57914b;
    }

    public int getValue() {
        return this.f57913a;
    }

    public int hashCode() {
        return this.f57913a;
    }
}