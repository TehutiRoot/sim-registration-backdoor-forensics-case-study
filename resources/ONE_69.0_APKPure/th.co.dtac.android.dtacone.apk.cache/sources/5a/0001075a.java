package p000;

import android.content.Context;
import com.google.android.gms.internal.measurement.zzih;

/* renamed from: qu2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21902qu2 extends Ww2 {

    /* renamed from: a */
    public final Context f77346a;

    /* renamed from: b */
    public final zzih f77347b;

    public C21902qu2(Context context, zzih zzihVar) {
        if (context != null) {
            this.f77346a = context;
            this.f77347b = zzihVar;
            return;
        }
        throw new NullPointerException("Null context");
    }

    @Override // p000.Ww2
    /* renamed from: a */
    public final Context mo23562a() {
        return this.f77346a;
    }

    @Override // p000.Ww2
    /* renamed from: b */
    public final zzih mo23561b() {
        return this.f77347b;
    }

    public final boolean equals(Object obj) {
        zzih zzihVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Ww2) {
            Ww2 ww2 = (Ww2) obj;
            if (this.f77346a.equals(ww2.mo23562a()) && ((zzihVar = this.f77347b) != null ? zzihVar.equals(ww2.mo23561b()) : ww2.mo23561b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f77346a.hashCode() ^ 1000003) * 1000003;
        zzih zzihVar = this.f77347b;
        if (zzihVar == null) {
            hashCode = 0;
        } else {
            hashCode = zzihVar.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        String obj = this.f77346a.toString();
        String valueOf = String.valueOf(this.f77347b);
        return "FlagsContext{context=" + obj + ", hermeticFileOverrides=" + valueOf + "}";
    }
}