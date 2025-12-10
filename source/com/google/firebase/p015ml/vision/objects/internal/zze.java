package com.google.firebase.p015ml.vision.objects.internal;

import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.firebase_ml.zzmx;
import com.google.android.gms.internal.firebase_ml.zznq;
import com.google.android.gms.internal.firebase_ml.zzoa;
import com.google.android.gms.internal.firebase_ml.zzoe;
import com.google.android.gms.internal.firebase_ml.zzqc;
import com.google.android.gms.internal.firebase_ml.zzqn;
import com.google.android.gms.internal.firebase_ml.zzqo;
import com.google.android.gms.internal.firebase_ml.zzqu;
import com.google.android.gms.internal.firebase_ml.zzqw;
import com.google.android.gms.internal.firebase_ml.zzqx;
import com.google.android.gms.internal.firebase_ml.zzsi;
import com.google.android.gms.internal.firebase_ml.zzsj;
import com.google.android.gms.internal.firebase_ml.zzsn;
import com.google.android.gms.internal.firebase_ml.zzxh;
import com.google.android.gms.vision.Frame;
import com.google.firebase.p015ml.common.FirebaseMLException;
import com.google.firebase.p015ml.vision.objects.FirebaseVisionObject;
import com.google.firebase.p015ml.vision.objects.FirebaseVisionObjectDetectorOptions;
import com.google.firebase.p015ml.vision.objects.internal.zze;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.firebase.ml.vision.objects.internal.zze */
/* loaded from: classes4.dex */
public final class zze implements zzqc<List<FirebaseVisionObject>, zzsn>, zzqx {

    /* renamed from: g */
    public static final AtomicBoolean f56016g = new AtomicBoolean(true);

    /* renamed from: a */
    public final FirebaseVisionObjectDetectorOptions f56017a;

    /* renamed from: b */
    public final zzqn f56018b;

    /* renamed from: c */
    public final zzqo f56019c;

    /* renamed from: d */
    public long f56020d = -1;

    /* renamed from: e */
    public final zznq.zzaw f56021e;

    /* renamed from: f */
    public IObjectDetector f56022f;

