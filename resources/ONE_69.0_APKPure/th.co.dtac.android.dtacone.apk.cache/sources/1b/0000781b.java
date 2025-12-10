package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzum;
import com.google.android.gms.internal.mlkit_vision_barcode.zzuu;

/* renamed from: bL2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19215bL2 extends zzuu {

    /* renamed from: a */
    public final int f39071a;

    /* renamed from: b */
    public final int f39072b;

    /* renamed from: c */
    public final float f39073c;

    /* renamed from: d */
    public final float f39074d;

    /* renamed from: e */
    public final boolean f39075e;

    /* renamed from: f */
    public final float f39076f;

    /* renamed from: g */
    public final float f39077g;

    /* renamed from: h */
    public final long f39078h;

    /* renamed from: i */
    public final long f39079i;

    /* renamed from: j */
    public final boolean f39080j;

    /* renamed from: k */
    public final float f39081k;

    /* renamed from: l */
    public final float f39082l;

    public /* synthetic */ C19215bL2(int i, int i2, float f, float f2, boolean z, float f3, float f4, long j, long j2, boolean z2, float f5, float f6, zzum zzumVar) {
        this.f39071a = i;
        this.f39072b = i2;
        this.f39073c = f;
        this.f39074d = f2;
        this.f39075e = z;
        this.f39076f = f3;
        this.f39077g = f4;
        this.f39078h = j;
        this.f39079i = j2;
        this.f39080j = z2;
        this.f39081k = f5;
        this.f39082l = f6;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    /* renamed from: a */
    public final float mo46978a() {
        return this.f39077g;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    /* renamed from: b */
    public final float mo46977b() {
        return this.f39076f;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    /* renamed from: c */
    public final float mo46976c() {
        return this.f39074d;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    /* renamed from: d */
    public final float mo46975d() {
        return this.f39073c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    /* renamed from: e */
    public final float mo46974e() {
        return this.f39081k;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzuu) {
            zzuu zzuuVar = (zzuu) obj;
            if (this.f39071a == zzuuVar.mo46971h() && this.f39072b == zzuuVar.mo46972g() && Float.floatToIntBits(this.f39073c) == Float.floatToIntBits(zzuuVar.mo46975d()) && Float.floatToIntBits(this.f39074d) == Float.floatToIntBits(zzuuVar.mo46976c()) && this.f39075e == zzuuVar.mo46967l() && Float.floatToIntBits(this.f39076f) == Float.floatToIntBits(zzuuVar.mo46977b()) && Float.floatToIntBits(this.f39077g) == Float.floatToIntBits(zzuuVar.mo46978a()) && this.f39078h == zzuuVar.mo46969j() && this.f39079i == zzuuVar.mo46970i() && this.f39080j == zzuuVar.mo46968k() && Float.floatToIntBits(this.f39081k) == Float.floatToIntBits(zzuuVar.mo46974e()) && Float.floatToIntBits(this.f39082l) == Float.floatToIntBits(zzuuVar.mo46973f())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    /* renamed from: f */
    public final float mo46973f() {
        return this.f39082l;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    /* renamed from: g */
    public final int mo46972g() {
        return this.f39072b;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    /* renamed from: h */
    public final int mo46971h() {
        return this.f39071a;
    }

    public final int hashCode() {
        int i;
        int floatToIntBits = ((((((this.f39071a ^ 1000003) * 1000003) ^ this.f39072b) * 1000003) ^ Float.floatToIntBits(this.f39073c)) * 1000003) ^ Float.floatToIntBits(this.f39074d);
        int i2 = 1231;
        if (true != this.f39075e) {
            i = 1237;
        } else {
            i = 1231;
        }
        int floatToIntBits2 = (((((floatToIntBits * 1000003) ^ i) * 1000003) ^ Float.floatToIntBits(this.f39076f)) * 1000003) ^ Float.floatToIntBits(this.f39077g);
        int i3 = (int) this.f39078h;
        int i4 = (int) this.f39079i;
        if (true != this.f39080j) {
            i2 = 1237;
        }
        return (((((((((floatToIntBits2 * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ i2) * 1000003) ^ Float.floatToIntBits(this.f39081k)) * 1000003) ^ Float.floatToIntBits(this.f39082l);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    /* renamed from: i */
    public final long mo46970i() {
        return this.f39079i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    /* renamed from: j */
    public final long mo46969j() {
        return this.f39078h;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    /* renamed from: k */
    public final boolean mo46968k() {
        return this.f39080j;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuu
    /* renamed from: l */
    public final boolean mo46967l() {
        return this.f39075e;
    }

    public final String toString() {
        int i = this.f39071a;
        int i2 = this.f39072b;
        float f = this.f39073c;
        float f2 = this.f39074d;
        boolean z = this.f39075e;
        float f3 = this.f39076f;
        float f4 = this.f39077g;
        long j = this.f39078h;
        long j2 = this.f39079i;
        boolean z2 = this.f39080j;
        float f5 = this.f39081k;
        float f6 = this.f39082l;
        return "AutoZoomOptions{recentFramesToCheck=" + i + ", recentFramesContainingPredictedArea=" + i2 + ", recentFramesIou=" + f + ", maxCoverage=" + f2 + ", useConfidenceScore=" + z + ", lowerConfidenceScore=" + f3 + ", higherConfidenceScore=" + f4 + ", zoomIntervalInMillis=" + j + ", resetIntervalInMillis=" + j2 + ", enableZoomThreshold=" + z2 + ", zoomInThreshold=" + f5 + ", zoomOutThreshold=" + f6 + "}";
    }
}