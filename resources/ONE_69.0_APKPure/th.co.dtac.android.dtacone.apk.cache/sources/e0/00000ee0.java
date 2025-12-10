package p000;

import com.google.android.gms.internal.maps.zzba;
import com.google.android.gms.internal.maps.zzby;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.NoSuchElementException;

/* renamed from: Pe2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18273Pe2 extends zzby {

    /* renamed from: a */
    public final int f4849a;

    /* renamed from: b */
    public int f4850b;

    public AbstractC18273Pe2(int i, int i2) {
        zzba.zzb(i2, i, FirebaseAnalytics.Param.INDEX);
        this.f4849a = i;
        this.f4850b = i2;
    }

    /* renamed from: a */
    public abstract Object mo26789a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f4850b < this.f4849a) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f4850b > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f4850b;
            this.f4850b = i + 1;
            return mo26789a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4850b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f4850b - 1;
            this.f4850b = i;
            return mo26789a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4850b - 1;
    }
}