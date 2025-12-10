package com.google.firebase.p015ml.vision.label;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.p015ml.vision.automl.FirebaseAutoMLLocalModel;
import com.google.firebase.p015ml.vision.automl.FirebaseAutoMLRemoteModel;
import javax.annotation.Nonnull;
import javax.annotation.concurrent.Immutable;

@Deprecated
@Immutable
/* renamed from: com.google.firebase.ml.vision.label.FirebaseVisionOnDeviceAutoMLImageLabelerOptions */
/* loaded from: classes4.dex */
public class FirebaseVisionOnDeviceAutoMLImageLabelerOptions {

    /* renamed from: a */
    public final float f55997a;

    /* renamed from: b */
    public final FirebaseAutoMLLocalModel f55998b;

    /* renamed from: c */
    public final FirebaseAutoMLRemoteModel f55999c;

    public FirebaseVisionOnDeviceAutoMLImageLabelerOptions(float f, FirebaseAutoMLLocalModel firebaseAutoMLLocalModel, FirebaseAutoMLRemoteModel firebaseAutoMLRemoteModel) {
        this.f55997a = f;
        this.f55998b = firebaseAutoMLLocalModel;
        this.f55999c = firebaseAutoMLRemoteModel;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseVisionOnDeviceAutoMLImageLabelerOptions)) {
            return false;
        }
        FirebaseVisionOnDeviceAutoMLImageLabelerOptions firebaseVisionOnDeviceAutoMLImageLabelerOptions = (FirebaseVisionOnDeviceAutoMLImageLabelerOptions) obj;
        if (Float.compare(this.f55997a, firebaseVisionOnDeviceAutoMLImageLabelerOptions.f55997a) == 0 && Objects.equal(this.f55998b, firebaseVisionOnDeviceAutoMLImageLabelerOptions.f55998b) && Objects.equal(this.f55999c, firebaseVisionOnDeviceAutoMLImageLabelerOptions.f55999c)) {
            return true;
        }
        return false;
    }

    public final float getConfidenceThreshold() {
        return this.f55997a;
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.f55997a), this.f55998b, this.f55999c);
    }

    public final FirebaseAutoMLLocalModel zzre() {
        return this.f55998b;
    }

    public final FirebaseAutoMLRemoteModel zzrf() {
        return this.f55999c;
    }

    /* renamed from: com.google.firebase.ml.vision.label.FirebaseVisionOnDeviceAutoMLImageLabelerOptions$Builder */
    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public float f56000a = 0.5f;

        /* renamed from: b */
        public FirebaseAutoMLLocalModel f56001b;

        /* renamed from: c */
        public FirebaseAutoMLRemoteModel f56002c;

        public Builder(@NonNull FirebaseAutoMLLocalModel firebaseAutoMLLocalModel) {
            Preconditions.checkNotNull(firebaseAutoMLLocalModel);
            this.f56001b = firebaseAutoMLLocalModel;
        }

        @Nonnull
        public FirebaseVisionOnDeviceAutoMLImageLabelerOptions build() {
            boolean z;
            if (this.f56001b == null && this.f56002c == null) {
                z = false;
            } else {
                z = true;
            }
            Preconditions.checkArgument(z, "Either a local model or remote model must be set.");
            return new FirebaseVisionOnDeviceAutoMLImageLabelerOptions(this.f56000a, this.f56001b, this.f56002c);
        }

        @Nonnull
        public Builder setConfidenceThreshold(float f) {
            boolean z;
            if (Float.compare(f, 0.0f) >= 0 && Float.compare(f, 1.0f) <= 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "Confidence Threshold should be in range [0.0f, 1.0f].");
            this.f56000a = f;
            return this;
        }

        public Builder(@NonNull FirebaseAutoMLRemoteModel firebaseAutoMLRemoteModel) {
            Preconditions.checkNotNull(firebaseAutoMLRemoteModel);
            this.f56002c = firebaseAutoMLRemoteModel;
        }
    }
}
