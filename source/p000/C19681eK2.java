package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzum;
import com.google.android.gms.internal.mlkit_vision_barcode.zzuu;

/* renamed from: eK2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19681eK2 extends zzuu {

    /* renamed from: a */
    public final int f61474a;

    /* renamed from: b */
    public final int f61475b;

    /* renamed from: c */
    public final float f61476c;

    /* renamed from: d */
    public final float f61477d;

    /* renamed from: e */
    public final boolean f61478e;

    /* renamed from: f */
    public final float f61479f;

    /* renamed from: g */
    public final float f61480g;

    /* renamed from: h */
    public final long f61481h;

    /* renamed from: i */
    public final long f61482i;

    /* renamed from: j */
    public final boolean f61483j;

    /* renamed from: k */
    public final float f61484k;

    /* renamed from: l */
    public final float f61485l;

    public /* synthetic */ C19681eK2(int i, int i2, float f, float f2, boolean z, float f3, float f4, long j, long j2, boolean z2, float f5, float f6, zzum zzumVar) {
        this.f61474a = i;
        this.f61475b = i2;
        this.f61476c = f;
        this.f61477d = f2;
        this.f61478e = z;
        this.f61479f = f3;
        this.f61480g = f4;
        this.f61481h = j;
        this.f61482i = j2;
        this.f61483j = z2;
        this.f61484k = f5;
        this.f61485l = f6;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    /* renamed from: a */
    public final float mo31579a() {
        return this.f61480g;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    /* renamed from: b */
    public final float mo31578b() {
        return this.f61479f;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    /* renamed from: c */
    public final float mo31577c() {
        return this.f61477d;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    /* renamed from: d */
    public final float mo31576d() {
        return this.f61476c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    /* renamed from: e */
    public final float mo31575e() {
        return this.f61484k;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzuu) {
            zzuu zzuuVar = (zzuu) obj;
            if (this.f61474a == zzuuVar.mo31572h() && this.f61475b == zzuuVar.mo31573g() && Float.floatToIntBits(this.f61476c) == Float.floatToIntBits(zzuuVar.mo31576d()) && Float.floatToIntBits(this.f61477d) == Float.floatToIntBits(zzuuVar.mo31577c()) && this.f61478e == zzuuVar.mo31568l() && Float.floatToIntBits(this.f61479f) == Float.floatToIntBits(zzuuVar.mo31578b()) && Float.floatToIntBits(this.f61480g) == Float.floatToIntBits(zzuuVar.mo31579a()) && this.f61481h == zzuuVar.mo31570j() && this.f61482i == zzuuVar.mo31571i() && this.f61483j == zzuuVar.mo31569k() && Float.floatToIntBits(this.f61484k) == Float.floatToIntBits(zzuuVar.mo31575e()) && Float.floatToIntBits(this.f61485l) == Float.floatToIntBits(zzuuVar.mo31574f())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    /* renamed from: f */
    public final float mo31574f() {
        return this.f61485l;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    /* renamed from: g */
    public final int mo31573g() {
        return this.f61475b;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    /* renamed from: h */
    public final int mo31572h() {
        return this.f61474a;
    }

    public final int hashCode() {
        int i;
        int floatToIntBits = ((((((this.f61474a ^ 1000003) * 1000003) ^ this.f61475b) * 1000003) ^ Float.floatToIntBits(this.f61476c)) * 1000003) ^ Float.floatToIntBits(this.f61477d);
        int i2 = 1231;
        if (true != this.f61478e) {
            i = 1237;
        } else {
            i = 1231;
        }
        int floatToIntBits2 = (((((floatToIntBits * 1000003) ^ i) * 1000003) ^ Float.floatToIntBits(this.f61479f)) * 1000003) ^ Float.floatToIntBits(this.f61480g);
        int i3 = (int) this.f61481h;
        int i4 = (int) this.f61482i;
        if (true != this.f61483j) {
            i2 = 1237;
        }
        return (((((((((floatToIntBits2 * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ i2) * 1000003) ^ Float.floatToIntBits(this.f61484k)) * 1000003) ^ Float.floatToIntBits(this.f61485l);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    /* renamed from: i */
    public final long mo31571i() {
        return this.f61482i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    /* renamed from: j */
    public final long mo31570j() {
        return this.f61481h;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    /* renamed from: k */
    public final boolean mo31569k() {
        return this.f61483j;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    /* renamed from: l */
    public final boolean mo31568l() {
        return this.f61478e;
    }

    public final String toString() {
        int i = this.f61474a;
        int i2 = this.f61475b;
        float f = this.f61476c;
        float f2 = this.f61477d;
        boolean z = this.f61478e;
        float f3 = this.f61479f;
        float f4 = this.f61480g;
        long j = this.f61481h;
        long j2 = this.f61482i;
        boolean z2 = this.f61483j;
        float f5 = this.f61484k;
        float f6 = this.f61485l;
        return "AutoZoomOptions{recentFramesToCheck=" + i + ", recentFramesContainingPredictedArea=" + i2 + ", recentFramesIou=" + f + ", maxCoverage=" + f2 + ", useConfidenceScore=" + z + ", lowerConfidenceScore=" + f3 + ", higherConfidenceScore=" + f4 + ", zoomIntervalInMillis=" + j + ", resetIntervalInMillis=" + j2 + ", enableZoomThreshold=" + z2 + ", zoomInThreshold=" + f5 + ", zoomOutThreshold=" + f6 + "}";
    }
}
