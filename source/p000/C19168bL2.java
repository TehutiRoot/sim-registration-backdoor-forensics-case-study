package p000;

import com.google.android.gms.internal.firebase_ml.zzxx;
import java.util.Iterator;
import java.util.Map;

/* renamed from: bL2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19168bL2 implements Iterator {

    /* renamed from: a */
    public Iterator f39017a;

    public C19168bL2(Iterator it) {
        this.f39017a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f39017a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f39017a.next();
        if (entry.getValue() instanceof zzxx) {
            return new C19340cL2(entry);
        }
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f39017a.remove();
    }
}
