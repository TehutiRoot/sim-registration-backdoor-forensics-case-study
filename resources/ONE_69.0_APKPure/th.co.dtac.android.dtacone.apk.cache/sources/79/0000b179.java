package com.google.firebase.p015ml.vision.face;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.firebase_ml.zzmc;
import com.google.firebase.p015ml.vision.common.FirebaseVisionPoint;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Deprecated
/* renamed from: com.google.firebase.ml.vision.face.FirebaseVisionFaceLandmark */
/* loaded from: classes4.dex */
public class FirebaseVisionFaceLandmark {
    public static final int LEFT_CHEEK = 1;
    public static final int LEFT_EAR = 3;
    public static final int LEFT_EYE = 4;
    public static final int MOUTH_BOTTOM = 0;
    public static final int MOUTH_LEFT = 5;
    public static final int MOUTH_RIGHT = 11;
    public static final int NOSE_BASE = 6;
    public static final int RIGHT_CHEEK = 7;
    public static final int RIGHT_EAR = 9;
    public static final int RIGHT_EYE = 10;

    /* renamed from: a */
    public final int f55992a;

    /* renamed from: b */
    public final FirebaseVisionPoint f55993b;

    @Retention(RetentionPolicy.CLASS)
    /* renamed from: com.google.firebase.ml.vision.face.FirebaseVisionFaceLandmark$LandmarkType */
    /* loaded from: classes4.dex */
    public @interface LandmarkType {
    }

    public FirebaseVisionFaceLandmark(int i, FirebaseVisionPoint firebaseVisionPoint) {
        this.f55992a = i;
        this.f55993b = firebaseVisionPoint;
    }

    @LandmarkType
    public int getLandmarkType() {
        return this.f55992a;
    }

    @NonNull
    public FirebaseVisionPoint getPosition() {
        return this.f55993b;
    }

    public String toString() {
        return zzmc.zzaz("FirebaseVisionFaceLandmark").zzb("type", this.f55992a).zzh("position", this.f55993b).toString();
    }
}