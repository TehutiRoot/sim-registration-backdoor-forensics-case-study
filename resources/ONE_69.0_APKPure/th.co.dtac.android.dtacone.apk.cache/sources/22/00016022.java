package p000;

import com.google.android.gms.internal.common.zzak;
import com.google.android.gms.internal.common.zzs;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.NoSuchElementException;

/* renamed from: wM2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC22851wM2 extends zzak {

    /* renamed from: a */
    public final int f108413a;

    /* renamed from: b */
    public int f108414b;

    public AbstractC22851wM2(int i, int i2) {
        zzs.zzb(i2, i, FirebaseAnalytics.Param.INDEX);
        this.f108413a = i;
        this.f108414b = i2;
    }

    /* renamed from: a */
    public abstract Object mo755a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f108414b < this.f108413a) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f108414b > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f108414b;
            this.f108414b = i + 1;
            return mo755a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f108414b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f108414b - 1;
            this.f108414b = i;
            return mo755a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f108414b - 1;
    }
}