package p000;

import com.google.android.gms.internal.mlkit_common.zzmu;
import com.google.android.gms.internal.mlkit_common.zzna;
import com.google.android.gms.internal.mlkit_common.zzrw;
import com.google.android.gms.internal.mlkit_common.zzsj;
import com.google.mlkit.common.sdkinternal.ModelType;

/* renamed from: oJ2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21398oJ2 extends zzsj {

    /* renamed from: a */
    public final zzmu f72669a;

    /* renamed from: b */
    public final String f72670b;

    /* renamed from: c */
    public final boolean f72671c;

    /* renamed from: d */
    public final boolean f72672d;

    /* renamed from: e */
    public final ModelType f72673e;

    /* renamed from: f */
    public final zzna f72674f;

    /* renamed from: g */
    public final int f72675g;

    public /* synthetic */ C21398oJ2(zzmu zzmuVar, String str, boolean z, boolean z2, ModelType modelType, zzna zznaVar, int i, zzrw zzrwVar) {
        this.f72669a = zzmuVar;
        this.f72670b = str;
        this.f72671c = z;
        this.f72672d = z2;
        this.f72673e = modelType;
        this.f72674f = zznaVar;
        this.f72675g = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzsj) {
            zzsj zzsjVar = (zzsj) obj;
            if (this.f72669a.equals(zzsjVar.zzc()) && this.f72670b.equals(zzsjVar.zze()) && this.f72671c == zzsjVar.zzg() && this.f72672d == zzsjVar.zzf() && this.f72673e.equals(zzsjVar.zzb()) && this.f72674f.equals(zzsjVar.zzd()) && this.f72675g == zzsjVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((this.f72669a.hashCode() ^ 1000003) * 1000003) ^ this.f72670b.hashCode();
        int i2 = 1231;
        if (true != this.f72671c) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i3 = ((hashCode * 1000003) ^ i) * 1000003;
        if (true != this.f72672d) {
            i2 = 1237;
        }
        return ((((((i3 ^ i2) * 1000003) ^ this.f72673e.hashCode()) * 1000003) ^ this.f72674f.hashCode()) * 1000003) ^ this.f72675g;
    }

    public final String toString() {
        zzna zznaVar = this.f72674f;
        ModelType modelType = this.f72673e;
        String obj = this.f72669a.toString();
        String obj2 = modelType.toString();
        String obj3 = zznaVar.toString();
        return "RemoteModelLoggingOptions{errorCode=" + obj + ", tfliteSchemaVersion=" + this.f72670b + ", shouldLogRoughDownloadTime=" + this.f72671c + ", shouldLogExactDownloadTime=" + this.f72672d + ", modelType=" + obj2 + ", downloadStatus=" + obj3 + ", failureStatusCode=" + this.f72675g + "}";
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final int zza() {
        return this.f72675g;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final ModelType zzb() {
        return this.f72673e;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final zzmu zzc() {
        return this.f72669a;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final zzna zzd() {
        return this.f72674f;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final String zze() {
        return this.f72670b;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final boolean zzf() {
        return this.f72672d;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final boolean zzg() {
        return this.f72671c;
    }
}
