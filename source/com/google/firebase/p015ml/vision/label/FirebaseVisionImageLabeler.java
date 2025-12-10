package com.google.firebase.p015ml.vision.label;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzqn;
import com.google.android.gms.internal.firebase_ml.zzqp;
import com.google.android.gms.internal.firebase_ml.zzsr;
import com.google.android.gms.internal.firebase_ml.zzst;
import com.google.android.gms.internal.firebase_ml.zzsx;
import com.google.android.gms.tasks.Task;
import com.google.firebase.p015ml.common.FirebaseMLException;
import com.google.firebase.p015ml.vision.cloud.FirebaseVisionCloudDetectorOptions;
import com.google.firebase.p015ml.vision.common.FirebaseVisionImage;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.firebase.ml.vision.label.FirebaseVisionImageLabeler */
/* loaded from: classes4.dex */
public class FirebaseVisionImageLabeler implements Closeable {
    public static final int CLOUD = 2;
    public static final int ON_DEVICE = 1;
    public static final int ON_DEVICE_AUTOML = 3;

    /* renamed from: f */
    public static final Map f55989f = new HashMap();

    /* renamed from: g */
    public static final Map f55990g = new HashMap();

    /* renamed from: h */
    public static final Map f55991h = new HashMap();

    /* renamed from: a */
    public final zzsr f55992a;

    /* renamed from: b */
    public final zzst f55993b;

    /* renamed from: c */
    public final zzsx f55994c;

    /* renamed from: d */
    public final FirebaseVisionCloudImageLabelerOptions f55995d;

    /* renamed from: e */
    public final int f55996e;

    @Retention(RetentionPolicy.CLASS)
    /* renamed from: com.google.firebase.ml.vision.label.FirebaseVisionImageLabeler$ImageLabelerType */
    /* loaded from: classes4.dex */
    public @interface ImageLabelerType {
    }

    public FirebaseVisionImageLabeler(zzst zzstVar) {
        this(zzstVar, null, null, null);
    }

    public static synchronized FirebaseVisionImageLabeler zza(@NonNull zzqn zzqnVar, @NonNull FirebaseVisionOnDeviceImageLabelerOptions firebaseVisionOnDeviceImageLabelerOptions) {
        FirebaseVisionImageLabeler firebaseVisionImageLabeler;
        synchronized (FirebaseVisionImageLabeler.class) {
            Preconditions.checkNotNull(zzqnVar, "MlKitContext must not be null");
            Preconditions.checkNotNull(zzqnVar.getPersistenceKey(), "Persistence key must not be null");
            zzqp zzj = zzqp.zzj(zzqnVar.getPersistenceKey(), firebaseVisionOnDeviceImageLabelerOptions);
            Map map = f55989f;
            firebaseVisionImageLabeler = (FirebaseVisionImageLabeler) map.get(zzj);
            if (firebaseVisionImageLabeler == null) {
                FirebaseVisionImageLabeler firebaseVisionImageLabeler2 = new FirebaseVisionImageLabeler(new zzst(zzqnVar, firebaseVisionOnDeviceImageLabelerOptions));
                map.put(zzj, firebaseVisionImageLabeler2);
                firebaseVisionImageLabeler = firebaseVisionImageLabeler2;
            }
        }
        return firebaseVisionImageLabeler;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        zzst zzstVar = this.f55993b;
        if (zzstVar != null) {
            zzstVar.close();
        }
        zzsr zzsrVar = this.f55992a;
        if (zzsrVar != null) {
            zzsrVar.close();
        }
        zzsx zzsxVar = this.f55994c;
        if (zzsxVar != null) {
            zzsxVar.close();
        }
    }

    @ImageLabelerType
    public int getImageLabelerType() {
        return this.f55996e;
    }

    @NonNull
    public Task<List<FirebaseVisionImageLabel>> processImage(@NonNull FirebaseVisionImage firebaseVisionImage) {
        boolean z;
        if (this.f55993b == null && this.f55992a == null && this.f55994c == null) {
            z = false;
        } else {
            z = true;
        }
        Preconditions.checkState(z, "One of on-device, cloud, or on-device AutoML image labeler should be set.");
        zzst zzstVar = this.f55993b;
        if (zzstVar != null) {
            return zzstVar.detectInImage(firebaseVisionImage);
        }
        zzsx zzsxVar = this.f55994c;
        if (zzsxVar != null) {
            return zzsxVar.detectInImage(firebaseVisionImage);
        }
        return this.f55992a.detectInImage(firebaseVisionImage).continueWith(new C22648vd2(this));
    }

