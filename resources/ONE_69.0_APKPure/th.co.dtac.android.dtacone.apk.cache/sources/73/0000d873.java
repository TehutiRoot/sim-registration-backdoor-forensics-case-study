package p000;

import com.google.android.gms.internal.measurement.zzih;

/* renamed from: jy2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20703jy2 implements zzih {

    /* renamed from: a */
    public volatile zzih f67841a;

    /* renamed from: b */
    public volatile boolean f67842b;

    /* renamed from: c */
    public Object f67843c;

    public C20703jy2(zzih zzihVar) {
        zzihVar.getClass();
        this.f67841a = zzihVar;
    }

    public final String toString() {
        Object obj = this.f67841a;
        StringBuilder sb = new StringBuilder();
        sb.append("Suppliers.memoize(");
        if (obj == null) {
            obj = "<supplier that returned " + this.f67843c + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzih
    public final Object zza() {
        if (!this.f67842b) {
            synchronized (this) {
                try {
                    if (!this.f67842b) {
                        zzih zzihVar = this.f67841a;
                        zzihVar.getClass();
                        Object zza = zzihVar.zza();
                        this.f67843c = zza;
                        this.f67842b = true;
                        this.f67841a = null;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.f67843c;
    }
}