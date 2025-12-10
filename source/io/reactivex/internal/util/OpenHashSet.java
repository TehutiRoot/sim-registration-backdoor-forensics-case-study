package io.reactivex.internal.util;

/* loaded from: classes5.dex */
public final class OpenHashSet<T> {

    /* renamed from: a */
    public final float f66126a;

    /* renamed from: b */
    public int f66127b;

    /* renamed from: c */
    public int f66128c;

    /* renamed from: d */
    public int f66129d;

    /* renamed from: e */
    public Object[] f66130e;

    public OpenHashSet() {
        this(16, 0.75f);
    }

    /* renamed from: a */
    public static int m29886a(int i) {
        int i2 = i * (-1640531527);
        return i2 ^ (i2 >>> 16);
    }

    public boolean add(T t) {
        Object obj;
        Object[] objArr = this.f66130e;
        int i = this.f66127b;
        int m29886a = m29886a(t.hashCode()) & i;
        Object obj2 = objArr[m29886a];
        if (obj2 != null) {
            if (obj2.equals(t)) {
                return false;
            }
            do {
                m29886a = (m29886a + 1) & i;
                obj = objArr[m29886a];
                if (obj == null) {
                }
            } while (!obj.equals(t));
            return false;
        }
        objArr[m29886a] = t;
        int i2 = this.f66128c + 1;
        this.f66128c = i2;
        if (i2 >= this.f66129d) {
            m29885b();
        }
        return true;
    }

    /* renamed from: b */
    public void m29885b() {
        Object obj;
        Object[] objArr = this.f66130e;
        int length = objArr.length;
        int i = length << 1;
        int i2 = i - 1;
        Object[] objArr2 = new Object[i];
        int i3 = this.f66128c;
        while (true) {
            int i4 = i3 - 1;
            if (i3 != 0) {
                do {
                    length--;
                    obj = objArr[length];
                } while (obj == null);
                int m29886a = m29886a(obj.hashCode()) & i2;
                if (objArr2[m29886a] != null) {
                    do {
                        m29886a = (m29886a + 1) & i2;
                    } while (objArr2[m29886a] != null);
                }
                objArr2[m29886a] = objArr[length];
                i3 = i4;
            } else {
                this.f66127b = i2;
                this.f66129d = (int) (i * this.f66126a);
                this.f66130e = objArr2;
                return;
            }
        }
    }

    /* renamed from: c */
    public boolean m29884c(int i, Object[] objArr, int i2) {
        int i3;
        Object obj;
        this.f66128c--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                obj = objArr[i3];
                if (obj == null) {
                    objArr[i] = null;
                    return true;
                }
                int m29886a = m29886a(obj.hashCode()) & i2;
                if (i <= i3) {
                    if (i < m29886a && m29886a <= i3) {
                        i4 = i3 + 1;
                    }
                } else {
                    if (i >= m29886a && m29886a > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                }
            }
            objArr[i] = obj;
            i = i3;
        }
    }

    public Object[] keys() {
        return this.f66130e;
    }

    public boolean remove(T t) {
        Object obj;
        Object[] objArr = this.f66130e;
        int i = this.f66127b;
        int m29886a = m29886a(t.hashCode()) & i;
        Object obj2 = objArr[m29886a];
        if (obj2 == null) {
            return false;
        }
        if (obj2.equals(t)) {
            return m29884c(m29886a, objArr, i);
        }
        do {
            m29886a = (m29886a + 1) & i;
            obj = objArr[m29886a];
            if (obj == null) {
                return false;
            }
        } while (!obj.equals(t));
        return m29884c(m29886a, objArr, i);
    }

    public int size() {
        return this.f66128c;
    }

    public OpenHashSet(int i) {
        this(i, 0.75f);
    }

    public OpenHashSet(int i, float f) {
        this.f66126a = f;
        int roundToPowerOfTwo = Pow2.roundToPowerOfTwo(i);
        this.f66127b = roundToPowerOfTwo - 1;
        this.f66129d = (int) (f * roundToPowerOfTwo);
        this.f66130e = new Object[roundToPowerOfTwo];
    }
}
