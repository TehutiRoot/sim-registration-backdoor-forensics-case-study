package p000;

import com.google.android.gms.internal.firebase_ml.zzxt;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: LL2 */
/* loaded from: classes3.dex */
public final class LL2 extends AbstractC22089sK2 implements RandomAccess {

    /* renamed from: d */
    public static final LL2 f3451d;

    /* renamed from: b */
    public Object[] f3452b;

    /* renamed from: c */
    public int f3453c;

    static {
        LL2 ll2 = new LL2(new Object[0], 0);
        f3451d = ll2;
        ll2.zzty();
    }

    public LL2(Object[] objArr, int i) {
        this.f3452b = objArr;
        this.f3453c = i;
    }

    /* renamed from: a */
    private final void m67525a(int i) {
        if (i >= 0 && i < this.f3453c) {
            return;
        }
        throw new IndexOutOfBoundsException(m67524b(i));
    }

    /* renamed from: b */
    private final String m67524b(int i) {
        int i2 = this.f3453c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: c */
    public static LL2 m67523c() {
        return f3451d;
    }

    @Override // p000.AbstractC22089sK2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zztz();
        int i = this.f3453c;
        Object[] objArr = this.f3452b;
        if (i == objArr.length) {
            this.f3452b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f3452b;
        int i2 = this.f3453c;
        this.f3453c = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m67525a(i);
        return this.f3452b[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        zztz();
        m67525a(i);
        Object[] objArr = this.f3452b;
        Object obj = objArr[i];
        if (i < this.f3453c - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f3453c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        zztz();
        m67525a(i);
        Object[] objArr = this.f3452b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3453c;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxt
    public final /* synthetic */ zzxt zzda(int i) {
        if (i >= this.f3453c) {
            return new LL2(Arrays.copyOf(this.f3452b, i), this.f3453c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        zztz();
        if (i >= 0 && i <= (i2 = this.f3453c)) {
            Object[] objArr = this.f3452b;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.f3452b, i, objArr2, i + 1, this.f3453c - i);
                this.f3452b = objArr2;
            }
            this.f3452b[i] = obj;
            this.f3453c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m67524b(i));
    }
}
