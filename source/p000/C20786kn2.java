package p000;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.internal.mlkit_vision_barcode.zzff;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfg;

/* renamed from: kn2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20786kn2 implements zzfg {

    /* renamed from: a */
    public final int f68034a;

    /* renamed from: b */
    public final zzff f68035b;

    public C20786kn2(int i, zzff zzffVar) {
        this.f68034a = i;
        this.f68035b = zzffVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return zzfg.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfg)) {
            return false;
        }
        zzfg zzfgVar = (zzfg) obj;
        if (this.f68034a == zzfgVar.zza() && this.f68035b.equals(zzfgVar.zzb())) {
            return true;
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f68034a ^ 14552422) + (this.f68035b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f68034a + "intEncoding=" + this.f68035b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzfg
    public final int zza() {
        return this.f68034a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzfg
    public final zzff zzb() {
        return this.f68035b;
    }
}
