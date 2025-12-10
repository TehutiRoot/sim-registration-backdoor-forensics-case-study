package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.t */
/* loaded from: classes2.dex */
public final class C4434t extends AbstractC4404a implements RandomAccess {

    /* renamed from: d */
    public static final C4434t f35061d;

    /* renamed from: b */
    public Object[] f35062b;

    /* renamed from: c */
    public int f35063c;

    static {
        C4434t c4434t = new C4434t(new Object[0], 0);
        f35061d = c4434t;
        c4434t.makeImmutable();
    }

    public C4434t(Object[] objArr, int i) {
        this.f35062b = objArr;
        this.f35063c = i;
    }

    /* renamed from: a */
    public static Object[] m55015a(int i) {
        return new Object[i];
    }

    /* renamed from: b */
    public static C4434t m55014b() {
        return f35061d;
    }

    /* renamed from: c */
    private void m55013c(int i) {
        if (i >= 0 && i < this.f35063c) {
            return;
        }
        throw new IndexOutOfBoundsException(m55012d(i));
    }

    /* renamed from: d */
    private String m55012d(int i) {
        return "Index:" + i + ", Size:" + this.f35063c;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4404a, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        ensureIsMutable();
        int i = this.f35063c;
        Object[] objArr = this.f35062b;
        if (i == objArr.length) {
            this.f35062b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f35062b;
        int i2 = this.f35063c;
        this.f35063c = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList
    /* renamed from: e */
    public C4434t mutableCopyWithCapacity(int i) {
        if (i >= this.f35063c) {
            return new C4434t(Arrays.copyOf(this.f35062b, i), this.f35063c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        m55013c(i);
        return this.f35062b[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i) {
        int i2;
        ensureIsMutable();
        m55013c(i);
        Object[] objArr = this.f35062b;
        Object obj = objArr[i];
        if (i < this.f35063c - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f35063c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        ensureIsMutable();
        m55013c(i);
        Object[] objArr = this.f35062b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f35063c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        int i2;
        ensureIsMutable();
        if (i >= 0 && i <= (i2 = this.f35063c)) {
            Object[] objArr = this.f35062b;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] m55015a = m55015a(((i2 * 3) / 2) + 1);
                System.arraycopy(this.f35062b, 0, m55015a, 0, i);
                System.arraycopy(this.f35062b, i, m55015a, i + 1, this.f35063c - i);
                this.f35062b = m55015a;
            }
            this.f35062b[i] = obj;
            this.f35063c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m55012d(i));
    }
}