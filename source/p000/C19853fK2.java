package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzuv;

/* renamed from: fK2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19853fK2 extends zzuv {

    /* renamed from: a */
    public final float f61789a;

    /* renamed from: b */
    public final float f61790b;

    /* renamed from: c */
    public final float f61791c;

    /* renamed from: d */
    public final float f61792d;

    public C19853fK2(float f, float f2, float f3, float f4, float f5) {
        this.f61789a = f;
        this.f61790b = f2;
        this.f61791c = f3;
        this.f61792d = f4;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuv
    /* renamed from: a */
    public final float mo31318a() {
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuv
    /* renamed from: b */
    public final float mo31317b() {
        return this.f61791c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuv
    /* renamed from: c */
    public final float mo31316c() {
        return this.f61789a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuv
    /* renamed from: d */
    public final float mo31315d() {
        return this.f61792d;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzuv
    /* renamed from: e */
    public final float mo31314e() {
        return this.f61790b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzuv) {
            zzuv zzuvVar = (zzuv) obj;
            if (Float.floatToIntBits(this.f61789a) == Float.floatToIntBits(zzuvVar.mo31316c()) && Float.floatToIntBits(this.f61790b) == Float.floatToIntBits(zzuvVar.mo31314e()) && Float.floatToIntBits(this.f61791c) == Float.floatToIntBits(zzuvVar.mo31317b()) && Float.floatToIntBits(this.f61792d) == Float.floatToIntBits(zzuvVar.mo31315d())) {
                int floatToIntBits = Float.floatToIntBits(0.0f);
                zzuvVar.mo31318a();
                if (floatToIntBits == Float.floatToIntBits(0.0f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((Float.floatToIntBits(this.f61789a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f61790b)) * 1000003) ^ Float.floatToIntBits(this.f61791c)) * 1000003) ^ Float.floatToIntBits(this.f61792d)) * 1000003) ^ Float.floatToIntBits(0.0f);
    }

    public final String toString() {
        float f = this.f61789a;
        float f2 = this.f61790b;
        float f3 = this.f61791c;
        float f4 = this.f61792d;
        return "PredictedArea{xMin=" + f + ", yMin=" + f2 + ", xMax=" + f3 + ", yMax=" + f4 + ", confidenceScore=0.0}";
    }
}
