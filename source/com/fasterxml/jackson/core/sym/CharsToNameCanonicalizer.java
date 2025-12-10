package com.fasterxml.jackson.core.sym;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class CharsToNameCanonicalizer {
    public static final int HASH_MULT = 33;

    /* renamed from: a */
    public final CharsToNameCanonicalizer f43211a;

    /* renamed from: b */
    public final AtomicReference f43212b;

    /* renamed from: c */
    public final int f43213c;

    /* renamed from: d */
    public final int f43214d;

    /* renamed from: e */
    public boolean f43215e;

    /* renamed from: f */
    public String[] f43216f;

    /* renamed from: g */
    public C6079a[] f43217g;

    /* renamed from: h */
    public int f43218h;

    /* renamed from: i */
    public int f43219i;

    /* renamed from: j */
    public int f43220j;

    /* renamed from: k */
    public int f43221k;

    /* renamed from: l */
    public boolean f43222l;

    /* renamed from: m */
    public BitSet f43223m;

    /* renamed from: com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer$a */
    /* loaded from: classes3.dex */
    public static final class C6079a {

        /* renamed from: a */
        public final String f43224a;

        /* renamed from: b */
        public final C6079a f43225b;

        /* renamed from: c */
        public final int f43226c;

        public C6079a(String str, C6079a c6079a) {
            this.f43224a = str;
            this.f43225b = c6079a;
            this.f43226c = c6079a != null ? 1 + c6079a.f43226c : 1;
        }

        /* renamed from: a */
        public String m49503a(char[] cArr, int i, int i2) {
            if (this.f43224a.length() != i2) {
                return null;
            }
            int i3 = 0;
            while (this.f43224a.charAt(i3) == cArr[i + i3]) {
                i3++;
                if (i3 >= i2) {
                    return this.f43224a;
                }
            }
            return null;
        }
    }

    public CharsToNameCanonicalizer(int i) {
        this.f43211a = null;
        this.f43213c = i;
        this.f43215e = true;
        this.f43214d = -1;
        this.f43222l = false;
        this.f43221k = 0;
        this.f43212b = new AtomicReference(C6080b.m49502a(64));
    }

    public static CharsToNameCanonicalizer createRoot() {
        long currentTimeMillis = System.currentTimeMillis();
        return createRoot((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    /* renamed from: d */
    public static int m49511d(int i) {
        return i - (i >> 2);
    }

    public int _hashToIndex(int i) {
        int i2 = i + (i >>> 15);
        int i3 = i2 ^ (i2 << 7);
        return (i3 + (i3 >>> 3)) & this.f43220j;
    }

    /* renamed from: a */
    public final String m49514a(char[] cArr, int i, int i2, int i3, int i4) {
        if (this.f43222l) {
            m49506i();
            this.f43222l = false;
        } else if (this.f43218h >= this.f43219i) {
            m49504k();
            i4 = _hashToIndex(calcHash(cArr, i, i2));
        }
        String str = new String(cArr, i, i2);
        if (JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(this.f43214d)) {
            str = InternCache.instance.intern(str);
        }
        this.f43218h++;
        String[] strArr = this.f43216f;
        if (strArr[i4] == null) {
            strArr[i4] = str;
        } else {
            int i5 = i4 >> 1;
            C6079a c6079a = new C6079a(str, this.f43217g[i5]);
            int i6 = c6079a.f43226c;
            if (i6 > 100) {
                m49512c(i5, c6079a, i4);
            } else {
                this.f43217g[i5] = c6079a;
                this.f43221k = Math.max(i6, this.f43221k);
            }
        }
        return str;
    }

    /* renamed from: b */
    public final String m49513b(char[] cArr, int i, int i2, C6079a c6079a) {
        while (c6079a != null) {
            String m49503a = c6079a.m49503a(cArr, i, i2);
            if (m49503a != null) {
                return m49503a;
            }
            c6079a = c6079a.f43225b;
        }
        return null;
    }

    public int bucketCount() {
        return this.f43216f.length;
    }

    /* renamed from: c */
    public final void m49512c(int i, C6079a c6079a, int i2) {
        BitSet bitSet = this.f43223m;
        if (bitSet == null) {
            BitSet bitSet2 = new BitSet();
            this.f43223m = bitSet2;
            bitSet2.set(i);
        } else if (bitSet.get(i)) {
            if (JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(this.f43214d)) {
                reportTooManyCollisions(100);
            }
            this.f43215e = false;
        } else {
            this.f43223m.set(i);
        }
        this.f43216f[i2] = c6079a.f43224a;
        this.f43217g[i] = null;
        this.f43218h -= c6079a.f43226c;
        this.f43221k = -1;
    }

    public int calcHash(char[] cArr, int i, int i2) {
        int i3 = this.f43213c;
        int i4 = i2 + i;
        while (i < i4) {
            i3 = (i3 * 33) + cArr[i];
            i++;
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    public int collisionCount() {
        C6079a[] c6079aArr;
        int i = 0;
        for (C6079a c6079a : this.f43217g) {
            if (c6079a != null) {
                i += c6079a.f43226c;
            }
        }
        return i;
    }

    public String findSymbol(char[] cArr, int i, int i2, int i3) {
        if (i2 < 1) {
            return "";
        }
        if (!this.f43215e) {
            return new String(cArr, i, i2);
        }
        int _hashToIndex = _hashToIndex(i3);
        String str = this.f43216f[_hashToIndex];
        if (str != null) {
            if (str.length() == i2) {
                int i4 = 0;
                while (str.charAt(i4) == cArr[i + i4]) {
                    i4++;
                    if (i4 == i2) {
                        return str;
                    }
                }
            }
            C6079a c6079a = this.f43217g[_hashToIndex >> 1];
            if (c6079a != null) {
                String m49503a = c6079a.m49503a(cArr, i, i2);
                if (m49503a != null) {
                    return m49503a;
                }
                String m49513b = m49513b(cArr, i, i2, c6079a.f43225b);
                if (m49513b != null) {
                    return m49513b;
                }
            }
        }
        return m49514a(cArr, i, i2, i3, _hashToIndex);
    }

    public int hashSeed() {
        return this.f43213c;
    }

    /* renamed from: i */
    public final void m49506i() {
        String[] strArr = this.f43216f;
        this.f43216f = (String[]) Arrays.copyOf(strArr, strArr.length);
        C6079a[] c6079aArr = this.f43217g;
        this.f43217g = (C6079a[]) Arrays.copyOf(c6079aArr, c6079aArr.length);
    }

    /* renamed from: j */
    public final void m49505j(C6080b c6080b) {
        int i = c6080b.f43227a;
        C6080b c6080b2 = (C6080b) this.f43212b.get();
        if (i == c6080b2.f43227a) {
            return;
        }
        if (i > 12000) {
            c6080b = C6080b.m49502a(64);
        }
        AbstractC17300An1.m69050a(this.f43212b, c6080b2, c6080b);
    }

    /* renamed from: k */
    public final void m49504k() {
        String[] strArr = this.f43216f;
        int length = strArr.length;
        int i = length + length;
        if (i > 65536) {
            this.f43218h = 0;
            this.f43215e = false;
            this.f43216f = new String[64];
            this.f43217g = new C6079a[32];
            this.f43220j = 63;
            this.f43222l = false;
            return;
        }
        C6079a[] c6079aArr = this.f43217g;
        this.f43216f = new String[i];
        this.f43217g = new C6079a[i >> 1];
        this.f43220j = i - 1;
        this.f43219i = m49511d(i);
        int i2 = 0;
        int i3 = 0;
        for (String str : strArr) {
            if (str != null) {
                i2++;
                int _hashToIndex = _hashToIndex(calcHash(str));
                String[] strArr2 = this.f43216f;
                if (strArr2[_hashToIndex] == null) {
                    strArr2[_hashToIndex] = str;
                } else {
                    int i4 = _hashToIndex >> 1;
                    C6079a c6079a = new C6079a(str, this.f43217g[i4]);
                    this.f43217g[i4] = c6079a;
                    i3 = Math.max(i3, c6079a.f43226c);
                }
            }
        }
        int i5 = length >> 1;
        for (int i6 = 0; i6 < i5; i6++) {
            for (C6079a c6079a2 = c6079aArr[i6]; c6079a2 != null; c6079a2 = c6079a2.f43225b) {
                i2++;
                String str2 = c6079a2.f43224a;
                int _hashToIndex2 = _hashToIndex(calcHash(str2));
                String[] strArr3 = this.f43216f;
                if (strArr3[_hashToIndex2] == null) {
                    strArr3[_hashToIndex2] = str2;
                } else {
                    int i7 = _hashToIndex2 >> 1;
                    C6079a c6079a3 = new C6079a(str2, this.f43217g[i7]);
                    this.f43217g[i7] = c6079a3;
                    i3 = Math.max(i3, c6079a3.f43226c);
                }
            }
        }
        this.f43221k = i3;
        this.f43223m = null;
        if (i2 == this.f43218h) {
            return;
        }
        throw new IllegalStateException(String.format("Internal error on SymbolTable.rehash(): had %d entries; now have %d", Integer.valueOf(this.f43218h), Integer.valueOf(i2)));
    }

    public CharsToNameCanonicalizer makeChild(int i) {
        return new CharsToNameCanonicalizer(this, i, this.f43213c, (C6080b) this.f43212b.get());
    }

    public int maxCollisionLength() {
        return this.f43221k;
    }

    public boolean maybeDirty() {
        return !this.f43222l;
    }

    public void release() {
        CharsToNameCanonicalizer charsToNameCanonicalizer;
        if (maybeDirty() && (charsToNameCanonicalizer = this.f43211a) != null && this.f43215e) {
            charsToNameCanonicalizer.m49505j(new C6080b(this));
            this.f43222l = true;
        }
    }

    public void reportTooManyCollisions(int i) {
        throw new IllegalStateException("Longest collision chain in symbol table (of size " + this.f43218h + ") now exceeds maximum, " + i + " -- suspect a DoS attack based on hash collisions");
    }

    public int size() {
        AtomicReference atomicReference = this.f43212b;
        if (atomicReference != null) {
            return ((C6080b) atomicReference.get()).f43227a;
        }
        return this.f43218h;
    }

    public void verifyInternalConsistency() {
        int length = this.f43216f.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.f43216f[i2] != null) {
                i++;
            }
        }
        int i3 = length >> 1;
        for (int i4 = 0; i4 < i3; i4++) {
            for (C6079a c6079a = this.f43217g[i4]; c6079a != null; c6079a = c6079a.f43225b) {
                i++;
            }
        }
        if (i == this.f43218h) {
            return;
        }
        throw new IllegalStateException(String.format("Internal error: expected internal size %d vs calculated count %d", Integer.valueOf(this.f43218h), Integer.valueOf(i)));
    }

    public static CharsToNameCanonicalizer createRoot(int i) {
        return new CharsToNameCanonicalizer(i);
    }

    public int calcHash(String str) {
        int length = str.length();
        int i = this.f43213c;
        for (int i2 = 0; i2 < length; i2++) {
            i = (i * 33) + str.charAt(i2);
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* renamed from: com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer$b */
    /* loaded from: classes3.dex */
    public static final class C6080b {

        /* renamed from: a */
        public final int f43227a;

        /* renamed from: b */
        public final int f43228b;

        /* renamed from: c */
        public final String[] f43229c;

        /* renamed from: d */
        public final C6079a[] f43230d;

        public C6080b(int i, int i2, String[] strArr, C6079a[] c6079aArr) {
            this.f43227a = i;
            this.f43228b = i2;
            this.f43229c = strArr;
            this.f43230d = c6079aArr;
        }

        /* renamed from: a */
        public static C6080b m49502a(int i) {
            return new C6080b(0, 0, new String[i], new C6079a[i >> 1]);
        }

        public C6080b(CharsToNameCanonicalizer charsToNameCanonicalizer) {
            this.f43227a = charsToNameCanonicalizer.f43218h;
            this.f43228b = charsToNameCanonicalizer.f43221k;
            this.f43229c = charsToNameCanonicalizer.f43216f;
            this.f43230d = charsToNameCanonicalizer.f43217g;
        }
    }

    public CharsToNameCanonicalizer(CharsToNameCanonicalizer charsToNameCanonicalizer, int i, int i2, C6080b c6080b) {
        this.f43211a = charsToNameCanonicalizer;
        this.f43213c = i2;
        this.f43212b = null;
        this.f43214d = i;
        this.f43215e = JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(i);
        String[] strArr = c6080b.f43229c;
        this.f43216f = strArr;
        this.f43217g = c6080b.f43230d;
        this.f43218h = c6080b.f43227a;
        this.f43221k = c6080b.f43228b;
        int length = strArr.length;
        this.f43219i = m49511d(length);
        this.f43220j = length - 1;
        this.f43222l = true;
    }
}
