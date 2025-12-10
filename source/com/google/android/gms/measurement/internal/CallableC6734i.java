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
public final class CallableC6734i implements Callable {

    /* renamed from: a */
    public final /* synthetic */ zzaw f48178a;

    /* renamed from: b */
    public final /* synthetic */ String f48179b;

    /* renamed from: c */
    public final /* synthetic */ zzgq f48180c;

    public CallableC6734i(zzgq zzgqVar, zzaw zzawVar, String str) {
        this.f48180c = zzgqVar;
        this.f48178a = zzawVar;
        this.f48179b = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzkz zzkzVar;
        zzkz zzkzVar2;
        C21211nE2 c21211nE2;
        C19256bt2 c19256bt2;
        com.google.android.gms.internal.measurement.zzfz zzfzVar;
        String str;
        Bundle bundle;
        zzgb zzgbVar;
        String str2;
        C23333zc2 m65c;
        long j;
        byte[] bArr;
        zzkz zzkzVar3;
        zzkzVar = this.f48180c.f48395a;
        zzkzVar.m46186a();
        zzkzVar2 = this.f48180c.f48395a;
        C20816kx2 zzr = zzkzVar2.zzr();
        zzaw zzawVar = this.f48178a;
        String str3 = this.f48179b;
        zzr.zzg();
        zzfy.m46273f();
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
                C19256bt2 m65207F = zzr.zzf.zzi().m65207F(str3);
                if (m65207F == null) {
                    zzr.zzs.zzay().zzc().zzb("Log and bundle not available. package_name", str3);
                    bArr = new byte[0];
                    zzkzVar3 = zzr.zzf;
                } else if (!m65207F.m51791J()) {
                    zzr.zzs.zzay().zzc().zzb("Log and bundle disabled. package_name", str3);
                    bArr = new byte[0];
                    zzkzVar3 = zzr.zzf;
                } else {
                    zzgb zzt = zzgc.zzt();
                    zzt.zzad(1);
                    zzt.zzZ("android");
                    if (!TextUtils.isEmpty(m65207F.m51767d0())) {
                        zzt.zzD(m65207F.m51767d0());
                    }
                    if (!TextUtils.isEmpty(m65207F.m51763f0())) {
                        zzt.zzF((String) Preconditions.checkNotNull(m65207F.m51763f0()));
                    }
                    if (!TextUtils.isEmpty(m65207F.m51761g0())) {
                        zzt.zzG((String) Preconditions.checkNotNull(m65207F.m51761g0()));
                    }
                    if (m65207F.m51789L() != -2147483648L) {
                        zzt.zzH((int) m65207F.m51789L());
                    }
                    zzt.zzV(m65207F.m51778W());
                    zzt.zzP(m65207F.m51780U());
                    String m51757i0 = m65207F.m51757i0();
                    String m51771b0 = m65207F.m51771b0();
                    if (!TextUtils.isEmpty(m51757i0)) {
                        zzt.zzU(m51757i0);
                    } else if (!TextUtils.isEmpty(m51771b0)) {
                        zzt.zzC(m51771b0);
                    }
                    zzai m46193M = zzr.zzf.m46193M(str3);
                    zzt.zzM(m65207F.m51781T());
                    if (zzr.zzs.zzJ() && zzr.zzs.zzf().zzt(zzt.zzap()) && m46193M.zzi(zzah.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                        zzt.zzO(null);
                    }
                    zzt.zzL(m46193M.zzh());
                    if (m46193M.zzi(zzah.AD_STORAGE) && m65207F.m51792I()) {
                        Pair m46218c = zzr.zzf.zzs().m46218c(m65207F.m51767d0(), m46193M);
                        if (m65207F.m51792I() && !TextUtils.isEmpty((CharSequence) m46218c.first)) {
                            try {
                                zzt.zzae(C20816kx2.zza((String) m46218c.first, Long.toString(zzawVar.zzd)));
                                Object obj = m46218c.second;
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
                        if (m46193M.zzi(zzah.ANALYTICS_STORAGE) && m65207F.m51765e0() != null) {
                            zzt.zzE(C20816kx2.zza((String) Preconditions.checkNotNull(m65207F.m51765e0()), Long.toString(zzawVar.zzd)));
                        }
                        if (!TextUtils.isEmpty(m65207F.m51759h0())) {
                            zzt.zzT((String) Preconditions.checkNotNull(m65207F.m51759h0()));
                        }
                        String m51767d0 = m65207F.m51767d0();
                        List m65197P = zzr.zzf.zzi().m65197P(m51767d0);
                        Iterator it = m65197P.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                c21211nE2 = (C21211nE2) it.next();
                                if ("_lte".equals(c21211nE2.f72165c)) {
                                    break;
                                }
                            } else {
                                c21211nE2 = null;
                                break;
                            }
                        }
                        if (c21211nE2 == null || c21211nE2.f72167e == null) {
                            C21211nE2 c21211nE22 = new C21211nE2(m51767d0, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_lte", zzr.zzs.zzav().currentTimeMillis(), 0L);
                            m65197P.add(c21211nE22);
                            zzr.zzf.zzi().m65183l(c21211nE22);
                        }
                        zzlb zzu = zzr.zzf.zzu();
                        zzu.zzs.zzay().zzj().zza("Checking account type status for ad personalization signals");
                        if (zzu.zzs.zzg().m46347c()) {
                            String m51767d02 = m65207F.m51767d0();
                            Preconditions.checkNotNull(m51767d02);
                            if (m65207F.m51792I() && zzu.zzf.zzo().m46298m(m51767d02)) {
                                zzu.zzs.zzay().zzc().zza("Turning off ad personalization due to account type");
                                Iterator it2 = m65197P.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    } else if ("_npa".equals(((C21211nE2) it2.next()).f72165c)) {
                                        it2.remove();
                                        break;
                                    }
                                }
                                m65197P.add(new C21211nE2(m51767d02, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_npa", zzu.zzs.zzav().currentTimeMillis(), 1L));
                            }
                        }
                        zzgl[] zzglVarArr = new zzgl[m65197P.size()];
                        for (int i = 0; i < m65197P.size(); i++) {
                            zzgk zzd = zzgl.zzd();
                            zzd.zzf(((C21211nE2) m65197P.get(i)).f72165c);
                            zzd.zzg(((C21211nE2) m65197P.get(i)).f72166d);
                            zzr.zzf.zzu().m46131z(zzd, ((C21211nE2) m65197P.get(i)).f72167e);
                            zzglVarArr[i] = (zzgl) zzd.zzaE();
                        }
                        zzt.zzj(Arrays.asList(zzglVarArr));
                        zzep zzb = zzep.zzb(zzawVar);
                        zzr.zzs.zzv().m46103i(zzb.zzd, zzr.zzf.zzi().m65208E(str3));
                        zzr.zzs.zzv().m46102j(zzb, zzr.zzs.zzf().zzd(str3));
                        Bundle bundle2 = zzb.zzd;
                        bundle2.putLong("_c", 1L);
                        zzr.zzs.zzay().zzc().zza("Marking in-app purchase as real-time");
                        bundle2.putLong("_r", 1L);
                        bundle2.putString("_o", zzawVar.zzc);
                        if (zzr.zzs.zzv().m46090v(zzt.zzap())) {
                            zzr.zzs.zzv().m46100l(bundle2, "_dbg", 1L);
                            zzr.zzs.zzv().m46100l(bundle2, "_r", 1L);
                        }
                        C23333zc2 m65203J = zzr.zzf.zzi().m65203J(str3, zzawVar.zza);
                        if (m65203J == null) {
                            zzgbVar = zzt;
                            c19256bt2 = m65207F;
                            zzfzVar = zza;
                            str = str3;
                            bundle = bundle2;
                            str2 = null;
                            m65c = new C23333zc2(str3, zzawVar.zza, 0L, 0L, 0L, zzawVar.zzd, 0L, null, null, null, null);
                            j = 0;
                        } else {
                            c19256bt2 = m65207F;
                            zzfzVar = zza;
                            str = str3;
                            bundle = bundle2;
                            zzgbVar = zzt;
                            str2 = null;
                            long j2 = m65203J.f109126f;
                            m65c = m65203J.m65c(zzawVar.zzd);
                            j = j2;
                        }
                        zzr.zzf.zzi().m65190e(m65c);
                        zzar zzarVar = new zzar(zzr.zzs, zzawVar.zzc, str, zzawVar.zza, zzawVar.zzd, j, bundle);
                        zzfr zze = zzfs.zze();
                        zze.zzm(zzarVar.f48264d);
                        zze.zzi(zzarVar.f48262b);
                        zze.zzl(zzarVar.f48265e);
                        C17589Fc2 c17589Fc2 = new C17589Fc2(zzarVar.f48266f);
                        while (c17589Fc2.hasNext()) {
                            String next = c17589Fc2.next();
                            com.google.android.gms.internal.measurement.zzfv zze2 = com.google.android.gms.internal.measurement.zzfw.zze();
                            zze2.zzj(next);
                            Object m46342i = zzarVar.f48266f.m46342i(next);
                            if (m46342i != null) {
                                zzr.zzf.zzu().m46132y(zze2, m46342i);
                                zze.zze(zze2);
                            }
                        }
                        zzgb zzgbVar2 = zzgbVar;
                        zzgbVar2.zzk(zze);
                        zzgd zza2 = zzgf.zza();
                        zzft zza3 = zzfu.zza();
                        zza3.zza(m65c.f109123c);
                        zza3.zzb(zzawVar.zza);
                        zza2.zza(zza3);
                        zzgbVar2.zzaa(zza2);
                        zzgbVar2.zzf(zzr.zzf.zzf().m1250b(c19256bt2.m51767d0(), Collections.emptyList(), zzgbVar2.zzat(), Long.valueOf(zze.zzc()), Long.valueOf(zze.zzc())));
                        if (zze.zzq()) {
                            zzgbVar2.zzai(zze.zzc());
                            zzgbVar2.zzQ(zze.zzc());
                        }
                        long m51777X = c19256bt2.m51777X();
                        int i2 = (m51777X > 0L ? 1 : (m51777X == 0L ? 0 : -1));
                        if (i2 != 0) {
                            zzgbVar2.zzab(m51777X);
                        }
                        long m51775Z = c19256bt2.m51775Z();
                        if (m51775Z != 0) {
                            zzgbVar2.zzac(m51775Z);
                        } else if (i2 != 0) {
                            zzgbVar2.zzac(m51777X);
                        }
                        String m51772b = c19256bt2.m51772b();
                        zzoz.zzc();
                        if (zzr.zzs.zzf().zzs(str2, zzeb.zzar) && m51772b != null) {
                            zzgbVar2.zzah(m51772b);
                        }
                        c19256bt2.m51766e();
                        zzgbVar2.zzI((int) c19256bt2.m51776Y());
                        zzr.zzs.zzf().zzh();
                        zzgbVar2.zzal(73000L);
                        zzgbVar2.zzak(zzr.zzs.zzav().currentTimeMillis());
                        zzgbVar2.zzag(true);
                        if (zzr.zzs.zzf().zzs(str2, zzeb.zzaz)) {
                            zzr.zzf.m46184c(zzgbVar2.zzap(), zzgbVar2);
                        }
                        com.google.android.gms.internal.measurement.zzfz zzfzVar2 = zzfzVar;
                        zzfzVar2.zza(zzgbVar2);
                        C19256bt2 c19256bt22 = c19256bt2;
                        c19256bt22.m51798C(zzgbVar2.zzd());
                        c19256bt22.m51739z(zzgbVar2.zzc());
                        zzr.zzf.zzi().m65191d(c19256bt22);
                        zzr.zzf.zzi().zzC();
                        zzr.zzf.zzi().m65195R();
                        try {
                            return zzr.zzf.zzu().m46157D(((zzga) zzfzVar2.zzaE()).zzbv());
                        } catch (IOException e2) {
                            zzr.zzs.zzay().zzd().zzc("Data loss. Failed to bundle and serialize. appId", zzeo.zzn(str), e2);
                            return str2;
                        }
                    } catch (SecurityException e3) {
                        zzr.zzs.zzay().zzc().zzb("app instance id encryption failed", e3.getMessage());
                        byte[] bArr2 = new byte[0];
                        zzr.zzf.zzi().m65195R();
                        return bArr2;
                    }
                }
                zzkzVar3.zzi().m65195R();
                return bArr;
            } catch (Throwable th2) {
                zzr.zzf.zzi().m65195R();
                throw th2;
            }
        }
    }
}
