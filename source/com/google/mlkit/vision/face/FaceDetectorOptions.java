package com.google.mlkit.vision.face;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.mlkit_vision_face.zzv;
import com.google.android.gms.internal.mlkit_vision_face.zzw;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class FaceDetectorOptions {
    public static final int CLASSIFICATION_MODE_ALL = 2;
    public static final int CLASSIFICATION_MODE_NONE = 1;
    public static final int CONTOUR_MODE_ALL = 2;
    public static final int CONTOUR_MODE_NONE = 1;
    public static final int LANDMARK_MODE_ALL = 2;
    public static final int LANDMARK_MODE_NONE = 1;
    public static final int PERFORMANCE_MODE_ACCURATE = 2;
    public static final int PERFORMANCE_MODE_FAST = 1;

    /* renamed from: a */
    public final int f57127a;

    /* renamed from: b */
    public final int f57128b;

    /* renamed from: c */
    public final int f57129c;

    /* renamed from: d */
    public final int f57130d;

    /* renamed from: e */
    public final boolean f57131e;

    /* renamed from: f */
    public final float f57132f;

    /* renamed from: g */
    public final Executor f57133g;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public int f57134a = 1;

        /* renamed from: b */
        public int f57135b = 1;

        /* renamed from: c */
        public int f57136c = 1;

        /* renamed from: d */
        public int f57137d = 1;

        /* renamed from: e */
        public boolean f57138e = false;

        /* renamed from: f */
        public float f57139f = 0.1f;

        /* renamed from: g */
        public Executor f57140g;

        @NonNull
        public FaceDetectorOptions build() {
            return new FaceDetectorOptions(this.f57134a, this.f57135b, this.f57136c, this.f57137d, this.f57138e, this.f57139f, this.f57140g, null);
        }

        @NonNull
        public Builder enableTracking() {
            this.f57138e = true;
            return this;
        }

        @NonNull
        public Builder setClassificationMode(@ClassificationMode int i) {
            this.f57136c = i;
            return this;
        }

        @NonNull
        public Builder setContourMode(@ContourMode int i) {
            this.f57135b = i;
            return this;
        }

        @NonNull
        public Builder setExecutor(@NonNull Executor executor) {
            this.f57140g = executor;
            return this;
        }

        @NonNull
        public Builder setLandmarkMode(@LandmarkMode int i) {
            this.f57134a = i;
            return this;
        }

        @NonNull
        public Builder setMinFaceSize(float f) {
            this.f57139f = f;
            return this;
        }

        @NonNull
        public Builder setPerformanceMode(@PerformanceMode int i) {
            this.f57137d = i;
            return this;
        }
    }

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes4.dex */
    public @interface ClassificationMode {
    }

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes4.dex */
    public @interface ContourMode {
    }

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes4.dex */
    public @interface LandmarkMode {
    }

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes4.dex */
    public @interface PerformanceMode {
    }

    public /* synthetic */ FaceDetectorOptions(int i, int i2, int i3, int i4, boolean z, float f, Executor executor, zza zzaVar) {
        this.f57127a = i;
        this.f57128b = i2;
        this.f57129c = i3;
        this.f57130d = i4;
        this.f57131e = z;
        this.f57132f = f;
        this.f57133g = executor;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FaceDetectorOptions)) {
            return false;
        }
        FaceDetectorOptions faceDetectorOptions = (FaceDetectorOptions) obj;
        if (Float.floatToIntBits(this.f57132f) == Float.floatToIntBits(faceDetectorOptions.f57132f) && Objects.equal(Integer.valueOf(this.f57127a), Integer.valueOf(faceDetectorOptions.f57127a)) && Objects.equal(Integer.valueOf(this.f57128b), Integer.valueOf(faceDetectorOptions.f57128b)) && Objects.equal(Integer.valueOf(this.f57130d), Integer.valueOf(faceDetectorOptions.f57130d)) && Objects.equal(Boolean.valueOf(this.f57131e), Boolean.valueOf(faceDetectorOptions.f57131e)) && Objects.equal(Integer.valueOf(this.f57129c), Integer.valueOf(faceDetectorOptions.f57129c)) && Objects.equal(this.f57133g, faceDetectorOptions.f57133g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Float.floatToIntBits(this.f57132f)), Integer.valueOf(this.f57127a), Integer.valueOf(this.f57128b), Integer.valueOf(this.f57130d), Boolean.valueOf(this.f57131e), Integer.valueOf(this.f57129c), this.f57133g);
    }

    @NonNull
    public String toString() {
        zzv zza = zzw.zza("FaceDetectorOptions");
        zza.zzb("landmarkMode", this.f57127a);
        zza.zzb("contourMode", this.f57128b);
        zza.zzb("classificationMode", this.f57129c);
        zza.zzb("performanceMode", this.f57130d);
        zza.zzd("trackingEnabled", this.f57131e);
        zza.zza("minFaceSize", this.f57132f);
        return zza.toString();
    }

    public final float zza() {
        return this.f57132f;
    }

    @ClassificationMode
    public final int zzb() {
        return this.f57129c;
    }

    @ContourMode
    public final int zzc() {
        return this.f57128b;
    }

    @LandmarkMode
    public final int zzd() {
        return this.f57127a;
    }

    @PerformanceMode
    public final int zze() {
        return this.f57130d;
    }

    @Nullable
    public final Executor zzf() {
        return this.f57133g;
    }

    public final boolean zzg() {
        return this.f57131e;
    }
}
