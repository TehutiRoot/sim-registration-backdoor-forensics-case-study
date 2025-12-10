package com.google.firebase.p015ml.common.internal.modeldownload;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.internal.firebase_ml.zznq;
import com.google.android.gms.internal.firebase_ml.zzoa;
import com.google.android.gms.internal.firebase_ml.zzoe;
import com.google.android.gms.internal.firebase_ml.zzqn;
import com.google.android.gms.internal.firebase_ml.zzqo;
import com.google.android.gms.internal.firebase_ml.zzrc;
import com.google.firebase.p015ml.common.modeldownload.FirebaseRemoteModel;

/* renamed from: com.google.firebase.ml.common.internal.modeldownload.zzy */
/* loaded from: classes4.dex */
public final class zzy {

    /* renamed from: d */
    public static final GmsLogger f55792d = new GmsLogger("ModelDownloadLogger", "");

    /* renamed from: a */
    public final zzqo f55793a;

    /* renamed from: b */
    public final FirebaseRemoteModel f55794b;

    /* renamed from: c */
    public final zzrc f55795c;

    public zzy(@NonNull zzqn zzqnVar, @NonNull FirebaseRemoteModel firebaseRemoteModel) {
        this.f55793a = zzqo.zza(zzqnVar, 4);
        this.f55794b = firebaseRemoteModel;
        this.f55795c = zzrc.zzb(zzqnVar);
    }

    /* renamed from: a */
    public final void m38358a(zzoa zzoaVar, int i) {
        m38357b(zzoaVar, "NA", false, false, zzn.UNKNOWN, zznq.zzak.zzb.MODEL_INFO_RETRIEVAL_FAILED, i);
    }

    /* renamed from: b */
    public final void m38357b(zzoa zzoaVar, String str, boolean z, boolean z2, zzn zznVar, zznq.zzak.zzb zzbVar, int i) {
        zznq.zzak.zza zzk = zznq.zzak.zzmr().zzl(zzoaVar).zza(zzbVar).zzn(i).zzk(zzv.zza(this.f55794b, zznVar));
        if (z) {
            long zzf = this.f55795c.zzf(this.f55794b);
            if (zzf == 0) {
                f55792d.m48400w("ModelDownloadLogger", "Model downloaded without its beginning time recorded.");
            } else {
                long zzg = this.f55795c.zzg(this.f55794b);
                if (zzg == 0) {
                    zzg = SystemClock.elapsedRealtime();
                    this.f55795c.zza(this.f55794b, zzg);
                }
                zzk.zzl(zzg - zzf);
            }
        }
        if (z2) {
            long zzf2 = this.f55795c.zzf(this.f55794b);
            if (zzf2 == 0) {
                f55792d.m48400w("ModelDownloadLogger", "Model downloaded without its beginning time recorded.");
            } else {
                zzk.zzm(SystemClock.elapsedRealtime() - zzf2);
            }
        }
        this.f55793a.zza(zznq.zzad.zzmg().zza(zznq.zzbh.zzoj().zzbt(str)).zza(zzk), zzoe.MODEL_DOWNLOAD);
    }

    /* renamed from: c */
    public final void m38356c(zzoa zzoaVar) {
        m38358a(zzoaVar, 0);
    }

    public final void zza(zzoa zzoaVar, String str, boolean z, zzn zznVar) {
        m38357b(zzoaVar, str, false, false, zznVar, zznq.zzak.zzb.UNKNOWN_STATUS, 0);
    }

    public final void zza(zzoa zzoaVar, boolean z, zzn zznVar, zznq.zzak.zzb zzbVar) {
        m38357b(zzoaVar, "NA", z, false, zznVar, zzbVar, 0);
    }

    public final void zza(zzoa zzoaVar, zzn zznVar, zznq.zzak.zzb zzbVar) {
        m38357b(zzoaVar, "NA", false, true, zznVar, zzbVar, 0);
    }

    public final void zza(boolean z, zzn zznVar, int i) {
        m38357b(zzoa.DOWNLOAD_FAILED, "NA", false, false, zznVar, zznq.zzak.zzb.FAILED, i);
    }
}
