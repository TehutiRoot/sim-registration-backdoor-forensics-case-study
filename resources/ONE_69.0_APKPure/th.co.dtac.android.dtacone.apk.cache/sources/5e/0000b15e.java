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
    public final int f55937a;

    /* renamed from: b */
    public final int f55938b;

    /* renamed from: c */
    public final int f55939c;

    /* renamed from: d */
    public final int f55940d;

    /* renamed from: com.google.firebase.ml.vision.common.FirebaseVisionImageMetadata$Builder */
    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public int f55941a;

        /* renamed from: b */
        public int f55942b;

        /* renamed from: c */
        public int f55943c;

        /* renamed from: d */
        public int f55944d;

        @NonNull
        public FirebaseVisionImageMetadata build() {
            return new FirebaseVisionImageMetadata(this.f55941a, this.f55942b, this.f55943c, this.f55944d);
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
            this.f55944d = i;
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
            this.f55942b = i;
            return this;
        }

        @NonNull
        public Builder setRotation(@Rotation int i) {
            boolean z = true;
            if (i != 0 && i != 1 && i != 2 && i != 3) {
                z = false;
            }
            Preconditions.checkArgument(z);
            this.f55943c = i;
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
            this.f55941a = i;
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
        this.f55937a = firebaseVisionImageMetadata.getWidth();
        this.f55938b = firebaseVisionImageMetadata.getHeight();
        this.f55940d = firebaseVisionImageMetadata.getFormat();
        this.f55939c = firebaseVisionImageMetadata.getRotation();
    }

    @ImageFormat
    public int getFormat() {
        return this.f55940d;
    }

    public int getHeight() {
        return this.f55938b;
    }

    @Rotation
    public int getRotation() {
        return this.f55939c;
    }

    public int getWidth() {
        return this.f55937a;
    }

    public FirebaseVisionImageMetadata(int i, int i2, int i3, int i4) {
        this.f55937a = i;
        this.f55938b = i2;
        this.f55939c = i3;
        this.f55940d = i4;
    }
}