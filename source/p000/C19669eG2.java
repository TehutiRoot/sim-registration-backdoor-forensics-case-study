package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzlz;
import com.google.android.gms.internal.mlkit_vision_common.zzme;

/* renamed from: eG2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19669eG2 extends zzme {

    /* renamed from: a */
    public final String f61449a;

    /* renamed from: b */
    public final boolean f61450b;

    /* renamed from: c */
    public final int f61451c;

    public /* synthetic */ C19669eG2(String str, boolean z, int i, zzlz zzlzVar) {
        this.f61449a = str;
        this.f61450b = z;
        this.f61451c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzme) {
            zzme zzmeVar = (zzme) obj;
            if (this.f61449a.equals(zzmeVar.zzb()) && this.f61450b == zzmeVar.zzc() && this.f61451c == zzmeVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f61449a.hashCode() ^ 1000003;
        if (true != this.f61450b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (((hashCode * 1000003) ^ i) * 1000003) ^ this.f61451c;
    }

    public final String toString() {
        String str = this.f61449a;
        boolean z = this.f61450b;
        int i = this.f61451c;
        return "MLKitLoggingOptions{libraryName=" + str + ", enableFirelog=" + z + ", firelogEventType=" + i + "}";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzme
    public final int zza() {
        return this.f61451c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzme
    public final String zzb() {
        return this.f61449a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzme
    public final boolean zzc() {
        return this.f61450b;
    }
}
