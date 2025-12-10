package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class zzgz {

    /* renamed from: f */
    public static final zzgz f46976f = new zzgz(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f46977a;

    /* renamed from: b */
    public int[] f46978b;

    /* renamed from: c */
    public Object[] f46979c;

    /* renamed from: d */
    public int f46980d = -1;

    /* renamed from: e */
    public boolean f46981e;

    public zzgz(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f46977a = i;
        this.f46978b = iArr;
        this.f46979c = objArr;
        this.f46981e = z;
    }

    /* renamed from: b */
    public static zzgz m46866b(zzgz zzgzVar, zzgz zzgzVar2) {
        int i = zzgzVar.f46977a + zzgzVar2.f46977a;
        int[] copyOf = Arrays.copyOf(zzgzVar.f46978b, i);
        System.arraycopy(zzgzVar2.f46978b, 0, copyOf, zzgzVar.f46977a, zzgzVar2.f46977a);
        Object[] copyOf2 = Arrays.copyOf(zzgzVar.f46979c, i);
        System.arraycopy(zzgzVar2.f46979c, 0, copyOf2, zzgzVar.f46977a, zzgzVar2.f46977a);
        return new zzgz(i, copyOf, copyOf2, true);
    }

    /* renamed from: c */
    public static zzgz m46865c() {
        return new zzgz(0, new int[8], new Object[8], true);
    }

    public static zzgz zzc() {
        return f46976f;
    }

    /* renamed from: a */
    public final zzgz m46867a(zzgz zzgzVar) {
        if (zzgzVar.equals(f46976f)) {
            return this;
        }
        m46864d();
        int i = this.f46977a + zzgzVar.f46977a;
        m46860h(i);
        System.arraycopy(zzgzVar.f46978b, 0, this.f46978b, this.f46977a, zzgzVar.f46977a);
        System.arraycopy(zzgzVar.f46979c, 0, this.f46979c, this.f46977a, zzgzVar.f46977a);
        this.f46977a = i;
        return this;
    }

    /* renamed from: d */
    public final void m46864d() {
        if (this.f46981e) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public final void m46863e(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f46977a; i2++) {
            AbstractC6569c.m46964b(sb, i, String.valueOf(this.f46978b[i2] >>> 3), this.f46979c[i2]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzgz)) {
            return false;
        }
        zzgz zzgzVar = (zzgz) obj;
        int i = this.f46977a;
        if (i == zzgzVar.f46977a) {
            int[] iArr = this.f46978b;
            int[] iArr2 = zzgzVar.f46978b;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (iArr[i2] != iArr2[i2]) {
                        break;
                    }
                    i2++;
                } else {
                    Object[] objArr = this.f46979c;
                    Object[] objArr2 = zzgzVar.f46979c;
                    int i3 = this.f46977a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void m46862f(int i, Object obj) {
        m46864d();
        m46860h(this.f46977a + 1);
        int[] iArr = this.f46978b;
        int i2 = this.f46977a;
        iArr[i2] = i;
        this.f46979c[i2] = obj;
        this.f46977a = i2 + 1;
    }

    /* renamed from: g */
    public final void m46861g(InterfaceC19090av2 interfaceC19090av2) {
        for (int i = 0; i < this.f46977a; i++) {
            interfaceC19090av2.mo52115B(this.f46978b[i] >>> 3, this.f46979c[i]);
        }
    }

    /* renamed from: h */
    public final void m46860h(int i) {
        int[] iArr = this.f46978b;
        if (i > iArr.length) {
            int i2 = this.f46977a;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f46978b = Arrays.copyOf(iArr, i);
            this.f46979c = Arrays.copyOf(this.f46979c, i);
        }
    }

    public final int hashCode() {
        int i = this.f46977a;
        int i2 = i + 527;
        int[] iArr = this.f46978b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 * 31) + i4;
        Object[] objArr = this.f46979c;
        int i7 = this.f46977a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return (i6 * 31) + i3;
    }

    public final int zza() {
        int zzz;
        int zzy;
        int i;
        int i2 = this.f46980d;
        if (i2 == -1) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.f46977a; i4++) {
                int i5 = this.f46978b[i4];
                int i6 = i5 >>> 3;
                int i7 = i5 & 7;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                if (i7 == 5) {
                                    ((Integer) this.f46979c[i4]).intValue();
                                    i = zzdj.zzy(i6 << 3) + 4;
                                } else {
                                    throw new IllegalStateException(zzeo.zza());
                                }
                            } else {
                                int i8 = i6 << 3;
                                Logger logger = zzdj.f46959b;
                                zzz = ((zzgz) this.f46979c[i4]).zza();
                                int zzy2 = zzdj.zzy(i8);
                                zzy = zzy2 + zzy2;
                            }
                        } else {
                            Logger logger2 = zzdj.f46959b;
                            int zzd = ((zzdb) this.f46979c[i4]).zzd();
                            i = zzdj.zzy(i6 << 3) + zzdj.zzy(zzd) + zzd;
                        }
                    } else {
                        ((Long) this.f46979c[i4]).longValue();
                        i = zzdj.zzy(i6 << 3) + 8;
                    }
                    i3 += i;
                } else {
                    int i9 = i6 << 3;
                    zzz = zzdj.zzz(((Long) this.f46979c[i4]).longValue());
                    zzy = zzdj.zzy(i9);
                }
                i = zzy + zzz;
                i3 += i;
            }
            this.f46980d = i3;
            return i3;
        }
        return i2;
    }

    public final int zzb() {
        int i = this.f46980d;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.f46977a; i3++) {
                Logger logger = zzdj.f46959b;
                int zzd = ((zzdb) this.f46979c[i3]).zzd();
                int zzy = zzdj.zzy(zzd) + zzd;
                int zzy2 = zzdj.zzy(16);
                int zzy3 = zzdj.zzy(this.f46978b[i3] >>> 3);
                int zzy4 = zzdj.zzy(8);
                i2 += zzy4 + zzy4 + zzy2 + zzy3 + zzdj.zzy(24) + zzy;
            }
            this.f46980d = i2;
            return i2;
        }
        return i;
    }

    public final void zzh() {
        if (this.f46981e) {
            this.f46981e = false;
        }
    }

    public final void zzl(InterfaceC19090av2 interfaceC19090av2) throws IOException {
        if (this.f46977a != 0) {
            for (int i = 0; i < this.f46977a; i++) {
                int i2 = this.f46978b[i];
                Object obj = this.f46979c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 == 5) {
                                    interfaceC19090av2.mo52090q(i4, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(zzeo.zza());
                                }
                            } else {
                                interfaceC19090av2.mo52085v(i4);
                                ((zzgz) obj).zzl(interfaceC19090av2);
                                interfaceC19090av2.zzh(i4);
                            }
                        } else {
                            interfaceC19090av2.mo52109H(i4, (zzdb) obj);
                        }
                    } else {
                        interfaceC19090av2.mo52098i(i4, ((Long) obj).longValue());
                    }
                } else {
                    interfaceC19090av2.mo52096k(i4, ((Long) obj).longValue());
                }
            }
        }
    }
}
