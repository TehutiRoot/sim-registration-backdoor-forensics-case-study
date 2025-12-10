package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.c */
/* loaded from: classes4.dex */
public final class C8937c extends AbstractC8933a implements Internal.BooleanList, RandomAccess, InterfaceC17748Hn1 {

    /* renamed from: d */
    public static final C8937c f57456d;

    /* renamed from: b */
    public boolean[] f57457b;

    /* renamed from: c */
    public int f57458c;

    static {
        C8937c c8937c = new C8937c(new boolean[0], 0);
        f57456d = c8937c;
        c8937c.makeImmutable();
    }

    public C8937c() {
        this(new boolean[10], 0);
    }

    /* renamed from: d */
    public static C8937c m35377d() {
        return f57456d;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a */
    public void add(int i, Boolean bool) {
        m35378c(i, bool.booleanValue());
    }

    @Override // com.google.protobuf.AbstractC8933a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.m35786a(collection);
        if (!(collection instanceof C8937c)) {
            return super.addAll(collection);
        }
        C8937c c8937c = (C8937c) collection;
        int i = c8937c.f57458c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f57458c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f57457b;
            if (i3 > zArr.length) {
                this.f57457b = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(c8937c.f57457b, 0, this.f57457b, this.f57458c, c8937c.f57458c);
            this.f57458c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.protobuf.Internal.BooleanList
    public void addBoolean(boolean z) {
        ensureIsMutable();
        int i = this.f57458c;
        boolean[] zArr = this.f57457b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f57457b = zArr2;
        }
        boolean[] zArr3 = this.f57457b;
        int i2 = this.f57458c;
        this.f57458c = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // com.google.protobuf.AbstractC8933a, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: b */
    public boolean add(Boolean bool) {
        addBoolean(bool.booleanValue());
        return true;
    }

    /* renamed from: c */
    public final void m35378c(int i, boolean z) {
        int i2;
        ensureIsMutable();
        if (i >= 0 && i <= (i2 = this.f57458c)) {
            boolean[] zArr = this.f57457b;
            if (i2 < zArr.length) {
                System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
            } else {
                boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i);
                System.arraycopy(this.f57457b, i, zArr2, i + 1, this.f57458c - i);
                this.f57457b = zArr2;
            }
            this.f57457b[i] = z;
            this.f57458c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m35374g(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void m35376e(int i) {
        if (i >= 0 && i < this.f57458c) {
            return;
        }
        throw new IndexOutOfBoundsException(m35374g(i));
    }

    @Override // com.google.protobuf.AbstractC8933a, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8937c)) {
            return super.equals(obj);
        }
        C8937c c8937c = (C8937c) obj;
        if (this.f57458c != c8937c.f57458c) {
            return false;
        }
        boolean[] zArr = c8937c.f57457b;
        for (int i = 0; i < this.f57458c; i++) {
            if (this.f57457b[i] != zArr[i]) {
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
    public final String m35374g(int i) {
        return "Index:" + i + ", Size:" + this.f57458c;
    }

    @Override // com.google.protobuf.Internal.BooleanList
    public boolean getBoolean(int i) {
        m35376e(i);
        return this.f57457b[i];
    }

    @Override // com.google.protobuf.AbstractC8933a, java.util.AbstractList, java.util.List
    /* renamed from: h */
    public Boolean remove(int i) {
        int i2;
        ensureIsMutable();
        m35376e(i);
        boolean[] zArr = this.f57457b;
        boolean z = zArr[i];
        if (i < this.f57458c - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f57458c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // com.google.protobuf.AbstractC8933a, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f57458c; i2++) {
            i = (i * 31) + Internal.hashBoolean(this.f57457b[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: i */
    public Boolean set(int i, Boolean bool) {
        return Boolean.valueOf(setBoolean(i, bool.booleanValue()));
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f57457b[i] == booleanValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 >= i) {
            boolean[] zArr = this.f57457b;
            System.arraycopy(zArr, i2, zArr, i, this.f57458c - i2);
            this.f57458c -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.protobuf.Internal.BooleanList
    public boolean setBoolean(int i, boolean z) {
        ensureIsMutable();
        m35376e(i);
        boolean[] zArr = this.f57457b;
        boolean z2 = zArr[i];
        zArr[i] = z;
        return z2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f57458c;
    }

    public C8937c(boolean[] zArr, int i) {
        this.f57457b = zArr;
        this.f57458c = i;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Boolean> mutableCopyWithCapacity2(int i) {
        if (i >= this.f57458c) {
            return new C8937c(Arrays.copyOf(this.f57457b, i), this.f57458c);
        }
        throw new IllegalArgumentException();
    }
}
