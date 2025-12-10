package p000;

import com.google.android.gms.internal.measurement.zzkt;
import com.google.android.gms.internal.measurement.zzms;
import java.util.Iterator;

/* renamed from: jH2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20532jH2 implements Iterator {

    /* renamed from: a */
    public final Iterator f67237a;

    /* renamed from: b */
    public final /* synthetic */ zzms f67238b;

    public C20532jH2(zzms zzmsVar) {
        zzkt zzktVar;
        this.f67238b = zzmsVar;
        zzktVar = zzmsVar.f46344a;
        this.f67237a = zzktVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f67237a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f67237a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
