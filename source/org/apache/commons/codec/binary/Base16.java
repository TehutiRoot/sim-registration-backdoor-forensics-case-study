package org.apache.commons.codec.binary;

import com.facebook.stetho.dumpapp.Framer;
import java.util.Objects;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.binary.BaseNCodec;

/* loaded from: classes6.dex */
public class Base16 extends BaseNCodec {

    /* renamed from: h */
    public static final byte[] f73012h = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15};

    /* renamed from: i */
    public static final byte[] f73013i = {48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

    /* renamed from: j */
    public static final byte[] f73014j = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15};

    /* renamed from: k */
    public static final byte[] f73015k = {48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: f */
    public final byte[] f73016f;

    /* renamed from: g */
    public final byte[] f73017g;

    public Base16() {
        this(false);
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    /* renamed from: c */
    public void mo25672c(byte[] bArr, int i, int i2, BaseNCodec.C12485a c12485a) {
        int i3;
        int i4;
        if (!c12485a.f73050f && i2 >= 0) {
            int min = Math.min(bArr.length - i, i2);
            if (c12485a.f73045a != 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            int i5 = i3 + min;
            if (i5 == 1 && i5 == min) {
                c12485a.f73045a = m25686i(bArr[i]) + 1;
                return;
            }
            if (i5 % 2 == 0) {
                i4 = i5;
            } else {
                i4 = i5 - 1;
            }
            int i6 = i + min;
            byte[] ensureBufferSize = ensureBufferSize(i4 / 2, c12485a);
            if (min < i5) {
                int i7 = i + 1;
                int m25686i = m25686i(bArr[i]) | ((c12485a.f73045a - 1) << 4);
                int i8 = c12485a.f73048d;
                c12485a.f73048d = i8 + 1;
                ensureBufferSize[i8] = (byte) m25686i;
                c12485a.f73045a = 0;
                i = i7;
            }
            int i9 = i6 - 1;
            while (i < i9) {
                int i10 = i + 1;
                i += 2;
                int m25686i2 = m25686i(bArr[i10]) | (m25686i(bArr[i]) << 4);
                int i11 = c12485a.f73048d;
                c12485a.f73048d = i11 + 1;
                ensureBufferSize[i11] = (byte) m25686i2;
            }
            if (i < i6) {
                c12485a.f73045a = m25686i(bArr[i]) + 1;
                return;
            }
            return;
        }
        c12485a.f73050f = true;
        if (c12485a.f73045a != 0) {
            m25685j();
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
            return;
        }
        int i3 = i2 * 2;
        if (i3 >= 0) {
            byte[] ensureBufferSize = ensureBufferSize(i3, c12485a);
            int i4 = i2 + i;
            while (i < i4) {
                byte b = bArr[i];
                int i5 = c12485a.f73048d;
                int i6 = i5 + 1;
                c12485a.f73048d = i6;
                byte[] bArr2 = this.f73017g;
                ensureBufferSize[i5] = bArr2[(b >> 4) & 15];
                c12485a.f73048d = i5 + 2;
                ensureBufferSize[i6] = bArr2[b & 15];
                i++;
            }
            return;
        }
        throw new IllegalArgumentException("Input length exceeds maximum size for encoded data: " + i2);
    }

    /* renamed from: i */
    public final int m25686i(byte b) {
        byte b2;
        int i = b & 255;
        byte[] bArr = this.f73016f;
        if (i < bArr.length) {
            b2 = bArr[b];
        } else {
            b2 = -1;
        }
        if (b2 != -1) {
            return b2;
        }
        throw new IllegalArgumentException("Invalid octet in encoded value: " + ((int) b));
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    public boolean isInAlphabet(byte b) {
        int i = b & 255;
        byte[] bArr = this.f73016f;
        if (i < bArr.length && bArr[b] != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void m25685j() {
        if (!isStrictDecoding()) {
            return;
        }
        throw new IllegalArgumentException("Strict decoding: Last encoded character is a valid base 16 alphabet character but not a possible encoding. Decoding requires at least two characters to create one byte.");
    }

    public Base16(boolean z) {
        this(z, BaseNCodec.DECODING_POLICY_DEFAULT);
    }

    public Base16(boolean z, byte[] bArr, CodecPolicy codecPolicy) {
        super(1, 2, 0, 0, kotlin.p023io.encoding.Base64.padSymbol, codecPolicy);
        Objects.requireNonNull(bArr, "encodeTable");
        this.f73017g = bArr;
        this.f73016f = bArr == f73015k ? f73014j : f73012h;
    }

    public Base16(boolean z, CodecPolicy codecPolicy) {
        this(z, z ? f73015k : f73013i, codecPolicy);
    }
}
