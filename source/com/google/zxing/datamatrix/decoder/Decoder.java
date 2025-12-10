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
    public final ReedSolomonDecoder f57800a = new ReedSolomonDecoder(GenericGF.DATA_MATRIX_FIELD_256);

    /* renamed from: a */
    public final void m34122a(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f57800a.decode(iArr, bArr.length - i);
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
        C9017a[] m34114b = C9017a.m34114b(c12451ob.m25911c(), c12451ob.m25912b());
        int i = 0;
        for (C9017a c9017a : m34114b) {
            i += c9017a.m34113c();
        }
        byte[] bArr = new byte[i];
        int length = m34114b.length;
        for (int i2 = 0; i2 < length; i2++) {
            C9017a c9017a2 = m34114b[i2];
            byte[] m34115a = c9017a2.m34115a();
            int m34113c = c9017a2.m34113c();
            m34122a(m34115a, m34113c);
            for (int i3 = 0; i3 < m34113c; i3++) {
                bArr[(i3 * length) + i2] = m34115a[i3];
            }
        }
        return DecodedBitStreamParser.m34131a(bArr);
    }
}
