package p000;

import com.google.android.gms.internal.mlkit_common.zzat;
import com.google.android.gms.internal.mlkit_common.zzt;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.NoSuchElementException;

/* renamed from: kK2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC20713kK2 extends zzat {

    /* renamed from: a */
    public final int f67891a;

    /* renamed from: b */
    public int f67892b;

    public AbstractC20713kK2(int i, int i2) {
        zzt.zzb(i2, i, FirebaseAnalytics.Param.INDEX);
        this.f67891a = i;
        this.f67892b = i2;
    }

    /* renamed from: a */
    public abstract Object mo28934a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f67892b < this.f67891a) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f67892b > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f67892b;
            this.f67892b = i + 1;
            return mo28934a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f67892b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f67892b - 1;
            this.f67892b = i;
            return mo28934a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f67892b - 1;
    }
}
