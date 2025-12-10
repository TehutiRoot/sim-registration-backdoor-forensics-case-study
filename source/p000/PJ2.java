package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzto;
import com.google.android.gms.internal.mlkit_vision_barcode.zztp;

/* renamed from: PJ2 */
/* loaded from: classes3.dex */
public final class PJ2 extends zzto {

    /* renamed from: a */
    public String f4716a;

    /* renamed from: b */
    public boolean f4717b;

    /* renamed from: c */
    public int f4718c;

    /* renamed from: d */
    public byte f4719d;

    /* renamed from: a */
    public final zzto m66860a(String str) {
        this.f4716a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzto
    public final zzto zza(boolean z) {
        this.f4717b = true;
        this.f4719d = (byte) (1 | this.f4719d);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzto
    public final zzto zzb(int i) {
        this.f4718c = 1;
        this.f4719d = (byte) (this.f4719d | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzto
    public final zztp zzd() {
        String str;
        if (this.f4719d == 3 && (str = this.f4716a) != null) {
            return new RJ2(str, this.f4717b, this.f4718c, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f4716a == null) {
            sb.append(" libraryName");
        }
        if ((this.f4719d & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.f4719d & 2) == 0) {
            sb.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
