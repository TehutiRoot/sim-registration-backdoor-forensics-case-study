package com.google.zxing.qrcode.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import java.util.Map;

/* loaded from: classes5.dex */
public final class Decoder {

    /* renamed from: a */
    public final ReedSolomonDecoder f57970a = new ReedSolomonDecoder(GenericGF.QR_CODE_FIELD_256);

    /* renamed from: a */
    public final void m33926a(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f57970a.decode(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.getChecksumInstance();
        }
    }

    /* renamed from: b */
    public final DecoderResult m33925b(C9031a c9031a, Map map) {
        Version m33917e = c9031a.m33917e();
        ErrorCorrectionLevel m69143d = c9031a.m33918d().m69143d();
        C9032b[] m33913b = C9032b.m33913b(c9031a.m33919c(), m33917e, m69143d);
        int i = 0;
        for (C9032b c9032b : m33913b) {
            i += c9032b.m33912c();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (C9032b c9032b2 : m33913b) {
            byte[] m33914a = c9032b2.m33914a();
            int m33912c = c9032b2.m33912c();
            m33926a(m33914a, m33912c);
            int i3 = 0;
            while (i3 < m33912c) {
                bArr[i2] = m33914a[i3];
                i3++;
                i2++;
            }
        }
        return AbstractC10285gE.m31220a(bArr, m33917e, m69143d, map);
    }

    public DecoderResult decode(boolean[][] zArr) throws ChecksumException, FormatException {
        return decode(zArr, (Map<DecodeHintType, ?>) null);
    }

    public DecoderResult decode(boolean[][] zArr, Map<DecodeHintType, ?> map) throws ChecksumException, FormatException {
        int length = zArr.length;
        BitMatrix bitMatrix = new BitMatrix(length);
        for (int i = 0; i < length; i++) {
            for (int i2 = 0; i2 < length; i2++) {
                if (zArr[i][i2]) {
                    bitMatrix.set(i2, i);
                }
            }
        }
        return decode(bitMatrix, map);
    }

    public DecoderResult decode(BitMatrix bitMatrix) throws ChecksumException, FormatException {
        return decode(bitMatrix, (Map<DecodeHintType, ?>) null);
    }

    public DecoderResult decode(BitMatrix bitMatrix, Map<DecodeHintType, ?> map) throws FormatException, ChecksumException {
        ChecksumException e;
        C9031a c9031a = new C9031a(bitMatrix);
        FormatException formatException = null;
        try {
            return m33925b(c9031a, map);
        } catch (ChecksumException e2) {
            e = e2;
            try {
                c9031a.m33916f();
                c9031a.m33915g(true);
                c9031a.m33917e();
                c9031a.m33918d();
                c9031a.m33920b();
                DecoderResult m33925b = m33925b(c9031a, map);
                m33925b.setOther(new QRCodeDecoderMetaData(true));
                return m33925b;
            } catch (ChecksumException | FormatException e3) {
                if (formatException == null) {
                    if (e != null) {
                        throw e;
                    }
                    throw e3;
                }
                throw formatException;
            }
        } catch (FormatException e4) {
            e = null;
            formatException = e4;
            c9031a.m33916f();
            c9031a.m33915g(true);
            c9031a.m33917e();
            c9031a.m33918d();
            c9031a.m33920b();
            DecoderResult m33925b2 = m33925b(c9031a, map);
            m33925b2.setOther(new QRCodeDecoderMetaData(true));
            return m33925b2;
        }
    }
}