    public FirebaseVisionImageLabeler(zzsr zzsrVar, FirebaseVisionCloudImageLabelerOptions firebaseVisionCloudImageLabelerOptions) {
        this(null, zzsrVar, null, firebaseVisionCloudImageLabelerOptions);
    }

    public FirebaseVisionImageLabeler(zzsx zzsxVar) {
        this(null, null, zzsxVar, null);
    }

    public FirebaseVisionImageLabeler(zzst zzstVar, zzsr zzsrVar, zzsx zzsxVar, FirebaseVisionCloudImageLabelerOptions firebaseVisionCloudImageLabelerOptions) {
        Preconditions.checkArgument((zzstVar == null && zzsrVar == null && zzsxVar == null) ? false : true, "One of on-device, cloud or on-device AutoML image labeler should be set.");
        this.f55993b = zzstVar;
        this.f55992a = zzsrVar;
        this.f55995d = firebaseVisionCloudImageLabelerOptions;
        this.f55994c = zzsxVar;
        if (zzsrVar != null) {
            this.f55996e = 2;
        } else if (zzstVar != null) {
            this.f55996e = 1;
        } else {
            this.f55996e = 3;
        }
    }

    public static synchronized FirebaseVisionImageLabeler zza(@NonNull zzqn zzqnVar, @NonNull FirebaseVisionOnDeviceAutoMLImageLabelerOptions firebaseVisionOnDeviceAutoMLImageLabelerOptions) throws FirebaseMLException {
        FirebaseVisionImageLabeler firebaseVisionImageLabeler;
        synchronized (FirebaseVisionImageLabeler.class) {
            Preconditions.checkNotNull(zzqnVar, "MlKitContext must not be null");
            Preconditions.checkNotNull(zzqnVar.getPersistenceKey(), "Persistence key must not be null");
            zzqp zzj = zzqp.zzj(zzqnVar.getPersistenceKey(), firebaseVisionOnDeviceAutoMLImageLabelerOptions);
            Map map = f55991h;
            firebaseVisionImageLabeler = (FirebaseVisionImageLabeler) map.get(zzj);
            if (firebaseVisionImageLabeler == null) {
                FirebaseVisionImageLabeler firebaseVisionImageLabeler2 = new FirebaseVisionImageLabeler(new zzsx(zzqnVar, firebaseVisionOnDeviceAutoMLImageLabelerOptions));
                map.put(zzj, firebaseVisionImageLabeler2);
                firebaseVisionImageLabeler = firebaseVisionImageLabeler2;
            }
        }
        return firebaseVisionImageLabeler;
    }

    public static synchronized FirebaseVisionImageLabeler zza(@NonNull zzqn zzqnVar, @NonNull FirebaseVisionCloudImageLabelerOptions firebaseVisionCloudImageLabelerOptions) {
        FirebaseVisionImageLabeler firebaseVisionImageLabeler;
        synchronized (FirebaseVisionImageLabeler.class) {
            try {
                Preconditions.checkNotNull(zzqnVar, "MlKitContext must not be null");
                Preconditions.checkNotNull(zzqnVar.getPersistenceKey(), "Persistence key must not be null");
                zzqp zzj = zzqp.zzj(zzqnVar.getPersistenceKey(), firebaseVisionCloudImageLabelerOptions);
                Map map = f55990g;
                firebaseVisionImageLabeler = (FirebaseVisionImageLabeler) map.get(zzj);
                if (firebaseVisionImageLabeler == null) {
                    FirebaseVisionCloudDetectorOptions.Builder maxResults = new FirebaseVisionCloudDetectorOptions.Builder().setMaxResults(20);
                    if (firebaseVisionCloudImageLabelerOptions.isEnforceCertFingerprintMatch()) {
                        maxResults.enforceCertFingerprintMatch();
                    }
                    firebaseVisionImageLabeler = new FirebaseVisionImageLabeler(new zzsr(zzqnVar, maxResults.build()), firebaseVisionCloudImageLabelerOptions);
                    map.put(zzj, firebaseVisionImageLabeler);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return firebaseVisionImageLabeler;
    }
}
