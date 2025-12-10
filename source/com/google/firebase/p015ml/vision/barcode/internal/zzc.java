package com.google.firebase.p015ml.vision.barcode.internal;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.firebase_ml.zznq;
import com.google.android.gms.internal.firebase_ml.zzoa;
import com.google.android.gms.internal.firebase_ml.zzoe;
import com.google.android.gms.internal.firebase_ml.zzqc;
import com.google.android.gms.internal.firebase_ml.zzqn;
import com.google.android.gms.internal.firebase_ml.zzqo;
import com.google.android.gms.internal.firebase_ml.zzqu;
import com.google.android.gms.internal.firebase_ml.zzqw;
import com.google.android.gms.internal.firebase_ml.zzqx;
import com.google.android.gms.internal.firebase_ml.zzsg;
import com.google.android.gms.internal.firebase_ml.zzsi;
import com.google.android.gms.internal.firebase_ml.zzsj;
import com.google.android.gms.internal.firebase_ml.zzsn;
import com.google.android.gms.internal.firebase_ml.zzxh;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.BarcodeDetector;
import com.google.firebase.p015ml.common.FirebaseMLException;
import com.google.firebase.p015ml.vision.barcode.FirebaseVisionBarcode;
import com.google.firebase.p015ml.vision.barcode.FirebaseVisionBarcodeDetectorOptions;
import com.google.firebase.p015ml.vision.barcode.internal.zzc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.firebase.ml.vision.barcode.internal.zzc */
/* loaded from: classes4.dex */
public final class zzc implements zzqc<List<FirebaseVisionBarcode>, zzsn>, zzqx {

    /* renamed from: g */
    public static boolean f55898g = true;

    /* renamed from: a */
    public final Context f55899a;

    /* renamed from: b */
    public final FirebaseVisionBarcodeDetectorOptions f55900b;

    /* renamed from: c */
    public final zzqo f55901c;

    /* renamed from: d */
    public final zzsg f55902d = new zzsg();

    /* renamed from: e */
    public IBarcodeDetector f55903e;

    /* renamed from: f */
    public BarcodeDetector f55904f;

