package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzei;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzem;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: Gj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17674Gj2 extends AbstractC20937lg2 implements RandomAccess, zzei, InterfaceC22856wp2 {

    /* renamed from: d */
    public static final C17674Gj2 f1990d = new C17674Gj2(new float[0], 0, false);

    /* renamed from: b */
    public float[] f1991b;

    /* renamed from: c */
    public int f1992c;

    public C17674Gj2(float[] fArr, int i, boolean z) {
        super(z);
        this.f1991b = fArr;
        this.f1992c = i;
    }

    /* renamed from: a */
    public static C17674Gj2 m68201a() {
        return f1990d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        zza();
        if (i >= 0 && i <= (i2 = this.f1992c)) {
            float[] fArr = this.f1991b;
            if (i2 < fArr.length) {
                System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
            } else {
                float[] fArr2 = new float[((i2 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i);
                System.arraycopy(this.f1991b, i, fArr2, i + 1, this.f1992c - i);
                this.f1991b = fArr2;
            }
            this.f1991b[i] = floatValue;
            this.f1992c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m68200b(i));
    }

    @Override // p000.AbstractC20937lg2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        Charset charset = zzem.f46969a;
        collection.getClass();
        if (!(collection instanceof C17674Gj2)) {
            return super.addAll(collection);
        }
        C17674Gj2 c17674Gj2 = (C17674Gj2) collection;
        int i = c17674Gj2.f1992c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f1992c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f1991b;
            if (i3 > fArr.length) {
                this.f1991b = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(c17674Gj2.f1991b, 0, this.f1991b, this.f1992c, c17674Gj2.f1992c);
            this.f1992c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final String m68200b(int i) {
        int i2 = this.f1992c;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: c */
    public final void m68199c(int i) {
        if (i >= 0 && i < this.f1992c) {
            return;
        }
        throw new IndexOutOfBoundsException(m68200b(i));
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
        if (!(obj instanceof C17674Gj2)) {
            return super.equals(obj);
        }
        C17674Gj2 c17674Gj2 = (C17674Gj2) obj;
        if (this.f1992c != c17674Gj2.f1992c) {
            return false;
        }
        float[] fArr = c17674Gj2.f1991b;
        for (int i = 0; i < this.f1992c; i++) {
            if (Float.floatToIntBits(this.f1991b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m68199c(i);
        return Float.valueOf(this.f1991b[i]);
    }

    @Override // p000.AbstractC20937lg2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f1992c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f1991b[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f1992c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f1991b[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC20937lg2, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        zza();
        m68199c(i);
        float[] fArr = this.f1991b;
        float f = fArr[i];
        if (i < this.f1992c - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f1992c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zza();
        if (i2 >= i) {
            float[] fArr = this.f1991b;
            System.arraycopy(fArr, i2, fArr, i, this.f1992c - i2);
            this.f1992c -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        zza();
        m68199c(i);
        float[] fArr = this.f1991b;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1992c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel
    /* renamed from: zzf */
    public final zzei zzd(int i) {
        if (i >= this.f1992c) {
            return new C17674Gj2(Arrays.copyOf(this.f1991b, i), this.f1992c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzei
    public final void zzg(float f) {
        zza();
        int i = this.f1992c;
        float[] fArr = this.f1991b;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f1991b = fArr2;
        }
        float[] fArr3 = this.f1991b;
        int i2 = this.f1992c;
        this.f1992c = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // p000.AbstractC20937lg2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Float) obj).floatValue());
        return true;
    }
}
