package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.BinderThread;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzc;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
public final class zzgq extends zzed {

    /* renamed from: a */
    public final zzkz f48395a;

    /* renamed from: b */
    public Boolean f48396b;

    /* renamed from: c */
    public String f48397c;

    public zzgq(zzkz zzkzVar, String str) {
        Preconditions.checkNotNull(zzkzVar);
        this.f48395a = zzkzVar;
        this.f48397c = null;
    }

    /* renamed from: a */
    public final void m46268a(zzaw zzawVar, zzq zzqVar) {
        this.f48395a.m46186a();
        this.f48395a.m46182e(zzawVar, zzqVar);
    }

    /* renamed from: b */
    public final zzaw m46267b(zzaw zzawVar, zzq zzqVar) {
        zzau zzauVar;
        if (Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(zzawVar.zza) && (zzauVar = zzawVar.zzb) != null && zzauVar.zza() != 0) {
            String m46341j = zzawVar.zzb.m46341j("_cis");
            if ("referrer broadcast".equals(m46341j) || "referrer API".equals(m46341j)) {
                this.f48395a.zzay().zzi().zzb("Event has been filtered ", zzawVar.toString());
                return new zzaw("_cmpx", zzawVar.zzb, zzawVar.zzc, zzawVar.zzd);
            }
        }
        return zzawVar;
    }

    /* renamed from: d */
    public final void m46265d(zzaw zzawVar, zzq zzqVar) {
        zzc zzcVar;
        if (!this.f48395a.zzo().zzo(zzqVar.zza)) {
            m46268a(zzawVar, zzqVar);
            return;
        }
        this.f48395a.zzay().zzj().zzb("EES config found for", zzqVar.zza);
        zzfp zzo = this.f48395a.zzo();
        String str = zzqVar.zza;
        if (TextUtils.isEmpty(str)) {
            zzcVar = null;
        } else {
            zzcVar = (zzc) zzo.f48348h.get(str);
        }
        if (zzcVar != null) {
            try {
                Map m46133x = this.f48395a.zzu().m46133x(zzawVar.zzb.zzc(), true);
                String zza = zzgv.zza(zzawVar.zza);
                if (zza == null) {
                    zza = zzawVar.zza;
                }
                if (zzcVar.zze(new zzaa(zza, zzawVar.zzd, m46133x))) {
                    if (zzcVar.zzg()) {
                        this.f48395a.zzay().zzj().zzb("EES edited event", zzawVar.zza);
                        m46268a(this.f48395a.zzu().m46141p(zzcVar.zza().zzb()), zzqVar);
                    } else {
                        m46268a(zzawVar, zzqVar);
                    }
                    if (zzcVar.zzf()) {
                        for (zzaa zzaaVar : zzcVar.zza().zzc()) {
                            this.f48395a.zzay().zzj().zzb("EES logging created event", zzaaVar.zzd());
                            m46268a(this.f48395a.zzu().m46141p(zzaaVar), zzqVar);
                        }
                        return;
                    }
                    return;
                }
            } catch (com.google.android.gms.internal.measurement.zzd unused) {
                this.f48395a.zzay().zzd().zzc("EES error. appId, eventName", zzqVar.zzb, zzawVar.zza);
            }
            this.f48395a.zzay().zzj().zzb("EES was not applied to event", zzawVar.zza);
            m46268a(zzawVar, zzqVar);
            return;
        }
        this.f48395a.zzay().zzj().zzb("EES not loaded for", zzqVar.zza);
        m46268a(zzawVar, zzqVar);
    }

