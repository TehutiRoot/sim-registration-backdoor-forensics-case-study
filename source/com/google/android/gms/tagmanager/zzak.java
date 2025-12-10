package com.google.android.gms.tagmanager;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.gtm.zzrn;
import com.google.android.gms.internal.gtm.zzro;
import com.google.android.gms.internal.gtm.zzrp;
import com.google.android.gms.internal.gtm.zzrv;

@ShowFirstParty
/* loaded from: classes3.dex */
public final class zzak extends BasePendingResult {
    private final Clock zza;
    private final zzah zzb;
    private final Looper zzc;
    private final zzeb zzd;
    private final int zze;
    private final Context zzf;
    private final TagManager zzg;
    private final String zzh;
    private final zzal zzi;
    private zzaj zzj;
    private final zzrp zzk;
    private volatile zzz zzl;
    private volatile boolean zzm;
    private com.google.android.gms.internal.gtm.zzak zzn;
    private long zzo;
    private String zzp;
    private zzai zzq;
    private zzab zzr;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzak(android.content.Context r21, com.google.android.gms.tagmanager.TagManager r22, android.os.Looper r23, java.lang.String r24, int r25, com.google.android.gms.tagmanager.zzao r26) {
        /*
            r20 = this;
            r0 = r20
            r7 = r21
            r8 = r24
            com.google.android.gms.tagmanager.zzel r9 = new com.google.android.gms.tagmanager.zzel
            r9.<init>(r7, r8)
            com.google.android.gms.tagmanager.zzei r10 = new com.google.android.gms.tagmanager.zzei
            r5 = 0
            r6 = 0
            r1 = r10
            r2 = r21
            r3 = r24
            r4 = r26
            r1.<init>(r2, r3, r4, r5, r6)
            com.google.android.gms.internal.gtm.zzrp r1 = new com.google.android.gms.internal.gtm.zzrp
            r1.<init>(r7)
            com.google.android.gms.common.util.Clock r2 = com.google.android.gms.common.util.DefaultClock.getInstance()
            com.google.android.gms.tagmanager.zzde r3 = new com.google.android.gms.tagmanager.zzde
            java.lang.String r18 = "refreshing"
            com.google.android.gms.common.util.Clock r19 = com.google.android.gms.common.util.DefaultClock.getInstance()
            r12 = 1
            r13 = 5
            r14 = 900000(0xdbba0, double:4.44659E-318)
            r16 = 5000(0x1388, double:2.4703E-320)
            r11 = r3
            r11.<init>(r12, r13, r14, r16, r18, r19)
            com.google.android.gms.tagmanager.zzal r4 = new com.google.android.gms.tagmanager.zzal
            r4.<init>(r7, r8)
            if (r23 != 0) goto L41
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            goto L43
        L41:
            r5 = r23
        L43:
            r0.<init>(r5)
            r0.zzf = r7
            r5 = r22
            r0.zzg = r5
            if (r23 != 0) goto L53
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            goto L55
        L53:
            r5 = r23
        L55:
            r0.zzc = r5
            r0.zzh = r8
            r5 = r25
            r0.zze = r5
            r0.zzj = r9
            r0.zzq = r10
            r0.zzk = r1
            com.google.android.gms.tagmanager.zzah r1 = new com.google.android.gms.tagmanager.zzah
            r5 = 0
            r1.<init>(r0, r5)
            r0.zzb = r1
            com.google.android.gms.internal.gtm.zzak r1 = com.google.android.gms.internal.gtm.zzak.zzf()
            r0.zzn = r1
            r0.zza = r2
            r0.zzd = r3
            r0.zzi = r4
            boolean r1 = r20.zzv()
            if (r1 == 0) goto L88
            com.google.android.gms.tagmanager.zzdz r1 = com.google.android.gms.tagmanager.zzdz.zza()
            java.lang.String r1 = r1.zzb()
            r0.zzo(r1)
        L88:
            r26.zza()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzak.<init>(android.content.Context, com.google.android.gms.tagmanager.TagManager, android.os.Looper, java.lang.String, int, com.google.android.gms.tagmanager.zzao):void");
    }

    public final synchronized void zzr(long j) {
        zzai zzaiVar = this.zzq;
        if (zzaiVar == null) {
            Log.w("GoogleTagManager", "Refresh requested, but no network load scheduler.");
        } else {
            zzaiVar.zza(j, this.zzn.zzh());
        }
    }

    private final void zzs(boolean z) {
        this.zzj.zzd(new zzad(this, null));
        this.zzq.zzc(new zzaf(this, null));
        zzrv zza = this.zzj.zza(this.zze);
        if (zza != null) {
            TagManager tagManager = this.zzg;
            this.zzl = new zzz(tagManager, this.zzc, new Container(this.zzf, tagManager.getDataLayer(), this.zzh, 0L, zza), this.zzb);
        }
        this.zzr = new zzab(this, z);
        if (zzv()) {
            this.zzq.zza(0L, "");
        } else {
            this.zzj.zzb();
        }
    }

    public final synchronized void zzt(com.google.android.gms.internal.gtm.zzak zzakVar) {
        if (this.zzj != null) {
            zzrn zze = zzro.zze();
            zze.zzc(0L);
            zze.zza(com.google.android.gms.internal.gtm.zzac.zzk());
            zze.zzc(this.zzo);
            zze.zza(com.google.android.gms.internal.gtm.zzac.zzk());
            zze.zzb(zzakVar);
            this.zzj.zzc((zzro) zze.zzD());
        }
    }

    public final synchronized void zzu(com.google.android.gms.internal.gtm.zzak zzakVar, long j, boolean z) {
        if (isReady() && this.zzl == null) {
            return;
        }
        this.zzn = zzakVar;
        this.zzo = j;
        long zza = this.zzi.zza();
        zzr(Math.max(0L, Math.min(zza, (this.zzo + zza) - this.zza.currentTimeMillis())));
        Context context = this.zzf;
        TagManager tagManager = this.zzg;
        Container container = new Container(context, tagManager.getDataLayer(), this.zzh, j, zzakVar);
        if (this.zzl == null) {
            this.zzl = new zzz(this.zzg, this.zzc, container, this.zzb);
        } else {
            this.zzl.zzc(container);
        }
        if (!isReady() && this.zzr.zza(container)) {
            setResult(this.zzl);
        }
    }

    public final boolean zzv() {
        zzdz zza = zzdz.zza();
        if ((zza.zze() == 2 || zza.zze() == 3) && this.zzh.equals(zza.zzc())) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* renamed from: zzd */
    public final ContainerHolder createFailedResult(Status status) {
        if (this.zzl != null) {
            return this.zzl;
        }
        Status status2 = Status.RESULT_SUCCESS_CACHE;
        return new zzz(status);
    }

    public final synchronized String zzh() {
        return this.zzp;
    }

    public final void zzl() {
        zzrv zza = this.zzj.zza(this.zze);
        if (zza != null) {
            Context context = this.zzf;
            TagManager tagManager = this.zzg;
            setResult(new zzz(this.zzg, this.zzc, new Container(context, tagManager.getDataLayer(), this.zzh, 0L, zza), new zzaa(this)));
        } else {
            setResult(createFailedResult(new Status(10, "Default was requested, but no default container was found", (PendingIntent) null)));
        }
        this.zzq = null;
        this.zzj = null;
    }

    public final void zzm() {
        zzs(true);
    }

    public final void zzn() {
        zzs(false);
    }

    @VisibleForTesting
    public final synchronized void zzo(String str) {
        this.zzp = str;
        zzai zzaiVar = this.zzq;
        if (zzaiVar != null) {
            zzaiVar.zzb(str);
        }
    }
}
