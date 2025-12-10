package org.apache.commons.codec.net;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.BitSet;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringDecoder;
import org.apache.commons.codec.StringEncoder;
import org.apache.commons.codec.binary.StringUtils;

/* loaded from: classes6.dex */
public class QuotedPrintableCodec implements BinaryEncoder, BinaryDecoder, StringEncoder, StringDecoder {

    /* renamed from: c */
    public static final BitSet f73224c = new BitSet(256);

    /* renamed from: a */
    public final Charset f73225a;

    /* renamed from: b */
    public final boolean f73226b;

    static {
        for (int i = 33; i <= 60; i++) {
            f73224c.set(i);
        }
        for (int i2 = 62; i2 <= 126; i2++) {
            f73224c.set(i2);
        }
        BitSet bitSet = f73224c;
        bitSet.set(9);
        bitSet.set(32);
    }

    public QuotedPrintableCodec() {
        this(StandardCharsets.UTF_8, false);
    }

    /* renamed from: a */
    public static int m25433a(int i, boolean z, ByteArrayOutputStream byteArrayOutputStream) {
        if (z) {
            return m25432b(i, byteArrayOutputStream);
        }
        byteArrayOutputStream.write(i);
        return 1;
    }

    /* renamed from: b */
    public static final int m25432b(int i, ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.write(61);
        char m68131b = H02.m68131b(i >> 4);
        char m68131b2 = H02.m68131b(i);
        byteArrayOutputStream.write(m68131b);
        byteArrayOutputStream.write(m68131b2);
        return 3;
    }

    /* renamed from: c */
    public static int m25431c(int i, byte[] bArr) {
        byte b = bArr[i];
        if (b < 0) {
            return b + 256;
        }
        return b;
    }

    /* renamed from: d */
    public static boolean m25430d(int i) {
        return i == 32 || i == 9;
    }

    public static final byte[] decodeQuotedPrintable(byte[] bArr) throws DecoderException {
        if (bArr == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i < bArr.length) {
            byte b = bArr[i];
            if (b == 61) {
                int i2 = i + 1;
                try {
                    byte b2 = bArr[i2];
                    if (b2 == 13) {
                        i = i2;
                    } else {
                        i += 2;
                        byteArrayOutputStream.write((char) ((H02.m68132a(b2) << 4) + H02.m68132a(bArr[i])));
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new DecoderException("Invalid quoted-printable encoding", e);
                }
            } else if (b != 13 && b != 10) {
                byteArrayOutputStream.write(b);
            }
            i++;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static final byte[] encodeQuotedPrintable(BitSet bitSet, byte[] bArr) {
        return encodeQuotedPrintable(bitSet, bArr, false);
    }

    @Override // org.apache.commons.codec.BinaryDecoder
    public byte[] decode(byte[] bArr) throws DecoderException {
        return decodeQuotedPrintable(bArr);
    }

    @Override // org.apache.commons.codec.BinaryEncoder
    public byte[] encode(byte[] bArr) {
        return encodeQuotedPrintable(f73224c, bArr, this.f73226b);
    }

    public Charset getCharset() {
        return this.f73225a;
    }

    public String getDefaultCharset() {
        return this.f73225a.name();
    }

    public QuotedPrintableCodec(boolean z) {
        this(StandardCharsets.UTF_8, z);
    }

    public static final byte[] encodeQuotedPrintable(BitSet bitSet, byte[] bArr, boolean z) {
        int i;
        if (bArr == null) {
            return null;
        }
        if (bitSet == null) {
            bitSet = f73224c;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int length = bArr.length;
        if (!z) {
            int length2 = bArr.length;
            for (int i2 = 0; i2 < length2; i2++) {
                int i3 = bArr[i2];
                if (i3 < 0) {
                    i3 += 256;
                }
                if (bitSet.get(i3)) {
                    byteArrayOutputStream.write(i3);
                } else {
                    m25432b(i3, byteArrayOutputStream);
                }
            }
        } else if (length < 3) {
            return null;
        } else {
            int i4 = 0;
            int i5 = 1;
            while (true) {
                i = length - 3;
                if (i4 >= i) {
                    break;
                }
                int m25431c = m25431c(i4, bArr);
                if (i5 < 73) {
                    i5 += m25433a(m25431c, !bitSet.get(m25431c), byteArrayOutputStream);
                } else {
                    m25433a(m25431c, !bitSet.get(m25431c) || m25430d(m25431c), byteArrayOutputStream);
                    byteArrayOutputStream.write(61);
                    byteArrayOutputStream.write(13);
                    byteArrayOutputStream.write(10);
                    i5 = 1;
                }
                i4++;
            }
            int m25431c2 = m25431c(i, bArr);
            if (i5 + m25433a(m25431c2, !bitSet.get(m25431c2) || (m25430d(m25431c2) && i5 > 68), byteArrayOutputStream) > 71) {
                byteArrayOutputStream.write(61);
                byteArrayOutputStream.write(13);
                byteArrayOutputStream.write(10);
            }
            int i6 = length - 2;
            int i7 = i6;
            while (i7 < length) {
                int m25431c3 = m25431c(i7, bArr);
                m25433a(m25431c3, !bitSet.get(m25431c3) || (i7 > i6 && m25430d(m25431c3)), byteArrayOutputStream);
                i7++;
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // org.apache.commons.codec.Decoder
    public Object decode(Object obj) throws DecoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            return decode((byte[]) obj);
        }
        if (obj instanceof String) {
            return decode((String) obj);
        }
        throw new DecoderException("Objects of type " + obj.getClass().getName() + " cannot be quoted-printable decoded");
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            return encode((byte[]) obj);
        }
        if (obj instanceof String) {
            return encode((String) obj);
        }
        throw new EncoderException("Objects of type " + obj.getClass().getName() + " cannot be quoted-printable encoded");
    }

    public QuotedPrintableCodec(Charset charset) {
        this(charset, false);
    }

    public QuotedPrintableCodec(Charset charset, boolean z) {
        this.f73225a = charset;
        this.f73226b = z;
    }

    public QuotedPrintableCodec(String str) throws IllegalCharsetNameException, IllegalArgumentException, UnsupportedCharsetException {
        this(Charset.forName(str), false);
    }

    @Override // org.apache.commons.codec.StringDecoder
    public String decode(String str) throws DecoderException {
        return decode(str, getCharset());
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) throws EncoderException {
        return encode(str, getCharset());
    }

    public String decode(String str, Charset charset) throws DecoderException {
        if (str == null) {
            return null;
        }
        return new String(decode(StringUtils.getBytesUsAscii(str)), charset);
    }

    public String encode(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        return StringUtils.newStringUsAscii(encode(str.getBytes(charset)));
    }

    public String decode(String str, String str2) throws DecoderException, UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        return new String(decode(StringUtils.getBytesUsAscii(str)), str2);
    }

    public String encode(String str, String str2) throws UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        return StringUtils.newStringUsAscii(encode(str.getBytes(str2)));
    }
}
