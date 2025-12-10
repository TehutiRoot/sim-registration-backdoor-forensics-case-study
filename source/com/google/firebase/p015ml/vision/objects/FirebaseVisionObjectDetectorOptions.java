package com.google.firebase.p015ml.vision.objects;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Deprecated
/* renamed from: com.google.firebase.ml.vision.objects.FirebaseVisionObjectDetectorOptions */
/* loaded from: classes4.dex */
public class FirebaseVisionObjectDetectorOptions {
    public static final int SINGLE_IMAGE_MODE = 2;
    public static final int STREAM_MODE = 1;

    /* renamed from: a */
    public final int f56010a;

    /* renamed from: b */
    public final boolean f56011b;

    /* renamed from: c */
    public final boolean f56012c;

    /* renamed from: com.google.firebase.ml.vision.objects.FirebaseVisionObjectDetectorOptions$Builder */
    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public int f56013a = 1;

        /* renamed from: b */
        public boolean f56014b = false;

        /* renamed from: c */
        public boolean f56015c = false;

        @NonNull
        public FirebaseVisionObjectDetectorOptions build() {
            return new FirebaseVisionObjectDetectorOptions(this.f56013a, this.f56014b, this.f56015c);
        }

        @NonNull
        public Builder enableClassification() {
            this.f56015c = true;
            return this;
        }

        @NonNull
        public Builder enableMultipleObjects() {
            this.f56014b = true;
            return this;
        }

        @NonNull
        public Builder setDetectorMode(@DetectorMode int i) {
            this.f56013a = i;
            return this;
        }
    }

    @Retention(RetentionPolicy.CLASS)
    /* renamed from: com.google.firebase.ml.vision.objects.FirebaseVisionObjectDetectorOptions$DetectorMode */
    /* loaded from: classes4.dex */
    public @interface DetectorMode {
    }

    public FirebaseVisionObjectDetectorOptions(int i, boolean z, boolean z2) {
        this.f56010a = i;
        this.f56011b = z;
        this.f56012c = z2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseVisionObjectDetectorOptions)) {
            return false;
        }
        FirebaseVisionObjectDetectorOptions firebaseVisionObjectDetectorOptions = (FirebaseVisionObjectDetectorOptions) obj;
        if (firebaseVisionObjectDetectorOptions.f56010a == this.f56010a && firebaseVisionObjectDetectorOptions.f56012c == this.f56012c && firebaseVisionObjectDetectorOptions.f56011b == this.f56011b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f56010a), Boolean.valueOf(this.f56012c), Boolean.valueOf(this.f56011b));
    }

    @DetectorMode
    public final int zzrh() {
        return this.f56010a;
    }

    public final boolean zzri() {
        return this.f56012c;
    }

    public final boolean zzrj() {
        return this.f56011b;
    }
}