    public zze(@NonNull zzqn zzqnVar, @NonNull FirebaseVisionObjectDetectorOptions firebaseVisionObjectDetectorOptions) {
        zznq.zzaw.zza zzaVar;
        Preconditions.checkNotNull(zzqnVar, "Context can not be null");
        Preconditions.checkNotNull(firebaseVisionObjectDetectorOptions, "FirebaseVisionObjectDetectorOptions can not be null");
        this.f56017a = firebaseVisionObjectDetectorOptions;
        this.f56018b = zzqnVar;
        zzqo zza = zzqo.zza(zzqnVar, 1);
        this.f56019c = zza;
        zznq.zzaw.zzb zznr = zznq.zzaw.zznr();
        int zzrh = firebaseVisionObjectDetectorOptions.zzrh();
        if (zzrh != 1) {
            if (zzrh != 2) {
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unexpected detector mode: ");
                sb.append(zzrh);
                zzaVar = zznq.zzaw.zza.MODE_UNSPECIFIED;
            } else {
                zzaVar = zznq.zzaw.zza.SINGLE_IMAGE;
            }
        } else {
            zzaVar = zznq.zzaw.zza.STREAM;
        }
        zznq.zzaw zzawVar = (zznq.zzaw) ((zzxh) zznr.zzb(zzaVar).zzao(firebaseVisionObjectDetectorOptions.zzrj()).zzap(firebaseVisionObjectDetectorOptions.zzri()).zzvn());
        this.f56021e = zzawVar;
        zza.zza(zznq.zzad.zzmg().zza(zznq.zzav.zznp().zzc(zzawVar).zzm(zzoa.NO_ERROR)), zzoe.ON_DEVICE_OBJECT_CREATE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.firebase_ml.zzqc
    /* renamed from: b */
    public final synchronized List zza(zzsn zzsnVar) {
        Preconditions.checkNotNull(zzsnVar, "Mobile vision input can not bu null");
        Preconditions.checkNotNull(zzsnVar.zzbvd, "Input image can not be null");
        Preconditions.checkNotNull(zzsnVar.zzbuo, "Input frame can not be null");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            if (this.f56022f == null) {
                return zzmx.zzju();
            }
            if (this.f56017a.zzrh() == 1) {
                long j = this.f56020d;
                if (j > 0 && elapsedRealtime - j > 300) {
                    Log.w("ObjectDetectorTask", "Object detector pipeline is reset.");
                    m38317f();
                }
            }
            this.f56020d = elapsedRealtime;
            IObjectWrapper wrap = ObjectWrapper.wrap(zzsnVar.zzbuo);
            IObjectDetector iObjectDetector = this.f56022f;
            Frame.Metadata metadata = zzsnVar.zzbuo.getMetadata();
            zzj[] zzc = iObjectDetector.zzc(wrap, new zzsj(metadata.getWidth(), metadata.getHeight(), metadata.getId(), metadata.getTimestampMillis(), metadata.getRotation()));
            ArrayList arrayList = new ArrayList();
            for (zzj zzjVar : zzc) {
                arrayList.add(new FirebaseVisionObject(zzjVar));
            }
            m38320c(zzoa.NO_ERROR, zzsnVar, arrayList, elapsedRealtime);
            f56016g.set(false);
            return arrayList;
        } catch (RemoteException unused) {
            m38320c(zzoa.UNKNOWN_ERROR, zzsnVar, zzmx.zzju(), elapsedRealtime);
            throw new FirebaseMLException("Cannot run object detector.", 14);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ zznq.zzad.zza m38322a(List list, long j, zzoa zzoaVar, zzsn zzsnVar) {
        zznq.zzan.zza zzaVar;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FirebaseVisionObject firebaseVisionObject = (FirebaseVisionObject) it.next();
            zznq.zzan.zzb zzmz = zznq.zzan.zzmz();
            int classificationCategory = firebaseVisionObject.getClassificationCategory();
            if (classificationCategory != 0) {
                if (classificationCategory != 1) {
                    if (classificationCategory != 2) {
                        if (classificationCategory != 3) {
                            if (classificationCategory != 4) {
                                if (classificationCategory != 5) {
                                    StringBuilder sb = new StringBuilder(32);
                                    sb.append("Unexpected category: ");
                                    sb.append(classificationCategory);
                                    zzaVar = zznq.zzan.zza.CATEGORY_UNKNOWN;
                                } else {
                                    zzaVar = zznq.zzan.zza.CATEGORY_PLANT;
                                }
                            } else {
                                zzaVar = zznq.zzan.zza.CATEGORY_PLACE;
                            }
                        } else {
                            zzaVar = zznq.zzan.zza.CATEGORY_FOOD;
                        }
                    } else {
                        zzaVar = zznq.zzan.zza.CATEGORY_FASHION_GOOD;
                    }
                } else {
                    zzaVar = zznq.zzan.zza.CATEGORY_HOME_GOOD;
                }
            } else {
                zzaVar = zznq.zzan.zza.CATEGORY_UNKNOWN;
            }
            zznq.zzan.zzb zzb = zzmz.zzb(zzaVar);
            if (firebaseVisionObject.getClassificationConfidence() != null) {
                zzb.zzn(firebaseVisionObject.getClassificationConfidence().floatValue());
            }
            if (firebaseVisionObject.getTrackingId() != null) {
                zzb.zzbm(firebaseVisionObject.getTrackingId().intValue());
            }
            arrayList.add((zznq.zzan) ((zzxh) zzb.zzvn()));
        }
        return zznq.zzad.zzmg().zza(zznq.zzax.zznt().zzf(zznq.zzaf.zzmk().zzj(j).zzk(zzoaVar).zzae(f56016g.get()).zzaf(true).zzag(true)).zzl(zzsi.zzc(zzsnVar)).zzd(this.f56021e).zzu(arrayList));
    }

    /* renamed from: c */
    public final void m38320c(final zzoa zzoaVar, final zzsn zzsnVar, final List list, long j) {
        final long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.f56019c.zza(new zzqw(this, list, elapsedRealtime, zzoaVar, zzsnVar) { // from class: Us2

            /* renamed from: a */
            public final zze f6473a;

            /* renamed from: b */
            public final List f6474b;

            /* renamed from: c */
            public final long f6475c;

            /* renamed from: d */
            public final zzoa f6476d;

            /* renamed from: e */
            public final zzsn f6477e;

            {
                this.f6473a = this;
                this.f6474b = list;
                this.f6475c = elapsedRealtime;
                this.f6476d = zzoaVar;
                this.f6477e = zzsnVar;
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzqw
            public final zznq.zzad.zza zzov() {
                return this.f6473a.m38322a(this.f6474b, this.f6475c, this.f6476d, this.f6477e);
            }
        }, zzoe.ON_DEVICE_OBJECT_INFERENCE);
        zzqu zzquVar = Up2.f6458a;
        this.f56019c.zza((zznq.zzf.zza) ((zzxh) zznq.zzf.zza.zzks().zzb(this.f56021e).zzg(zzoaVar).zzu(f56016g.get()).zzf(zzsi.zzc(zzsnVar)).zzt(!list.isEmpty()).zzvn()), elapsedRealtime, zzoe.AGGREGATED_ON_DEVICE_OBJECT_INFERENCE, zzquVar);
    }

    /* renamed from: d */
    public final void m38319d(zzoa zzoaVar) {
        this.f56019c.zza(zznq.zzad.zzmg().zza(zznq.zzay.zznv().zze(this.f56021e).zzn(zzoaVar)), zzoe.ON_DEVICE_OBJECT_LOAD);
    }

    /* renamed from: e */
    public final zzc m38318e() {
        try {
            return zzb.asInterface(DynamiteModule.load(this.f56018b.getApplicationContext(), DynamiteModule.PREFER_LOCAL, "com.google.firebase.ml.vision.dynamite.objects").instantiate("com.google.firebase.ml.vision.objects.ObjectDetectorCreator"));
        } catch (DynamiteModule.LoadingException e) {
            throw new FirebaseMLException("Cannot load object detector module.", 14, e);
        }
    }

    /* renamed from: f */
    public final synchronized void m38317f() {
        try {
            IObjectDetector iObjectDetector = this.f56022f;
            if (iObjectDetector != null) {
                iObjectDetector.stop();
            }
        } catch (RemoteException unused) {
        }
        try {
            IObjectDetector iObjectDetector2 = this.f56022f;
            if (iObjectDetector2 != null) {
                iObjectDetector2.start();
            }
        } catch (RemoteException unused2) {
        }
        f56016g.set(true);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzqx
    @WorkerThread
    public final synchronized void release() {
        try {
            IObjectDetector iObjectDetector = this.f56022f;
            if (iObjectDetector != null) {
                iObjectDetector.stop();
            }
            f56016g.set(true);
            this.f56019c.zza(zznq.zzad.zzmg(), zzoe.ON_DEVICE_OBJECT_CLOSE);
        } catch (RemoteException unused) {
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzqc
    @NonNull
    public final zzqx zzon() {
        return this;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzqx
    @WorkerThread
    public final synchronized void zzow() throws FirebaseMLException {
        try {
            try {
                if (this.f56022f == null) {
                    zzc m38318e = m38318e();
                    if (m38318e != null) {
                        IObjectWrapper wrap = ObjectWrapper.wrap(this.f56018b.getApplicationContext());
                        FirebaseVisionObjectDetectorOptions firebaseVisionObjectDetectorOptions = this.f56017a;
                        this.f56022f = m38318e.newObjectDetector(wrap, new ObjectDetectorOptionsParcel(firebaseVisionObjectDetectorOptions.zzrh(), firebaseVisionObjectDetectorOptions.zzrj(), firebaseVisionObjectDetectorOptions.zzri()));
                        m38319d(zzoa.NO_ERROR);
                    } else {
                        m38319d(zzoa.UNKNOWN_ERROR);
                        throw new FirebaseMLException("Cannot load object detector module.", 14);
                    }
                }
                this.f56022f.start();
            } catch (RemoteException e) {
                m38319d(zzoa.UNKNOWN_ERROR);
                throw new FirebaseMLException("Can not create ObjectDetector", 14, e);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