    /* renamed from: e */
    public final /* synthetic */ void m46264e(String str, Bundle bundle) {
        C18866Zb2 zzi = this.f48395a.zzi();
        zzi.zzg();
        zzi.zzW();
        byte[] zzbv = zzi.zzf.zzu().m46140q(new zzar(zzi.zzs, "", str, "dep", 0L, 0L, bundle)).zzbv();
        zzi.zzs.zzay().zzj().zzc("Saving default event parameters, appId, data size", zzi.zzs.zzj().zzd(str), Integer.valueOf(zzbv.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", zzbv);
        try {
            if (zzi.m65209D().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                zzi.zzs.zzay().zzd().zzb("Failed to insert default event parameters (got -1). appId", zzeo.zzn(str));
            }
        } catch (SQLiteException e) {
            zzi.zzs.zzay().zzd().zzc("Error storing default event parameters. appId", zzeo.zzn(str), e);
        }
    }

    /* renamed from: f */
    public final void m46263f(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        if (this.f48395a.zzaz().zzs()) {
            runnable.run();
        } else {
            this.f48395a.zzaz().zzp(runnable);
        }
    }

    /* renamed from: g */
    public final void m46262g(zzq zzqVar, boolean z) {
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        m46261h(zzqVar.zza, false);
        this.f48395a.zzv().m46098n(zzqVar.zzb, zzqVar.zzq);
    }

    /* renamed from: h */
    public final void m46261h(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.f48396b == null) {
                        if ("com.google.android.gms".equals(this.f48397c) || UidVerifier.isGooglePlayServicesUid(this.f48395a.zzau(), Binder.getCallingUid()) || GoogleSignatureVerifier.getInstance(this.f48395a.zzau()).isUidGoogleSigned(Binder.getCallingUid())) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.f48396b = Boolean.valueOf(z2);
                    }
                    if (this.f48396b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.f48395a.zzay().zzd().zzb("Measurement Service called with invalid calling package. appId", zzeo.zzn(str));
                    throw e;
                }
            }
            if (this.f48397c == null && GooglePlayServicesUtilLight.uidHasPackageName(this.f48395a.zzau(), Binder.getCallingUid(), str)) {
                this.f48397c = str;
            }
            if (str.equals(this.f48397c)) {
                return;
            }
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
        this.f48395a.zzay().zzd().zza("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    @BinderThread
    public final String zzd(zzq zzqVar) {
        m46262g(zzqVar, false);
        return this.f48395a.m46189Q(zzqVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    @BinderThread
    public final List zze(zzq zzqVar, boolean z) {
        m46262g(zzqVar, false);
        String str = zzqVar.zza;
        Preconditions.checkNotNull(str);
        try {
            List<C21211nE2> list = (List) this.f48395a.zzaz().zzh(new Gr2(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C21211nE2 c21211nE2 : list) {
                if (!z && zzlh.m46087y(c21211nE2.f72165c)) {
                }
                arrayList.add(new zzlc(c21211nE2));
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            this.f48395a.zzay().zzd().zzc("Failed to get user properties. appId", zzeo.zzn(zzqVar.zza), e);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            this.f48395a.zzay().zzd().zzc("Failed to get user properties. appId", zzeo.zzn(zzqVar.zza), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    @BinderThread
    public final List zzf(String str, String str2, zzq zzqVar) {
        m46262g(zzqVar, false);
        String str3 = zzqVar.zza;
        Preconditions.checkNotNull(str3);
        try {
            return (List) this.f48395a.zzaz().zzh(new Eq2(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f48395a.zzay().zzd().zzb("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    @BinderThread
    public final List zzg(String str, String str2, String str3) {
        m46261h(str, true);
        try {
            return (List) this.f48395a.zzaz().zzh(new Jq2(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f48395a.zzay().zzd().zzb("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    @BinderThread
    public final List zzh(String str, String str2, boolean z, zzq zzqVar) {
        m46262g(zzqVar, false);
        String str3 = zzqVar.zza;
        Preconditions.checkNotNull(str3);
        try {
            List<C21211nE2> list = (List) this.f48395a.zzaz().zzh(new CallableC22343tq2(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C21211nE2 c21211nE2 : list) {
                if (!z && zzlh.m46087y(c21211nE2.f72165c)) {
                }
                arrayList.add(new zzlc(c21211nE2));
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            this.f48395a.zzay().zzd().zzc("Failed to query user properties. appId", zzeo.zzn(zzqVar.zza), e);
            return Collections.emptyList();
        } catch (ExecutionException e2) {
            e = e2;
            this.f48395a.zzay().zzd().zzc("Failed to query user properties. appId", zzeo.zzn(zzqVar.zza), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    @BinderThread
    public final List zzi(String str, String str2, String str3, boolean z) {
        m46261h(str, true);
        try {
            List<C21211nE2> list = (List) this.f48395a.zzaz().zzh(new CallableC23203yq2(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C21211nE2 c21211nE2 : list) {
                if (!z && zzlh.m46087y(c21211nE2.f72165c)) {
                }
                arrayList.add(new zzlc(c21211nE2));
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            this.f48395a.zzay().zzd().zzc("Failed to get user properties as. appId", zzeo.zzn(str), e);
            return Collections.emptyList();
        } catch (ExecutionException e2) {
            e = e2;
            this.f48395a.zzay().zzd().zzc("Failed to get user properties as. appId", zzeo.zzn(str), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    @BinderThread
    public final void zzj(zzq zzqVar) {
        m46262g(zzqVar, false);
        m46263f(new Mr2(this, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    @BinderThread
    public final void zzk(zzaw zzawVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzawVar);
        m46262g(zzqVar, false);
        m46263f(new RunnableC20454ir2(this, zzawVar, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    @BinderThread
    public final void zzl(zzaw zzawVar, String str, String str2) {
        Preconditions.checkNotNull(zzawVar);
        Preconditions.checkNotEmpty(str);
        m46261h(str, true);
        m46263f(new RunnableC21486or2(this, zzawVar, str));
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    @BinderThread
    public final void zzm(zzq zzqVar) {
        Preconditions.checkNotEmpty(zzqVar.zza);
        m46261h(zzqVar.zza, false);
        m46263f(new Oq2(this, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    @BinderThread
    public final void zzn(zzac zzacVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotNull(zzacVar.zzc);
        m46262g(zzqVar, false);
        zzac zzacVar2 = new zzac(zzacVar);
        zzacVar2.zza = zzqVar.zza;
        m46263f(new RunnableC20623jq2(this, zzacVar2, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    @BinderThread
    public final void zzo(zzac zzacVar) {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotNull(zzacVar.zzc);
        Preconditions.checkNotEmpty(zzacVar.zza);
        m46261h(zzacVar.zza, true);
        m46263f(new RunnableC21483oq2(this, new zzac(zzacVar)));
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    @BinderThread
    public final void zzp(zzq zzqVar) {
        Preconditions.checkNotEmpty(zzqVar.zza);
        Preconditions.checkNotNull(zzqVar.zzv);
        RunnableC19422cr2 runnableC19422cr2 = new RunnableC19422cr2(this, zzqVar);
        Preconditions.checkNotNull(runnableC19422cr2);
        if (this.f48395a.zzaz().zzs()) {
            runnableC19422cr2.run();
        } else {
            this.f48395a.zzaz().zzq(runnableC19422cr2);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    @BinderThread
    public final void zzq(long j, String str, String str2, String str3) {
        m46263f(new Rr2(this, str2, str3, str, j));
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    @BinderThread
    public final void zzr(final Bundle bundle, zzq zzqVar) {
        m46262g(zzqVar, false);
        final String str = zzqVar.zza;
        Preconditions.checkNotNull(str);
        m46263f(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzfz
            {
                zzgq.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzgq.this.m46264e(str, bundle);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    @BinderThread
    public final void zzs(zzq zzqVar) {
        m46262g(zzqVar, false);
        m46263f(new Vq2(this, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    @BinderThread
    public final void zzt(zzlc zzlcVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzlcVar);
        m46262g(zzqVar, false);
        m46263f(new Ar2(this, zzlcVar, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    @BinderThread
    public final byte[] zzu(zzaw zzawVar, String str) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzawVar);
        m46261h(str, true);
        this.f48395a.zzay().zzc().zzb("Log and bundle. event", this.f48395a.zzj().zzd(zzawVar.zza));
        long nanoTime = this.f48395a.zzav().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f48395a.zzaz().zzi(new CallableC6734i(this, zzawVar, str)).get();
            if (bArr == null) {
                this.f48395a.zzay().zzd().zzb("Log and bundle returned null. appId", zzeo.zzn(str));
                bArr = new byte[0];
            }
            this.f48395a.zzay().zzc().zzd("Log and bundle processed. event, size, time_ms", this.f48395a.zzj().zzd(zzawVar.zza), Integer.valueOf(bArr.length), Long.valueOf((this.f48395a.zzav().nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException e) {
            e = e;
            this.f48395a.zzay().zzd().zzd("Failed to log and bundle. appId, event, error", zzeo.zzn(str), this.f48395a.zzj().zzd(zzawVar.zza), e);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            this.f48395a.zzay().zzd().zzd("Failed to log and bundle. appId, event, error", zzeo.zzn(str), this.f48395a.zzj().zzd(zzawVar.zza), e);
            return null;
        }
    }
}
