package p000;

import com.google.android.gms.internal.mlkit_common.zzsa;
import com.google.android.gms.internal.mlkit_common.zzsb;

/* renamed from: lJ2 */
/* loaded from: classes3.dex */
public final class C20882lJ2 extends zzsa {

    /* renamed from: a */
    public String f71589a;

    /* renamed from: b */
    public boolean f71590b;

    /* renamed from: c */
    public int f71591c;

    /* renamed from: d */
    public byte f71592d;

    /* renamed from: a */
    public final zzsa m26527a(String str) {
        this.f71589a = "common";
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsa
    public final zzsa zza(boolean z) {
        this.f71590b = true;
        this.f71592d = (byte) (1 | this.f71592d);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsa
    public final zzsa zzb(int i) {
        this.f71591c = 1;
        this.f71592d = (byte) (this.f71592d | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsa
    public final zzsb zzd() {
        String str;
        if (this.f71592d == 3 && (str = this.f71589a) != null) {
            return new C21054mJ2(str, this.f71590b, this.f71591c, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f71589a == null) {
            sb.append(" libraryName");
        }
        if ((this.f71592d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.f71592d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
