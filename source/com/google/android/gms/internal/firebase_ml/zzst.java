package com.google.android.gms.internal.firebase_ml;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.firebase_ml.zznq;
import com.google.android.gms.tasks.Task;
import com.google.firebase.p015ml.vision.common.FirebaseVisionImage;
import com.google.firebase.p015ml.vision.label.FirebaseVisionImageLabel;
import com.google.firebase.p015ml.vision.label.FirebaseVisionOnDeviceImageLabelerOptions;
import java.io.Closeable;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzst extends zzsh<List<FirebaseVisionImageLabel>> implements Closeable {
    public zzst(@NonNull zzqn zzqnVar, @NonNull FirebaseVisionOnDeviceImageLabelerOptions firebaseVisionOnDeviceImageLabelerOptions) {
        super(zzqnVar, new zzss(zzqnVar, firebaseVisionOnDeviceImageLabelerOptions));
        zzqo.zza(zzqnVar, 1).zza(zznq.zzad.zzmg(), zzoe.ON_DEVICE_IMAGE_LABEL_CREATE);
    }

    public final Task<List<FirebaseVisionImageLabel>> detectInImage(@NonNull FirebaseVisionImage firebaseVisionImage) {
        return zza(firebaseVisionImage, true, false);
    }
}
