package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.internal.measurement.zzfu;
import com.google.android.gms.internal.measurement.zzga;
import com.google.android.gms.internal.measurement.zzgb;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzgd;
import com.google.android.gms.internal.measurement.zzgf;
import com.google.android.gms.internal.measurement.zzgk;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzoz;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.DebugKt;

/* renamed from: com.google.android.gms.measurement.internal.i */
/* loaded from: classes3.dex */
public final class CallableC6723i implements Callable {

    /* renamed from: a */
    public final /* synthetic */ zzaw f48190a;

    /* renamed from: b */
    public final /* synthetic */ String f48191b;

    /* renamed from: c */
    public final /* synthetic */ zzgq f48192c;

    public CallableC6723i(zzgq zzgqVar, zzaw zzawVar, String str) {
        this.f48192c = zzgqVar;
        this.f48190a = zzawVar;
        this.f48191b = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzkz zzkzVar;
        zzkz zzkzVar2;
        C20754kF2 c20754kF2;
        Yt2 yt2;
        com.google.android.gms.internal.measurement.zzfz zzfzVar;
        String str;
        Bundle bundle;
        zzgb zzgbVar;
        String str2;
        C22889wd2 m688c;
        long j;
        byte[] bArr;
        zzkz zzkzVar3;
        zzkzVar = this.f48192c.f48407a;
        zzkzVar.m46171a();
        zzkzVar2 = this.f48192c.f48407a;
        C20357hy2 zzr = zzkzVar2.zzr();
        zzaw zzawVar = this.f48190a;
        String str3 = this.f48191b;
        zzr.zzg();
        zzfy.m46258f();
        Preconditions.checkNotNull(zzawVar);
        Preconditions.checkNotEmpty(str3);
        if (!zzr.zzs.zzf().zzs(str3, zzeb.zzS)) {
            zzr.zzs.zzay().zzc().zzb("Generating ScionPayload disabled. packageName", str3);
            return new byte[0];
        } else if (!"_iap".equals(zzawVar.zza) && !"_iapx".equals(zzawVar.zza)) {
            zzr.zzs.zzay().zzc().zzc("Generating a payload for this event is not available. package_name, event_name", str3, zzawVar.zza);
            return null;
        } else {
            com.google.android.gms.internal.measurement.zzfz zza = zzga.zza();
            zzr.zzf.zzi().zzw();
            try {
                Yt2 m65732F = zzr.zzf.zzi().m65732F(str3);
                if (m65732F == null) {
                    zzr.zzs.zzay().zzc().zzb("Log and bundle not available. package_name", str3);
                    bArr = new byte[0];
                    zzkzVar3 = zzr.zzf;
                } else if (!m65732F.m65329J()) {
                    zzr.zzs.zzay().zzc().zzb("Log and bundle disabled. package_name", str3);
                    bArr = new byte[0];
                    zzkzVar3 = zzr.zzf;
                } else {
                    zzgb zzt = zzgc.zzt();
                    zzt.zzad(1);
                    zzt.zzZ("android");
                    if (!TextUtils.isEmpty(m65732F.m65305d0())) {
                        zzt.zzD(m65732F.m65305d0());
                    }
                    if (!TextUtils.isEmpty(m65732F.m65301f0())) {
                        zzt.zzF((String) Preconditions.checkNotNull(m65732F.m65301f0()));
                    }
                    if (!TextUtils.isEmpty(m65732F.m65299g0())) {
                        zzt.zzG((String) Preconditions.checkNotNull(m65732F.m65299g0()));
                    }
                    if (m65732F.m65327L() != -2147483648L) {
                        zzt.zzH((int) m65732F.m65327L());
                    }
                    zzt.zzV(m65732F.m65316W());
                    zzt.zzP(m65732F.m65318U());
                    String m65295i0 = m65732F.m65295i0();
                    String m65309b0 = m65732F.m65309b0();
                    if (!TextUtils.isEmpty(m65295i0)) {
                        zzt.zzU(m65295i0);
                    } else if (!TextUtils.isEmpty(m65309b0)) {
                        zzt.zzC(m65309b0);
                    }
                    zzai m46178M = zzr.zzf.m46178M(str3);
                    zzt.zzM(m65732F.m65319T());
                    if (zzr.zzs.zzJ() && zzr.zzs.zzf().zzt(zzt.zzap()) && m46178M.zzi(zzah.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                        zzt.zzO(null);
                    }
                    zzt.zzL(m46178M.zzh());
                    if (m46178M.zzi(zzah.AD_STORAGE) && m65732F.m65330I()) {
                        Pair m46203c = zzr.zzf.zzs().m46203c(m65732F.m65305d0(), m46178M);
                        if (m65732F.m65330I() && !TextUtils.isEmpty((CharSequence) m46203c.first)) {
                            try {
                                zzt.zzae(C20357hy2.zza((String) m46203c.first, Long.toString(zzawVar.zzd)));
                                Object obj = m46203c.second;
                                if (obj != null) {
                                    zzt.zzX(((Boolean) obj).booleanValue());
                                }
                            } catch (SecurityException e) {
                                zzr.zzs.zzay().zzc().zzb("Resettable device id encryption failed", e.getMessage());
                                bArr = new byte[0];
                                zzkzVar3 = zzr.zzf;
                            }
                        }
                    }
                    zzr.zzs.zzg().zzu();
                    zzt.zzN(Build.MODEL);
                    zzr.zzs.zzg().zzu();
                    zzt.zzY(Build.VERSION.RELEASE);
                    zzt.zzaj((int) zzr.zzs.zzg().zzb());
                    zzt.zzan(zzr.zzs.zzg().zzc());
                    try {
                        if (m46178M.zzi(zzah.ANALYTICS_STORAGE) && m65732F.m65303e0() != null) {
                            zzt.zzE(C20357hy2.zza((String) Preconditions.checkNotNull(m65732F.m65303e0()), Long.toString(zzawVar.zzd)));
                        }
                        if (!TextUtils.isEmpty(m65732F.m65297h0())) {
                            zzt.zzT((String) Preconditions.checkNotNull(m65732F.m65297h0()));
                        }
                        String m65305d0 = m65732F.m65305d0();
                        List m65722P = zzr.zzf.zzi().m65722P(m65305d0);
                        Iterator it = m65722P.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                c20754kF2 = (C20754kF2) it.next();
                                if ("_lte".equals(c20754kF2.f67918c)) {
                                    break;
                                }
                            } else {
                                c20754kF2 = null;
                                break;
                            }
                        }
                        if (c20754kF2 == null || c20754kF2.f67920e == null) {
                            C20754kF2 c20754kF22 = new C20754kF2(m65305d0, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_lte", zzr.zzs.zzav().currentTimeMillis(), 0L);
                            m65722P.add(c20754kF22);
                            zzr.zzf.zzi().m65708l(c20754kF22);
                        }
                        zzlb zzu = zzr.zzf.zzu();
                        zzu.zzs.zzay().zzj().zza("Checking account type status for ad personalization signals");
                        if (zzu.zzs.zzg().m46332c()) {
                            String m65305d02 = m65732F.m65305d0();
                            Preconditions.checkNotNull(m65305d02);
                            if (m65732F.m65330I() && zzu.zzf.zzo().m46283m(m65305d02)) {
                                zzu.zzs.zzay().zzc().zza("Turning off ad personalization due to account type");
                                Iterator it2 = m65722P.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    } else if ("_npa".equals(((C20754kF2) it2.next()).f67918c)) {
                                        it2.remove();
                                        break;
                                    }
                                }
                                m65722P.add(new C20754kF2(m65305d02, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_npa", zzu.zzs.zzav().currentTimeMillis(), 1L));
                            }
                        }
                        zzgl[] zzglVarArr = new zzgl[m65722P.size()];
                        for (int i = 0; i < m65722P.size(); i++) {
                            zzgk zzd = zzgl.zzd();
                            zzd.zzf(((C20754kF2) m65722P.get(i)).f67918c);
                            zzd.zzg(((C20754kF2) m65722P.get(i)).f67919d);
                            zzr.zzf.zzu().m46116z(zzd, ((C20754kF2) m65722P.get(i)).f67920e);
                            zzglVarArr[i] = (zzgl) zzd.zzaE();
                        }
                        zzt.zzj(Arrays.asList(zzglVarArr));
                        zzep zzb = zzep.zzb(zzawVar);
                        zzr.zzs.zzv().m46088i(zzb.zzd, zzr.zzf.zzi().m65733E(str3));
                        zzr.zzs.zzv().m46087j(zzb, zzr.zzs.zzf().zzd(str3));
                        Bundle bundle2 = zzb.zzd;
                        bundle2.putLong("_c", 1L);
                        zzr.zzs.zzay().zzc().zza("Marking in-app purchase as real-time");
                        bundle2.putLong("_r", 1L);
                        bundle2.putString("_o", zzawVar.zzc);
                        if (zzr.zzs.zzv().m46075v(zzt.zzap())) {
                            zzr.zzs.zzv().m46085l(bundle2, "_dbg", 1L);
                            zzr.zzs.zzv().m46085l(bundle2, "_r", 1L);
                        }
                        C22889wd2 m65728J = zzr.zzf.zzi().m65728J(str3, zzawVar.zza);
                        if (m65728J == null) {
                            zzgbVar = zzt;
                            yt2 = m65732F;
                            zzfzVar = zza;
                            str = str3;
                            bundle = bundle2;
                            str2 = null;
                            m688c = new C22889wd2(str3, zzawVar.zza, 0L, 0L, 0L, zzawVar.zzd, 0L, null, null, null, null);
                            j = 0;
                        } else {
                            yt2 = m65732F;
                            zzfzVar = zza;
                            str = str3;
                            bundle = bundle2;
                            zzgbVar = zzt;
                            str2 = null;
                            long j2 = m65728J.f108510f;
                            m688c = m65728J.m688c(zzawVar.zzd);
                            j = j2;
                        }
                        zzr.zzf.zzi().m65715e(m688c);
                        zzar zzarVar = new zzar(zzr.zzs, zzawVar.zzc, str, zzawVar.zza, zzawVar.zzd, j, bundle);
                        zzfr zze = zzfs.zze();
                        zze.zzm(zzarVar.f48276d);
                        zze.zzi(zzarVar.f48274b);
                        zze.zzl(zzarVar.f48277e);
                        C17425Cd2 c17425Cd2 = new C17425Cd2(zzarVar.f48278f);
                        while (c17425Cd2.hasNext()) {
                            String next = c17425Cd2.next();
                            com.google.android.gms.internal.measurement.zzfv zze2 = com.google.android.gms.internal.measurement.zzfw.zze();
                            zze2.zzj(next);
                            Object m46327i = zzarVar.f48278f.m46327i(next);
                            if (m46327i != null) {
                                zzr.zzf.zzu().m46117y(zze2, m46327i);
                                zze.zze(zze2);
                            }
                        }
                        zzgb zzgbVar2 = zzgbVar;
                        zzgbVar2.zzk(zze);
                        zzgd zza2 = zzgf.zza();
                        zzft zza3 = zzfu.zza();
                        zza3.zza(m688c.f108507c);
                        zza3.zzb(zzawVar.zza);
                        zza2.zza(zza3);
                        zzgbVar2.zzaa(zza2);
                        zzgbVar2.zzf(zzr.zzf.zzf().m23492b(yt2.m65305d0(), Collections.emptyList(), zzgbVar2.zzat(), Long.valueOf(zze.zzc()), Long.valueOf(zze.zzc())));
                        if (zze.zzq()) {
                            zzgbVar2.zzai(zze.zzc());
                            zzgbVar2.zzQ(zze.zzc());
                        }
                        long m65315X = yt2.m65315X();
                        int i2 = (m65315X > 0L ? 1 : (m65315X == 0L ? 0 : -1));
                        if (i2 != 0) {
                            zzgbVar2.zzab(m65315X);
                        }
                        long m65313Z = yt2.m65313Z();
                        if (m65313Z != 0) {
                            zzgbVar2.zzac(m65313Z);
                        } else if (i2 != 0) {
                            zzgbVar2.zzac(m65315X);
                        }
                        String m65310b = yt2.m65310b();
                        zzoz.zzc();
                        if (zzr.zzs.zzf().zzs(str2, zzeb.zzar) && m65310b != null) {
                            zzgbVar2.zzah(m65310b);
                        }
                        yt2.m65304e();
                        zzgbVar2.zzI((int) yt2.m65314Y());
                        zzr.zzs.zzf().zzh();
                        zzgbVar2.zzal(73000L);
                        zzgbVar2.zzak(zzr.zzs.zzav().currentTimeMillis());
                        zzgbVar2.zzag(true);
                        if (zzr.zzs.zzf().zzs(str2, zzeb.zzaz)) {
                            zzr.zzf.m46169c(zzgbVar2.zzap(), zzgbVar2);
                        }
                        com.google.android.gms.internal.measurement.zzfz zzfzVar2 = zzfzVar;
                        zzfzVar2.zza(zzgbVar2);
                        Yt2 yt22 = yt2;
                        yt22.m65336C(zzgbVar2.zzd());
                        yt22.m65277z(zzgbVar2.zzc());
                        zzr.zzf.zzi().m65716d(yt22);
                        zzr.zzf.zzi().zzC();
                        zzr.zzf.zzi().m65720R();
                        try {
                            return zzr.zzf.zzu().m46142D(((zzga) zzfzVar2.zzaE()).zzbv());
                        } catch (IOException e2) {
                            zzr.zzs.zzay().zzd().zzc("Data loss. Failed to bundle and serialize. appId", zzeo.zzn(str), e2);
                            return str2;
                        }
                    } catch (SecurityException e3) {
                        zzr.zzs.zzay().zzc().zzb("app instance id encryption failed", e3.getMessage());
                        byte[] bArr2 = new byte[0];
                        zzr.zzf.zzi().m65720R();
                        return bArr2;
                    }
                }
                zzkzVar3.zzi().m65720R();
                return bArr;
            } catch (Throwable th2) {
                zzr.zzf.zzi().m65720R();
                throw th2;
            }
        }
    }
}