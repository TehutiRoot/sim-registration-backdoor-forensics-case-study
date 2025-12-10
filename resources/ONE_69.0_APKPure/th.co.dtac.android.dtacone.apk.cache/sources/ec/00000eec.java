package p000;

import com.google.android.gms.internal.clearcut.zzcr;
import com.google.android.gms.internal.clearcut.zzdo;
import java.util.Map;

/* renamed from: Ph2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18282Ph2 implements Map.Entry {

    /* renamed from: a */
    public Map.Entry f4862a;

    public C18282Ph2(Map.Entry entry) {
        this.f4862a = entry;
    }

    /* renamed from: a */
    public final zzcr m66936a() {
        return (zzcr) this.f4862a.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4862a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((zzcr) this.f4862a.getValue()) == null) {
            return null;
        }
        return zzcr.zzbr();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof zzdo) {
            return ((zzcr) this.f4862a.getValue()).zzi((zzdo) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}