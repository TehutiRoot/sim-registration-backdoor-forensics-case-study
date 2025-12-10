package com.google.zxing.oned.rss;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.oned.OneDReader;

/* loaded from: classes5.dex */
public abstract class AbstractRSSReader extends OneDReader {

    /* renamed from: b */
    public final int[] f57906b;

    /* renamed from: e */
    public final int[] f57909e;

    /* renamed from: f */
    public final int[] f57910f;

    /* renamed from: a */
    public final int[] f57905a = new int[4];

    /* renamed from: c */
    public final float[] f57907c = new float[4];

    /* renamed from: d */
    public final float[] f57908d = new float[4];

    public AbstractRSSReader() {
        int[] iArr = new int[8];
        this.f57906b = iArr;
        this.f57909e = new int[iArr.length / 2];
        this.f57910f = new int[iArr.length / 2];
    }

    @Deprecated
    public static int count(int[] iArr) {
        return MathUtils.sum(iArr);
    }

    public static void decrement(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            float f2 = fArr[i2];
            if (f2 < f) {
                i = i2;
                f = f2;
            }
        }
        iArr[i] = iArr[i] - 1;
    }

    public static void increment(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            float f2 = fArr[i2];
            if (f2 > f) {
                i = i2;
                f = f2;
            }
        }
        iArr[i] = iArr[i] + 1;
    }

    public static boolean isFinderPattern(int[] iArr) {
        int i;
        float f = (iArr[0] + iArr[1]) / ((iArr[2] + i) + iArr[3]);
        if (f >= 0.7916667f && f <= 0.89285713f) {
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MIN_VALUE;
            for (int i4 : iArr) {
                if (i4 > i3) {
                    i3 = i4;
                }
                if (i4 < i2) {
                    i2 = i4;
                }
            }
            if (i3 < i2 * 10) {
                return true;
            }
        }
        return false;
    }

    public static int parseFinderValue(int[] iArr, int[][] iArr2) throws NotFoundException {
        for (int i = 0; i < iArr2.length; i++) {
            if (OneDReader.patternMatchVariance(iArr, iArr2[i], 0.45f) < 0.2f) {
                return i;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final int[] getDataCharacterCounters() {
        return this.f57906b;
    }

    public final int[] getDecodeFinderCounters() {
        return this.f57905a;
    }

    public final int[] getEvenCounts() {
        return this.f57910f;
    }

    public final float[] getEvenRoundingErrors() {
        return this.f57908d;
    }

    public final int[] getOddCounts() {
        return this.f57909e;
    }

    public final float[] getOddRoundingErrors() {
        return this.f57907c;
    }
}