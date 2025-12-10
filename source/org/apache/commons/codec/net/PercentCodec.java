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
    public final BitSet f73218a;

    /* renamed from: b */
    public final boolean f73219b;

    /* renamed from: c */
    public int f73220c;

    /* renamed from: d */
    public int f73221d;

    public PercentCodec() {
        this.f73218a = new BitSet();
        this.f73220c = Integer.MAX_VALUE;
        this.f73221d = Integer.MIN_VALUE;
        this.f73219b = false;
        m25436g((byte) 37);
    }

    /* renamed from: a */
    public final boolean m25442a(byte b) {
        if (m25434i(b) && (!m25437f(b) || !this.f73218a.get(b))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean m25441b(byte[] bArr) {
        for (byte b : bArr) {
            if (b == 32) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final byte[] m25440c(byte[] bArr, int i, boolean z) {
        ByteBuffer allocate = ByteBuffer.allocate(i);
        for (byte b : bArr) {
            if (z && m25442a(b)) {
                if (b < 0) {
                    b = (byte) (b + 256);
                }
                char m68131b = H02.m68131b(b >> 4);
                char m68131b2 = H02.m68131b(b);
                allocate.put((byte) 37);
                allocate.put((byte) m68131b);
                allocate.put((byte) m68131b2);
            } else if (this.f73219b && b == 32) {
                allocate.put((byte) 43);
            } else {
                allocate.put(b);
            }
        }
        return allocate.array();
    }

    /* renamed from: d */
    public final int m25439d(byte[] bArr) {
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
        ByteBuffer allocate = ByteBuffer.allocate(m25439d(bArr));
        int i = 0;
        while (i < bArr.length) {
            byte b = bArr[i];
            if (b == 37) {
                try {
                    int m68132a = H02.m68132a(bArr[i + 1]);
                    i += 2;
                    allocate.put((byte) ((m68132a << 4) + H02.m68132a(bArr[i])));
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new DecoderException("Invalid percent decoding: ", e);
                }
            } else if (this.f73219b && b == 43) {
                allocate.put((byte) 32);
            } else {
                allocate.put(b);
            }
            i++;
        }
        return allocate.array();
    }

    /* renamed from: e */
    public final int m25438e(byte[] bArr) {
        int i;
        int i2 = 0;
        for (byte b : bArr) {
            if (m25442a(b)) {
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
        int m25438e = m25438e(bArr);
        boolean z = m25438e != bArr.length;
        return (z || (this.f73219b && m25441b(bArr))) ? m25440c(bArr, m25438e, z) : bArr;
    }

    /* renamed from: f */
    public final boolean m25437f(byte b) {
        if (b >= this.f73220c && b <= this.f73221d) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void m25436g(byte b) {
        if (b >= 0) {
            this.f73218a.set(b);
            if (b < this.f73220c) {
                this.f73220c = b;
            }
            if (b > this.f73221d) {
                this.f73221d = b;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("byte must be >= 0");
    }

    /* renamed from: h */
    public final void m25435h(byte[] bArr) {
        if (bArr != null) {
            for (byte b : bArr) {
                m25436g(b);
            }
        }
        m25436g((byte) 37);
    }

    /* renamed from: i */
    public final boolean m25434i(byte b) {
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
        this.f73218a = new BitSet();
        this.f73220c = Integer.MAX_VALUE;
        this.f73221d = Integer.MIN_VALUE;
        this.f73219b = z;
        m25435h(bArr);
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
