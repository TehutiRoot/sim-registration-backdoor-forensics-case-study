package p000;

import com.google.android.gms.internal.firebase_ml.zzml;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: iF2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC20354iF2 implements Iterator {

    /* renamed from: a */
    public int f62753a = AbstractC21902rF2.f77217b;

    /* renamed from: b */
    public Object f62754b;

    /* renamed from: a */
    public abstract Object mo30658a();

    /* renamed from: b */
    public final Object m30657b() {
        this.f62753a = AbstractC21902rF2.f77218c;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z;
        int i = this.f62753a;
        int i2 = AbstractC21902rF2.f77219d;
        if (i != i2) {
            z = true;
        } else {
            z = false;
        }
        zzml.checkState(z);
        int i3 = AbstractC22762wF2.f107956a[this.f62753a - 1];
        if (i3 == 1) {
            return false;
        }
        if (i3 == 2) {
            return true;
        }
        this.f62753a = i2;
        this.f62754b = mo30658a();
        if (this.f62753a == AbstractC21902rF2.f77218c) {
            return false;
        }
        this.f62753a = AbstractC21902rF2.f77216a;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f62753a = AbstractC21902rF2.f77217b;
            Object obj = this.f62754b;
            this.f62754b = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
