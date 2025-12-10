package com.google.firebase.p015ml.vision.common;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: com.google.firebase.ml.vision.common.FirebaseVisionImageMetadata */
/* loaded from: classes4.dex */
public class FirebaseVisionImageMetadata {
    public static final int IMAGE_FORMAT_NV21 = 17;
    public static final int IMAGE_FORMAT_YV12 = 842094169;
    public static final int ROTATION_0 = 0;
    public static final int ROTATION_180 = 2;
    public static final int ROTATION_270 = 3;
    public static final int ROTATION_90 = 1;

    /* renamed from: a */
    public final int f55925a;

    /* renamed from: b */
    public final int f55926b;

    /* renamed from: c */
    public final int f55927c;

    /* renamed from: d */
    public final int f55928d;

    /* renamed from: com.google.firebase.ml.vision.common.FirebaseVisionImageMetadata$Builder */
    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public int f55929a;

        /* renamed from: b */
        public int f55930b;

        /* renamed from: c */
        public int f55931c;

        /* renamed from: d */
        public int f55932d;

        @NonNull
        public FirebaseVisionImageMetadata build() {
            return new FirebaseVisionImageMetadata(this.f55929a, this.f55930b, this.f55931c, this.f55932d);
        }

        @NonNull
        public Builder setFormat(@ImageFormat int i) {
            boolean z;
            if (i != 842094169 && i != 17) {
                z = false;
            } else {
                z = true;
            }
            Preconditions.checkArgument(z);
            this.f55932d = i;
            return this;
        }

        @NonNull
        public Builder setHeight(int i) {
            boolean z;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "Image buffer height should be positive.");
            this.f55930b = i;
            return this;
        }

        @NonNull
        public Builder setRotation(@Rotation int i) {
            boolean z = true;
            if (i != 0 && i != 1 && i != 2 && i != 3) {
                z = false;
            }
            Preconditions.checkArgument(z);
            this.f55931c = i;
            return this;
        }

        @NonNull
        public Builder setWidth(int i) {
            boolean z;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "Image buffer width should be positive.");
            this.f55929a = i;
            return this;
        }
    }

    @Retention(RetentionPolicy.CLASS)
    /* renamed from: com.google.firebase.ml.vision.common.FirebaseVisionImageMetadata$ImageFormat */
    /* loaded from: classes4.dex */
    public @interface ImageFormat {
    }

    @Retention(RetentionPolicy.CLASS)
    /* renamed from: com.google.firebase.ml.vision.common.FirebaseVisionImageMetadata$Rotation */
    /* loaded from: classes4.dex */
    public @interface Rotation {
    }

    public FirebaseVisionImageMetadata(@NonNull FirebaseVisionImageMetadata firebaseVisionImageMetadata) {
        this.f55925a = firebaseVisionImageMetadata.getWidth();
        this.f55926b = firebaseVisionImageMetadata.getHeight();
        this.f55928d = firebaseVisionImageMetadata.getFormat();
        this.f55927c = firebaseVisionImageMetadata.getRotation();
    }

    @ImageFormat
    public int getFormat() {
        return this.f55928d;
    }

    public int getHeight() {
        return this.f55926b;
    }

    @Rotation
    public int getRotation() {
        return this.f55927c;
    }

    public int getWidth() {
        return this.f55925a;
    }

    public FirebaseVisionImageMetadata(int i, int i2, int i3, int i4) {
        this.f55925a = i;
        this.f55926b = i2;
        this.f55927c = i3;
        this.f55928d = i4;
    }
}
