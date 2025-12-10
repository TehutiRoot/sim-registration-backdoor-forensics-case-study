package p000;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.internal.mlkit_common.zzbb;
import com.google.android.gms.internal.mlkit_common.zzbc;

/* renamed from: Xd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18790Xd2 implements zzbc {

    /* renamed from: a */
    public final int f7599a;

    /* renamed from: b */
    public final zzbb f7600b;

    public C18790Xd2(int i, zzbb zzbbVar) {
        this.f7599a = i;
        this.f7600b = zzbbVar;
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
        if (this.f7599a == zzbcVar.zza() && this.f7600b.equals(zzbcVar.zzb())) {
            return true;
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f7599a ^ 14552422) + (this.f7600b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f7599a + "intEncoding=" + this.f7600b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbc
    public final int zza() {
        return this.f7599a;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbc
    public final zzbb zzb() {
        return this.f7600b;
    }
}