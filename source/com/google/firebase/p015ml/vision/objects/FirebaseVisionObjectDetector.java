package com.google.firebase.p015ml.vision.objects;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzqn;
import com.google.android.gms.internal.firebase_ml.zzqp;
import com.google.android.gms.internal.firebase_ml.zzsh;
import com.google.android.gms.tasks.Task;
import com.google.firebase.p015ml.vision.common.FirebaseVisionImage;
import com.google.firebase.p015ml.vision.objects.internal.zze;
import java.io.Closeable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: com.google.firebase.ml.vision.objects.FirebaseVisionObjectDetector */
/* loaded from: classes4.dex */
public class FirebaseVisionObjectDetector extends zzsh<List<FirebaseVisionObject>> implements Closeable {

    /* renamed from: c */
    public static final Map f56009c = new HashMap();

    public FirebaseVisionObjectDetector(zzqn zzqnVar, FirebaseVisionObjectDetectorOptions firebaseVisionObjectDetectorOptions) {
        super(zzqnVar, new zze(zzqnVar, firebaseVisionObjectDetectorOptions));
    }

    public static synchronized FirebaseVisionObjectDetector zza(@NonNull zzqn zzqnVar, @NonNull FirebaseVisionObjectDetectorOptions firebaseVisionObjectDetectorOptions) {
        FirebaseVisionObjectDetector firebaseVisionObjectDetector;
        synchronized (FirebaseVisionObjectDetector.class) {
            Preconditions.checkNotNull(zzqnVar, "You must provide a valid MlKitContext.");
            Preconditions.checkNotNull(zzqnVar.getPersistenceKey(), "Firebase app name must not be null");
            Preconditions.checkNotNull(zzqnVar.getApplicationContext(), "You must provide a valid Context.");
            Preconditions.checkNotNull(firebaseVisionObjectDetectorOptions, "You must provide a valid FirebaseVisionObjectDetectorOptions.");
            zzqp zzj = zzqp.zzj(zzqnVar.getPersistenceKey(), firebaseVisionObjectDetectorOptions);
            Map map = f56009c;
            firebaseVisionObjectDetector = (FirebaseVisionObjectDetector) map.get(zzj);
            if (firebaseVisionObjectDetector == null) {
                firebaseVisionObjectDetector = new FirebaseVisionObjectDetector(zzqnVar, firebaseVisionObjectDetectorOptions);
                map.put(zzj, firebaseVisionObjectDetector);
            }
        }
        return firebaseVisionObjectDetector;
    }

    @NonNull
    public Task<List<FirebaseVisionObject>> processImage(@NonNull FirebaseVisionImage firebaseVisionImage) {
        firebaseVisionImage.zzqy();
        return super.zza(firebaseVisionImage, false, true);
    }
}
