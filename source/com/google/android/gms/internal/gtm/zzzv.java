package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class zzzv {

    /* renamed from: a */
    public static final /* synthetic */ int f46130a = 0;
    private static final Class zzb;
    private static final zzaak zzc;
    private static final zzaak zzd;

    static {
        Class<?> cls;
        Class<?> cls2;
        zzaak zzaakVar = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                zzaakVar = (zzaak) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        zzc = zzaakVar;
        zzd = new zzaam();
    }

    public static void zzA(int i, List list, zzur zzurVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzurVar.zzp(i, list, z);
        }
    }

    public static void zzB(int i, List list, zzur zzurVar, zzzt zzztVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                zzurVar.zzq(i, list.get(i2), zzztVar);
            }
        }
    }

    public static void zzC(int i, List list, zzur zzurVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzurVar.zzs(i, list, z);
        }
    }

    public static void zzD(int i, List list, zzur zzurVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzurVar.zzu(i, list, z);
        }
    }

    public static void zzE(int i, List list, zzur zzurVar, zzzt zzztVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                zzurVar.zzv(i, list.get(i2), zzztVar);
            }
        }
    }

    public static void zzF(int i, List list, zzur zzurVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzurVar.zzy(i, list, z);
        }
    }

    public static void zzG(int i, List list, zzur zzurVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzurVar.zzA(i, list, z);
        }
    }

    public static void zzH(int i, List list, zzur zzurVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzurVar.zzC(i, list, z);
        }
    }

    public static void zzI(int i, List list, zzur zzurVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzurVar.zzE(i, list, z);
        }
    }

    public static void zzJ(int i, List list, zzur zzurVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzurVar.zzH(i, list);
        }
    }

    public static void zzK(int i, List list, zzur zzurVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzurVar.zzJ(i, list, z);
        }
    }

    public static void zzL(int i, List list, zzur zzurVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzurVar.zzL(i, list, z);
        }
    }

    public static int zza(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzxw) {
            zzxw zzxwVar = (zzxw) list;
            i = 0;
            while (i2 < size) {
                i += zzuq.zzz(zzxwVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzuq.zzz(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzb(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzuq.zzD(i << 3) + 4);
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzuq.zzD(i << 3) + 8);
    }

    public static int zze(List list) {
        return list.size() * 8;
    }

    public static int zzf(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzxw) {
            zzxw zzxwVar = (zzxw) list;
            i = 0;
            while (i2 < size) {
                i += zzuq.zzz(zzxwVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzuq.zzz(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzg(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzyv) {
            zzyv zzyvVar = (zzyv) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += zzuq.zzE(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static int zzh(int i, Object obj, zzzt zzztVar) {
        int i2 = i << 3;
        if (obj instanceof zzym) {
            int i3 = zzuq.zzf;
            int zza = ((zzym) obj).zza();
            return zzuq.zzD(i2) + zzuq.zzD(zza) + zza;
        }
        return zzuq.zzD(i2) + zzuq.zzB((zzzg) obj, zzztVar);
    }

    public static int zzi(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzxw) {
            zzxw zzxwVar = (zzxw) list;
            i = 0;
            while (i2 < size) {
                int zze = zzxwVar.zze(i2);
                i += zzuq.zzD((zze >> 31) ^ (zze + zze));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i += zzuq.zzD((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    public static int zzj(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzyv) {
            zzyv zzyvVar = (zzyv) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Long) list.get(i2)).longValue();
            i += zzuq.zzE((longValue >> 63) ^ (longValue + longValue));
        }
        return i;
    }

    public static int zzk(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzxw) {
            zzxw zzxwVar = (zzxw) list;
            i = 0;
            while (i2 < size) {
                i += zzuq.zzD(zzxwVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzuq.zzD(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzl(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzyv) {
            zzyv zzyvVar = (zzyv) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += zzuq.zzE(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static zzaak zzm() {
        return zzc;
    }

    public static zzaak zzn() {
        return zzd;
    }

    public static Object zzo(Object obj, int i, List list, zzxz zzxzVar, Object obj2, zzaak zzaakVar) {
        if (zzxzVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = (Integer) list.get(i3);
                int intValue = num.intValue();
                if (zzxzVar.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    obj2 = zzp(obj, i, intValue, obj2, zzaakVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzxzVar.zza(intValue2)) {
                    obj2 = zzp(obj, i, intValue2, obj2, zzaakVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static Object zzp(Object obj, int i, int i2, Object obj2, zzaak zzaakVar) {
        if (obj2 == null) {
            obj2 = zzaakVar.zzc(obj);
        }
        zzaakVar.zzl(obj2, i, i2);
        return obj2;
    }

    public static void zzq(zzxg zzxgVar, Object obj, Object obj2) {
        zzxk zzb2 = zzxgVar.zzb(obj2);
        if (!zzb2.zza.isEmpty()) {
            zzxgVar.zzc(obj).zzj(zzb2);
        }
    }

    public static void zzr(zzaak zzaakVar, Object obj, Object obj2) {
        zzaakVar.zzo(obj, zzaakVar.zze(zzaakVar.zzd(obj), zzaakVar.zzd(obj2)));
    }

    public static void zzs(Class cls) {
        Class cls2;
        if (!zzxv.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean zzt(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static void zzu(int i, List list, zzur zzurVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzurVar.zzc(i, list, z);
        }
    }

    public static void zzv(int i, List list, zzur zzurVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzurVar.zze(i, list);
        }
    }

    public static void zzw(int i, List list, zzur zzurVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzurVar.zzg(i, list, z);
        }
    }

    public static void zzx(int i, List list, zzur zzurVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzurVar.zzj(i, list, z);
        }
    }

    public static void zzy(int i, List list, zzur zzurVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzurVar.zzl(i, list, z);
        }
    }

    public static void zzz(int i, List list, zzur zzurVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzurVar.zzn(i, list, z);
        }
    }
}
