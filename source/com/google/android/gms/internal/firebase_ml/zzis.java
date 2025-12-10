package com.google.android.gms.internal.firebase_ml;

import java.lang.reflect.Field;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzis {

    /* renamed from: a */
    public final Map f45889a = new zziq();

    /* renamed from: b */
    public final Map f45890b = new zziq();

    /* renamed from: c */
    public final Object f45891c;

    public zzis(Object obj) {
        this.f45891c = obj;
    }

    public final void zza(Field field, Class<?> cls, Object obj) {
        boolean z;
        Jy2 jy2 = (Jy2) this.f45890b.get(field);
        if (jy2 == null) {
            jy2 = new Jy2(cls);
            this.f45890b.put(field, jy2);
        }
        if (cls == jy2.f3079a) {
            z = true;
        } else {
            z = false;
        }
        zzml.checkArgument(z);
        jy2.f3080b.add(obj);
    }

    public final void zzic() {
        for (Map.Entry entry : this.f45889a.entrySet()) {
            ((Map) this.f45891c).put((String) entry.getKey(), ((Jy2) entry.getValue()).m67655a());
        }
        for (Map.Entry entry2 : this.f45890b.entrySet()) {
            zzjd.zza((Field) entry2.getKey(), this.f45891c, ((Jy2) entry2.getValue()).m67655a());
        }
    }
}
