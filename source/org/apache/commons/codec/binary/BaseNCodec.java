package org.apache.commons.codec.binary;

import io.realm.internal.OsCollectionChangeSet;
import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public abstract class BaseNCodec implements BinaryEncoder, BinaryDecoder {
    protected static final int MASK_8BITS = 255;
    public static final int MIME_CHUNK_SIZE = 76;
    protected static final byte PAD_DEFAULT = 61;
    public static final int PEM_CHUNK_SIZE = 64;
    @Deprecated
    protected final byte PAD;

    /* renamed from: a */
    public final int f73035a;

    /* renamed from: b */
    public final int f73036b;

    /* renamed from: c */
    public final int f73037c;

    /* renamed from: d */
    public final CodecPolicy f73038d;
    protected final int lineLength;
    protected final byte pad;
    protected static final CodecPolicy DECODING_POLICY_DEFAULT = CodecPolicy.LENIENT;

    /* renamed from: e */
    public static final byte[] f73034e = {13, 10};

    /* loaded from: classes6.dex */
    public static abstract class AbstractBuilder<T, B extends AbstractBuilder<T, B>> implements Supplier<T> {

        /* renamed from: b */
        public int f73040b;

        /* renamed from: d */
        public final byte[] f73042d;

        /* renamed from: e */
        public byte[] f73043e;

        /* renamed from: a */
        public CodecPolicy f73039a = BaseNCodec.DECODING_POLICY_DEFAULT;

        /* renamed from: c */
        public byte[] f73041c = BaseNCodec.f73034e;

        /* renamed from: f */
        public byte f73044f = 61;

        public AbstractBuilder(byte[] bArr) {
            this.f73042d = bArr;
            this.f73043e = bArr;
        }

        /* renamed from: a */
        public AbstractBuilder m25666a() {
            return this;
        }

        /* renamed from: b */
        public CodecPolicy m25665b() {
            return this.f73039a;
        }

        /* renamed from: c */
        public byte[] m25664c() {
            return this.f73043e;
        }

        /* renamed from: d */
        public int m25663d() {
            return this.f73040b;
        }

        /* renamed from: e */
        public byte[] m25662e() {
            return this.f73041c;
        }

        /* renamed from: f */
        public byte m25661f() {
            return this.f73044f;
        }

        public B setDecodingPolicy(CodecPolicy codecPolicy) {
            if (codecPolicy == null) {
                codecPolicy = BaseNCodec.DECODING_POLICY_DEFAULT;
            }
            this.f73039a = codecPolicy;
            return (B) m25666a();
        }

        public B setEncodeTable(byte... bArr) {
            if (bArr == null) {
                bArr = this.f73042d;
            }
            this.f73043e = bArr;
            return (B) m25666a();
        }

        public B setLineLength(int i) {
            this.f73040b = Math.max(0, i);
            return (B) m25666a();
        }

        public B setLineSeparator(byte... bArr) {
            if (bArr == null) {
                bArr = BaseNCodec.f73034e;
            }
            this.f73041c = bArr;
            return (B) m25666a();
        }

        public B setPadding(byte b) {
            this.f73044f = b;
            return (B) m25666a();
        }
    }

    /* renamed from: org.apache.commons.codec.binary.BaseNCodec$a */
    /* loaded from: classes6.dex */
    public static class C12485a {

        /* renamed from: a */
        public int f73045a;

        /* renamed from: b */
        public long f73046b;

        /* renamed from: c */
        public byte[] f73047c;

        /* renamed from: d */
        public int f73048d;

        /* renamed from: e */
        public int f73049e;

        /* renamed from: f */
        public boolean f73050f;

        /* renamed from: g */
        public int f73051g;

        /* renamed from: h */
        public int f73052h;

        public String toString() {
            return String.format("%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]", getClass().getSimpleName(), Arrays.toString(this.f73047c), Integer.valueOf(this.f73051g), Boolean.valueOf(this.f73050f), Integer.valueOf(this.f73045a), Long.valueOf(this.f73046b), Integer.valueOf(this.f73052h), Integer.valueOf(this.f73048d), Integer.valueOf(this.f73049e));
        }
    }

    public BaseNCodec(int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, (byte) 61);
    }

    /* renamed from: b */
    public static int m25673b(int i) {
        if (i >= 0) {
            return Math.max(i, (int) OsCollectionChangeSet.MAX_ARRAY_LENGTH);
        }
        throw new OutOfMemoryError("Unable to allocate array size: " + (i & BodyPartID.bodyIdMax));
    }

    /* renamed from: g */
    public static byte[] m25668g(C12485a c12485a, int i) {
        int compare;
        int compare2;
        int length = c12485a.f73047c.length * 2;
        compare = Integer.compare(length ^ Integer.MIN_VALUE, i ^ Integer.MIN_VALUE);
        if (compare < 0) {
            length = i;
        }
        compare2 = Integer.compare(length ^ Integer.MIN_VALUE, OsCollectionChangeSet.MAX_ARRAY_LENGTH ^ Integer.MIN_VALUE);
        if (compare2 > 0) {
            length = m25673b(i);
        }
        byte[] copyOf = Arrays.copyOf(c12485a.f73047c, length);
        c12485a.f73047c = copyOf;
        return copyOf;
    }

    public static byte[] getChunkSeparator() {
        return (byte[]) f73034e.clone();
    }

    /* renamed from: h */
    public static int m25667h(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    @Deprecated
    public static boolean isWhiteSpace(byte b) {
        return Character.isWhitespace(b);
    }

    /* renamed from: a */
    public int m25674a(C12485a c12485a) {
        if (m25670e(c12485a)) {
            return c12485a.f73048d - c12485a.f73049e;
        }
        return 0;
    }

    /* renamed from: c */
    public abstract void mo25672c(byte[] bArr, int i, int i2, C12485a c12485a);

    public boolean containsAlphabetOrPad(byte[] bArr) {
        if (bArr != null) {
            for (byte b : bArr) {
                if (this.pad == b || isInAlphabet(b)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public abstract void mo25671d(byte[] bArr, int i, int i2, C12485a c12485a);

    @Override // org.apache.commons.codec.BinaryDecoder
    public byte[] decode(byte[] bArr) {
        if (BinaryCodec.m25659a(bArr)) {
            return bArr;
        }
        C12485a c12485a = new C12485a();
        mo25672c(bArr, 0, bArr.length, c12485a);
        mo25672c(bArr, 0, -1, c12485a);
        int i = c12485a.f73048d;
        byte[] bArr2 = new byte[i];
        m25669f(bArr2, 0, i, c12485a);
        return bArr2;
    }

    /* renamed from: e */
    public boolean m25670e(C12485a c12485a) {
        if (c12485a.f73048d > c12485a.f73049e) {
            return true;
        }
        return false;
    }

    @Override // org.apache.commons.codec.BinaryEncoder
    public byte[] encode(byte[] bArr) {
        return BinaryCodec.m25659a(bArr) ? bArr : encode(bArr, 0, bArr.length);
    }

    public String encodeAsString(byte[] bArr) {
        return StringUtils.newStringUtf8(encode(bArr));
    }

    public String encodeToString(byte[] bArr) {
        return StringUtils.newStringUtf8(encode(bArr));
    }

    public byte[] ensureBufferSize(int i, C12485a c12485a) {
        byte[] bArr = c12485a.f73047c;
        if (bArr == null) {
            c12485a.f73047c = new byte[Math.max(i, getDefaultBufferSize())];
            c12485a.f73048d = 0;
            c12485a.f73049e = 0;
        } else {
            int i2 = c12485a.f73048d;
            if ((i2 + i) - bArr.length > 0) {
                return m25668g(c12485a, i2 + i);
            }
        }
        return c12485a.f73047c;
    }

    /* renamed from: f */
    public int m25669f(byte[] bArr, int i, int i2, C12485a c12485a) {
        if (m25670e(c12485a)) {
            int min = Math.min(m25674a(c12485a), i2);
            System.arraycopy(c12485a.f73047c, c12485a.f73049e, bArr, i, min);
            c12485a.f73049e += min;
            if (!m25670e(c12485a)) {
                c12485a.f73049e = 0;
                c12485a.f73048d = 0;
            }
            return min;
        } else if (!c12485a.f73050f) {
            return 0;
        } else {
            return -1;
        }
    }

    public CodecPolicy getCodecPolicy() {
        return this.f73038d;
    }

    public int getDefaultBufferSize() {
        return 8192;
    }

    public long getEncodedLength(byte[] bArr) {
        int length = bArr.length;
        int i = this.f73035a;
        long j = (((length + i) - 1) / i) * this.f73036b;
        int i2 = this.lineLength;
        if (i2 > 0) {
            return j + ((((i2 + j) - 1) / i2) * this.f73037c);
        }
        return j;
    }

    public abstract boolean isInAlphabet(byte b);

    public boolean isInAlphabet(byte[] bArr, boolean z) {
        for (byte b : bArr) {
            if (!isInAlphabet(b) && (!z || (b != this.pad && !Character.isWhitespace(b)))) {
                return false;
            }
        }
        return true;
    }

    public boolean isStrictDecoding() {
        if (this.f73038d == CodecPolicy.STRICT) {
            return true;
        }
        return false;
    }

    public BaseNCodec(int i, int i2, int i3, int i4, byte b) {
        this(i, i2, i3, i4, b, DECODING_POLICY_DEFAULT);
    }

    public BaseNCodec(int i, int i2, int i3, int i4, byte b, CodecPolicy codecPolicy) {
        this.PAD = (byte) 61;
        this.f73035a = i;
        this.f73036b = i2;
        this.lineLength = (i3 <= 0 || i4 <= 0) ? 0 : (i3 / i2) * i2;
        this.f73037c = i4;
        this.pad = b;
        Objects.requireNonNull(codecPolicy, "codecPolicy");
        this.f73038d = codecPolicy;
    }

    public byte[] encode(byte[] bArr, int i, int i2) {
        if (BinaryCodec.m25659a(bArr)) {
            return bArr;
        }
        C12485a c12485a = new C12485a();
        mo25671d(bArr, i, i2, c12485a);
        mo25671d(bArr, i, -1, c12485a);
        int i3 = c12485a.f73048d - c12485a.f73049e;
        byte[] bArr2 = new byte[i3];
        m25669f(bArr2, 0, i3, c12485a);
        return bArr2;
    }

    public boolean isInAlphabet(String str) {
        return isInAlphabet(StringUtils.getBytesUtf8(str), true);
    }

    @Override // org.apache.commons.codec.Decoder
    public Object decode(Object obj) throws DecoderException {
        if (obj instanceof byte[]) {
            return decode((byte[]) obj);
        }
        if (obj instanceof String) {
            return decode((String) obj);
        }
        throw new DecoderException("Parameter supplied to Base-N decode is not a byte[] or a String");
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof byte[]) {
            return encode((byte[]) obj);
        }
        throw new EncoderException("Parameter supplied to Base-N encode is not a byte[]");
    }

    public byte[] decode(String str) {
        return decode(StringUtils.getBytesUtf8(str));
    }
}
