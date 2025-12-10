package p000;

import com.google.android.gms.internal.vision.zzjp;
import com.google.android.gms.internal.vision.zzkk;
import java.util.Map;

/* renamed from: OA2 */
/* loaded from: classes3.dex */
public final class OA2 implements Map.Entry {

    /* renamed from: a */
    public Map.Entry f4320a;

    public OA2(Map.Entry entry) {
        this.f4320a = entry;
    }

    /* renamed from: a */
    public final zzjp m67109a() {
        return (zzjp) this.f4320a.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4320a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((zzjp) this.f4320a.getValue()) == null) {
            return null;
        }
        return zzjp.zza();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof zzkk) {
            return ((zzjp) this.f4320a.getValue()).zza((zzkk) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
