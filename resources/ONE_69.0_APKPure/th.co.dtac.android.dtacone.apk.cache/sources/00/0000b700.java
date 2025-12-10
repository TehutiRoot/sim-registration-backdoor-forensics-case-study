package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.r */
/* loaded from: classes4.dex */
public final class C8948r extends AbstractC8922a implements RandomAccess {

    /* renamed from: d */
    public static final C8948r f57519d;

    /* renamed from: b */
    public Object[] f57520b;

    /* renamed from: c */
    public int f57521c;

    static {
        C8948r c8948r = new C8948r(new Object[0], 0);
        f57519d = c8948r;
        c8948r.makeImmutable();
    }

    public C8948r(Object[] objArr, int i) {
        this.f57520b = objArr;
        this.f57521c = i;
    }

    /* renamed from: a */
    public static Object[] m35156a(int i) {
        return new Object[i];
    }

    /* renamed from: b */
    public static C8948r m35155b() {
        return f57519d;
    }

    /* renamed from: c */
    private void m35154c(int i) {
        if (i >= 0 && i < this.f57521c) {
            return;
        }
        throw new IndexOutOfBoundsException(m35153d(i));
    }

    /* renamed from: d */
    private String m35153d(int i) {
        return "Index:" + i + ", Size:" + this.f57521c;
    }

    @Override // com.google.protobuf.AbstractC8922a, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        ensureIsMutable();
        int i = this.f57521c;
        Object[] objArr = this.f57520b;
        if (i == objArr.length) {
            this.f57520b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f57520b;
        int i2 = this.f57521c;
        this.f57521c = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* renamed from: e */
    public C8948r mutableCopyWithCapacity(int i) {
        if (i >= this.f57521c) {
            return new C8948r(Arrays.copyOf(this.f57520b, i), this.f57521c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        m35154c(i);
        return this.f57520b[i];
    }

    @Override // com.google.protobuf.AbstractC8922a, java.util.AbstractList, java.util.List
    public Object remove(int i) {
        int i2;
        ensureIsMutable();
        m35154c(i);
        Object[] objArr = this.f57520b;
        Object obj = objArr[i];
        if (i < this.f57521c - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f57521c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        ensureIsMutable();
        m35154c(i);
        Object[] objArr = this.f57520b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f57521c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        int i2;
        ensureIsMutable();
        if (i >= 0 && i <= (i2 = this.f57521c)) {
            Object[] objArr = this.f57520b;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] m35156a = m35156a(((i2 * 3) / 2) + 1);
                System.arraycopy(this.f57520b, 0, m35156a, 0, i);
                System.arraycopy(this.f57520b, i, m35156a, i + 1, this.f57521c - i);
                this.f57520b = m35156a;
            }
            this.f57520b[i] = obj;
            this.f57521c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m35153d(i));
    }
}