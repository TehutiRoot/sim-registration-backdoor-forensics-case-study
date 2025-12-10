package com.fasterxml.jackson.core.sym;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ByteQuadsCanonicalizer {

    /* renamed from: a */
    public final ByteQuadsCanonicalizer f43189a;

    /* renamed from: b */
    public final AtomicReference f43190b;

    /* renamed from: c */
    public final int f43191c;

    /* renamed from: d */
    public boolean f43192d;

    /* renamed from: e */
    public final boolean f43193e;

    /* renamed from: f */
    public int[] f43194f;

    /* renamed from: g */
    public int f43195g;

    /* renamed from: h */
    public int f43196h;

    /* renamed from: i */
    public int f43197i;

    /* renamed from: j */
    public int f43198j;

    /* renamed from: k */
    public int f43199k;

    /* renamed from: l */
    public String[] f43200l;

    /* renamed from: m */
    public int f43201m;

    /* renamed from: n */
    public int f43202n;

    /* renamed from: o */
    public boolean f43203o;

    public ByteQuadsCanonicalizer(int i, boolean z, int i2, boolean z2) {
        this.f43189a = null;
        this.f43191c = i2;
        this.f43192d = z;
        this.f43193e = z2;
        int i3 = 16;
        if (i < 16) {
            i = 16;
        } else if (((i - 1) & i) != 0) {
            while (i3 < i) {
                i3 += i3;
            }
            i = i3;
        }
        this.f43190b = new AtomicReference(C6078a.m49515a(i));
    }

    /* renamed from: c */
    public static int m49537c(int i) {
        int i2 = i >> 2;
        if (i2 < 64) {
            return 4;
        }
        if (i2 <= 256) {
            return 5;
        }
        return i2 <= 1024 ? 6 : 7;
    }

    public static ByteQuadsCanonicalizer createRoot() {
        long currentTimeMillis = System.currentTimeMillis();
        return createRoot((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    public void _reportTooManyCollisions() {
        if (this.f43195g <= 1024) {
            return;
        }
        throw new IllegalStateException("Spill-over slots in symbol table with " + this.f43199k + " entries, hash area of " + this.f43195g + " slots is now full (all " + (this.f43195g >> 3) + " slots -- suspect a DoS attack based on hash collisions. You can disable the check via `JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW`");
    }

    /* renamed from: a */
    public final int m49539a(int[] iArr, int i) {
        int i2 = this.f43202n;
        int i3 = i2 + i;
        int[] iArr2 = this.f43194f;
        if (i3 > iArr2.length) {
            this.f43194f = Arrays.copyOf(this.f43194f, this.f43194f.length + Math.max(i3 - iArr2.length, Math.min(4096, this.f43195g)));
        }
        System.arraycopy(iArr, 0, this.f43194f, i2, i);
        this.f43202n += i;
        return i2;
    }

    public String addName(String str, int i) {
        m49526n();
        if (this.f43192d) {
            str = InternCache.instance.intern(str);
        }
        int m49535e = m49535e(calcHash(i));
        int[] iArr = this.f43194f;
        iArr[m49535e] = i;
        iArr[m49535e + 3] = 1;
        this.f43200l[m49535e >> 2] = str;
        this.f43199k++;
        return str;
    }

    /* renamed from: b */
    public final int m49538b(int i) {
        return (i & (this.f43195g - 1)) << 2;
    }

    public int bucketCount() {
        return this.f43195g;
    }

    public int calcHash(int i) {
        int i2 = i ^ this.f43191c;
        int i3 = i2 + (i2 >>> 16);
        int i4 = i3 ^ (i3 << 3);
        return i4 + (i4 >>> 12);
    }

    /* renamed from: d */
    public final boolean m49536d() {
        if (this.f43199k > (this.f43195g >> 1)) {
            int m49529k = (this.f43201m - m49529k()) >> 2;
            int i = this.f43199k;
            if (m49529k > ((i + 1) >> 7) || i > this.f43195g * 0.8d) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: e */
    public final int m49535e(int i) {
        int m49538b = m49538b(i);
        int[] iArr = this.f43194f;
        if (iArr[m49538b + 3] == 0) {
            return m49538b;
        }
        if (m49536d()) {
            return m49530j(i);
        }
        int i2 = this.f43196h + ((m49538b >> 3) << 2);
        if (iArr[i2 + 3] == 0) {
            return i2;
        }
        int i3 = this.f43197i;
        int i4 = this.f43198j;
        int i5 = i3 + ((m49538b >> (i4 + 2)) << i4);
        int i6 = (1 << i4) + i5;
        while (i5 < i6) {
            if (iArr[i5 + 3] == 0) {
                return i5;
            }
            i5 += 4;
        }
        int i7 = this.f43201m;
        int i8 = i7 + 4;
        this.f43201m = i8;
        if (i8 >= (this.f43195g << 3)) {
            if (this.f43193e) {
                _reportTooManyCollisions();
            }
            return m49530j(i);
        }
        return i7;
    }

    /* renamed from: f */
    public final String m49534f(int i, int i2) {
        int i3 = this.f43197i;
        int i4 = this.f43198j;
        int i5 = i3 + ((i >> (i4 + 2)) << i4);
        int[] iArr = this.f43194f;
        int i6 = (1 << i4) + i5;
        while (i5 < i6) {
            int i7 = iArr[i5 + 3];
            if (i2 == iArr[i5] && 1 == i7) {
                return this.f43200l[i5 >> 2];
            }
            if (i7 == 0) {
                return null;
            }
            i5 += 4;
        }
        for (int m49529k = m49529k(); m49529k < this.f43201m; m49529k += 4) {
            if (i2 == iArr[m49529k] && 1 == iArr[m49529k + 3]) {
                return this.f43200l[m49529k >> 2];
            }
        }
        return null;
    }

    public String findName(int i) {
        int m49538b = m49538b(calcHash(i));
        int[] iArr = this.f43194f;
        int i2 = iArr[m49538b + 3];
        if (i2 == 1) {
            if (iArr[m49538b] == i) {
                return this.f43200l[m49538b >> 2];
            }
        } else if (i2 == 0) {
            return null;
        }
        int i3 = this.f43196h + ((m49538b >> 3) << 2);
        int i4 = iArr[i3 + 3];
        if (i4 == 1) {
            if (iArr[i3] == i) {
                return this.f43200l[i3 >> 2];
            }
        } else if (i4 == 0) {
            return null;
        }
        return m49534f(m49538b, i);
    }

    /* renamed from: g */
    public final String m49533g(int i, int i2, int i3) {
        int i4 = this.f43197i;
        int i5 = this.f43198j;
        int i6 = i4 + ((i >> (i5 + 2)) << i5);
        int[] iArr = this.f43194f;
        int i7 = (1 << i5) + i6;
        while (i6 < i7) {
            int i8 = iArr[i6 + 3];
            if (i2 == iArr[i6] && i3 == iArr[i6 + 1] && 2 == i8) {
                return this.f43200l[i6 >> 2];
            }
            if (i8 == 0) {
                return null;
            }
            i6 += 4;
        }
        for (int m49529k = m49529k(); m49529k < this.f43201m; m49529k += 4) {
            if (i2 == iArr[m49529k] && i3 == iArr[m49529k + 1] && 2 == iArr[m49529k + 3]) {
                return this.f43200l[m49529k >> 2];
            }
        }
        return null;
    }

    /* renamed from: h */
    public final String m49532h(int i, int i2, int i3, int i4) {
        int i5 = this.f43197i;
        int i6 = this.f43198j;
        int i7 = i5 + ((i >> (i6 + 2)) << i6);
        int[] iArr = this.f43194f;
        int i8 = (1 << i6) + i7;
        while (i7 < i8) {
            int i9 = iArr[i7 + 3];
            if (i2 == iArr[i7] && i3 == iArr[i7 + 1] && i4 == iArr[i7 + 2] && 3 == i9) {
                return this.f43200l[i7 >> 2];
            }
            if (i9 == 0) {
                return null;
            }
            i7 += 4;
        }
        for (int m49529k = m49529k(); m49529k < this.f43201m; m49529k += 4) {
            if (i2 == iArr[m49529k] && i3 == iArr[m49529k + 1] && i4 == iArr[m49529k + 2] && 3 == iArr[m49529k + 3]) {
                return this.f43200l[m49529k >> 2];
            }
        }
        return null;
    }

    public int hashSeed() {
        return this.f43191c;
    }

    /* renamed from: i */
    public final String m49531i(int i, int i2, int[] iArr, int i3) {
        int i4 = this.f43197i;
        int i5 = this.f43198j;
        int i6 = i4 + ((i >> (i5 + 2)) << i5);
        int[] iArr2 = this.f43194f;
        int i7 = (1 << i5) + i6;
        while (i6 < i7) {
            int i8 = iArr2[i6 + 3];
            if (i2 == iArr2[i6] && i3 == i8 && m49528l(iArr, i3, iArr2[i6 + 1])) {
                return this.f43200l[i6 >> 2];
            }
            if (i8 == 0) {
                return null;
            }
            i6 += 4;
        }
        for (int m49529k = m49529k(); m49529k < this.f43201m; m49529k += 4) {
            if (i2 == iArr2[m49529k] && i3 == iArr2[m49529k + 3] && m49528l(iArr, i3, iArr2[m49529k + 1])) {
                return this.f43200l[m49529k >> 2];
            }
        }
        return null;
    }

    /* renamed from: j */
    public final int m49530j(int i) {
        m49516x();
        int m49538b = m49538b(i);
        int[] iArr = this.f43194f;
        if (iArr[m49538b + 3] == 0) {
            return m49538b;
        }
        int i2 = this.f43196h + ((m49538b >> 3) << 2);
        if (iArr[i2 + 3] == 0) {
            return i2;
        }
        int i3 = this.f43197i;
        int i4 = this.f43198j;
        int i5 = i3 + ((m49538b >> (i4 + 2)) << i4);
        int i6 = (1 << i4) + i5;
        while (i5 < i6) {
            if (iArr[i5 + 3] == 0) {
                return i5;
            }
            i5 += 4;
        }
        int i7 = this.f43201m;
        this.f43201m = i7 + 4;
        return i7;
    }

    /* renamed from: k */
    public final int m49529k() {
        int i = this.f43195g;
        return (i << 3) - i;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m49528l(int[] r8, int r9, int r10) {
        /*
            r7 = this;
            int[] r0 = r7.f43194f
            r1 = 1
            r2 = 0
            switch(r9) {
                case 4: goto L42;
                case 5: goto L34;
                case 6: goto L26;
                case 7: goto L18;
                case 8: goto Lc;
                default: goto L7;
            }
        L7:
            boolean r8 = r7.m49527m(r8, r9, r10)
            return r8
        Lc:
            r9 = r8[r2]
            int r3 = r10 + 1
            r10 = r0[r10]
            if (r9 == r10) goto L15
            return r2
        L15:
            r10 = r3
            r9 = 1
            goto L19
        L18:
            r9 = 0
        L19:
            int r3 = r9 + 1
            r9 = r8[r9]
            int r4 = r10 + 1
            r10 = r0[r10]
            if (r9 == r10) goto L24
            return r2
        L24:
            r10 = r4
            goto L27
        L26:
            r3 = 0
        L27:
            int r9 = r3 + 1
            r3 = r8[r3]
            int r4 = r10 + 1
            r10 = r0[r10]
            if (r3 == r10) goto L32
            return r2
        L32:
            r10 = r4
            goto L35
        L34:
            r9 = 0
        L35:
            int r3 = r9 + 1
            r9 = r8[r9]
            int r4 = r10 + 1
            r10 = r0[r10]
            if (r9 == r10) goto L40
            return r2
        L40:
            r10 = r4
            goto L43
        L42:
            r3 = 0
        L43:
            int r9 = r3 + 1
            r4 = r8[r3]
            int r5 = r10 + 1
            r6 = r0[r10]
            if (r4 == r6) goto L4e
            return r2
        L4e:
            int r4 = r3 + 2
            r9 = r8[r9]
            int r6 = r10 + 2
            r5 = r0[r5]
            if (r9 == r5) goto L59
            return r2
        L59:
            int r3 = r3 + 3
            r9 = r8[r4]
            int r10 = r10 + 3
            r4 = r0[r6]
            if (r9 == r4) goto L64
            return r2
        L64:
            r8 = r8[r3]
            r9 = r0[r10]
            if (r8 == r9) goto L6b
            return r2
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer.m49528l(int[], int, int):boolean");
    }

    /* renamed from: m */
    public final boolean m49527m(int[] iArr, int i, int i2) {
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2 + 1;
            if (iArr[i3] != this.f43194f[i2]) {
                return false;
            }
            if (i4 >= i) {
                return true;
            }
            i3 = i4;
            i2 = i5;
        }
    }

    public ByteQuadsCanonicalizer makeChild(int i) {
        return new ByteQuadsCanonicalizer(this, JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(i), this.f43191c, JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(i), (C6078a) this.f43190b.get());
    }

    public boolean maybeDirty() {
        return !this.f43203o;
    }

    /* renamed from: n */
    public final void m49526n() {
        if (this.f43203o) {
            int[] iArr = this.f43194f;
            this.f43194f = Arrays.copyOf(iArr, iArr.length);
            String[] strArr = this.f43200l;
            this.f43200l = (String[]) Arrays.copyOf(strArr, strArr.length);
            this.f43203o = false;
        }
    }

    public int primaryCount() {
        int i = this.f43196h;
        int i2 = 0;
        for (int i3 = 3; i3 < i; i3 += 4) {
            if (this.f43194f[i3] != 0) {
                i2++;
            }
        }
        return i2;
    }

    public void release() {
        if (this.f43189a != null && maybeDirty()) {
            this.f43189a.m49518v(new C6078a(this));
            this.f43203o = true;
        }
    }

    public int secondaryCount() {
        int i = this.f43197i;
        int i2 = 0;
        for (int i3 = this.f43196h + 3; i3 < i; i3 += 4) {
            if (this.f43194f[i3] != 0) {
                i2++;
            }
        }
        return i2;
    }

    public int size() {
        AtomicReference atomicReference = this.f43190b;
        if (atomicReference != null) {
            return ((C6078a) atomicReference.get()).f43205b;
        }
        return this.f43199k;
    }

    public int spilloverCount() {
        return (this.f43201m - m49529k()) >> 2;
    }

    public int tertiaryCount() {
        int i = this.f43197i + 3;
        int i2 = this.f43195g + i;
        int i3 = 0;
        while (i < i2) {
            if (this.f43194f[i] != 0) {
                i3++;
            }
            i += 4;
        }
        return i3;
    }

    public String toString() {
        int primaryCount = primaryCount();
        int secondaryCount = secondaryCount();
        int tertiaryCount = tertiaryCount();
        int spilloverCount = spilloverCount();
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", ByteQuadsCanonicalizer.class.getName(), Integer.valueOf(this.f43199k), Integer.valueOf(this.f43195g), Integer.valueOf(primaryCount), Integer.valueOf(secondaryCount), Integer.valueOf(tertiaryCount), Integer.valueOf(spilloverCount), Integer.valueOf(primaryCount + secondaryCount + tertiaryCount + spilloverCount), Integer.valueOf(totalCount()));
    }

    public int totalCount() {
        int i = this.f43195g << 3;
        int i2 = 0;
        for (int i3 = 3; i3 < i; i3 += 4) {
            if (this.f43194f[i3] != 0) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: v */
    public final void m49518v(C6078a c6078a) {
        int i = c6078a.f43205b;
        C6078a c6078a2 = (C6078a) this.f43190b.get();
        if (i == c6078a2.f43205b) {
            return;
        }
        if (i > 6000) {
            c6078a = C6078a.m49515a(64);
        }
        AbstractC17300An1.m69050a(this.f43190b, c6078a2, c6078a);
    }

    /* renamed from: w */
    public final void m49517w(boolean z) {
        this.f43199k = 0;
        this.f43201m = m49529k();
        this.f43202n = this.f43195g << 3;
        if (z) {
            Arrays.fill(this.f43194f, 0);
            Arrays.fill(this.f43200l, (Object) null);
        }
    }

    /* renamed from: x */
    public final void m49516x() {
        this.f43203o = false;
        int[] iArr = this.f43194f;
        String[] strArr = this.f43200l;
        int i = this.f43195g;
        int i2 = this.f43199k;
        int i3 = i + i;
        int i4 = this.f43201m;
        if (i3 > 65536) {
            m49517w(true);
            return;
        }
        this.f43194f = new int[iArr.length + (i << 3)];
        this.f43195g = i3;
        int i5 = i3 << 2;
        this.f43196h = i5;
        this.f43197i = i5 + (i5 >> 1);
        this.f43198j = m49537c(i3);
        this.f43200l = new String[strArr.length << 1];
        m49517w(false);
        int[] iArr2 = new int[16];
        int i6 = 0;
        for (int i7 = 0; i7 < i4; i7 += 4) {
            int i8 = iArr[i7 + 3];
            if (i8 != 0) {
                i6++;
                String str = strArr[i7 >> 2];
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 > iArr2.length) {
                                iArr2 = new int[i8];
                            }
                            System.arraycopy(iArr, iArr[i7 + 1], iArr2, 0, i8);
                            addName(str, iArr2, i8);
                        } else {
                            iArr2[0] = iArr[i7];
                            iArr2[1] = iArr[i7 + 1];
                            iArr2[2] = iArr[i7 + 2];
                            addName(str, iArr2, 3);
                        }
                    } else {
                        iArr2[0] = iArr[i7];
                        iArr2[1] = iArr[i7 + 1];
                        addName(str, iArr2, 2);
                    }
                } else {
                    iArr2[0] = iArr[i7];
                    addName(str, iArr2, 1);
                }
            }
        }
        if (i6 == i2) {
            return;
        }
        throw new IllegalStateException("Failed rehash(): old count=" + i2 + ", copyCount=" + i6);
    }

    public int calcHash(int i, int i2) {
        int i3 = i + (i >>> 15);
        int i4 = ((i3 ^ (i3 >>> 9)) + (i2 * 33)) ^ this.f43191c;
        int i5 = i4 + (i4 >>> 16);
        int i6 = i5 ^ (i5 >>> 4);
        return i6 + (i6 << 3);
    }

    public static ByteQuadsCanonicalizer createRoot(int i) {
        return new ByteQuadsCanonicalizer(64, true, i, true);
    }

    public int calcHash(int i, int i2, int i3) {
        int i4 = i ^ this.f43191c;
        int i5 = (((i4 + (i4 >>> 9)) * 31) + i2) * 33;
        int i6 = (i5 + (i5 >>> 15)) ^ i3;
        int i7 = i6 + (i6 >>> 4);
        int i8 = i7 + (i7 >>> 15);
        return i8 ^ (i8 << 9);
    }

    public int calcHash(int[] iArr, int i) {
        if (i >= 4) {
            int i2 = iArr[0] ^ this.f43191c;
            int i3 = i2 + (i2 >>> 9) + iArr[1];
            int i4 = ((i3 + (i3 >>> 15)) * 33) ^ iArr[2];
            int i5 = i4 + (i4 >>> 4);
            for (int i6 = 3; i6 < i; i6++) {
                int i7 = iArr[i6];
                i5 += i7 ^ (i7 >> 21);
            }
            int i8 = i5 * 65599;
            int i9 = i8 + (i8 >>> 19);
            return (i9 << 5) ^ i9;
        }
        throw new IllegalArgumentException();
    }

    public ByteQuadsCanonicalizer(ByteQuadsCanonicalizer byteQuadsCanonicalizer, boolean z, int i, boolean z2, C6078a c6078a) {
        this.f43189a = byteQuadsCanonicalizer;
        this.f43191c = i;
        this.f43192d = z;
        this.f43193e = z2;
        this.f43190b = null;
        this.f43199k = c6078a.f43205b;
        int i2 = c6078a.f43204a;
        this.f43195g = i2;
        int i3 = i2 << 2;
        this.f43196h = i3;
        this.f43197i = i3 + (i3 >> 1);
        this.f43198j = c6078a.f43206c;
        this.f43194f = c6078a.f43207d;
        this.f43200l = c6078a.f43208e;
        this.f43201m = c6078a.f43209f;
        this.f43202n = c6078a.f43210g;
        this.f43203o = true;
    }

    /* renamed from: com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer$a */
    /* loaded from: classes3.dex */
    public static final class C6078a {

        /* renamed from: a */
        public final int f43204a;

        /* renamed from: b */
        public final int f43205b;

        /* renamed from: c */
        public final int f43206c;

        /* renamed from: d */
        public final int[] f43207d;

        /* renamed from: e */
        public final String[] f43208e;

        /* renamed from: f */
        public final int f43209f;

        /* renamed from: g */
        public final int f43210g;

        public C6078a(int i, int i2, int i3, int[] iArr, String[] strArr, int i4, int i5) {
            this.f43204a = i;
            this.f43205b = i2;
            this.f43206c = i3;
            this.f43207d = iArr;
            this.f43208e = strArr;
            this.f43209f = i4;
            this.f43210g = i5;
        }

        /* renamed from: a */
        public static C6078a m49515a(int i) {
            int i2 = i << 3;
            return new C6078a(i, 0, ByteQuadsCanonicalizer.m49537c(i), new int[i2], new String[i << 1], i2 - i, i2);
        }

        public C6078a(ByteQuadsCanonicalizer byteQuadsCanonicalizer) {
            this.f43204a = byteQuadsCanonicalizer.f43195g;
            this.f43205b = byteQuadsCanonicalizer.f43199k;
            this.f43206c = byteQuadsCanonicalizer.f43198j;
            this.f43207d = byteQuadsCanonicalizer.f43194f;
            this.f43208e = byteQuadsCanonicalizer.f43200l;
            this.f43209f = byteQuadsCanonicalizer.f43201m;
            this.f43210g = byteQuadsCanonicalizer.f43202n;
        }
    }

    public String addName(String str, int i, int i2) {
        m49526n();
        if (this.f43192d) {
            str = InternCache.instance.intern(str);
        }
        int m49535e = m49535e(i2 == 0 ? calcHash(i) : calcHash(i, i2));
        int[] iArr = this.f43194f;
        iArr[m49535e] = i;
        iArr[m49535e + 1] = i2;
        iArr[m49535e + 3] = 2;
        this.f43200l[m49535e >> 2] = str;
        this.f43199k++;
        return str;
    }

    public String findName(int i, int i2) {
        int m49538b = m49538b(calcHash(i, i2));
        int[] iArr = this.f43194f;
        int i3 = iArr[m49538b + 3];
        if (i3 == 2) {
            if (i == iArr[m49538b] && i2 == iArr[m49538b + 1]) {
                return this.f43200l[m49538b >> 2];
            }
        } else if (i3 == 0) {
            return null;
        }
        int i4 = this.f43196h + ((m49538b >> 3) << 2);
        int i5 = iArr[i4 + 3];
        if (i5 == 2) {
            if (i == iArr[i4] && i2 == iArr[i4 + 1]) {
                return this.f43200l[i4 >> 2];
            }
        } else if (i5 == 0) {
            return null;
        }
        return m49533g(m49538b, i, i2);
    }

    public String addName(String str, int i, int i2, int i3) {
        m49526n();
        if (this.f43192d) {
            str = InternCache.instance.intern(str);
        }
        int m49535e = m49535e(calcHash(i, i2, i3));
        int[] iArr = this.f43194f;
        iArr[m49535e] = i;
        iArr[m49535e + 1] = i2;
        iArr[m49535e + 2] = i3;
        iArr[m49535e + 3] = 3;
        this.f43200l[m49535e >> 2] = str;
        this.f43199k++;
        return str;
    }

    public String findName(int i, int i2, int i3) {
        int m49538b = m49538b(calcHash(i, i2, i3));
        int[] iArr = this.f43194f;
        int i4 = iArr[m49538b + 3];
        if (i4 == 3) {
            if (i == iArr[m49538b] && iArr[m49538b + 1] == i2 && iArr[m49538b + 2] == i3) {
                return this.f43200l[m49538b >> 2];
            }
        } else if (i4 == 0) {
            return null;
        }
        int i5 = this.f43196h + ((m49538b >> 3) << 2);
        int i6 = iArr[i5 + 3];
        if (i6 == 3) {
            if (i == iArr[i5] && iArr[i5 + 1] == i2 && iArr[i5 + 2] == i3) {
                return this.f43200l[i5 >> 2];
            }
        } else if (i6 == 0) {
            return null;
        }
        return m49532h(m49538b, i, i2, i3);
    }

    public String addName(String str, int[] iArr, int i) {
        int m49535e;
        m49526n();
        if (this.f43192d) {
            str = InternCache.instance.intern(str);
        }
        if (i == 1) {
            m49535e = m49535e(calcHash(iArr[0]));
            int[] iArr2 = this.f43194f;
            iArr2[m49535e] = iArr[0];
            iArr2[m49535e + 3] = 1;
        } else if (i == 2) {
            m49535e = m49535e(calcHash(iArr[0], iArr[1]));
            int[] iArr3 = this.f43194f;
            iArr3[m49535e] = iArr[0];
            iArr3[m49535e + 1] = iArr[1];
            iArr3[m49535e + 3] = 2;
        } else if (i != 3) {
            int calcHash = calcHash(iArr, i);
            m49535e = m49535e(calcHash);
            this.f43194f[m49535e] = calcHash;
            int m49539a = m49539a(iArr, i);
            int[] iArr4 = this.f43194f;
            iArr4[m49535e + 1] = m49539a;
            iArr4[m49535e + 3] = i;
        } else {
            int m49535e2 = m49535e(calcHash(iArr[0], iArr[1], iArr[2]));
            int[] iArr5 = this.f43194f;
            iArr5[m49535e2] = iArr[0];
            iArr5[m49535e2 + 1] = iArr[1];
            iArr5[m49535e2 + 2] = iArr[2];
            iArr5[m49535e2 + 3] = 3;
            m49535e = m49535e2;
        }
        this.f43200l[m49535e >> 2] = str;
        this.f43199k++;
        return str;
    }

    public String findName(int[] iArr, int i) {
        if (i < 4) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return "";
                    }
                    return findName(iArr[0], iArr[1], iArr[2]);
                }
                return findName(iArr[0], iArr[1]);
            }
            return findName(iArr[0]);
        }
        int calcHash = calcHash(iArr, i);
        int m49538b = m49538b(calcHash);
        int[] iArr2 = this.f43194f;
        int i2 = iArr2[m49538b + 3];
        if (calcHash == iArr2[m49538b] && i2 == i && m49528l(iArr, i, iArr2[m49538b + 1])) {
            return this.f43200l[m49538b >> 2];
        }
        if (i2 == 0) {
            return null;
        }
        int i3 = this.f43196h + ((m49538b >> 3) << 2);
        int i4 = iArr2[i3 + 3];
        if (calcHash == iArr2[i3] && i4 == i && m49528l(iArr, i, iArr2[i3 + 1])) {
            return this.f43200l[i3 >> 2];
        }
        return m49531i(m49538b, calcHash, iArr, i);
    }
}
