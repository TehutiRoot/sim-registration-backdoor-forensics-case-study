package com.google.firebase.p015ml.vision.face;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.firebase_ml.zzmc;
import com.google.android.gms.internal.firebase_ml.zzme;
import com.google.android.gms.vision.face.Contour;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.Landmark;
import com.google.firebase.p015ml.vision.common.FirebaseVisionPoint;
import com.google.firebase.p015ml.vision.face.FirebaseVisionFaceContour;
import com.google.firebase.p015ml.vision.face.FirebaseVisionFaceLandmark;
import java.util.ArrayList;
import javax.annotation.concurrent.Immutable;

@Deprecated
@Immutable
/* renamed from: com.google.firebase.ml.vision.face.FirebaseVisionFace */
/* loaded from: classes4.dex */
public class FirebaseVisionFace {
    public static final int INVALID_ID = -1;
    public static final float UNCOMPUTED_PROBABILITY = -1.0f;

    /* renamed from: a */
    public final Rect f55956a;

    /* renamed from: b */
    public int f55957b;

    /* renamed from: c */
    public float f55958c;

    /* renamed from: d */
    public float f55959d;

    /* renamed from: e */
    public float f55960e;

    /* renamed from: f */
    public final float f55961f;

    /* renamed from: g */
    public final float f55962g;

    /* renamed from: h */
    public final SparseArray f55963h = new SparseArray();

    /* renamed from: i */
    public final SparseArray f55964i = new SparseArray();

    public FirebaseVisionFace(@NonNull Face face) {
        int i;
        PointF position = face.getPosition();
        float f = position.x;
        this.f55956a = new Rect((int) f, (int) position.y, (int) (f + face.getWidth()), (int) (position.y + face.getHeight()));
        this.f55957b = face.getId();
        for (Landmark landmark : face.getLandmarks()) {
            if (m38324a(landmark.getType()) && landmark.getPosition() != null) {
                this.f55963h.put(landmark.getType(), new FirebaseVisionFaceLandmark(landmark.getType(), new FirebaseVisionPoint(Float.valueOf(landmark.getPosition().x), Float.valueOf(landmark.getPosition().y), null)));
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Contour contour : face.getContours()) {
            switch (contour.getType()) {
                case 1:
                    i = 2;
                    break;
                case 2:
                    i = 3;
                    break;
                case 3:
                    i = 4;
                    break;
                case 4:
                    i = 5;
                    break;
                case 5:
                    i = 6;
                    break;
                case 6:
                    i = 7;
                    break;
                case 7:
                    i = 8;
                    break;
                case 8:
                    i = 9;
                    break;
                case 9:
                    i = 10;
                    break;
                case 10:
                    i = 11;
                    break;
                case 11:
                    i = 12;
                    break;
                case 12:
                    i = 13;
                    break;
                case 13:
                    i = 14;
                    break;
                default:
                    i = -1;
                    break;
            }
            if (i <= 14 && i > 0) {
                PointF[] positions = contour.getPositions();
                ArrayList arrayList2 = new ArrayList();
                if (positions != null) {
                    for (PointF pointF : positions) {
                        arrayList2.add(new FirebaseVisionPoint(Float.valueOf(pointF.x), Float.valueOf(pointF.y), null));
                    }
                    this.f55964i.put(i, new FirebaseVisionFaceContour(i, arrayList2));
                    arrayList.addAll(arrayList2);
                }
            }
        }
        this.f55964i.put(1, new FirebaseVisionFaceContour(1, arrayList));
        this.f55961f = face.getEulerY();
        this.f55962g = face.getEulerZ();
        this.f55960e = face.getIsSmilingProbability();
        this.f55959d = face.getIsLeftEyeOpenProbability();
        this.f55958c = face.getIsRightEyeOpenProbability();
    }

    /* renamed from: a */
    public static boolean m38324a(int i) {
        return i == 0 || i == 1 || i == 7 || i == 3 || i == 9 || i == 4 || i == 10 || i == 5 || i == 11 || i == 6;
    }

    @NonNull
    public Rect getBoundingBox() {
        return this.f55956a;
    }

    @NonNull
    public FirebaseVisionFaceContour getContour(@FirebaseVisionFaceContour.ContourType int i) {
        FirebaseVisionFaceContour firebaseVisionFaceContour = (FirebaseVisionFaceContour) this.f55964i.get(i);
        if (firebaseVisionFaceContour != null) {
            return firebaseVisionFaceContour;
        }
        return new FirebaseVisionFaceContour(i, new ArrayList());
    }

    public float getHeadEulerAngleY() {
        return this.f55961f;
    }

    public float getHeadEulerAngleZ() {
        return this.f55962g;
    }

    @Nullable
    public FirebaseVisionFaceLandmark getLandmark(@FirebaseVisionFaceLandmark.LandmarkType int i) {
        return (FirebaseVisionFaceLandmark) this.f55963h.get(i);
    }

    public float getLeftEyeOpenProbability() {
        return this.f55959d;
    }

    public float getRightEyeOpenProbability() {
        return this.f55958c;
    }

    public float getSmilingProbability() {
        return this.f55960e;
    }

    public int getTrackingId() {
        return this.f55957b;
    }

    public String toString() {
        zzme zza = zzmc.zzaz("FirebaseVisionFace").zzh("boundingBox", this.f55956a).zzb("trackingId", this.f55957b).zza("rightEyeOpenProbability", this.f55958c).zza("leftEyeOpenProbability", this.f55959d).zza("smileProbability", this.f55960e).zza("eulerY", this.f55961f).zza("eulerZ", this.f55962g);
        zzme zzaz = zzmc.zzaz("Landmarks");
        for (int i = 0; i <= 11; i++) {
            if (m38324a(i)) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("landmark_");
                sb.append(i);
                zzaz.zzh(sb.toString(), getLandmark(i));
            }
        }
        zza.zzh("landmarks", zzaz.toString());
        zzme zzaz2 = zzmc.zzaz("Contours");
        for (int i2 = 1; i2 <= 14; i2++) {
            StringBuilder sb2 = new StringBuilder(19);
            sb2.append("Contour_");
            sb2.append(i2);
            zzaz2.zzh(sb2.toString(), getContour(i2));
        }
        zza.zzh("contours", zzaz2.toString());
        return zza.toString();
    }

    public final void zza(SparseArray<FirebaseVisionFaceContour> sparseArray) {
        this.f55964i.clear();
        for (int i = 0; i < sparseArray.size(); i++) {
            this.f55964i.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
        }
    }

    public final void zzbk(int i) {
        this.f55957b = -1;
    }

    public final SparseArray<FirebaseVisionFaceContour> zzrc() {
        return this.f55964i;
    }
}
