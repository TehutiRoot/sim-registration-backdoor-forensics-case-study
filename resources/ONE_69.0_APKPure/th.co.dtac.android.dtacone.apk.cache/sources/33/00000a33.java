package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzej;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzem;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: Kl2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17969Kl2 extends AbstractC20479ih2 implements RandomAccess, zzej, InterfaceC22409tq2 {

    /* renamed from: d */
    public static final C17969Kl2 f3393d = new C17969Kl2(new int[0], 0, false);

    /* renamed from: b */
    public int[] f3394b;

    /* renamed from: c */
    public int f3395c;

    public C17969Kl2(int[] iArr, int i, boolean z) {
        super(z);
        this.f3394b = iArr;
        this.f3395c = i;
    }

    /* renamed from: b */
    public static C17969Kl2 m67672b() {
        return f3393d;
    }

    /* renamed from: d */
    private final String m67670d(int i) {
        int i2 = this.f3395c;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: e */
    private final void m67669e(int i) {
        if (i >= 0 && i < this.f3395c) {
            return;
        }
        throw new IndexOutOfBoundsException(m67670d(i));
    }

    /* renamed from: a */
    public final int m67673a(int i) {
        m67669e(i);
        return this.f3394b[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        zza();
        if (i >= 0 && i <= (i2 = this.f3395c)) {
            int[] iArr = this.f3394b;
            if (i2 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
            } else {
                int[] iArr2 = new int[((i2 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.f3394b, i, iArr2, i + 1, this.f3395c - i);
                this.f3394b = iArr2;
            }
            this.f3394b[i] = intValue;
            this.f3395c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m67670d(i));
    }

    @Override // p000.AbstractC20479ih2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        Charset charset = zzem.f46981a;
        collection.getClass();
        if (!(collection instanceof C17969Kl2)) {
            return super.addAll(collection);
        }
        C17969Kl2 c17969Kl2 = (C17969Kl2) collection;
        int i = c17969Kl2.f3395c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f3395c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f3394b;
            if (i3 > iArr.length) {
                this.f3394b = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(c17969Kl2.f3394b, 0, this.f3394b, this.f3395c, c17969Kl2.f3395c);
            this.f3395c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void m67671c(int i) {
        zza();
        int i2 = this.f3395c;
        int[] iArr = this.f3394b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f3394b = iArr2;
        }
        int[] iArr3 = this.f3394b;
        int i3 = this.f3395c;
        this.f3395c = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC20479ih2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17969Kl2)) {
            return super.equals(obj);
        }
        C17969Kl2 c17969Kl2 = (C17969Kl2) obj;
        if (this.f3395c != c17969Kl2.f3395c) {
            return false;
        }
        int[] iArr = c17969Kl2.f3394b;
        for (int i = 0; i < this.f3395c; i++) {
            if (this.f3394b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m67669e(i);
        return Integer.valueOf(this.f3394b[i]);
    }

    @Override // p000.AbstractC20479ih2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f3395c; i2++) {
            i = (i * 31) + this.f3394b[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f3395c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f3394b[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC20479ih2, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        zza();
        m67669e(i);
        int[] iArr = this.f3394b;
        int i3 = iArr[i];
        if (i < this.f3395c - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.f3395c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zza();
        if (i2 >= i) {
            int[] iArr = this.f3394b;
            System.arraycopy(iArr, i2, iArr, i, this.f3395c - i2);
            this.f3395c -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zza();
        m67669e(i);
        int[] iArr = this.f3394b;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3395c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel
    public final /* bridge */ /* synthetic */ zzel zzd(int i) {
        if (i >= this.f3395c) {
            return new C17969Kl2(Arrays.copyOf(this.f3394b, i), this.f3395c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.AbstractC20479ih2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m67671c(((Integer) obj).intValue());
        return true;
    }
}