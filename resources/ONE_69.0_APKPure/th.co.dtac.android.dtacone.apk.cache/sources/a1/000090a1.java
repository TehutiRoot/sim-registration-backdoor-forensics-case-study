package com.google.android.gms.internal.firebase_ml;

import android.content.Context;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zznq;
import com.google.android.gms.internal.firebase_ml.zzoa;
import com.google.android.gms.internal.firebase_ml.zzsi;
import com.google.android.gms.internal.firebase_ml.zzsn;
import com.google.android.gms.internal.firebase_ml.zztb;
import com.google.android.gms.internal.firebase_ml.zzxh;
import com.google.android.gms.vision.text.TextBlock;
import com.google.android.gms.vision.text.TextRecognizer;
import com.google.firebase.p015ml.common.FirebaseMLException;
import com.google.firebase.p015ml.vision.text.FirebaseVisionText;

/* loaded from: classes3.dex */
public final class zztb implements zzqc<FirebaseVisionText, zzsn>, zzqx {

    /* renamed from: e */
    public static boolean f46067e = true;

    /* renamed from: a */
    public TextRecognizer f46068a;

    /* renamed from: b */
    public final zzsg f46069b = new zzsg();

    /* renamed from: c */
    public final Context f46070c;

    /* renamed from: d */
    public final zzqo f46071d;

    public zztb(zzqn zzqnVar) {
        Preconditions.checkNotNull(zzqnVar, "MlKitContext can not be null");
        this.f46070c = zzqnVar.getApplicationContext();
        this.f46071d = zzqo.zza(zzqnVar, 1);
    }

    /* renamed from: a */
    private final void m47481a(zzoa zzoaVar, long j, zzsn zzsnVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.f46071d.zza(new zzqw(elapsedRealtime, zzoaVar, zzsnVar) { // from class: LK2

            /* renamed from: a */
            public final long f3578a;

            /* renamed from: b */
            public final zzoa f3579b;

            /* renamed from: c */
            public final zzsn f3580c;

            {
                this.f3578a = elapsedRealtime;
                this.f3579b = zzoaVar;
                this.f3580c = zzsnVar;
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzqw
            public final zznq.zzad.zza zzov() {
                long j2 = this.f3578a;
                zzoa zzoaVar2 = this.f3579b;
                zzsn zzsnVar2 = this.f3580c;
                return zznq.zzad.zzmg().zzb((zznq.zzbd) ((zzxh) zznq.zzbd.zzoc().zzg(zznq.zzaf.zzmk().zzj(j2).zzk(zzoaVar2).zzae(zztb.f46067e).zzaf(true).zzag(true)).zzm(zzsi.zzc(zzsnVar2)).zzvn()));
            }
        }, zzoe.ON_DEVICE_TEXT_DETECT);
        zzqu zzquVar = KK2.f3287a;
        this.f46071d.zza((zznq.zzi.zza) ((zzxh) zznq.zzi.zza.zzkz().zzh(zzoaVar).zzv(f46067e).zzg(zzsi.zzc(zzsnVar)).zzvn()), elapsedRealtime, zzoe.AGGREGATED_ON_DEVICE_TEXT_DETECTION, zzquVar);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzqc
    /* renamed from: b */
    public final synchronized FirebaseVisionText zza(zzsn zzsnVar) {
        SparseArray<TextBlock> detect;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        TextRecognizer textRecognizer = this.f46068a;
        if (textRecognizer != null) {
            if (textRecognizer.isOperational()) {
                this.f46069b.zzb(zzsnVar);
                detect = this.f46068a.detect(zzsnVar.zzbuo);
                m47481a(zzoa.NO_ERROR, elapsedRealtime, zzsnVar);
                f46067e = false;
            } else {
                m47481a(zzoa.MODEL_NOT_DOWNLOADED, elapsedRealtime, zzsnVar);
                throw new FirebaseMLException("Waiting for the text recognition model to be downloaded. Please wait.", 14);
            }
        } else {
            m47481a(zzoa.UNKNOWN_ERROR, elapsedRealtime, zzsnVar);
            throw new FirebaseMLException("Model source is unavailable. Please load the model resource first.", 13);
        }
        return new FirebaseVisionText(detect);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzqx
    @WorkerThread
    public final synchronized void release() {
        try {
            TextRecognizer textRecognizer = this.f46068a;
            if (textRecognizer != null) {
                textRecognizer.release();
                this.f46068a = null;
            }
            f46067e = true;
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
        if (this.f46068a == null) {
            this.f46068a = new TextRecognizer.Builder(this.f46070c).build();
        }
    }
}