package p046rx.internal.util;

import java.util.Arrays;
import p046rx.functions.Action1;
import p046rx.internal.util.unsafe.Pow2;

/* renamed from: rx.internal.util.OpenHashSet */
/* loaded from: classes7.dex */
public final class OpenHashSet<T> {

    /* renamed from: a */
    public final float f79411a;

    /* renamed from: b */
    public int f79412b;

    /* renamed from: c */
    public int f79413c;

    /* renamed from: d */
    public int f79414d;

    /* renamed from: e */
    public Object[] f79415e;

    public OpenHashSet() {
        this(16, 0.75f);
    }

    /* renamed from: a */
    public static int m23069a(int i) {
        int i2 = i * (-1640531527);
        return i2 ^ (i2 >>> 16);
    }

    public boolean add(T t) {
        Object obj;
        Object[] objArr = this.f79415e;
        int i = this.f79412b;
        int m23069a = m23069a(t.hashCode()) & i;
        Object obj2 = objArr[m23069a];
        if (obj2 != null) {
            if (obj2.equals(t)) {
                return false;
            }
            do {
                m23069a = (m23069a + 1) & i;
                obj = objArr[m23069a];
                if (obj == null) {
                }
            } while (!obj.equals(t));
            return false;
        }
        objArr[m23069a] = t;
        int i2 = this.f79413c + 1;
        this.f79413c = i2;
        if (i2 >= this.f79414d) {
            m23068b();
        }
        return true;
    }

    /* renamed from: b */
    public void m23068b() {
        Object obj;
        Object[] objArr = this.f79415e;
        int length = objArr.length;
        int i = length << 1;
        int i2 = i - 1;
        Object[] objArr2 = new Object[i];
        int i3 = this.f79413c;
        while (true) {
            int i4 = i3 - 1;
            if (i3 != 0) {
                do {
                    length--;
                    obj = objArr[length];
                } while (obj == null);
                int m23069a = m23069a(obj.hashCode()) & i2;
                if (objArr2[m23069a] != null) {
                    do {
                        m23069a = (m23069a + 1) & i2;
                    } while (objArr2[m23069a] != null);
                }
                objArr2[m23069a] = objArr[length];
                i3 = i4;
            } else {
                this.f79412b = i2;
                this.f79414d = (int) (i * this.f79411a);
                this.f79415e = objArr2;
                return;
            }
        }
    }

    /* renamed from: c */
    public boolean m23067c(int i, Object[] objArr, int i2) {
        int i3;
        Object obj;
        this.f79413c--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                obj = objArr[i3];
                if (obj == null) {
                    objArr[i] = null;
                    return true;
                }
                int m23069a = m23069a(obj.hashCode()) & i2;
                if (i <= i3) {
                    if (i < m23069a && m23069a <= i3) {
                        i4 = i3 + 1;
                    }
                } else {
                    if (i >= m23069a && m23069a > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                }
            }
            objArr[i] = obj;
            i = i3;
        }
    }

    public void clear(Action1<? super T> action1) {
        if (this.f79413c == 0) {
            return;
        }
        Object[] objArr = this.f79415e;
        for (Object obj : objArr) {
            if (obj != null) {
                action1.call(obj);
            }
        }
        Arrays.fill(objArr, (Object) null);
        this.f79413c = 0;
    }

    public boolean isEmpty() {
        if (this.f79413c == 0) {
            return true;
        }
        return false;
    }

    public boolean remove(T t) {
        Object obj;
        Object[] objArr = this.f79415e;
        int i = this.f79412b;
        int m23069a = m23069a(t.hashCode()) & i;
        Object obj2 = objArr[m23069a];
        if (obj2 == null) {
            return false;
        }
        if (obj2.equals(t)) {
            return m23067c(m23069a, objArr, i);
        }
        do {
            m23069a = (m23069a + 1) & i;
            obj = objArr[m23069a];
            if (obj == null) {
                return false;
            }
        } while (!obj.equals(t));
        return m23067c(m23069a, objArr, i);
    }

    public void terminate() {
        this.f79413c = 0;
        this.f79415e = new Object[0];
    }

    public T[] values() {
        return (T[]) this.f79415e;
    }

    public OpenHashSet(int i) {
        this(i, 0.75f);
    }

    public OpenHashSet(int i, float f) {
        this.f79411a = f;
        int roundToPowerOfTwo = Pow2.roundToPowerOfTwo(i);
        this.f79412b = roundToPowerOfTwo - 1;
        this.f79414d = (int) (f * roundToPowerOfTwo);
        this.f79415e = new Object[roundToPowerOfTwo];
    }
}