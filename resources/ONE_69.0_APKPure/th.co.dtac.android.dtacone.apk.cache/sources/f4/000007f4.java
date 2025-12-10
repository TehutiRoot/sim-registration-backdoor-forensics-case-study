package p000;

import com.google.android.gms.internal.firebase_ml.zzxt;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: IM2 */
/* loaded from: classes3.dex */
public final class IM2 extends AbstractC21637pL2 implements RandomAccess {

    /* renamed from: d */
    public static final IM2 f2674d;

    /* renamed from: b */
    public Object[] f2675b;

    /* renamed from: c */
    public int f2676c;

    static {
        IM2 im2 = new IM2(new Object[0], 0);
        f2674d = im2;
        im2.zzty();
    }

    public IM2(Object[] objArr, int i) {
        this.f2675b = objArr;
        this.f2676c = i;
    }

    /* renamed from: a */
    private final void m68017a(int i) {
        if (i >= 0 && i < this.f2676c) {
            return;
        }
        throw new IndexOutOfBoundsException(m68016b(i));
    }

    /* renamed from: b */
    private final String m68016b(int i) {
        int i2 = this.f2676c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: c */
    public static IM2 m68015c() {
        return f2674d;
    }

    @Override // p000.AbstractC21637pL2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zztz();
        int i = this.f2676c;
        Object[] objArr = this.f2675b;
        if (i == objArr.length) {
            this.f2675b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f2675b;
        int i2 = this.f2676c;
        this.f2676c = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m68017a(i);
        return this.f2675b[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        zztz();
        m68017a(i);
        Object[] objArr = this.f2675b;
        Object obj = objArr[i];
        if (i < this.f2676c - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f2676c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        zztz();
        m68017a(i);
        Object[] objArr = this.f2675b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2676c;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxt
    public final /* synthetic */ zzxt zzda(int i) {
        if (i >= this.f2676c) {
            return new IM2(Arrays.copyOf(this.f2675b, i), this.f2676c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        zztz();
        if (i >= 0 && i <= (i2 = this.f2676c)) {
            Object[] objArr = this.f2675b;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.f2675b, i, objArr2, i + 1, this.f2676c - i);
                this.f2675b = objArr2;
            }
            this.f2675b[i] = obj;
            this.f2676c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m68016b(i));
    }
}