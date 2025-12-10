package p000;

import com.google.android.gms.internal.mlkit_vision_text_common.zzcp;
import com.google.android.gms.internal.mlkit_vision_text_common.zzx;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.NoSuchElementException;

/* renamed from: DL2 */
/* loaded from: classes3.dex */
public abstract class DL2 extends zzcp {

    /* renamed from: a */
    public final int f977a;

    /* renamed from: b */
    public int f978b;

    public DL2(int i, int i2) {
        zzx.zzb(i2, i, FirebaseAnalytics.Param.INDEX);
        this.f977a = i;
        this.f978b = i2;
    }

    /* renamed from: a */
    public abstract Object mo23640a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f978b < this.f977a) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f978b > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f978b;
            this.f978b = i + 1;
            return mo23640a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f978b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f978b - 1;
            this.f978b = i;
            return mo23640a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f978b - 1;
    }
}
