package com.google.mlkit.vision.face;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_face.zzv;
import com.google.android.gms.internal.mlkit_vision_face.zzw;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* loaded from: classes4.dex */
public class FaceContour {
    public static final int FACE = 1;
    public static final int LEFT_CHEEK = 14;
    public static final int LEFT_EYE = 6;
    public static final int LEFT_EYEBROW_BOTTOM = 3;
    public static final int LEFT_EYEBROW_TOP = 2;
    public static final int LOWER_LIP_BOTTOM = 11;
    public static final int LOWER_LIP_TOP = 10;
    public static final int NOSE_BOTTOM = 13;
    public static final int NOSE_BRIDGE = 12;
    public static final int RIGHT_CHEEK = 15;
    public static final int RIGHT_EYE = 7;
    public static final int RIGHT_EYEBROW_BOTTOM = 5;
    public static final int RIGHT_EYEBROW_TOP = 4;
    public static final int UPPER_LIP_BOTTOM = 9;
    public static final int UPPER_LIP_TOP = 8;

    /* renamed from: a */
    public final int f57137a;

    /* renamed from: b */
    public final List f57138b;

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes4.dex */
    public @interface ContourType {
    }

    public FaceContour(@ContourType int i, @NonNull List list) {
        this.f57137a = i;
        this.f57138b = list;
    }

    @ContourType
    public int getFaceContourType() {
        return this.f57137a;
    }

    @NonNull
    public List<PointF> getPoints() {
        return this.f57138b;
    }

    @NonNull
    public String toString() {
        zzv zza = zzw.zza("FaceContour");
        zza.zzb("type", this.f57137a);
        zza.zzc("points", this.f57138b.toArray());
        return zza.toString();
    }
}