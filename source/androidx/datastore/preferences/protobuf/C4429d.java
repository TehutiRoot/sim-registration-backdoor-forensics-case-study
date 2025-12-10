package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.d */
/* loaded from: classes2.dex */
public final class C4429d extends AbstractC4422a implements Internal.BooleanList, RandomAccess, InterfaceC17812In1 {

    /* renamed from: d */
    public static final C4429d f34923d;

    /* renamed from: b */
    public boolean[] f34924b;

    /* renamed from: c */
    public int f34925c;

    static {
        C4429d c4429d = new C4429d(new boolean[0], 0);
        f34923d = c4429d;
        c4429d.makeImmutable();
    }

    public C4429d() {
        this(new boolean[10], 0);
    }

    /* renamed from: d */
    public static C4429d m55269d() {
        return f34923d;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a */
    public void add(int i, Boolean bool) {
        m55270c(i, bool.booleanValue());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4422a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.m55730a(collection);
        if (!(collection instanceof C4429d)) {
            return super.addAll(collection);
        }
        C4429d c4429d = (C4429d) collection;
        int i = c4429d.f34925c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f34925c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f34924b;
            if (i3 > zArr.length) {
                this.f34924b = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(c4429d.f34924b, 0, this.f34924b, this.f34925c, c4429d.f34925c);
            this.f34925c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.BooleanList
    public void addBoolean(boolean z) {
        ensureIsMutable();
        int i = this.f34925c;
        boolean[] zArr = this.f34924b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f34924b = zArr2;
        }
        boolean[] zArr3 = this.f34924b;
        int i2 = this.f34925c;
        this.f34925c = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4422a, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: b */
    public boolean add(Boolean bool) {
        addBoolean(bool.booleanValue());
        return true;
    }

    /* renamed from: c */
    public final void m55270c(int i, boolean z) {
        int i2;
        ensureIsMutable();
        if (i >= 0 && i <= (i2 = this.f34925c)) {
            boolean[] zArr = this.f34924b;
            if (i2 < zArr.length) {
                System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
            } else {
                boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i);
                System.arraycopy(this.f34924b, i, zArr2, i + 1, this.f34925c - i);
                this.f34924b = zArr2;
            }
            this.f34924b[i] = z;
            this.f34925c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m55266g(i));
    }

    /* renamed from: e */
    public final void m55268e(int i) {
        if (i >= 0 && i < this.f34925c) {
            return;
        }
        throw new IndexOutOfBoundsException(m55266g(i));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4422a, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4429d)) {
            return super.equals(obj);
        }
        C4429d c4429d = (C4429d) obj;
        if (this.f34925c != c4429d.f34925c) {
            return false;
        }
        boolean[] zArr = c4429d.f34924b;
        for (int i = 0; i < this.f34925c; i++) {
            if (this.f34924b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f */
    public Boolean get(int i) {
        return Boolean.valueOf(getBoolean(i));
    }

    /* renamed from: g */
    public final String m55266g(int i) {
        return "Index:" + i + ", Size:" + this.f34925c;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.BooleanList
    public boolean getBoolean(int i) {
        m55268e(i);
        return this.f34924b[i];
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: h */
    public Boolean remove(int i) {
        int i2;
        ensureIsMutable();
        m55268e(i);
        boolean[] zArr = this.f34924b;
        boolean z = zArr[i];
        if (i < this.f34925c - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f34925c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4422a, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f34925c; i2++) {
            i = (i * 31) + Internal.hashBoolean(this.f34924b[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: i */
    public Boolean set(int i, Boolean bool) {
        return Boolean.valueOf(setBoolean(i, bool.booleanValue()));
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 >= i) {
            boolean[] zArr = this.f34924b;
            System.arraycopy(zArr, i2, zArr, i, this.f34925c - i2);
            this.f34925c -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.BooleanList
    public boolean setBoolean(int i, boolean z) {
        ensureIsMutable();
        m55268e(i);
        boolean[] zArr = this.f34924b;
        boolean z2 = zArr[i];
        zArr[i] = z;
        return z2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f34925c;
    }

    public C4429d(boolean[] zArr, int i) {
        this.f34924b = zArr;
        this.f34925c = i;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList
    /* renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Boolean> mutableCopyWithCapacity2(int i) {
        if (i >= this.f34925c) {
            return new C4429d(Arrays.copyOf(this.f34924b, i), this.f34925c);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4422a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        ensureIsMutable();
        for (int i = 0; i < this.f34925c; i++) {
            if (obj.equals(Boolean.valueOf(this.f34924b[i]))) {
                boolean[] zArr = this.f34924b;
                System.arraycopy(zArr, i + 1, zArr, i, (this.f34925c - i) - 1);
                this.f34925c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
