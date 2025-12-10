package p000;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.internal.mlkit_vision_face.zzct;
import com.google.android.gms.internal.mlkit_vision_face.zzcu;

/* renamed from: yh2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23247yh2 implements zzcu {

    /* renamed from: a */
    public final int f109113a;

    /* renamed from: b */
    public final zzct f109114b;

    public C23247yh2(int i, zzct zzctVar) {
        this.f109113a = i;
        this.f109114b = zzctVar;
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
        if (this.f109113a == zzcuVar.zza() && this.f109114b.equals(zzcuVar.zzb())) {
            return true;
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f109113a ^ 14552422) + (this.f109114b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f109113a + "intEncoding=" + this.f109114b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzcu
    public final int zza() {
        return this.f109113a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzcu
    public final zzct zzb() {
        return this.f109114b;
    }
}