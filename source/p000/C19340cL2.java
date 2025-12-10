package p000;

import com.google.android.gms.internal.firebase_ml.zzxx;
import com.google.android.gms.internal.firebase_ml.zzys;
import java.util.Map;

/* renamed from: cL2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19340cL2 implements Map.Entry {

    /* renamed from: a */
    public Map.Entry f39423a;

    public C19340cL2(Map.Entry entry) {
        this.f39423a = entry;
    }

    /* renamed from: a */
    public final zzxx m51689a() {
        return (zzxx) this.f39423a.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f39423a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((zzxx) this.f39423a.getValue()) == null) {
            return null;
        }
        return zzxx.zzvx();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof zzys) {
            return ((zzxx) this.f39423a.getValue()).zzi((zzys) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
