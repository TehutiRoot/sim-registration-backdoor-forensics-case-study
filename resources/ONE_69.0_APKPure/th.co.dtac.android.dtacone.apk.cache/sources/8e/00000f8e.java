package p000;

import com.google.android.gms.internal.mlkit_vision_text_common.zztp;
import com.google.android.gms.internal.mlkit_vision_text_common.zztu;

/* renamed from: QK2 */
/* loaded from: classes3.dex */
public final class QK2 extends zztu {

    /* renamed from: a */
    public final String f5204a;

    /* renamed from: b */
    public final boolean f5205b;

    /* renamed from: c */
    public final int f5206c;

    public /* synthetic */ QK2(String str, boolean z, int i, zztp zztpVar) {
        this.f5204a = str;
        this.f5205b = z;
        this.f5206c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zztu) {
            zztu zztuVar = (zztu) obj;
            if (this.f5204a.equals(zztuVar.zzb()) && this.f5205b == zztuVar.zzc() && this.f5206c == zztuVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f5204a.hashCode() ^ 1000003;
        if (true != this.f5205b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (((hashCode * 1000003) ^ i) * 1000003) ^ this.f5206c;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f5204a + ", enableFirelog=" + this.f5205b + ", firelogEventType=" + this.f5206c + "}";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztu
    public final int zza() {
        return this.f5206c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztu
    public final String zzb() {
        return this.f5204a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztu
    public final boolean zzc() {
        return this.f5205b;
    }
}