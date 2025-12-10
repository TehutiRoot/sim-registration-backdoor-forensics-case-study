package p000;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.internal.mlkit_common.zzbb;
import com.google.android.gms.internal.mlkit_common.zzbc;

/* renamed from: ad2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19031ad2 implements zzbc {

    /* renamed from: a */
    public final int f8375a;

    /* renamed from: b */
    public final zzbb f8376b;

    public C19031ad2(int i, zzbb zzbbVar) {
        this.f8375a = i;
        this.f8376b = zzbbVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return zzbc.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbc)) {
            return false;
        }
        zzbc zzbcVar = (zzbc) obj;
        if (this.f8375a == zzbcVar.zza() && this.f8376b.equals(zzbcVar.zzb())) {
            return true;
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f8375a ^ 14552422) + (this.f8376b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f8375a + "intEncoding=" + this.f8376b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbc
    public final int zza() {
        return this.f8375a;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbc
    public final zzbb zzb() {
        return this.f8376b;
    }
}
