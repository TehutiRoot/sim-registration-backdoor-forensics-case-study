package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zztk;
import com.google.android.gms.internal.mlkit_vision_barcode.zztp;

/* renamed from: RJ2 */
/* loaded from: classes3.dex */
public final class RJ2 extends zztp {

    /* renamed from: a */
    public final String f5322a;

    /* renamed from: b */
    public final boolean f5323b;

    /* renamed from: c */
    public final int f5324c;

    public /* synthetic */ RJ2(String str, boolean z, int i, zztk zztkVar) {
        this.f5322a = str;
        this.f5323b = z;
        this.f5324c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zztp) {
            zztp zztpVar = (zztp) obj;
            if (this.f5322a.equals(zztpVar.zzb()) && this.f5323b == zztpVar.zzc() && this.f5324c == zztpVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f5322a.hashCode() ^ 1000003;
        if (true != this.f5323b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (((hashCode * 1000003) ^ i) * 1000003) ^ this.f5324c;
    }

    public final String toString() {
        String str = this.f5322a;
        boolean z = this.f5323b;
        int i = this.f5324c;
        return "MLKitLoggingOptions{libraryName=" + str + ", enableFirelog=" + z + ", firelogEventType=" + i + "}";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zztp
    public final int zza() {
        return this.f5324c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zztp
    public final String zzb() {
        return this.f5322a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zztp
    public final boolean zzc() {
        return this.f5323b;
    }
}
