package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzdj;
import java.util.AbstractCollection;
import java.util.Map;

/* renamed from: Ji2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17863Ji2 extends AbstractCollection {
    /* renamed from: a */
    public abstract zzdj mo65996a();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        mo65996a().zzs();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return mo65996a().zzx(entry.getKey(), entry.getValue());
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return mo65996a().zzy(entry.getKey(), entry.getValue());
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return mo65996a().zzh();
    }
}
