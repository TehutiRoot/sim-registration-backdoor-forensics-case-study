package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzuv;

/* renamed from: cL2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19388cL2 extends zzuv {

    /* renamed from: a */
    public final float f39408a;

    /* renamed from: b */
    public final float f39409b;

    /* renamed from: c */
    public final float f39410c;

    /* renamed from: d */
    public final float f39411d;

    public C19388cL2(float f, float f2, float f3, float f4, float f5) {
        this.f39408a = f;
        this.f39409b = f2;
        this.f39410c = f3;
        this.f39411d = f4;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuv
    /* renamed from: a */
    public final float mo46966a() {
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuv
    /* renamed from: b */
    public final float mo46965b() {
        return this.f39410c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuv
    /* renamed from: c */
    public final float mo46964c() {
        return this.f39408a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuv
    /* renamed from: d */
    public final float mo46963d() {
        return this.f39411d;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuv
    /* renamed from: e */
    public final float mo46962e() {
        return this.f39409b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzuv) {
            zzuv zzuvVar = (zzuv) obj;
            if (Float.floatToIntBits(this.f39408a) == Float.floatToIntBits(zzuvVar.mo46964c()) && Float.floatToIntBits(this.f39409b) == Float.floatToIntBits(zzuvVar.mo46962e()) && Float.floatToIntBits(this.f39410c) == Float.floatToIntBits(zzuvVar.mo46965b()) && Float.floatToIntBits(this.f39411d) == Float.floatToIntBits(zzuvVar.mo46963d())) {
                int floatToIntBits = Float.floatToIntBits(0.0f);
                zzuvVar.mo46966a();
                if (floatToIntBits == Float.floatToIntBits(0.0f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((Float.floatToIntBits(this.f39408a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f39409b)) * 1000003) ^ Float.floatToIntBits(this.f39410c)) * 1000003) ^ Float.floatToIntBits(this.f39411d)) * 1000003) ^ Float.floatToIntBits(0.0f);
    }

    public final String toString() {
        float f = this.f39408a;
        float f2 = this.f39409b;
        float f3 = this.f39410c;
        float f4 = this.f39411d;
        return "PredictedArea{xMin=" + f + ", yMin=" + f2 + ", xMax=" + f3 + ", yMax=" + f4 + ", confidenceScore=0.0}";
    }
}