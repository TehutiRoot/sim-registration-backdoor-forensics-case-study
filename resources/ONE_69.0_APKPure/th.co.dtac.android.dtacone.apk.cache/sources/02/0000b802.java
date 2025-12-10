package com.google.zxing.common.reedsolomon;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes5.dex */
public final class GenericGF {
    public static final GenericGF AZTEC_DATA_6;
    public static final GenericGF AZTEC_DATA_8;
    public static final GenericGF AZTEC_PARAM;
    public static final GenericGF DATA_MATRIX_FIELD_256;
    public static final GenericGF MAXICODE_FIELD_64;
    public static final GenericGF QR_CODE_FIELD_256;

    /* renamed from: a */
    public final int[] f57794a;

    /* renamed from: b */
    public final int[] f57795b;

    /* renamed from: c */
    public final S50 f57796c;

    /* renamed from: d */
    public final S50 f57797d;

    /* renamed from: e */
    public final int f57798e;

    /* renamed from: f */
    public final int f57799f;

    /* renamed from: g */
    public final int f57800g;
    public static final GenericGF AZTEC_DATA_12 = new GenericGF(4201, 4096, 1);
    public static final GenericGF AZTEC_DATA_10 = new GenericGF(1033, 1024, 1);

    static {
        GenericGF genericGF = new GenericGF(67, 64, 1);
        AZTEC_DATA_6 = genericGF;
        AZTEC_PARAM = new GenericGF(19, 16, 1);
        QR_CODE_FIELD_256 = new GenericGF(285, 256, 0);
        GenericGF genericGF2 = new GenericGF(301, 256, 1);
        DATA_MATRIX_FIELD_256 = genericGF2;
        AZTEC_DATA_8 = genericGF2;
        MAXICODE_FIELD_64 = genericGF;
    }

    public GenericGF(int i, int i2, int i3) {
        this.f57799f = i;
        this.f57798e = i2;
        this.f57800g = i3;
        this.f57794a = new int[i2];
        this.f57795b = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f57794a[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f57795b[this.f57794a[i6]] = i6;
        }
        this.f57796c = new S50(this, new int[]{0});
        this.f57797d = new S50(this, new int[]{1});
    }

    /* renamed from: a */
    public static int m34139a(int i, int i2) {
        return i ^ i2;
    }

    /* renamed from: b */
    public S50 m34138b(int i, int i2) {
        if (i >= 0) {
            if (i2 == 0) {
                return this.f57796c;
            }
            int[] iArr = new int[i + 1];
            iArr[0] = i2;
            return new S50(this, iArr);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public int m34137c(int i) {
        return this.f57794a[i];
    }

    /* renamed from: d */
    public S50 m34136d() {
        return this.f57797d;
    }

    /* renamed from: e */
    public S50 m34135e() {
        return this.f57796c;
    }

    /* renamed from: f */
    public int m34134f(int i) {
        if (i != 0) {
            return this.f57794a[(this.f57798e - this.f57795b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* renamed from: g */
    public int m34133g(int i) {
        if (i != 0) {
            return this.f57795b[i];
        }
        throw new IllegalArgumentException();
    }

    public int getGeneratorBase() {
        return this.f57800g;
    }

    public int getSize() {
        return this.f57798e;
    }

    /* renamed from: h */
    public int m34132h(int i, int i2) {
        if (i != 0 && i2 != 0) {
            int[] iArr = this.f57794a;
            int[] iArr2 = this.f57795b;
            return iArr[(iArr2[i] + iArr2[i2]) % (this.f57798e - 1)];
        }
        return 0;
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f57799f) + ',' + this.f57798e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}