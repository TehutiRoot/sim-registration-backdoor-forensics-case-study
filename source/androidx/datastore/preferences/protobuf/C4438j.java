package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.j */
/* loaded from: classes2.dex */
public final class C4438j extends AbstractC4422a implements Internal.FloatList, RandomAccess, InterfaceC17812In1 {

    /* renamed from: d */
    public static final C4438j f34937d;

    /* renamed from: b */
    public float[] f34938b;

    /* renamed from: c */
    public int f34939c;

    static {
        C4438j c4438j = new C4438j(new float[0], 0);
        f34937d = c4438j;
        c4438j.makeImmutable();
    }

    public C4438j() {
        this(new float[10], 0);
    }

    /* renamed from: d */
    public static C4438j m55185d() {
        return f34937d;
    }

    /* renamed from: e */
    private void m55184e(int i) {
        if (i >= 0 && i < this.f34939c) {
            return;
        }
        throw new IndexOutOfBoundsException(m55182g(i));
    }

    /* renamed from: g */
    private String m55182g(int i) {
        return "Index:" + i + ", Size:" + this.f34939c;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a */
    public void add(int i, Float f) {
        m55186c(i, f.floatValue());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4422a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.m55730a(collection);
        if (!(collection instanceof C4438j)) {
            return super.addAll(collection);
        }
        C4438j c4438j = (C4438j) collection;
        int i = c4438j.f34939c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f34939c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f34938b;
            if (i3 > fArr.length) {
                this.f34938b = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(c4438j.f34938b, 0, this.f34938b, this.f34939c, c4438j.f34939c);
            this.f34939c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.FloatList
    public void addFloat(float f) {
        ensureIsMutable();
        int i = this.f34939c;
        float[] fArr = this.f34938b;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f34938b = fArr2;
        }
        float[] fArr3 = this.f34938b;
        int i2 = this.f34939c;
        this.f34939c = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4422a, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: b */
    public boolean add(Float f) {
        addFloat(f.floatValue());
        return true;
    }

    /* renamed from: c */
    public final void m55186c(int i, float f) {
        int i2;
        ensureIsMutable();
        if (i >= 0 && i <= (i2 = this.f34939c)) {
            float[] fArr = this.f34938b;
            if (i2 < fArr.length) {
                System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
            } else {
                float[] fArr2 = new float[((i2 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i);
                System.arraycopy(this.f34938b, i, fArr2, i + 1, this.f34939c - i);
                this.f34938b = fArr2;
            }
            this.f34938b[i] = f;
            this.f34939c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m55182g(i));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4422a, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4438j)) {
            return super.equals(obj);
        }
        C4438j c4438j = (C4438j) obj;
        if (this.f34939c != c4438j.f34939c) {
            return false;
        }
        float[] fArr = c4438j.f34938b;
        for (int i = 0; i < this.f34939c; i++) {
            if (Float.floatToIntBits(this.f34938b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f */
    public Float get(int i) {
        return Float.valueOf(getFloat(i));
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.FloatList
    public float getFloat(int i) {
        m55184e(i);
        return this.f34938b[i];
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: h */
    public Float remove(int i) {
        int i2;
        ensureIsMutable();
        m55184e(i);
        float[] fArr = this.f34938b;
        float f = fArr[i];
        if (i < this.f34939c - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f34939c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4422a, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f34939c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f34938b[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: i */
    public Float set(int i, Float f) {
        return Float.valueOf(setFloat(i, f.floatValue()));
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 >= i) {
            float[] fArr = this.f34938b;
            System.arraycopy(fArr, i2, fArr, i, this.f34939c - i2);
            this.f34939c -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.FloatList
    public float setFloat(int i, float f) {
        ensureIsMutable();
        m55184e(i);
        float[] fArr = this.f34938b;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f34939c;
    }

    public C4438j(float[] fArr, int i) {
        this.f34938b = fArr;
        this.f34939c = i;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList
    /* renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Float> mutableCopyWithCapacity2(int i) {
        if (i >= this.f34939c) {
            return new C4438j(Arrays.copyOf(this.f34938b, i), this.f34939c);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4422a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        ensureIsMutable();
        for (int i = 0; i < this.f34939c; i++) {
            if (obj.equals(Float.valueOf(this.f34938b[i]))) {
                float[] fArr = this.f34938b;
                System.arraycopy(fArr, i + 1, fArr, i, (this.f34939c - i) - 1);
                this.f34939c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
