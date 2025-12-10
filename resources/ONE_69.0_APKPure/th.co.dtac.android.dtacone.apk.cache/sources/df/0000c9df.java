package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzab;
import com.google.android.gms.internal.mlkit_vision_face.zzcm;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.NoSuchElementException;

/* renamed from: ic2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC20464ic2 extends zzcm {

    /* renamed from: a */
    public final int f62887a;

    /* renamed from: b */
    public int f62888b;

    public AbstractC20464ic2(int i, int i2) {
        zzab.zzb(i2, i, FirebaseAnalytics.Param.INDEX);
        this.f62887a = i;
        this.f62888b = i2;
    }

    /* renamed from: a */
    public abstract Object mo22794a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f62888b < this.f62887a) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f62888b > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f62888b;
            this.f62888b = i + 1;
            return mo22794a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f62888b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f62888b - 1;
            this.f62888b = i;
            return mo22794a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f62888b - 1;
    }
}