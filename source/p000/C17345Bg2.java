package p000;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.internal.mlkit_vision_face.zzct;
import com.google.android.gms.internal.mlkit_vision_face.zzcu;

/* renamed from: Bg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17345Bg2 implements zzcu {

    /* renamed from: a */
    public final int f461a;

    /* renamed from: b */
    public final zzct f462b;

    public C17345Bg2(int i, zzct zzctVar) {
        this.f461a = i;
        this.f462b = zzctVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return zzcu.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcu)) {
            return false;
        }
        zzcu zzcuVar = (zzcu) obj;
        if (this.f461a == zzcuVar.zza() && this.f462b.equals(zzcuVar.zzb())) {
            return true;
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f461a ^ 14552422) + (this.f462b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f461a + "intEncoding=" + this.f462b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzcu
    public final int zza() {
        return this.f461a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzcu
    public final zzct zzb() {
        return this.f462b;
    }
}
