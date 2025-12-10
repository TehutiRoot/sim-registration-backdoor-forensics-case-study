package com.google.common.hash;

import com.google.common.primitives.UnsignedBytes;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.annotation.CheckForNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Immutable
/* loaded from: classes4.dex */
public final class Murmur3_128HashFunction extends AbstractC0710K implements Serializable {
    private static final long serialVersionUID = 0;
    private final int seed;
    static final HashFunction MURMUR3_128 = new Murmur3_128HashFunction(0);
    static final HashFunction GOOD_FAST_HASH_128 = new Murmur3_128HashFunction(Hashing.f53838a);

    /* renamed from: com.google.common.hash.Murmur3_128HashFunction$a */
    /* loaded from: classes4.dex */
    public static final class C8065a extends AbstractC16864v0 {

        /* renamed from: d */
        public long f53852d;

        /* renamed from: e */
        public long f53853e;

        /* renamed from: f */
        public int f53854f;

        public C8065a(int i) {
            super(16);
            long j = i;
            this.f53852d = j;
            this.f53853e = j;
            this.f53854f = 0;
        }

        /* renamed from: h */
        public static long m40040h(long j) {
            long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
            long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
            return j3 ^ (j3 >>> 33);
        }

        /* renamed from: i */
        public static long m40039i(long j) {
            return Long.rotateLeft(j * (-8663945395140668459L), 31) * 5545529020109919103L;
        }

        /* renamed from: j */
        public static long m40038j(long j) {
            return Long.rotateLeft(j * 5545529020109919103L, 33) * (-8663945395140668459L);
        }

        @Override // p000.AbstractC16864v0
        /* renamed from: a */
        public HashCode mo1155a() {
            long j = this.f53852d;
            int i = this.f53854f;
            long j2 = j ^ i;
            long j3 = this.f53853e ^ i;
            long j4 = j2 + j3;
            this.f53852d = j4;
            this.f53853e = j3 + j4;
            this.f53852d = m40040h(j4);
            long m40040h = m40040h(this.f53853e);
            long j5 = this.f53852d + m40040h;
            this.f53852d = j5;
            this.f53853e = m40040h + j5;
            return HashCode.fromBytesNoCopy(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f53852d).putLong(this.f53853e).array());
        }

