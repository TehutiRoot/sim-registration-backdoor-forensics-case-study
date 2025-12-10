package p000;

import com.google.android.gms.internal.measurement.zzkt;
import com.google.android.gms.internal.measurement.zzms;
import java.util.Iterator;

/* renamed from: gI2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20071gI2 implements Iterator {

    /* renamed from: a */
    public final Iterator f62143a;

    /* renamed from: b */
    public final /* synthetic */ zzms f62144b;

    public C20071gI2(zzms zzmsVar) {
        zzkt zzktVar;
        this.f62144b = zzmsVar;
        zzktVar = zzmsVar.f46356a;
        this.f62143a = zzktVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f62143a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f62143a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}