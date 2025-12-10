package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzuk implements zzzs {
    private final zzuj zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzuk(zzuj zzujVar) {
        byte[] bArr = zzye.zzd;
        this.zza = zzujVar;
        zzujVar.zzc = this;
    }

    private final Object zzR(zzzt zzztVar, zzxf zzxfVar) throws IOException {
        Object zze = zzztVar.zze();
        zzT(zze, zzztVar, zzxfVar);
        zzztVar.zzf(zze);
        return zze;
    }

    private final Object zzS(zzzt zzztVar, zzxf zzxfVar) throws IOException {
        Object zze = zzztVar.zze();
        zzU(zze, zzztVar, zzxfVar);
        zzztVar.zzf(zze);
        return zze;
    }

    private final void zzT(Object obj, zzzt zzztVar, zzxf zzxfVar) throws IOException {
        int i = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzztVar.zzh(obj, this, zzxfVar);
            if (this.zzb == this.zzc) {
                return;
            }
            throw zzyg.zzg();
        } finally {
            this.zzc = i;
        }
    }

    private final void zzU(Object obj, zzzt zzztVar, zzxf zzxfVar) throws IOException {
        zzuj zzujVar;
        zzuj zzujVar2 = this.zza;
        int zzn = zzujVar2.zzn();
        if (zzujVar2.zza < zzujVar2.zzb) {
            int zze = this.zza.zze(zzn);
            this.zza.zza++;
            zzztVar.zzh(obj, this, zzxfVar);
            this.zza.zzz(0);
            zzujVar.zza--;
            this.zza.zzA(zze);
            return;
        }
        throw new zzyg("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    private final void zzV(int i) throws IOException {
        if (this.zza.zzd() == i) {
            return;
        }
        throw zzyg.zzj();
    }

    private final void zzW(int i) throws IOException {
        if ((this.zzb & 7) == i) {
            return;
        }
        throw zzyg.zza();
    }

    private static final void zzX(int i) throws IOException {
        if ((i & 3) == 0) {
            return;
        }
        throw zzyg.zzg();
    }

    private static final void zzY(int i) throws IOException {
        if ((i & 7) == 0) {
            return;
        }
        throw zzyg.zzg();
    }

    public static zzuk zzq(zzuj zzujVar) {
        zzuk zzukVar = zzujVar.zzc;
        if (zzukVar != null) {
            return zzukVar;
        }
        return new zzuk(zzujVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzzs
    public final void zzA(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzxw) {
            zzxw zzxwVar = (zzxw) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i == 2) {
                    zzuj zzujVar = this.zza;
                    int zzd = zzujVar.zzd() + zzujVar.zzn();
                    do {
                        zzxwVar.zzh(this.zza.zzf());
                    } while (this.zza.zzd() < zzd);
                    zzV(zzd);
                    return;
                }
                throw zzyg.zza();
            }
            do {
                zzxwVar.zzh(this.zza.zzf());
                if (this.zza.zzC()) {
                    return;
                }
                zzm2 = this.zza.zzm();
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                zzuj zzujVar2 = this.zza;
                int zzd2 = zzujVar2.zzd() + zzujVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzd() < zzd2);
                zzV(zzd2);
                return;
            }
            throw zzyg.zza();
        }
        do {
            list.add(Integer.valueOf(this.zza.zzf()));
            if (this.zza.zzC()) {
                return;
            }
            zzm = this.zza.zzm();
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.gtm.zzzs
    public final void zzB(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzxw) {
            zzxw zzxwVar = (zzxw) list;
            int i = this.zzb & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        zzxwVar.zzh(this.zza.zzg());
                        if (this.zza.zzC()) {
                            return;
                        }
                        zzm2 = this.zza.zzm();
                    } while (zzm2 == this.zzb);
                    this.zzd = zzm2;
                    return;
                }
                throw zzyg.zza();
            }
            int zzn = this.zza.zzn();
            zzX(zzn);
            int zzd = this.zza.zzd() + zzn;
            do {
                zzxwVar.zzh(this.zza.zzg());
            } while (this.zza.zzd() < zzd);
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                    if (this.zza.zzC()) {
                        return;
                    }
                    zzm = this.zza.zzm();
                } while (zzm == this.zzb);
                this.zzd = zzm;
                return;
            }
            throw zzyg.zza();
        }
        int zzn2 = this.zza.zzn();
        zzX(zzn2);
        int zzd2 = this.zza.zzd() + zzn2;
        do {
            list.add(Integer.valueOf(this.zza.zzg()));
        } while (this.zza.zzd() < zzd2);
    }

    @Override // com.google.android.gms.internal.gtm.zzzs
    public final void zzC(List list) throws IOException {
        int zzm;
        if (list instanceof zzyv) {
            AbstractC22494uj2.m1214a(list);
            int i = this.zzb & 7;
            if (i != 1) {
                if (i != 2) {
                    throw zzyg.zza();
                }
                zzY(this.zza.zzn());
                this.zza.zzd();
                this.zza.zzo();
                throw null;
            }
            this.zza.zzo();
            throw null;
        }
        int i2 = this.zzb & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int zzn = this.zza.zzn();
                zzY(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                } while (this.zza.zzd() < zzd);
                return;
            }
            throw zzyg.zza();
        }
        do {
            list.add(Long.valueOf(this.zza.zzo()));
            if (this.zza.zzC()) {
                return;
            }
            zzm = this.zza.zzm();
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.gtm.zzzs
    public final void zzD(List list) throws IOException {
        int zzm;
        if (list instanceof zzxm) {
            AbstractC22494uj2.m1214a(list);
            int i = this.zzb & 7;
            if (i != 2) {
                if (i != 5) {
                    throw zzyg.zza();
                }
                this.zza.zzc();
                throw null;
            }
            zzX(this.zza.zzn());
            this.zza.zzd();
            this.zza.zzc();
            throw null;
        }
        int i2 = this.zzb & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.zza.zzc()));
                    if (this.zza.zzC()) {
                        return;
                    }
                    zzm = this.zza.zzm();
                } while (zzm == this.zzb);
                this.zzd = zzm;
                return;
            }
            throw zzyg.zza();
        }
        int zzn = this.zza.zzn();
        zzX(zzn);
        int zzd = this.zza.zzd() + zzn;
        do {
            list.add(Float.valueOf(this.zza.zzc()));
        } while (this.zza.zzd() < zzd);
    }

    @Override // com.google.android.gms.internal.gtm.zzzs
    @Deprecated
    public final void zzE(List list, zzzt zzztVar, zzxf zzxfVar) throws IOException {
        int zzm;
        int i = this.zzb;
        if ((i & 7) == 3) {
            do {
                list.add(zzR(zzztVar, zzxfVar));
                if (!this.zza.zzC() && this.zzd == 0) {
                    zzm = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm == i);
            this.zzd = zzm;
            return;
        }
        throw zzyg.zza();
    }

    @Override // com.google.android.gms.internal.gtm.zzzs
    public final void zzF(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzxw) {
            zzxw zzxwVar = (zzxw) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i == 2) {
                    zzuj zzujVar = this.zza;
                    int zzd = zzujVar.zzd() + zzujVar.zzn();
                    do {
                        zzxwVar.zzh(this.zza.zzh());
                    } while (this.zza.zzd() < zzd);
                    zzV(zzd);
                    return;
                }
                throw zzyg.zza();
            }
            do {
                zzxwVar.zzh(this.zza.zzh());
                if (this.zza.zzC()) {
                    return;
                }
                zzm2 = this.zza.zzm();
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                zzuj zzujVar2 = this.zza;
                int zzd2 = zzujVar2.zzd() + zzujVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                } while (this.zza.zzd() < zzd2);
                zzV(zzd2);
                return;
            }
            throw zzyg.zza();
        }
        do {
            list.add(Integer.valueOf(this.zza.zzh()));
            if (this.zza.zzC()) {
                return;
            }
            zzm = this.zza.zzm();
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.gtm.zzzs
    public final void zzG(List list) throws IOException {
        int zzm;
        if (list instanceof zzyv) {
            AbstractC22494uj2.m1214a(list);
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zzyg.zza();
                }
                zzuj zzujVar = this.zza;
                zzujVar.zzn();
                zzujVar.zzd();
                this.zza.zzp();
                throw null;
            }
            this.zza.zzp();
            throw null;
        }
        int i2 = this.zzb & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                zzuj zzujVar2 = this.zza;
                int zzd = zzujVar2.zzd() + zzujVar2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                } while (this.zza.zzd() < zzd);
                zzV(zzd);
                return;
            }
            throw zzyg.zza();
        }
        do {
            list.add(Long.valueOf(this.zza.zzp()));
            if (this.zza.zzC()) {
                return;
            }
            zzm = this.zza.zzm();
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.gtm.zzzs
    public final void zzH(List list, zzzt zzztVar, zzxf zzxfVar) throws IOException {
        int zzm;
        int i = this.zzb;
        if ((i & 7) == 2) {
            do {
                list.add(zzS(zzztVar, zzxfVar));
                if (!this.zza.zzC() && this.zzd == 0) {
                    zzm = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm == i);
            this.zzd = zzm;
            return;
        }
        throw zzyg.zza();
    }

    @Override // com.google.android.gms.internal.gtm.zzzs
    public final void zzI(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzxw) {
            zzxw zzxwVar = (zzxw) list;
            int i = this.zzb & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        zzxwVar.zzh(this.zza.zzk());
                        if (this.zza.zzC()) {
                            return;
                        }
                        zzm2 = this.zza.zzm();
                    } while (zzm2 == this.zzb);
                    this.zzd = zzm2;
                    return;
                }
                throw zzyg.zza();
            }
            int zzn = this.zza.zzn();
            zzX(zzn);
            int zzd = this.zza.zzd() + zzn;
            do {
                zzxwVar.zzh(this.zza.zzk());
            } while (this.zza.zzd() < zzd);
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                    if (this.zza.zzC()) {
                        return;
                    }
                    zzm = this.zza.zzm();
                } while (zzm == this.zzb);
                this.zzd = zzm;
                return;
            }
            throw zzyg.zza();
        }
        int zzn2 = this.zza.zzn();
        zzX(zzn2);
        int zzd2 = this.zza.zzd() + zzn2;
        do {
            list.add(Integer.valueOf(this.zza.zzk()));
        } while (this.zza.zzd() < zzd2);
    }

    @Override // com.google.android.gms.internal.gtm.zzzs
    public final void zzJ(List list) throws IOException {
        int zzm;
        if (list instanceof zzyv) {
            AbstractC22494uj2.m1214a(list);
            int i = this.zzb & 7;
            if (i != 1) {
                if (i != 2) {
                    throw zzyg.zza();
                }
                zzY(this.zza.zzn());
                this.zza.zzd();
                this.zza.zzt();
                throw null;
            }
            this.zza.zzt();
            throw null;
        }
        int i2 = this.zzb & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int zzn = this.zza.zzn();
                zzY(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    list.add(Long.valueOf(this.zza.zzt()));
                } while (this.zza.zzd() < zzd);
                return;
            }
            throw zzyg.zza();
        }
        do {
            list.add(Long.valueOf(this.zza.zzt()));
            if (this.zza.zzC()) {
                return;
            }
            zzm = this.zza.zzm();
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.gtm.zzzs
    public final void zzK(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzxw) {
            zzxw zzxwVar = (zzxw) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i == 2) {
                    zzuj zzujVar = this.zza;
                    int zzd = zzujVar.zzd() + zzujVar.zzn();
                    do {
                        zzxwVar.zzh(this.zza.zzl());
                    } while (this.zza.zzd() < zzd);
                    zzV(zzd);
                    return;
                }
                throw zzyg.zza();
            }
            do {
                zzxwVar.zzh(this.zza.zzl());
                if (this.zza.zzC()) {
                    return;
                }
                zzm2 = this.zza.zzm();
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                zzuj zzujVar2 = this.zza;
                int zzd2 = zzujVar2.zzd() + zzujVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzl()));
                } while (this.zza.zzd() < zzd2);
                zzV(zzd2);
                return;
            }
            throw zzyg.zza();
        }
        do {
            list.add(Integer.valueOf(this.zza.zzl()));
            if (this.zza.zzC()) {
                return;
            }
            zzm = this.zza.zzm();
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.gtm.zzzs
    public final void zzL(List list) throws IOException {
        int zzm;
        if (list instanceof zzyv) {
            AbstractC22494uj2.m1214a(list);
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zzyg.zza();
                }
                zzuj zzujVar = this.zza;
                zzujVar.zzn();
                zzujVar.zzd();
                this.zza.zzu();
                throw null;
            }
            this.zza.zzu();
            throw null;
        }
        int i2 = this.zzb & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                zzuj zzujVar2 = this.zza;
                int zzd = zzujVar2.zzd() + zzujVar2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzu()));
                } while (this.zza.zzd() < zzd);
                zzV(zzd);
                return;
            }
            throw zzyg.zza();
        }
        do {
            list.add(Long.valueOf(this.zza.zzu()));
            if (this.zza.zzC()) {
                return;
            }
            zzm = this.zza.zzm();
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    public final void zzM(List list, boolean z) throws IOException {
        String zzt;
        int zzm;
        int zzm2;
        if ((this.zzb & 7) == 2) {
            if ((list instanceof zzyo) && !z) {
                zzyo zzyoVar = (zzyo) list;
                do {
                    zzyoVar.zzi(zzp());
                    if (this.zza.zzC()) {
                        return;
                    }
                    zzm2 = this.zza.zzm();
                } while (zzm2 == this.zzb);
                this.zzd = zzm2;
                return;
            }
            do {
                if (z) {
                    zzt = zzu();
                } else {
                    zzt = zzt();
                }
                list.add(zzt);
                if (this.zza.zzC()) {
                    return;
                }
                zzm = this.zza.zzm();
            } while (zzm == this.zzb);
            this.zzd = zzm;
            return;
        }
        throw zzyg.zza();
    }

    @Override // com.google.android.gms.internal.gtm.zzzs
    public final void zzN(List list) throws IOException {
        int zzm;
        int zzm2;
        if (list instanceof zzxw) {
            zzxw zzxwVar = (zzxw) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i == 2) {
                    zzuj zzujVar = this.zza;
                    int zzd = zzujVar.zzd() + zzujVar.zzn();
                    do {
                        zzxwVar.zzh(this.zza.zzn());
                    } while (this.zza.zzd() < zzd);
                    zzV(zzd);
                    return;
                }
                throw zzyg.zza();
            }
            do {
                zzxwVar.zzh(this.zza.zzn());
                if (this.zza.zzC()) {
                    return;
                }
                zzm2 = this.zza.zzm();
            } while (zzm2 == this.zzb);
            this.zzd = zzm2;
            return;
        }
        int i2 = this.zzb & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                zzuj zzujVar2 = this.zza;
                int zzd2 = zzujVar2.zzd() + zzujVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzn()));
                } while (this.zza.zzd() < zzd2);
                zzV(zzd2);
                return;
            }
            throw zzyg.zza();
        }
        do {
            list.add(Integer.valueOf(this.zza.zzn()));
            if (this.zza.zzC()) {
                return;
            }
            zzm = this.zza.zzm();
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.gtm.zzzs
    public final void zzO(List list) throws IOException {
        int zzm;
        if (list instanceof zzyv) {
            AbstractC22494uj2.m1214a(list);
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zzyg.zza();
                }
                zzuj zzujVar = this.zza;
                zzujVar.zzn();
                zzujVar.zzd();
                this.zza.zzv();
                throw null;
            }
            this.zza.zzv();
            throw null;
        }
        int i2 = this.zzb & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                zzuj zzujVar2 = this.zza;
                int zzd = zzujVar2.zzd() + zzujVar2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzv()));
                } while (this.zza.zzd() < zzd);
                zzV(zzd);
                return;
            }
            throw zzyg.zza();
        }
        do {
            list.add(Long.valueOf(this.zza.zzv()));
            if (this.zza.zzC()) {
                return;
            }
            zzm = this.zza.zzm();
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.gtm.zzzs
    public final boolean zzP() throws IOException {
        zzW(0);
        return this.zza.zzD();
    }

    @Override // com.google.android.gms.internal.gtm.zzzs
    public final boolean zzQ() throws IOException {
        int i;
        if (!this.zza.zzC() && (i = this.zzb) != this.zzc) {
            return this.zza.zzE(i);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.gtm.zzzs
    public final double zza() throws IOException {
        zzW(1);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.gtm.zzzs
    public final float zzb() throws IOException {
        zzW(5);
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.gtm.zzzs
    public final int zzc() throws IOException {
        int i = this.zzd;
        if (i != 0) {
            this.zzb = i;
            this.zzd = 0;
        } else {
            i = this.zza.zzm();
            this.zzb = i;
        }
        if (i != 0 && i != this.zzc) {
            return i >>> 3;
        }
        return Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.gtm.zzzs
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.gtm.zzzs
    public final int zze() throws IOException {
        zzW(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.gtm.zzzs
    public final int zzf() throws IOException {
        zzW(5);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.gtm.zzzs
    public final int zzg() throws IOException {
        zzW(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.gtm.zzzs
    public final int zzh() throws IOException {
        zzW(5);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.gtm.zzzs
    public final int zzi() throws IOException {
        zzW(0);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.gtm.zzzs
    public final int zzj() throws IOException {
        zzW(0);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.gtm.zzzs
    public final long zzk() throws IOException {
        zzW(1);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.gtm.zzzs
    public final long zzl() throws IOException {
        zzW(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.gtm.zzzs
    public final long zzm() throws IOException {
        zzW(1);
        return this.zza.zzt();
    }

    @Override // com.google.android.gms.internal.gtm.zzzs
    public final long zzn() throws IOException {
        zzW(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.gtm.zzzs
    public final long zzo() throws IOException {
        zzW(0);
        return this.zza.zzv();
    }

    @Override // com.google.android.gms.internal.gtm.zzzs
    public final zzud zzp() throws IOException {
        zzW(2);
        return this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.gtm.zzzs
    @Deprecated
    public final Object zzr(Class cls, zzxf zzxfVar) throws IOException {
        zzW(3);
        return zzR(zzzp.zza().zzb(cls), zzxfVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzzs
    public final Object zzs(Class cls, zzxf zzxfVar) throws IOException {
        zzW(2);
        return zzS(zzzp.zza().zzb(cls), zzxfVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzzs
    public final String zzt() throws IOException {
        zzW(2);
        return this.zza.zzx();
    }

    @Override // com.google.android.gms.internal.gtm.zzzs
    public final String zzu() throws IOException {
        zzW(2);
        return this.zza.zzy();
    }

    @Override // com.google.android.gms.internal.gtm.zzzs
    public final void zzv(Object obj, zzzt zzztVar, zzxf zzxfVar) throws IOException {
        zzW(3);
        zzT(obj, zzztVar, zzxfVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzzs
    public final void zzw(Object obj, zzzt zzztVar, zzxf zzxfVar) throws IOException {
        zzW(2);
        zzU(obj, zzztVar, zzxfVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzzs
    public final void zzx(List list) throws IOException {
        int zzm;
        if (list instanceof zzts) {
            AbstractC22494uj2.m1214a(list);
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zzyg.zza();
                }
                zzuj zzujVar = this.zza;
                zzujVar.zzn();
                zzujVar.zzd();
                this.zza.zzD();
                throw null;
            }
            this.zza.zzD();
            throw null;
        }
        int i2 = this.zzb & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                zzuj zzujVar2 = this.zza;
                int zzd = zzujVar2.zzd() + zzujVar2.zzn();
                do {
                    list.add(Boolean.valueOf(this.zza.zzD()));
                } while (this.zza.zzd() < zzd);
                zzV(zzd);
                return;
            }
            throw zzyg.zza();
        }
        do {
            list.add(Boolean.valueOf(this.zza.zzD()));
            if (this.zza.zzC()) {
                return;
            }
            zzm = this.zza.zzm();
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.gtm.zzzs
    public final void zzy(List list) throws IOException {
        int zzm;
        if ((this.zzb & 7) == 2) {
            do {
                list.add(zzp());
                if (this.zza.zzC()) {
                    return;
                }
                zzm = this.zza.zzm();
            } while (zzm == this.zzb);
            this.zzd = zzm;
            return;
        }
        throw zzyg.zza();
    }

    @Override // com.google.android.gms.internal.gtm.zzzs
    public final void zzz(List list) throws IOException {
        int zzm;
        if (list instanceof zzxc) {
            AbstractC22494uj2.m1214a(list);
            int i = this.zzb & 7;
            if (i != 1) {
                if (i != 2) {
                    throw zzyg.zza();
                }
                zzY(this.zza.zzn());
                this.zza.zzd();
                this.zza.zzb();
                throw null;
            }
            this.zza.zzb();
            throw null;
        }
        int i2 = this.zzb & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int zzn = this.zza.zzn();
                zzY(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    list.add(Double.valueOf(this.zza.zzb()));
                } while (this.zza.zzd() < zzd);
                return;
            }
            throw zzyg.zza();
        }
        do {
            list.add(Double.valueOf(this.zza.zzb()));
            if (this.zza.zzC()) {
                return;
            }
            zzm = this.zza.zzm();
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }
}
