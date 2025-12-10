package com.google.zxing.qrcode.decoder;

import com.google.zxing.qrcode.decoder.Version;

/* renamed from: com.google.zxing.qrcode.decoder.b */
/* loaded from: classes5.dex */
public final class C9021b {

    /* renamed from: a */
    public final int f58002a;

    /* renamed from: b */
    public final byte[] f58003b;

    public C9021b(int i, byte[] bArr) {
        this.f58002a = i;
        this.f58003b = bArr;
    }

    /* renamed from: b */
    public static C9021b[] m33905b(byte[] bArr, Version version, ErrorCorrectionLevel errorCorrectionLevel) {
        int i;
        if (bArr.length == version.getTotalCodewords()) {
            Version.ECBlocks eCBlocksForLevel = version.getECBlocksForLevel(errorCorrectionLevel);
            Version.ECB[] eCBlocks = eCBlocksForLevel.getECBlocks();
            int i2 = 0;
            for (Version.ECB ecb : eCBlocks) {
                i2 += ecb.getCount();
            }
            C9021b[] c9021bArr = new C9021b[i2];
            int i3 = 0;
            for (Version.ECB ecb2 : eCBlocks) {
                int i4 = 0;
                while (i4 < ecb2.getCount()) {
                    int dataCodewords = ecb2.getDataCodewords();
                    c9021bArr[i3] = new C9021b(dataCodewords, new byte[eCBlocksForLevel.getECCodewordsPerBlock() + dataCodewords]);
                    i4++;
                    i3++;
                }
            }
            int length = c9021bArr[0].f58003b.length;
            int i5 = i2 - 1;
            while (i5 >= 0 && c9021bArr[i5].f58003b.length != length) {
                i5--;
            }
            int i6 = i5 + 1;
            int eCCodewordsPerBlock = length - eCBlocksForLevel.getECCodewordsPerBlock();
            int i7 = 0;
            for (int i8 = 0; i8 < eCCodewordsPerBlock; i8++) {
                int i9 = 0;
                while (i9 < i3) {
                    c9021bArr[i9].f58003b[i8] = bArr[i7];
                    i9++;
                    i7++;
                }
            }
            int i10 = i6;
            while (i10 < i3) {
                c9021bArr[i10].f58003b[eCCodewordsPerBlock] = bArr[i7];
                i10++;
                i7++;
            }
            int length2 = c9021bArr[0].f58003b.length;
            while (eCCodewordsPerBlock < length2) {
                int i11 = 0;
                while (i11 < i3) {
                    if (i11 < i6) {
                        i = eCCodewordsPerBlock;
                    } else {
                        i = eCCodewordsPerBlock + 1;
                    }
                    c9021bArr[i11].f58003b[i] = bArr[i7];
                    i11++;
                    i7++;
                }
                eCCodewordsPerBlock++;
            }
            return c9021bArr;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public byte[] m33906a() {
        return this.f58003b;
    }

    /* renamed from: c */
    public int m33904c() {
        return this.f58002a;
    }
}