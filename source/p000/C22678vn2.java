package p000;

import com.google.android.gms.internal.clearcut.zzcx;
import com.google.android.gms.internal.clearcut.zzfa;
import java.util.Iterator;

/* renamed from: vn2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22678vn2 implements Iterator {

    /* renamed from: a */
    public Iterator f107800a;

    /* renamed from: b */
    public final /* synthetic */ zzfa f107801b;

    public C22678vn2(zzfa zzfaVar) {
        zzcx zzcxVar;
        this.f107801b = zzfaVar;
        zzcxVar = zzfaVar.f45590a;
        this.f107800a = zzcxVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f107800a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return (String) this.f107800a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
