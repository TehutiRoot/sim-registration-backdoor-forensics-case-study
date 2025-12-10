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
    public static boolean f46055e = true;

    /* renamed from: a */
    public TextRecognizer f46056a;

    /* renamed from: b */
    public final zzsg f46057b = new zzsg();

    /* renamed from: c */
    public final Context f46058c;

    /* renamed from: d */
    public final zzqo f46059d;

    public zztb(zzqn zzqnVar) {
        Preconditions.checkNotNull(zzqnVar, "MlKitContext can not be null");
        this.f46058c = zzqnVar.getApplicationContext();
        this.f46059d = zzqo.zza(zzqnVar, 1);
    }

    /* renamed from: a */
    private final void m47472a(final zzoa zzoaVar, long j, final zzsn zzsnVar) {
        final long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.f46059d.zza(new zzqw(elapsedRealtime, zzoaVar, zzsnVar) { // from class: OJ2

            /* renamed from: a */
            public final long f4371a;

            /* renamed from: b */
            public final zzoa f4372b;

            /* renamed from: c */
            public final zzsn f4373c;

            {
                this.f4371a = elapsedRealtime;
                this.f4372b = zzoaVar;
                this.f4373c = zzsnVar;
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzqw
            public final zznq.zzad.zza zzov() {
                long j2 = this.f4371a;
                zzoa zzoaVar2 = this.f4372b;
                zzsn zzsnVar2 = this.f4373c;
                return zznq.zzad.zzmg().zzb((zznq.zzbd) ((zzxh) zznq.zzbd.zzoc().zzg(zznq.zzaf.zzmk().zzj(j2).zzk(zzoaVar2).zzae(zztb.f46055e).zzaf(true).zzag(true)).zzm(zzsi.zzc(zzsnVar2)).zzvn()));
            }
        }, zzoe.ON_DEVICE_TEXT_DETECT);
        zzqu zzquVar = NJ2.f4071a;
        this.f46059d.zza((zznq.zzi.zza) ((zzxh) zznq.zzi.zza.zzkz().zzh(zzoaVar).zzv(f46055e).zzg(zzsi.zzc(zzsnVar)).zzvn()), elapsedRealtime, zzoe.AGGREGATED_ON_DEVICE_TEXT_DETECTION, zzquVar);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzqc
    /* renamed from: b */
    public final synchronized FirebaseVisionText zza(zzsn zzsnVar) {
        SparseArray<TextBlock> detect;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        TextRecognizer textRecognizer = this.f46056a;
        if (textRecognizer != null) {
            if (textRecognizer.isOperational()) {
                this.f46057b.zzb(zzsnVar);
                detect = this.f46056a.detect(zzsnVar.zzbuo);
                m47472a(zzoa.NO_ERROR, elapsedRealtime, zzsnVar);
                f46055e = false;
            } else {
                m47472a(zzoa.MODEL_NOT_DOWNLOADED, elapsedRealtime, zzsnVar);
                throw new FirebaseMLException("Waiting for the text recognition model to be downloaded. Please wait.", 14);
            }
        } else {
            m47472a(zzoa.UNKNOWN_ERROR, elapsedRealtime, zzsnVar);
            throw new FirebaseMLException("Model source is unavailable. Please load the model resource first.", 13);
        }
        return new FirebaseVisionText(detect);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzqx
    @WorkerThread
    public final synchronized void release() {
        try {
            TextRecognizer textRecognizer = this.f46056a;
            if (textRecognizer != null) {
                textRecognizer.release();
                this.f46056a = null;
            }
            f46055e = true;
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
        if (this.f46056a == null) {
            this.f46056a = new TextRecognizer.Builder(this.f46058c).build();
        }
    }
}
