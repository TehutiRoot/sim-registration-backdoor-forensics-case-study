package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzxk {
    private static final zzxk zzb = new zzxk(true);
    final zzaag zza = new zzzw(16);
    private boolean zzc;
    private boolean zzd;

    private zzxk() {
    }

    public static int zza(zzaba zzabaVar, int i, Object obj) {
        int zzd;
        int zzD;
        int zzD2 = zzuq.zzD(i << 3);
        if (zzabaVar == zzaba.zzj) {
            byte[] bArr = zzye.zzd;
            if (!(((zzzg) obj) instanceof zztm)) {
                zzD2 += zzD2;
            } else {
                throw null;
            }
        }
        zzabb zzabbVar = zzabb.INT;
        int i2 = 4;
        switch (zzabaVar.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                i2 = 8;
                break;
            case 1:
                ((Float) obj).floatValue();
                break;
            case 2:
                i2 = zzuq.zzE(((Long) obj).longValue());
                break;
            case 3:
                i2 = zzuq.zzE(((Long) obj).longValue());
                break;
            case 4:
                i2 = zzuq.zzz(((Integer) obj).intValue());
                break;
            case 5:
                ((Long) obj).longValue();
                i2 = 8;
                break;
            case 6:
                ((Integer) obj).intValue();
                break;
            case 7:
                ((Boolean) obj).booleanValue();
                i2 = 1;
                break;
            case 8:
                if (obj instanceof zzud) {
                    zzd = ((zzud) obj).zzd();
                    zzD = zzuq.zzD(zzd);
                    i2 = zzD + zzd;
                    break;
                } else {
                    i2 = zzuq.zzC((String) obj);
                    break;
                }
            case 9:
                i2 = ((zzzg) obj).zzX();
                break;
            case 10:
                if (obj instanceof zzyl) {
                    zzd = ((zzyl) obj).zza();
                    zzD = zzuq.zzD(zzd);
                    i2 = zzD + zzd;
                    break;
                } else {
                    i2 = zzuq.zzA((zzzg) obj);
                    break;
                }
            case 11:
                if (obj instanceof zzud) {
                    zzd = ((zzud) obj).zzd();
                    zzD = zzuq.zzD(zzd);
                } else {
                    zzd = ((byte[]) obj).length;
                    zzD = zzuq.zzD(zzd);
                }
                i2 = zzD + zzd;
                break;
            case 12:
                i2 = zzuq.zzD(((Integer) obj).intValue());
                break;
            case 13:
                if (obj instanceof zzxx) {
                    i2 = zzuq.zzz(((zzxx) obj).zza());
                    break;
                } else {
                    i2 = zzuq.zzz(((Integer) obj).intValue());
                    break;
                }
            case 14:
                ((Integer) obj).intValue();
                break;
            case 15:
                ((Long) obj).longValue();
                i2 = 8;
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                i2 = zzuq.zzD((intValue >> 31) ^ (intValue + intValue));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                i2 = zzuq.zzE((longValue >> 63) ^ (longValue + longValue));
                break;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return zzD2 + i2;
    }

    public static int zzb(zzxj zzxjVar, Object obj) {
        zzaba zzd = zzxjVar.zzd();
        int zza = zzxjVar.zza();
        if (zzxjVar.zzg()) {
            zzxjVar.zzf();
            int i = 0;
            for (Object obj2 : (List) obj) {
                i += zza(zzd, zza, obj2);
            }
            return i;
        }
        return zza(zzd, zza, obj);
    }

    public static zzxk zze() {
        return zzb;
    }

    private static Object zzn(Object obj) {
        if (obj instanceof zzzl) {
            return ((zzzl) obj).zzc();
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return bArr2;
        }
        return obj;
    }

    private final void zzo(Map.Entry entry) {
        zzzg zzD;
        zzxj zzxjVar = (zzxj) entry.getKey();
        Object value = entry.getValue();
        if (!(value instanceof zzyl)) {
            if (zzxjVar.zzg()) {
                Object zzf = zzf(zzxjVar);
                if (zzf == null) {
                    zzf = new ArrayList();
                }
                for (Object obj : (List) value) {
                    ((List) zzf).add(zzn(obj));
                }
                this.zza.put(zzxjVar, zzf);
                return;
            } else if (zzxjVar.zze() == zzabb.MESSAGE) {
                Object zzf2 = zzf(zzxjVar);
                if (zzf2 == null) {
                    this.zza.put(zzxjVar, zzn(value));
                    return;
                }
                if (zzf2 instanceof zzzl) {
                    zzD = zzxjVar.zzc((zzzl) zzf2, (zzzl) value);
                } else {
                    zzzf zzav = ((zzzg) zzf2).zzav();
                    zzxjVar.zzb(zzav, (zzzg) value);
                    zzD = zzav.zzD();
                }
                this.zza.put(zzxjVar, zzD);
                return;
            } else {
                this.zza.put(zzxjVar, zzn(value));
                return;
            }
        }
        throw null;
    }

    private static boolean zzp(Map.Entry entry) {
        zzxj zzxjVar = (zzxj) entry.getKey();
        if (zzxjVar.zze() == zzabb.MESSAGE) {
            if (zzxjVar.zzg()) {
                for (Object obj : (List) entry.getValue()) {
                    if (!zzq(obj)) {
                        return false;
                    }
                }
                return true;
            }
            return zzq(entry.getValue());
        }
        return true;
    }

    private static boolean zzq(Object obj) {
        if (obj instanceof zzzh) {
            return ((zzzh) obj).zzay();
        }
        if (obj instanceof zzyl) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzr(Map.Entry entry) {
        zzxj zzxjVar = (zzxj) entry.getKey();
        Object value = entry.getValue();
        if (zzxjVar.zze() == zzabb.MESSAGE && !zzxjVar.zzg()) {
            zzxjVar.zzf();
            if (value instanceof zzyl) {
                int zzD = zzuq.zzD(((zzxj) entry.getKey()).zza());
                int zza = ((zzyl) value).zza();
                int zzD2 = zzuq.zzD(zza) + zza;
                int zzD3 = zzuq.zzD(24);
                int zzD4 = zzuq.zzD(16);
                int zzD5 = zzuq.zzD(8);
                return zzD5 + zzD5 + zzD4 + zzD + zzD3 + zzD2;
            }
            int zzD6 = zzuq.zzD(((zzxj) entry.getKey()).zza());
            int zzD7 = zzuq.zzD(24) + zzuq.zzA((zzzg) value);
            int zzD8 = zzuq.zzD(16);
            int zzD9 = zzuq.zzD(8);
            return zzD9 + zzD9 + zzD8 + zzD6 + zzD7;
        }
        return zzb(zzxjVar, value);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void zzs(com.google.android.gms.internal.gtm.zzxj r4, java.lang.Object r5) {
        /*
            com.google.android.gms.internal.gtm.zzaba r0 = r4.zzd()
            byte[] r1 = com.google.android.gms.internal.gtm.zzye.zzd
            r5.getClass()
            com.google.android.gms.internal.gtm.zzaba r1 = com.google.android.gms.internal.gtm.zzaba.zza
            com.google.android.gms.internal.gtm.zzabb r1 = com.google.android.gms.internal.gtm.zzabb.INT
            com.google.android.gms.internal.gtm.zzabb r0 = r0.zza()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L43;
                case 1: goto L40;
                case 2: goto L3d;
                case 3: goto L3a;
                case 4: goto L37;
                case 5: goto L34;
                case 6: goto L2b;
                case 7: goto L22;
                case 8: goto L19;
                default: goto L18;
            }
        L18:
            goto L48
        L19:
            boolean r0 = r5 instanceof com.google.android.gms.internal.gtm.zzzg
            if (r0 != 0) goto L47
            boolean r0 = r5 instanceof com.google.android.gms.internal.gtm.zzyl
            if (r0 == 0) goto L48
            goto L47
        L22:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L47
            boolean r0 = r5 instanceof com.google.android.gms.internal.gtm.zzxx
            if (r0 == 0) goto L48
            goto L47
        L2b:
            boolean r0 = r5 instanceof com.google.android.gms.internal.gtm.zzud
            if (r0 != 0) goto L47
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L48
            goto L47
        L34:
            boolean r0 = r5 instanceof java.lang.String
            goto L45
        L37:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L45
        L3a:
            boolean r0 = r5 instanceof java.lang.Double
            goto L45
        L3d:
            boolean r0 = r5 instanceof java.lang.Float
            goto L45
        L40:
            boolean r0 = r5 instanceof java.lang.Long
            goto L45
        L43:
            boolean r0 = r5 instanceof java.lang.Integer
        L45:
            if (r0 == 0) goto L48
        L47:
            return
        L48:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r4.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.gtm.zzaba r4 = r4.zzd()
            com.google.android.gms.internal.gtm.zzabb r4 = r4.zza()
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            r1 = 1
            r2[r1] = r4
            r4 = 2
            r2[r4] = r5
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r2)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzxk.zzs(com.google.android.gms.internal.gtm.zzxj, java.lang.Object):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzxk)) {
            return false;
        }
        return this.zza.equals(((zzxk) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzc() {
        int i = 0;
        for (int i2 = 0; i2 < this.zza.zzb(); i2++) {
            i += zzr(this.zza.zzg(i2));
        }
        for (Map.Entry entry : this.zza.zzc()) {
            i += zzr(entry);
        }
        return i;
    }

    /* renamed from: zzd */
    public final zzxk clone() {
        zzxk zzxkVar = new zzxk();
        for (int i = 0; i < this.zza.zzb(); i++) {
            Map.Entry zzg = this.zza.zzg(i);
            zzxkVar.zzk((zzxj) zzg.getKey(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzxkVar.zzk((zzxj) entry.getKey(), entry.getValue());
        }
        zzxkVar.zzd = this.zzd;
        return zzxkVar;
    }

    public final Object zzf(zzxj zzxjVar) {
        Object obj = this.zza.get(zzxjVar);
        if (!(obj instanceof zzyl)) {
            return obj;
        }
        throw null;
    }

    public final Iterator zzg() {
        if (this.zzd) {
            return new zzyk(this.zza.entrySet().iterator());
        }
        return this.zza.entrySet().iterator();
    }

    public final void zzh(zzxj zzxjVar, Object obj) {
        List list;
        if (((zzxs) zzxjVar).zzd) {
            zzs(zzxjVar, obj);
            Object zzf = zzf(zzxjVar);
            if (zzf == null) {
                list = new ArrayList();
                this.zza.put(zzxjVar, list);
            } else {
                list = (List) zzf;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    public final void zzi() {
        if (!this.zzc) {
            for (int i = 0; i < this.zza.zzb(); i++) {
                Map.Entry zzg = this.zza.zzg(i);
                if (zzg.getValue() instanceof zzxv) {
                    ((zzxv) zzg.getValue()).zzal();
                }
            }
            this.zza.zza();
            this.zzc = true;
        }
    }

    public final void zzj(zzxk zzxkVar) {
        for (int i = 0; i < zzxkVar.zza.zzb(); i++) {
            zzo(zzxkVar.zza.zzg(i));
        }
        for (Map.Entry entry : zzxkVar.zza.zzc()) {
            zzo(entry);
        }
    }

    public final void zzk(zzxj zzxjVar, Object obj) {
        if (zzxjVar.zzg()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    zzs(zzxjVar, arrayList.get(i));
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            zzs(zzxjVar, obj);
        }
        if (obj instanceof zzyl) {
            this.zzd = true;
        }
        this.zza.put(zzxjVar, obj);
    }

    public final boolean zzl() {
        return this.zzc;
    }

    public final boolean zzm() {
        for (int i = 0; i < this.zza.zzb(); i++) {
            if (!zzp(this.zza.zzg(i))) {
                return false;
            }
        }
        for (Map.Entry entry : this.zza.zzc()) {
            if (!zzp(entry)) {
                return false;
            }
        }
        return true;
    }

    private zzxk(boolean z) {
        zzi();
        zzi();
    }
}
