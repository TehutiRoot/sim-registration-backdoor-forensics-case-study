package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzzk implements zzzt {
    private final zzzg zza;
    private final zzaak zzb;
    private final boolean zzc;
    private final zzxg zzd;

    private zzzk(zzaak zzaakVar, zzxg zzxgVar, zzzg zzzgVar) {
        this.zzb = zzaakVar;
        this.zzc = zzxgVar.zzi(zzzgVar);
        this.zzd = zzxgVar;
        this.zza = zzzgVar;
    }

    public static zzzk zzc(zzaak zzaakVar, zzxg zzxgVar, zzzg zzzgVar) {
        return new zzzk(zzaakVar, zzxgVar, zzzgVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzzt
    public final int zza(Object obj) {
        zzaak zzaakVar = this.zzb;
        int zzb = zzaakVar.zzb(zzaakVar.zzd(obj));
        if (this.zzc) {
            return zzb + this.zzd.zzb(obj).zzc();
        }
        return zzb;
    }

    @Override // com.google.android.gms.internal.gtm.zzzt
    public final int zzb(Object obj) {
        int hashCode = this.zzb.zzd(obj).hashCode();
        if (this.zzc) {
            return (hashCode * 53) + this.zzd.zzb(obj).zza.hashCode();
        }
        return hashCode;
    }

    @Override // com.google.android.gms.internal.gtm.zzzt
    public final Object zze() {
        zzzg zzzgVar = this.zza;
        if (zzzgVar instanceof zzxv) {
            return ((zzxv) zzzgVar).zzad();
        }
        return zzzgVar.zzau().zzE();
    }

    @Override // com.google.android.gms.internal.gtm.zzzt
    public final void zzf(Object obj) {
        this.zzb.zzm(obj);
        this.zzd.zzf(obj);
    }

    @Override // com.google.android.gms.internal.gtm.zzzt
    public final void zzg(Object obj, Object obj2) {
        zzzv.zzr(this.zzb, obj, obj2);
        if (this.zzc) {
            zzzv.zzq(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzzt
    public final void zzh(Object obj, zzzs zzzsVar, zzxf zzxfVar) throws IOException {
        boolean zzQ;
        zzaak zzaakVar = this.zzb;
        Object zzc = zzaakVar.zzc(obj);
        zzxg zzxgVar = this.zzd;
        zzxk zzc2 = zzxgVar.zzc(obj);
        while (zzzsVar.zzc() != Integer.MAX_VALUE) {
            try {
                int zzd = zzzsVar.zzd();
                if (zzd != 11) {
                    if ((zzd & 7) == 2) {
                        Object zzd2 = zzxgVar.zzd(zzxfVar, this.zza, zzd >>> 3);
                        if (zzd2 != null) {
                            zzxgVar.zzg(zzzsVar, zzd2, zzxfVar, zzc2);
                        } else {
                            zzQ = zzaakVar.zzp(zzc, zzzsVar);
                        }
                    } else {
                        zzQ = zzzsVar.zzQ();
                    }
                    if (!zzQ) {
                        zzaakVar.zzn(obj, zzc);
                        return;
                    }
                } else {
                    Object obj2 = null;
                    zzud zzudVar = null;
                    int i = 0;
                    while (zzzsVar.zzc() != Integer.MAX_VALUE) {
                        int zzd3 = zzzsVar.zzd();
                        if (zzd3 == 16) {
                            i = zzzsVar.zzj();
                            obj2 = zzxgVar.zzd(zzxfVar, this.zza, i);
                        } else if (zzd3 == 26) {
                            if (obj2 != null) {
                                zzxgVar.zzg(zzzsVar, obj2, zzxfVar, zzc2);
                            } else {
                                zzudVar = zzzsVar.zzp();
                            }
                        } else if (!zzzsVar.zzQ()) {
                            break;
                        }
                    }
                    if (zzzsVar.zzd() == 12) {
                        if (zzudVar != null) {
                            if (obj2 != null) {
                                zzxgVar.zzh(zzudVar, obj2, zzxfVar, zzc2);
                            } else {
                                zzaakVar.zzk(zzc, i, zzudVar);
                            }
                        }
                    } else {
                        throw zzyg.zzb();
                    }
                }
            } catch (Throwable th2) {
                zzaakVar.zzn(obj, zzc);
                throw th2;
            }
        }
        zzaakVar.zzn(obj, zzc);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf A[EDGE_INSN: B:56:0x00bf->B:33:0x00bf ?: BREAK  , SYNTHETIC] */
    @Override // com.google.android.gms.internal.gtm.zzzt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(java.lang.Object r11, byte[] r12, int r13, int r14, com.google.android.gms.internal.gtm.zztp r15) throws java.io.IOException {
        /*
            r10 = this;
            r0 = r11
            com.google.android.gms.internal.gtm.zzxv r0 = (com.google.android.gms.internal.gtm.zzxv) r0
            com.google.android.gms.internal.gtm.zzaal r1 = r0.zzc
            com.google.android.gms.internal.gtm.zzaal r2 = com.google.android.gms.internal.gtm.zzaal.zzc()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.gtm.zzaal r1 = com.google.android.gms.internal.gtm.zzaal.zzf()
            r0.zzc = r1
        L11:
            com.google.android.gms.internal.gtm.zzxr r11 = (com.google.android.gms.internal.gtm.zzxr) r11
            com.google.android.gms.internal.gtm.zzxk r11 = r11.zzT()
            r0 = 0
            r2 = r0
        L19:
            if (r13 >= r14) goto Lca
            int r4 = com.google.android.gms.internal.gtm.zztq.zzi(r12, r13, r15)
            int r13 = r15.zza
            r3 = 11
            r5 = 2
            if (r13 == r3) goto L65
            r3 = r13 & 7
            if (r3 != r5) goto L60
            com.google.android.gms.internal.gtm.zzxg r2 = r10.zzd
            com.google.android.gms.internal.gtm.zzxf r3 = r15.zzd
            com.google.android.gms.internal.gtm.zzzg r5 = r10.zza
            int r6 = r13 >>> 3
            java.lang.Object r8 = r2.zzd(r3, r5, r6)
            if (r8 == 0) goto L56
            com.google.android.gms.internal.gtm.zzzp r13 = com.google.android.gms.internal.gtm.zzzp.zza()
            r2 = r8
            com.google.android.gms.internal.gtm.zzxt r2 = (com.google.android.gms.internal.gtm.zzxt) r2
            com.google.android.gms.internal.gtm.zzzg r3 = r2.zzc
            java.lang.Class r3 = r3.getClass()
            com.google.android.gms.internal.gtm.zzzt r13 = r13.zzb(r3)
            int r13 = com.google.android.gms.internal.gtm.zztq.zzd(r13, r12, r4, r14, r15)
            java.lang.Object r3 = r15.zzc
            com.google.android.gms.internal.gtm.zzxs r2 = r2.zzd
            r11.zzk(r2, r3)
        L54:
            r2 = r8
            goto L19
        L56:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = com.google.android.gms.internal.gtm.zztq.zzh(r2, r3, r4, r5, r6, r7)
            goto L54
        L60:
            int r13 = com.google.android.gms.internal.gtm.zztq.zzo(r13, r12, r4, r14, r15)
            goto L19
        L65:
            r13 = 0
            r3 = r0
        L67:
            if (r4 >= r14) goto Lbf
            int r4 = com.google.android.gms.internal.gtm.zztq.zzi(r12, r4, r15)
            int r6 = r15.zza
            int r7 = r6 >>> 3
            r8 = r6 & 7
            if (r7 == r5) goto La3
            r9 = 3
            if (r7 == r9) goto L79
            goto Lb6
        L79:
            if (r2 == 0) goto L98
            com.google.android.gms.internal.gtm.zzzp r6 = com.google.android.gms.internal.gtm.zzzp.zza()
            r7 = r2
            com.google.android.gms.internal.gtm.zzxt r7 = (com.google.android.gms.internal.gtm.zzxt) r7
            com.google.android.gms.internal.gtm.zzzg r8 = r7.zzc
            java.lang.Class r8 = r8.getClass()
            com.google.android.gms.internal.gtm.zzzt r6 = r6.zzb(r8)
            int r4 = com.google.android.gms.internal.gtm.zztq.zzd(r6, r12, r4, r14, r15)
            java.lang.Object r6 = r15.zzc
            com.google.android.gms.internal.gtm.zzxs r7 = r7.zzd
            r11.zzk(r7, r6)
            goto L67
        L98:
            if (r8 != r5) goto Lb6
            int r4 = com.google.android.gms.internal.gtm.zztq.zza(r12, r4, r15)
            java.lang.Object r3 = r15.zzc
            com.google.android.gms.internal.gtm.zzud r3 = (com.google.android.gms.internal.gtm.zzud) r3
            goto L67
        La3:
            if (r8 != 0) goto Lb6
            int r4 = com.google.android.gms.internal.gtm.zztq.zzi(r12, r4, r15)
            int r13 = r15.zza
            com.google.android.gms.internal.gtm.zzxg r2 = r10.zzd
            com.google.android.gms.internal.gtm.zzxf r6 = r15.zzd
            com.google.android.gms.internal.gtm.zzzg r7 = r10.zza
            java.lang.Object r2 = r2.zzd(r6, r7, r13)
            goto L67
        Lb6:
            r7 = 12
            if (r6 == r7) goto Lbf
            int r4 = com.google.android.gms.internal.gtm.zztq.zzo(r6, r12, r4, r14, r15)
            goto L67
        Lbf:
            if (r3 == 0) goto Lc7
            int r13 = r13 << 3
            r13 = r13 | r5
            r1.zzj(r13, r3)
        Lc7:
            r13 = r4
            goto L19
        Lca:
            if (r13 != r14) goto Lcd
            return
        Lcd:
            com.google.android.gms.internal.gtm.zzyg r11 = com.google.android.gms.internal.gtm.zzyg.zzg()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzzk.zzi(java.lang.Object, byte[], int, int, com.google.android.gms.internal.gtm.zztp):void");
    }

    @Override // com.google.android.gms.internal.gtm.zzzt
    public final boolean zzj(Object obj, Object obj2) {
        zzaak zzaakVar = this.zzb;
        if (!zzaakVar.zzd(obj).equals(zzaakVar.zzd(obj2))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zzb(obj).equals(this.zzd.zzb(obj2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.gtm.zzzt
    public final boolean zzk(Object obj) {
        return this.zzd.zzb(obj).zzm();
    }

    @Override // com.google.android.gms.internal.gtm.zzzt
    public final void zzm(Object obj, zzur zzurVar) throws IOException {
        Iterator zzg = this.zzd.zzb(obj).zzg();
        while (zzg.hasNext()) {
            Map.Entry entry = (Map.Entry) zzg.next();
            zzxj zzxjVar = (zzxj) entry.getKey();
            if (zzxjVar.zze() == zzabb.MESSAGE && !zzxjVar.zzg()) {
                zzxjVar.zzf();
                if (entry instanceof zzyj) {
                    zzurVar.zzw(zzxjVar.zza(), ((zzyj) entry).zza().zzb());
                } else {
                    zzurVar.zzw(zzxjVar.zza(), entry.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        zzaak zzaakVar = this.zzb;
        zzaakVar.zzr(zzaakVar.zzd(obj), zzurVar);
    }
}
