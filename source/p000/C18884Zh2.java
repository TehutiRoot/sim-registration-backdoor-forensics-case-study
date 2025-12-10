package p000;

import com.google.android.gms.internal.clearcut.zzci;
import com.google.android.gms.internal.clearcut.zzcn;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: Zh2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18884Zh2 extends AbstractC18101Nc2 implements zzcn, RandomAccess {

    /* renamed from: d */
    public static final C18884Zh2 f8099d;

    /* renamed from: b */
    public long[] f8100b;

    /* renamed from: c */
    public int f8101c;

    static {
        C18884Zh2 c18884Zh2 = new C18884Zh2();
        f8099d = c18884Zh2;
        c18884Zh2.zzv();
    }

    public C18884Zh2() {
        this(new long[10], 0);
    }

    /* renamed from: a */
    public static C18884Zh2 m65153a() {
        return f8099d;
    }

    /* renamed from: b */
    private final void m65152b(int i) {
        if (i >= 0 && i < this.f8101c) {
            return;
        }
        throw new IndexOutOfBoundsException(m65151c(i));
    }

    /* renamed from: c */
    private final String m65151c(int i) {
        int i2 = this.f8101c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        m65150d(i, ((Long) obj).longValue());
    }

    @Override // p000.AbstractC18101Nc2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzw();
        zzci.m48160a(collection);
        if (!(collection instanceof C18884Zh2)) {
            return super.addAll(collection);
        }
        C18884Zh2 c18884Zh2 = (C18884Zh2) collection;
        int i = c18884Zh2.f8101c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f8101c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f8100b;
            if (i3 > jArr.length) {
                this.f8100b = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(c18884Zh2.f8100b, 0, this.f8100b, this.f8101c, c18884Zh2.f8101c);
            this.f8101c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: d */
    public final void m65150d(int i, long j) {
        int i2;
        zzw();
        if (i >= 0 && i <= (i2 = this.f8101c)) {
            long[] jArr = this.f8100b;
            if (i2 < jArr.length) {
                System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
            } else {
                long[] jArr2 = new long[((i2 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i);
                System.arraycopy(this.f8100b, i, jArr2, i + 1, this.f8101c - i);
                this.f8100b = jArr2;
            }
            this.f8100b[i] = j;
            this.f8101c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m65151c(i));
    }

    /* renamed from: e */
    public final void m65149e(long j) {
        m65150d(this.f8101c, j);
    }

    @Override // p000.AbstractC18101Nc2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18884Zh2)) {
            return super.equals(obj);
        }
        C18884Zh2 c18884Zh2 = (C18884Zh2) obj;
        if (this.f8101c != c18884Zh2.f8101c) {
            return false;
        }
        long[] jArr = c18884Zh2.f8100b;
        for (int i = 0; i < this.f8101c; i++) {
            if (this.f8100b[i] != jArr[i]) {
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
        m65152b(i);
        return this.f8100b[i];
    }

    @Override // p000.AbstractC18101Nc2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f8101c; i2++) {
            i = (i * 31) + zzci.zzl(this.f8100b[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zzw();
        m65152b(i);
        long[] jArr = this.f8100b;
        long j = jArr[i];
        int i2 = this.f8101c;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, i2 - i);
        }
        this.f8101c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zzw();
        if (i2 >= i) {
            long[] jArr = this.f8100b;
            System.arraycopy(jArr, i2, jArr, i, this.f8101c - i2);
            this.f8101c -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        zzw();
        m65152b(i);
        long[] jArr = this.f8100b;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8101c;
    }

    @Override // com.google.android.gms.internal.clearcut.zzcn
    public final /* synthetic */ zzcn zzi(int i) {
        if (i >= this.f8101c) {
            return new C18884Zh2(Arrays.copyOf(this.f8100b, i), this.f8101c);
        }
        throw new IllegalArgumentException();
    }

    public C18884Zh2(long[] jArr, int i) {
        this.f8100b = jArr;
        this.f8101c = i;
    }

    @Override // p000.AbstractC18101Nc2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zzw();
        for (int i = 0; i < this.f8101c; i++) {
            if (obj.equals(Long.valueOf(this.f8100b[i]))) {
                long[] jArr = this.f8100b;
                System.arraycopy(jArr, i + 1, jArr, i, this.f8101c - i);
                this.f8101c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
