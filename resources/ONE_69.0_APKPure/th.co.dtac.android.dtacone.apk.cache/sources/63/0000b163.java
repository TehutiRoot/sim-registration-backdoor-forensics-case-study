package com.google.firebase.p015ml.vision.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.firebase_ml.zzmc;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;

/* renamed from: com.google.firebase.ml.vision.common.FirebaseVisionPoint */
/* loaded from: classes4.dex */
public final class FirebaseVisionPoint {

    /* renamed from: a */
    public final Float f55947a;

    /* renamed from: b */
    public final Float f55948b;

    /* renamed from: c */
    public final Float f55949c = null;

    public FirebaseVisionPoint(@NonNull Float f, @NonNull Float f2, @Nullable Float f3) {
        this.f55947a = f;
        this.f55948b = f2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseVisionPoint)) {
            return false;
        }
        FirebaseVisionPoint firebaseVisionPoint = (FirebaseVisionPoint) obj;
        if (Objects.equal(this.f55947a, firebaseVisionPoint.f55947a) && Objects.equal(this.f55948b, firebaseVisionPoint.f55948b) && Objects.equal(null, null)) {
            return true;
        }
        return false;
    }

    @NonNull
    public final Float getX() {
        return this.f55947a;
    }

    @NonNull
    public final Float getY() {
        return this.f55948b;
    }

    @Nullable
    public final Float getZ() {
        return null;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f55947a, this.f55948b, null);
    }

    public final String toString() {
        return zzmc.zzaz("FirebaseVisionPoint").zzh("x", this.f55947a).zzh(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, this.f55948b).zzh("z", null).toString();
    }
}