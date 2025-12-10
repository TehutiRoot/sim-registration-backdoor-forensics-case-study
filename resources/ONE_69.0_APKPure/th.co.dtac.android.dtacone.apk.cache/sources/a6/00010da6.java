package p000;

import com.google.android.gms.internal.clearcut.zzcx;
import com.google.android.gms.internal.clearcut.zzfa;
import java.util.Iterator;

/* renamed from: so2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22230so2 implements Iterator {

    /* renamed from: a */
    public Iterator f79997a;

    /* renamed from: b */
    public final /* synthetic */ zzfa f79998b;

    public C22230so2(zzfa zzfaVar) {
        zzcx zzcxVar;
        this.f79998b = zzfaVar;
        zzcxVar = zzfaVar.f45602a;
        this.f79997a = zzcxVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f79997a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return (String) this.f79997a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}