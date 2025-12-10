package p000;

import com.google.android.gms.internal.vision.zzjl;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: bE2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19147bE2 extends AbstractC21667pu2 implements RandomAccess {

    /* renamed from: d */
    public static final C19147bE2 f38976d;

    /* renamed from: b */
    public Object[] f38977b;

    /* renamed from: c */
    public int f38978c;

    static {
        C19147bE2 c19147bE2 = new C19147bE2(new Object[0], 0);
        f38976d = c19147bE2;
        c19147bE2.zzb();
    }

    public C19147bE2(Object[] objArr, int i) {
        this.f38977b = objArr;
        this.f38978c = i;
    }

    /* renamed from: c */
    public static C19147bE2 m52035c() {
        return f38976d;
    }

    /* renamed from: a */
    public final void m52037a(int i) {
        if (i >= 0 && i < this.f38978c) {
            return;
        }
        throw new IndexOutOfBoundsException(m52036b(i));
    }

    @Override // p000.AbstractC21667pu2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zzc();
        int i = this.f38978c;
        Object[] objArr = this.f38977b;
        if (i == objArr.length) {
            this.f38977b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f38977b;
        int i2 = this.f38978c;
        this.f38978c = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* renamed from: b */
    public final String m52036b(int i) {
        int i2 = this.f38978c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m52037a(i);
        return this.f38977b[i];
    }

    @Override // p000.AbstractC21667pu2, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        zzc();
        m52037a(i);
        Object[] objArr = this.f38977b;
        Object obj = objArr[i];
        if (i < this.f38978c - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f38978c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        zzc();
        m52037a(i);
        Object[] objArr = this.f38977b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f38978c;
    }

    @Override // com.google.android.gms.internal.vision.zzjl
    public final /* synthetic */ zzjl zza(int i) {
        if (i >= this.f38978c) {
            return new C19147bE2(Arrays.copyOf(this.f38977b, i), this.f38978c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        zzc();
        if (i >= 0 && i <= (i2 = this.f38978c)) {
            Object[] objArr = this.f38977b;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.f38977b, i, objArr2, i + 1, this.f38978c - i);
                this.f38977b = objArr2;
            }
            this.f38977b[i] = obj;
            this.f38978c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m52036b(i));
    }
}
