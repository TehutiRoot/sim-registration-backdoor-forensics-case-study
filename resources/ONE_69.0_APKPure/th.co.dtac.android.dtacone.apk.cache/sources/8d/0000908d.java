package com.google.android.gms.internal.firebase_ml;

import android.graphics.Rect;
import androidx.annotation.Nullable;
import com.google.firebase.p015ml.vision.cloud.FirebaseVisionCloudDetectorOptions;

/* loaded from: classes3.dex */
public final class zzry {
    /* renamed from: a */
    public static int m47500a(Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static float zza(@Nullable Float f) {
        if (f == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    @Nullable
    public static String zzca(@FirebaseVisionCloudDetectorOptions.ModelType int i) {
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return "builtin/latest";
        }
        return "builtin/stable";
    }

    public static String zzcd(@Nullable String str) {
        if (str == null) {
            return "";
        }
        return str;
    }

    @Nullable
    public static Rect zza(@Nullable zzkp zzkpVar, float f) {
        if (zzkpVar == null || zzkpVar.zziu() == null || zzkpVar.zziu().size() != 4) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MAX_VALUE;
        for (zzlm zzlmVar : zzkpVar.zziu()) {
            i3 = Math.min(m47500a(zzlmVar.zzjb()), i3);
            i4 = Math.min(m47500a(zzlmVar.zzjc()), i4);
            i = Math.max(m47500a(zzlmVar.zzjb()), i);
            i2 = Math.max(m47500a(zzlmVar.zzjc()), i2);
        }
        return new Rect(Math.round(i3 * f), Math.round(i4 * f), Math.round(i * f), Math.round(i2 * f));
    }
}