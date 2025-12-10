package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.g */
/* loaded from: classes2.dex */
public final class C4434g extends AbstractC4422a implements Internal.DoubleList, RandomAccess, InterfaceC17812In1 {

    /* renamed from: d */
    public static final C4434g f34933d;

    /* renamed from: b */
    public double[] f34934b;

    /* renamed from: c */
    public int f34935c;

    static {
        C4434g c4434g = new C4434g(new double[0], 0);
        f34933d = c4434g;
        c4434g.makeImmutable();
    }

    public C4434g() {
        this(new double[10], 0);
    }

    /* renamed from: d */
    public static C4434g m55204d() {
        return f34933d;
    }

    /* renamed from: e */
    private void m55203e(int i) {
        if (i >= 0 && i < this.f34935c) {
            return;
        }
        throw new IndexOutOfBoundsException(m55201g(i));
    }

    /* renamed from: g */
    private String m55201g(int i) {
        return "Index:" + i + ", Size:" + this.f34935c;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a */
    public void add(int i, Double d) {
        m55205c(i, d.doubleValue());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4422a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.m55730a(collection);
        if (!(collection instanceof C4434g)) {
            return super.addAll(collection);
        }
        C4434g c4434g = (C4434g) collection;
        int i = c4434g.f34935c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f34935c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f34934b;
            if (i3 > dArr.length) {
                this.f34934b = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(c4434g.f34934b, 0, this.f34934b, this.f34935c, c4434g.f34935c);
            this.f34935c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.DoubleList
    public void addDouble(double d) {
        ensureIsMutable();
        int i = this.f34935c;
        double[] dArr = this.f34934b;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f34934b = dArr2;
        }
        double[] dArr3 = this.f34934b;
        int i2 = this.f34935c;
        this.f34935c = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4422a, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: b */
    public boolean add(Double d) {
        addDouble(d.doubleValue());
        return true;
    }

    /* renamed from: c */
    public final void m55205c(int i, double d) {
        int i2;
        ensureIsMutable();
        if (i >= 0 && i <= (i2 = this.f34935c)) {
            double[] dArr = this.f34934b;
            if (i2 < dArr.length) {
                System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
            } else {
                double[] dArr2 = new double[((i2 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, i);
                System.arraycopy(this.f34934b, i, dArr2, i + 1, this.f34935c - i);
                this.f34934b = dArr2;
            }
            this.f34934b[i] = d;
            this.f34935c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m55201g(i));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4422a, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4434g)) {
            return super.equals(obj);
        }
        C4434g c4434g = (C4434g) obj;
        if (this.f34935c != c4434g.f34935c) {
            return false;
        }
        double[] dArr = c4434g.f34934b;
        for (int i = 0; i < this.f34935c; i++) {
            if (Double.doubleToLongBits(this.f34934b[i]) != Double.doubleToLongBits(dArr[i])) {
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

    @Override // androidx.datastore.preferences.protobuf.Internal.DoubleList
    public double getDouble(int i) {
        m55203e(i);
        return this.f34934b[i];
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: h */
    public Double remove(int i) {
        int i2;
        ensureIsMutable();
        m55203e(i);
        double[] dArr = this.f34934b;
        double d = dArr[i];
        if (i < this.f34935c - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f34935c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4422a, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f34935c; i2++) {
            i = (i * 31) + Internal.hashLong(Double.doubleToLongBits(this.f34934b[i2]));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: i */
    public Double set(int i, Double d) {
        return Double.valueOf(setDouble(i, d.doubleValue()));
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 >= i) {
            double[] dArr = this.f34934b;
            System.arraycopy(dArr, i2, dArr, i, this.f34935c - i2);
            this.f34935c -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.DoubleList
    public double setDouble(int i, double d) {
        ensureIsMutable();
        m55203e(i);
        double[] dArr = this.f34934b;
        double d2 = dArr[i];
        dArr[i] = d;
        return d2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f34935c;
    }

    public C4434g(double[] dArr, int i) {
        this.f34934b = dArr;
        this.f34935c = i;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList
    /* renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Double> mutableCopyWithCapacity2(int i) {
        if (i >= this.f34935c) {
            return new C4434g(Arrays.copyOf(this.f34934b, i), this.f34935c);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4422a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        ensureIsMutable();
        for (int i = 0; i < this.f34935c; i++) {
            if (obj.equals(Double.valueOf(this.f34934b[i]))) {
                double[] dArr = this.f34934b;
                System.arraycopy(dArr, i + 1, dArr, i, (this.f34935c - i) - 1);
                this.f34935c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
