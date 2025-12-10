package io.reactivex.internal.util;

/* loaded from: classes5.dex */
public final class OpenHashSet<T> {

    /* renamed from: a */
    public final float f66189a;

    /* renamed from: b */
    public int f66190b;

    /* renamed from: c */
    public int f66191c;

    /* renamed from: d */
    public int f66192d;

    /* renamed from: e */
    public Object[] f66193e;

    public OpenHashSet() {
        this(16, 0.75f);
    }

    /* renamed from: a */
    public static int m30226a(int i) {
        int i2 = i * (-1640531527);
        return i2 ^ (i2 >>> 16);
    }

    public boolean add(T t) {
        Object obj;
        Object[] objArr = this.f66193e;
        int i = this.f66190b;
        int m30226a = m30226a(t.hashCode()) & i;
        Object obj2 = objArr[m30226a];
        if (obj2 != null) {
            if (obj2.equals(t)) {
                return false;
            }
            do {
                m30226a = (m30226a + 1) & i;
                obj = objArr[m30226a];
                if (obj == null) {
                }
            } while (!obj.equals(t));
            return false;
        }
        objArr[m30226a] = t;
        int i2 = this.f66191c + 1;
        this.f66191c = i2;
        if (i2 >= this.f66192d) {
            m30225b();
        }
        return true;
    }

    /* renamed from: b */
    public void m30225b() {
        Object obj;
        Object[] objArr = this.f66193e;
        int length = objArr.length;
        int i = length << 1;
        int i2 = i - 1;
        Object[] objArr2 = new Object[i];
        int i3 = this.f66191c;
        while (true) {
            int i4 = i3 - 1;
            if (i3 != 0) {
                do {
                    length--;
                    obj = objArr[length];
                } while (obj == null);
                int m30226a = m30226a(obj.hashCode()) & i2;
                if (objArr2[m30226a] != null) {
                    do {
                        m30226a = (m30226a + 1) & i2;
                    } while (objArr2[m30226a] != null);
                }
                objArr2[m30226a] = objArr[length];
                i3 = i4;
            } else {
                this.f66190b = i2;
                this.f66192d = (int) (i * this.f66189a);
                this.f66193e = objArr2;
                return;
            }
        }
    }

    /* renamed from: c */
    public boolean m30224c(int i, Object[] objArr, int i2) {
        int i3;
        Object obj;
        this.f66191c--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                obj = objArr[i3];
                if (obj == null) {
                    objArr[i] = null;
                    return true;
                }
                int m30226a = m30226a(obj.hashCode()) & i2;
                if (i <= i3) {
                    if (i < m30226a && m30226a <= i3) {
                        i4 = i3 + 1;
                    }
                } else {
                    if (i >= m30226a && m30226a > i3) {
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
        return this.f66193e;
    }

    public boolean remove(T t) {
        Object obj;
        Object[] objArr = this.f66193e;
        int i = this.f66190b;
        int m30226a = m30226a(t.hashCode()) & i;
        Object obj2 = objArr[m30226a];
        if (obj2 == null) {
            return false;
        }
        if (obj2.equals(t)) {
            return m30224c(m30226a, objArr, i);
        }
        do {
            m30226a = (m30226a + 1) & i;
            obj = objArr[m30226a];
            if (obj == null) {
                return false;
            }
        } while (!obj.equals(t));
        return m30224c(m30226a, objArr, i);
    }

    public int size() {
        return this.f66191c;
    }

    public OpenHashSet(int i) {
        this(i, 0.75f);
    }

    public OpenHashSet(int i, float f) {
        this.f66189a = f;
        int roundToPowerOfTwo = Pow2.roundToPowerOfTwo(i);
        this.f66190b = roundToPowerOfTwo - 1;
        this.f66192d = (int) (f * roundToPowerOfTwo);
        this.f66193e = new Object[roundToPowerOfTwo];
    }
}