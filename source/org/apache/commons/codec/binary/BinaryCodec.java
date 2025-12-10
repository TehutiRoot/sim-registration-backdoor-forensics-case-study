package org.apache.commons.codec.binary;

import com.facebook.stetho.dumpapp.Framer;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

/* loaded from: classes6.dex */
public class BinaryCodec implements BinaryDecoder, BinaryEncoder {

    /* renamed from: a */
    public static final char[] f73062a = new char[0];

    /* renamed from: b */
    public static final byte[] f73063b = new byte[0];

    /* renamed from: c */
    public static final int[] f73064c = {1, 2, 4, 8, 16, 32, 64, 128};

    /* renamed from: a */
    public static boolean m25659a(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            return false;
        }
        return true;
    }

    public static byte[] fromAscii(byte[] bArr) {
        if (m25659a(bArr)) {
            return f73063b;
        }
        int length = bArr.length;
        int i = length >> 3;
        byte[] bArr2 = new byte[i];
        int i2 = length - 1;
        int i3 = 0;
        while (i3 < i) {
            int i4 = 0;
            while (true) {
                int[] iArr = f73064c;
                if (i4 < iArr.length) {
                    if (bArr[i2 - i4] == 49) {
                        bArr2[i3] = (byte) (iArr[i4] | bArr2[i3]);
                    }
                    i4++;
                }
            }
            i3++;
            i2 -= 8;
        }
        return bArr2;
    }

    public static byte[] toAsciiBytes(byte[] bArr) {
        if (m25659a(bArr)) {
            return f73063b;
        }
        int length = bArr.length;
        int i = length << 3;
        byte[] bArr2 = new byte[i];
        int i2 = i - 1;
        int i3 = 0;
        while (i3 < length) {
            int i4 = 0;
            while (true) {
                int[] iArr = f73064c;
                if (i4 < iArr.length) {
                    if ((iArr[i4] & bArr[i3]) == 0) {
                        bArr2[i2 - i4] = 48;
                    } else {
                        bArr2[i2 - i4] = Framer.STDOUT_FRAME_PREFIX;
                    }
                    i4++;
                }
            }
            i3++;
            i2 -= 8;
        }
        return bArr2;
    }

    public static char[] toAsciiChars(byte[] bArr) {
        if (m25659a(bArr)) {
            return f73062a;
        }
        int length = bArr.length;
        int i = length << 3;
        char[] cArr = new char[i];
        int i2 = i - 1;
        int i3 = 0;
        while (i3 < length) {
            int i4 = 0;
            while (true) {
                int[] iArr = f73064c;
                if (i4 < iArr.length) {
                    if ((iArr[i4] & bArr[i3]) == 0) {
                        cArr[i2 - i4] = '0';
                    } else {
                        cArr[i2 - i4] = '1';
                    }
                    i4++;
                }
            }
            i3++;
            i2 -= 8;
        }
        return cArr;
    }

    public static String toAsciiString(byte[] bArr) {
        return new String(toAsciiChars(bArr));
    }

    @Override // org.apache.commons.codec.BinaryDecoder
    public byte[] decode(byte[] bArr) {
        return fromAscii(bArr);
    }

    @Override // org.apache.commons.codec.BinaryEncoder
    public byte[] encode(byte[] bArr) {
        return toAsciiBytes(bArr);
    }

    public byte[] toByteArray(String str) {
        if (str == null) {
            return f73063b;
        }
        return fromAscii(str.toCharArray());
    }

    @Override // org.apache.commons.codec.Decoder
    public Object decode(Object obj) throws DecoderException {
        if (obj == null) {
            return f73063b;
        }
        if (obj instanceof byte[]) {
            return fromAscii((byte[]) obj);
        }
        if (obj instanceof char[]) {
            return fromAscii((char[]) obj);
        }
        if (obj instanceof String) {
            return fromAscii(((String) obj).toCharArray());
        }
        throw new DecoderException("argument not a byte array");
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof byte[]) {
            return toAsciiChars((byte[]) obj);
        }
        throw new EncoderException("argument not a byte array");
    }

    public static byte[] fromAscii(char[] cArr) {
        if (cArr != null && cArr.length != 0) {
            int length = cArr.length;
            int i = length >> 3;
            byte[] bArr = new byte[i];
            int i2 = length - 1;
            int i3 = 0;
            while (i3 < i) {
                int i4 = 0;
                while (true) {
                    int[] iArr = f73064c;
                    if (i4 < iArr.length) {
                        if (cArr[i2 - i4] == '1') {
                            bArr[i3] = (byte) (iArr[i4] | bArr[i3]);
                        }
                        i4++;
                    }
                }
                i3++;
                i2 -= 8;
            }
            return bArr;
        }
        return f73063b;
    }
}
