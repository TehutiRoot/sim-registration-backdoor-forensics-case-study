package p000;

import com.google.android.gms.internal.clearcut.zzci;
import com.google.android.gms.internal.clearcut.zzcn;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: Wi2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18740Wi2 extends AbstractC17945Kd2 implements zzcn, RandomAccess {

    /* renamed from: d */
    public static final C18740Wi2 f7361d;

    /* renamed from: b */
    public long[] f7362b;

    /* renamed from: c */
    public int f7363c;

    static {
        C18740Wi2 c18740Wi2 = new C18740Wi2();
        f7361d = c18740Wi2;
        c18740Wi2.zzv();
    }

    public C18740Wi2() {
        this(new long[10], 0);
    }

    /* renamed from: a */
    public static C18740Wi2 m65675a() {
        return f7361d;
    }

    /* renamed from: b */
    private final void m65674b(int i) {
        if (i >= 0 && i < this.f7363c) {
            return;
        }
        throw new IndexOutOfBoundsException(m65673c(i));
    }

    /* renamed from: c */
    private final String m65673c(int i) {
        int i2 = this.f7363c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        m65672d(i, ((Long) obj).longValue());
    }

    @Override // p000.AbstractC17945Kd2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzw();
        zzci.m48157a(collection);
        if (!(collection instanceof C18740Wi2)) {
            return super.addAll(collection);
        }
        C18740Wi2 c18740Wi2 = (C18740Wi2) collection;
        int i = c18740Wi2.f7363c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f7363c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f7362b;
            if (i3 > jArr.length) {
                this.f7362b = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(c18740Wi2.f7362b, 0, this.f7362b, this.f7363c, c18740Wi2.f7363c);
            this.f7363c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: d */
    public final void m65672d(int i, long j) {
        int i2;
        zzw();
        if (i >= 0 && i <= (i2 = this.f7363c)) {
            long[] jArr = this.f7362b;
            if (i2 < jArr.length) {
                System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
            } else {
                long[] jArr2 = new long[((i2 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i);
                System.arraycopy(this.f7362b, i, jArr2, i + 1, this.f7363c - i);
                this.f7362b = jArr2;
            }
            this.f7362b[i] = j;
            this.f7363c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m65673c(i));
    }

    /* renamed from: e */
    public final void m65671e(long j) {
        m65672d(this.f7363c, j);
    }

    @Override // p000.AbstractC17945Kd2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18740Wi2)) {
            return super.equals(obj);
        }
        C18740Wi2 c18740Wi2 = (C18740Wi2) obj;
        if (this.f7363c != c18740Wi2.f7363c) {
            return false;
        }
        long[] jArr = c18740Wi2.f7362b;
        for (int i = 0; i < this.f7363c; i++) {
            if (this.f7362b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(getLong(i));
    }

    public final long getLong(int i) {
        m65674b(i);
        return this.f7362b[i];
    }

    @Override // p000.AbstractC17945Kd2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f7363c; i2++) {
            i = (i * 31) + zzci.zzl(this.f7362b[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zzw();
        m65674b(i);
        long[] jArr = this.f7362b;
        long j = jArr[i];
        int i2 = this.f7363c;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, i2 - i);
        }
        this.f7363c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zzw();
        if (i2 >= i) {
            long[] jArr = this.f7362b;
            System.arraycopy(jArr, i2, jArr, i, this.f7363c - i2);
            this.f7363c -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        zzw();
        m65674b(i);
        long[] jArr = this.f7362b;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7363c;
    }

    @Override // com.google.android.gms.internal.clearcut.zzcn
    public final /* synthetic */ zzcn zzi(int i) {
        if (i >= this.f7363c) {
            return new C18740Wi2(Arrays.copyOf(this.f7362b, i), this.f7363c);
        }
        throw new IllegalArgumentException();
    }

    public C18740Wi2(long[] jArr, int i) {
        this.f7362b = jArr;
        this.f7363c = i;
    }

    @Override // p000.AbstractC17945Kd2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zzw();
        for (int i = 0; i < this.f7363c; i++) {
            if (obj.equals(Long.valueOf(this.f7362b[i]))) {
                long[] jArr = this.f7362b;
                System.arraycopy(jArr, i + 1, jArr, i, this.f7363c - i);
                this.f7363c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}