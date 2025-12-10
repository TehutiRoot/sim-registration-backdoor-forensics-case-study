package p000;

import com.google.android.gms.internal.mlkit_vision_text_common.zzcp;
import com.google.android.gms.internal.mlkit_vision_text_common.zzx;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.NoSuchElementException;

/* renamed from: AM2 */
/* loaded from: classes3.dex */
public abstract class AM2 extends zzcp {

    /* renamed from: a */
    public final int f82a;

    /* renamed from: b */
    public int f83b;

    public AM2(int i, int i2) {
        zzx.zzb(i2, i, FirebaseAnalytics.Param.INDEX);
        this.f82a = i;
        this.f83b = i2;
    }

    /* renamed from: a */
    public abstract Object mo26596a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f83b < this.f82a) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f83b > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f83b;
            this.f83b = i + 1;
            return mo26596a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f83b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f83b - 1;
            this.f83b = i;
            return mo26596a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f83b - 1;
    }
}