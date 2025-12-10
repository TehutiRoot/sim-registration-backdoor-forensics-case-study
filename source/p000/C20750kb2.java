package p000;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.internal.mlkit_vision_common.zzah;
import com.google.android.gms.internal.mlkit_vision_common.zzai;

/* renamed from: kb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20750kb2 implements zzai {

    /* renamed from: a */
    public final int f67948a;

    /* renamed from: b */
    public final zzah f67949b;

    public C20750kb2(int i, zzah zzahVar) {
        this.f67948a = i;
        this.f67949b = zzahVar;
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
        if (this.f67948a == zzaiVar.zza() && this.f67949b.equals(zzaiVar.zzb())) {
            return true;
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f67948a ^ 14552422) + (this.f67949b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f67948a + "intEncoding=" + this.f67949b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzai
    public final int zza() {
        return this.f67948a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzai
    public final zzah zzb() {
        return this.f67949b;
    }
}
