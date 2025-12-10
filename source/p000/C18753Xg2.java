package p000;

import com.google.android.gms.internal.clearcut.zzcr;
import java.util.Iterator;
import java.util.Map;

/* renamed from: Xg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18753Xg2 implements Iterator {

    /* renamed from: a */
    public Iterator f7547a;

    public C18753Xg2(Iterator it) {
        this.f7547a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7547a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f7547a.next();
        if (entry.getValue() instanceof zzcr) {
            return new C18433Sg2(entry);
        }
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f7547a.remove();
    }
}
