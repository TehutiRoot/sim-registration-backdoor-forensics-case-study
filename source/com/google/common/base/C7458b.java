package com.google.common.base;

import com.google.common.base.CharMatcher;
import java.util.BitSet;

/* renamed from: com.google.common.base.b */
/* loaded from: classes4.dex */
public final class C7458b extends CharMatcher.AbstractC7413v {

    /* renamed from: b */
    public final char[] f52807b;

    /* renamed from: c */
    public final boolean f52808c;

    /* renamed from: d */
    public final long f52809d;

    public C7458b(char[] cArr, long j, boolean z, String str) {
        super(str);
        this.f52807b = cArr;
        this.f52809d = j;
        this.f52808c = z;
    }

    /* renamed from: j */
    public static int m41244j(int i) {
        if (i == 1) {
            return 2;
        }
        int highestOneBit = Integer.highestOneBit(i - 1) << 1;
        while (highestOneBit * 0.5d < i) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    /* renamed from: k */
    public static CharMatcher m41243k(BitSet bitSet, String str) {
        int i;
        int cardinality = bitSet.cardinality();
        boolean z = bitSet.get(0);
        int m41244j = m41244j(cardinality);
        char[] cArr = new char[m41244j];
        int i2 = m41244j - 1;
        int nextSetBit = bitSet.nextSetBit(0);
        long j = 0;
        while (nextSetBit != -1) {
            long j2 = (1 << nextSetBit) | j;
            int m41242l = m41242l(nextSetBit);
            while (true) {
                i = m41242l & i2;
                if (cArr[i] == 0) {
                    break;
                }
                m41242l = i + 1;
            }
            cArr[i] = (char) nextSetBit;
            nextSetBit = bitSet.nextSetBit(nextSetBit + 1);
            j = j2;
        }
        return new C7458b(cArr, j, z, str);
    }

    /* renamed from: l */
    public static int m41242l(int i) {
        return Integer.rotateLeft(i * (-862048943), 15) * 461845907;
    }

    @Override // com.google.common.base.CharMatcher
    /* renamed from: g */
    public void mo41246g(BitSet bitSet) {
        char[] cArr;
        if (this.f52808c) {
            bitSet.set(0);
        }
        for (char c : this.f52807b) {
            if (c != 0) {
                bitSet.set(c);
            }
        }
    }

    /* renamed from: i */
    public final boolean m41245i(int i) {
        if (1 == ((this.f52809d >> i) & 1)) {
            return true;
        }
        return false;
    }

    @Override // com.google.common.base.CharMatcher
    public boolean matches(char c) {
        if (c == 0) {
            return this.f52808c;
        }
        if (!m41245i(c)) {
            return false;
        }
        int length = this.f52807b.length - 1;
        int m41242l = m41242l(c) & length;
        int i = m41242l;
        do {
            char c2 = this.f52807b[i];
            if (c2 == 0) {
                return false;
            }
            if (c2 == c) {
                return true;
            }
            i = (i + 1) & length;
        } while (i != m41242l);
        return false;
    }
}
