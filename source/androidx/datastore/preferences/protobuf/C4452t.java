package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.t */
/* loaded from: classes2.dex */
public final class C4452t extends AbstractC4422a implements RandomAccess {

    /* renamed from: d */
    public static final C4452t f34973d;

    /* renamed from: b */
    public Object[] f34974b;

    /* renamed from: c */
    public int f34975c;

    static {
        C4452t c4452t = new C4452t(new Object[0], 0);
        f34973d = c4452t;
        c4452t.makeImmutable();
    }

    public C4452t(Object[] objArr, int i) {
        this.f34974b = objArr;
        this.f34975c = i;
    }

    /* renamed from: a */
    public static Object[] m55065a(int i) {
        return new Object[i];
    }

    /* renamed from: b */
    public static C4452t m55064b() {
        return f34973d;
    }

    /* renamed from: c */
    private void m55063c(int i) {
        if (i >= 0 && i < this.f34975c) {
            return;
        }
        throw new IndexOutOfBoundsException(m55062d(i));
    }

    /* renamed from: d */
    private String m55062d(int i) {
        return "Index:" + i + ", Size:" + this.f34975c;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4422a, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        ensureIsMutable();
        int i = this.f34975c;
        Object[] objArr = this.f34974b;
        if (i == objArr.length) {
            this.f34974b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f34974b;
        int i2 = this.f34975c;
        this.f34975c = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList
    /* renamed from: e */
    public C4452t mutableCopyWithCapacity(int i) {
        if (i >= this.f34975c) {
            return new C4452t(Arrays.copyOf(this.f34974b, i), this.f34975c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        m55063c(i);
        return this.f34974b[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i) {
        int i2;
        ensureIsMutable();
        m55063c(i);
        Object[] objArr = this.f34974b;
        Object obj = objArr[i];
        if (i < this.f34975c - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f34975c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        ensureIsMutable();
        m55063c(i);
        Object[] objArr = this.f34974b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f34975c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        int i2;
        ensureIsMutable();
        if (i >= 0 && i <= (i2 = this.f34975c)) {
            Object[] objArr = this.f34974b;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] m55065a = m55065a(((i2 * 3) / 2) + 1);
                System.arraycopy(this.f34974b, 0, m55065a, 0, i);
                System.arraycopy(this.f34974b, i, m55065a, i + 1, this.f34975c - i);
                this.f34974b = m55065a;
            }
            this.f34974b[i] = obj;
            this.f34975c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m55062d(i));
    }
}
