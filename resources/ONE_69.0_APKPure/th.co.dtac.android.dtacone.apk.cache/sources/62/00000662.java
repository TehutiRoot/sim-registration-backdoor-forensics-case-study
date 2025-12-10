package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzdj;
import java.util.AbstractCollection;
import java.util.Map;

/* renamed from: Gj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17703Gj2 extends AbstractCollection {
    /* renamed from: a */
    public abstract zzdj mo66608a();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        mo66608a().zzs();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return mo66608a().zzx(entry.getKey(), entry.getValue());
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return mo66608a().zzy(entry.getKey(), entry.getValue());
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return mo66608a().zzh();
    }
}