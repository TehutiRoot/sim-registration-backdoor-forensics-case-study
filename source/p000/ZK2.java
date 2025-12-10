package p000;

import com.google.android.gms.internal.firebase_ml.zzxl;
import com.google.android.gms.internal.firebase_ml.zzxo;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: ZK2 */
/* loaded from: classes3.dex */
public final class ZK2 extends AbstractC22089sK2 implements zzxo, KL2, RandomAccess {

    /* renamed from: d */
    public static final ZK2 f8018d;

    /* renamed from: b */
    public int[] f8019b;

    /* renamed from: c */
    public int f8020c;

    static {
        ZK2 zk2 = new ZK2(new int[0], 0);
        f8018d = zk2;
        zk2.zzty();
    }

    public ZK2(int[] iArr, int i) {
        this.f8019b = iArr;
        this.f8020c = i;
    }

    /* renamed from: a */
    private final void m65243a(int i) {
        if (i >= 0 && i < this.f8020c) {
            return;
        }
        throw new IndexOutOfBoundsException(m65242b(i));
    }

    /* renamed from: b */
    private final String m65242b(int i) {
        int i2 = this.f8020c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: c */
    public static ZK2 m65241c() {
        return f8018d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        zztz();
        if (i >= 0 && i <= (i2 = this.f8020c)) {
            int[] iArr = this.f8019b;
            if (i2 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
            } else {
                int[] iArr2 = new int[((i2 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.f8019b, i, iArr2, i + 1, this.f8020c - i);
                this.f8019b = iArr2;
            }
            this.f8019b[i] = intValue;
            this.f8020c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m65242b(i));
    }

    @Override // p000.AbstractC22089sK2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zztz();
        zzxl.m47422a(collection);
        if (!(collection instanceof ZK2)) {
            return super.addAll(collection);
        }
        ZK2 zk2 = (ZK2) collection;
        int i = zk2.f8020c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f8020c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f8019b;
            if (i3 > iArr.length) {
                this.f8019b = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(zk2.f8019b, 0, this.f8019b, this.f8020c, zk2.f8020c);
            this.f8020c = i3;
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
        if (!(obj instanceof ZK2)) {
            return super.equals(obj);
        }
        ZK2 zk2 = (ZK2) obj;
        if (this.f8020c != zk2.f8020c) {
            return false;
        }
        int[] iArr = zk2.f8019b;
        for (int i = 0; i < this.f8020c; i++) {
            if (this.f8019b[i] != iArr[i]) {
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
        m65243a(i);
        return this.f8019b[i];
    }

    @Override // p000.AbstractC22089sK2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f8020c; i2++) {
            i = (i * 31) + this.f8019b[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f8019b[i] == intValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC22089sK2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zztz();
        for (int i = 0; i < this.f8020c; i++) {
            if (obj.equals(Integer.valueOf(this.f8019b[i]))) {
                int[] iArr = this.f8019b;
                System.arraycopy(iArr, i + 1, iArr, i, (this.f8020c - i) - 1);
                this.f8020c--;
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
            int[] iArr = this.f8019b;
            System.arraycopy(iArr, i2, iArr, i, this.f8020c - i2);
            this.f8020c -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zztz();
        m65243a(i);
        int[] iArr = this.f8019b;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8020c;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxt
    /* renamed from: zzdw */
    public final zzxo zzda(int i) {
        if (i >= this.f8020c) {
            return new ZK2(Arrays.copyOf(this.f8019b, i), this.f8020c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxo
    public final void zzdx(int i) {
        zztz();
        int i2 = this.f8020c;
        int[] iArr = this.f8019b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f8019b = iArr2;
        }
        int[] iArr3 = this.f8019b;
        int i3 = this.f8020c;
        this.f8020c = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        zztz();
        m65243a(i);
        int[] iArr = this.f8019b;
        int i3 = iArr[i];
        if (i < this.f8020c - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.f8020c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // p000.AbstractC22089sK2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zzdx(((Integer) obj).intValue());
        return true;
    }
}
