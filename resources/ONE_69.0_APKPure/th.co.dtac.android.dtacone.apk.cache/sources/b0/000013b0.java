package p000;

import com.google.android.gms.internal.clearcut.zzcr;
import java.util.Iterator;
import java.util.Map;

/* renamed from: Uh2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18607Uh2 implements Iterator {

    /* renamed from: a */
    public Iterator f6693a;

    public C18607Uh2(Iterator it) {
        this.f6693a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6693a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f6693a.next();
        if (entry.getValue() instanceof zzcr) {
            return new C18282Ph2(entry);
        }
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f6693a.remove();
    }
}