package org.apache.commons.codec.net;

import java.nio.ByteBuffer;
import java.util.BitSet;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

/* loaded from: classes6.dex */
public class PercentCodec implements BinaryEncoder, BinaryDecoder {

    /* renamed from: a */
    public final BitSet f73302a;

    /* renamed from: b */
    public final boolean f73303b;

    /* renamed from: c */
    public int f73304c;

    /* renamed from: d */
    public int f73305d;

    public PercentCodec() {
        this.f73302a = new BitSet();
        this.f73304c = Integer.MAX_VALUE;
        this.f73305d = Integer.MIN_VALUE;
        this.f73303b = false;
        m25626g((byte) 37);
    }

    /* renamed from: a */
    public final boolean m25632a(byte b) {
        if (m25624i(b) && (!m25627f(b) || !this.f73302a.get(b))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean m25631b(byte[] bArr) {
        for (byte b : bArr) {
            if (b == 32) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final byte[] m25630c(byte[] bArr, int i, boolean z) {
        ByteBuffer allocate = ByteBuffer.allocate(i);
        for (byte b : bArr) {
            if (z && m25632a(b)) {
                if (b < 0) {
                    b = (byte) (b + 256);
                }
                char m68712b = E12.m68712b(b >> 4);
                char m68712b2 = E12.m68712b(b);
                allocate.put((byte) 37);
                allocate.put((byte) m68712b);
                allocate.put((byte) m68712b2);
            } else if (this.f73303b && b == 32) {
                allocate.put((byte) 43);
            } else {
                allocate.put(b);
            }
        }
        return allocate.array();
    }

    /* renamed from: d */
    public final int m25629d(byte[] bArr) {
        int i;
        int i2 = 0;
        int i3 = 0;
        while (i2 < bArr.length) {
            if (bArr[i2] == 37) {
                i = 3;
            } else {
                i = 1;
            }
            i2 += i;
            i3++;
        }
        return i3;
    }

    @Override // org.apache.commons.codec.BinaryDecoder
    public byte[] decode(byte[] bArr) throws DecoderException {
        if (bArr == null) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(m25629d(bArr));
        int i = 0;
        while (i < bArr.length) {
            byte b = bArr[i];
            if (b == 37) {
                try {
                    int m68713a = E12.m68713a(bArr[i + 1]);
                    i += 2;
                    allocate.put((byte) ((m68713a << 4) + E12.m68713a(bArr[i])));
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new DecoderException("Invalid percent decoding: ", e);
                }
            } else if (this.f73303b && b == 43) {
                allocate.put((byte) 32);
            } else {
                allocate.put(b);
            }
            i++;
        }
        return allocate.array();
    }

    /* renamed from: e */
    public final int m25628e(byte[] bArr) {
        int i;
        int i2 = 0;
        for (byte b : bArr) {
            if (m25632a(b)) {
                i = 3;
            } else {
                i = 1;
            }
            i2 += i;
        }
        return i2;
    }

    @Override // org.apache.commons.codec.BinaryEncoder
    public byte[] encode(byte[] bArr) throws EncoderException {
        if (bArr == null) {
            return null;
        }
        int m25628e = m25628e(bArr);
        boolean z = m25628e != bArr.length;
        return (z || (this.f73303b && m25631b(bArr))) ? m25630c(bArr, m25628e, z) : bArr;
    }

    /* renamed from: f */
    public final boolean m25627f(byte b) {
        if (b >= this.f73304c && b <= this.f73305d) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void m25626g(byte b) {
        if (b >= 0) {
            this.f73302a.set(b);
            if (b < this.f73304c) {
                this.f73304c = b;
            }
            if (b > this.f73305d) {
                this.f73305d = b;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("byte must be >= 0");
    }

    /* renamed from: h */
    public final void m25625h(byte[] bArr) {
        if (bArr != null) {
            for (byte b : bArr) {
                m25626g(b);
            }
        }
        m25626g((byte) 37);
    }

    /* renamed from: i */
    public final boolean m25624i(byte b) {
        return b >= 0;
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            return encode((byte[]) obj);
        }
        throw new EncoderException("Objects of type " + obj.getClass().getName() + " cannot be Percent encoded");
    }

    public PercentCodec(byte[] bArr, boolean z) {
        this.f73302a = new BitSet();
        this.f73304c = Integer.MAX_VALUE;
        this.f73305d = Integer.MIN_VALUE;
        this.f73303b = z;
        m25625h(bArr);
    }

    @Override // org.apache.commons.codec.Decoder
    public Object decode(Object obj) throws DecoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            return decode((byte[]) obj);
        }
        throw new DecoderException("Objects of type " + obj.getClass().getName() + " cannot be Percent decoded");
    }
}