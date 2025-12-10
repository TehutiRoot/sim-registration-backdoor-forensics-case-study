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
    public static final AtomicBoolean f46056h = new AtomicBoolean(true);

    /* renamed from: a */
    public final zzqn f46057a;

    /* renamed from: b */
    public final FirebaseVisionOnDeviceAutoMLImageLabelerOptions f46058b;

    /* renamed from: c */
    public final zzqo f46059c;

    /* renamed from: d */
    public final FirebaseAutoMLRemoteModel f46060d;

    /* renamed from: e */
    public final FirebaseAutoMLLocalModel f46061e;

    /* renamed from: f */
    public IOnDeviceAutoMLImageLabeler f46062f;

    /* renamed from: g */
    public final AtomicBoolean f46063g = new AtomicBoolean(false);

    public zzsw(zzqn zzqnVar, FirebaseVisionOnDeviceAutoMLImageLabelerOptions firebaseVisionOnDeviceAutoMLImageLabelerOptions) {
        this.f46057a = zzqnVar;
        this.f46058b = firebaseVisionOnDeviceAutoMLImageLabelerOptions;
        this.f46059c = zzqo.zza(zzqnVar, 5);
        this.f46060d = firebaseVisionOnDeviceAutoMLImageLabelerOptions.zzrf();
        this.f46061e = firebaseVisionOnDeviceAutoMLImageLabelerOptions.zzre();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.firebase_ml.zzqc
    /* renamed from: b */
    public final synchronized List zza(zzsn zzsnVar) {
        Preconditions.checkNotNull(zzsnVar, "Mobile vision input can not be null");
        Preconditions.checkNotNull(zzsnVar.zzbuo, "Input frame can not be null");
        boolean z = this.f46063g.get();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f46062f != null) {
            if (zzsnVar.zzbuo.getBitmap() != null) {
                try {
                    IObjectWrapper wrap = ObjectWrapper.wrap(zzsnVar.zzbuo.getBitmap());
                    IOnDeviceAutoMLImageLabeler iOnDeviceAutoMLImageLabeler = this.f46062f;
                    Frame.Metadata metadata = zzsnVar.zzbuo.getMetadata();
                    zzl[] zza = iOnDeviceAutoMLImageLabeler.zza(wrap, new zzsj(metadata.getWidth(), metadata.getHeight(), metadata.getId(), metadata.getTimestampMillis(), metadata.getRotation()));
                    m47482c(zzoa.NO_ERROR, elapsedRealtime, z, zzsnVar);
                    if (zza == null) {
                        return new ArrayList();
                    }
                    ArrayList arrayList = new ArrayList();
                    for (zzl zzlVar : zza) {
                        arrayList.add(FirebaseVisionImageLabel.zza(zzlVar));
                    }
                    f46056h.set(false);
                    return arrayList;
                } catch (RemoteException e) {
                    m47482c(zzoa.UNKNOWN_ERROR, elapsedRealtime, z, zzsnVar);
                    throw new FirebaseMLException("Cannot run on device automl image labeler.", 13, e);
                }
            }
            throw new FirebaseMLException("No image data found.", 3);
        }
        m47482c(zzoa.UNKNOWN_ERROR, elapsedRealtime, z, zzsnVar);
        throw new FirebaseMLException("Image labeler not initialized.", 13);
    }

    /* renamed from: a */
    public final /* synthetic */ zznq.zzad.zza m47484a(long j, zzoa zzoaVar, zzsn zzsnVar, boolean z) {
        FirebaseAutoMLRemoteModel firebaseAutoMLRemoteModel;
        zznq.zzk.zza zzh = zznq.zzk.zzld().zza(zznq.zzaf.zzmk().zzj(j).zzk(zzoaVar).zzae(f46056h.get()).zzaf(true).zzag(true)).zzh(zzsi.zzc(zzsnVar));
        if (z && (firebaseAutoMLRemoteModel = this.f46060d) != null) {
            zzh.zzd(zzv.zza(firebaseAutoMLRemoteModel, zzn.AUTOML));
        } else {
            FirebaseAutoMLLocalModel firebaseAutoMLLocalModel = this.f46061e;
            if (firebaseAutoMLLocalModel != null) {
                zzh.zzd(firebaseAutoMLLocalModel.zza(zzn.AUTOML));
            }
        }
        return zznq.zzad.zzmg().zza(zzh);
    }

    /* renamed from: c */
    public final void m47482c(zzoa zzoaVar, long j, boolean z, zzsn zzsnVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.f46059c.zza(new zzqw(this, elapsedRealtime, zzoaVar, zzsnVar, z) { // from class: CK2

            /* renamed from: a */
            public final zzsw f722a;

            /* renamed from: b */
            public final long f723b;

            /* renamed from: c */
            public final zzoa f724c;

            /* renamed from: d */
            public final zzsn f725d;

            /* renamed from: e */
            public final boolean f726e;

            {
                this.f722a = this;
                this.f723b = elapsedRealtime;
                this.f724c = zzoaVar;
                this.f725d = zzsnVar;
                this.f726e = z;
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzqw
            public final zznq.zzad.zza zzov() {
                return this.f722a.m47484a(this.f723b, this.f724c, this.f725d, this.f726e);
            }
        }, zzoe.AUTOML_IMAGE_LABELING_RUN);
        zzqu zzquVar = BK2.f379a;
        this.f46059c.zza((zznq.zza.C17267zza) ((zzxh) zznq.zza.C17267zza.zzkd().zzb(zzoaVar).zzn(f46056h.get()).zzb(zzsi.zzc(zzsnVar)).zzvn()), elapsedRealtime, zzoe.AGGREGATED_AUTO_ML_IMAGE_LABELING_INFERENCE, zzquVar);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzqx
    public final void release() {
        try {
            IOnDeviceAutoMLImageLabeler iOnDeviceAutoMLImageLabeler = this.f46062f;
            if (iOnDeviceAutoMLImageLabeler != null) {
                iOnDeviceAutoMLImageLabeler.close();
            }
            f46056h.set(true);
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
                if (this.f46062f == null) {
                    zzg asInterface = zzj.asInterface(DynamiteModule.load(this.f46057a.getApplicationContext(), DynamiteModule.PREFER_LOCAL, "com.google.firebase.ml.vision.dynamite.automl").instantiate("com.google.firebase.ml.vision.automl.OnDeviceAutoMLImageLabelerCreator"));
                    if (asInterface != null) {
                        IObjectWrapper wrap = ObjectWrapper.wrap(this.f46057a);
                        FirebaseVisionOnDeviceAutoMLImageLabelerOptions firebaseVisionOnDeviceAutoMLImageLabelerOptions = this.f46058b;
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
                            this.f46062f = asInterface.newOnDeviceAutoMLImageLabeler(wrap, new OnDeviceAutoMLImageLabelerOptionsParcel(firebaseVisionOnDeviceAutoMLImageLabelerOptions.getConfidenceThreshold(), str, str3, str2));
                        }
                        str2 = null;
                        this.f46062f = asInterface.newOnDeviceAutoMLImageLabeler(wrap, new OnDeviceAutoMLImageLabelerOptionsParcel(firebaseVisionOnDeviceAutoMLImageLabelerOptions.getConfidenceThreshold(), str, str3, str2));
                    } else {
                        throw new FirebaseMLException("Can not create on device AutoML Image Labeler.", 14);
                    }
                }
                try {
                    this.f46062f.zzow();
                    this.f46063g.set(this.f46062f.zzpf());
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