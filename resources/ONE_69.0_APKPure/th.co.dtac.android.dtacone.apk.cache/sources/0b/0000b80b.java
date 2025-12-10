package com.google.zxing.datamatrix.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;

/* loaded from: classes5.dex */
public final class Decoder {

    /* renamed from: a */
    public final ReedSolomonDecoder f57812a = new ReedSolomonDecoder(GenericGF.DATA_MATRIX_FIELD_256);

    /* renamed from: a */
    public final void m34114a(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f57812a.decode(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.getChecksumInstance();
        }
    }

    public DecoderResult decode(boolean[][] zArr) throws FormatException, ChecksumException {
        int length = zArr.length;
        BitMatrix bitMatrix = new BitMatrix(length);
        for (int i = 0; i < length; i++) {
            for (int i2 = 0; i2 < length; i2++) {
                if (zArr[i][i2]) {
                    bitMatrix.set(i2, i);
                }
            }
        }
        return decode(bitMatrix);
    }

    public DecoderResult decode(BitMatrix bitMatrix) throws FormatException, ChecksumException {
        C12451ob c12451ob = new C12451ob(bitMatrix);
        C9006a[] m34106b = C9006a.m34106b(c12451ob.m26104c(), c12451ob.m26105b());
        int i = 0;
        for (C9006a c9006a : m34106b) {
            i += c9006a.m34105c();
        }
        byte[] bArr = new byte[i];
        int length = m34106b.length;
        for (int i2 = 0; i2 < length; i2++) {
            C9006a c9006a2 = m34106b[i2];
            byte[] m34107a = c9006a2.m34107a();
            int m34105c = c9006a2.m34105c();
            m34114a(m34107a, m34105c);
            for (int i3 = 0; i3 < m34105c; i3++) {
                bArr[(i3 * length) + i2] = m34107a[i3];
            }
        }
        return DecodedBitStreamParser.m34123a(bArr);
    }
}