package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.hash.BloomFilter;
import com.google.common.math.LongMath;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public enum BloomFilterStrategies implements BloomFilter.Strategy {
    MURMUR128_MITZ_32 { // from class: com.google.common.hash.BloomFilterStrategies.1
        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean mightContain(T t, Funnel<? super T> funnel, int i, C8042a c8042a) {
            long m40061b = c8042a.m40061b();
            long asLong = Hashing.murmur3_128().hashObject(t, funnel).asLong();
            int i2 = (int) asLong;
            int i3 = (int) (asLong >>> 32);
            for (int i4 = 1; i4 <= i; i4++) {
                int i5 = (i4 * i3) + i2;
                if (i5 < 0) {
                    i5 = ~i5;
                }
                if (!c8042a.m40059d(i5 % m40061b)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean put(T t, Funnel<? super T> funnel, int i, C8042a c8042a) {
            long m40061b = c8042a.m40061b();
            long asLong = Hashing.murmur3_128().hashObject(t, funnel).asLong();
            int i2 = (int) asLong;
            int i3 = (int) (asLong >>> 32);
            boolean z = false;
            for (int i4 = 1; i4 <= i; i4++) {
                int i5 = (i4 * i3) + i2;
                if (i5 < 0) {
                    i5 = ~i5;
                }
                z |= c8042a.m40056g(i5 % m40061b);
            }
            return z;
        }
    },
    MURMUR128_MITZ_64 { // from class: com.google.common.hash.BloomFilterStrategies.2
        private long lowerEight(byte[] bArr) {
            return Longs.fromBytes(bArr[7], bArr[6], bArr[5], bArr[4], bArr[3], bArr[2], bArr[1], bArr[0]);
        }

        private long upperEight(byte[] bArr) {
            return Longs.fromBytes(bArr[15], bArr[14], bArr[13], bArr[12], bArr[11], bArr[10], bArr[9], bArr[8]);
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean mightContain(T t, Funnel<? super T> funnel, int i, C8042a c8042a) {
            long m40061b = c8042a.m40061b();
            byte[] bytesInternal = Hashing.murmur3_128().hashObject(t, funnel).getBytesInternal();
            long lowerEight = lowerEight(bytesInternal);
            long upperEight = upperEight(bytesInternal);
            for (int i2 = 0; i2 < i; i2++) {
                if (!c8042a.m40059d((Long.MAX_VALUE & lowerEight) % m40061b)) {
                    return false;
                }
                lowerEight += upperEight;
            }
            return true;
        }

        @Override // com.google.common.hash.BloomFilter.Strategy
        public <T> boolean put(T t, Funnel<? super T> funnel, int i, C8042a c8042a) {
            long m40061b = c8042a.m40061b();
            byte[] bytesInternal = Hashing.murmur3_128().hashObject(t, funnel).getBytesInternal();
            long lowerEight = lowerEight(bytesInternal);
            long upperEight = upperEight(bytesInternal);
            boolean z = false;
            for (int i2 = 0; i2 < i; i2++) {
                z |= c8042a.m40056g((Long.MAX_VALUE & lowerEight) % m40061b);
                lowerEight += upperEight;
            }
            return z;
        }
    };

    /* renamed from: com.google.common.hash.BloomFilterStrategies$a */
    /* loaded from: classes4.dex */
    public static final class C8042a {

        /* renamed from: a */
        public final AtomicLongArray f53833a;

        /* renamed from: b */
        public final InterfaceC17489Dm0 f53834b;

        public C8042a(long j) {
            Preconditions.checkArgument(j > 0, "data length is zero!");
            this.f53833a = new AtomicLongArray(Ints.checkedCast(LongMath.divide(j, 64L, RoundingMode.CEILING)));
            this.f53834b = LongAddables.m40045a();
        }

        /* renamed from: h */
        public static long[] m40055h(AtomicLongArray atomicLongArray) {
            int length = atomicLongArray.length();
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = atomicLongArray.get(i);
            }
            return jArr;
        }

        /* renamed from: a */
        public long m40062a() {
            return this.f53834b.sum();
        }

        /* renamed from: b */
        public long m40061b() {
            return this.f53833a.length() * 64;
        }

        /* renamed from: c */
        public C8042a m40060c() {
            return new C8042a(m40055h(this.f53833a));
        }

        /* renamed from: d */
        public boolean m40059d(long j) {
            if (((1 << ((int) j)) & this.f53833a.get((int) (j >>> 6))) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public void m40058e(C8042a c8042a) {
            boolean z;
            if (this.f53833a.length() == c8042a.f53833a.length()) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "BitArrays must be of equal length (%s != %s)", this.f53833a.length(), c8042a.f53833a.length());
            for (int i = 0; i < this.f53833a.length(); i++) {
                m40057f(i, c8042a.f53833a.get(i));
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof C8042a) {
                return Arrays.equals(m40055h(this.f53833a), m40055h(((C8042a) obj).f53833a));
            }
            return false;
        }

        /* renamed from: f */
        public void m40057f(int i, long j) {
            long j2;
            long j3;
            do {
                j2 = this.f53833a.get(i);
                j3 = j2 | j;
                if (j2 == j3) {
                    return;
                }
            } while (!this.f53833a.compareAndSet(i, j2, j3));
            this.f53834b.add(Long.bitCount(j3) - Long.bitCount(j2));
        }

        /* renamed from: g */
        public boolean m40056g(long j) {
            long j2;
            long j3;
            if (m40059d(j)) {
                return false;
            }
            int i = (int) (j >>> 6);
            long j4 = 1 << ((int) j);
            do {
                j2 = this.f53833a.get(i);
                j3 = j2 | j4;
                if (j2 == j3) {
                    return false;
                }
            } while (!this.f53833a.compareAndSet(i, j2, j3));
            this.f53834b.increment();
            return true;
        }

        public int hashCode() {
            return Arrays.hashCode(m40055h(this.f53833a));
        }

        public C8042a(long[] jArr) {
            Preconditions.checkArgument(jArr.length > 0, "data length is zero!");
            this.f53833a = new AtomicLongArray(jArr);
            this.f53834b = LongAddables.m40045a();
            long j = 0;
            for (long j2 : jArr) {
                j += Long.bitCount(j2);
            }
            this.f53834b.add(j);
        }
    }
}
