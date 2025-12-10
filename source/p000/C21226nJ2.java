package p000;

import com.google.android.gms.internal.mlkit_common.zzmu;
import com.google.android.gms.internal.mlkit_common.zzna;
import com.google.android.gms.internal.mlkit_common.zzsi;
import com.google.android.gms.internal.mlkit_common.zzsj;
import com.google.mlkit.common.sdkinternal.ModelType;

/* renamed from: nJ2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21226nJ2 extends zzsi {

    /* renamed from: a */
    public zzmu f72196a;

    /* renamed from: b */
    public String f72197b;

    /* renamed from: c */
    public boolean f72198c;

    /* renamed from: d */
    public boolean f72199d;

    /* renamed from: e */
    public ModelType f72200e;

    /* renamed from: f */
    public zzna f72201f;

    /* renamed from: g */
    public int f72202g;

    /* renamed from: h */
    public byte f72203h;

    /* renamed from: a */
    public final zzsi m26137a(String str) {
        this.f72197b = "NA";
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final zzsi zza(zzna zznaVar) {
        if (zznaVar != null) {
            this.f72201f = zznaVar;
            return this;
        }
        throw new NullPointerException("Null downloadStatus");
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final zzsi zzb(zzmu zzmuVar) {
        if (zzmuVar != null) {
            this.f72196a = zzmuVar;
            return this;
        }
        throw new NullPointerException("Null errorCode");
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final zzsi zzc(int i) {
        this.f72202g = i;
        this.f72203h = (byte) (this.f72203h | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final zzsi zzd(ModelType modelType) {
        if (modelType != null) {
            this.f72200e = modelType;
            return this;
        }
        throw new NullPointerException("Null modelType");
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final zzsi zze(boolean z) {
        this.f72199d = z;
        this.f72203h = (byte) (this.f72203h | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final zzsi zzf(boolean z) {
        this.f72198c = z;
        this.f72203h = (byte) (this.f72203h | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final zzsj zzh() {
        zzmu zzmuVar;
        String str;
        ModelType modelType;
        zzna zznaVar;
        if (this.f72203h == 7 && (zzmuVar = this.f72196a) != null && (str = this.f72197b) != null && (modelType = this.f72200e) != null && (zznaVar = this.f72201f) != null) {
            return new C21398oJ2(zzmuVar, str, this.f72198c, this.f72199d, modelType, zznaVar, this.f72202g, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f72196a == null) {
            sb.append(" errorCode");
        }
        if (this.f72197b == null) {
            sb.append(" tfliteSchemaVersion");
        }
        if ((this.f72203h & 1) == 0) {
            sb.append(" shouldLogRoughDownloadTime");
        }
        if ((this.f72203h & 2) == 0) {
            sb.append(" shouldLogExactDownloadTime");
        }
        if (this.f72200e == null) {
            sb.append(" modelType");
        }
        if (this.f72201f == null) {
            sb.append(" downloadStatus");
        }
        if ((this.f72203h & 4) == 0) {
            sb.append(" failureStatusCode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
