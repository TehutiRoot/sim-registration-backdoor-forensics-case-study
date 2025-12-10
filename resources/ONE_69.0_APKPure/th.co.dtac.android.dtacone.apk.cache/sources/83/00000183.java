package p000;

import com.google.android.gms.internal.firebase_ml.zzaaj;
import com.google.android.gms.internal.firebase_ml.zzyd;
import java.util.Iterator;

/* renamed from: Bb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17354Bb2 implements Iterator {

    /* renamed from: a */
    public Iterator f435a;

    /* renamed from: b */
    public final /* synthetic */ zzaaj f436b;

    public C17354Bb2(zzaaj zzaajVar) {
        zzyd zzydVar;
        this.f436b = zzaajVar;
        zzydVar = zzaajVar.f45759a;
        this.f435a = zzydVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f435a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return (String) this.f435a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}