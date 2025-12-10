package com.google.android.gms.internal.firebase_ml;

import androidx.annotation.NonNull;
import com.google.android.gms.vision.Frame;
import com.google.firebase.p015ml.vision.common.FirebaseVisionImage;

/* loaded from: classes3.dex */
public final class zzsn implements zzqg {
    public final Frame zzbuo;
    public final FirebaseVisionImage zzbvd;

    public zzsn(@NonNull FirebaseVisionImage firebaseVisionImage, @NonNull Frame frame) {
        this.zzbvd = firebaseVisionImage;
        this.zzbuo = frame;
    }
}
