package p000;

import com.google.android.gms.internal.mlkit_common.zzmu;
import com.google.android.gms.internal.mlkit_common.zzna;
import com.google.android.gms.internal.mlkit_common.zzsi;
import com.google.android.gms.internal.mlkit_common.zzsj;
import com.google.mlkit.common.sdkinternal.ModelType;

/* renamed from: kK2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20769kK2 extends zzsi {

    /* renamed from: a */
    public zzmu f67947a;

    /* renamed from: b */
    public String f67948b;

    /* renamed from: c */
    public boolean f67949c;

    /* renamed from: d */
    public boolean f67950d;

    /* renamed from: e */
    public ModelType f67951e;

    /* renamed from: f */
    public zzna f67952f;

    /* renamed from: g */
    public int f67953g;

    /* renamed from: h */
    public byte f67954h;

    /* renamed from: a */
    public final zzsi m29223a(String str) {
        this.f67948b = "NA";
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final zzsi zza(zzna zznaVar) {
        if (zznaVar != null) {
            this.f67952f = zznaVar;
            return this;
        }
        throw new NullPointerException("Null downloadStatus");
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final zzsi zzb(zzmu zzmuVar) {
        if (zzmuVar != null) {
            this.f67947a = zzmuVar;
            return this;
        }
        throw new NullPointerException("Null errorCode");
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final zzsi zzc(int i) {
        this.f67953g = i;
        this.f67954h = (byte) (this.f67954h | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final zzsi zzd(ModelType modelType) {
        if (modelType != null) {
            this.f67951e = modelType;
            return this;
        }
        throw new NullPointerException("Null modelType");
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final zzsi zze(boolean z) {
        this.f67950d = z;
        this.f67954h = (byte) (this.f67954h | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final zzsi zzf(boolean z) {
        this.f67949c = z;
        this.f67954h = (byte) (this.f67954h | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final zzsj zzh() {
        zzmu zzmuVar;
        String str;
        ModelType modelType;
        zzna zznaVar;
        if (this.f67954h == 7 && (zzmuVar = this.f67947a) != null && (str = this.f67948b) != null && (modelType = this.f67951e) != null && (zznaVar = this.f67952f) != null) {
            return new C20942lK2(zzmuVar, str, this.f67949c, this.f67950d, modelType, zznaVar, this.f67953g, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f67947a == null) {
            sb.append(" errorCode");
        }
        if (this.f67948b == null) {
            sb.append(" tfliteSchemaVersion");
        }
        if ((this.f67954h & 1) == 0) {
            sb.append(" shouldLogRoughDownloadTime");
        }
        if ((this.f67954h & 2) == 0) {
            sb.append(" shouldLogExactDownloadTime");
        }
        if (this.f67951e == null) {
            sb.append(" modelType");
        }
        if (this.f67952f == null) {
            sb.append(" downloadStatus");
        }
        if ((this.f67954h & 4) == 0) {
            sb.append(" failureStatusCode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}