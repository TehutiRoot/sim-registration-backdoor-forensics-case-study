package p000;

import com.google.android.gms.internal.common.zzak;
import com.google.android.gms.internal.common.zzs;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.NoSuchElementException;

/* renamed from: zL2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC23296zL2 extends zzak {

    /* renamed from: a */
    public final int f109043a;

    /* renamed from: b */
    public int f109044b;

    public AbstractC23296zL2(int i, int i2) {
        zzs.zzb(i2, i, FirebaseAnalytics.Param.INDEX);
        this.f109043a = i;
        this.f109044b = i2;
    }

    /* renamed from: a */
    public abstract Object mo93a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f109044b < this.f109043a) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f109044b > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f109044b;
            this.f109044b = i + 1;
            return mo93a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f109044b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f109044b - 1;
            this.f109044b = i;
            return mo93a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f109044b - 1;
    }
}
