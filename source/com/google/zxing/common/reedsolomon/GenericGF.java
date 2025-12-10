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
    public final int[] f57782a;

    /* renamed from: b */
    public final int[] f57783b;

    /* renamed from: c */
    public final O50 f57784c;

    /* renamed from: d */
    public final O50 f57785d;

    /* renamed from: e */
    public final int f57786e;

    /* renamed from: f */
    public final int f57787f;

    /* renamed from: g */
    public final int f57788g;
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
        this.f57787f = i;
        this.f57786e = i2;
        this.f57788g = i3;
        this.f57782a = new int[i2];
        this.f57783b = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f57782a[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f57783b[this.f57782a[i6]] = i6;
        }
        this.f57784c = new O50(this, new int[]{0});
        this.f57785d = new O50(this, new int[]{1});
    }

    /* renamed from: a */
    public static int m34147a(int i, int i2) {
        return i ^ i2;
    }

    /* renamed from: b */
    public O50 m34146b(int i, int i2) {
        if (i >= 0) {
            if (i2 == 0) {
                return this.f57784c;
            }
            int[] iArr = new int[i + 1];
            iArr[0] = i2;
            return new O50(this, iArr);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public int m34145c(int i) {
        return this.f57782a[i];
    }

    /* renamed from: d */
    public O50 m34144d() {
        return this.f57785d;
    }

    /* renamed from: e */
    public O50 m34143e() {
        return this.f57784c;
    }

    /* renamed from: f */
    public int m34142f(int i) {
        if (i != 0) {
            return this.f57782a[(this.f57786e - this.f57783b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* renamed from: g */
    public int m34141g(int i) {
        if (i != 0) {
            return this.f57783b[i];
        }
        throw new IllegalArgumentException();
    }

    public int getGeneratorBase() {
        return this.f57788g;
    }

    public int getSize() {
        return this.f57786e;
    }

    /* renamed from: h */
    public int m34140h(int i, int i2) {
        if (i != 0 && i2 != 0) {
            int[] iArr = this.f57782a;
            int[] iArr2 = this.f57783b;
            return iArr[(iArr2[i] + iArr2[i2]) % (this.f57786e - 1)];
        }
        return 0;
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f57787f) + ',' + this.f57786e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
