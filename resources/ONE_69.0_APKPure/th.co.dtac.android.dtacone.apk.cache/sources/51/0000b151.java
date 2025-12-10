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
    public static boolean f55910g = true;

    /* renamed from: a */
    public final Context f55911a;

    /* renamed from: b */
    public final FirebaseVisionBarcodeDetectorOptions f55912b;

    /* renamed from: c */
    public final zzqo f55913c;

    /* renamed from: d */
    public final zzsg f55914d = new zzsg();

    /* renamed from: e */
    public IBarcodeDetector f55915e;

    /* renamed from: f */
    public BarcodeDetector f55916f;

    public zzc(@NonNull zzqn zzqnVar, @NonNull FirebaseVisionBarcodeDetectorOptions firebaseVisionBarcodeDetectorOptions) {
        Preconditions.checkNotNull(zzqnVar, "MlKitContext can not be null");
        Preconditions.checkNotNull(firebaseVisionBarcodeDetectorOptions, "FirebaseVisionBarcodeDetectorOptions can not be null");
        this.f55911a = zzqnVar.getApplicationContext();
        this.f55912b = firebaseVisionBarcodeDetectorOptions;
        this.f55913c = zzqo.zza(zzqnVar, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.firebase_ml.zzqc
    /* renamed from: b */
    public final synchronized List zza(zzsn zzsnVar) {
        ArrayList arrayList;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f55914d.zzb(zzsnVar);
        arrayList = new ArrayList();
        if (this.f55915e != null) {
            try {
                IObjectWrapper wrap = ObjectWrapper.wrap(zzsnVar.zzbuo);
                Frame.Metadata metadata = zzsnVar.zzbuo.getMetadata();
                for (zzd zzdVar : (List) ObjectWrapper.unwrap(this.f55915e.zzb(wrap, new zzsj(metadata.getWidth(), metadata.getHeight(), metadata.getId(), metadata.getTimestampMillis(), metadata.getRotation())))) {
                    arrayList.add(new FirebaseVisionBarcode(zzdVar));
                }
            } catch (RemoteException e) {
                throw new FirebaseMLException("Failed to run barcode detector.", 14, e);
            }
        } else {
            BarcodeDetector barcodeDetector = this.f55916f;
            if (barcodeDetector != null) {
                if (barcodeDetector.isOperational()) {
                    SparseArray<Barcode> detect = this.f55916f.detect(zzsnVar.zzbuo);
                    for (int i = 0; i < detect.size(); i++) {
                        arrayList.add(new FirebaseVisionBarcode(new zzf(detect.get(detect.keyAt(i)))));
                    }
                } else {
                    m38338c(zzoa.MODEL_NOT_DOWNLOADED, elapsedRealtime, zzsnVar, null);
                    throw new FirebaseMLException("Waiting for the barcode detection model to be downloaded. Please wait.", 14);
                }
            } else {
                m38338c(zzoa.UNKNOWN_ERROR, elapsedRealtime, zzsnVar, null);
                throw new FirebaseMLException("Model source is unavailable. Please load the model resource first.", 14);
            }
        }
        m38338c(zzoa.NO_ERROR, elapsedRealtime, zzsnVar, arrayList);
        f55910g = false;
        return arrayList;
    }

    /* renamed from: a */
    public final /* synthetic */ zznq.zzad.zza m38340a(long j, zzoa zzoaVar, List list, List list2, zzsn zzsnVar) {
        boolean z = true;
        zznq.zzao.zzc zzi = zznq.zzao.zznb().zzc(zznq.zzaf.zzmk().zzj(j).zzk(zzoaVar).zzae(f55910g).zzaf(true).zzag(true)).zzc(this.f55912b.zzqt()).zzs(list).zzt(list2).zzi(zzsi.zzc(zzsnVar));
        zznq.zzad.zza zzmg = zznq.zzad.zzmg();
        if (this.f55915e == null) {
            z = false;
        }
        return zzmg.zzad(z).zza(zzi);
    }

    /* renamed from: c */
    public final void m38338c(final zzoa zzoaVar, long j, final zzsn zzsnVar, List list) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                FirebaseVisionBarcode firebaseVisionBarcode = (FirebaseVisionBarcode) it.next();
                arrayList.add(firebaseVisionBarcode.zzqq());
                arrayList2.add(firebaseVisionBarcode.zzqr());
            }
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.f55913c.zza(new zzqw(this, elapsedRealtime, zzoaVar, arrayList, arrayList2, zzsnVar) { // from class: qe2

            /* renamed from: a */
            public final zzc f77253a;

            /* renamed from: b */
            public final long f77254b;

            /* renamed from: c */
            public final zzoa f77255c;

            /* renamed from: d */
            public final List f77256d;

            /* renamed from: e */
            public final List f77257e;

            /* renamed from: f */
            public final zzsn f77258f;

            {
                this.f77253a = this;
                this.f77254b = elapsedRealtime;
                this.f77255c = zzoaVar;
                this.f77256d = arrayList;
                this.f77257e = arrayList2;
                this.f77258f = zzsnVar;
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzqw
            public final zznq.zzad.zza zzov() {
                return this.f77253a.m38340a(this.f77254b, this.f77255c, this.f77256d, this.f77257e, this.f77258f);
            }
        }, zzoe.ON_DEVICE_BARCODE_DETECT);
        zzqu zzquVar = new zzqu(this) { // from class: bl2

            /* renamed from: a */
            public final zzc f39217a;

            {
                this.f39217a = this;
            }
        };
        this.f55913c.zza((zznq.zzc.zza) ((zzxh) zznq.zzc.zza.zzkj().zzd(zzoaVar).zzp(f55910g).zzc(zzsi.zzc(zzsnVar)).zzb(this.f55912b.zzqt()).zzj(arrayList).zzk(arrayList2).zzvn()), elapsedRealtime, zzoe.AGGREGATED_ON_DEVICE_BARCODE_DETECTION, zzquVar);
    }

    /* renamed from: d */
    public final IBarcodeDetector m38337d() {
        if (DynamiteModule.getLocalVersion(this.f55911a, "com.google.firebase.ml.vision.dynamite.barcode") > 0) {
            try {
                return zzh.asInterface(DynamiteModule.load(this.f55911a, DynamiteModule.PREFER_LOCAL, "com.google.firebase.ml.vision.dynamite.barcode").instantiate("com.google.firebase.ml.vision.barcode.BarcodeDetectorCreator")).newBarcodeDetector(new BarcodeDetectorOptionsParcel(this.f55912b.zzqs()));
            } catch (RemoteException | DynamiteModule.LoadingException e) {
                throw new FirebaseMLException("Failed to load barcode detector module.", 14, e);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzqx
    @WorkerThread
    public final synchronized void release() {
        IBarcodeDetector iBarcodeDetector = this.f55915e;
        if (iBarcodeDetector != null) {
            try {
                iBarcodeDetector.stop();
            } catch (RemoteException unused) {
            }
            this.f55915e = null;
        }
        BarcodeDetector barcodeDetector = this.f55916f;
        if (barcodeDetector != null) {
            barcodeDetector.release();
            this.f55916f = null;
        }
        f55910g = true;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzqc
    public final zzqx zzon() {
        return this;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzqx
    @WorkerThread
    public final synchronized void zzow() throws FirebaseMLException {
        try {
            if (this.f55915e == null) {
                this.f55915e = m38337d();
            }
            IBarcodeDetector iBarcodeDetector = this.f55915e;
            if (iBarcodeDetector != null) {
                try {
                    iBarcodeDetector.start();
                    return;
                } catch (RemoteException e) {
                    throw new FirebaseMLException("Failed to start barcode detector pipeline.", 14, e);
                }
            }
            if (this.f55916f == null) {
                this.f55916f = new BarcodeDetector.Builder(this.f55911a).setBarcodeFormats(this.f55912b.zzqs()).build();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}