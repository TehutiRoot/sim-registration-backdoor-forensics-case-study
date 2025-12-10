package p000;

import com.google.android.gms.internal.mlkit_common.zzat;
import com.google.android.gms.internal.mlkit_common.zzt;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.NoSuchElementException;

/* renamed from: hL2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC20253hL2 extends zzat {

    /* renamed from: a */
    public final int f62463a;

    /* renamed from: b */
    public int f62464b;

    public AbstractC20253hL2(int i, int i2) {
        zzt.zzb(i2, i, FirebaseAnalytics.Param.INDEX);
        this.f62463a = i;
        this.f62464b = i2;
    }

    /* renamed from: a */
    public abstract Object mo31239a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f62464b < this.f62463a) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f62464b > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f62464b;
            this.f62464b = i + 1;
            return mo31239a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f62464b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f62464b - 1;
            this.f62464b = i;
            return mo31239a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f62464b - 1;
    }
}