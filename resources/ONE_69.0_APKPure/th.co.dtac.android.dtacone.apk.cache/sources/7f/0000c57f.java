package p000;

import com.google.android.gms.internal.firebase_ml.zzjd;
import com.google.android.gms.internal.firebase_ml.zzml;
import java.util.Locale;
import java.util.Map;

/* renamed from: eA2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19701eA2 implements Map.Entry {

    /* renamed from: a */
    public Object f61495a;

    /* renamed from: b */
    public final zzjd f61496b;

    /* renamed from: c */
    public final /* synthetic */ C22815wA2 f61497c;

    public C19701eA2(C22815wA2 c22815wA2, zzjd zzjdVar, Object obj) {
        this.f61497c = c22815wA2;
        this.f61496b = zzjdVar;
        this.f61495a = zzml.checkNotNull(obj);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (((String) getKey()).equals(entry.getKey()) && getValue().equals(entry.getValue())) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        String name = this.f61496b.getName();
        if (this.f61497c.f108355b.zzie()) {
            return name.toLowerCase(Locale.US);
        }
        return name;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f61495a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return ((String) getKey()).hashCode() ^ getValue().hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f61495a;
        this.f61495a = zzml.checkNotNull(obj);
        this.f61496b.zzb(this.f61497c.f108354a, obj);
        return obj2;
    }
}