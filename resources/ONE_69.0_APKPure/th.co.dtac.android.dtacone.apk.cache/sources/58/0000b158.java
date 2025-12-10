package com.google.firebase.p015ml.vision.cloud;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.concurrent.Immutable;

@Immutable
/* renamed from: com.google.firebase.ml.vision.cloud.FirebaseVisionCloudDetectorOptions */
/* loaded from: classes4.dex */
public class FirebaseVisionCloudDetectorOptions {
    public static final FirebaseVisionCloudDetectorOptions DEFAULT = new Builder().build();
    public static final int LATEST_MODEL = 2;
    public static final int STABLE_MODEL = 1;

    /* renamed from: a */
    public final int f55918a;

    /* renamed from: b */
    public final int f55919b;

    /* renamed from: c */
    public final boolean f55920c;

    /* renamed from: com.google.firebase.ml.vision.cloud.FirebaseVisionCloudDetectorOptions$Builder */
    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public int f55921a = 10;

        /* renamed from: b */
        public int f55922b = 1;

        /* renamed from: c */
        public boolean f55923c = false;

        @NonNull
        public FirebaseVisionCloudDetectorOptions build() {
            return new FirebaseVisionCloudDetectorOptions(this.f55921a, this.f55922b, this.f55923c);
        }

        @NonNull
        public Builder enforceCertFingerprintMatch() {
            this.f55923c = true;
            return this;
        }

        @NonNull
        public Builder setMaxResults(int i) {
            this.f55921a = i;
            return this;
        }

        @NonNull
        public Builder setModelType(@ModelType int i) {
            this.f55922b = i;
            return this;
        }
    }

    @Retention(RetentionPolicy.CLASS)
    /* renamed from: com.google.firebase.ml.vision.cloud.FirebaseVisionCloudDetectorOptions$ModelType */
    /* loaded from: classes4.dex */
    public @interface ModelType {
    }

    public FirebaseVisionCloudDetectorOptions(int i, int i2, boolean z) {
        this.f55918a = i;
        this.f55919b = i2;
        this.f55920c = z;
    }

    @NonNull
    public Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseVisionCloudDetectorOptions)) {
            return false;
        }
        FirebaseVisionCloudDetectorOptions firebaseVisionCloudDetectorOptions = (FirebaseVisionCloudDetectorOptions) obj;
        if (this.f55918a == firebaseVisionCloudDetectorOptions.f55918a && this.f55919b == firebaseVisionCloudDetectorOptions.f55919b && this.f55920c == firebaseVisionCloudDetectorOptions.f55920c) {
            return true;
        }
        return false;
    }

    public int getMaxResults() {
        return this.f55918a;
    }

    @ModelType
    public int getModelType() {
        return this.f55919b;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f55918a), Integer.valueOf(this.f55919b), Boolean.valueOf(this.f55920c));
    }

    public final boolean isEnforceCertFingerprintMatch() {
        return this.f55920c;
    }
}