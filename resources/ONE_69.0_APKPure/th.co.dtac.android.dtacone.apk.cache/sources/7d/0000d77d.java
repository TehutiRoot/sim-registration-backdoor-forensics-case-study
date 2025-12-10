package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzbc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzdy;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.NoSuchElementException;

/* renamed from: jf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC20646jf2 extends zzdy {

    /* renamed from: a */
    public final int f67357a;

    /* renamed from: b */
    public int f67358b;

    public AbstractC20646jf2(int i, int i2) {
        zzbc.zzb(i2, i, FirebaseAnalytics.Param.INDEX);
        this.f67357a = i;
        this.f67358b = i2;
    }

    /* renamed from: a */
    public abstract Object mo29498a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f67358b < this.f67357a) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f67358b > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f67358b;
            this.f67358b = i + 1;
            return mo29498a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f67358b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f67358b - 1;
            this.f67358b = i;
            return mo29498a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f67358b - 1;
    }
}