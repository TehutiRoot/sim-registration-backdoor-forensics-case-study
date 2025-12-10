package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzjb;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class zzio {

    /* renamed from: b */
    public static volatile zzio f47638b;

    /* renamed from: c */
    public static volatile zzio f47639c;

    /* renamed from: d */
    public static final zzio f47640d = new zzio(true);

    /* renamed from: a */
    public final Map f47641a;

    /* renamed from: com.google.android.gms.internal.vision.zzio$a */
    /* loaded from: classes3.dex */
    public static final class C6641a {

        /* renamed from: a */
        public final Object f47642a;

        /* renamed from: b */
        public final int f47643b;

        public C6641a(Object obj, int i) {
            this.f47642a = obj;
            this.f47643b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C6641a)) {
                return false;
            }
            C6641a c6641a = (C6641a) obj;
            if (this.f47642a != c6641a.f47642a || this.f47643b != c6641a.f47643b) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f47642a) * 65535) + this.f47643b;
        }
    }

    public zzio() {
        this.f47641a = new HashMap();
    }

    public static zzio zza() {
        return new zzio();
    }

    public static zzio zzb() {
        zzio zzioVar = f47638b;
        if (zzioVar == null) {
            synchronized (zzio.class) {
                try {
                    zzioVar = f47638b;
                    if (zzioVar == null) {
                        zzioVar = f47640d;
                        f47638b = zzioVar;
                    }
                } finally {
                }
            }
        }
        return zzioVar;
    }

    public static zzio zzc() {
        zzio zzioVar = f47639c;
        if (zzioVar != null) {
            return zzioVar;
        }
        synchronized (zzio.class) {
            try {
                zzio zzioVar2 = f47639c;
                if (zzioVar2 != null) {
                    return zzioVar2;
                }
                zzio m31910a = AbstractC19528dA2.m31910a(zzio.class);
                f47639c = m31910a;
                return m31910a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final <ContainingType extends zzkk> zzjb.zze<ContainingType, ?> zza(ContainingType containingtype, int i) {
        return (zzjb.zze) this.f47641a.get(new C6641a(containingtype, i));
    }

    public zzio(boolean z) {
        this.f47641a = Collections.emptyMap();
    }

    public final void zza(zzjb.zze<?, ?> zzeVar) {
        this.f47641a.put(new C6641a(zzeVar.f47651a, zzeVar.f47654d.f47645b), zzeVar);
    }
}