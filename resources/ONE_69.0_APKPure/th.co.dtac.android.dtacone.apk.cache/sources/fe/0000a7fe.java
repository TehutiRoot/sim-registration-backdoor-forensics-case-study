package com.google.common.base;

import com.google.common.base.CharMatcher;
import java.util.BitSet;

/* renamed from: com.google.common.base.b */
/* loaded from: classes4.dex */
public final class C7447b extends CharMatcher.AbstractC7402v {

    /* renamed from: b */
    public final char[] f52819b;

    /* renamed from: c */
    public final boolean f52820c;

    /* renamed from: d */
    public final long f52821d;

    public C7447b(char[] cArr, long j, boolean z, String str) {
        super(str);
        this.f52819b = cArr;
        this.f52821d = j;
        this.f52820c = z;
    }

    /* renamed from: j */
    public static int m41233j(int i) {
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
    public static CharMatcher m41232k(BitSet bitSet, String str) {
        int i;
        int cardinality = bitSet.cardinality();
        boolean z = bitSet.get(0);
        int m41233j = m41233j(cardinality);
        char[] cArr = new char[m41233j];
        int i2 = m41233j - 1;
        int nextSetBit = bitSet.nextSetBit(0);
        long j = 0;
        while (nextSetBit != -1) {
            long j2 = (1 << nextSetBit) | j;
            int m41231l = m41231l(nextSetBit);
            while (true) {
                i = m41231l & i2;
                if (cArr[i] == 0) {
                    break;
                }
                m41231l = i + 1;
            }
            cArr[i] = (char) nextSetBit;
            nextSetBit = bitSet.nextSetBit(nextSetBit + 1);
            j = j2;
        }
        return new C7447b(cArr, j, z, str);
    }

    /* renamed from: l */
    public static int m41231l(int i) {
        return Integer.rotateLeft(i * (-862048943), 15) * 461845907;
    }

    @Override // com.google.common.base.CharMatcher
    /* renamed from: g */
    public void mo41235g(BitSet bitSet) {
        char[] cArr;
        if (this.f52820c) {
            bitSet.set(0);
        }
        for (char c : this.f52819b) {
            if (c != 0) {
                bitSet.set(c);
            }
        }
    }

    /* renamed from: i */
    public final boolean m41234i(int i) {
        if (1 == ((this.f52821d >> i) & 1)) {
            return true;
        }
        return false;
    }

    @Override // com.google.common.base.CharMatcher
    public boolean matches(char c) {
        if (c == 0) {
            return this.f52820c;
        }
        if (!m41234i(c)) {
            return false;
        }
        int length = this.f52819b.length - 1;
        int m41231l = m41231l(c) & length;
        int i = m41231l;
        do {
            char c2 = this.f52819b[i];
            if (c2 == 0) {
                return false;
            }
            if (c2 == c) {
                return true;
            }
            i = (i + 1) & length;
        } while (i != m41231l);
        return false;
    }
}