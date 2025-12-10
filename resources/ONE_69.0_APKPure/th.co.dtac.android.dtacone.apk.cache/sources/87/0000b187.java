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
    public final int f56022a;

    /* renamed from: b */
    public final boolean f56023b;

    /* renamed from: c */
    public final boolean f56024c;

    /* renamed from: com.google.firebase.ml.vision.objects.FirebaseVisionObjectDetectorOptions$Builder */
    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public int f56025a = 1;

        /* renamed from: b */
        public boolean f56026b = false;

        /* renamed from: c */
        public boolean f56027c = false;

        @NonNull
        public FirebaseVisionObjectDetectorOptions build() {
            return new FirebaseVisionObjectDetectorOptions(this.f56025a, this.f56026b, this.f56027c);
        }

        @NonNull
        public Builder enableClassification() {
            this.f56027c = true;
            return this;
        }

        @NonNull
        public Builder enableMultipleObjects() {
            this.f56026b = true;
            return this;
        }

        @NonNull
        public Builder setDetectorMode(@DetectorMode int i) {
            this.f56025a = i;
            return this;
        }
    }

    @Retention(RetentionPolicy.CLASS)
    /* renamed from: com.google.firebase.ml.vision.objects.FirebaseVisionObjectDetectorOptions$DetectorMode */
    /* loaded from: classes4.dex */
    public @interface DetectorMode {
    }

    public FirebaseVisionObjectDetectorOptions(int i, boolean z, boolean z2) {
        this.f56022a = i;
        this.f56023b = z;
        this.f56024c = z2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseVisionObjectDetectorOptions)) {
            return false;
        }
        FirebaseVisionObjectDetectorOptions firebaseVisionObjectDetectorOptions = (FirebaseVisionObjectDetectorOptions) obj;
        if (firebaseVisionObjectDetectorOptions.f56022a == this.f56022a && firebaseVisionObjectDetectorOptions.f56024c == this.f56024c && firebaseVisionObjectDetectorOptions.f56023b == this.f56023b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f56022a), Boolean.valueOf(this.f56024c), Boolean.valueOf(this.f56023b));
    }

    @DetectorMode
    public final int zzrh() {
        return this.f56022a;
    }

    public final boolean zzri() {
        return this.f56024c;
    }

    public final boolean zzrj() {
        return this.f56023b;
    }
}