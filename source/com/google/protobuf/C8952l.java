package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.l */
/* loaded from: classes4.dex */
public final class C8952l extends AbstractC8933a implements Internal.LongList, RandomAccess, InterfaceC17748Hn1 {

    /* renamed from: d */
    public static final C8952l f57479d;

    /* renamed from: b */
    public long[] f57480b;

    /* renamed from: c */
    public int f57481c;

    static {
        C8952l c8952l = new C8952l(new long[0], 0);
        f57479d = c8952l;
        c8952l.makeImmutable();
    }

    public C8952l() {
        this(new long[10], 0);
    }

    /* renamed from: d */
    public static C8952l m35265d() {
        return f57479d;
    }

    /* renamed from: e */
    private void m35264e(int i) {
        if (i >= 0 && i < this.f57481c) {
            return;
        }
        throw new IndexOutOfBoundsException(m35262g(i));
    }

    /* renamed from: g */
    private String m35262g(int i) {
        return "Index:" + i + ", Size:" + this.f57481c;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a */
    public void add(int i, Long l) {
        m35266c(i, l.longValue());
    }

    @Override // com.google.protobuf.AbstractC8933a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.m35786a(collection);
        if (!(collection instanceof C8952l)) {
            return super.addAll(collection);
        }
        C8952l c8952l = (C8952l) collection;
        int i = c8952l.f57481c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f57481c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f57480b;
            if (i3 > jArr.length) {
                this.f57480b = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(c8952l.f57480b, 0, this.f57480b, this.f57481c, c8952l.f57481c);
            this.f57481c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.protobuf.Internal.LongList
    public void addLong(long j) {
        ensureIsMutable();
        int i = this.f57481c;
        long[] jArr = this.f57480b;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f57480b = jArr2;
        }
        long[] jArr3 = this.f57480b;
        int i2 = this.f57481c;
        this.f57481c = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // com.google.protobuf.AbstractC8933a, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: b */
    public boolean add(Long l) {
        addLong(l.longValue());
        return true;
    }

    /* renamed from: c */
    public final void m35266c(int i, long j) {
        int i2;
        ensureIsMutable();
        if (i >= 0 && i <= (i2 = this.f57481c)) {
            long[] jArr = this.f57480b;
            if (i2 < jArr.length) {
                System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
            } else {
                long[] jArr2 = new long[((i2 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i);
                System.arraycopy(this.f57480b, i, jArr2, i + 1, this.f57481c - i);
                this.f57480b = jArr2;
            }
            this.f57480b[i] = j;
            this.f57481c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m35262g(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractC8933a, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8952l)) {
            return super.equals(obj);
        }
        C8952l c8952l = (C8952l) obj;
        if (this.f57481c != c8952l.f57481c) {
            return false;
        }
        long[] jArr = c8952l.f57480b;
        for (int i = 0; i < this.f57481c; i++) {
            if (this.f57480b[i] != jArr[i]) {
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

    @Override // com.google.protobuf.Internal.LongList
    public long getLong(int i) {
        m35264e(i);
        return this.f57480b[i];
    }

    @Override // com.google.protobuf.AbstractC8933a, java.util.AbstractList, java.util.List
    /* renamed from: h */
    public Long remove(int i) {
        int i2;
        ensureIsMutable();
        m35264e(i);
        long[] jArr = this.f57480b;
        long j = jArr[i];
        if (i < this.f57481c - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f57481c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // com.google.protobuf.AbstractC8933a, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f57481c; i2++) {
            i = (i * 31) + Internal.hashLong(this.f57480b[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: i */
    public Long set(int i, Long l) {
        return Long.valueOf(setLong(i, l.longValue()));
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f57480b[i] == longValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 >= i) {
            long[] jArr = this.f57480b;
            System.arraycopy(jArr, i2, jArr, i, this.f57481c - i2);
            this.f57481c -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.protobuf.Internal.LongList
    public long setLong(int i, long j) {
        ensureIsMutable();
        m35264e(i);
        long[] jArr = this.f57480b;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f57481c;
    }

    public C8952l(long[] jArr, int i) {
        this.f57480b = jArr;
        this.f57481c = i;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Long> mutableCopyWithCapacity2(int i) {
        if (i >= this.f57481c) {
            return new C8952l(Arrays.copyOf(this.f57480b, i), this.f57481c);
        }
        throw new IllegalArgumentException();
    }
}
