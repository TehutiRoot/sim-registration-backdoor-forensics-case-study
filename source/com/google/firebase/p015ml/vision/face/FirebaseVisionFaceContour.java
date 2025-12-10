package com.google.firebase.p015ml.vision.face;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.firebase_ml.zzmc;
import com.google.firebase.p015ml.vision.common.FirebaseVisionPoint;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

@Deprecated
/* renamed from: com.google.firebase.ml.vision.face.FirebaseVisionFaceContour */
/* loaded from: classes4.dex */
public class FirebaseVisionFaceContour {
    public static final int ALL_POINTS = 1;
    public static final int FACE = 2;
    public static final int LEFT_EYE = 7;
    public static final int LEFT_EYEBROW_BOTTOM = 4;
    public static final int LEFT_EYEBROW_TOP = 3;
    public static final int LOWER_LIP_BOTTOM = 12;
    public static final int LOWER_LIP_TOP = 11;
    public static final int NOSE_BOTTOM = 14;
    public static final int NOSE_BRIDGE = 13;
    public static final int RIGHT_EYE = 8;
    public static final int RIGHT_EYEBROW_BOTTOM = 6;
    public static final int RIGHT_EYEBROW_TOP = 5;
    public static final int UPPER_LIP_BOTTOM = 10;
    public static final int UPPER_LIP_TOP = 9;

    /* renamed from: a */
    public final int f55965a;

    /* renamed from: b */
    public final List f55966b;

    @Retention(RetentionPolicy.CLASS)
    /* renamed from: com.google.firebase.ml.vision.face.FirebaseVisionFaceContour$ContourType */
    /* loaded from: classes4.dex */
    public @interface ContourType {
    }

    public FirebaseVisionFaceContour(@ContourType int i, @NonNull List<FirebaseVisionPoint> list) {
        this.f55965a = i;
        this.f55966b = list;
    }

    @ContourType
    public int getFaceContourType() {
        return this.f55965a;
    }

    @NonNull
    public List<FirebaseVisionPoint> getPoints() {
        return this.f55966b;
    }

    public String toString() {
        return zzmc.zzaz("FirebaseVisionFaceContour").zzb("type", this.f55965a).zzh("points", this.f55966b.toArray()).toString();
    }
}
