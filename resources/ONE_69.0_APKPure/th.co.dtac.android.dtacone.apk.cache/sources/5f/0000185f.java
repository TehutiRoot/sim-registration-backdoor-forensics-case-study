package p000;

import com.google.android.gms.internal.measurement.zzae;
import com.google.android.gms.internal.measurement.zzat;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: Zb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18913Zb2 implements Iterator {

    /* renamed from: a */
    public final /* synthetic */ Iterator f8209a;

    /* renamed from: b */
    public final /* synthetic */ Iterator f8210b;

    public C18913Zb2(zzae zzaeVar, Iterator it, Iterator it2) {
        this.f8209a = it;
        this.f8210b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f8209a.hasNext()) {
            return true;
        }
        return this.f8210b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f8209a.hasNext()) {
            return new zzat(((Integer) this.f8209a.next()).toString());
        }
        if (this.f8210b.hasNext()) {
            return new zzat((String) this.f8210b.next());
        }
        throw new NoSuchElementException();
    }
}