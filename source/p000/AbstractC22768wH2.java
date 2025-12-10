package p000;

import com.google.android.gms.internal.firebase_ml.zzml;
import com.google.android.gms.internal.firebase_ml.zznd;
import java.util.NoSuchElementException;

/* renamed from: wH2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC22768wH2 extends zznd {

    /* renamed from: a */
    public final int f107966a;

    /* renamed from: b */
    public int f107967b;

    public AbstractC22768wH2(int i, int i2) {
        zzml.zzc(i2, i);
        this.f107966a = i;
        this.f107967b = i2;
    }

    /* renamed from: a */
    public abstract Object mo97a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f107967b < this.f107966a) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f107967b > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f107967b;
            this.f107967b = i + 1;
            return mo97a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f107967b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f107967b - 1;
            this.f107967b = i;
            return mo97a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f107967b - 1;
    }
}
