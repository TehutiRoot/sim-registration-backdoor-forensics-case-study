package com.google.android.gms.internal.firebase_ml;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.p015ml.vision.text.RecognizedLanguage;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zztg {

    /* renamed from: a */
    public static final GmsLogger f46061a = new GmsLogger("TextAnnotationConverter", "");

    /* renamed from: a */
    public static String m47470a(zzlq zzlqVar) {
        Preconditions.checkNotNull(zzlqVar, "Input Word can not be null");
        if (zzlqVar.getSymbols() != null && !zzlqVar.getSymbols().isEmpty()) {
            zzll zzllVar = (zzll) zzmy.zzc(zzlqVar.getSymbols());
            if (zzllVar.zzis() != null && zzllVar.zzis().zzjd() != null) {
                return ((zzll) zzmy.zzc(zzlqVar.getSymbols())).zzis().zzjd().getType();
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02a9 A[SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.firebase.p015ml.vision.text.FirebaseVisionText m47469b(com.google.android.gms.internal.firebase_ml.zzlk r25, float r26) {
        /*
            Method dump skipped, instructions count: 698
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zztg.m47469b(com.google.android.gms.internal.firebase_ml.zzlk, float):com.google.firebase.ml.vision.text.FirebaseVisionText");
    }

    public static List<RecognizedLanguage> zze(@Nullable zzln zzlnVar) {
        ArrayList arrayList = new ArrayList();
        if (zzlnVar != null && zzlnVar.zzje() != null) {
            for (zzkt zzktVar : zzlnVar.zzje()) {
                RecognizedLanguage zza = RecognizedLanguage.zza(zzktVar);
                if (zza != null) {
                    arrayList.add(zza);
                }
            }
        }
        return arrayList;
    }
}
