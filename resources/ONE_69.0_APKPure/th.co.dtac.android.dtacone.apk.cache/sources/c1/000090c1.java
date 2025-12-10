package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzxh;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public class zzww {

    /* renamed from: b */
    public static volatile zzww f46113b;

    /* renamed from: c */
    public static final zzww f46114c = new zzww(true);

    /* renamed from: a */
    public final Map f46115a = Collections.emptyMap();

    /* renamed from: com.google.android.gms.internal.firebase_ml.zzww$a */
    /* loaded from: classes3.dex */
    public static final class C6511a {

        /* renamed from: a */
        public final Object f46116a;

        /* renamed from: b */
        public final int f46117b;

        public C6511a(Object obj, int i) {
            this.f46116a = obj;
            this.f46117b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C6511a)) {
                return false;
            }
            C6511a c6511a = (C6511a) obj;
            if (this.f46116a != c6511a.f46116a || this.f46117b != c6511a.f46117b) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f46116a) * 65535) + this.f46117b;
        }
    }

    public zzww(boolean z) {
    }

    public static zzww zzuo() {
        zzww zzwwVar = f46113b;
        if (zzwwVar == null) {
            synchronized (zzww.class) {
                try {
                    zzwwVar = f46113b;
                    if (zzwwVar == null) {
                        zzwwVar = f46114c;
                        f46113b = zzwwVar;
                    }
                } finally {
                }
            }
        }
        return zzwwVar;
    }

    public final <ContainingType extends zzys> zzxh.zze<ContainingType, ?> zza(ContainingType containingtype, int i) {
        return (zzxh.zze) this.f46115a.get(new C6511a(containingtype, i));
    }
}