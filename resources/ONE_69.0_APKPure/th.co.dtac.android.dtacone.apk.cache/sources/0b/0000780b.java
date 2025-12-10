package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzlz;
import com.google.android.gms.internal.mlkit_vision_common.zzme;

/* renamed from: bH2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19203bH2 extends zzme {

    /* renamed from: a */
    public final String f39055a;

    /* renamed from: b */
    public final boolean f39056b;

    /* renamed from: c */
    public final int f39057c;

    public /* synthetic */ C19203bH2(String str, boolean z, int i, zzlz zzlzVar) {
        this.f39055a = str;
        this.f39056b = z;
        this.f39057c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzme) {
            zzme zzmeVar = (zzme) obj;
            if (this.f39055a.equals(zzmeVar.zzb()) && this.f39056b == zzmeVar.zzc() && this.f39057c == zzmeVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f39055a.hashCode() ^ 1000003;
        if (true != this.f39056b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (((hashCode * 1000003) ^ i) * 1000003) ^ this.f39057c;
    }

    public final String toString() {
        String str = this.f39055a;
        boolean z = this.f39056b;
        int i = this.f39057c;
        return "MLKitLoggingOptions{libraryName=" + str + ", enableFirelog=" + z + ", firelogEventType=" + i + "}";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzme
    public final int zza() {
        return this.f39057c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzme
    public final String zzb() {
        return this.f39055a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzme
    public final boolean zzc() {
        return this.f39056b;
    }
}