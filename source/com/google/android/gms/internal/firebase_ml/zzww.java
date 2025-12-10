package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzxh;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public class zzww {

    /* renamed from: b */
    public static volatile zzww f46101b;

    /* renamed from: c */
    public static final zzww f46102c = new zzww(true);

    /* renamed from: a */
    public final Map f46103a = Collections.emptyMap();

    /* renamed from: com.google.android.gms.internal.firebase_ml.zzww$a */
    /* loaded from: classes3.dex */
    public static final class C6522a {

        /* renamed from: a */
        public final Object f46104a;

        /* renamed from: b */
        public final int f46105b;

        public C6522a(Object obj, int i) {
            this.f46104a = obj;
            this.f46105b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C6522a)) {
                return false;
            }
            C6522a c6522a = (C6522a) obj;
            if (this.f46104a != c6522a.f46104a || this.f46105b != c6522a.f46105b) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f46104a) * 65535) + this.f46105b;
        }
    }

    public zzww(boolean z) {
    }

    public static zzww zzuo() {
        zzww zzwwVar = f46101b;
        if (zzwwVar == null) {
            synchronized (zzww.class) {
                try {
                    zzwwVar = f46101b;
                    if (zzwwVar == null) {
                        zzwwVar = f46102c;
                        f46101b = zzwwVar;
                    }
                } finally {
                }
            }
        }
        return zzwwVar;
    }

    public final <ContainingType extends zzys> zzxh.zze<ContainingType, ?> zza(ContainingType containingtype, int i) {
        return (zzxh.zze) this.f46103a.get(new C6522a(containingtype, i));
    }
}
