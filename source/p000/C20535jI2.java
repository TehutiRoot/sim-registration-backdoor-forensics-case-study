package p000;

import com.google.android.gms.internal.mlkit_vision_face.zznp;
import com.google.android.gms.internal.mlkit_vision_face.zznt;

/* renamed from: jI2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20535jI2 extends zznt {

    /* renamed from: a */
    public final String f67242a;

    /* renamed from: b */
    public final boolean f67243b;

    /* renamed from: c */
    public final int f67244c;

    public /* synthetic */ C20535jI2(String str, boolean z, int i, zznp zznpVar) {
        this.f67242a = str;
        this.f67243b = z;
        this.f67244c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zznt) {
            zznt zzntVar = (zznt) obj;
            if (this.f67242a.equals(zzntVar.zzb()) && this.f67243b == zzntVar.zzc() && this.f67244c == zzntVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f67242a.hashCode() ^ 1000003) * 1000003;
        if (true != this.f67243b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((hashCode ^ i) * 1000003) ^ this.f67244c;
    }

    public final String toString() {
        String str = this.f67242a;
        boolean z = this.f67243b;
        int i = this.f67244c;
        return "MLKitLoggingOptions{libraryName=" + str + ", enableFirelog=" + z + ", firelogEventType=" + i + "}";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznt
    public final int zza() {
        return this.f67244c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznt
    public final String zzb() {
        return this.f67242a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznt
    public final boolean zzc() {
        return this.f67243b;
    }
}
