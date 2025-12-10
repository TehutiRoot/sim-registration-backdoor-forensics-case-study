package com.google.android.gms.internal.firebase_ml;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.firebase_ml.zznq;
import com.google.android.gms.tasks.Task;
import com.google.firebase.p015ml.common.FirebaseMLException;
import com.google.firebase.p015ml.vision.common.FirebaseVisionImage;
import com.google.firebase.p015ml.vision.label.FirebaseVisionImageLabel;
import com.google.firebase.p015ml.vision.label.FirebaseVisionOnDeviceAutoMLImageLabelerOptions;
import java.io.Closeable;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzsx extends zzsh<List<FirebaseVisionImageLabel>> implements Closeable {

    /* renamed from: c */
    public final zzqo f46064c;

    public zzsx(@NonNull zzqn zzqnVar, @NonNull FirebaseVisionOnDeviceAutoMLImageLabelerOptions firebaseVisionOnDeviceAutoMLImageLabelerOptions) throws FirebaseMLException {
        super(zzqnVar, new zzsw(zzqnVar, firebaseVisionOnDeviceAutoMLImageLabelerOptions));
        zzqo zza = zzqo.zza(zzqnVar, 5);
        this.f46064c = zza;
        zza.zza(zznq.zzad.zzmg().zzb((zznq.zzj) ((zzxh) zznq.zzj.zzlb().zzi(zzoa.NO_ERROR).zzvn())), zzoe.AUTOML_IMAGE_LABELING_CREATE);
    }

    public final Task<List<FirebaseVisionImageLabel>> detectInImage(@NonNull FirebaseVisionImage firebaseVisionImage) {
        return zza(firebaseVisionImage, true, false);
    }
}