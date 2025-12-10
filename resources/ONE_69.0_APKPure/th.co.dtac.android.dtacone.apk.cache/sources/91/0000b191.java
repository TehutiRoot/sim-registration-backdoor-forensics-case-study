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
    public static final AtomicBoolean f56028g = new AtomicBoolean(true);

    /* renamed from: a */
    public final FirebaseVisionObjectDetectorOptions f56029a;

    /* renamed from: b */
    public final zzqn f56030b;

    /* renamed from: c */
    public final zzqo f56031c;

    /* renamed from: d */
    public long f56032d = -1;

    /* renamed from: e */
    public final zznq.zzaw f56033e;

    /* renamed from: f */
    public IObjectDetector f56034f;

    public zze(@NonNull zzqn zzqnVar, @NonNull FirebaseVisionObjectDetectorOptions firebaseVisionObjectDetectorOptions) {
        zznq.zzaw.zza zzaVar;
        Preconditions.checkNotNull(zzqnVar, "Context can not be null");
        Preconditions.checkNotNull(firebaseVisionObjectDetectorOptions, "FirebaseVisionObjectDetectorOptions can not be null");
        this.f56029a = firebaseVisionObjectDetectorOptions;
        this.f56030b = zzqnVar;
        zzqo zza = zzqo.zza(zzqnVar, 1);
        this.f56031c = zza;
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
        this.f56033e = zzawVar;
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
            if (this.f56034f == null) {
                return zzmx.zzju();
            }
            if (this.f56029a.zzrh() == 1) {
                long j = this.f56032d;
                if (j > 0 && elapsedRealtime - j > 300) {
                    Log.w("ObjectDetectorTask", "Object detector pipeline is reset.");
                    m38309f();
                }
            }
            this.f56032d = elapsedRealtime;
            IObjectWrapper wrap = ObjectWrapper.wrap(zzsnVar.zzbuo);
            IObjectDetector iObjectDetector = this.f56034f;
            Frame.Metadata metadata = zzsnVar.zzbuo.getMetadata();
            zzj[] zzc = iObjectDetector.zzc(wrap, new zzsj(metadata.getWidth(), metadata.getHeight(), metadata.getId(), metadata.getTimestampMillis(), metadata.getRotation()));
            ArrayList arrayList = new ArrayList();
            for (zzj zzjVar : zzc) {
                arrayList.add(new FirebaseVisionObject(zzjVar));
            }
            m38312c(zzoa.NO_ERROR, zzsnVar, arrayList, elapsedRealtime);
            f56028g.set(false);
            return arrayList;
        } catch (RemoteException unused) {
            m38312c(zzoa.UNKNOWN_ERROR, zzsnVar, zzmx.zzju(), elapsedRealtime);
            throw new FirebaseMLException("Cannot run object detector.", 14);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ zznq.zzad.zza m38314a(List list, long j, zzoa zzoaVar, zzsn zzsnVar) {
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
        return zznq.zzad.zzmg().zza(zznq.zzax.zznt().zzf(zznq.zzaf.zzmk().zzj(j).zzk(zzoaVar).zzae(f56028g.get()).zzaf(true).zzag(true)).zzl(zzsi.zzc(zzsnVar)).zzd(this.f56033e).zzu(arrayList));
    }

    /* renamed from: c */
    public final void m38312c(zzoa zzoaVar, zzsn zzsnVar, List list, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.f56031c.zza(new zzqw(this, list, elapsedRealtime, zzoaVar, zzsnVar) { // from class: Rt2

            /* renamed from: a */
            public final zze f5667a;

            /* renamed from: b */
            public final List f5668b;

            /* renamed from: c */
            public final long f5669c;

            /* renamed from: d */
            public final zzoa f5670d;

            /* renamed from: e */
            public final zzsn f5671e;

            {
                this.f5667a = this;
                this.f5668b = list;
                this.f5669c = elapsedRealtime;
                this.f5670d = zzoaVar;
                this.f5671e = zzsnVar;
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzqw
            public final zznq.zzad.zza zzov() {
                return this.f5667a.m38314a(this.f5668b, this.f5669c, this.f5670d, this.f5671e);
            }
        }, zzoe.ON_DEVICE_OBJECT_INFERENCE);
        zzqu zzquVar = Rq2.f5653a;
        this.f56031c.zza((zznq.zzf.zza) ((zzxh) zznq.zzf.zza.zzks().zzb(this.f56033e).zzg(zzoaVar).zzu(f56028g.get()).zzf(zzsi.zzc(zzsnVar)).zzt(!list.isEmpty()).zzvn()), elapsedRealtime, zzoe.AGGREGATED_ON_DEVICE_OBJECT_INFERENCE, zzquVar);
    }

    /* renamed from: d */
    public final void m38311d(zzoa zzoaVar) {
        this.f56031c.zza(zznq.zzad.zzmg().zza(zznq.zzay.zznv().zze(this.f56033e).zzn(zzoaVar)), zzoe.ON_DEVICE_OBJECT_LOAD);
    }

    /* renamed from: e */
    public final zzc m38310e() {
        try {
            return zzb.asInterface(DynamiteModule.load(this.f56030b.getApplicationContext(), DynamiteModule.PREFER_LOCAL, "com.google.firebase.ml.vision.dynamite.objects").instantiate("com.google.firebase.ml.vision.objects.ObjectDetectorCreator"));
        } catch (DynamiteModule.LoadingException e) {
            throw new FirebaseMLException("Cannot load object detector module.", 14, e);
        }
    }

    /* renamed from: f */
    public final synchronized void m38309f() {
        try {
            IObjectDetector iObjectDetector = this.f56034f;
            if (iObjectDetector != null) {
                iObjectDetector.stop();
            }
        } catch (RemoteException unused) {
        }
        try {
            IObjectDetector iObjectDetector2 = this.f56034f;
            if (iObjectDetector2 != null) {
                iObjectDetector2.start();
            }
        } catch (RemoteException unused2) {
        }
        f56028g.set(true);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzqx
    @WorkerThread
    public final synchronized void release() {
        try {
            IObjectDetector iObjectDetector = this.f56034f;
            if (iObjectDetector != null) {
                iObjectDetector.stop();
            }
            f56028g.set(true);
            this.f56031c.zza(zznq.zzad.zzmg(), zzoe.ON_DEVICE_OBJECT_CLOSE);
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
                if (this.f56034f == null) {
                    zzc m38310e = m38310e();
                    if (m38310e != null) {
                        IObjectWrapper wrap = ObjectWrapper.wrap(this.f56030b.getApplicationContext());
                        FirebaseVisionObjectDetectorOptions firebaseVisionObjectDetectorOptions = this.f56029a;
                        this.f56034f = m38310e.newObjectDetector(wrap, new ObjectDetectorOptionsParcel(firebaseVisionObjectDetectorOptions.zzrh(), firebaseVisionObjectDetectorOptions.zzrj(), firebaseVisionObjectDetectorOptions.zzri()));
                        m38311d(zzoa.NO_ERROR);
                    } else {
                        m38311d(zzoa.UNKNOWN_ERROR);
                        throw new FirebaseMLException("Cannot load object detector module.", 14);
                    }
                }
                this.f56034f.start();
            } catch (RemoteException e) {
                m38311d(zzoa.UNKNOWN_ERROR);
                throw new FirebaseMLException("Can not create ObjectDetector", 14, e);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}