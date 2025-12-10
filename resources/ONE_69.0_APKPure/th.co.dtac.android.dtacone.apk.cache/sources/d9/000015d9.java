package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzac;
import com.google.android.gms.internal.mlkit_vision_common.zzf;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.NoSuchElementException;

/* renamed from: Wt2 */
/* loaded from: classes3.dex */
public abstract class Wt2 extends zzac {

    /* renamed from: a */
    public final int f7415a;

    /* renamed from: b */
    public int f7416b;

    public Wt2(int i, int i2) {
        zzf.zzb(i2, i, FirebaseAnalytics.Param.INDEX);
        this.f7415a = i;
        this.f7416b = i2;
    }

    /* renamed from: a */
    public abstract Object mo65652a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f7416b < this.f7415a) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f7416b > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f7416b;
            this.f7416b = i + 1;
            return mo65652a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f7416b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f7416b - 1;
            this.f7416b = i;
            return mo65652a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f7416b - 1;
    }
}