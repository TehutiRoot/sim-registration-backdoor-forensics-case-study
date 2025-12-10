package p000;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.internal.mlkit_vision_text_common.zzcw;
import com.google.android.gms.internal.mlkit_vision_text_common.zzcx;

/* renamed from: Jh2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17892Jh2 implements zzcx {

    /* renamed from: a */
    public final int f3077a;

    /* renamed from: b */
    public final zzcw f3078b;

    public C17892Jh2(int i, zzcw zzcwVar) {
        this.f3077a = i;
        this.f3078b = zzcwVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return zzcx.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcx)) {
            return false;
        }
        zzcx zzcxVar = (zzcx) obj;
        if (this.f3077a == zzcxVar.zza() && this.f3078b.equals(zzcxVar.zzb())) {
            return true;
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f3077a ^ 14552422) + (this.f3078b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f3077a + "intEncoding=" + this.f3078b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzcx
    public final int zza() {
        return this.f3077a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzcx
    public final zzcw zzb() {
        return this.f3078b;
    }
}