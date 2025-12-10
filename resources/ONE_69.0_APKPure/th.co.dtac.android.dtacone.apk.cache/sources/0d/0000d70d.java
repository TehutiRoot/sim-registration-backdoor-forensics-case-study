package p000;

import com.google.android.gms.internal.mlkit_common.zzrt;
import com.google.android.gms.internal.mlkit_common.zzsb;

/* renamed from: jK2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20596jK2 extends zzsb {

    /* renamed from: a */
    public final String f67290a;

    /* renamed from: b */
    public final boolean f67291b;

    /* renamed from: c */
    public final int f67292c;

    public /* synthetic */ C20596jK2(String str, boolean z, int i, zzrt zzrtVar) {
        this.f67290a = str;
        this.f67291b = z;
        this.f67292c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzsb) {
            zzsb zzsbVar = (zzsb) obj;
            if (this.f67290a.equals(zzsbVar.zzb()) && this.f67291b == zzsbVar.zzc() && this.f67292c == zzsbVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f67290a.hashCode() ^ 1000003;
        if (true != this.f67291b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (((hashCode * 1000003) ^ i) * 1000003) ^ this.f67292c;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f67290a + ", enableFirelog=" + this.f67291b + ", firelogEventType=" + this.f67292c + "}";
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsb
    public final int zza() {
        return this.f67292c;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsb
    public final String zzb() {
        return this.f67290a;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsb
    public final boolean zzc() {
        return this.f67291b;
    }
}