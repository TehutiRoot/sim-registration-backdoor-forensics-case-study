package p000;

import com.google.android.gms.internal.measurement.zzkk;
import com.google.android.gms.internal.measurement.zzkm;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: YD2 */
/* loaded from: classes3.dex */
public final class YD2 extends Qx2 implements RandomAccess, zzkk, InterfaceC21042mF2 {

    /* renamed from: d */
    public static final YD2 f7712d;

    /* renamed from: b */
    public long[] f7713b;

    /* renamed from: c */
    public int f7714c;

    static {
        YD2 yd2 = new YD2(new long[0], 0);
        f7712d = yd2;
        yd2.zzb();
    }

    public YD2(long[] jArr, int i) {
        this.f7713b = jArr;
        this.f7714c = i;
    }

    /* renamed from: a */
    public static YD2 m65383a() {
        return f7712d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        zzbP();
        if (i >= 0 && i <= (i2 = this.f7714c)) {
            long[] jArr = this.f7713b;
            if (i2 < jArr.length) {
                System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
            } else {
                long[] jArr2 = new long[((i2 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i);
                System.arraycopy(this.f7713b, i, jArr2, i + 1, this.f7714c - i);
                this.f7713b = jArr2;
            }
            this.f7713b[i] = longValue;
            this.f7714c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m65381c(i));
    }

    @Override // p000.Qx2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzbP();
        zzkm.m47152b(collection);
        if (!(collection instanceof YD2)) {
            return super.addAll(collection);
        }
        YD2 yd2 = (YD2) collection;
        int i = yd2.f7714c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f7714c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f7713b;
            if (i3 > jArr.length) {
                this.f7713b = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(yd2.f7713b, 0, this.f7713b, this.f7714c, yd2.f7714c);
            this.f7714c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final void m65382b(long j) {
        zzbP();
        int i = this.f7714c;
        long[] jArr = this.f7713b;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f7713b = jArr2;
        }
        long[] jArr3 = this.f7713b;
        int i2 = this.f7714c;
        this.f7714c = i2 + 1;
        jArr3[i2] = j;
    }

    /* renamed from: c */
    public final String m65381c(int i) {
        int i2 = this.f7714c;
        return "Index:" + i + ", Size:" + i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void m65380d(int i) {
        if (i >= 0 && i < this.f7714c) {
            return;
        }
        throw new IndexOutOfBoundsException(m65381c(i));
    }

    @Override // p000.Qx2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YD2)) {
            return super.equals(obj);
        }
        YD2 yd2 = (YD2) obj;
        if (this.f7714c != yd2.f7714c) {
            return false;
        }
        long[] jArr = yd2.f7713b;
        for (int i = 0; i < this.f7714c; i++) {
            if (this.f7713b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m65380d(i);
        return Long.valueOf(this.f7713b[i]);
    }

    @Override // p000.Qx2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f7714c; i2++) {
            i = (i * 31) + zzkm.zzc(this.f7713b[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f7714c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f7713b[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.Qx2, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        zzbP();
        m65380d(i);
        long[] jArr = this.f7713b;
        long j = jArr[i];
        if (i < this.f7714c - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f7714c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zzbP();
        if (i2 >= i) {
            long[] jArr = this.f7713b;
            System.arraycopy(jArr, i2, jArr, i, this.f7714c - i2);
            this.f7714c -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        zzbP();
        m65380d(i);
        long[] jArr = this.f7713b;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7714c;
    }

    @Override // com.google.android.gms.internal.measurement.zzkk
    public final long zza(int i) {
        m65380d(i);
        return this.f7713b[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzkl
    /* renamed from: zze */
    public final zzkk zzd(int i) {
        if (i >= this.f7714c) {
            return new YD2(Arrays.copyOf(this.f7713b, i), this.f7714c);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.Qx2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m65382b(((Long) obj).longValue());
        return true;
    }
}
