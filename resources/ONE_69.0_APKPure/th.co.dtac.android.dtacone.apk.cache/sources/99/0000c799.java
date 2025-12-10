package p000;

import com.google.android.gms.internal.mlkit_vision_face.zznp;
import com.google.android.gms.internal.mlkit_vision_face.zznt;

/* renamed from: gJ2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20074gJ2 extends zznt {

    /* renamed from: a */
    public final String f62147a;

    /* renamed from: b */
    public final boolean f62148b;

    /* renamed from: c */
    public final int f62149c;

    public /* synthetic */ C20074gJ2(String str, boolean z, int i, zznp zznpVar) {
        this.f62147a = str;
        this.f62148b = z;
        this.f62149c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zznt) {
            zznt zzntVar = (zznt) obj;
            if (this.f62147a.equals(zzntVar.zzb()) && this.f62148b == zzntVar.zzc() && this.f62149c == zzntVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f62147a.hashCode() ^ 1000003) * 1000003;
        if (true != this.f62148b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((hashCode ^ i) * 1000003) ^ this.f62149c;
    }

    public final String toString() {
        String str = this.f62147a;
        boolean z = this.f62148b;
        int i = this.f62149c;
        return "MLKitLoggingOptions{libraryName=" + str + ", enableFirelog=" + z + ", firelogEventType=" + i + "}";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznt
    public final int zza() {
        return this.f62149c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznt
    public final String zzb() {
        return this.f62147a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznt
    public final boolean zzc() {
        return this.f62148b;
    }
}