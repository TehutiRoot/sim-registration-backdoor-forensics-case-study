package p000;

import com.google.android.gms.internal.mlkit_vision_face.zzns;
import com.google.android.gms.internal.mlkit_vision_face.zznt;

/* renamed from: iI2 */
/* loaded from: classes3.dex */
public final class C20363iI2 extends zzns {

    /* renamed from: a */
    public String f62770a;

    /* renamed from: b */
    public boolean f62771b;

    /* renamed from: c */
    public int f62772c;

    /* renamed from: d */
    public byte f62773d;

    /* renamed from: a */
    public final zzns m30652a(String str) {
        this.f62770a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzns
    public final zzns zza(boolean z) {
        this.f62771b = true;
        this.f62773d = (byte) (1 | this.f62773d);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzns
    public final zzns zzb(int i) {
        this.f62772c = 1;
        this.f62773d = (byte) (this.f62773d | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzns
    public final zznt zzd() {
        String str;
        if (this.f62773d == 3 && (str = this.f62770a) != null) {
            return new C20535jI2(str, this.f62771b, this.f62772c, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f62770a == null) {
            sb.append(" libraryName");
        }
        if ((this.f62773d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.f62773d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
