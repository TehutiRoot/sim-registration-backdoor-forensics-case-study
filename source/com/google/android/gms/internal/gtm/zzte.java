package com.google.android.gms.internal.gtm;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* loaded from: classes3.dex */
final class zzte extends zzsw {
    static final zzsw zza = new zzte(null, new Object[0], 0);
    final transient Object[] zzb;
    @CheckForNull
    private final transient Object zzc;
    private final transient int zzd;

    private zzte(@CheckForNull Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int[]] */
    public static zzte zzg(int i, Object[] objArr, zzsv zzsvVar) {
        byte[] bArr;
        Object[] objArr2;
        char c;
        zzsl.zzb(6, 6, FirebaseAnalytics.Param.INDEX);
        int zzf = zzsx.zzf(6);
        int i2 = zzf - 1;
        zzsu zzsuVar = null;
        char c2 = 65535;
        if (zzf <= 128) {
            bArr = new byte[zzf];
            Arrays.fill(bArr, (byte) -1);
            int i3 = 0;
            for (int i4 = 0; i4 < 6; i4++) {
                int i5 = i3 + i3;
                int i6 = i4 + i4;
                Object obj = objArr[i6];
                obj.getClass();
                Object obj2 = objArr[i6 ^ 1];
                obj2.getClass();
                zzso.zza(obj, obj2);
                int zza2 = zzsp.zza(obj.hashCode());
                while (true) {
                    int i7 = zza2 & i2;
                    int i8 = bArr[i7] & 255;
                    if (i8 == 255) {
                        bArr[i7] = (byte) i5;
                        if (i3 < i4) {
                            objArr[i5] = obj;
                            objArr[i5 ^ 1] = obj2;
                        }
                        i3++;
                    } else if (obj.equals(objArr[i8])) {
                        int i9 = i8 ^ 1;
                        Object obj3 = objArr[i9];
                        obj3.getClass();
                        zzsu zzsuVar2 = new zzsu(obj, obj2, obj3);
                        objArr[i9] = obj2;
                        zzsuVar = zzsuVar2;
                        break;
                    } else {
                        zza2 = i7 + 1;
                    }
                }
            }
            if (i3 != 6) {
                c = 2;
                objArr2 = new Object[]{bArr, Integer.valueOf(i3), zzsuVar};
            }
            objArr2 = bArr;
            c = 2;
        } else if (zzf <= 32768) {
            bArr = new short[zzf];
            Arrays.fill(bArr, (short) -1);
            int i10 = 0;
            for (int i11 = 0; i11 < 6; i11++) {
                int i12 = i10 + i10;
                int i13 = i11 + i11;
                Object obj4 = objArr[i13];
                obj4.getClass();
                Object obj5 = objArr[i13 ^ 1];
                obj5.getClass();
                zzso.zza(obj4, obj5);
                int zza3 = zzsp.zza(obj4.hashCode());
                while (true) {
                    int i14 = zza3 & i2;
                    char c3 = (char) bArr[i14];
                    if (c3 == 65535) {
                        bArr[i14] = (short) i12;
                        if (i10 < i11) {
                            objArr[i12] = obj4;
                            objArr[i12 ^ 1] = obj5;
                        }
                        i10++;
                    } else if (obj4.equals(objArr[c3])) {
                        int i15 = c3 ^ 1;
                        Object obj6 = objArr[i15];
                        obj6.getClass();
                        zzsu zzsuVar3 = new zzsu(obj4, obj5, obj6);
                        objArr[i15] = obj5;
                        zzsuVar = zzsuVar3;
                        break;
                    } else {
                        zza3 = i14 + 1;
                    }
                }
            }
            if (i10 != 6) {
                c = 2;
                objArr2 = new Object[]{bArr, Integer.valueOf(i10), zzsuVar};
            }
            objArr2 = bArr;
            c = 2;
        } else {
            bArr = new int[zzf];
            Arrays.fill((int[]) bArr, -1);
            int i16 = 0;
            int i17 = 0;
            while (i16 < 6) {
                int i18 = i17 + i17;
                int i19 = i16 + i16;
                Object obj7 = objArr[i19];
                obj7.getClass();
                Object obj8 = objArr[i19 ^ 1];
                obj8.getClass();
                zzso.zza(obj7, obj8);
                int zza4 = zzsp.zza(obj7.hashCode());
                while (true) {
                    int i20 = zza4 & i2;
                    ?? r15 = bArr[i20];
                    if (r15 == c2) {
                        bArr[i20] = i18;
                        if (i17 < i16) {
                            objArr[i18] = obj7;
                            objArr[i18 ^ 1] = obj8;
                        }
                        i17++;
                    } else if (obj7.equals(objArr[r15])) {
                        int i21 = r15 ^ 1;
                        Object obj9 = objArr[i21];
                        obj9.getClass();
                        zzsu zzsuVar4 = new zzsu(obj7, obj8, obj9);
                        objArr[i21] = obj8;
                        zzsuVar = zzsuVar4;
                        break;
                    } else {
                        zza4 = i20 + 1;
                        c2 = 65535;
                    }
                }
                i16++;
                c2 = 65535;
            }
            if (i17 != 6) {
                c = 2;
                objArr2 = new Object[]{bArr, Integer.valueOf(i17), zzsuVar};
            }
            objArr2 = bArr;
            c = 2;
        }
        if (!(objArr2 instanceof Object[])) {
            return new zzte(objArr2, objArr, 6);
        }
        throw ((zzsu) objArr2[c]).zza();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.gtm.zzsw, java.util.Map
    @javax.annotation.CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(@javax.annotation.CheckForNull java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L6
        L3:
            r10 = r0
            goto L9c
        L6:
            int r1 = r9.zzd
            java.lang.Object[] r2 = r9.zzb
            r3 = 1
            if (r1 != r3) goto L20
            r1 = 0
            r1 = r2[r1]
            r1.getClass()
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L3
            r10 = r2[r3]
            r10.getClass()
            goto L9c
        L20:
            java.lang.Object r1 = r9.zzc
            if (r1 != 0) goto L25
            goto L3
        L25:
            boolean r4 = r1 instanceof byte[]
            r5 = -1
            if (r4 == 0) goto L51
            r4 = r1
            byte[] r4 = (byte[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.gtm.zzsp.zza(r1)
        L38:
            r1 = r1 & r6
            r5 = r4[r1]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L41
            goto L3
        L41:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4e
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L4e:
            int r1 = r1 + 1
            goto L38
        L51:
            boolean r4 = r1 instanceof short[]
            if (r4 == 0) goto L7d
            r4 = r1
            short[] r4 = (short[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.gtm.zzsp.zza(r1)
        L63:
            r1 = r1 & r6
            short r5 = r4[r1]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6d
            goto L3
        L6d:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7a
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L7a:
            int r1 = r1 + 1
            goto L63
        L7d:
            int[] r1 = (int[]) r1
            int r4 = r1.length
            int r4 = r4 + r5
            int r6 = r10.hashCode()
            int r6 = com.google.android.gms.internal.gtm.zzsp.zza(r6)
        L89:
            r6 = r6 & r4
            r7 = r1[r6]
            if (r7 != r5) goto L90
            goto L3
        L90:
            r8 = r2[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r2[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r0
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzte.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.gtm.zzsw
    public final zzsq zza() {
        return new zztd(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.gtm.zzsw
    public final zzsx zzd() {
        return new zztb(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.gtm.zzsw
    public final zzsx zze() {
        return new zztc(this, new zztd(this.zzb, 0, this.zzd));
    }
}
