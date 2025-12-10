package com.google.firebase.p015ml.vision.text;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzqn;
import com.google.android.gms.internal.firebase_ml.zzta;
import com.google.android.gms.internal.firebase_ml.zztc;
import com.google.android.gms.tasks.Task;
import com.google.firebase.p015ml.vision.common.FirebaseVisionImage;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer */
/* loaded from: classes4.dex */
public class FirebaseVisionTextRecognizer implements Closeable {
    public static final int CLOUD = 2;
    public static final int ON_DEVICE = 1;

    /* renamed from: d */
    public static final Map f56039d = new HashMap();

    /* renamed from: e */
    public static final Map f56040e = new HashMap();

    /* renamed from: a */
    public final zztc f56041a;

    /* renamed from: b */
    public final zzta f56042b;

    /* renamed from: c */
    public final int f56043c;

    @Retention(RetentionPolicy.CLASS)
    /* renamed from: com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer$RecognizerType */
    /* loaded from: classes4.dex */
    public @interface RecognizerType {
    }

    public FirebaseVisionTextRecognizer(zztc zztcVar, zzta zztaVar, int i) {
        this.f56043c = i;
        this.f56041a = zztcVar;
        this.f56042b = zztaVar;
    }

    public static synchronized FirebaseVisionTextRecognizer zza(@NonNull zzqn zzqnVar, @Nullable FirebaseVisionCloudTextRecognizerOptions firebaseVisionCloudTextRecognizerOptions, boolean z) {
        synchronized (FirebaseVisionTextRecognizer.class) {
            try {
                Preconditions.checkNotNull(zzqnVar, "MlKitContext must not be null");
                Preconditions.checkNotNull(zzqnVar.getPersistenceKey(), "Persistence key must not be null");
                if (!z) {
                    Preconditions.checkNotNull(firebaseVisionCloudTextRecognizerOptions, "Options must not be null");
                }
                if (z) {
                    zztc zzc = zztc.zzc(zzqnVar);
                    Map map = f56039d;
                    FirebaseVisionTextRecognizer firebaseVisionTextRecognizer = (FirebaseVisionTextRecognizer) map.get(zzc);
                    if (firebaseVisionTextRecognizer == null) {
                        firebaseVisionTextRecognizer = new FirebaseVisionTextRecognizer(zzc, null, 1);
                        map.put(zzc, firebaseVisionTextRecognizer);
                    }
                    return firebaseVisionTextRecognizer;
                }
                zzta zza = zzta.zza(zzqnVar, firebaseVisionCloudTextRecognizerOptions);
                Map map2 = f56040e;
                FirebaseVisionTextRecognizer firebaseVisionTextRecognizer2 = (FirebaseVisionTextRecognizer) map2.get(zza);
                if (firebaseVisionTextRecognizer2 == null) {
                    firebaseVisionTextRecognizer2 = new FirebaseVisionTextRecognizer(null, zza, 2);
                    map2.put(zza, firebaseVisionTextRecognizer2);
                }
                return firebaseVisionTextRecognizer2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        zztc zztcVar = this.f56041a;
        if (zztcVar != null) {
            zztcVar.close();
        }
        zzta zztaVar = this.f56042b;
        if (zztaVar != null) {
            zztaVar.close();
        }
    }

    @RecognizerType
    public int getRecognizerType() {
        return this.f56043c;
    }

    @NonNull
    public Task<FirebaseVisionText> processImage(@NonNull FirebaseVisionImage firebaseVisionImage) {
        boolean z;
        if (this.f56041a == null && this.f56042b == null) {
            z = false;
        } else {
            z = true;
        }
        Preconditions.checkArgument(z, "Either on-device or cloud text recognizer should be enabled.");
        zztc zztcVar = this.f56041a;
        if (zztcVar != null) {
            return zztcVar.processImage(firebaseVisionImage);
        }
        return this.f56042b.processImage(firebaseVisionImage);
    }
}
