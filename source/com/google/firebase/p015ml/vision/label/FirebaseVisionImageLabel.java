package com.google.firebase.p015ml.vision.label;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzkv;
import com.google.android.gms.internal.firebase_ml.zzmt;
import com.google.android.gms.internal.firebase_ml.zzry;
import com.google.android.gms.vision.label.ImageLabel;
import com.google.firebase.p015ml.vision.automl.internal.zzl;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@Immutable
/* renamed from: com.google.firebase.ml.vision.label.FirebaseVisionImageLabel */
/* loaded from: classes4.dex */
public class FirebaseVisionImageLabel {

    /* renamed from: a */
    public final String f55986a;

    /* renamed from: b */
    public final String f55987b;

    /* renamed from: c */
    public final float f55988c;

    public FirebaseVisionImageLabel(@NonNull ImageLabel imageLabel) {
        this(imageLabel.getLabel(), imageLabel.getConfidence(), imageLabel.getMid());
    }

    @Nullable
    public static FirebaseVisionImageLabel zza(@Nullable zzkv zzkvVar) {
        if (zzkvVar == null) {
            return null;
        }
        return new FirebaseVisionImageLabel(zzkvVar.getDescription(), zzry.zza(zzkvVar.zzix()), zzkvVar.getMid());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseVisionImageLabel)) {
            return false;
        }
        FirebaseVisionImageLabel firebaseVisionImageLabel = (FirebaseVisionImageLabel) obj;
        if (Objects.equal(this.f55986a, firebaseVisionImageLabel.getEntityId()) && Objects.equal(this.f55987b, firebaseVisionImageLabel.getText()) && Float.compare(this.f55988c, firebaseVisionImageLabel.getConfidence()) == 0) {
            return true;
        }
        return false;
    }

    public float getConfidence() {
        return this.f55988c;
    }

    @Nullable
    public String getEntityId() {
        return this.f55986a;
    }

    @NonNull
    public String getText() {
        return this.f55987b;
    }

    public int hashCode() {
        return Objects.hashCode(this.f55986a, this.f55987b, Float.valueOf(this.f55988c));
    }

    public FirebaseVisionImageLabel(String str, float f, String str2) {
        this.f55987b = zzmt.zzbb(str);
        this.f55986a = str2;
        if (Float.compare(f, 0.0f) < 0) {
            f = 0.0f;
        } else if (Float.compare(f, 1.0f) > 0) {
            f = 1.0f;
        }
        this.f55988c = f;
    }

    public static FirebaseVisionImageLabel zza(@NonNull zzl zzlVar) {
        Preconditions.checkNotNull(zzlVar, "Returned image label parcel can not be null");
        return new FirebaseVisionImageLabel(zzlVar.text, zzlVar.zzbso, zzlVar.zzbsn);
    }
}
