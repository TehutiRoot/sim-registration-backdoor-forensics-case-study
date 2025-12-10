package p000;

import com.google.android.gms.internal.vision.zzde;
import com.google.android.gms.internal.vision.zzez;
import java.util.NoSuchElementException;

/* renamed from: Wi2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18695Wi2 extends zzez {

    /* renamed from: a */
    public final int f7278a;

    /* renamed from: b */
    public int f7279b;

    public AbstractC18695Wi2(int i, int i2) {
        zzde.zzb(i2, i);
        this.f7278a = i;
        this.f7279b = i2;
    }

    /* renamed from: a */
    public abstract Object mo65577a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f7279b < this.f7278a) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f7279b > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f7279b;
            this.f7279b = i + 1;
            return mo65577a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f7279b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f7279b - 1;
            this.f7279b = i;
            return mo65577a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f7279b - 1;
    }
}
