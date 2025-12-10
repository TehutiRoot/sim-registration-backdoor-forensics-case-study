package com.google.firebase.p015ml.vision.label;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zznq;
import com.google.android.gms.internal.firebase_ml.zzxh;
import javax.annotation.concurrent.Immutable;

@Deprecated
@Immutable
/* renamed from: com.google.firebase.ml.vision.label.FirebaseVisionOnDeviceImageLabelerOptions */
/* loaded from: classes4.dex */
public class FirebaseVisionOnDeviceImageLabelerOptions {

    /* renamed from: a */
    public final float f56003a;

    /* renamed from: com.google.firebase.ml.vision.label.FirebaseVisionOnDeviceImageLabelerOptions$Builder */
    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public float f56004a = 0.5f;

        @NonNull
        public FirebaseVisionOnDeviceImageLabelerOptions build() {
            return new FirebaseVisionOnDeviceImageLabelerOptions(this.f56004a);
        }

        @NonNull
        public Builder setConfidenceThreshold(float f) {
            boolean z;
            if (Float.compare(f, 0.0f) >= 0 && Float.compare(f, 1.0f) <= 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "Confidence Threshold should be in range [0.0f, 1.0f].");
            this.f56004a = f;
            return this;
        }
    }

    public FirebaseVisionOnDeviceImageLabelerOptions(float f) {
        this.f56003a = f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof FirebaseVisionOnDeviceImageLabelerOptions) && this.f56003a == ((FirebaseVisionOnDeviceImageLabelerOptions) obj).f56003a) {
            return true;
        }
        return false;
    }

    public float getConfidenceThreshold() {
        return this.f56003a;
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.f56003a));
    }

    public final zznq.zzat zzrg() {
        return (zznq.zzat) ((zzxh) zznq.zzat.zznj().zzp(this.f56003a).zzvn());
    }
}
