package com.google.firebase.p015ml.vision.cloud.landmark;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.firebase_ml.zzkv;
import com.google.android.gms.internal.firebase_ml.zzlc;
import com.google.android.gms.internal.firebase_ml.zzmt;
import com.google.android.gms.internal.firebase_ml.zzry;
import com.google.firebase.p015ml.vision.common.FirebaseVisionLatLng;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.concurrent.Immutable;

@Immutable
/* renamed from: com.google.firebase.ml.vision.cloud.landmark.FirebaseVisionCloudLandmark */
/* loaded from: classes4.dex */
public class FirebaseVisionCloudLandmark {

    /* renamed from: a */
    public final String f55912a;

    /* renamed from: b */
    public final Rect f55913b;

    /* renamed from: c */
    public final float f55914c;

    /* renamed from: d */
    public final String f55915d;

    /* renamed from: e */
    public final List f55916e;

    public FirebaseVisionCloudLandmark(String str, float f, Rect rect, String str2, List list) {
        this.f55913b = rect;
        this.f55912a = zzmt.zzbb(str);
        this.f55915d = zzmt.zzbb(str2);
        this.f55916e = list;
        if (Float.compare(f, 0.0f) < 0) {
            f = 0.0f;
        } else if (Float.compare(f, 1.0f) > 0) {
            f = 1.0f;
        }
        this.f55914c = f;
    }

    /* renamed from: a */
    public static FirebaseVisionCloudLandmark m38343a(zzkv zzkvVar, float f) {
        ArrayList arrayList;
        if (zzkvVar == null) {
            return null;
        }
        float zza = zzry.zza(zzkvVar.zzix());
        Rect zza2 = zzry.zza(zzkvVar.zziw(), f);
        String description = zzkvVar.getDescription();
        String mid = zzkvVar.getMid();
        List<zzlc> locations = zzkvVar.getLocations();
        if (locations == null) {
            arrayList = new ArrayList();
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (zzlc zzlcVar : locations) {
                if (zzlcVar.zzja() != null && zzlcVar.zzja().zziy() != null && zzlcVar.zzja().zziz() != null) {
                    arrayList2.add(new FirebaseVisionLatLng(zzlcVar.zzja().zziy().doubleValue(), zzlcVar.zzja().zziz().doubleValue()));
                }
            }
            arrayList = arrayList2;
        }
        return new FirebaseVisionCloudLandmark(description, zza, zza2, mid, arrayList);
    }

    @Nullable
    public Rect getBoundingBox() {
        return this.f55913b;
    }

    public float getConfidence() {
        return this.f55914c;
    }

    @NonNull
    public String getEntityId() {
        return this.f55915d;
    }

    @NonNull
    public String getLandmark() {
        return this.f55912a;
    }

    @NonNull
    public List<FirebaseVisionLatLng> getLocations() {
        return this.f55916e;
    }
}
