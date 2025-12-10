package p000;

import com.google.android.gms.internal.firebase_ml.zzjd;
import com.google.android.gms.internal.firebase_ml.zzml;
import java.util.Locale;
import java.util.Map;

/* renamed from: hz2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20306hz2 implements Map.Entry {

    /* renamed from: a */
    public Object f62678a;

    /* renamed from: b */
    public final zzjd f62679b;

    /* renamed from: c */
    public final /* synthetic */ C23402zz2 f62680c;

    public C20306hz2(C23402zz2 c23402zz2, zzjd zzjdVar, Object obj) {
        this.f62680c = c23402zz2;
        this.f62679b = zzjdVar;
        this.f62678a = zzml.checkNotNull(obj);
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
        String name = this.f62679b.getName();
        if (this.f62680c.f109247b.zzie()) {
            return name.toLowerCase(Locale.US);
        }
        return name;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f62678a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return ((String) getKey()).hashCode() ^ getValue().hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f62678a;
        this.f62678a = zzml.checkNotNull(obj);
        this.f62679b.zzb(this.f62680c.f109246a, obj);
        return obj2;
    }
}
