package p000;

import android.content.Context;
import com.google.android.gms.internal.vision.zzdf;

/* renamed from: Md2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18075Md2 extends AbstractC17561Ef2 {

    /* renamed from: a */
    public final Context f3931a;

    /* renamed from: b */
    public final zzdf f3932b;

    public C18075Md2(Context context, zzdf zzdfVar) {
        if (context != null) {
            this.f3931a = context;
            this.f3932b = zzdfVar;
            return;
        }
        throw new NullPointerException("Null context");
    }

    @Override // p000.AbstractC17561Ef2
    /* renamed from: a */
    public final Context mo67360a() {
        return this.f3931a;
    }

    @Override // p000.AbstractC17561Ef2
    /* renamed from: b */
    public final zzdf mo67359b() {
        return this.f3932b;
    }

    public final boolean equals(Object obj) {
        zzdf zzdfVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17561Ef2) {
            AbstractC17561Ef2 abstractC17561Ef2 = (AbstractC17561Ef2) obj;
            if (this.f3931a.equals(abstractC17561Ef2.mo67360a()) && ((zzdfVar = this.f3932b) != null ? zzdfVar.equals(abstractC17561Ef2.mo67359b()) : abstractC17561Ef2.mo67359b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f3931a.hashCode() ^ 1000003) * 1000003;
        zzdf zzdfVar = this.f3932b;
        if (zzdfVar == null) {
            hashCode = 0;
        } else {
            hashCode = zzdfVar.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f3931a);
        String valueOf2 = String.valueOf(this.f3932b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 46 + valueOf2.length());
        sb.append("FlagsContext{context=");
        sb.append(valueOf);
        sb.append(", hermeticFileOverrides=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}