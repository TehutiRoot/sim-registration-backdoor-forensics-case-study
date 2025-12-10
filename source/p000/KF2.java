package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzmd;
import com.google.android.gms.internal.mlkit_vision_common.zzme;

/* renamed from: KF2 */
/* loaded from: classes3.dex */
public final class KF2 extends zzmd {

    /* renamed from: a */
    public String f3154a;

    /* renamed from: b */
    public boolean f3155b;

    /* renamed from: c */
    public int f3156c;

    /* renamed from: d */
    public byte f3157d;

    /* renamed from: a */
    public final zzmd m67630a(String str) {
        this.f3154a = "vision-common";
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmd
    public final zzmd zza(boolean z) {
        this.f3155b = true;
        this.f3157d = (byte) (1 | this.f3157d);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmd
    public final zzmd zzb(int i) {
        this.f3156c = 1;
        this.f3157d = (byte) (this.f3157d | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmd
    public final zzme zzd() {
        String str;
        if (this.f3157d == 3 && (str = this.f3154a) != null) {
            return new C19669eG2(str, this.f3155b, this.f3156c, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f3154a == null) {
            sb.append(" libraryName");
        }
        if ((this.f3157d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.f3157d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
