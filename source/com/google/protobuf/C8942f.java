package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.f */
/* loaded from: classes4.dex */
public final class C8942f extends AbstractC8933a implements Internal.DoubleList, RandomAccess, InterfaceC17748Hn1 {

    /* renamed from: d */
    public static final C8942f f57466d;

    /* renamed from: b */
    public double[] f57467b;

    /* renamed from: c */
    public int f57468c;

    static {
        C8942f c8942f = new C8942f(new double[0], 0);
        f57466d = c8942f;
        c8942f.makeImmutable();
    }

    public C8942f() {
        this(new double[10], 0);
    }

    /* renamed from: d */
    public static C8942f m35310d() {
        return f57466d;
    }

    /* renamed from: e */
    private void m35309e(int i) {
        if (i >= 0 && i < this.f57468c) {
            return;
        }
        throw new IndexOutOfBoundsException(m35307g(i));
    }

    /* renamed from: g */
    private String m35307g(int i) {
        return "Index:" + i + ", Size:" + this.f57468c;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a */
    public void add(int i, Double d) {
        m35311c(i, d.doubleValue());
    }

    @Override // com.google.protobuf.AbstractC8933a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.m35786a(collection);
        if (!(collection instanceof C8942f)) {
            return super.addAll(collection);
        }
        C8942f c8942f = (C8942f) collection;
        int i = c8942f.f57468c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f57468c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f57467b;
            if (i3 > dArr.length) {
                this.f57467b = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(c8942f.f57467b, 0, this.f57467b, this.f57468c, c8942f.f57468c);
            this.f57468c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.protobuf.Internal.DoubleList
    public void addDouble(double d) {
        ensureIsMutable();
        int i = this.f57468c;
        double[] dArr = this.f57467b;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f57467b = dArr2;
        }
        double[] dArr3 = this.f57467b;
        int i2 = this.f57468c;
        this.f57468c = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // com.google.protobuf.AbstractC8933a, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: b */
    public boolean add(Double d) {
        addDouble(d.doubleValue());
        return true;
    }

    /* renamed from: c */
    public final void m35311c(int i, double d) {
        int i2;
        ensureIsMutable();
        if (i >= 0 && i <= (i2 = this.f57468c)) {
            double[] dArr = this.f57467b;
            if (i2 < dArr.length) {
                System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
            } else {
                double[] dArr2 = new double[((i2 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, i);
                System.arraycopy(this.f57467b, i, dArr2, i + 1, this.f57468c - i);
                this.f57467b = dArr2;
            }
            this.f57467b[i] = d;
            this.f57468c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m35307g(i));
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
        if (!(obj instanceof C8942f)) {
            return super.equals(obj);
        }
        C8942f c8942f = (C8942f) obj;
        if (this.f57468c != c8942f.f57468c) {
            return false;
        }
        double[] dArr = c8942f.f57467b;
        for (int i = 0; i < this.f57468c; i++) {
            if (Double.doubleToLongBits(this.f57467b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f */
    public Double get(int i) {
        return Double.valueOf(getDouble(i));
    }

    @Override // com.google.protobuf.Internal.DoubleList
    public double getDouble(int i) {
        m35309e(i);
        return this.f57467b[i];
    }

    @Override // com.google.protobuf.AbstractC8933a, java.util.AbstractList, java.util.List
    /* renamed from: h */
    public Double remove(int i) {
        int i2;
        ensureIsMutable();
        m35309e(i);
        double[] dArr = this.f57467b;
        double d = dArr[i];
        if (i < this.f57468c - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f57468c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // com.google.protobuf.AbstractC8933a, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f57468c; i2++) {
            i = (i * 31) + Internal.hashLong(Double.doubleToLongBits(this.f57467b[i2]));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: i */
    public Double set(int i, Double d) {
        return Double.valueOf(setDouble(i, d.doubleValue()));
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f57467b[i] == doubleValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 >= i) {
            double[] dArr = this.f57467b;
            System.arraycopy(dArr, i2, dArr, i, this.f57468c - i2);
            this.f57468c -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.protobuf.Internal.DoubleList
    public double setDouble(int i, double d) {
        ensureIsMutable();
        m35309e(i);
        double[] dArr = this.f57467b;
        double d2 = dArr[i];
        dArr[i] = d;
        return d2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f57468c;
    }

    public C8942f(double[] dArr, int i) {
        this.f57467b = dArr;
        this.f57468c = i;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Double> mutableCopyWithCapacity2(int i) {
        if (i >= this.f57468c) {
            return new C8942f(Arrays.copyOf(this.f57467b, i), this.f57468c);
        }
        throw new IllegalArgumentException();
    }
}