    public zzc(@NonNull zzqn zzqnVar, @NonNull FirebaseVisionBarcodeDetectorOptions firebaseVisionBarcodeDetectorOptions) {
        Preconditions.checkNotNull(zzqnVar, "MlKitContext can not be null");
        Preconditions.checkNotNull(firebaseVisionBarcodeDetectorOptions, "FirebaseVisionBarcodeDetectorOptions can not be null");
        this.f55899a = zzqnVar.getApplicationContext();
        this.f55900b = firebaseVisionBarcodeDetectorOptions;
        this.f55901c = zzqo.zza(zzqnVar, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.firebase_ml.zzqc
    /* renamed from: b */
    public final synchronized List zza(zzsn zzsnVar) {
        ArrayList arrayList;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f55902d.zzb(zzsnVar);
        arrayList = new ArrayList();
        if (this.f55903e != null) {
            try {
                IObjectWrapper wrap = ObjectWrapper.wrap(zzsnVar.zzbuo);
                Frame.Metadata metadata = zzsnVar.zzbuo.getMetadata();
                for (zzd zzdVar : (List) ObjectWrapper.unwrap(this.f55903e.zzb(wrap, new zzsj(metadata.getWidth(), metadata.getHeight(), metadata.getId(), metadata.getTimestampMillis(), metadata.getRotation())))) {
                    arrayList.add(new FirebaseVisionBarcode(zzdVar));
                }
            } catch (RemoteException e) {
                throw new FirebaseMLException("Failed to run barcode detector.", 14, e);
            }
        } else {
            BarcodeDetector barcodeDetector = this.f55904f;
            if (barcodeDetector != null) {
                if (barcodeDetector.isOperational()) {
                    SparseArray<Barcode> detect = this.f55904f.detect(zzsnVar.zzbuo);
                    for (int i = 0; i < detect.size(); i++) {
                        arrayList.add(new FirebaseVisionBarcode(new zzf(detect.get(detect.keyAt(i)))));
                    }
                } else {
                    m38346c(zzoa.MODEL_NOT_DOWNLOADED, elapsedRealtime, zzsnVar, null);
                    throw new FirebaseMLException("Waiting for the barcode detection model to be downloaded. Please wait.", 14);
                }
            } else {
                m38346c(zzoa.UNKNOWN_ERROR, elapsedRealtime, zzsnVar, null);
                throw new FirebaseMLException("Model source is unavailable. Please load the model resource first.", 14);
            }
        }
        m38346c(zzoa.NO_ERROR, elapsedRealtime, zzsnVar, arrayList);
        f55898g = false;
        return arrayList;
    }

    /* renamed from: a */
    public final /* synthetic */ zznq.zzad.zza m38348a(long j, zzoa zzoaVar, List list, List list2, zzsn zzsnVar) {
        boolean z = true;
        zznq.zzao.zzc zzi = zznq.zzao.zznb().zzc(zznq.zzaf.zzmk().zzj(j).zzk(zzoaVar).zzae(f55898g).zzaf(true).zzag(true)).zzc(this.f55900b.zzqt()).zzs(list).zzt(list2).zzi(zzsi.zzc(zzsnVar));
        zznq.zzad.zza zzmg = zznq.zzad.zzmg();
        if (this.f55903e == null) {
            z = false;
        }
        return zzmg.zzad(z).zza(zzi);
    }

    /* renamed from: c */
    public final void m38346c(zzoa zzoaVar, long j, zzsn zzsnVar, List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                FirebaseVisionBarcode firebaseVisionBarcode = (FirebaseVisionBarcode) it.next();
                arrayList.add(firebaseVisionBarcode.zzqq());
                arrayList2.add(firebaseVisionBarcode.zzqr());
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.f55901c.zza(new zzqw(this, elapsedRealtime, zzoaVar, arrayList, arrayList2, zzsnVar) { // from class: td2

            /* renamed from: a */
            public final zzc f80167a;

            /* renamed from: b */
            public final long f80168b;

            /* renamed from: c */
            public final zzoa f80169c;

            /* renamed from: d */
            public final List f80170d;

            /* renamed from: e */
            public final List f80171e;

            /* renamed from: f */
            public final zzsn f80172f;

            {
                this.f80167a = this;
                this.f80168b = elapsedRealtime;
                this.f80169c = zzoaVar;
                this.f80170d = arrayList;
                this.f80171e = arrayList2;
                this.f80172f = zzsnVar;
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzqw
            public final zznq.zzad.zza zzov() {
                return this.f80167a.m38348a(this.f80168b, this.f80169c, this.f80170d, this.f80171e, this.f80172f);
            }
        }, zzoe.ON_DEVICE_BARCODE_DETECT);
        zzqu zzquVar = new zzqu(this) { // from class: ek2

            /* renamed from: a */
            public final zzc f61580a;

            {
                this.f61580a = this;
            }
        };
        this.f55901c.zza((zznq.zzc.zza) ((zzxh) zznq.zzc.zza.zzkj().zzd(zzoaVar).zzp(f55898g).zzc(zzsi.zzc(zzsnVar)).zzb(this.f55900b.zzqt()).zzj(arrayList).zzk(arrayList2).zzvn()), elapsedRealtime, zzoe.AGGREGATED_ON_DEVICE_BARCODE_DETECTION, zzquVar);
    }

    /* renamed from: d */
    public final IBarcodeDetector m38345d() {
        if (DynamiteModule.getLocalVersion(this.f55899a, "com.google.firebase.ml.vision.dynamite.barcode") > 0) {
            try {
                return zzh.asInterface(DynamiteModule.load(this.f55899a, DynamiteModule.PREFER_LOCAL, "com.google.firebase.ml.vision.dynamite.barcode").instantiate("com.google.firebase.ml.vision.barcode.BarcodeDetectorCreator")).newBarcodeDetector(new BarcodeDetectorOptionsParcel(this.f55900b.zzqs()));
            } catch (RemoteException | DynamiteModule.LoadingException e) {
                throw new FirebaseMLException("Failed to load barcode detector module.", 14, e);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzqx
    @WorkerThread
    public final synchronized void release() {
        IBarcodeDetector iBarcodeDetector = this.f55903e;
        if (iBarcodeDetector != null) {
            try {
                iBarcodeDetector.stop();
            } catch (RemoteException unused) {
            }
            this.f55903e = null;
        }
        BarcodeDetector barcodeDetector = this.f55904f;
        if (barcodeDetector != null) {
            barcodeDetector.release();
            this.f55904f = null;
        }
        f55898g = true;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzqc
    public final zzqx zzon() {
        return this;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzqx
    @WorkerThread
    public final synchronized void zzow() throws FirebaseMLException {
        try {
            if (this.f55903e == null) {
                this.f55903e = m38345d();
            }
            IBarcodeDetector iBarcodeDetector = this.f55903e;
            if (iBarcodeDetector != null) {
                try {
                    iBarcodeDetector.start();
                    return;
                } catch (RemoteException e) {
                    throw new FirebaseMLException("Failed to start barcode detector pipeline.", 14, e);
                }
            }
            if (this.f55904f == null) {
                this.f55904f = new BarcodeDetector.Builder(this.f55899a).setBarcodeFormats(this.f55900b.zzqs()).build();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
