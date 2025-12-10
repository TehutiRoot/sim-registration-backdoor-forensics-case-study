package p000;

import com.google.android.gms.internal.location.zzbr;
import com.google.android.gms.internal.location.zzca;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.NoSuchElementException;

/* renamed from: Le2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17979Le2 extends zzca {

    /* renamed from: a */
    public final int f3514a;

    /* renamed from: b */
    public int f3515b;

    public AbstractC17979Le2(int i, int i2) {
        zzbr.zzb(i2, i, FirebaseAnalytics.Param.INDEX);
        this.f3514a = i;
        this.f3515b = i2;
    }

    /* renamed from: a */
    public abstract Object mo66313a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f3515b < this.f3514a) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f3515b > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f3515b;
            this.f3515b = i + 1;
            return mo66313a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f3515b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f3515b - 1;
            this.f3515b = i;
            return mo66313a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f3515b - 1;
    }
}
