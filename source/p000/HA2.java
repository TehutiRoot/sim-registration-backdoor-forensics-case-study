package p000;

import com.google.android.gms.internal.vision.zzjp;
import java.util.Iterator;
import java.util.Map;

/* renamed from: HA2 */
/* loaded from: classes3.dex */
public final class HA2 implements Iterator {

    /* renamed from: a */
    public Iterator f2126a;

    public HA2(Iterator it) {
        this.f2126a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2126a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f2126a.next();
        if (entry.getValue() instanceof zzjp) {
            return new OA2(entry);
        }
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f2126a.remove();
    }
}
