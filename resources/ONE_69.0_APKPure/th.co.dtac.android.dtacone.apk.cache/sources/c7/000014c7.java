package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzet;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo;
import java.util.Map;

/* renamed from: Vm2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18687Vm2 implements Map.Entry {

    /* renamed from: a */
    public final Map.Entry f7085a;

    /* renamed from: a */
    public final zzet m65865a() {
        return (zzet) this.f7085a.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f7085a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((zzet) this.f7085a.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof zzfo) {
            return ((zzet) this.f7085a.getValue()).zzc((zzfo) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}