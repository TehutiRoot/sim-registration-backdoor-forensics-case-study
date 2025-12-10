package com.google.android.gms.internal.firebase_ml;

import android.content.Context;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.firebase_ml.zznq;
import com.google.android.gms.internal.firebase_ml.zzoa;
import com.google.android.gms.internal.firebase_ml.zzsn;
import com.google.android.gms.internal.firebase_ml.zzsp;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.FaceDetector;
import com.google.firebase.p015ml.common.FirebaseMLException;
import com.google.firebase.p015ml.vision.face.FirebaseVisionFace;
import com.google.firebase.p015ml.vision.face.FirebaseVisionFaceDetectorOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class zzsp implements zzqc<List<FirebaseVisionFace>, zzsn>, zzqx {

    /* renamed from: g */
    public static volatile Boolean f46042g;

    /* renamed from: h */
    public static AtomicBoolean f46043h = new AtomicBoolean(true);

    /* renamed from: a */
    public final Context f46044a;

    /* renamed from: b */
    public final FirebaseVisionFaceDetectorOptions f46045b;

    /* renamed from: c */
    public final zzqo f46046c;

    /* renamed from: d */
    public FaceDetector f46047d;

    /* renamed from: e */
    public FaceDetector f46048e;

    /* renamed from: f */
    public final zzsg f46049f = new zzsg();

    public zzsp(@NonNull zzqn zzqnVar, @NonNull FirebaseVisionFaceDetectorOptions firebaseVisionFaceDetectorOptions) {
        Preconditions.checkNotNull(zzqnVar, "MlKitContext can not be null");
        Preconditions.checkNotNull(firebaseVisionFaceDetectorOptions, "FirebaseVisionFaceDetectorOptions can not be null");
        this.f46044a = zzqnVar.getApplicationContext();
        this.f46045b = firebaseVisionFaceDetectorOptions;
        this.f46046c = zzqo.zza(zzqnVar, 1);
    }

    /* renamed from: e */
    public static void m47488e(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((FirebaseVisionFace) it.next()).zzbk(-1);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ zznq.zzad.zza m47492a(long j, zzoa zzoaVar, int i, int i2, zzsn zzsnVar) {
        return zznq.zzad.zzmg().zzb((zznq.zzap) ((zzxh) zznq.zzap.zznd().zzd(zznq.zzaf.zzmk().zzj(j).zzk(zzoaVar).zzae(f46043h.get()).zzaf(true).zzag(true)).zzc(this.f46045b.zzrd()).zzbp(i).zzbq(i2).zzj(zzsi.zzc(zzsnVar)).zzvn()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
        r0 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0131 A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:4:0x0005, B:6:0x000f, B:9:0x0014, B:10:0x0026, B:13:0x002a, B:15:0x0034, B:17:0x0040, B:19:0x0045, B:21:0x0049, B:25:0x0055, B:26:0x005c, B:55:0x012b, B:62:0x013f, B:61:0x013a, B:58:0x0131, B:32:0x0068, B:33:0x0071, B:35:0x0077, B:36:0x0082, B:38:0x0088, B:40:0x0094, B:43:0x009b, B:45:0x00a9, B:47:0x00f9, B:49:0x0107, B:52:0x0119, B:54:0x0124), top: B:67:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013a A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:4:0x0005, B:6:0x000f, B:9:0x0014, B:10:0x0026, B:13:0x002a, B:15:0x0034, B:17:0x0040, B:19:0x0045, B:21:0x0049, B:25:0x0055, B:26:0x005c, B:55:0x012b, B:62:0x013f, B:61:0x013a, B:58:0x0131, B:32:0x0068, B:33:0x0071, B:35:0x0077, B:36:0x0082, B:38:0x0088, B:40:0x0094, B:43:0x009b, B:45:0x00a9, B:47:0x00f9, B:49:0x0107, B:52:0x0119, B:54:0x0124), top: B:67:0x0005 }] */
    @Override // com.google.android.gms.internal.firebase_ml.zzqc
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized java.util.List zza(com.google.android.gms.internal.firebase_ml.zzsn r20) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzsp.zza(com.google.android.gms.internal.firebase_ml.zzsn):java.util.List");
    }

    /* renamed from: c */
    public final synchronized List m47490c(FaceDetector faceDetector, zzsn zzsnVar, long j) {
        ArrayList arrayList;
        boolean z;
        try {
            if (this.f46048e != null) {
                if (f46042g == null) {
                    if (DynamiteModule.getLocalVersion(this.f46044a, "com.google.android.gms.vision.dynamite.face") > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    f46042g = Boolean.valueOf(z);
                }
                if (!f46042g.booleanValue()) {
                    throw new FirebaseMLException("No Face Contour model is bundled. Please check your app setup to include firebase-ml-vision-face-model dependency.", 14);
                }
            }
            if (faceDetector.isOperational()) {
                SparseArray<Face> detect = faceDetector.detect(zzsnVar.zzbuo);
                arrayList = new ArrayList();
                for (int i = 0; i < detect.size(); i++) {
                    arrayList.add(new FirebaseVisionFace(detect.get(detect.keyAt(i))));
                }
            } else {
                m47489d(zzoa.MODEL_NOT_DOWNLOADED, j, zzsnVar, 0, 0);
                throw new FirebaseMLException("Waiting for the face detection model to be downloaded. Please wait.", 14);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    /* renamed from: d */
    public final synchronized void m47489d(final zzoa zzoaVar, long j, final zzsn zzsnVar, final int i, final int i2) {
        final long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.f46046c.zza(new zzqw(this, elapsedRealtime, zzoaVar, i, i2, zzsnVar) { // from class: vK2

            /* renamed from: a */
            public final zzsp f108068a;

            /* renamed from: b */
            public final long f108069b;

            /* renamed from: c */
            public final zzoa f108070c;

            /* renamed from: d */
            public final int f108071d;

            /* renamed from: e */
            public final int f108072e;

            /* renamed from: f */
            public final zzsn f108073f;

            {
                this.f108068a = this;
                this.f108069b = elapsedRealtime;
                this.f108070c = zzoaVar;
                this.f108071d = i;
                this.f108072e = i2;
                this.f108073f = zzsnVar;
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzqw
            public final zznq.zzad.zza zzov() {
                return this.f108068a.m47492a(this.f108069b, this.f108070c, this.f108071d, this.f108072e, this.f108073f);
            }
        }, zzoe.ON_DEVICE_FACE_DETECT);
        zzqu zzquVar = C22845wK2.f108405a;
        this.f46046c.zza((zznq.zzd.zza) ((zzxh) zznq.zzd.zza.zzkm().zze(zzoaVar).zzq(f46043h.get()).zzd(zzsi.zzc(zzsnVar)).zzas(i).zzat(i2).zzb(this.f46045b.zzrd()).zzvn()), elapsedRealtime, zzoe.AGGREGATED_ON_DEVICE_FACE_DETECTION, zzquVar);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzqx
    @WorkerThread
    public final synchronized void release() {
        try {
            FaceDetector faceDetector = this.f46047d;
            if (faceDetector != null) {
                faceDetector.release();
                this.f46047d = null;
            }
            FaceDetector faceDetector2 = this.f46048e;
            if (faceDetector2 != null) {
                faceDetector2.release();
                this.f46048e = null;
            }
            f46043h.set(true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzqc
    public final zzqx zzon() {
        return this;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzqx
    @WorkerThread
    public final synchronized void zzow() {
        try {
            if (this.f46045b.getContourMode() == 2) {
                if (this.f46048e == null) {
                    this.f46048e = new FaceDetector.Builder(this.f46044a).setLandmarkType(2).setMode(2).setTrackingEnabled(false).setProminentFaceOnly(true).build();
                }
                if ((this.f46045b.getLandmarkMode() == 2 || this.f46045b.getClassificationMode() == 2 || this.f46045b.getPerformanceMode() == 2) && this.f46047d == null) {
                    this.f46047d = new FaceDetector.Builder(this.f46044a).setLandmarkType(zzsi.zzcb(this.f46045b.getLandmarkMode())).setClassificationType(zzsi.zzcd(this.f46045b.getClassificationMode())).setMode(zzsi.zzcc(this.f46045b.getPerformanceMode())).setMinFaceSize(this.f46045b.getMinFaceSize()).setTrackingEnabled(this.f46045b.isTrackingEnabled()).build();
                }
            } else if (this.f46047d == null) {
                this.f46047d = new FaceDetector.Builder(this.f46044a).setLandmarkType(zzsi.zzcb(this.f46045b.getLandmarkMode())).setClassificationType(zzsi.zzcd(this.f46045b.getClassificationMode())).setMode(zzsi.zzcc(this.f46045b.getPerformanceMode())).setMinFaceSize(this.f46045b.getMinFaceSize()).setTrackingEnabled(this.f46045b.isTrackingEnabled()).build();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}