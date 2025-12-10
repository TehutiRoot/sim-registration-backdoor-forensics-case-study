package p000;

import android.content.Context;
import com.google.android.gms.internal.measurement.zzih;

/* renamed from: tt2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22352tt2 extends Zv2 {

    /* renamed from: a */
    public final Context f107231a;

    /* renamed from: b */
    public final zzih f107232b;

    public C22352tt2(Context context, zzih zzihVar) {
        if (context != null) {
            this.f107231a = context;
            this.f107232b = zzihVar;
            return;
        }
        throw new NullPointerException("Null context");
    }

    @Override // p000.Zv2
    /* renamed from: a */
    public final Context mo1356a() {
        return this.f107231a;
    }

    @Override // p000.Zv2
    /* renamed from: b */
    public final zzih mo1355b() {
        return this.f107232b;
    }

    public final boolean equals(Object obj) {
        zzih zzihVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Zv2) {
            Zv2 zv2 = (Zv2) obj;
            if (this.f107231a.equals(zv2.mo1356a()) && ((zzihVar = this.f107232b) != null ? zzihVar.equals(zv2.mo1355b()) : zv2.mo1355b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f107231a.hashCode() ^ 1000003) * 1000003;
        zzih zzihVar = this.f107232b;
        if (zzihVar == null) {
            hashCode = 0;
        } else {
            hashCode = zzihVar.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        String obj = this.f107231a.toString();
        String valueOf = String.valueOf(this.f107232b);
        return "FlagsContext{context=" + obj + ", hermeticFileOverrides=" + valueOf + "}";
    }
}
