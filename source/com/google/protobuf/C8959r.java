package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.r */
/* loaded from: classes4.dex */
public final class C8959r extends AbstractC8933a implements RandomAccess {

    /* renamed from: d */
    public static final C8959r f57507d;

    /* renamed from: b */
    public Object[] f57508b;

    /* renamed from: c */
    public int f57509c;

    static {
        C8959r c8959r = new C8959r(new Object[0], 0);
        f57507d = c8959r;
        c8959r.makeImmutable();
    }

    public C8959r(Object[] objArr, int i) {
        this.f57508b = objArr;
        this.f57509c = i;
    }

    /* renamed from: a */
    public static Object[] m35164a(int i) {
        return new Object[i];
    }

    /* renamed from: b */
    public static C8959r m35163b() {
        return f57507d;
    }

    /* renamed from: c */
    private void m35162c(int i) {
        if (i >= 0 && i < this.f57509c) {
            return;
        }
        throw new IndexOutOfBoundsException(m35161d(i));
    }

    /* renamed from: d */
    private String m35161d(int i) {
        return "Index:" + i + ", Size:" + this.f57509c;
    }

    @Override // com.google.protobuf.AbstractC8933a, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        ensureIsMutable();
        int i = this.f57509c;
        Object[] objArr = this.f57508b;
        if (i == objArr.length) {
            this.f57508b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f57508b;
        int i2 = this.f57509c;
        this.f57509c = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* renamed from: e */
    public C8959r mutableCopyWithCapacity(int i) {
        if (i >= this.f57509c) {
            return new C8959r(Arrays.copyOf(this.f57508b, i), this.f57509c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        m35162c(i);
        return this.f57508b[i];
    }

    @Override // com.google.protobuf.AbstractC8933a, java.util.AbstractList, java.util.List
    public Object remove(int i) {
        int i2;
        ensureIsMutable();
        m35162c(i);
        Object[] objArr = this.f57508b;
        Object obj = objArr[i];
        if (i < this.f57509c - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f57509c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        ensureIsMutable();
        m35162c(i);
        Object[] objArr = this.f57508b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f57509c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        int i2;
        ensureIsMutable();
        if (i >= 0 && i <= (i2 = this.f57509c)) {
            Object[] objArr = this.f57508b;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] m35164a = m35164a(((i2 * 3) / 2) + 1);
                System.arraycopy(this.f57508b, 0, m35164a, 0, i);
                System.arraycopy(this.f57508b, i, m35164a, i + 1, this.f57509c - i);
                this.f57508b = m35164a;
            }
            this.f57508b[i] = obj;
            this.f57509c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m35161d(i));
    }
}
