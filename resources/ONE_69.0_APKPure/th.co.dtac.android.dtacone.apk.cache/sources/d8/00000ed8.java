package p000;

import com.google.android.gms.internal.measurement.zzat;
import java.util.Iterator;

/* renamed from: Pc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18267Pc2 implements Iterator {

    /* renamed from: a */
    public final /* synthetic */ Iterator f4835a;

    public C18267Pc2(Iterator it) {
        this.f4835a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4835a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new zzat((String) this.f4835a.next());
    }
}