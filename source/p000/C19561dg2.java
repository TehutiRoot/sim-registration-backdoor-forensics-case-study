package p000;

import com.google.android.gms.internal.clearcut.zzci;
import com.google.android.gms.internal.clearcut.zzcn;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: dg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19561dg2 extends AbstractC18101Nc2 implements zzcn, RandomAccess {

    /* renamed from: d */
    public static final C19561dg2 f61252d;

    /* renamed from: b */
    public int[] f61253b;

    /* renamed from: c */
    public int f61254c;

    static {
        C19561dg2 c19561dg2 = new C19561dg2();
        f61252d = c19561dg2;
        c19561dg2.zzv();
    }

    public C19561dg2() {
        this(new int[10], 0);
    }

    /* renamed from: b */
    public static C19561dg2 m31799b() {
        return f61252d;
    }

    /* renamed from: a */
    public final void m31800a(int i) {
        m31796e(this.f61254c, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        m31796e(i, ((Integer) obj).intValue());
    }

    @Override // p000.AbstractC18101Nc2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzw();
        zzci.m48160a(collection);
        if (!(collection instanceof C19561dg2)) {
            return super.addAll(collection);
        }
        C19561dg2 c19561dg2 = (C19561dg2) collection;
        int i = c19561dg2.f61254c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f61254c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f61253b;
            if (i3 > iArr.length) {
                this.f61253b = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(c19561dg2.f61253b, 0, this.f61253b, this.f61254c, c19561dg2.f61254c);
            this.f61254c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void m31798c(int i) {
        if (i >= 0 && i < this.f61254c) {
            return;
        }
        throw new IndexOutOfBoundsException(m31797d(i));
    }

    /* renamed from: d */
    public final String m31797d(int i) {
        int i2 = this.f61254c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: e */
    public final void m31796e(int i, int i2) {
        int i3;
        zzw();
        if (i >= 0 && i <= (i3 = this.f61254c)) {
            int[] iArr = this.f61253b;
            if (i3 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
            } else {
                int[] iArr2 = new int[((i3 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.f61253b, i, iArr2, i + 1, this.f61254c - i);
                this.f61253b = iArr2;
            }
            this.f61253b[i] = i2;
            this.f61254c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m31797d(i));
    }

    @Override // p000.AbstractC18101Nc2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19561dg2)) {
            return super.equals(obj);
        }
        C19561dg2 c19561dg2 = (C19561dg2) obj;
        if (this.f61254c != c19561dg2.f61254c) {
            return false;
        }
        int[] iArr = c19561dg2.f61253b;
        for (int i = 0; i < this.f61254c; i++) {
            if (this.f61253b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(getInt(i));
    }

    public final int getInt(int i) {
        m31798c(i);
        return this.f61253b[i];
    }

    @Override // p000.AbstractC18101Nc2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f61254c; i2++) {
            i = (i * 31) + this.f61253b[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zzw();
        m31798c(i);
        int[] iArr = this.f61253b;
        int i2 = iArr[i];
        int i3 = this.f61254c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, i3 - i);
        }
        this.f61254c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zzw();
        if (i2 >= i) {
            int[] iArr = this.f61253b;
            System.arraycopy(iArr, i2, iArr, i, this.f61254c - i2);
            this.f61254c -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zzw();
        m31798c(i);
        int[] iArr = this.f61253b;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f61254c;
    }

    @Override // com.google.android.gms.internal.clearcut.zzcn
    public final /* synthetic */ zzcn zzi(int i) {
        if (i >= this.f61254c) {
            return new C19561dg2(Arrays.copyOf(this.f61253b, i), this.f61254c);
        }
        throw new IllegalArgumentException();
    }

    public C19561dg2(int[] iArr, int i) {
        this.f61253b = iArr;
        this.f61254c = i;
    }

    @Override // p000.AbstractC18101Nc2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zzw();
        for (int i = 0; i < this.f61254c; i++) {
            if (obj.equals(Integer.valueOf(this.f61253b[i]))) {
                int[] iArr = this.f61253b;
                System.arraycopy(iArr, i + 1, iArr, i, this.f61254c - i);
                this.f61254c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
