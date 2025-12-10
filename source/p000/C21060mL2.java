package p000;

import com.google.android.gms.internal.firebase_ml.zzxl;
import com.google.android.gms.internal.firebase_ml.zzxt;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: mL2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21060mL2 extends AbstractC22089sK2 implements zzxt, KL2, RandomAccess {

    /* renamed from: d */
    public static final C21060mL2 f71886d;

    /* renamed from: b */
    public long[] f71887b;

    /* renamed from: c */
    public int f71888c;

    static {
        C21060mL2 c21060mL2 = new C21060mL2(new long[0], 0);
        f71886d = c21060mL2;
        c21060mL2.zzty();
    }

    public C21060mL2(long[] jArr, int i) {
        this.f71887b = jArr;
        this.f71888c = i;
    }

    /* renamed from: b */
    private final void m26263b(int i) {
        if (i >= 0 && i < this.f71888c) {
            return;
        }
        throw new IndexOutOfBoundsException(m26262c(i));
    }

    /* renamed from: c */
    private final String m26262c(int i) {
        int i2 = this.f71888c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: d */
    public static C21060mL2 m26261d() {
        return f71886d;
    }

    /* renamed from: a */
    public final void m26264a(long j) {
        zztz();
        int i = this.f71888c;
        long[] jArr = this.f71887b;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f71887b = jArr2;
        }
        long[] jArr3 = this.f71887b;
        int i2 = this.f71888c;
        this.f71888c = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        zztz();
        if (i >= 0 && i <= (i2 = this.f71888c)) {
            long[] jArr = this.f71887b;
            if (i2 < jArr.length) {
                System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
            } else {
                long[] jArr2 = new long[((i2 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i);
                System.arraycopy(this.f71887b, i, jArr2, i + 1, this.f71888c - i);
                this.f71887b = jArr2;
            }
            this.f71887b[i] = longValue;
            this.f71888c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m26262c(i));
    }

    @Override // p000.AbstractC22089sK2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zztz();
        zzxl.m47422a(collection);
        if (!(collection instanceof C21060mL2)) {
            return super.addAll(collection);
        }
        C21060mL2 c21060mL2 = (C21060mL2) collection;
        int i = c21060mL2.f71888c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f71888c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f71887b;
            if (i3 > jArr.length) {
                this.f71887b = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(c21060mL2.f71887b, 0, this.f71887b, this.f71888c, c21060mL2.f71888c);
            this.f71888c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC22089sK2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21060mL2)) {
            return super.equals(obj);
        }
        C21060mL2 c21060mL2 = (C21060mL2) obj;
        if (this.f71888c != c21060mL2.f71888c) {
            return false;
        }
        long[] jArr = c21060mL2.f71887b;
        for (int i = 0; i < this.f71888c; i++) {
            if (this.f71887b[i] != jArr[i]) {
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
        m26263b(i);
        return this.f71887b[i];
    }

    @Override // p000.AbstractC22089sK2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f71888c; i2++) {
            i = (i * 31) + zzxl.zzaf(this.f71887b[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f71887b[i] == longValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC22089sK2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zztz();
        for (int i = 0; i < this.f71888c; i++) {
            if (obj.equals(Long.valueOf(this.f71887b[i]))) {
                long[] jArr = this.f71887b;
                System.arraycopy(jArr, i + 1, jArr, i, (this.f71888c - i) - 1);
                this.f71888c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zztz();
        if (i2 >= i) {
            long[] jArr = this.f71887b;
            System.arraycopy(jArr, i2, jArr, i, this.f71888c - i2);
            this.f71888c -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        zztz();
        m26263b(i);
        long[] jArr = this.f71887b;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f71888c;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxt
    public final /* synthetic */ zzxt zzda(int i) {
        if (i >= this.f71888c) {
            return new C21060mL2(Arrays.copyOf(this.f71887b, i), this.f71888c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        zztz();
        m26263b(i);
        long[] jArr = this.f71887b;
        long j = jArr[i];
        if (i < this.f71888c - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f71888c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // p000.AbstractC22089sK2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        m26264a(((Long) obj).longValue());
        return true;
    }
}
