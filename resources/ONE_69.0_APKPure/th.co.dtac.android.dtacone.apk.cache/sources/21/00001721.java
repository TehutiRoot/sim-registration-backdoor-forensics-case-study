package p000;

import com.google.android.gms.internal.vision.zzjl;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: YE2 */
/* loaded from: classes3.dex */
public final class YE2 extends AbstractC21213mv2 implements RandomAccess {

    /* renamed from: d */
    public static final YE2 f7809d;

    /* renamed from: b */
    public Object[] f7810b;

    /* renamed from: c */
    public int f7811c;

    static {
        YE2 ye2 = new YE2(new Object[0], 0);
        f7809d = ye2;
        ye2.zzb();
    }

    public YE2(Object[] objArr, int i) {
        this.f7810b = objArr;
        this.f7811c = i;
    }

    /* renamed from: c */
    public static YE2 m65483c() {
        return f7809d;
    }

    /* renamed from: a */
    public final void m65485a(int i) {
        if (i >= 0 && i < this.f7811c) {
            return;
        }
        throw new IndexOutOfBoundsException(m65484b(i));
    }

    @Override // p000.AbstractC21213mv2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zzc();
        int i = this.f7811c;
        Object[] objArr = this.f7810b;
        if (i == objArr.length) {
            this.f7810b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f7810b;
        int i2 = this.f7811c;
        this.f7811c = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* renamed from: b */
    public final String m65484b(int i) {
        int i2 = this.f7811c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m65485a(i);
        return this.f7810b[i];
    }

    @Override // p000.AbstractC21213mv2, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        zzc();
        m65485a(i);
        Object[] objArr = this.f7810b;
        Object obj = objArr[i];
        if (i < this.f7811c - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f7811c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        zzc();
        m65485a(i);
        Object[] objArr = this.f7810b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7811c;
    }

    @Override // com.google.android.gms.internal.vision.zzjl
    public final /* synthetic */ zzjl zza(int i) {
        if (i >= this.f7811c) {
            return new YE2(Arrays.copyOf(this.f7810b, i), this.f7811c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        zzc();
        if (i >= 0 && i <= (i2 = this.f7811c)) {
            Object[] objArr = this.f7810b;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.f7810b, i, objArr2, i + 1, this.f7811c - i);
                this.f7810b = objArr2;
            }
            this.f7810b[i] = obj;
            this.f7811c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m65484b(i));
    }
}