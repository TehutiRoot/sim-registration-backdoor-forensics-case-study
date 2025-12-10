package org.apache.commons.codec.binary;

import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import java.util.Objects;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.binary.BaseNCodec;

/* loaded from: classes6.dex */
public class Base32 extends BaseNCodec {

    /* renamed from: j */
    public static final byte[] f73102j = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Ascii.SUB, Ascii.ESC, Ascii.f52698FS, Ascii.f52699GS, Ascii.f52703RS, Ascii.f52707US, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.f52696EM, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.f52696EM};

    /* renamed from: k */
    public static final byte[] f73103k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55};

    /* renamed from: l */
    public static final byte[] f73104l = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.f52696EM, Ascii.SUB, Ascii.ESC, Ascii.f52698FS, Ascii.f52699GS, Ascii.f52703RS, Ascii.f52707US, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.f52696EM, Ascii.SUB, Ascii.ESC, Ascii.f52698FS, Ascii.f52699GS, Ascii.f52703RS, Ascii.f52707US};

    /* renamed from: m */
    public static final byte[] f73105m = {48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86};

    /* renamed from: f */
    public final byte[] f73106f;

    /* renamed from: g */
    public final int f73107g;

    /* renamed from: h */
    public final byte[] f73108h;

    /* renamed from: i */
    public final byte[] f73109i;

    /* loaded from: classes6.dex */
    public static class Builder extends BaseNCodec.AbstractBuilder<Base32, Builder> {
        public Builder() {
            super(Base32.f73103k);
        }

        @Override // java.util.function.Supplier
        public Base32 get() {
            return new Base32(m25853d(), m25852e(), m25854c(), m25851f(), m25855b());
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v24 */
    @Override // org.apache.commons.codec.binary.BaseNCodec
    /* renamed from: c */
    public void mo25862c(byte[] bArr, int i, int i2, BaseNCodec.C12485a c12485a) {
        int i3;
        byte b;
        if (c12485a.f73134f) {
            return;
        }
        ?? r3 = 1;
        if (i2 < 0) {
            c12485a.f73134f = true;
        }
        int i4 = this.f73107g - 1;
        int i5 = i;
        int i6 = 0;
        while (true) {
            if (i6 >= i2) {
                break;
            }
            int i7 = i5 + 1;
            byte b2 = bArr[i5];
            if (b2 == this.pad) {
                c12485a.f73134f = r3;
                break;
            }
            byte[] ensureBufferSize = ensureBufferSize(i4, c12485a);
            if (b2 >= 0) {
                byte[] bArr2 = this.f73106f;
                if (b2 < bArr2.length && (b = bArr2[b2]) >= 0) {
                    int i8 = (c12485a.f73136h + r3) % 8;
                    c12485a.f73136h = i8;
                    i3 = i4;
                    long j = (c12485a.f73130b << 5) + b;
                    c12485a.f73130b = j;
                    if (i8 == 0) {
                        int i9 = c12485a.f73132d;
                        int i10 = i9 + 1;
                        c12485a.f73132d = i10;
                        ensureBufferSize[i9] = (byte) ((j >> 32) & 255);
                        int i11 = i9 + 2;
                        c12485a.f73132d = i11;
                        ensureBufferSize[i10] = (byte) ((j >> 24) & 255);
                        int i12 = i9 + 3;
                        c12485a.f73132d = i12;
                        ensureBufferSize[i11] = (byte) ((j >> 16) & 255);
                        int i13 = i9 + 4;
                        c12485a.f73132d = i13;
                        ensureBufferSize[i12] = (byte) ((j >> 8) & 255);
                        c12485a.f73132d = i9 + 5;
                        ensureBufferSize[i13] = (byte) (j & 255);
                    }
                    i6++;
                    i5 = i7;
                    i4 = i3;
                    r3 = 1;
                }
            }
            i3 = i4;
            i6++;
            i5 = i7;
            i4 = i3;
            r3 = 1;
        }
        int i14 = i4;
        if (c12485a.f73134f && c12485a.f73136h > 0) {
            byte[] ensureBufferSize2 = ensureBufferSize(i14, c12485a);
            switch (c12485a.f73136h) {
                case 1:
                    m25872k();
                    break;
                case 2:
                    break;
                case 3:
                    m25872k();
                    int i15 = c12485a.f73132d;
                    c12485a.f73132d = i15 + 1;
                    ensureBufferSize2[i15] = (byte) ((c12485a.f73130b >> 7) & 255);
                    return;
                case 4:
                    m25873j(15L, c12485a);
                    long j2 = c12485a.f73130b;
                    long j3 = j2 >> 4;
                    c12485a.f73130b = j3;
                    int i16 = c12485a.f73132d;
                    int i17 = i16 + 1;
                    c12485a.f73132d = i17;
                    ensureBufferSize2[i16] = (byte) ((j2 >> 12) & 255);
                    c12485a.f73132d = i16 + 2;
                    ensureBufferSize2[i17] = (byte) (j3 & 255);
                    return;
                case 5:
                    m25873j(1L, c12485a);
                    long j4 = c12485a.f73130b;
                    long j5 = j4 >> 1;
                    c12485a.f73130b = j5;
                    int i18 = c12485a.f73132d;
                    int i19 = i18 + 1;
                    c12485a.f73132d = i19;
                    ensureBufferSize2[i18] = (byte) ((j4 >> 17) & 255);
                    int i20 = i18 + 2;
                    c12485a.f73132d = i20;
                    ensureBufferSize2[i19] = (byte) ((j4 >> 9) & 255);
                    c12485a.f73132d = i18 + 3;
                    ensureBufferSize2[i20] = (byte) (j5 & 255);
                    return;
                case 6:
                    m25872k();
                    long j6 = c12485a.f73130b;
                    long j7 = j6 >> 6;
                    c12485a.f73130b = j7;
                    int i21 = c12485a.f73132d;
                    int i22 = i21 + 1;
                    c12485a.f73132d = i22;
                    ensureBufferSize2[i21] = (byte) ((j6 >> 22) & 255);
                    int i23 = i21 + 2;
                    c12485a.f73132d = i23;
                    ensureBufferSize2[i22] = (byte) ((j6 >> 14) & 255);
                    c12485a.f73132d = i21 + 3;
                    ensureBufferSize2[i23] = (byte) (j7 & 255);
                    return;
                case 7:
                    m25873j(7L, c12485a);
                    long j8 = c12485a.f73130b;
                    long j9 = j8 >> 3;
                    c12485a.f73130b = j9;
                    int i24 = c12485a.f73132d;
                    int i25 = i24 + 1;
                    c12485a.f73132d = i25;
                    ensureBufferSize2[i24] = (byte) ((j8 >> 27) & 255);
                    int i26 = i24 + 2;
                    c12485a.f73132d = i26;
                    ensureBufferSize2[i25] = (byte) ((j8 >> 19) & 255);
                    int i27 = i24 + 3;
                    c12485a.f73132d = i27;
                    ensureBufferSize2[i26] = (byte) ((j8 >> 11) & 255);
                    c12485a.f73132d = i24 + 4;
                    ensureBufferSize2[i27] = (byte) (j9 & 255);
                    return;
                default:
                    throw new IllegalStateException("Impossible modulus " + c12485a.f73136h);
            }
            m25873j(3L, c12485a);
            int i28 = c12485a.f73132d;
            c12485a.f73132d = i28 + 1;
            ensureBufferSize2[i28] = (byte) ((c12485a.f73130b >> 2) & 255);
        }
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    /* renamed from: d */
    public void mo25861d(byte[] bArr, int i, int i2, BaseNCodec.C12485a c12485a) {
        int i3;
        if (c12485a.f73134f) {
            return;
        }
        int i4 = 1;
        if (i2 >= 0) {
            int i5 = i;
            int i6 = 0;
            while (i6 < i2) {
                byte[] ensureBufferSize = ensureBufferSize(this.f73107g, c12485a);
                int i7 = (c12485a.f73136h + i4) % 5;
                c12485a.f73136h = i7;
                int i8 = i5 + 1;
                int i9 = bArr[i5];
                if (i9 < 0) {
                    i9 += 256;
                }
                long j = (c12485a.f73130b << 8) + i9;
                c12485a.f73130b = j;
                if (i7 == 0) {
                    int i10 = c12485a.f73132d;
                    int i11 = i10 + 1;
                    c12485a.f73132d = i11;
                    byte[] bArr2 = this.f73108h;
                    ensureBufferSize[i10] = bArr2[((int) (j >> 35)) & 31];
                    int i12 = i10 + 2;
                    c12485a.f73132d = i12;
                    i3 = i8;
                    ensureBufferSize[i11] = bArr2[((int) (j >> 30)) & 31];
                    int i13 = i10 + 3;
                    c12485a.f73132d = i13;
                    ensureBufferSize[i12] = bArr2[((int) (j >> 25)) & 31];
                    int i14 = i10 + 4;
                    c12485a.f73132d = i14;
                    ensureBufferSize[i13] = bArr2[((int) (j >> 20)) & 31];
                    int i15 = i10 + 5;
                    c12485a.f73132d = i15;
                    ensureBufferSize[i14] = bArr2[((int) (j >> 15)) & 31];
                    int i16 = i10 + 6;
                    c12485a.f73132d = i16;
                    ensureBufferSize[i15] = bArr2[((int) (j >> 10)) & 31];
                    int i17 = i10 + 7;
                    c12485a.f73132d = i17;
                    ensureBufferSize[i16] = bArr2[((int) (j >> 5)) & 31];
                    int i18 = i10 + 8;
                    c12485a.f73132d = i18;
                    ensureBufferSize[i17] = bArr2[((int) j) & 31];
                    int i19 = c12485a.f73135g + 8;
                    c12485a.f73135g = i19;
                    int i20 = this.lineLength;
                    if (i20 > 0 && i20 <= i19) {
                        byte[] bArr3 = this.f73109i;
                        System.arraycopy(bArr3, 0, ensureBufferSize, i18, bArr3.length);
                        c12485a.f73132d += this.f73109i.length;
                        c12485a.f73135g = 0;
                        i6++;
                        i5 = i3;
                        i4 = 1;
                    }
                } else {
                    i3 = i8;
                }
                i6++;
                i5 = i3;
                i4 = 1;
            }
            return;
        }
        c12485a.f73134f = true;
        if (c12485a.f73136h == 0 && this.lineLength == 0) {
            return;
        }
        byte[] ensureBufferSize2 = ensureBufferSize(this.f73107g, c12485a);
        int i21 = c12485a.f73132d;
        int i22 = c12485a.f73136h;
        if (i22 != 0) {
            if (i22 == 1) {
                int i23 = i21 + 1;
                c12485a.f73132d = i23;
                byte[] bArr4 = this.f73108h;
                long j2 = c12485a.f73130b;
                ensureBufferSize2[i21] = bArr4[((int) (j2 >> 3)) & 31];
                int i24 = i21 + 2;
                c12485a.f73132d = i24;
                ensureBufferSize2[i23] = bArr4[((int) (j2 << 2)) & 31];
                int i25 = i21 + 3;
                c12485a.f73132d = i25;
                byte b = this.pad;
                ensureBufferSize2[i24] = b;
                int i26 = i21 + 4;
                c12485a.f73132d = i26;
                ensureBufferSize2[i25] = b;
                int i27 = i21 + 5;
                c12485a.f73132d = i27;
                ensureBufferSize2[i26] = b;
                int i28 = i21 + 6;
                c12485a.f73132d = i28;
                ensureBufferSize2[i27] = b;
                int i29 = i21 + 7;
                c12485a.f73132d = i29;
                ensureBufferSize2[i28] = b;
                c12485a.f73132d = i21 + 8;
                ensureBufferSize2[i29] = b;
            } else if (i22 == 2) {
                int i30 = i21 + 1;
                c12485a.f73132d = i30;
                byte[] bArr5 = this.f73108h;
                long j3 = c12485a.f73130b;
                ensureBufferSize2[i21] = bArr5[((int) (j3 >> 11)) & 31];
                int i31 = i21 + 2;
                c12485a.f73132d = i31;
                ensureBufferSize2[i30] = bArr5[((int) (j3 >> 6)) & 31];
                int i32 = i21 + 3;
                c12485a.f73132d = i32;
                ensureBufferSize2[i31] = bArr5[((int) (j3 >> 1)) & 31];
                int i33 = i21 + 4;
                c12485a.f73132d = i33;
                ensureBufferSize2[i32] = bArr5[((int) (j3 << 4)) & 31];
                int i34 = i21 + 5;
                c12485a.f73132d = i34;
                byte b2 = this.pad;
                ensureBufferSize2[i33] = b2;
                int i35 = i21 + 6;
                c12485a.f73132d = i35;
                ensureBufferSize2[i34] = b2;
                int i36 = i21 + 7;
                c12485a.f73132d = i36;
                ensureBufferSize2[i35] = b2;
                c12485a.f73132d = i21 + 8;
                ensureBufferSize2[i36] = b2;
            } else if (i22 == 3) {
                int i37 = i21 + 1;
                c12485a.f73132d = i37;
                byte[] bArr6 = this.f73108h;
                long j4 = c12485a.f73130b;
                ensureBufferSize2[i21] = bArr6[((int) (j4 >> 19)) & 31];
                int i38 = i21 + 2;
                c12485a.f73132d = i38;
                ensureBufferSize2[i37] = bArr6[((int) (j4 >> 14)) & 31];
                int i39 = i21 + 3;
                c12485a.f73132d = i39;
                ensureBufferSize2[i38] = bArr6[((int) (j4 >> 9)) & 31];
                int i40 = i21 + 4;
                c12485a.f73132d = i40;
                ensureBufferSize2[i39] = bArr6[((int) (j4 >> 4)) & 31];
                int i41 = i21 + 5;
                c12485a.f73132d = i41;
                ensureBufferSize2[i40] = bArr6[((int) (j4 << 1)) & 31];
                int i42 = i21 + 6;
                c12485a.f73132d = i42;
                byte b3 = this.pad;
                ensureBufferSize2[i41] = b3;
                int i43 = i21 + 7;
                c12485a.f73132d = i43;
                ensureBufferSize2[i42] = b3;
                c12485a.f73132d = i21 + 8;
                ensureBufferSize2[i43] = b3;
            } else if (i22 == 4) {
                int i44 = i21 + 1;
                c12485a.f73132d = i44;
                byte[] bArr7 = this.f73108h;
                long j5 = c12485a.f73130b;
                ensureBufferSize2[i21] = bArr7[((int) (j5 >> 27)) & 31];
                int i45 = i21 + 2;
                c12485a.f73132d = i45;
                ensureBufferSize2[i44] = bArr7[((int) (j5 >> 22)) & 31];
                int i46 = i21 + 3;
                c12485a.f73132d = i46;
                ensureBufferSize2[i45] = bArr7[((int) (j5 >> 17)) & 31];
                int i47 = i21 + 4;
                c12485a.f73132d = i47;
                ensureBufferSize2[i46] = bArr7[((int) (j5 >> 12)) & 31];
                int i48 = i21 + 5;
                c12485a.f73132d = i48;
                ensureBufferSize2[i47] = bArr7[((int) (j5 >> 7)) & 31];
                int i49 = i21 + 6;
                c12485a.f73132d = i49;
                ensureBufferSize2[i48] = bArr7[((int) (j5 >> 2)) & 31];
                int i50 = i21 + 7;
                c12485a.f73132d = i50;
                ensureBufferSize2[i49] = bArr7[((int) (j5 << 3)) & 31];
                c12485a.f73132d = i21 + 8;
                ensureBufferSize2[i50] = this.pad;
            } else {
                throw new IllegalStateException("Impossible modulus " + c12485a.f73136h);
            }
        }
        int i51 = c12485a.f73135g;
        int i52 = c12485a.f73132d;
        int i53 = i51 + (i52 - i21);
        c12485a.f73135g = i53;
        if (this.lineLength <= 0 || i53 <= 0) {
            return;
        }
        byte[] bArr8 = this.f73109i;
        System.arraycopy(bArr8, 0, ensureBufferSize2, i52, bArr8.length);
        c12485a.f73132d += this.f73109i.length;
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    public boolean isInAlphabet(byte b) {
        if (b >= 0) {
            byte[] bArr = this.f73106f;
            if (b < bArr.length && bArr[b] != -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public final void m25873j(long j, BaseNCodec.C12485a c12485a) {
        if (isStrictDecoding() && (j & c12485a.f73130b) != 0) {
            throw new IllegalArgumentException("Strict decoding: Last encoded character (before the paddings if any) is a valid base 32 alphabet but not a possible encoding. Expected the discarded bits from the character to be zero.");
        }
    }

    /* renamed from: k */
    public final void m25872k() {
        if (!isStrictDecoding()) {
            return;
        }
        throw new IllegalArgumentException("Strict decoding: Last encoded character(s) (before the paddings if any) are valid base 32 alphabet but not a possible encoding. Decoding requires either 2, 4, 5, or 7 trailing 5-bit characters to create bytes.");
    }

    public Base32() {
        this(false);
    }

    public Base32(boolean z) {
        this(0, null, z, kotlin.p023io.encoding.Base64.padSymbol);
    }

    public Base32(boolean z, byte b) {
        this(0, null, z, b);
    }

    public Base32(byte b) {
        this(false, b);
    }

    public Base32(int i) {
        this(i, BaseNCodec.f73118e);
    }

    public Base32(int i, byte[] bArr) {
        this(i, bArr, false, kotlin.p023io.encoding.Base64.padSymbol);
    }

    public Base32(int i, byte[] bArr, boolean z) {
        this(i, bArr, z, kotlin.p023io.encoding.Base64.padSymbol);
    }

    public Base32(int i, byte[] bArr, boolean z, byte b) {
        this(i, bArr, z, b, BaseNCodec.DECODING_POLICY_DEFAULT);
    }

    public Base32(int i, byte[] bArr, boolean z, byte b, CodecPolicy codecPolicy) {
        this(i, bArr, z ? f73105m : f73103k, b, codecPolicy);
    }

    public Base32(int i, byte[] bArr, byte[] bArr2, byte b, CodecPolicy codecPolicy) {
        super(5, 8, i, BaseNCodec.m25857h(bArr), b, codecPolicy);
        Objects.requireNonNull(bArr2, "encodeTable");
        this.f73108h = bArr2;
        this.f73106f = bArr2 == f73105m ? f73104l : f73102j;
        if (i <= 0) {
            this.f73107g = 8;
            this.f73109i = null;
        } else if (bArr != null) {
            byte[] bArr3 = (byte[]) bArr.clone();
            if (!containsAlphabetOrPad(bArr3)) {
                this.f73107g = bArr3.length + 8;
                this.f73109i = bArr3;
            } else {
                String newStringUtf8 = StringUtils.newStringUtf8(bArr3);
                throw new IllegalArgumentException("lineSeparator must not contain Base32 characters: [" + newStringUtf8 + "]");
            }
        } else {
            throw new IllegalArgumentException("lineLength " + i + " > 0, but lineSeparator is null");
        }
        if (isInAlphabet(b) || Character.isWhitespace(b)) {
            throw new IllegalArgumentException("pad must not be in alphabet or whitespace");
        }
    }
}