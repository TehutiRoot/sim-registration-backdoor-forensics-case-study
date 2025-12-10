package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.i */
/* loaded from: classes4.dex */
public final class C8946i extends AbstractC8933a implements Internal.FloatList, RandomAccess, InterfaceC17748Hn1 {

    /* renamed from: d */
    public static final C8946i f57470d;

    /* renamed from: b */
    public float[] f57471b;

    /* renamed from: c */
    public int f57472c;

    static {
        C8946i c8946i = new C8946i(new float[0], 0);
        f57470d = c8946i;
        c8946i.makeImmutable();
    }

    public C8946i() {
        this(new float[10], 0);
    }

    /* renamed from: d */
    public static C8946i m35291d() {
        return f57470d;
    }

    /* renamed from: e */
    private void m35290e(int i) {
        if (i >= 0 && i < this.f57472c) {
            return;
        }
        throw new IndexOutOfBoundsException(m35288g(i));
    }

    /* renamed from: g */
    private String m35288g(int i) {
        return "Index:" + i + ", Size:" + this.f57472c;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a */
    public void add(int i, Float f) {
        m35292c(i, f.floatValue());
    }

    @Override // com.google.protobuf.AbstractC8933a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.m35786a(collection);
        if (!(collection instanceof C8946i)) {
            return super.addAll(collection);
        }
        C8946i c8946i = (C8946i) collection;
        int i = c8946i.f57472c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f57472c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f57471b;
            if (i3 > fArr.length) {
                this.f57471b = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(c8946i.f57471b, 0, this.f57471b, this.f57472c, c8946i.f57472c);
            this.f57472c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.protobuf.Internal.FloatList
    public void addFloat(float f) {
        ensureIsMutable();
        int i = this.f57472c;
        float[] fArr = this.f57471b;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f57471b = fArr2;
        }
        float[] fArr3 = this.f57471b;
        int i2 = this.f57472c;
        this.f57472c = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // com.google.protobuf.AbstractC8933a, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: b */
    public boolean add(Float f) {
        addFloat(f.floatValue());
        return true;
    }

    /* renamed from: c */
    public final void m35292c(int i, float f) {
        int i2;
        ensureIsMutable();
        if (i >= 0 && i <= (i2 = this.f57472c)) {
            float[] fArr = this.f57471b;
            if (i2 < fArr.length) {
                System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
            } else {
                float[] fArr2 = new float[((i2 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i);
                System.arraycopy(this.f57471b, i, fArr2, i + 1, this.f57472c - i);
                this.f57471b = fArr2;
            }
            this.f57471b[i] = f;
            this.f57472c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m35288g(i));
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
        if (!(obj instanceof C8946i)) {
            return super.equals(obj);
        }
        C8946i c8946i = (C8946i) obj;
        if (this.f57472c != c8946i.f57472c) {
            return false;
        }
        float[] fArr = c8946i.f57471b;
        for (int i = 0; i < this.f57472c; i++) {
            if (Float.floatToIntBits(this.f57471b[i]) != Float.floatToIntBits(fArr[i])) {
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

    @Override // com.google.protobuf.Internal.FloatList
    public float getFloat(int i) {
        m35290e(i);
        return this.f57471b[i];
    }

    @Override // com.google.protobuf.AbstractC8933a, java.util.AbstractList, java.util.List
    /* renamed from: h */
    public Float remove(int i) {
        int i2;
        ensureIsMutable();
        m35290e(i);
        float[] fArr = this.f57471b;
        float f = fArr[i];
        if (i < this.f57472c - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f57472c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // com.google.protobuf.AbstractC8933a, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f57472c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f57471b[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: i */
    public Float set(int i, Float f) {
        return Float.valueOf(setFloat(i, f.floatValue()));
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f57471b[i] == floatValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 >= i) {
            float[] fArr = this.f57471b;
            System.arraycopy(fArr, i2, fArr, i, this.f57472c - i2);
            this.f57472c -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.protobuf.Internal.FloatList
    public float setFloat(int i, float f) {
        ensureIsMutable();
        m35290e(i);
        float[] fArr = this.f57471b;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f57472c;
    }

    public C8946i(float[] fArr, int i) {
        this.f57471b = fArr;
        this.f57472c = i;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Float> mutableCopyWithCapacity2(int i) {
        if (i >= this.f57472c) {
            return new C8946i(Arrays.copyOf(this.f57471b, i), this.f57472c);
        }
        throw new IllegalArgumentException();
    }
}
