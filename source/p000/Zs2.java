package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzac;
import com.google.android.gms.internal.mlkit_vision_common.zzf;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.NoSuchElementException;

/* renamed from: Zs2 */
/* loaded from: classes3.dex */
public abstract class Zs2 extends zzac {

    /* renamed from: a */
    public final int f8168a;

    /* renamed from: b */
    public int f8169b;

    public Zs2(int i, int i2) {
        zzf.zzb(i2, i, FirebaseAnalytics.Param.INDEX);
        this.f8168a = i;
        this.f8169b = i2;
    }

    /* renamed from: a */
    public abstract Object mo65140a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f8169b < this.f8168a) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f8169b > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f8169b;
            this.f8169b = i + 1;
            return mo65140a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f8169b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f8169b - 1;
            this.f8169b = i;
            return mo65140a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f8169b - 1;
    }
}
