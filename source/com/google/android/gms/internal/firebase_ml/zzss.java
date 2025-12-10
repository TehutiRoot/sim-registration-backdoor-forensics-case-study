package com.google.android.gms.internal.firebase_ml;

import android.content.Context;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.firebase_ml.zznq;
import com.google.android.gms.internal.firebase_ml.zzoa;
import com.google.android.gms.internal.firebase_ml.zzsn;
import com.google.android.gms.internal.firebase_ml.zzss;
import com.google.android.gms.vision.label.ImageLabel;
import com.google.android.gms.vision.label.ImageLabeler;
import com.google.firebase.p015ml.common.FirebaseMLException;
import com.google.firebase.p015ml.vision.label.FirebaseVisionImageLabel;
import com.google.firebase.p015ml.vision.label.FirebaseVisionOnDeviceImageLabelerOptions;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzss implements zzqc<List<FirebaseVisionImageLabel>, zzsn>, zzqx {

    /* renamed from: e */
    public static boolean f46038e = true;

    /* renamed from: f */
    public static volatile Boolean f46039f;

    /* renamed from: a */
    public final Context f46040a;

    /* renamed from: b */
    public final FirebaseVisionOnDeviceImageLabelerOptions f46041b;

    /* renamed from: c */
    public final zzqo f46042c;

    /* renamed from: d */
    public ImageLabeler f46043d;

    public zzss(zzqn zzqnVar, FirebaseVisionOnDeviceImageLabelerOptions firebaseVisionOnDeviceImageLabelerOptions) {
        Preconditions.checkNotNull(zzqnVar, "Context can not be null");
        Preconditions.checkNotNull(firebaseVisionOnDeviceImageLabelerOptions, "FirebaseVisionOnDeviceImageLabelerOptions can not be null");
        this.f46040a = zzqnVar.getApplicationContext();
        this.f46041b = firebaseVisionOnDeviceImageLabelerOptions;
        this.f46042c = zzqo.zza(zzqnVar, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.firebase_ml.zzqc
    /* renamed from: b */
    public final synchronized List zza(zzsn zzsnVar) {
        ArrayList arrayList;
        boolean z;
        try {
            if (f46039f == null) {
                Context context = this.f46040a;
                if (DynamiteModule.getLocalVersion(context, "com.google.android.gms.vision.dynamite.ica") <= 0 && DynamiteModule.getLocalVersion(context, "com.google.android.gms.vision.dynamite.imagelabel") <= 0) {
                    z = true;
                    f46039f = Boolean.valueOf(z);
                }
                z = false;
                f46039f = Boolean.valueOf(z);
            }
            if (!f46039f.booleanValue()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ImageLabeler imageLabeler = this.f46043d;
                if (imageLabeler != null) {
                    if (imageLabeler.isOperational()) {
                        SparseArray<ImageLabel> detect = this.f46043d.detect(zzsnVar.zzbuo);
                        arrayList = new ArrayList();
                        if (detect != null) {
                            for (int i = 0; i < detect.size(); i++) {
                                arrayList.add(new FirebaseVisionImageLabel(detect.get(detect.keyAt(i))));
                            }
                        }
                        m47476c(zzoa.NO_ERROR, elapsedRealtime, zzsnVar);
                        f46038e = false;
                    } else {
                        m47476c(zzoa.MODEL_NOT_DOWNLOADED, elapsedRealtime, zzsnVar);
                        throw new FirebaseMLException("Waiting for the label detection model to be downloaded. Please wait.", 14);
                    }
                } else {
                    m47476c(zzoa.UNKNOWN_ERROR, elapsedRealtime, zzsnVar);
                    throw new FirebaseMLException("Model source is unavailable. Please load the model resource first.", 13);
                }
            } else {
                throw new FirebaseMLException("No model is bundled. Please check your app setup to includefirebase-ml-vision-image-label-model dependency.", 14);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    /* renamed from: a */
    public final /* synthetic */ zznq.zzad.zza m47478a(long j, zzoa zzoaVar, zzsn zzsnVar) {
        return zznq.zzad.zzmg().zzb((zznq.zzar) ((zzxh) zznq.zzar.zzng().zze(zznq.zzaf.zzmk().zzj(j).zzk(zzoaVar).zzae(f46038e).zzaf(true).zzag(true)).zzc(this.f46041b.zzrg()).zzk(zzsi.zzc(zzsnVar)).zzvn()));
    }

    /* renamed from: c */
    public final void m47476c(zzoa zzoaVar, long j, zzsn zzsnVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.f46042c.zza(new zzqw(this, elapsedRealtime, zzoaVar, zzsnVar) { // from class: DJ2

            /* renamed from: a */
            public final zzss f968a;

            /* renamed from: b */
            public final long f969b;

            /* renamed from: c */
            public final zzoa f970c;

            /* renamed from: d */
            public final zzsn f971d;

            {
                this.f968a = this;
                this.f969b = elapsedRealtime;
                this.f970c = zzoaVar;
                this.f971d = zzsnVar;
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzqw
            public final zznq.zzad.zza zzov() {
                return this.f968a.m47478a(this.f969b, this.f970c, this.f971d);
            }
        }, zzoe.ON_DEVICE_IMAGE_LABEL_DETECT);
        zzqu zzquVar = CJ2.f700a;
        this.f46042c.zza((zznq.zze.zza) ((zzxh) zznq.zze.zza.zzkp().zzf(zzoaVar).zzr(f46038e).zze(zzsi.zzc(zzsnVar)).zzb(this.f46041b.zzrg()).zzvn()), elapsedRealtime, zzoe.AGGREGATED_ON_DEVICE_IMAGE_LABEL_DETECTION, zzquVar);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzqx
    @WorkerThread
    public final synchronized void release() {
        try {
            ImageLabeler imageLabeler = this.f46043d;
            if (imageLabeler != null) {
                imageLabeler.release();
                this.f46043d = null;
            }
            f46038e = true;
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
        if (this.f46043d == null) {
            this.f46043d = new ImageLabeler.Builder(this.f46040a).setScoreThreshold(this.f46041b.getConfidenceThreshold()).build();
        }
    }
}
