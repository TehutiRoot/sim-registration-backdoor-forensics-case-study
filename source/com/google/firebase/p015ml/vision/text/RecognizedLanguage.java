package com.google.firebase.p015ml.vision.text;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.firebase_ml.zzkt;

/* renamed from: com.google.firebase.ml.vision.text.RecognizedLanguage */
/* loaded from: classes4.dex */
public class RecognizedLanguage {

    /* renamed from: a */
    public final String f56044a;

    public RecognizedLanguage(String str) {
        this.f56044a = str;
    }

    @Nullable
    public static RecognizedLanguage zza(@Nullable zzkt zzktVar) {
        if (zzktVar != null && zzktVar.getLanguageCode() != null && !zzktVar.getLanguageCode().isEmpty()) {
            return new RecognizedLanguage(zzktVar.getLanguageCode());
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecognizedLanguage)) {
            return false;
        }
        RecognizedLanguage recognizedLanguage = (RecognizedLanguage) obj;
        String str = this.f56044a;
        if (str == null) {
            if (recognizedLanguage.f56044a == null) {
                return true;
            }
            return false;
        }
        return str.equals(recognizedLanguage.f56044a);
    }

    @Nullable
    public String getLanguageCode() {
        return this.f56044a;
    }

    public int hashCode() {
        return Objects.hashCode(this.f56044a);
    }
}
