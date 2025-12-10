package p000;

import com.google.android.gms.internal.clearcut.zzcr;
import com.google.android.gms.internal.clearcut.zzdo;
import java.util.Map;

/* renamed from: Sg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18433Sg2 implements Map.Entry {

    /* renamed from: a */
    public Map.Entry f5672a;

    public C18433Sg2(Map.Entry entry) {
        this.f5672a = entry;
    }

    /* renamed from: a */
    public final zzcr m66304a() {
        return (zzcr) this.f5672a.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f5672a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((zzcr) this.f5672a.getValue()) == null) {
            return null;
        }
        return zzcr.zzbr();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof zzdo) {
            return ((zzcr) this.f5672a.getValue()).zzi((zzdo) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
