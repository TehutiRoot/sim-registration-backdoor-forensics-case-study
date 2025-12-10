package p000;

import com.google.android.gms.internal.firebase_ml.zzml;
import com.google.android.gms.internal.firebase_ml.zznd;
import java.util.NoSuchElementException;

/* renamed from: tI2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC22320tI2 extends zznd {

    /* renamed from: a */
    public final int f80144a;

    /* renamed from: b */
    public int f80145b;

    public AbstractC22320tI2(int i, int i2) {
        zzml.zzc(i2, i);
        this.f80144a = i;
        this.f80145b = i2;
    }

    /* renamed from: a */
    public abstract Object mo762a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f80145b < this.f80144a) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f80145b > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f80145b;
            this.f80145b = i + 1;
            return mo762a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f80145b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f80145b - 1;
            this.f80145b = i;
            return mo762a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f80145b - 1;
    }
}