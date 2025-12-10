package p000;

import com.google.android.gms.internal.vision.zzjp;
import java.util.Iterator;
import java.util.Map;

/* renamed from: EB2 */
/* loaded from: classes3.dex */
public final class EB2 implements Iterator {

    /* renamed from: a */
    public Iterator f1276a;

    public EB2(Iterator it) {
        this.f1276a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1276a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f1276a.next();
        if (entry.getValue() instanceof zzjp) {
            return new LB2(entry);
        }
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f1276a.remove();
    }
}