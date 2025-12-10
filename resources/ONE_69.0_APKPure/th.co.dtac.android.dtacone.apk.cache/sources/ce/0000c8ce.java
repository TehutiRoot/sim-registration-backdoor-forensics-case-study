package p000;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.internal.mlkit_vision_common.zzah;
import com.google.android.gms.internal.mlkit_vision_common.zzai;

/* renamed from: hc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20291hc2 implements zzai {

    /* renamed from: a */
    public final int f62522a;

    /* renamed from: b */
    public final zzah f62523b;

    public C20291hc2(int i, zzah zzahVar) {
        this.f62522a = i;
        this.f62523b = zzahVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return zzai.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzai)) {
            return false;
        }
        zzai zzaiVar = (zzai) obj;
        if (this.f62522a == zzaiVar.zza() && this.f62523b.equals(zzaiVar.zzb())) {
            return true;
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f62522a ^ 14552422) + (this.f62523b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f62522a + "intEncoding=" + this.f62523b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzai
    public final int zza() {
        return this.f62522a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzai
    public final zzah zzb() {
        return this.f62523b;
    }
}