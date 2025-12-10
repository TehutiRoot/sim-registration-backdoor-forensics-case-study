package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.k */
/* loaded from: classes2.dex */
public final class C4439k extends AbstractC4422a implements Internal.IntList, RandomAccess, InterfaceC17812In1 {

    /* renamed from: d */
    public static final C4439k f34940d;

    /* renamed from: b */
    public int[] f34941b;

    /* renamed from: c */
    public int f34942c;

    static {
        C4439k c4439k = new C4439k(new int[0], 0);
        f34940d = c4439k;
        c4439k.makeImmutable();
    }

    public C4439k() {
        this(new int[10], 0);
    }

    /* renamed from: d */
    public static C4439k m55176d() {
        return f34940d;
    }

    /* renamed from: e */
    private void m55175e(int i) {
        if (i >= 0 && i < this.f34942c) {
            return;
        }
        throw new IndexOutOfBoundsException(m55173g(i));
    }

    /* renamed from: g */
    private String m55173g(int i) {
        return "Index:" + i + ", Size:" + this.f34942c;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a */
    public void add(int i, Integer num) {
        m55177c(i, num.intValue());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4422a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.m55730a(collection);
        if (!(collection instanceof C4439k)) {
            return super.addAll(collection);
        }
        C4439k c4439k = (C4439k) collection;
        int i = c4439k.f34942c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f34942c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f34941b;
            if (i3 > iArr.length) {
                this.f34941b = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(c4439k.f34941b, 0, this.f34941b, this.f34942c, c4439k.f34942c);
            this.f34942c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.IntList
    public void addInt(int i) {
        ensureIsMutable();
        int i2 = this.f34942c;
        int[] iArr = this.f34941b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f34941b = iArr2;
        }
        int[] iArr3 = this.f34941b;
        int i3 = this.f34942c;
        this.f34942c = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4422a, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: b */
    public boolean add(Integer num) {
        addInt(num.intValue());
        return true;
    }

    /* renamed from: c */
    public final void m55177c(int i, int i2) {
        int i3;
        ensureIsMutable();
        if (i >= 0 && i <= (i3 = this.f34942c)) {
            int[] iArr = this.f34941b;
            if (i3 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
            } else {
                int[] iArr2 = new int[((i3 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.f34941b, i, iArr2, i + 1, this.f34942c - i);
                this.f34941b = iArr2;
            }
            this.f34941b[i] = i2;
            this.f34942c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m55173g(i));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4422a, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4439k)) {
            return super.equals(obj);
        }
        C4439k c4439k = (C4439k) obj;
        if (this.f34942c != c4439k.f34942c) {
            return false;
        }
        int[] iArr = c4439k.f34941b;
        for (int i = 0; i < this.f34942c; i++) {
            if (this.f34941b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f */
    public Integer get(int i) {
        return Integer.valueOf(getInt(i));
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.IntList
    public int getInt(int i) {
        m55175e(i);
        return this.f34941b[i];
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: h */
    public Integer remove(int i) {
        int i2;
        ensureIsMutable();
        m55175e(i);
        int[] iArr = this.f34941b;
        int i3 = iArr[i];
        if (i < this.f34942c - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.f34942c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4422a, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f34942c; i2++) {
            i = (i * 31) + this.f34941b[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: i */
    public Integer set(int i, Integer num) {
        return Integer.valueOf(setInt(i, num.intValue()));
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 >= i) {
            int[] iArr = this.f34941b;
            System.arraycopy(iArr, i2, iArr, i, this.f34942c - i2);
            this.f34942c -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.IntList
    public int setInt(int i, int i2) {
        ensureIsMutable();
        m55175e(i);
        int[] iArr = this.f34941b;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f34942c;
    }

    public C4439k(int[] iArr, int i) {
        this.f34941b = iArr;
        this.f34942c = i;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList
    /* renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Integer> mutableCopyWithCapacity2(int i) {
        if (i >= this.f34942c) {
            return new C4439k(Arrays.copyOf(this.f34941b, i), this.f34942c);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4422a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        ensureIsMutable();
        for (int i = 0; i < this.f34942c; i++) {
            if (obj.equals(Integer.valueOf(this.f34941b[i]))) {
                int[] iArr = this.f34941b;
                System.arraycopy(iArr, i + 1, iArr, i, (this.f34942c - i) - 1);
                this.f34942c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
