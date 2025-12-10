package p000;

import com.google.android.gms.internal.firebase_ml.zzaaj;
import com.google.android.gms.internal.firebase_ml.zzyd;
import java.util.Iterator;

/* renamed from: Ea2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17519Ea2 implements Iterator {

    /* renamed from: a */
    public Iterator f1327a;

    /* renamed from: b */
    public final /* synthetic */ zzaaj f1328b;

    public C17519Ea2(zzaaj zzaajVar) {
        zzyd zzydVar;
        this.f1328b = zzaajVar;
        zzydVar = zzaajVar.f45747a;
        this.f1327a = zzydVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1327a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return (String) this.f1327a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
