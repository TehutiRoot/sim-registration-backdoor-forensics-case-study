package com.google.mlkit.vision.face;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.mlkit_vision_face.zzd;
import com.google.android.gms.internal.mlkit_vision_face.zzf;
import com.google.android.gms.internal.mlkit_vision_face.zzn;
import com.google.android.gms.internal.mlkit_vision_face.zzos;
import com.google.android.gms.internal.mlkit_vision_face.zzow;
import com.google.android.gms.internal.mlkit_vision_face.zzpc;
import com.google.android.gms.internal.mlkit_vision_face.zzv;
import com.google.android.gms.internal.mlkit_vision_face.zzw;
import com.google.mlkit.vision.common.internal.CommonConvertUtils;
import com.google.mlkit.vision.face.FaceContour;
import com.google.mlkit.vision.face.FaceLandmark;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes4.dex */
public class Face {

    /* renamed from: a */
    public final Rect f57115a;

    /* renamed from: b */
    public int f57116b;

    /* renamed from: c */
    public final float f57117c;

    /* renamed from: d */
    public final float f57118d;

    /* renamed from: e */
    public final float f57119e;

    /* renamed from: f */
    public final float f57120f;

    /* renamed from: g */
    public final float f57121g;

    /* renamed from: h */
    public final float f57122h;

    /* renamed from: i */
    public final SparseArray f57123i = new SparseArray();

    /* renamed from: j */
    public final SparseArray f57124j = new SparseArray();

    public Face(@NonNull zzf zzfVar, @Nullable Matrix matrix) {
        zzn[] zznVarArr;
        zzd[] zzdVarArr;
        int length;
        float f = zzfVar.zzc;
        float f2 = zzfVar.zze / 2.0f;
        float f3 = zzfVar.zzd;
        float f4 = zzfVar.zzf / 2.0f;
        Rect rect = new Rect((int) (f - f2), (int) (f3 - f4), (int) (f + f2), (int) (f3 + f4));
        this.f57115a = rect;
        if (matrix != null) {
            CommonConvertUtils.transformRect(rect, matrix);
        }
        this.f57116b = zzfVar.zzb;
        for (zzn zznVar : zzfVar.zzj) {
            if (m37181b(zznVar.zzd)) {
                PointF pointF = new PointF(zznVar.zzb, zznVar.zzc);
                if (matrix != null) {
                    CommonConvertUtils.transformPointF(pointF, matrix);
                }
                SparseArray sparseArray = this.f57123i;
                int i = zznVar.zzd;
                sparseArray.put(i, new FaceLandmark(i, pointF));
            }
        }
        for (zzd zzdVar : zzfVar.zzn) {
            int i2 = zzdVar.zzb;
            if (m37182a(i2)) {
                PointF[] pointFArr = zzdVar.zza;
                pointFArr.getClass();
                long length2 = pointFArr.length + 5 + (length / 10);
                ArrayList arrayList = new ArrayList(length2 > 2147483647L ? Integer.MAX_VALUE : (int) length2);
                Collections.addAll(arrayList, pointFArr);
                if (matrix != null) {
                    CommonConvertUtils.transformPointList(arrayList, matrix);
                }
                this.f57124j.put(i2, new FaceContour(i2, arrayList));
            }
        }
        this.f57120f = zzfVar.zzi;
        this.f57121g = zzfVar.zzg;
        this.f57122h = zzfVar.zzh;
        this.f57119e = zzfVar.zzm;
        this.f57118d = zzfVar.zzk;
        this.f57117c = zzfVar.zzl;
    }

    /* renamed from: a */
    public static boolean m37182a(int i) {
        return i <= 15 && i > 0;
    }

    /* renamed from: b */
    public static boolean m37181b(int i) {
        return i == 0 || i == 1 || i == 7 || i == 3 || i == 9 || i == 4 || i == 10 || i == 5 || i == 11 || i == 6;
    }

    @NonNull
    public List<FaceContour> getAllContours() {
        ArrayList arrayList = new ArrayList();
        int size = this.f57124j.size();
        for (int i = 0; i < size; i++) {
            arrayList.add((FaceContour) this.f57124j.valueAt(i));
        }
        return arrayList;
    }

    @NonNull
    public List<FaceLandmark> getAllLandmarks() {
        ArrayList arrayList = new ArrayList();
        int size = this.f57123i.size();
        for (int i = 0; i < size; i++) {
            arrayList.add((FaceLandmark) this.f57123i.valueAt(i));
        }
        return arrayList;
    }

