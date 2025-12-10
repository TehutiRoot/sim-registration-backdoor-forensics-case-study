package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: Hp2 */
/* loaded from: classes3.dex */
public final class Hp2 extends AbstractC20937lg2 implements RandomAccess {

    /* renamed from: d */
    public static final Hp2 f2318d = new Hp2(new Object[0], 0, false);

    /* renamed from: b */
    public Object[] f2319b;

    /* renamed from: c */
    public int f2320c;

    public Hp2(Object[] objArr, int i, boolean z) {
        super(z);
        this.f2319b = objArr;
        this.f2320c = i;
    }

    /* renamed from: a */
    public static Hp2 m68038a() {
        return f2318d;
    }

    /* renamed from: c */
    private final void m68036c(int i) {
        if (i >= 0 && i < this.f2320c) {
            return;
        }
        throw new IndexOutOfBoundsException(m68037b(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        zza();
        if (i >= 0 && i <= (i2 = this.f2320c)) {
            Object[] objArr = this.f2319b;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.f2319b, i, objArr2, i + 1, this.f2320c - i);
                this.f2319b = objArr2;
            }
            this.f2319b[i] = obj;
            this.f2320c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m68037b(i));
    }

    /* renamed from: b */
    public final String m68037b(int i) {
        int i2 = this.f2320c;
        return "Index:" + i + ", Size:" + i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m68036c(i);
        return this.f2319b[i];
    }

    @Override // p000.AbstractC20937lg2, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        zza();
        m68036c(i);
        Object[] objArr = this.f2319b;
        Object obj = objArr[i];
        if (i < this.f2320c - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f2320c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        zza();
        m68036c(i);
        Object[] objArr = this.f2319b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2320c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel
    public final /* bridge */ /* synthetic */ zzel zzd(int i) {
        if (i >= this.f2320c) {
            return new Hp2(Arrays.copyOf(this.f2319b, i), this.f2320c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.AbstractC20937lg2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zza();
        int i = this.f2320c;
        Object[] objArr = this.f2319b;
        if (i == objArr.length) {
            this.f2319b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f2319b;
        int i2 = this.f2320c;
        this.f2320c = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
