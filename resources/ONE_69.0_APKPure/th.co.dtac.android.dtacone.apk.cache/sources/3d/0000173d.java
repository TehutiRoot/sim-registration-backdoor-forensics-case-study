package p000;

import com.google.android.gms.internal.firebase_ml.zzxx;
import java.util.Iterator;
import java.util.Map;

/* renamed from: YL2 */
/* loaded from: classes3.dex */
public final class YL2 implements Iterator {

    /* renamed from: a */
    public Iterator f7849a;

    public YL2(Iterator it) {
        this.f7849a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7849a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f7849a.next();
        if (entry.getValue() instanceof zzxx) {
            return new ZL2(entry);
        }
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f7849a.remove();
    }
}