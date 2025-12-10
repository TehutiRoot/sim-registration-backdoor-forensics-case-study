package com.google.firebase.p015ml.vision.face;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.firebase_ml.zzmc;
import com.google.android.gms.internal.firebase_ml.zznq;
import com.google.android.gms.internal.firebase_ml.zzxh;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Deprecated
/* renamed from: com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions */
/* loaded from: classes4.dex */
public class FirebaseVisionFaceDetectorOptions {
    public static final int ACCURATE = 2;
    public static final int ALL_CLASSIFICATIONS = 2;
    public static final int ALL_CONTOURS = 2;
    public static final int ALL_LANDMARKS = 2;
    public static final int FAST = 1;
    public static final int NO_CLASSIFICATIONS = 1;
    public static final int NO_CONTOURS = 1;
    public static final int NO_LANDMARKS = 1;

    /* renamed from: a */
    public final int f55968a;

    /* renamed from: b */
    public final int f55969b;

    /* renamed from: c */
    public final int f55970c;

    /* renamed from: d */
    public final int f55971d;

    /* renamed from: e */
    public final boolean f55972e;

    /* renamed from: f */
    public final float f55973f;

    /* renamed from: com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions$Builder */
    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public int f55974a = 1;

        /* renamed from: b */
        public int f55975b = 1;

        /* renamed from: c */
        public int f55976c = 1;

        /* renamed from: d */
        public int f55977d = 1;

        /* renamed from: e */
        public boolean f55978e = false;

        /* renamed from: f */
        public float f55979f = 0.1f;

        @NonNull
        public FirebaseVisionFaceDetectorOptions build() {
            return new FirebaseVisionFaceDetectorOptions(this.f55974a, this.f55975b, this.f55976c, this.f55977d, this.f55978e, this.f55979f);
        }

        @NonNull
        public Builder enableTracking() {
            this.f55978e = true;
            return this;
        }

        @NonNull
        public Builder setClassificationMode(@ClassificationMode int i) {
            this.f55976c = i;
            return this;
        }

        @NonNull
        public Builder setContourMode(@ContourMode int i) {
            this.f55975b = i;
            return this;
        }

        @NonNull
        public Builder setLandmarkMode(@LandmarkMode int i) {
            this.f55974a = i;
            return this;
        }

        @NonNull
        public Builder setMinFaceSize(float f) {
            this.f55979f = f;
            return this;
        }

        @NonNull
        public Builder setPerformanceMode(@PerformanceMode int i) {
            this.f55977d = i;
            return this;
        }
    }

    @Retention(RetentionPolicy.CLASS)
    /* renamed from: com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions$ClassificationMode */
    /* loaded from: classes4.dex */
    public @interface ClassificationMode {
    }

    @Retention(RetentionPolicy.CLASS)
    /* renamed from: com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions$ContourMode */
    /* loaded from: classes4.dex */
    public @interface ContourMode {
    }

    @Retention(RetentionPolicy.CLASS)
    /* renamed from: com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions$LandmarkMode */
    /* loaded from: classes4.dex */
    public @interface LandmarkMode {
    }

    @Retention(RetentionPolicy.CLASS)
    /* renamed from: com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions$PerformanceMode */
    /* loaded from: classes4.dex */
    public @interface PerformanceMode {
    }

    public FirebaseVisionFaceDetectorOptions(int i, int i2, int i3, int i4, boolean z, float f) {
        this.f55968a = i;
        this.f55969b = i2;
        this.f55970c = i3;
        this.f55971d = i4;
        this.f55972e = z;
        this.f55973f = f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseVisionFaceDetectorOptions)) {
            return false;
        }
        FirebaseVisionFaceDetectorOptions firebaseVisionFaceDetectorOptions = (FirebaseVisionFaceDetectorOptions) obj;
        if (Float.floatToIntBits(this.f55973f) == Float.floatToIntBits(firebaseVisionFaceDetectorOptions.f55973f) && this.f55968a == firebaseVisionFaceDetectorOptions.f55968a && this.f55969b == firebaseVisionFaceDetectorOptions.f55969b && this.f55971d == firebaseVisionFaceDetectorOptions.f55971d && this.f55972e == firebaseVisionFaceDetectorOptions.f55972e && this.f55970c == firebaseVisionFaceDetectorOptions.f55970c) {
            return true;
        }
        return false;
    }

    @ClassificationMode
    public int getClassificationMode() {
        return this.f55970c;
    }

    @ContourMode
    public int getContourMode() {
        return this.f55969b;
    }

    @LandmarkMode
    public int getLandmarkMode() {
        return this.f55968a;
    }

    public float getMinFaceSize() {
        return this.f55973f;
    }

    @PerformanceMode
    public int getPerformanceMode() {
        return this.f55971d;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Float.floatToIntBits(this.f55973f)), Integer.valueOf(this.f55968a), Integer.valueOf(this.f55969b), Integer.valueOf(this.f55971d), Boolean.valueOf(this.f55972e), Integer.valueOf(this.f55970c));
    }

    public boolean isTrackingEnabled() {
        return this.f55972e;
    }

    public String toString() {
        return zzmc.zzaz("FaceDetectorOptions").zzb("landmarkMode", this.f55968a).zzb("contourMode", this.f55969b).zzb("classificationMode", this.f55970c).zzb("performanceMode", this.f55971d).zza("trackingEnabled", this.f55972e).zza("minFaceSize", this.f55973f).toString();
    }

    public final zznq.zzac zzrd() {
        zznq.zzac.zzd zzdVar;
        zznq.zzac.zza zzaVar;
        zznq.zzac.zze zzeVar;
        zznq.zzac.zzc zzcVar;
        zznq.zzac.zzb zzmd = zznq.zzac.zzmd();
        int i = this.f55968a;
        if (i != 1) {
            if (i != 2) {
                zzdVar = zznq.zzac.zzd.UNKNOWN_LANDMARKS;
            } else {
                zzdVar = zznq.zzac.zzd.ALL_LANDMARKS;
            }
        } else {
            zzdVar = zznq.zzac.zzd.NO_LANDMARKS;
        }
        zznq.zzac.zzb zzb = zzmd.zzb(zzdVar);
        int i2 = this.f55970c;
        if (i2 != 1) {
            if (i2 != 2) {
                zzaVar = zznq.zzac.zza.UNKNOWN_CLASSIFICATIONS;
            } else {
                zzaVar = zznq.zzac.zza.ALL_CLASSIFICATIONS;
            }
        } else {
            zzaVar = zznq.zzac.zza.NO_CLASSIFICATIONS;
        }
        zznq.zzac.zzb zzb2 = zzb.zzb(zzaVar);
        int i3 = this.f55971d;
        if (i3 != 1) {
            if (i3 != 2) {
                zzeVar = zznq.zzac.zze.UNKNOWN_PERFORMANCE;
            } else {
                zzeVar = zznq.zzac.zze.ACCURATE;
            }
        } else {
            zzeVar = zznq.zzac.zze.FAST;
        }
        zznq.zzac.zzb zzb3 = zzb2.zzb(zzeVar);
        int i4 = this.f55969b;
        if (i4 != 1) {
            if (i4 != 2) {
                zzcVar = zznq.zzac.zzc.UNKNOWN_CONTOURS;
            } else {
                zzcVar = zznq.zzac.zzc.ALL_CONTOURS;
            }
        } else {
            zzcVar = zznq.zzac.zzc.NO_CONTOURS;
        }
        return (zznq.zzac) ((zzxh) zzb3.zzb(zzcVar).zzab(isTrackingEnabled()).zzl(this.f55973f).zzvn());
    }
}
