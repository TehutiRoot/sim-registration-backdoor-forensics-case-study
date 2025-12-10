package p000;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzau;
import java.util.Iterator;

/* renamed from: Cd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17425Cd2 implements Iterator {

    /* renamed from: a */
    public final Iterator f790a;

    /* renamed from: b */
    public final /* synthetic */ zzau f791b;

    public C17425Cd2(zzau zzauVar) {
        Bundle bundle;
        this.f791b = zzauVar;
        bundle = zzauVar.f48279a;
        this.f790a = bundle.keySet().iterator();
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public final String next() {
        return (String) this.f790a.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f790a.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}