    @NonNull
    public Rect getBoundingBox() {
        return this.f57115a;
    }

    @Nullable
    public FaceContour getContour(@FaceContour.ContourType int i) {
        return (FaceContour) this.f57124j.get(i);
    }

    public float getHeadEulerAngleX() {
        return this.f57120f;
    }

    public float getHeadEulerAngleY() {
        return this.f57121g;
    }

    public float getHeadEulerAngleZ() {
        return this.f57122h;
    }

    @Nullable
    public FaceLandmark getLandmark(@FaceLandmark.LandmarkType int i) {
        return (FaceLandmark) this.f57123i.get(i);
    }

    @Nullable
    public Float getLeftEyeOpenProbability() {
        float f = this.f57119e;
        if (f >= 0.0f && f <= 1.0f) {
            return Float.valueOf(this.f57118d);
        }
        return null;
    }

    @Nullable
    public Float getRightEyeOpenProbability() {
        float f = this.f57117c;
        if (f >= 0.0f && f <= 1.0f) {
            return Float.valueOf(f);
        }
        return null;
    }

    @Nullable
    public Float getSmilingProbability() {
        float f = this.f57119e;
        if (f >= 0.0f && f <= 1.0f) {
            return Float.valueOf(f);
        }
        return null;
    }

    @Nullable
    public Integer getTrackingId() {
        int i = this.f57116b;
        if (i == -1) {
            return null;
        }
        return Integer.valueOf(i);
    }

    @NonNull
    public String toString() {
        zzv zza = zzw.zza("Face");
        zza.zzc("boundingBox", this.f57115a);
        zza.zzb("trackingId", this.f57116b);
        zza.zza("rightEyeOpenProbability", this.f57117c);
        zza.zza("leftEyeOpenProbability", this.f57118d);
        zza.zza("smileProbability", this.f57119e);
        zza.zza("eulerX", this.f57120f);
        zza.zza("eulerY", this.f57121g);
        zza.zza("eulerZ", this.f57122h);
        zzv zza2 = zzw.zza("Landmarks");
        for (int i = 0; i <= 11; i++) {
            if (m37181b(i)) {
                zza2.zzc("landmark_" + i, getLandmark(i));
            }
        }
        zza.zzc("landmarks", zza2.toString());
        zzv zza3 = zzw.zza("Contours");
        for (int i2 = 1; i2 <= 15; i2++) {
            zza3.zzc("Contour_" + i2, getContour(i2));
        }
        zza.zzc("contours", zza3.toString());
        return zza.toString();
    }

    @NonNull
    public final SparseArray zza() {
        return this.f57124j;
    }

    public final void zzb(@NonNull SparseArray sparseArray) {
        this.f57124j.clear();
        for (int i = 0; i < sparseArray.size(); i++) {
            this.f57124j.put(sparseArray.keyAt(i), (FaceContour) sparseArray.valueAt(i));
        }
    }

    public final void zzc(int i) {
        this.f57116b = -1;
    }

    public Face(@NonNull zzow zzowVar, @Nullable Matrix matrix) {
        Rect zzh = zzowVar.zzh();
        this.f57115a = zzh;
        if (matrix != null) {
            CommonConvertUtils.transformRect(zzh, matrix);
        }
        this.f57116b = zzowVar.zzg();
        for (zzpc zzpcVar : zzowVar.zzj()) {
            if (m37181b(zzpcVar.zza())) {
                PointF zzb = zzpcVar.zzb();
                if (matrix != null) {
                    CommonConvertUtils.transformPointF(zzb, matrix);
                }
                this.f57123i.put(zzpcVar.zza(), new FaceLandmark(zzpcVar.zza(), zzb));
            }
        }
        for (zzos zzosVar : zzowVar.zzi()) {
            int zza = zzosVar.zza();
            if (m37182a(zza)) {
                List zzb2 = zzosVar.zzb();
                zzb2.getClass();
                ArrayList arrayList = new ArrayList(zzb2);
                if (matrix != null) {
                    CommonConvertUtils.transformPointList(arrayList, matrix);
                }
                this.f57124j.put(zza, new FaceContour(zza, arrayList));
            }
        }
        this.f57120f = zzowVar.zzf();
        this.f57121g = zzowVar.zzb();
        this.f57122h = -zzowVar.zzd();
        this.f57119e = zzowVar.zze();
        this.f57118d = zzowVar.zza();
        this.f57117c = zzowVar.zzc();
    }
}
