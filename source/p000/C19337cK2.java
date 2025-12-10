package p000;

import androidx.compose.material3.TooltipKt;
import com.google.android.gms.internal.mlkit_vision_barcode.zzut;
import com.google.android.gms.internal.mlkit_vision_barcode.zzuu;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;

/* renamed from: cK2 */
/* loaded from: classes3.dex */
public final class C19337cK2 extends zzut {

    /* renamed from: a */
    public int f39403a;

    /* renamed from: b */
    public int f39404b;

    /* renamed from: c */
    public float f39405c;

    /* renamed from: d */
    public float f39406d;

    /* renamed from: e */
    public boolean f39407e;

    /* renamed from: f */
    public float f39408f;

    /* renamed from: g */
    public float f39409g;

    /* renamed from: h */
    public long f39410h;

    /* renamed from: i */
    public long f39411i;

    /* renamed from: j */
    public boolean f39412j;

    /* renamed from: k */
    public float f39413k;

    /* renamed from: l */
    public float f39414l;

    /* renamed from: m */
    public short f39415m;

    /* renamed from: a */
    public final zzut m51690a(int i) {
        this.f39403a = 10;
        this.f39415m = (short) (this.f39415m | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzut
    public final zzut zza(boolean z) {
        this.f39412j = true;
        this.f39415m = (short) (this.f39415m | OS2WindowsMetricsTable.FSTYPE_BITMAP_ONLY);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzut
    public final zzut zzb(float f) {
        this.f39409g = 0.8f;
        this.f39415m = (short) (this.f39415m | 64);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzut
    public final zzut zzc(float f) {
        this.f39408f = 0.5f;
        this.f39415m = (short) (this.f39415m | 32);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzut
    public final zzut zzd(float f) {
        this.f39406d = 0.8f;
        this.f39415m = (short) (this.f39415m | 8);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzut
    public final zzut zze(int i) {
        this.f39404b = 5;
        this.f39415m = (short) (this.f39415m | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzut
    public final zzut zzf(float f) {
        this.f39405c = 0.25f;
        this.f39415m = (short) (this.f39415m | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzut
    public final zzut zzh(long j) {
        this.f39411i = 3000L;
        this.f39415m = (short) (this.f39415m | OS2WindowsMetricsTable.FSTYPE_NO_SUBSETTING);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzut
    public final zzut zzi(boolean z) {
        this.f39407e = z;
        this.f39415m = (short) (this.f39415m | 16);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzut
    public final zzut zzj(float f) {
        this.f39413k = 0.1f;
        this.f39415m = (short) (this.f39415m | 1024);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzut
    public final zzut zzk(long j) {
        this.f39410h = TooltipKt.TooltipDuration;
        this.f39415m = (short) (this.f39415m | 128);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzut
    public final zzut zzl(float f) {
        this.f39414l = 0.05f;
        this.f39415m = (short) (this.f39415m | 2048);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzut
    public final zzuu zzm() {
        if (this.f39415m != 4095) {
            StringBuilder sb = new StringBuilder();
            if ((this.f39415m & 1) == 0) {
                sb.append(" recentFramesToCheck");
            }
            if ((this.f39415m & 2) == 0) {
                sb.append(" recentFramesContainingPredictedArea");
            }
            if ((this.f39415m & 4) == 0) {
                sb.append(" recentFramesIou");
            }
            if ((this.f39415m & 8) == 0) {
                sb.append(" maxCoverage");
            }
            if ((this.f39415m & 16) == 0) {
                sb.append(" useConfidenceScore");
            }
            if ((this.f39415m & 32) == 0) {
                sb.append(" lowerConfidenceScore");
            }
            if ((this.f39415m & 64) == 0) {
                sb.append(" higherConfidenceScore");
            }
            if ((this.f39415m & 128) == 0) {
                sb.append(" zoomIntervalInMillis");
            }
            if ((this.f39415m & OS2WindowsMetricsTable.FSTYPE_NO_SUBSETTING) == 0) {
                sb.append(" resetIntervalInMillis");
            }
            if ((this.f39415m & OS2WindowsMetricsTable.FSTYPE_BITMAP_ONLY) == 0) {
                sb.append(" enableZoomThreshold");
            }
            if ((this.f39415m & 1024) == 0) {
                sb.append(" zoomInThreshold");
            }
            if ((this.f39415m & 2048) == 0) {
                sb.append(" zoomOutThreshold");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new C19681eK2(this.f39403a, this.f39404b, this.f39405c, this.f39406d, this.f39407e, this.f39408f, this.f39409g, this.f39410h, this.f39411i, this.f39412j, this.f39413k, this.f39414l, null);
    }
}
