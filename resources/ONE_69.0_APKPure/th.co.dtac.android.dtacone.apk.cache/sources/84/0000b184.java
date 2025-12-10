package com.google.firebase.p015ml.vision.objects;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.p015ml.vision.objects.internal.zzj;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.concurrent.Immutable;

@Deprecated
@Immutable
/* renamed from: com.google.firebase.ml.vision.objects.FirebaseVisionObject */
/* loaded from: classes4.dex */
public class FirebaseVisionObject {
    public static final int CATEGORY_FASHION_GOOD = 2;
    public static final int CATEGORY_FOOD = 3;
    public static final int CATEGORY_HOME_GOOD = 1;
    public static final int CATEGORY_PLACE = 4;
    public static final int CATEGORY_PLANT = 5;
    public static final int CATEGORY_UNKNOWN = 0;

    /* renamed from: a */
    public final Rect f56017a;

    /* renamed from: b */
    public final Integer f56018b;

    /* renamed from: c */
    public final Float f56019c;

    /* renamed from: d */
    public final int f56020d;

    @Retention(RetentionPolicy.CLASS)
    /* renamed from: com.google.firebase.ml.vision.objects.FirebaseVisionObject$Category */
    /* loaded from: classes4.dex */
    public @interface Category {
    }

    public FirebaseVisionObject(@NonNull zzj zzjVar) {
        boolean z;
        Preconditions.checkNotNull(zzjVar, "Returned Object Detector Parcel can not be null");
        int[] iArr = zzjVar.zzbxk;
        if (iArr.length == 4) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.f56017a = new Rect(iArr[0], iArr[1], iArr[2], iArr[3]);
        this.f56018b = zzjVar.zzbww;
        this.f56019c = zzjVar.confidence;
        this.f56020d = zzjVar.category;
    }

    @NonNull
    public Rect getBoundingBox() {
        return this.f56017a;
    }

    @Category
    public int getClassificationCategory() {
        return this.f56020d;
    }

    @Nullable
    public Float getClassificationConfidence() {
        return this.f56019c;
    }

    @Nullable
    public Integer getTrackingId() {
        return this.f56018b;
    }
}