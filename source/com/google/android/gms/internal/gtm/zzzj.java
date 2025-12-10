package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.EACTags;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzzj<T> implements zzzt<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzaau.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzzg zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzyu zzm;
    private final zzaak zzn;
    private final zzxg zzo;
    private final zzzm zzp;
    private final zzzb zzq;

    private zzzj(int[] iArr, Object[] objArr, int i, int i2, zzzg zzzgVar, int i3, boolean z, int[] iArr2, int i4, int i5, zzzm zzzmVar, zzyu zzyuVar, zzaak zzaakVar, zzxg zzxgVar, zzzb zzzbVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzzgVar instanceof zzxv;
        boolean z2 = false;
        if (zzxgVar != null && zzxgVar.zzi(zzzgVar)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i4;
        this.zzl = i5;
        this.zzp = zzzmVar;
        this.zzm = zzyuVar;
        this.zzn = zzaakVar;
        this.zzo = zzxgVar;
        this.zzg = zzzgVar;
        this.zzq = zzzbVar;
    }

    private final Object zzA(Object obj, int i) {
        zzzt zzx = zzx(i);
        int zzu = zzu(i) & 1048575;
        if (!zzN(obj, i)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzB(Object obj, int i, int i2) {
        zzzt zzx = zzx(i2);
        if (!zzR(obj, i, i2)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i2) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static void zzD(Object obj) {
        if (zzQ(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    private final void zzE(Object obj, Object obj2, int i) {
        if (!zzN(obj2, i)) {
            return;
        }
        Unsafe unsafe = zzb;
        long zzu = zzu(i) & 1048575;
        Object object = unsafe.getObject(obj2, zzu);
        if (object != null) {
            zzzt zzx = zzx(i);
            if (!zzN(obj, i)) {
                if (!zzQ(object)) {
                    unsafe.putObject(obj, zzu, object);
                } else {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, zzu, zze);
                }
                zzH(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, zzu);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, zzu, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
    }

    private final void zzF(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (!zzR(obj2, i2, i)) {
            return;
        }
        Unsafe unsafe = zzb;
        long zzu = zzu(i) & 1048575;
        Object object = unsafe.getObject(obj2, zzu);
        if (object != null) {
            zzzt zzx = zzx(i);
            if (!zzR(obj, i2, i)) {
                if (!zzQ(object)) {
                    unsafe.putObject(obj, zzu, object);
                } else {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, zzu, zze);
                }
                zzI(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, zzu);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, zzu, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
    }

    private final void zzG(Object obj, int i, zzzs zzzsVar) throws IOException {
        long j = i & 1048575;
        if (zzM(i)) {
            zzaau.zzs(obj, j, zzzsVar.zzu());
        } else if (this.zzi) {
            zzaau.zzs(obj, j, zzzsVar.zzt());
        } else {
            zzaau.zzs(obj, j, zzzsVar.zzp());
        }
    }

    private final void zzH(Object obj, int i) {
        int zzr = zzr(i);
        long j = 1048575 & zzr;
        if (j == 1048575) {
            return;
        }
        zzaau.zzq(obj, j, (1 << (zzr >>> 20)) | zzaau.zzc(obj, j));
    }

    private final void zzI(Object obj, int i, int i2) {
        zzaau.zzq(obj, zzr(i2) & 1048575, i);
    }

    private final void zzJ(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzu(i) & 1048575, obj2);
        zzH(obj, i);
    }

    private final void zzK(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzu(i2) & 1048575, obj2);
        zzI(obj, i, i2);
    }

    private final boolean zzL(Object obj, Object obj2, int i) {
        if (zzN(obj, i) == zzN(obj2, i)) {
            return true;
        }
        return false;
    }

    private static boolean zzM(int i) {
        return (i & PKIFailureInfo.duplicateCertReq) != 0;
    }

    private final boolean zzN(Object obj, int i) {
        int zzr = zzr(i);
        long j = zzr & 1048575;
        if (j == 1048575) {
            int zzu = zzu(i);
            long j2 = zzu & 1048575;
            switch (zzt(zzu)) {
                case 0:
                    if (Double.doubleToRawLongBits(zzaau.zza(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(zzaau.zzb(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (zzaau.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (zzaau.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (zzaau.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (zzaau.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (zzaau.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return zzaau.zzw(obj, j2);
                case 8:
                    Object zzf = zzaau.zzf(obj, j2);
                    if (zzf instanceof String) {
                        if (((String) zzf).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (zzf instanceof zzud) {
                        if (zzud.zzb.equals(zzf)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (zzaau.zzf(obj, j2) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzud.zzb.equals(zzaau.zzf(obj, j2))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (zzaau.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (zzaau.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (zzaau.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (zzaau.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (zzaau.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (zzaau.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (zzaau.zzf(obj, j2) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((zzaau.zzc(obj, j) & (1 << (zzr >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private final boolean zzO(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzN(obj, i);
        }
        if ((i3 & i4) != 0) {
            return true;
        }
        return false;
    }

    private static boolean zzP(Object obj, int i, zzzt zzztVar) {
        return zzztVar.zzk(zzaau.zzf(obj, i & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzxv) {
            return ((zzxv) obj).zzaq();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i, int i2) {
        if (zzaau.zzc(obj, zzr(i2) & 1048575) == i) {
            return true;
        }
        return false;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzaau.zzf(obj, j)).booleanValue();
    }

    private static final void zzT(int i, Object obj, zzur zzurVar) throws IOException {
        if (obj instanceof String) {
            zzurVar.zzG(i, (String) obj);
        } else {
            zzurVar.zzd(i, (zzud) obj);
        }
    }

    public static zzaal zzd(Object obj) {
        zzxv zzxvVar = (zzxv) obj;
        zzaal zzaalVar = zzxvVar.zzc;
        if (zzaalVar == zzaal.zzc()) {
            zzaal zzf = zzaal.zzf();
            zzxvVar.zzc = zzf;
            return zzf;
        }
        return zzaalVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0283  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.gtm.zzzj zzl(java.lang.Class r33, com.google.android.gms.internal.gtm.zzzd r34, com.google.android.gms.internal.gtm.zzzm r35, com.google.android.gms.internal.gtm.zzyu r36, com.google.android.gms.internal.gtm.zzaak r37, com.google.android.gms.internal.gtm.zzxg r38, com.google.android.gms.internal.gtm.zzzb r39) {
        /*
            Method dump skipped, instructions count: 1032
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzzj.zzl(java.lang.Class, com.google.android.gms.internal.gtm.zzzd, com.google.android.gms.internal.gtm.zzzm, com.google.android.gms.internal.gtm.zzyu, com.google.android.gms.internal.gtm.zzaak, com.google.android.gms.internal.gtm.zzxg, com.google.android.gms.internal.gtm.zzzb):com.google.android.gms.internal.gtm.zzzj");
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzaau.zzf(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzaau.zzf(obj, j)).floatValue();
    }

    private static int zzp(Object obj, long j) {
        return ((Integer) zzaau.zzf(obj, j)).intValue();
    }

    private final int zzq(int i) {
        if (i >= this.zze && i <= this.zzf) {
            return zzs(i, 0);
        }
        return -1;
    }

    private final int zzr(int i) {
        return this.zzc[i + 2];
    }

    private final int zzs(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int zzt(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzu(int i) {
        return this.zzc[i + 1];
    }

    private static long zzv(Object obj, long j) {
        return ((Long) zzaau.zzf(obj, j)).longValue();
    }

    private final zzxz zzw(int i) {
        int i2 = i / 3;
        return (zzxz) this.zzd[i2 + i2 + 1];
    }

    private final zzzt zzx(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzzt zzztVar = (zzzt) objArr[i3];
        if (zzztVar != null) {
            return zzztVar;
        }
        zzzt zzb2 = zzzp.zza().zzb((Class) objArr[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzy(Object obj, int i, Object obj2, zzaak zzaakVar, Object obj3) {
        int i2 = this.zzc[i];
        Object zzf = zzaau.zzf(obj, zzu(i) & 1048575);
        if (zzf == null) {
            return obj2;
        }
        if (zzw(i) == null) {
            return obj2;
        }
        zzza zzzaVar = (zzza) zzf;
        zzyz zzyzVar = (zzyz) zzz(i);
        throw null;
    }

    private final Object zzz(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    @Override // com.google.android.gms.internal.gtm.zzzt
    public final int zza(Object obj) {
        int i;
        int i2;
        int i3;
        int zzD;
        int zzD2;
        int zzE;
        int zzD3;
        int zzD4;
        int zzD5;
        int zzD6;
        int zzh;
        int zzg;
        int size;
        int zzD7;
        int zzD8;
        int zzD9;
        int zze;
        int zzD10;
        int zzD11;
        int i4;
        Unsafe unsafe = zzb;
        boolean z = false;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i8 < this.zzc.length) {
            int zzu = zzu(i8);
            int zzt = zzt(zzu);
            int[] iArr = this.zzc;
            int i10 = iArr[i8];
            int i11 = iArr[i8 + 2];
            int i12 = i11 & i5;
            if (zzt <= 17) {
                if (i12 != i6) {
                    if (i12 == i5) {
                        i7 = 0;
                    } else {
                        i7 = unsafe.getInt(obj, i12);
                    }
                    i6 = i12;
                }
                i = i6;
                i2 = i7;
                i3 = 1 << (i11 >>> 20);
            } else {
                i = i6;
                i2 = i7;
                i3 = 0;
            }
            int i13 = zzu & i5;
            if (zzt >= zzxl.zzJ.zza()) {
                zzxl.zzW.zza();
            }
            long j = i13;
            switch (zzt) {
                case 0:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzD = zzuq.zzD(i10 << 3);
                        zzh = zzD + 8;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzD2 = zzuq.zzD(i10 << 3);
                        zzh = zzD2 + 4;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzE = zzuq.zzE(unsafe.getLong(obj, j));
                        zzD3 = zzuq.zzD(i10 << 3);
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzE = zzuq.zzE(unsafe.getLong(obj, j));
                        zzD3 = zzuq.zzD(i10 << 3);
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzE = zzuq.zzz(unsafe.getInt(obj, j));
                        zzD3 = zzuq.zzD(i10 << 3);
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzD = zzuq.zzD(i10 << 3);
                        zzh = zzD + 8;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzD2 = zzuq.zzD(i10 << 3);
                        zzh = zzD2 + 4;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzD4 = zzuq.zzD(i10 << 3);
                        zzh = zzD4 + 1;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzO(obj, i8, i, i2, i3)) {
                        break;
                    } else {
                        int i14 = i10 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzud) {
                            int i15 = zzuq.zzf;
                            int zzd = ((zzud) object).zzd();
                            zzD5 = zzuq.zzD(zzd) + zzd;
                            zzD6 = zzuq.zzD(i14);
                            zzh = zzD6 + zzD5;
                            i9 += zzh;
                            break;
                        } else {
                            zzE = zzuq.zzC((String) object);
                            zzD3 = zzuq.zzD(i14);
                            zzh = zzD3 + zzE;
                            i9 += zzh;
                        }
                    }
                case 9:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzh = zzzv.zzh(i10, unsafe.getObject(obj, j), zzx(i8));
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzO(obj, i8, i, i2, i3)) {
                        int i16 = zzuq.zzf;
                        int zzd2 = ((zzud) unsafe.getObject(obj, j)).zzd();
                        zzD5 = zzuq.zzD(zzd2) + zzd2;
                        zzD6 = zzuq.zzD(i10 << 3);
                        zzh = zzD6 + zzD5;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzE = zzuq.zzD(unsafe.getInt(obj, j));
                        zzD3 = zzuq.zzD(i10 << 3);
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzE = zzuq.zzz(unsafe.getInt(obj, j));
                        zzD3 = zzuq.zzD(i10 << 3);
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzD2 = zzuq.zzD(i10 << 3);
                        zzh = zzD2 + 4;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzD = zzuq.zzD(i10 << 3);
                        zzh = zzD + 8;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(obj, i8, i, i2, i3)) {
                        int i17 = unsafe.getInt(obj, j);
                        zzD3 = zzuq.zzD(i10 << 3);
                        zzE = zzuq.zzD((i17 >> 31) ^ (i17 + i17));
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(obj, i8, i, i2, i3)) {
                        long j2 = unsafe.getLong(obj, j);
                        zzD3 = zzuq.zzD(i10 << 3);
                        zzE = zzuq.zzE((j2 >> 63) ^ (j2 + j2));
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzh = zzuq.zzy(i10, (zzzg) unsafe.getObject(obj, j), zzx(i8));
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzh = zzzv.zzd(i10, (List) unsafe.getObject(obj, j), z);
                    i9 += zzh;
                    break;
                case 19:
                    zzh = zzzv.zzb(i10, (List) unsafe.getObject(obj, j), z);
                    i9 += zzh;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    int i18 = zzzv.f46130a;
                    if (list.size() != 0) {
                        zzg = zzzv.zzg(list) + (list.size() * zzuq.zzD(i10 << 3));
                        i9 += zzg;
                        break;
                    }
                    zzg = 0;
                    i9 += zzg;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j);
                    int i19 = zzzv.f46130a;
                    size = list2.size();
                    if (size != 0) {
                        zzD3 = zzzv.zzl(list2);
                        zzD7 = zzuq.zzD(i10 << 3);
                        zzE = size * zzD7;
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        break;
                    }
                    zzh = 0;
                    i9 += zzh;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i20 = zzzv.f46130a;
                    size = list3.size();
                    if (size != 0) {
                        zzD3 = zzzv.zzf(list3);
                        zzD7 = zzuq.zzD(i10 << 3);
                        zzE = size * zzD7;
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        break;
                    }
                    zzh = 0;
                    i9 += zzh;
                case 23:
                    zzh = zzzv.zzd(i10, (List) unsafe.getObject(obj, j), z);
                    i9 += zzh;
                    break;
                case 24:
                    zzh = zzzv.zzb(i10, (List) unsafe.getObject(obj, j), z);
                    i9 += zzh;
                    break;
                case 25:
                    int i21 = zzzv.f46130a;
                    int size2 = ((List) unsafe.getObject(obj, j)).size();
                    if (size2 != 0) {
                        zzh = size2 * (zzuq.zzD(i10 << 3) + 1);
                        i9 += zzh;
                        break;
                    }
                    zzh = 0;
                    i9 += zzh;
                case 26:
                    List list4 = (List) unsafe.getObject(obj, j);
                    int i22 = zzzv.f46130a;
                    int size3 = list4.size();
                    if (size3 != 0) {
                        boolean z2 = list4 instanceof zzyo;
                        zzg = zzuq.zzD(i10 << 3) * size3;
                        if (z2) {
                            zzyo zzyoVar = (zzyo) list4;
                            for (int i23 = 0; i23 < size3; i23++) {
                                Object zzf = zzyoVar.zzf(i23);
                                if (zzf instanceof zzud) {
                                    int zzd3 = ((zzud) zzf).zzd();
                                    zzg += zzuq.zzD(zzd3) + zzd3;
                                } else {
                                    zzg += zzuq.zzC((String) zzf);
                                }
                            }
                        } else {
                            for (int i24 = 0; i24 < size3; i24++) {
                                Object obj2 = list4.get(i24);
                                if (obj2 instanceof zzud) {
                                    int zzd4 = ((zzud) obj2).zzd();
                                    zzg += zzuq.zzD(zzd4) + zzd4;
                                } else {
                                    zzg += zzuq.zzC((String) obj2);
                                }
                            }
                        }
                        i9 += zzg;
                        break;
                    }
                    zzg = 0;
                    i9 += zzg;
                case 27:
                    List list5 = (List) unsafe.getObject(obj, j);
                    zzzt zzx = zzx(i8);
                    int i25 = zzzv.f46130a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        zzD8 = 0;
                    } else {
                        zzD8 = zzuq.zzD(i10 << 3) * size4;
                        for (int i26 = 0; i26 < size4; i26++) {
                            Object obj3 = list5.get(i26);
                            if (obj3 instanceof zzym) {
                                int zza2 = ((zzym) obj3).zza();
                                zzD8 += zzuq.zzD(zza2) + zza2;
                            } else {
                                zzD8 += zzuq.zzB((zzzg) obj3, zzx);
                            }
                        }
                    }
                    i9 += zzD8;
                    break;
                case 28:
                    List list6 = (List) unsafe.getObject(obj, j);
                    int i27 = zzzv.f46130a;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        zzD9 = 0;
                    } else {
                        zzD9 = size5 * zzuq.zzD(i10 << 3);
                        for (int i28 = 0; i28 < list6.size(); i28++) {
                            int zzd5 = ((zzud) list6.get(i28)).zzd();
                            zzD9 += zzuq.zzD(zzd5) + zzd5;
                        }
                    }
                    i9 += zzD9;
                    break;
                case 29:
                    List list7 = (List) unsafe.getObject(obj, j);
                    int i29 = zzzv.f46130a;
                    size = list7.size();
                    if (size != 0) {
                        zzD3 = zzzv.zzk(list7);
                        zzD7 = zzuq.zzD(i10 << 3);
                        zzE = size * zzD7;
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        break;
                    }
                    zzh = 0;
                    i9 += zzh;
                case 30:
                    List list8 = (List) unsafe.getObject(obj, j);
                    int i30 = zzzv.f46130a;
                    size = list8.size();
                    if (size != 0) {
                        zzD3 = zzzv.zza(list8);
                        zzD7 = zzuq.zzD(i10 << 3);
                        zzE = size * zzD7;
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        break;
                    }
                    zzh = 0;
                    i9 += zzh;
                case 31:
                    zzh = zzzv.zzb(i10, (List) unsafe.getObject(obj, j), z);
                    i9 += zzh;
                    break;
                case 32:
                    zzh = zzzv.zzd(i10, (List) unsafe.getObject(obj, j), z);
                    i9 += zzh;
                    break;
                case 33:
                    List list9 = (List) unsafe.getObject(obj, j);
                    int i31 = zzzv.f46130a;
                    size = list9.size();
                    if (size != 0) {
                        zzD3 = zzzv.zzi(list9);
                        zzD7 = zzuq.zzD(i10 << 3);
                        zzE = size * zzD7;
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        break;
                    }
                    zzh = 0;
                    i9 += zzh;
                case 34:
                    List list10 = (List) unsafe.getObject(obj, j);
                    int i32 = zzzv.f46130a;
                    size = list10.size();
                    if (size != 0) {
                        zzD3 = zzzv.zzj(list10);
                        zzD7 = zzuq.zzD(i10 << 3);
                        zzE = size * zzD7;
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        break;
                    }
                    zzh = 0;
                    i9 += zzh;
                case 35:
                    zze = zzzv.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzD10 = zzuq.zzD(zze);
                        zzD11 = zzuq.zzD(i10 << 3);
                        zzD9 = zzD11 + zzD10 + zze;
                        i9 += zzD9;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zze = zzzv.zzc((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzD10 = zzuq.zzD(zze);
                        zzD11 = zzuq.zzD(i10 << 3);
                        zzD9 = zzD11 + zzD10 + zze;
                        i9 += zzD9;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zze = zzzv.zzg((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzD10 = zzuq.zzD(zze);
                        zzD11 = zzuq.zzD(i10 << 3);
                        zzD9 = zzD11 + zzD10 + zze;
                        i9 += zzD9;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zze = zzzv.zzl((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzD10 = zzuq.zzD(zze);
                        zzD11 = zzuq.zzD(i10 << 3);
                        zzD9 = zzD11 + zzD10 + zze;
                        i9 += zzD9;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zze = zzzv.zzf((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzD10 = zzuq.zzD(zze);
                        zzD11 = zzuq.zzD(i10 << 3);
                        zzD9 = zzD11 + zzD10 + zze;
                        i9 += zzD9;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zze = zzzv.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzD10 = zzuq.zzD(zze);
                        zzD11 = zzuq.zzD(i10 << 3);
                        zzD9 = zzD11 + zzD10 + zze;
                        i9 += zzD9;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zze = zzzv.zzc((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzD10 = zzuq.zzD(zze);
                        zzD11 = zzuq.zzD(i10 << 3);
                        zzD9 = zzD11 + zzD10 + zze;
                        i9 += zzD9;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    int i33 = zzzv.f46130a;
                    zze = ((List) unsafe.getObject(obj, j)).size();
                    if (zze > 0) {
                        zzD10 = zzuq.zzD(zze);
                        zzD11 = zzuq.zzD(i10 << 3);
                        zzD9 = zzD11 + zzD10 + zze;
                        i9 += zzD9;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zze = zzzv.zzk((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzD10 = zzuq.zzD(zze);
                        zzD11 = zzuq.zzD(i10 << 3);
                        zzD9 = zzD11 + zzD10 + zze;
                        i9 += zzD9;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zze = zzzv.zza((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzD10 = zzuq.zzD(zze);
                        zzD11 = zzuq.zzD(i10 << 3);
                        zzD9 = zzD11 + zzD10 + zze;
                        i9 += zzD9;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zze = zzzv.zzc((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzD10 = zzuq.zzD(zze);
                        zzD11 = zzuq.zzD(i10 << 3);
                        zzD9 = zzD11 + zzD10 + zze;
                        i9 += zzD9;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zze = zzzv.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzD10 = zzuq.zzD(zze);
                        zzD11 = zzuq.zzD(i10 << 3);
                        zzD9 = zzD11 + zzD10 + zze;
                        i9 += zzD9;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zze = zzzv.zzi((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzD10 = zzuq.zzD(zze);
                        zzD11 = zzuq.zzD(i10 << 3);
                        zzD9 = zzD11 + zzD10 + zze;
                        i9 += zzD9;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zze = zzzv.zzj((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzD10 = zzuq.zzD(zze);
                        zzD11 = zzuq.zzD(i10 << 3);
                        zzD9 = zzD11 + zzD10 + zze;
                        i9 += zzD9;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list11 = (List) unsafe.getObject(obj, j);
                    zzzt zzx2 = zzx(i8);
                    int i34 = zzzv.f46130a;
                    int size6 = list11.size();
                    if (size6 == 0) {
                        i4 = 0;
                    } else {
                        i4 = 0;
                        for (int i35 = 0; i35 < size6; i35++) {
                            i4 += zzuq.zzy(i10, (zzzg) list11.get(i35), zzx2);
                        }
                    }
                    i9 += i4;
                    break;
                case 50:
                    zzza zzzaVar = (zzza) unsafe.getObject(obj, j);
                    zzyz zzyzVar = (zzyz) zzz(i8);
                    if (zzzaVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zzzaVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                        break;
                    }
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (zzR(obj, i10, i8)) {
                        zzD = zzuq.zzD(i10 << 3);
                        zzh = zzD + 8;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (zzR(obj, i10, i8)) {
                        zzD2 = zzuq.zzD(i10 << 3);
                        zzh = zzD2 + 4;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case EACTags.SEX /* 53 */:
                    if (zzR(obj, i10, i8)) {
                        zzE = zzuq.zzE(zzv(obj, j));
                        zzD3 = zzuq.zzD(i10 << 3);
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i10, i8)) {
                        zzE = zzuq.zzE(zzv(obj, j));
                        zzD3 = zzuq.zzD(i10 << 3);
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i10, i8)) {
                        zzE = zzuq.zzz(zzp(obj, j));
                        zzD3 = zzuq.zzD(i10 << 3);
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i10, i8)) {
                        zzD = zzuq.zzD(i10 << 3);
                        zzh = zzD + 8;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i10, i8)) {
                        zzD2 = zzuq.zzD(i10 << 3);
                        zzh = zzD2 + 4;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (zzR(obj, i10, i8)) {
                        zzD4 = zzuq.zzD(i10 << 3);
                        zzh = zzD4 + 1;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (!zzR(obj, i10, i8)) {
                        break;
                    } else {
                        int i36 = i10 << 3;
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzud) {
                            int i37 = zzuq.zzf;
                            int zzd6 = ((zzud) object2).zzd();
                            zzD5 = zzuq.zzD(zzd6) + zzd6;
                            zzD6 = zzuq.zzD(i36);
                            zzh = zzD6 + zzD5;
                            i9 += zzh;
                            break;
                        } else {
                            zzE = zzuq.zzC((String) object2);
                            zzD3 = zzuq.zzD(i36);
                            zzh = zzD3 + zzE;
                            i9 += zzh;
                        }
                    }
                case 60:
                    if (zzR(obj, i10, i8)) {
                        zzh = zzzv.zzh(i10, unsafe.getObject(obj, j), zzx(i8));
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i10, i8)) {
                        int i38 = zzuq.zzf;
                        int zzd7 = ((zzud) unsafe.getObject(obj, j)).zzd();
                        zzD5 = zzuq.zzD(zzd7) + zzd7;
                        zzD6 = zzuq.zzD(i10 << 3);
                        zzh = zzD6 + zzD5;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i10, i8)) {
                        zzE = zzuq.zzD(zzp(obj, j));
                        zzD3 = zzuq.zzD(i10 << 3);
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i10, i8)) {
                        zzE = zzuq.zzz(zzp(obj, j));
                        zzD3 = zzuq.zzD(i10 << 3);
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i10, i8)) {
                        zzD2 = zzuq.zzD(i10 << 3);
                        zzh = zzD2 + 4;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (zzR(obj, i10, i8)) {
                        zzD = zzuq.zzD(i10 << 3);
                        zzh = zzD + 8;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case EACTags.ADDRESS /* 66 */:
                    if (zzR(obj, i10, i8)) {
                        int zzp = zzp(obj, j);
                        zzD3 = zzuq.zzD(i10 << 3);
                        zzE = zzuq.zzD((zzp >> 31) ^ (zzp + zzp));
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (zzR(obj, i10, i8)) {
                        long zzv = zzv(obj, j);
                        zzD3 = zzuq.zzD(i10 << 3);
                        zzE = zzuq.zzE((zzv >> 63) ^ (zzv + zzv));
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (zzR(obj, i10, i8)) {
                        zzh = zzuq.zzy(i10, (zzzg) unsafe.getObject(obj, j), zzx(i8));
                        i9 += zzh;
                        break;
                    } else {
                        break;
                    }
            }
            i8 += 3;
            i6 = i;
            i7 = i2;
            z = false;
            i5 = 1048575;
        }
        zzaak zzaakVar = this.zzn;
        int zza3 = i9 + zzaakVar.zza(zzaakVar.zzd(obj));
        if (this.zzh) {
            zzxk zzb2 = this.zzo.zzb(obj);
            int i39 = 0;
            for (int i40 = 0; i40 < zzb2.zza.zzb(); i40++) {
                Map.Entry zzg2 = zzb2.zza.zzg(i40);
                i39 += zzxk.zzb((zzxj) zzg2.getKey(), zzg2.getValue());
            }
            for (Map.Entry entry2 : zzb2.zza.zzc()) {
                i39 += zzxk.zzb((zzxj) entry2.getKey(), entry2.getValue());
            }
            return zza3 + i39;
        }
        return zza3;
    }

    @Override // com.google.android.gms.internal.gtm.zzzt
    public final int zzb(Object obj) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int i3;
        int i4 = 0;
        for (int i5 = 0; i5 < this.zzc.length; i5 += 3) {
            int zzu = zzu(i5);
            int[] iArr = this.zzc;
            int i6 = 1048575 & zzu;
            int zzt = zzt(zzu);
            int i7 = iArr[i5];
            long j = i6;
            int i8 = 37;
            switch (zzt) {
                case 0:
                    i = i4 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzaau.zza(obj, j));
                    byte[] bArr = zzye.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i4 * 53;
                    floatToIntBits = Float.floatToIntBits(zzaau.zzb(obj, j));
                    i4 = i2 + floatToIntBits;
                    break;
                case 2:
                    i = i4 * 53;
                    doubleToLongBits = zzaau.zzd(obj, j);
                    byte[] bArr2 = zzye.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i4 * 53;
                    doubleToLongBits = zzaau.zzd(obj, j);
                    byte[] bArr3 = zzye.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i4 * 53;
                    floatToIntBits = zzaau.zzc(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 5:
                    i = i4 * 53;
                    doubleToLongBits = zzaau.zzd(obj, j);
                    byte[] bArr4 = zzye.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i4 * 53;
                    floatToIntBits = zzaau.zzc(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 7:
                    i2 = i4 * 53;
                    floatToIntBits = zzye.zza(zzaau.zzw(obj, j));
                    i4 = i2 + floatToIntBits;
                    break;
                case 8:
                    i2 = i4 * 53;
                    floatToIntBits = ((String) zzaau.zzf(obj, j)).hashCode();
                    i4 = i2 + floatToIntBits;
                    break;
                case 9:
                    i3 = i4 * 53;
                    Object zzf = zzaau.zzf(obj, j);
                    if (zzf != null) {
                        i8 = zzf.hashCode();
                    }
                    i4 = i3 + i8;
                    break;
                case 10:
                    i2 = i4 * 53;
                    floatToIntBits = zzaau.zzf(obj, j).hashCode();
                    i4 = i2 + floatToIntBits;
                    break;
                case 11:
                    i2 = i4 * 53;
                    floatToIntBits = zzaau.zzc(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 12:
                    i2 = i4 * 53;
                    floatToIntBits = zzaau.zzc(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 13:
                    i2 = i4 * 53;
                    floatToIntBits = zzaau.zzc(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 14:
                    i = i4 * 53;
                    doubleToLongBits = zzaau.zzd(obj, j);
                    byte[] bArr5 = zzye.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i4 * 53;
                    floatToIntBits = zzaau.zzc(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 16:
                    i = i4 * 53;
                    doubleToLongBits = zzaau.zzd(obj, j);
                    byte[] bArr6 = zzye.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i3 = i4 * 53;
                    Object zzf2 = zzaau.zzf(obj, j);
                    if (zzf2 != null) {
                        i8 = zzf2.hashCode();
                    }
                    i4 = i3 + i8;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i2 = i4 * 53;
                    floatToIntBits = zzaau.zzf(obj, j).hashCode();
                    i4 = i2 + floatToIntBits;
                    break;
                case 50:
                    i2 = i4 * 53;
                    floatToIntBits = zzaau.zzf(obj, j).hashCode();
                    i4 = i2 + floatToIntBits;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzn(obj, j));
                        byte[] bArr7 = zzye.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = Float.floatToIntBits(zzo(obj, j));
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case EACTags.SEX /* 53 */:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr8 = zzye.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr9 = zzye.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzp(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr10 = zzye.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzp(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzye.zza(zzS(obj, j));
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = ((String) zzaau.zzf(obj, j)).hashCode();
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzaau.zzf(obj, j).hashCode();
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzaau.zzf(obj, j).hashCode();
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzp(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzp(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzp(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr11 = zzye.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case EACTags.ADDRESS /* 66 */:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzp(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr12 = zzye.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzaau.zzf(obj, j).hashCode();
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i4 * 53) + this.zzn.zzd(obj).hashCode();
        if (this.zzh) {
            return (hashCode * 53) + this.zzo.zzb(obj).zza.hashCode();
        }
        return hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:523:0x0d42, code lost:
        if (r14 == r7) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x0d44, code lost:
        r9.putInt(r10, r14, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x0d48, code lost:
        r7 = r12.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x0d4d, code lost:
        if (r7 >= r12.zzl) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x0d4f, code lost:
        zzy(r33, r12.zzj[r7], null, r12.zzn, r33);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x0d62, code lost:
        if (r6 != 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x0d66, code lost:
        if (r8 != r36) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0d6d, code lost:
        throw com.google.android.gms.internal.gtm.zzyg.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x0d70, code lost:
        if (r8 > r36) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0d72, code lost:
        if (r11 != r6) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x0d74, code lost:
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x0d79, code lost:
        throw com.google.android.gms.internal.gtm.zzyg.zzg();
     */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0cee  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0cf2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:194:0x0522 -> B:195:0x0523). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:227:0x05b3 -> B:228:0x05b4). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:248:0x0608 -> B:249:0x0609). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzc(java.lang.Object r33, byte[] r34, int r35, int r36, int r37, com.google.android.gms.internal.gtm.zztp r38) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzzj.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.gtm.zztp):int");
    }

    @Override // com.google.android.gms.internal.gtm.zzzt
    public final Object zze() {
        return ((zzxv) this.zzg).zzad();
    }

    @Override // com.google.android.gms.internal.gtm.zzzt
    public final void zzf(Object obj) {
        if (!zzQ(obj)) {
            return;
        }
        if (obj instanceof zzxv) {
            zzxv zzxvVar = (zzxv) obj;
            zzxvVar.zzao(Integer.MAX_VALUE);
            zzxvVar.zzb = 0;
            zzxvVar.zzam();
        }
        int[] iArr = this.zzc;
        for (int i = 0; i < iArr.length; i += 3) {
            int zzu = zzu(i);
            int i2 = 1048575 & zzu;
            int zzt = zzt(zzu);
            long j = i2;
            if (zzt != 9) {
                if (zzt != 60 && zzt != 68) {
                    switch (zzt) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.zzm.zzb(obj, j);
                            break;
                        case 50:
                            Unsafe unsafe = zzb;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                ((zzza) object).zzc();
                                unsafe.putObject(obj, j, object);
                                break;
                            } else {
                                break;
                            }
                    }
                } else if (zzR(obj, this.zzc[i], i)) {
                    zzx(i).zzf(zzb.getObject(obj, j));
                }
            }
            if (zzN(obj, i)) {
                zzx(i).zzf(zzb.getObject(obj, j));
            }
        }
        this.zzn.zzm(obj);
        if (this.zzh) {
            this.zzo.zzf(obj);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzzt
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzu = zzu(i);
            int i2 = 1048575 & zzu;
            int[] iArr = this.zzc;
            int zzt = zzt(zzu);
            int i3 = iArr[i];
            long j = i2;
            switch (zzt) {
                case 0:
                    if (zzN(obj2, i)) {
                        zzaau.zzo(obj, j, zzaau.zza(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzN(obj2, i)) {
                        zzaau.zzp(obj, j, zzaau.zzb(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzN(obj2, i)) {
                        zzaau.zzr(obj, j, zzaau.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzN(obj2, i)) {
                        zzaau.zzr(obj, j, zzaau.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzN(obj2, i)) {
                        zzaau.zzq(obj, j, zzaau.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzN(obj2, i)) {
                        zzaau.zzr(obj, j, zzaau.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzN(obj2, i)) {
                        zzaau.zzq(obj, j, zzaau.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzN(obj2, i)) {
                        zzaau.zzm(obj, j, zzaau.zzw(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzN(obj2, i)) {
                        zzaau.zzs(obj, j, zzaau.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzE(obj, obj2, i);
                    break;
                case 10:
                    if (zzN(obj2, i)) {
                        zzaau.zzs(obj, j, zzaau.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzN(obj2, i)) {
                        zzaau.zzq(obj, j, zzaau.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzN(obj2, i)) {
                        zzaau.zzq(obj, j, zzaau.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzN(obj2, i)) {
                        zzaau.zzq(obj, j, zzaau.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzN(obj2, i)) {
                        zzaau.zzr(obj, j, zzaau.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzN(obj2, i)) {
                        zzaau.zzq(obj, j, zzaau.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzN(obj2, i)) {
                        zzaau.zzr(obj, j, zzaau.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzE(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzm.zzc(obj, obj2, j);
                    break;
                case 50:
                    int i4 = zzzv.f46130a;
                    zzaau.zzs(obj, j, zzzb.zzb(zzaau.zzf(obj, j), zzaau.zzf(obj2, j)));
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                case EACTags.SEX /* 53 */:
                case 54:
                case 55:
                case 56:
                case 57:
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (zzR(obj2, i3, i)) {
                        zzaau.zzs(obj, j, zzaau.zzf(obj2, j));
                        zzI(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzF(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case EACTags.ELEMENT_LIST /* 65 */:
                case EACTags.ADDRESS /* 66 */:
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (zzR(obj2, i3, i)) {
                        zzaau.zzs(obj, j, zzaau.zzf(obj2, j));
                        zzI(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    zzF(obj, obj2, i);
                    break;
            }
        }
        zzzv.zzr(this.zzn, obj, obj2);
        if (this.zzh) {
            zzzv.zzq(this.zzo, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:174:0x0629 A[Catch: all -> 0x0104, TryCatch #1 {all -> 0x0104, blocks: (B:62:0x00dc, B:172:0x0624, B:174:0x0629, B:175:0x062e, B:116:0x02e7, B:118:0x02f0, B:119:0x0300, B:120:0x0310, B:121:0x0320, B:122:0x0330, B:123:0x0340, B:124:0x0350, B:125:0x0360, B:126:0x0371, B:127:0x0382, B:128:0x0393, B:129:0x03a4, B:130:0x03b5, B:131:0x03c6, B:132:0x03e2, B:133:0x03f3, B:134:0x0404, B:135:0x0419, B:137:0x0422, B:138:0x0434, B:139:0x0446, B:140:0x0457, B:141:0x0468, B:142:0x0479, B:143:0x048a, B:144:0x049b, B:145:0x04ac, B:146:0x04bd, B:147:0x04ce, B:148:0x04e3, B:149:0x04f5, B:150:0x0507, B:151:0x0519, B:152:0x052b, B:154:0x0538, B:157:0x053f, B:158:0x0545, B:159:0x0550, B:160:0x0562, B:161:0x0574, B:162:0x0589, B:163:0x0594, B:164:0x05a6, B:165:0x05b8, B:166:0x05ca, B:167:0x05dc, B:168:0x05ee, B:169:0x0600, B:170:0x0612), top: B:195:0x00dc }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0659 A[LOOP:2: B:185:0x0655->B:187:0x0659, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0634 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.gtm.zzzt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh(java.lang.Object r18, com.google.android.gms.internal.gtm.zzzs r19, com.google.android.gms.internal.gtm.zzxf r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1792
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzzj.zzh(java.lang.Object, com.google.android.gms.internal.gtm.zzzs, com.google.android.gms.internal.gtm.zzxf):void");
    }

    @Override // com.google.android.gms.internal.gtm.zzzt
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zztp zztpVar) throws IOException {
        zzc(obj, bArr, i, i2, 0, zztpVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzzt
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzt;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzu = zzu(i);
            long j = zzu & 1048575;
            switch (zzt(zzu)) {
                case 0:
                    if (zzL(obj, obj2, i) && Double.doubleToLongBits(zzaau.zza(obj, j)) == Double.doubleToLongBits(zzaau.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzL(obj, obj2, i) && Float.floatToIntBits(zzaau.zzb(obj, j)) == Float.floatToIntBits(zzaau.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzL(obj, obj2, i) && zzaau.zzd(obj, j) == zzaau.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzL(obj, obj2, i) && zzaau.zzd(obj, j) == zzaau.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzL(obj, obj2, i) && zzaau.zzc(obj, j) == zzaau.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzL(obj, obj2, i) && zzaau.zzd(obj, j) == zzaau.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzL(obj, obj2, i) && zzaau.zzc(obj, j) == zzaau.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzL(obj, obj2, i) && zzaau.zzw(obj, j) == zzaau.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzL(obj, obj2, i) && zzzv.zzt(zzaau.zzf(obj, j), zzaau.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzL(obj, obj2, i) && zzzv.zzt(zzaau.zzf(obj, j), zzaau.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzL(obj, obj2, i) && zzzv.zzt(zzaau.zzf(obj, j), zzaau.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzL(obj, obj2, i) && zzaau.zzc(obj, j) == zzaau.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzL(obj, obj2, i) && zzaau.zzc(obj, j) == zzaau.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzL(obj, obj2, i) && zzaau.zzc(obj, j) == zzaau.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzL(obj, obj2, i) && zzaau.zzd(obj, j) == zzaau.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzL(obj, obj2, i) && zzaau.zzc(obj, j) == zzaau.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzL(obj, obj2, i) && zzaau.zzd(obj, j) == zzaau.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzL(obj, obj2, i) && zzzv.zzt(zzaau.zzf(obj, j), zzaau.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzt = zzzv.zzt(zzaau.zzf(obj, j), zzaau.zzf(obj2, j));
                    break;
                case 50:
                    zzt = zzzv.zzt(zzaau.zzf(obj, j), zzaau.zzf(obj2, j));
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                case EACTags.SEX /* 53 */:
                case 54:
                case 55:
                case 56:
                case 57:
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case EACTags.ELEMENT_LIST /* 65 */:
                case EACTags.ADDRESS /* 66 */:
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    long zzr = zzr(i) & 1048575;
                    if (zzaau.zzc(obj, zzr) == zzaau.zzc(obj2, zzr) && zzzv.zzt(zzaau.zzf(obj, j), zzaau.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzt) {
                return false;
            }
        }
        if (!this.zzn.zzd(obj).equals(this.zzn.zzd(obj2))) {
            return false;
        }
        if (this.zzh) {
            return this.zzo.zzb(obj).equals(this.zzo.zzb(obj2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.gtm.zzzt
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i6 = iArr[i5];
            int i7 = iArr2[i6];
            int zzu = zzu(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = zzb.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & zzu) != 0 && !zzO(obj, i6, i, i2, i10)) {
                return false;
            }
            int zzt = zzt(zzu);
            if (zzt != 9 && zzt != 17) {
                if (zzt != 27) {
                    if (zzt != 60 && zzt != 68) {
                        if (zzt != 49) {
                            if (zzt == 50 && !((zzza) zzaau.zzf(obj, zzu & 1048575)).isEmpty()) {
                                zzyz zzyzVar = (zzyz) zzz(i6);
                                throw null;
                            }
                        }
                    } else if (zzR(obj, i7, i6) && !zzP(obj, zzu, zzx(i6))) {
                        return false;
                    }
                }
                List list = (List) zzaau.zzf(obj, zzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzzt zzx = zzx(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzx.zzk(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzO(obj, i6, i, i2, i10) && !zzP(obj, zzu, zzx(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (this.zzh && !this.zzo.zzb(obj).zzm()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0681  */
    @Override // com.google.android.gms.internal.gtm.zzzt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzm(java.lang.Object r24, com.google.android.gms.internal.gtm.zzur r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1840
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzzj.zzm(java.lang.Object, com.google.android.gms.internal.gtm.zzur):void");
    }
}
