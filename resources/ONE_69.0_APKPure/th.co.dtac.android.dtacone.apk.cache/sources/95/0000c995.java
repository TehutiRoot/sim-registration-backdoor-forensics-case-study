package p000;

import com.google.android.gms.internal.vision.zzjv;
import com.google.android.gms.internal.vision.zzlz;
import java.util.Iterator;

/* renamed from: iH2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20414iH2 implements Iterator {

    /* renamed from: a */
    public Iterator f62804a;

    /* renamed from: b */
    public final /* synthetic */ zzlz f62805b;

    public C20414iH2(zzlz zzlzVar) {
        zzjv zzjvVar;
        this.f62805b = zzlzVar;
        zzjvVar = zzlzVar.f47675a;
        this.f62804a = zzjvVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f62804a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return (String) this.f62804a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}