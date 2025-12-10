package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.m */
/* loaded from: classes2.dex */
public final class C4444m extends AbstractC4422a implements Internal.LongList, RandomAccess, InterfaceC17812In1 {

    /* renamed from: d */
    public static final C4444m f34946d;

    /* renamed from: b */
    public long[] f34947b;

    /* renamed from: c */
    public int f34948c;

    static {
        C4444m c4444m = new C4444m(new long[0], 0);
        f34946d = c4444m;
        c4444m.makeImmutable();
    }

    public C4444m() {
        this(new long[10], 0);
    }

    /* renamed from: d */
    public static C4444m m55159d() {
        return f34946d;
    }

    /* renamed from: e */
    private void m55158e(int i) {
        if (i >= 0 && i < this.f34948c) {
            return;
        }
        throw new IndexOutOfBoundsException(m55156g(i));
    }

    /* renamed from: g */
    private String m55156g(int i) {
        return "Index:" + i + ", Size:" + this.f34948c;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a */
    public void add(int i, Long l) {
        m55160c(i, l.longValue());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4422a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.m55730a(collection);
        if (!(collection instanceof C4444m)) {
            return super.addAll(collection);
        }
        C4444m c4444m = (C4444m) collection;
        int i = c4444m.f34948c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f34948c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f34947b;
            if (i3 > jArr.length) {
                this.f34947b = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(c4444m.f34947b, 0, this.f34947b, this.f34948c, c4444m.f34948c);
            this.f34948c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.LongList
    public void addLong(long j) {
        ensureIsMutable();
        int i = this.f34948c;
        long[] jArr = this.f34947b;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f34947b = jArr2;
        }
        long[] jArr3 = this.f34947b;
        int i2 = this.f34948c;
        this.f34948c = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4422a, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: b */
    public boolean add(Long l) {
        addLong(l.longValue());
        return true;
    }

    /* renamed from: c */
    public final void m55160c(int i, long j) {
        int i2;
        ensureIsMutable();
        if (i >= 0 && i <= (i2 = this.f34948c)) {
            long[] jArr = this.f34947b;
            if (i2 < jArr.length) {
                System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
            } else {
                long[] jArr2 = new long[((i2 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i);
                System.arraycopy(this.f34947b, i, jArr2, i + 1, this.f34948c - i);
                this.f34947b = jArr2;
            }
            this.f34947b[i] = j;
            this.f34948c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m55156g(i));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4422a, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4444m)) {
            return super.equals(obj);
        }
        C4444m c4444m = (C4444m) obj;
        if (this.f34948c != c4444m.f34948c) {
            return false;
        }
        long[] jArr = c4444m.f34947b;
        for (int i = 0; i < this.f34948c; i++) {
            if (this.f34947b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f */
    public Long get(int i) {
        return Long.valueOf(getLong(i));
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.LongList
    public long getLong(int i) {
        m55158e(i);
        return this.f34947b[i];
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: h */
    public Long remove(int i) {
        int i2;
        ensureIsMutable();
        m55158e(i);
        long[] jArr = this.f34947b;
        long j = jArr[i];
        if (i < this.f34948c - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f34948c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4422a, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f34948c; i2++) {
            i = (i * 31) + Internal.hashLong(this.f34947b[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: i */
    public Long set(int i, Long l) {
        return Long.valueOf(setLong(i, l.longValue()));
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 >= i) {
            long[] jArr = this.f34947b;
            System.arraycopy(jArr, i2, jArr, i, this.f34948c - i2);
            this.f34948c -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.LongList
    public long setLong(int i, long j) {
        ensureIsMutable();
        m55158e(i);
        long[] jArr = this.f34947b;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f34948c;
    }

    public C4444m(long[] jArr, int i) {
        this.f34947b = jArr;
        this.f34948c = i;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList
    /* renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Long> mutableCopyWithCapacity2(int i) {
        if (i >= this.f34948c) {
            return new C4444m(Arrays.copyOf(this.f34947b, i), this.f34948c);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4422a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        ensureIsMutable();
        for (int i = 0; i < this.f34948c; i++) {
            if (obj.equals(Long.valueOf(this.f34947b[i]))) {
                long[] jArr = this.f34947b;
                System.arraycopy(jArr, i + 1, jArr, i, (this.f34948c - i) - 1);
                this.f34948c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
