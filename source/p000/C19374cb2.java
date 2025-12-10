package p000;

import com.google.android.gms.internal.measurement.zzae;
import com.google.android.gms.internal.measurement.zzat;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: cb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19374cb2 implements Iterator {

    /* renamed from: a */
    public final /* synthetic */ Iterator f39461a;

    /* renamed from: b */
    public final /* synthetic */ Iterator f39462b;

    public C19374cb2(zzae zzaeVar, Iterator it, Iterator it2) {
        this.f39461a = it;
        this.f39462b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f39461a.hasNext()) {
            return true;
        }
        return this.f39462b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f39461a.hasNext()) {
            return new zzat(((Integer) this.f39461a.next()).toString());
        }
        if (this.f39462b.hasNext()) {
            return new zzat((String) this.f39462b.next());
        }
        throw new NoSuchElementException();
    }
}
