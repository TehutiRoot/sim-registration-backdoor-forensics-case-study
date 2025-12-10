package com.google.firebase.p015ml.vision.label;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import javax.annotation.concurrent.Immutable;

@Immutable
/* renamed from: com.google.firebase.ml.vision.label.FirebaseVisionCloudImageLabelerOptions */
/* loaded from: classes4.dex */
public class FirebaseVisionCloudImageLabelerOptions {

    /* renamed from: a */
    public final float f55982a;

    /* renamed from: b */
    public final boolean f55983b;

    /* renamed from: com.google.firebase.ml.vision.label.FirebaseVisionCloudImageLabelerOptions$Builder */
    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public float f55984a = 0.5f;

        /* renamed from: b */
        public boolean f55985b = false;

        @NonNull
        public FirebaseVisionCloudImageLabelerOptions build() {
            return new FirebaseVisionCloudImageLabelerOptions(this.f55984a, this.f55985b);
        }

        @NonNull
        public Builder enforceCertFingerprintMatch() {
            this.f55985b = true;
            return this;
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
            this.f55984a = f;
            return this;
        }
    }

    public FirebaseVisionCloudImageLabelerOptions(float f, boolean z) {
        this.f55982a = f;
        this.f55983b = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseVisionCloudImageLabelerOptions)) {
            return false;
        }
        FirebaseVisionCloudImageLabelerOptions firebaseVisionCloudImageLabelerOptions = (FirebaseVisionCloudImageLabelerOptions) obj;
        if (Float.compare(this.f55982a, firebaseVisionCloudImageLabelerOptions.f55982a) == 0 && this.f55983b == firebaseVisionCloudImageLabelerOptions.f55983b) {
            return true;
        }
        return false;
    }

    public float getConfidenceThreshold() {
        return this.f55982a;
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.f55982a), Boolean.valueOf(this.f55983b));
    }

    public boolean isEnforceCertFingerprintMatch() {
        return this.f55983b;
    }
}
