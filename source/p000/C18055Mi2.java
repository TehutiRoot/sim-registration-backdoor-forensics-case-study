package p000;

import com.google.android.gms.internal.vision.zzde;
import com.google.android.gms.internal.vision.zzdf;

/* renamed from: Mi2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18055Mi2 implements zzdf {

    /* renamed from: a */
    public volatile zzdf f3856a;

    /* renamed from: b */
    public volatile boolean f3857b;

    /* renamed from: c */
    public Object f3858c;

    public C18055Mi2(zzdf zzdfVar) {
        this.f3856a = (zzdf) zzde.zza(zzdfVar);
    }

    public final String toString() {
        Object obj = this.f3856a;
        if (obj == null) {
            String valueOf = String.valueOf(this.f3858c);
            StringBuilder sb = new StringBuilder(valueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.vision.zzdf
    public final Object zza() {
        if (!this.f3857b) {
            synchronized (this) {
                try {
                    if (!this.f3857b) {
                        Object zza = this.f3856a.zza();
                        this.f3858c = zza;
                        this.f3857b = true;
                        this.f3856a = null;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.f3858c;
    }
}
