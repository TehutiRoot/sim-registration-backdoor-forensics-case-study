package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zztk;
import com.google.android.gms.internal.mlkit_vision_barcode.zztp;

/* renamed from: OK2 */
/* loaded from: classes3.dex */
public final class OK2 extends zztp {

    /* renamed from: a */
    public final String f4434a;

    /* renamed from: b */
    public final boolean f4435b;

    /* renamed from: c */
    public final int f4436c;

    public /* synthetic */ OK2(String str, boolean z, int i, zztk zztkVar) {
        this.f4434a = str;
        this.f4435b = z;
        this.f4436c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zztp) {
            zztp zztpVar = (zztp) obj;
            if (this.f4434a.equals(zztpVar.zzb()) && this.f4435b == zztpVar.zzc() && this.f4436c == zztpVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f4434a.hashCode() ^ 1000003;
        if (true != this.f4435b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (((hashCode * 1000003) ^ i) * 1000003) ^ this.f4436c;
    }

    public final String toString() {
        String str = this.f4434a;
        boolean z = this.f4435b;
        int i = this.f4436c;
        return "MLKitLoggingOptions{libraryName=" + str + ", enableFirelog=" + z + ", firelogEventType=" + i + "}";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zztp
    public final int zza() {
        return this.f4436c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zztp
    public final String zzb() {
        return this.f4434a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zztp
    public final boolean zzc() {
        return this.f4435b;
    }
}