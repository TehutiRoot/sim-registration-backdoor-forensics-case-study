package com.google.android.gms.internal.firebase_ml;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zznq;
import com.google.android.gms.tasks.Task;
import com.google.firebase.p015ml.vision.common.FirebaseVisionImage;
import com.google.firebase.p015ml.vision.text.FirebaseVisionText;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zztc extends zzsh<FirebaseVisionText> implements Closeable {

    /* renamed from: c */
    public static final Map f46060c = new HashMap();

    public zztc(zzqn zzqnVar) {
        super(zzqnVar, new zztb(zzqnVar));
        zzqo.zza(zzqnVar, 1).zza(zznq.zzad.zzmg().zzb(zznq.zzbd.zzod()), zzoe.ON_DEVICE_TEXT_CREATE);
    }

    public static synchronized zztc zzc(@NonNull zzqn zzqnVar) {
        zztc zztcVar;
        synchronized (zztc.class) {
            Preconditions.checkNotNull(zzqnVar, "MlKitContext can not be null.");
            Preconditions.checkNotNull(zzqnVar.getPersistenceKey(), "Persistence key must not be null");
            Map map = f46060c;
            zztcVar = (zztc) map.get(zzqnVar.getPersistenceKey());
            if (zztcVar == null) {
                zztcVar = new zztc(zzqnVar);
                map.put(zzqnVar.getPersistenceKey(), zztcVar);
            }
        }
        return zztcVar;
    }

    public final Task<FirebaseVisionText> processImage(@NonNull FirebaseVisionImage firebaseVisionImage) {
        return super.zza(firebaseVisionImage, false, true);
    }
}
