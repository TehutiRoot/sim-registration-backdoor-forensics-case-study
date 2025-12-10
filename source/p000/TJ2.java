package p000;

import com.google.android.gms.internal.mlkit_vision_text_common.zztp;
import com.google.android.gms.internal.mlkit_vision_text_common.zztu;

/* renamed from: TJ2 */
/* loaded from: classes3.dex */
public final class TJ2 extends zztu {

    /* renamed from: a */
    public final String f5988a;

    /* renamed from: b */
    public final boolean f5989b;

    /* renamed from: c */
    public final int f5990c;

    public /* synthetic */ TJ2(String str, boolean z, int i, zztp zztpVar) {
        this.f5988a = str;
        this.f5989b = z;
        this.f5990c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zztu) {
            zztu zztuVar = (zztu) obj;
            if (this.f5988a.equals(zztuVar.zzb()) && this.f5989b == zztuVar.zzc() && this.f5990c == zztuVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f5988a.hashCode() ^ 1000003;
        if (true != this.f5989b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (((hashCode * 1000003) ^ i) * 1000003) ^ this.f5990c;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f5988a + ", enableFirelog=" + this.f5989b + ", firelogEventType=" + this.f5990c + "}";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztu
    public final int zza() {
        return this.f5990c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztu
    public final String zzb() {
        return this.f5988a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztu
    public final boolean zzc() {
        return this.f5989b;
    }
}
