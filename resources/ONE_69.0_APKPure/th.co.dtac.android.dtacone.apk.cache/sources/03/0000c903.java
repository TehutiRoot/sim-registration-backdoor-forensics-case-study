package p000;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.internal.mlkit_vision_barcode.zzff;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfg;

/* renamed from: ho2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20327ho2 implements zzfg {

    /* renamed from: a */
    public final int f62662a;

    /* renamed from: b */
    public final zzff f62663b;

    public C20327ho2(int i, zzff zzffVar) {
        this.f62662a = i;
        this.f62663b = zzffVar;
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
        if (this.f62662a == zzfgVar.zza() && this.f62663b.equals(zzfgVar.zzb())) {
            return true;
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f62662a ^ 14552422) + (this.f62663b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f62662a + "intEncoding=" + this.f62663b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzfg
    public final int zza() {
        return this.f62662a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzfg
    public final zzff zzb() {
        return this.f62663b;
    }
}