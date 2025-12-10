package p000;

import android.content.Context;
import com.google.android.gms.internal.vision.zzdf;

/* renamed from: Pc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18229Pc2 extends AbstractC17723He2 {

    /* renamed from: a */
    public final Context f4784a;

    /* renamed from: b */
    public final zzdf f4785b;

    public C18229Pc2(Context context, zzdf zzdfVar) {
        if (context != null) {
            this.f4784a = context;
            this.f4785b = zzdfVar;
            return;
        }
        throw new NullPointerException("Null context");
    }

    @Override // p000.AbstractC17723He2
    /* renamed from: a */
    public final Context mo66785a() {
        return this.f4784a;
    }

    @Override // p000.AbstractC17723He2
    /* renamed from: b */
    public final zzdf mo66784b() {
        return this.f4785b;
    }

    public final boolean equals(Object obj) {
        zzdf zzdfVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17723He2) {
            AbstractC17723He2 abstractC17723He2 = (AbstractC17723He2) obj;
            if (this.f4784a.equals(abstractC17723He2.mo66785a()) && ((zzdfVar = this.f4785b) != null ? zzdfVar.equals(abstractC17723He2.mo66784b()) : abstractC17723He2.mo66784b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f4784a.hashCode() ^ 1000003) * 1000003;
        zzdf zzdfVar = this.f4785b;
        if (zzdfVar == null) {
            hashCode = 0;
        } else {
            hashCode = zzdfVar.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4784a);
        String valueOf2 = String.valueOf(this.f4785b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 46 + valueOf2.length());
        sb.append("FlagsContext{context=");
        sb.append(valueOf);
        sb.append(", hermeticFileOverrides=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
