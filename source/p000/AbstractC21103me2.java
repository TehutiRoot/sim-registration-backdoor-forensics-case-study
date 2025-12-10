package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzbc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzdy;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.NoSuchElementException;

/* renamed from: me2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC21103me2 extends zzdy {

    /* renamed from: a */
    public final int f71980a;

    /* renamed from: b */
    public int f71981b;

    public AbstractC21103me2(int i, int i2) {
        zzbc.zzb(i2, i, FirebaseAnalytics.Param.INDEX);
        this.f71980a = i;
        this.f71981b = i2;
    }

    /* renamed from: a */
    public abstract Object mo26227a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f71981b < this.f71980a) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f71981b > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f71981b;
            this.f71981b = i + 1;
            return mo26227a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f71981b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f71981b - 1;
            this.f71981b = i;
            return mo26227a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f71981b - 1;
    }
}
