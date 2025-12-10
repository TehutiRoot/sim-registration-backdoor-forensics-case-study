package p000;

import com.google.android.gms.internal.vision.zzde;
import com.google.android.gms.internal.vision.zzez;
import java.util.NoSuchElementException;

/* renamed from: Tj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18548Tj2 extends zzez {

    /* renamed from: a */
    public final int f6404a;

    /* renamed from: b */
    public int f6405b;

    public AbstractC18548Tj2(int i, int i2) {
        zzde.zzb(i2, i);
        this.f6404a = i;
        this.f6405b = i2;
    }

    /* renamed from: a */
    public abstract Object mo66311a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f6405b < this.f6404a) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f6405b > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f6405b;
            this.f6405b = i + 1;
            return mo66311a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f6405b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f6405b - 1;
            this.f6405b = i;
            return mo66311a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f6405b - 1;
    }
}