        @Override // p000.AbstractC16864v0
        /* renamed from: d */
        public void mo1152d(ByteBuffer byteBuffer) {
            m40041g(byteBuffer.getLong(), byteBuffer.getLong());
            this.f53854f += 16;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // p000.AbstractC16864v0
        /* renamed from: e */
        public void mo1151e(ByteBuffer byteBuffer) {
            long j;
            long j2;
            long j3;
            long j4;
            long j5;
            long j6;
            long j7;
            this.f53854f += byteBuffer.remaining();
            long j8 = 0;
            switch (byteBuffer.remaining()) {
                case 1:
                    j = 0;
                    j7 = j ^ UnsignedBytes.toInt(byteBuffer.get(0));
                    break;
                case 2:
                    j2 = 0;
                    j = j2 ^ (UnsignedBytes.toInt(byteBuffer.get(1)) << 8);
                    j7 = j ^ UnsignedBytes.toInt(byteBuffer.get(0));
                    break;
                case 3:
                    j3 = 0;
                    j2 = (UnsignedBytes.toInt(byteBuffer.get(2)) << 16) ^ j3;
                    j = j2 ^ (UnsignedBytes.toInt(byteBuffer.get(1)) << 8);
                    j7 = j ^ UnsignedBytes.toInt(byteBuffer.get(0));
                    break;
                case 4:
                    j4 = 0;
                    j3 = j4 ^ (UnsignedBytes.toInt(byteBuffer.get(3)) << 24);
                    j2 = (UnsignedBytes.toInt(byteBuffer.get(2)) << 16) ^ j3;
                    j = j2 ^ (UnsignedBytes.toInt(byteBuffer.get(1)) << 8);
                    j7 = j ^ UnsignedBytes.toInt(byteBuffer.get(0));
                    break;
                case 5:
                    j5 = 0;
                    j4 = j5 ^ (UnsignedBytes.toInt(byteBuffer.get(4)) << 32);
                    j3 = j4 ^ (UnsignedBytes.toInt(byteBuffer.get(3)) << 24);
                    j2 = (UnsignedBytes.toInt(byteBuffer.get(2)) << 16) ^ j3;
                    j = j2 ^ (UnsignedBytes.toInt(byteBuffer.get(1)) << 8);
                    j7 = j ^ UnsignedBytes.toInt(byteBuffer.get(0));
                    break;
                case 6:
                    j6 = 0;
                    j5 = (UnsignedBytes.toInt(byteBuffer.get(5)) << 40) ^ j6;
                    j4 = j5 ^ (UnsignedBytes.toInt(byteBuffer.get(4)) << 32);
                    j3 = j4 ^ (UnsignedBytes.toInt(byteBuffer.get(3)) << 24);
                    j2 = (UnsignedBytes.toInt(byteBuffer.get(2)) << 16) ^ j3;
                    j = j2 ^ (UnsignedBytes.toInt(byteBuffer.get(1)) << 8);
                    j7 = j ^ UnsignedBytes.toInt(byteBuffer.get(0));
                    break;
                case 7:
                    j6 = UnsignedBytes.toInt(byteBuffer.get(6)) << 48;
                    j5 = (UnsignedBytes.toInt(byteBuffer.get(5)) << 40) ^ j6;
                    j4 = j5 ^ (UnsignedBytes.toInt(byteBuffer.get(4)) << 32);
                    j3 = j4 ^ (UnsignedBytes.toInt(byteBuffer.get(3)) << 24);
                    j2 = (UnsignedBytes.toInt(byteBuffer.get(2)) << 16) ^ j3;
                    j = j2 ^ (UnsignedBytes.toInt(byteBuffer.get(1)) << 8);
                    j7 = j ^ UnsignedBytes.toInt(byteBuffer.get(0));
                    break;
                case 8:
                    j7 = byteBuffer.getLong();
                    break;
                case 9:
                    j8 ^= UnsignedBytes.toInt(byteBuffer.get(8));
                    j7 = byteBuffer.getLong();
                    break;
                case 10:
                    j8 ^= UnsignedBytes.toInt(byteBuffer.get(9)) << 8;
                    j8 ^= UnsignedBytes.toInt(byteBuffer.get(8));
                    j7 = byteBuffer.getLong();
                    break;
                case 11:
                    j8 ^= UnsignedBytes.toInt(byteBuffer.get(10)) << 16;
                    j8 ^= UnsignedBytes.toInt(byteBuffer.get(9)) << 8;
                    j8 ^= UnsignedBytes.toInt(byteBuffer.get(8));
                    j7 = byteBuffer.getLong();
                    break;
                case 12:
                    j8 ^= UnsignedBytes.toInt(byteBuffer.get(11)) << 24;
                    j8 ^= UnsignedBytes.toInt(byteBuffer.get(10)) << 16;
                    j8 ^= UnsignedBytes.toInt(byteBuffer.get(9)) << 8;
                    j8 ^= UnsignedBytes.toInt(byteBuffer.get(8));
                    j7 = byteBuffer.getLong();
                    break;
                case 13:
                    j8 ^= UnsignedBytes.toInt(byteBuffer.get(12)) << 32;
                    j8 ^= UnsignedBytes.toInt(byteBuffer.get(11)) << 24;
                    j8 ^= UnsignedBytes.toInt(byteBuffer.get(10)) << 16;
                    j8 ^= UnsignedBytes.toInt(byteBuffer.get(9)) << 8;
                    j8 ^= UnsignedBytes.toInt(byteBuffer.get(8));
                    j7 = byteBuffer.getLong();
                    break;
                case 14:
                    j8 ^= UnsignedBytes.toInt(byteBuffer.get(13)) << 40;
                    j8 ^= UnsignedBytes.toInt(byteBuffer.get(12)) << 32;
                    j8 ^= UnsignedBytes.toInt(byteBuffer.get(11)) << 24;
                    j8 ^= UnsignedBytes.toInt(byteBuffer.get(10)) << 16;
                    j8 ^= UnsignedBytes.toInt(byteBuffer.get(9)) << 8;
                    j8 ^= UnsignedBytes.toInt(byteBuffer.get(8));
                    j7 = byteBuffer.getLong();
                    break;
                case 15:
                    j8 = UnsignedBytes.toInt(byteBuffer.get(14)) << 48;
                    j8 ^= UnsignedBytes.toInt(byteBuffer.get(13)) << 40;
                    j8 ^= UnsignedBytes.toInt(byteBuffer.get(12)) << 32;
                    j8 ^= UnsignedBytes.toInt(byteBuffer.get(11)) << 24;
                    j8 ^= UnsignedBytes.toInt(byteBuffer.get(10)) << 16;
                    j8 ^= UnsignedBytes.toInt(byteBuffer.get(9)) << 8;
                    j8 ^= UnsignedBytes.toInt(byteBuffer.get(8));
                    j7 = byteBuffer.getLong();
                    break;
                default:
                    throw new AssertionError("Should never get here.");
            }
            this.f53852d = m40039i(j7) ^ this.f53852d;
            this.f53853e ^= m40038j(j8);
        }

        /* renamed from: g */
        public final void m40041g(long j, long j2) {
            long m40039i = m40039i(j) ^ this.f53852d;
            this.f53852d = m40039i;
            long rotateLeft = Long.rotateLeft(m40039i, 27);
            long j3 = this.f53853e;
            this.f53852d = ((rotateLeft + j3) * 5) + 1390208809;
            long m40038j = m40038j(j2) ^ j3;
            this.f53853e = m40038j;
            this.f53853e = ((Long.rotateLeft(m40038j, 31) + this.f53852d) * 5) + 944331445;
        }
    }

    public Murmur3_128HashFunction(int i) {
        this.seed = i;
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 128;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof Murmur3_128HashFunction) || this.seed != ((Murmur3_128HashFunction) obj).seed) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Murmur3_128HashFunction.class.hashCode() ^ this.seed;
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return new C8065a(this.seed);
    }

    public String toString() {
        return "Hashing.murmur3_128(" + this.seed + ")";
    }
}
