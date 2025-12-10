package p000;

import com.google.android.gms.internal.measurement.zzkl;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: sF2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22074sF2 extends Qx2 implements RandomAccess {

    /* renamed from: d */
    public static final C22074sF2 f79739d;

    /* renamed from: b */
    public Object[] f79740b;

    /* renamed from: c */
    public int f79741c;

    static {
        C22074sF2 c22074sF2 = new C22074sF2(new Object[0], 0);
        f79739d = c22074sF2;
        c22074sF2.zzb();
    }

    public C22074sF2(Object[] objArr, int i) {
        this.f79740b = objArr;
        this.f79741c = i;
    }

    /* renamed from: a */
    public static C22074sF2 m22654a() {
        return f79739d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        zzbP();
        if (i >= 0 && i <= (i2 = this.f79741c)) {
            Object[] objArr = this.f79740b;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.f79740b, i, objArr2, i + 1, this.f79741c - i);
                this.f79740b = objArr2;
            }
            this.f79740b[i] = obj;
            this.f79741c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m22653b(i));
    }

    /* renamed from: b */
    public final String m22653b(int i) {
        int i2 = this.f79741c;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: c */
    public final void m22652c(int i) {
        if (i >= 0 && i < this.f79741c) {
            return;
        }
        throw new IndexOutOfBoundsException(m22653b(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m22652c(i);
        return this.f79740b[i];
    }

    @Override // p000.Qx2, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        zzbP();
        m22652c(i);
        Object[] objArr = this.f79740b;
        Object obj = objArr[i];
        if (i < this.f79741c - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f79741c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        zzbP();
        m22652c(i);
        Object[] objArr = this.f79740b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f79741c;
    }

    @Override // com.google.android.gms.internal.measurement.zzkl
    public final /* bridge */ /* synthetic */ zzkl zzd(int i) {
        if (i >= this.f79741c) {
            return new C22074sF2(Arrays.copyOf(this.f79740b, i), this.f79741c);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.Qx2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zzbP();
        int i = this.f79741c;
        Object[] objArr = this.f79740b;
        if (i == objArr.length) {
            this.f79740b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f79740b;
        int i2 = this.f79741c;
        this.f79741c = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
