package p000;

import com.google.android.gms.internal.location.zzbr;
import com.google.android.gms.internal.location.zzca;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.NoSuchElementException;

/* renamed from: If2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17821If2 extends zzca {

    /* renamed from: a */
    public final int f2740a;

    /* renamed from: b */
    public int f2741b;

    public AbstractC17821If2(int i, int i2) {
        zzbr.zzb(i2, i, FirebaseAnalytics.Param.INDEX);
        this.f2740a = i;
        this.f2741b = i2;
    }

    /* renamed from: a */
    public abstract Object mo66940a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f2741b < this.f2740a) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f2741b > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f2741b;
            this.f2741b = i + 1;
            return mo66940a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2741b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f2741b - 1;
            this.f2741b = i;
            return mo66940a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2741b - 1;
    }
}