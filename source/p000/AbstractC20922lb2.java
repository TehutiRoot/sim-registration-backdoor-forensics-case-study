package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzab;
import com.google.android.gms.internal.mlkit_vision_face.zzcm;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.NoSuchElementException;

/* renamed from: lb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC20922lb2 extends zzcm {

    /* renamed from: a */
    public final int f71657a;

    /* renamed from: b */
    public int f71658b;

    public AbstractC20922lb2(int i, int i2) {
        zzab.zzb(i2, i, FirebaseAnalytics.Param.INDEX);
        this.f71657a = i;
        this.f71658b = i2;
    }

    /* renamed from: a */
    public abstract Object mo1018a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f71658b < this.f71657a) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f71658b > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f71658b;
            this.f71658b = i + 1;
            return mo1018a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f71658b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f71658b - 1;
            this.f71658b = i;
            return mo1018a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f71658b - 1;
    }
}
