package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzej;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzem;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: Nk2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18125Nk2 extends AbstractC20937lg2 implements RandomAccess, zzej, InterfaceC22856wp2 {

    /* renamed from: d */
    public static final C18125Nk2 f4183d = new C18125Nk2(new int[0], 0, false);

    /* renamed from: b */
    public int[] f4184b;

    /* renamed from: c */
    public int f4185c;

    public C18125Nk2(int[] iArr, int i, boolean z) {
        super(z);
        this.f4184b = iArr;
        this.f4185c = i;
    }

    /* renamed from: b */
    public static C18125Nk2 m67178b() {
        return f4183d;
    }

    /* renamed from: d */
    private final String m67176d(int i) {
        int i2 = this.f4185c;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: e */
    private final void m67175e(int i) {
        if (i >= 0 && i < this.f4185c) {
            return;
        }
        throw new IndexOutOfBoundsException(m67176d(i));
    }

    /* renamed from: a */
    public final int m67179a(int i) {
        m67175e(i);
        return this.f4184b[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        zza();
        if (i >= 0 && i <= (i2 = this.f4185c)) {
            int[] iArr = this.f4184b;
            if (i2 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
            } else {
                int[] iArr2 = new int[((i2 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.f4184b, i, iArr2, i + 1, this.f4185c - i);
                this.f4184b = iArr2;
            }
            this.f4184b[i] = intValue;
            this.f4185c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m67176d(i));
    }

    @Override // p000.AbstractC20937lg2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        Charset charset = zzem.f46969a;
        collection.getClass();
        if (!(collection instanceof C18125Nk2)) {
            return super.addAll(collection);
        }
        C18125Nk2 c18125Nk2 = (C18125Nk2) collection;
        int i = c18125Nk2.f4185c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f4185c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f4184b;
            if (i3 > iArr.length) {
                this.f4184b = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(c18125Nk2.f4184b, 0, this.f4184b, this.f4185c, c18125Nk2.f4185c);
            this.f4185c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void m67177c(int i) {
        zza();
        int i2 = this.f4185c;
        int[] iArr = this.f4184b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f4184b = iArr2;
        }
        int[] iArr3 = this.f4184b;
        int i3 = this.f4185c;
        this.f4185c = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC20937lg2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18125Nk2)) {
            return super.equals(obj);
        }
        C18125Nk2 c18125Nk2 = (C18125Nk2) obj;
        if (this.f4185c != c18125Nk2.f4185c) {
            return false;
        }
        int[] iArr = c18125Nk2.f4184b;
        for (int i = 0; i < this.f4185c; i++) {
            if (this.f4184b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m67175e(i);
        return Integer.valueOf(this.f4184b[i]);
    }

    @Override // p000.AbstractC20937lg2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f4185c; i2++) {
            i = (i * 31) + this.f4184b[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f4185c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f4184b[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC20937lg2, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        zza();
        m67175e(i);
        int[] iArr = this.f4184b;
        int i3 = iArr[i];
        if (i < this.f4185c - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.f4185c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zza();
        if (i2 >= i) {
            int[] iArr = this.f4184b;
            System.arraycopy(iArr, i2, iArr, i, this.f4185c - i2);
            this.f4185c -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zza();
        m67175e(i);
        int[] iArr = this.f4184b;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4185c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel
    public final /* bridge */ /* synthetic */ zzel zzd(int i) {
        if (i >= this.f4185c) {
            return new C18125Nk2(Arrays.copyOf(this.f4184b, i), this.f4185c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.AbstractC20937lg2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m67177c(((Integer) obj).intValue());
        return true;
    }
}
