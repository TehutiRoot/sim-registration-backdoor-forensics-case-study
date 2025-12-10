package p000;

import com.google.android.gms.internal.vision.zzjv;
import com.google.android.gms.internal.vision.zzlz;
import java.util.Iterator;

/* renamed from: lG2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20873lG2 implements Iterator {

    /* renamed from: a */
    public Iterator f71577a;

    /* renamed from: b */
    public final /* synthetic */ zzlz f71578b;

    public C20873lG2(zzlz zzlzVar) {
        zzjv zzjvVar;
        this.f71578b = zzlzVar;
        zzjvVar = zzlzVar.f47663a;
        this.f71577a = zzjvVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f71577a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return (String) this.f71577a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
