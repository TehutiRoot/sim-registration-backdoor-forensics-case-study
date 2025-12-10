package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.j */
/* loaded from: classes4.dex */
public final class C8947j extends AbstractC8933a implements Internal.IntList, RandomAccess, InterfaceC17748Hn1 {

    /* renamed from: d */
    public static final C8947j f57473d;

    /* renamed from: b */
    public int[] f57474b;

    /* renamed from: c */
    public int f57475c;

    static {
        C8947j c8947j = new C8947j(new int[0], 0);
        f57473d = c8947j;
        c8947j.makeImmutable();
    }

    public C8947j() {
        this(new int[10], 0);
    }

    /* renamed from: d */
    public static C8947j m35282d() {
        return f57473d;
    }

    /* renamed from: e */
    private void m35281e(int i) {
        if (i >= 0 && i < this.f57475c) {
            return;
        }
        throw new IndexOutOfBoundsException(m35279g(i));
    }

    /* renamed from: g */
    private String m35279g(int i) {
        return "Index:" + i + ", Size:" + this.f57475c;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a */
    public void add(int i, Integer num) {
        m35283c(i, num.intValue());
    }

    @Override // com.google.protobuf.AbstractC8933a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.m35786a(collection);
        if (!(collection instanceof C8947j)) {
            return super.addAll(collection);
        }
        C8947j c8947j = (C8947j) collection;
        int i = c8947j.f57475c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f57475c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f57474b;
            if (i3 > iArr.length) {
                this.f57474b = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(c8947j.f57474b, 0, this.f57474b, this.f57475c, c8947j.f57475c);
            this.f57475c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.protobuf.Internal.IntList
    public void addInt(int i) {
        ensureIsMutable();
        int i2 = this.f57475c;
        int[] iArr = this.f57474b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f57474b = iArr2;
        }
        int[] iArr3 = this.f57474b;
        int i3 = this.f57475c;
        this.f57475c = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // com.google.protobuf.AbstractC8933a, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: b */
    public boolean add(Integer num) {
        addInt(num.intValue());
        return true;
    }

    /* renamed from: c */
    public final void m35283c(int i, int i2) {
        int i3;
        ensureIsMutable();
        if (i >= 0 && i <= (i3 = this.f57475c)) {
            int[] iArr = this.f57474b;
            if (i3 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
            } else {
                int[] iArr2 = new int[((i3 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.f57474b, i, iArr2, i + 1, this.f57475c - i);
                this.f57474b = iArr2;
            }
            this.f57474b[i] = i2;
            this.f57475c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m35279g(i));
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
        if (!(obj instanceof C8947j)) {
            return super.equals(obj);
        }
        C8947j c8947j = (C8947j) obj;
        if (this.f57475c != c8947j.f57475c) {
            return false;
        }
        int[] iArr = c8947j.f57474b;
        for (int i = 0; i < this.f57475c; i++) {
            if (this.f57474b[i] != iArr[i]) {
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

    @Override // com.google.protobuf.Internal.IntList
    public int getInt(int i) {
        m35281e(i);
        return this.f57474b[i];
    }

    @Override // com.google.protobuf.AbstractC8933a, java.util.AbstractList, java.util.List
    /* renamed from: h */
    public Integer remove(int i) {
        int i2;
        ensureIsMutable();
        m35281e(i);
        int[] iArr = this.f57474b;
        int i3 = iArr[i];
        if (i < this.f57475c - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.f57475c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // com.google.protobuf.AbstractC8933a, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f57475c; i2++) {
            i = (i * 31) + this.f57474b[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: i */
    public Integer set(int i, Integer num) {
        return Integer.valueOf(setInt(i, num.intValue()));
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f57474b[i] == intValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 >= i) {
            int[] iArr = this.f57474b;
            System.arraycopy(iArr, i2, iArr, i, this.f57475c - i2);
            this.f57475c -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.protobuf.Internal.IntList
    public int setInt(int i, int i2) {
        ensureIsMutable();
        m35281e(i);
        int[] iArr = this.f57474b;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f57475c;
    }

    public C8947j(int[] iArr, int i) {
        this.f57474b = iArr;
        this.f57475c = i;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Integer> mutableCopyWithCapacity2(int i) {
        if (i >= this.f57475c) {
            return new C8947j(Arrays.copyOf(this.f57474b, i), this.f57475c);
        }
        throw new IllegalArgumentException();
    }
}
