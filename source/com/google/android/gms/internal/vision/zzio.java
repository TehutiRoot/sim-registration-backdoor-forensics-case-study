package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzjb;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class zzio {

    /* renamed from: b */
    public static volatile zzio f47626b;

    /* renamed from: c */
    public static volatile zzio f47627c;

    /* renamed from: d */
    public static final zzio f47628d = new zzio(true);

    /* renamed from: a */
    public final Map f47629a;

    /* renamed from: com.google.android.gms.internal.vision.zzio$a */
    /* loaded from: classes3.dex */
    public static final class C6652a {

        /* renamed from: a */
        public final Object f47630a;

        /* renamed from: b */
        public final int f47631b;

        public C6652a(Object obj, int i) {
            this.f47630a = obj;
            this.f47631b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C6652a)) {
                return false;
            }
            C6652a c6652a = (C6652a) obj;
            if (this.f47630a != c6652a.f47630a || this.f47631b != c6652a.f47631b) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f47630a) * 65535) + this.f47631b;
        }
    }

    public zzio() {
        this.f47629a = new HashMap();
    }

    public static zzio zza() {
        return new zzio();
    }

    public static zzio zzb() {
        zzio zzioVar = f47626b;
        if (zzioVar == null) {
            synchronized (zzio.class) {
                try {
                    zzioVar = f47626b;
                    if (zzioVar == null) {
                        zzioVar = f47628d;
                        f47626b = zzioVar;
                    }
                } finally {
                }
            }
        }
        return zzioVar;
    }

    public static zzio zzc() {
        zzio zzioVar = f47627c;
        if (zzioVar != null) {
            return zzioVar;
        }
        synchronized (zzio.class) {
            try {
                zzio zzioVar2 = f47627c;
                if (zzioVar2 != null) {
                    return zzioVar2;
                }
                zzio m30941a = AbstractC20134gz2.m30941a(zzio.class);
                f47627c = m30941a;
                return m30941a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final <ContainingType extends zzkk> zzjb.zze<ContainingType, ?> zza(ContainingType containingtype, int i) {
        return (zzjb.zze) this.f47629a.get(new C6652a(containingtype, i));
    }

    public zzio(boolean z) {
        this.f47629a = Collections.emptyMap();
    }

    public final void zza(zzjb.zze<?, ?> zzeVar) {
        this.f47629a.put(new C6652a(zzeVar.f47639a, zzeVar.f47642d.f47633b), zzeVar);
    }
}
