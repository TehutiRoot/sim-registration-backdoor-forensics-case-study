package p000;

import com.google.android.gms.internal.vision.zzde;
import com.google.android.gms.internal.vision.zzdf;

/* renamed from: Jj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17898Jj2 implements zzdf {

    /* renamed from: a */
    public volatile zzdf f3086a;

    /* renamed from: b */
    public volatile boolean f3087b;

    /* renamed from: c */
    public Object f3088c;

    public C17898Jj2(zzdf zzdfVar) {
        this.f3086a = (zzdf) zzde.zza(zzdfVar);
    }

    public final String toString() {
        Object obj = this.f3086a;
        if (obj == null) {
            String valueOf = String.valueOf(this.f3088c);
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
        if (!this.f3087b) {
            synchronized (this) {
                try {
                    if (!this.f3087b) {
                        Object zza = this.f3086a.zza();
                        this.f3088c = zza;
                        this.f3087b = true;
                        this.f3086a = null;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.f3088c;
    }
}