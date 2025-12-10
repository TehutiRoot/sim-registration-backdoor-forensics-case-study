package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgr;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: ds2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19597ds2 extends AbstractSet {

    /* renamed from: a */
    public final /* synthetic */ AbstractC21661ps2 f61343a;

    public /* synthetic */ C19597ds2(AbstractC21661ps2 abstractC21661ps2, zzgr zzgrVar) {
        this.f61343a = abstractC21661ps2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            this.f61343a.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f61343a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f61343a.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 == value) {
            return true;
        }
        if (obj2 != null && obj2.equals(value)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new Tr2(this.f61343a, null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            this.f61343a.remove(entry.getKey());
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f61343a.size();
    }
}
