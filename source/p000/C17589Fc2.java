package p000;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzau;
import java.util.Iterator;

/* renamed from: Fc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17589Fc2 implements Iterator {

    /* renamed from: a */
    public final Iterator f1651a;

    /* renamed from: b */
    public final /* synthetic */ zzau f1652b;

    public C17589Fc2(zzau zzauVar) {
        Bundle bundle;
        this.f1652b = zzauVar;
        bundle = zzauVar.f48267a;
        this.f1651a = bundle.keySet().iterator();
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public final String next() {
        return (String) this.f1651a.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1651a.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
