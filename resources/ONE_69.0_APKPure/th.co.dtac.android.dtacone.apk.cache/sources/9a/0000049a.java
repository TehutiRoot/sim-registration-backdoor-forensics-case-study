package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: Eq2 */
/* loaded from: classes3.dex */
public final class Eq2 extends AbstractC20479ih2 implements RandomAccess {

    /* renamed from: d */
    public static final Eq2 f1463d = new Eq2(new Object[0], 0, false);

    /* renamed from: b */
    public Object[] f1464b;

    /* renamed from: c */
    public int f1465c;

    public Eq2(Object[] objArr, int i, boolean z) {
        super(z);
        this.f1464b = objArr;
        this.f1465c = i;
    }

    /* renamed from: a */
    public static Eq2 m68581a() {
        return f1463d;
    }

    /* renamed from: c */
    private final void m68579c(int i) {
        if (i >= 0 && i < this.f1465c) {
            return;
        }
        throw new IndexOutOfBoundsException(m68580b(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        zza();
        if (i >= 0 && i <= (i2 = this.f1465c)) {
            Object[] objArr = this.f1464b;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.f1464b, i, objArr2, i + 1, this.f1465c - i);
                this.f1464b = objArr2;
            }
            this.f1464b[i] = obj;
            this.f1465c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m68580b(i));
    }

    /* renamed from: b */
    public final String m68580b(int i) {
        int i2 = this.f1465c;
        return "Index:" + i + ", Size:" + i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m68579c(i);
        return this.f1464b[i];
    }

    @Override // p000.AbstractC20479ih2, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        zza();
        m68579c(i);
        Object[] objArr = this.f1464b;
        Object obj = objArr[i];
        if (i < this.f1465c - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f1465c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        zza();
        m68579c(i);
        Object[] objArr = this.f1464b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1465c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel
    public final /* bridge */ /* synthetic */ zzel zzd(int i) {
        if (i >= this.f1465c) {
            return new Eq2(Arrays.copyOf(this.f1464b, i), this.f1465c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.AbstractC20479ih2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zza();
        int i = this.f1465c;
        Object[] objArr = this.f1464b;
        if (i == objArr.length) {
            this.f1464b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f1464b;
        int i2 = this.f1465c;
        this.f1465c = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}