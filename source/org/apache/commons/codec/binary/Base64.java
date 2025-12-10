package org.apache.commons.codec.binary;

import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import okio.Utf8;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.binary.BaseNCodec;

/* loaded from: classes6.dex */
public class Base64 extends BaseNCodec {

    /* renamed from: k */
    public static final byte[] f73026k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, Framer.EXIT_FRAME_PREFIX, 121, 122, 48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: l */
    public static final byte[] f73027l = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, Framer.EXIT_FRAME_PREFIX, 121, 122, 48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, Framer.STDIN_FRAME_PREFIX, Framer.STDIN_REQUEST_FRAME_PREFIX};

    /* renamed from: m */
    public static final byte[] f73028m = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, Utf8.REPLACEMENT_BYTE, 52, 53, 54, 55, 56, 57, 58, 59, 60, kotlin.p023io.encoding.Base64.padSymbol, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.f52684EM, -1, -1, -1, -1, Utf8.REPLACEMENT_BYTE, -1, Ascii.SUB, Ascii.ESC, Ascii.f52686FS, Ascii.f52687GS, Ascii.f52691RS, Ascii.f52695US, 32, Framer.ENTER_FRAME_PREFIX, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, Framer.STDIN_FRAME_PREFIX, 46, 47, 48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51};

    /* renamed from: f */
    public final byte[] f73029f;

    /* renamed from: g */
    public final byte[] f73030g;

    /* renamed from: h */
    public final byte[] f73031h;

    /* renamed from: i */
    public final int f73032i;

    /* renamed from: j */
    public final boolean f73033j;

    /* loaded from: classes6.dex */
    public static class Builder extends BaseNCodec.AbstractBuilder<Base64, Builder> {
        public Builder() {
            super(Base64.f73026k);
        }

        public Builder setUrlSafe(boolean z) {
            return setEncodeTable(Base64.m25677m(z));
        }

        @Override // java.util.function.Supplier
        public Base64 get() {
            return new Base64(m25663d(), m25662e(), m25661f(), m25664c(), m25665b());
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public static byte[] decodeBase64(byte[] bArr) {
        return new Base64().decode(bArr);
    }

    public static BigInteger decodeInteger(byte[] bArr) {
        return new BigInteger(1, decodeBase64(bArr));
    }

    public static byte[] encodeBase64(byte[] bArr) {
        return encodeBase64(bArr, false);
    }

    public static byte[] encodeBase64Chunked(byte[] bArr) {
        return encodeBase64(bArr, true);
    }

    public static String encodeBase64String(byte[] bArr) {
        return StringUtils.newStringUsAscii(encodeBase64(bArr, false));
    }

    public static byte[] encodeBase64URLSafe(byte[] bArr) {
        return encodeBase64(bArr, false, true);
    }

    public static String encodeBase64URLSafeString(byte[] bArr) {
        return StringUtils.newStringUsAscii(encodeBase64(bArr, false, true));
    }

    public static byte[] encodeInteger(BigInteger bigInteger) {
        Objects.requireNonNull(bigInteger, "bigInteger");
        return encodeBase64(m25678l(bigInteger), false);
    }

    @Deprecated
    public static boolean isArrayByteBase64(byte[] bArr) {
        return isBase64(bArr);
    }

    public static boolean isBase64(byte b) {
        if (b != 61) {
            if (b >= 0) {
                byte[] bArr = f73028m;
                if (b >= bArr.length || bArr[b] == -1) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static byte[] m25678l(BigInteger bigInteger) {
        int bitLength = ((bigInteger.bitLength() + 7) >> 3) << 3;
        byte[] byteArray = bigInteger.toByteArray();
        int i = 1;
        if (bigInteger.bitLength() % 8 != 0 && (bigInteger.bitLength() / 8) + 1 == bitLength / 8) {
            return byteArray;
        }
        int length = byteArray.length;
        if (bigInteger.bitLength() % 8 == 0) {
            length--;
        } else {
            i = 0;
        }
        int i2 = bitLength / 8;
        int i3 = i2 - length;
        byte[] bArr = new byte[i2];
        System.arraycopy(byteArray, i, bArr, i3, length);
        return bArr;
    }

    /* renamed from: m */
    public static byte[] m25677m(boolean z) {
        if (z) {
            return f73027l;
        }
        return f73026k;
    }

    /* renamed from: o */
    private void m25675o() {
        if (!isStrictDecoding()) {
            return;
        }
        throw new IllegalArgumentException("Strict decoding: Last encoded character (before the paddings if any) is a valid base 64 alphabet but not a possible encoding. Decoding requires at least two trailing 6-bit characters to create bytes.");
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    /* renamed from: c */
    public void mo25672c(byte[] bArr, int i, int i2, BaseNCodec.C12485a c12485a) {
        byte b;
        if (c12485a.f73050f) {
            return;
        }
        if (i2 < 0) {
            c12485a.f73050f = true;
        }
        int i3 = this.f73032i - 1;
        int i4 = 0;
        while (true) {
            if (i4 >= i2) {
                break;
            }
            byte[] ensureBufferSize = ensureBufferSize(i3, c12485a);
            int i5 = i + 1;
            byte b2 = bArr[i];
            if (b2 == this.pad) {
                c12485a.f73050f = true;
                break;
            }
            if (b2 >= 0) {
                byte[] bArr2 = this.f73030g;
                if (b2 < bArr2.length && (b = bArr2[b2]) >= 0) {
                    int i6 = (c12485a.f73052h + 1) % 4;
                    c12485a.f73052h = i6;
                    int i7 = (c12485a.f73045a << 6) + b;
                    c12485a.f73045a = i7;
                    if (i6 == 0) {
                        int i8 = c12485a.f73048d;
                        int i9 = i8 + 1;
                        c12485a.f73048d = i9;
                        ensureBufferSize[i8] = (byte) ((i7 >> 16) & 255);
                        int i10 = i8 + 2;
                        c12485a.f73048d = i10;
                        ensureBufferSize[i9] = (byte) ((i7 >> 8) & 255);
                        c12485a.f73048d = i8 + 3;
                        ensureBufferSize[i10] = (byte) (i7 & 255);
                    }
                }
            }
            i4++;
            i = i5;
        }
        if (c12485a.f73050f && c12485a.f73052h != 0) {
            byte[] ensureBufferSize2 = ensureBufferSize(i3, c12485a);
            int i11 = c12485a.f73052h;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        m25676n(3, c12485a);
                        int i12 = c12485a.f73045a;
                        int i13 = i12 >> 2;
                        c12485a.f73045a = i13;
                        int i14 = c12485a.f73048d;
                        int i15 = i14 + 1;
                        c12485a.f73048d = i15;
                        ensureBufferSize2[i14] = (byte) ((i12 >> 10) & 255);
                        c12485a.f73048d = i14 + 2;
                        ensureBufferSize2[i15] = (byte) (i13 & 255);
                        return;
                    }
                    throw new IllegalStateException("Impossible modulus " + c12485a.f73052h);
                }
                m25676n(15, c12485a);
                int i16 = c12485a.f73045a >> 4;
                c12485a.f73045a = i16;
                int i17 = c12485a.f73048d;
                c12485a.f73048d = i17 + 1;
                ensureBufferSize2[i17] = (byte) (i16 & 255);
                return;
            }
            m25675o();
        }
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    /* renamed from: d */
    public void mo25671d(byte[] bArr, int i, int i2, BaseNCodec.C12485a c12485a) {
        if (c12485a.f73050f) {
            return;
        }
        if (i2 < 0) {
            c12485a.f73050f = true;
            if (c12485a.f73052h == 0 && this.lineLength == 0) {
                return;
            }
            byte[] ensureBufferSize = ensureBufferSize(this.f73032i, c12485a);
            int i3 = c12485a.f73048d;
            int i4 = c12485a.f73052h;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        int i5 = i3 + 1;
                        c12485a.f73048d = i5;
                        byte[] bArr2 = this.f73029f;
                        int i6 = c12485a.f73045a;
                        ensureBufferSize[i3] = bArr2[(i6 >> 10) & 63];
                        int i7 = i3 + 2;
                        c12485a.f73048d = i7;
                        ensureBufferSize[i5] = bArr2[(i6 >> 4) & 63];
                        int i8 = i3 + 3;
                        c12485a.f73048d = i8;
                        ensureBufferSize[i7] = bArr2[(i6 << 2) & 63];
                        if (bArr2 == f73026k) {
                            c12485a.f73048d = i3 + 4;
                            ensureBufferSize[i8] = this.pad;
                        }
                    } else {
                        throw new IllegalStateException("Impossible modulus " + c12485a.f73052h);
                    }
                } else {
                    int i9 = i3 + 1;
                    c12485a.f73048d = i9;
                    byte[] bArr3 = this.f73029f;
                    int i10 = c12485a.f73045a;
                    ensureBufferSize[i3] = bArr3[(i10 >> 2) & 63];
                    int i11 = i3 + 2;
                    c12485a.f73048d = i11;
                    ensureBufferSize[i9] = bArr3[(i10 << 4) & 63];
                    if (bArr3 == f73026k) {
                        int i12 = i3 + 3;
                        c12485a.f73048d = i12;
                        byte b = this.pad;
                        ensureBufferSize[i11] = b;
                        c12485a.f73048d = i3 + 4;
                        ensureBufferSize[i12] = b;
                    }
                }
            }
            int i13 = c12485a.f73051g;
            int i14 = c12485a.f73048d;
            int i15 = i13 + (i14 - i3);
            c12485a.f73051g = i15;
            if (this.lineLength > 0 && i15 > 0) {
                byte[] bArr4 = this.f73031h;
                System.arraycopy(bArr4, 0, ensureBufferSize, i14, bArr4.length);
                c12485a.f73048d += this.f73031h.length;
                return;
            }
            return;
        }
        int i16 = 0;
        while (i16 < i2) {
            byte[] ensureBufferSize2 = ensureBufferSize(this.f73032i, c12485a);
            int i17 = (c12485a.f73052h + 1) % 3;
            c12485a.f73052h = i17;
            int i18 = i + 1;
            int i19 = bArr[i];
            if (i19 < 0) {
                i19 += 256;
            }
            int i20 = (c12485a.f73045a << 8) + i19;
            c12485a.f73045a = i20;
            if (i17 == 0) {
                int i21 = c12485a.f73048d;
                int i22 = i21 + 1;
                c12485a.f73048d = i22;
                byte[] bArr5 = this.f73029f;
                ensureBufferSize2[i21] = bArr5[(i20 >> 18) & 63];
                int i23 = i21 + 2;
                c12485a.f73048d = i23;
                ensureBufferSize2[i22] = bArr5[(i20 >> 12) & 63];
                int i24 = i21 + 3;
                c12485a.f73048d = i24;
                ensureBufferSize2[i23] = bArr5[(i20 >> 6) & 63];
                int i25 = i21 + 4;
                c12485a.f73048d = i25;
                ensureBufferSize2[i24] = bArr5[i20 & 63];
                int i26 = c12485a.f73051g + 4;
                c12485a.f73051g = i26;
                int i27 = this.lineLength;
                if (i27 > 0 && i27 <= i26) {
                    byte[] bArr6 = this.f73031h;
                    System.arraycopy(bArr6, 0, ensureBufferSize2, i25, bArr6.length);
                    c12485a.f73048d += this.f73031h.length;
                    c12485a.f73051g = 0;
                }
            }
            i16++;
            i = i18;
        }
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    public boolean isInAlphabet(byte b) {
        if (b >= 0) {
            byte[] bArr = this.f73030g;
            if (b < bArr.length && bArr[b] != -1) {
                return true;
            }
        }
        return false;
    }

    public boolean isUrlSafe() {
        return this.f73033j;
    }

    /* renamed from: k */
    public final byte[] m25679k(byte[] bArr) {
        byte[] bArr2 = new byte[256];
        Arrays.fill(bArr2, (byte) -1);
        for (int i = 0; i < bArr.length; i++) {
            bArr2[bArr[i]] = (byte) i;
        }
        return bArr2;
    }

    /* renamed from: n */
    public final void m25676n(int i, BaseNCodec.C12485a c12485a) {
        if (isStrictDecoding() && (i & c12485a.f73045a) != 0) {
            throw new IllegalArgumentException("Strict decoding: Last encoded character (before the paddings if any) is a valid base 64 alphabet but not a possible encoding. Expected the discarded bits from the character to be zero.");
        }
    }

    public Base64() {
        this(0);
    }

    public static byte[] decodeBase64(String str) {
        return new Base64().decode(str);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z) {
        return encodeBase64(bArr, z, false);
    }

    public static boolean isBase64(byte[] bArr) {
        for (byte b : bArr) {
            if (!isBase64(b) && !Character.isWhitespace(b)) {
                return false;
            }
        }
        return true;
    }

    public Base64(boolean z) {
        this(76, BaseNCodec.f73034e, z);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z, boolean z2) {
        return encodeBase64(bArr, z, z2, Integer.MAX_VALUE);
    }

    public Base64(int i) {
        this(i, BaseNCodec.f73034e);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z, boolean z2, int i) {
        if (BinaryCodec.m25659a(bArr)) {
            return bArr;
        }
        Base64 base64 = z ? new Base64(z2) : new Base64(0, BaseNCodec.f73034e, z2);
        long encodedLength = base64.getEncodedLength(bArr);
        if (encodedLength <= i) {
            return base64.encode(bArr);
        }
        throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + encodedLength + ") than the specified maximum size of " + i);
    }

    public static boolean isBase64(String str) {
        return isBase64(StringUtils.getBytesUtf8(str));
    }

    public Base64(int i, byte[] bArr) {
        this(i, bArr, false);
    }

    public Base64(int i, byte[] bArr, boolean z) {
        this(i, bArr, kotlin.p023io.encoding.Base64.padSymbol, m25677m(z), BaseNCodec.DECODING_POLICY_DEFAULT);
    }

    public Base64(int i, byte[] bArr, boolean z, CodecPolicy codecPolicy) {
        this(i, bArr, kotlin.p023io.encoding.Base64.padSymbol, m25677m(z), codecPolicy);
    }

    public Base64(int i, byte[] bArr, byte b, byte[] bArr2, CodecPolicy codecPolicy) {
        super(3, 4, i, BaseNCodec.m25667h(bArr), b, codecPolicy);
        Objects.requireNonNull(bArr2, "encodeTable");
        if (bArr2.length == 64) {
            boolean z = bArr2 == f73027l;
            this.f73033j = z;
            if (bArr2 != f73026k && !z) {
                byte[] bArr3 = (byte[]) bArr2.clone();
                this.f73029f = bArr3;
                this.f73030g = m25679k(bArr3);
            } else {
                this.f73030g = f73028m;
                this.f73029f = bArr2;
            }
            if (bArr != null) {
                byte[] bArr4 = (byte[]) bArr.clone();
                if (containsAlphabetOrPad(bArr4)) {
                    String newStringUtf8 = StringUtils.newStringUtf8(bArr4);
                    throw new IllegalArgumentException("lineSeparator must not contain base64 characters: [" + newStringUtf8 + "]");
                } else if (i > 0) {
                    this.f73032i = bArr4.length + 4;
                    this.f73031h = bArr4;
                    return;
                } else {
                    this.f73032i = 4;
                    this.f73031h = null;
                    return;
                }
            }
            this.f73032i = 4;
            this.f73031h = null;
            return;
        }
        throw new IllegalArgumentException("encodeTable must have exactly 64 entries.");
    }
}
