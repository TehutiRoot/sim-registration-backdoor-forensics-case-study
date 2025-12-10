package p000;

import com.google.android.gms.internal.mlkit_vision_text_common.zztt;
import com.google.android.gms.internal.mlkit_vision_text_common.zztu;

/* renamed from: SJ2 */
/* loaded from: classes3.dex */
public final class SJ2 extends zztt {

    /* renamed from: a */
    public String f5585a;

    /* renamed from: b */
    public boolean f5586b;

    /* renamed from: c */
    public int f5587c;

    /* renamed from: d */
    public byte f5588d;

    /* renamed from: a */
    public final zztt m66358a(String str) {
        if (str != null) {
            this.f5585a = str;
            return this;
        }
        throw new NullPointerException("Null libraryName");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztt
    public final zztt zza(boolean z) {
        this.f5586b = true;
        this.f5588d = (byte) (1 | this.f5588d);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztt
    public final zztt zzb(int i) {
        this.f5587c = 1;
        this.f5588d = (byte) (this.f5588d | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztt
    public final zztu zzd() {
        String str;
        if (this.f5588d == 3 && (str = this.f5585a) != null) {
            return new TJ2(str, this.f5586b, this.f5587c, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f5585a == null) {
            sb.append(" libraryName");
        }
        if ((this.f5588d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.f5588d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
