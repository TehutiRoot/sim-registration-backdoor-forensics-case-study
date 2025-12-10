package p000;

import com.google.android.gms.internal.measurement.zzkl;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: pG2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21622pG2 extends Ny2 implements RandomAccess {

    /* renamed from: d */
    public static final C21622pG2 f76759d;

    /* renamed from: b */
    public Object[] f76760b;

    /* renamed from: c */
    public int f76761c;

    static {
        C21622pG2 c21622pG2 = new C21622pG2(new Object[0], 0);
        f76759d = c21622pG2;
        c21622pG2.zzb();
    }

    public C21622pG2(Object[] objArr, int i) {
        this.f76760b = objArr;
        this.f76761c = i;
    }

    /* renamed from: a */
    public static C21622pG2 m23877a() {
        return f76759d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        zzbP();
        if (i >= 0 && i <= (i2 = this.f76761c)) {
            Object[] objArr = this.f76760b;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.f76760b, i, objArr2, i + 1, this.f76761c - i);
                this.f76760b = objArr2;
            }
            this.f76760b[i] = obj;
            this.f76761c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m23876b(i));
    }

    /* renamed from: b */
    public final String m23876b(int i) {
        int i2 = this.f76761c;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: c */
    public final void m23875c(int i) {
        if (i >= 0 && i < this.f76761c) {
            return;
        }
        throw new IndexOutOfBoundsException(m23876b(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m23875c(i);
        return this.f76760b[i];
    }

    @Override // p000.Ny2, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        zzbP();
        m23875c(i);
        Object[] objArr = this.f76760b;
        Object obj = objArr[i];
        if (i < this.f76761c - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f76761c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        zzbP();
        m23875c(i);
        Object[] objArr = this.f76760b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f76761c;
    }

    @Override // com.google.android.gms.internal.measurement.zzkl
    public final /* bridge */ /* synthetic */ zzkl zzd(int i) {
        if (i >= this.f76761c) {
            return new C21622pG2(Arrays.copyOf(this.f76760b, i), this.f76761c);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.Ny2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zzbP();
        int i = this.f76761c;
        Object[] objArr = this.f76760b;
        if (i == objArr.length) {
            this.f76760b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f76760b;
        int i2 = this.f76761c;
        this.f76761c = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}