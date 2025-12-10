package p000;

import com.google.android.gms.internal.measurement.zzih;

/* renamed from: mx2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21160mx2 implements zzih {

    /* renamed from: a */
    public volatile zzih f72093a;

    /* renamed from: b */
    public volatile boolean f72094b;

    /* renamed from: c */
    public Object f72095c;

    public C21160mx2(zzih zzihVar) {
        zzihVar.getClass();
        this.f72093a = zzihVar;
    }

    public final String toString() {
        Object obj = this.f72093a;
        StringBuilder sb = new StringBuilder();
        sb.append("Suppliers.memoize(");
        if (obj == null) {
            obj = "<supplier that returned " + this.f72095c + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzih
    public final Object zza() {
        if (!this.f72094b) {
            synchronized (this) {
                try {
                    if (!this.f72094b) {
                        zzih zzihVar = this.f72093a;
                        zzihVar.getClass();
                        Object zza = zzihVar.zza();
                        this.f72095c = zza;
                        this.f72094b = true;
                        this.f72093a = null;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.f72095c;
    }
}
