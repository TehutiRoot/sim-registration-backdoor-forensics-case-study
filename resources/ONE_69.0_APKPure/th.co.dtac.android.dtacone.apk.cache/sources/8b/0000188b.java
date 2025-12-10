package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: Zm2 */
/* loaded from: classes3.dex */
public final class Zm2 implements Iterator {

    /* renamed from: a */
    public final Iterator f8271a;

    public Zm2(Iterator it) {
        this.f8271a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8271a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f8271a.next();
        if (entry.getValue() instanceof zzet) {
            return new C18687Vm2(entry, null);
        }
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f8271a.remove();
    }
}