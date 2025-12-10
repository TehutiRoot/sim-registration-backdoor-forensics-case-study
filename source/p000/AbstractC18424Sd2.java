package p000;

import com.google.android.gms.internal.maps.zzba;
import com.google.android.gms.internal.maps.zzby;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.NoSuchElementException;

/* renamed from: Sd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18424Sd2 extends zzby {

    /* renamed from: a */
    public final int f5660a;

    /* renamed from: b */
    public int f5661b;

    public AbstractC18424Sd2(int i, int i2) {
        zzba.zzb(i2, i, FirebaseAnalytics.Param.INDEX);
        this.f5660a = i;
        this.f5661b = i2;
    }

    /* renamed from: a */
    public abstract Object mo25893a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f5661b < this.f5660a) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f5661b > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f5661b;
            this.f5661b = i + 1;
            return mo25893a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5661b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f5661b - 1;
            this.f5661b = i;
            return mo25893a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5661b - 1;
    }
}
