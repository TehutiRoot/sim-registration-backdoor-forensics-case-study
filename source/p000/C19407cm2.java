package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: cm2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19407cm2 implements Iterator {

    /* renamed from: a */
    public final Iterator f40217a;

    public C19407cm2(Iterator it) {
        this.f40217a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40217a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f40217a.next();
        if (entry.getValue() instanceof zzet) {
            return new C18832Yl2(entry, null);
        }
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f40217a.remove();
    }
}
