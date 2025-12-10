package com.google.android.gms.internal.firebase_ml;

import android.os.RemoteException;
import android.os.SystemClock;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.firebase_ml.zznq;
import com.google.android.gms.internal.firebase_ml.zzoa;
import com.google.android.gms.internal.firebase_ml.zzsn;
import com.google.android.gms.internal.firebase_ml.zzsw;
import com.google.android.gms.vision.Frame;
import com.google.firebase.p015ml.common.FirebaseMLException;
import com.google.firebase.p015ml.common.internal.modeldownload.zzn;
import com.google.firebase.p015ml.common.internal.modeldownload.zzv;
import com.google.firebase.p015ml.vision.automl.FirebaseAutoMLLocalModel;
import com.google.firebase.p015ml.vision.automl.FirebaseAutoMLRemoteModel;
import com.google.firebase.p015ml.vision.automl.internal.IOnDeviceAutoMLImageLabeler;
import com.google.firebase.p015ml.vision.automl.internal.OnDeviceAutoMLImageLabelerOptionsParcel;
import com.google.firebase.p015ml.vision.automl.internal.zzg;
import com.google.firebase.p015ml.vision.automl.internal.zzj;
import com.google.firebase.p015ml.vision.automl.internal.zzl;
import com.google.firebase.p015ml.vision.label.FirebaseVisionImageLabel;
import com.google.firebase.p015ml.vision.label.FirebaseVisionOnDeviceAutoMLImageLabelerOptions;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class zzsw implements zzqc<List<FirebaseVisionImageLabel>, zzsn>, zzqx {

    /* renamed from: h */
    public static final AtomicBoolean f46044h = new AtomicBoolean(true);

    /* renamed from: a */
    public final zzqn f46045a;

    /* renamed from: b */
    public final FirebaseVisionOnDeviceAutoMLImageLabelerOptions f46046b;

    /* renamed from: c */
    public final zzqo f46047c;

    /* renamed from: d */
    public final FirebaseAutoMLRemoteModel f46048d;

    /* renamed from: e */
    public final FirebaseAutoMLLocalModel f46049e;

    /* renamed from: f */
    public IOnDeviceAutoMLImageLabeler f46050f;

    /* renamed from: g */
    public final AtomicBoolean f46051g = new AtomicBoolean(false);

    public zzsw(zzqn zzqnVar, FirebaseVisionOnDeviceAutoMLImageLabelerOptions firebaseVisionOnDeviceAutoMLImageLabelerOptions) {
        this.f46045a = zzqnVar;
        this.f46046b = firebaseVisionOnDeviceAutoMLImageLabelerOptions;
        this.f46047c = zzqo.zza(zzqnVar, 5);
        this.f46048d = firebaseVisionOnDeviceAutoMLImageLabelerOptions.zzrf();
        this.f46049e = firebaseVisionOnDeviceAutoMLImageLabelerOptions.zzre();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.firebase_ml.zzqc
    /* renamed from: b */
    public final synchronized List zza(zzsn zzsnVar) {
        Preconditions.checkNotNull(zzsnVar, "Mobile vision input can not be null");
        Preconditions.checkNotNull(zzsnVar.zzbuo, "Input frame can not be null");
        boolean z = this.f46051g.get();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f46050f != null) {
            if (zzsnVar.zzbuo.getBitmap() != null) {
                try {
                    IObjectWrapper wrap = ObjectWrapper.wrap(zzsnVar.zzbuo.getBitmap());
                    IOnDeviceAutoMLImageLabeler iOnDeviceAutoMLImageLabeler = this.f46050f;
                    Frame.Metadata metadata = zzsnVar.zzbuo.getMetadata();
                    zzl[] zza = iOnDeviceAutoMLImageLabeler.zza(wrap, new zzsj(metadata.getWidth(), metadata.getHeight(), metadata.getId(), metadata.getTimestampMillis(), metadata.getRotation()));
                    m47473c(zzoa.NO_ERROR, elapsedRealtime, z, zzsnVar);
                    if (zza == null) {
                        return new ArrayList();
                    }
                    ArrayList arrayList = new ArrayList();
                    for (zzl zzlVar : zza) {
                        arrayList.add(FirebaseVisionImageLabel.zza(zzlVar));
                    }
                    f46044h.set(false);
                    return arrayList;
                } catch (RemoteException e) {
                    m47473c(zzoa.UNKNOWN_ERROR, elapsedRealtime, z, zzsnVar);
                    throw new FirebaseMLException("Cannot run on device automl image labeler.", 13, e);
                }
            }
            throw new FirebaseMLException("No image data found.", 3);
        }
        m47473c(zzoa.UNKNOWN_ERROR, elapsedRealtime, z, zzsnVar);
        throw new FirebaseMLException("Image labeler not initialized.", 13);
    }

    /* renamed from: a */
    public final /* synthetic */ zznq.zzad.zza m47475a(long j, zzoa zzoaVar, zzsn zzsnVar, boolean z) {
        FirebaseAutoMLRemoteModel firebaseAutoMLRemoteModel;
        zznq.zzk.zza zzh = zznq.zzk.zzld().zza(zznq.zzaf.zzmk().zzj(j).zzk(zzoaVar).zzae(f46044h.get()).zzaf(true).zzag(true)).zzh(zzsi.zzc(zzsnVar));
        if (z && (firebaseAutoMLRemoteModel = this.f46048d) != null) {
            zzh.zzd(zzv.zza(firebaseAutoMLRemoteModel, zzn.AUTOML));
        } else {
            FirebaseAutoMLLocalModel firebaseAutoMLLocalModel = this.f46049e;
            if (firebaseAutoMLLocalModel != null) {
                zzh.zzd(firebaseAutoMLLocalModel.zza(zzn.AUTOML));
            }
        }
        return zznq.zzad.zzmg().zza(zzh);
    }

    /* renamed from: c */
    public final void m47473c(zzoa zzoaVar, long j, boolean z, zzsn zzsnVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.f46047c.zza(new zzqw(this, elapsedRealtime, zzoaVar, zzsnVar, z) { // from class: FJ2

            /* renamed from: a */
            public final zzsw f1583a;

            /* renamed from: b */
            public final long f1584b;

            /* renamed from: c */
            public final zzoa f1585c;

            /* renamed from: d */
            public final zzsn f1586d;

            /* renamed from: e */
            public final boolean f1587e;

            {
                this.f1583a = this;
                this.f1584b = elapsedRealtime;
                this.f1585c = zzoaVar;
                this.f1586d = zzsnVar;
                this.f1587e = z;
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzqw
            public final zznq.zzad.zza zzov() {
                return this.f1583a.m47475a(this.f1584b, this.f1585c, this.f1586d, this.f1587e);
            }
        }, zzoe.AUTOML_IMAGE_LABELING_RUN);
        zzqu zzquVar = EJ2.f1273a;
        this.f46047c.zza((zznq.zza.C17244zza) ((zzxh) zznq.zza.C17244zza.zzkd().zzb(zzoaVar).zzn(f46044h.get()).zzb(zzsi.zzc(zzsnVar)).zzvn()), elapsedRealtime, zzoe.AGGREGATED_AUTO_ML_IMAGE_LABELING_INFERENCE, zzquVar);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzqx
    public final void release() {
        try {
            IOnDeviceAutoMLImageLabeler iOnDeviceAutoMLImageLabeler = this.f46050f;
            if (iOnDeviceAutoMLImageLabeler != null) {
                iOnDeviceAutoMLImageLabeler.close();
            }
            f46044h.set(true);
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzqc
    public final zzqx zzon() {
        return this;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzqx
    @WorkerThread
    public final synchronized void zzow() throws FirebaseMLException {
        String str;
        String str2;
        try {
            try {
                if (this.f46050f == null) {
                    zzg asInterface = zzj.asInterface(DynamiteModule.load(this.f46045a.getApplicationContext(), DynamiteModule.PREFER_LOCAL, "com.google.firebase.ml.vision.dynamite.automl").instantiate("com.google.firebase.ml.vision.automl.OnDeviceAutoMLImageLabelerCreator"));
                    if (asInterface != null) {
                        IObjectWrapper wrap = ObjectWrapper.wrap(this.f46045a);
                        FirebaseVisionOnDeviceAutoMLImageLabelerOptions firebaseVisionOnDeviceAutoMLImageLabelerOptions = this.f46046b;
                        String str3 = null;
                        if (firebaseVisionOnDeviceAutoMLImageLabelerOptions.zzrf() != null) {
                            str = firebaseVisionOnDeviceAutoMLImageLabelerOptions.zzrf().getModelName();
                        } else {
                            str = null;
                        }
                        if (firebaseVisionOnDeviceAutoMLImageLabelerOptions.zzre() != null) {
                            if (firebaseVisionOnDeviceAutoMLImageLabelerOptions.zzre().getAssetFilePath() != null) {
                                str2 = null;
                                str3 = firebaseVisionOnDeviceAutoMLImageLabelerOptions.zzre().getAssetFilePath();
                            } else if (firebaseVisionOnDeviceAutoMLImageLabelerOptions.zzre().getFilePath() != null) {
                                str2 = firebaseVisionOnDeviceAutoMLImageLabelerOptions.zzre().getFilePath();
                            }
                            this.f46050f = asInterface.newOnDeviceAutoMLImageLabeler(wrap, new OnDeviceAutoMLImageLabelerOptionsParcel(firebaseVisionOnDeviceAutoMLImageLabelerOptions.getConfidenceThreshold(), str, str3, str2));
                        }
                        str2 = null;
                        this.f46050f = asInterface.newOnDeviceAutoMLImageLabeler(wrap, new OnDeviceAutoMLImageLabelerOptionsParcel(firebaseVisionOnDeviceAutoMLImageLabelerOptions.getConfidenceThreshold(), str, str3, str2));
                    } else {
                        throw new FirebaseMLException("Can not create on device AutoML Image Labeler.", 14);
                    }
                }
                try {
                    this.f46050f.zzow();
                    this.f46051g.set(this.f46050f.zzpf());
                } catch (RemoteException e) {
                    throw new FirebaseMLException("Cannot load the AutoML image labeling model.", 14, e);
                }
            } catch (RemoteException e2) {
                throw new FirebaseMLException("Can not create on device AutoML Image Labeler.", 14, e2);
            } catch (DynamiteModule.LoadingException unused) {
                throw new FirebaseMLException("Cannot load automl module. Please add dependency firebase-ml-vision-automl.", 14);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
