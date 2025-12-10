package p000;

import com.google.android.gms.internal.mlkit_common.zzrt;
import com.google.android.gms.internal.mlkit_common.zzsb;

/* renamed from: mJ2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21054mJ2 extends zzsb {

    /* renamed from: a */
    public final String f71877a;

    /* renamed from: b */
    public final boolean f71878b;

    /* renamed from: c */
    public final int f71879c;

    public /* synthetic */ C21054mJ2(String str, boolean z, int i, zzrt zzrtVar) {
        this.f71877a = str;
        this.f71878b = z;
        this.f71879c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzsb) {
            zzsb zzsbVar = (zzsb) obj;
            if (this.f71877a.equals(zzsbVar.zzb()) && this.f71878b == zzsbVar.zzc() && this.f71879c == zzsbVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f71877a.hashCode() ^ 1000003;
        if (true != this.f71878b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (((hashCode * 1000003) ^ i) * 1000003) ^ this.f71879c;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f71877a + ", enableFirelog=" + this.f71878b + ", firelogEventType=" + this.f71879c + "}";
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsb
    public final int zza() {
        return this.f71879c;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsb
    public final String zzb() {
        return this.f71877a;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsb
    public final boolean zzc() {
        return this.f71878b;
    }
}
