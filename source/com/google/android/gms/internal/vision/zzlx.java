package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzlx {

    /* renamed from: f */
    public static final zzlx f47657f = new zzlx(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f47658a;

    /* renamed from: b */
    public int[] f47659b;

    /* renamed from: c */
    public Object[] f47660c;

    /* renamed from: d */
    public int f47661d;

    /* renamed from: e */
    public boolean f47662e;

    public zzlx() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public static zzlx m46413a(zzlx zzlxVar, zzlx zzlxVar2) {
        int i = zzlxVar.f47658a + zzlxVar2.f47658a;
        int[] copyOf = Arrays.copyOf(zzlxVar.f47659b, i);
        System.arraycopy(zzlxVar2.f47659b, 0, copyOf, zzlxVar.f47658a, zzlxVar2.f47658a);
        Object[] copyOf2 = Arrays.copyOf(zzlxVar.f47660c, i);
        System.arraycopy(zzlxVar2.f47660c, 0, copyOf2, zzlxVar.f47658a, zzlxVar2.f47658a);
        return new zzlx(i, copyOf, copyOf2, true);
    }

    /* renamed from: c */
    public static void m46411c(int i, Object obj, InterfaceC21048mH2 interfaceC21048mH2) {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 5) {
                            interfaceC21048mH2.mo26278w(i2, ((Integer) obj).intValue());
                            return;
                        }
                        throw new RuntimeException(zzjk.zzf());
                    } else if (interfaceC21048mH2.zza() == zzmq.zza) {
                        interfaceC21048mH2.zza(i2);
                        ((zzlx) obj).zzb(interfaceC21048mH2);
                        interfaceC21048mH2.zzb(i2);
                        return;
                    } else {
                        interfaceC21048mH2.zzb(i2);
                        ((zzlx) obj).zzb(interfaceC21048mH2);
                        interfaceC21048mH2.zza(i2);
                        return;
                    }
                }
                interfaceC21048mH2.mo26304G(i2, (zzht) obj);
                return;
            }
            interfaceC21048mH2.mo26308C(i2, ((Long) obj).longValue());
            return;
        }
        interfaceC21048mH2.mo26289l(i2, ((Long) obj).longValue());
    }

    /* renamed from: f */
    public static zzlx m46408f() {
        return new zzlx();
    }

    public static zzlx zza() {
        return f47657f;
    }

    /* renamed from: b */
    public final void m46412b(int i, Object obj) {
        int i2;
        if (this.f47662e) {
            int i3 = this.f47658a;
            int[] iArr = this.f47659b;
            if (i3 == iArr.length) {
                if (i3 < 4) {
                    i2 = 8;
                } else {
                    i2 = i3 >> 1;
                }
                int i4 = i3 + i2;
                this.f47659b = Arrays.copyOf(iArr, i4);
                this.f47660c = Arrays.copyOf(this.f47660c, i4);
            }
            int[] iArr2 = this.f47659b;
            int i5 = this.f47658a;
            iArr2[i5] = i;
            this.f47660c[i5] = obj;
            this.f47658a = i5 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public final void m46410d(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f47658a; i2++) {
            AbstractC6617B.m46610d(sb, i, String.valueOf(this.f47659b[i2] >>> 3), this.f47660c[i2]);
        }
    }

    /* renamed from: e */
    public final void m46409e(InterfaceC21048mH2 interfaceC21048mH2) {
        if (interfaceC21048mH2.zza() == zzmq.zzb) {
            for (int i = this.f47658a - 1; i >= 0; i--) {
                interfaceC21048mH2.mo26291j(this.f47659b[i] >>> 3, this.f47660c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f47658a; i2++) {
            interfaceC21048mH2.mo26291j(this.f47659b[i2] >>> 3, this.f47660c[i2]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzlx)) {
            return false;
        }
        zzlx zzlxVar = (zzlx) obj;
        int i = this.f47658a;
        if (i == zzlxVar.f47658a) {
            int[] iArr = this.f47659b;
            int[] iArr2 = zzlxVar.f47659b;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (iArr[i2] != iArr2[i2]) {
                        break;
                    }
                    i2++;
                } else {
                    Object[] objArr = this.f47660c;
                    Object[] objArr2 = zzlxVar.f47660c;
                    int i3 = this.f47658a;
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

    public final int hashCode() {
        int i = this.f47658a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f47659b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f47660c;
        int i7 = this.f47658a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final void zzb(InterfaceC21048mH2 interfaceC21048mH2) throws IOException {
        if (this.f47658a == 0) {
            return;
        }
        if (interfaceC21048mH2.zza() == zzmq.zza) {
            for (int i = 0; i < this.f47658a; i++) {
                m46411c(this.f47659b[i], this.f47660c[i], interfaceC21048mH2);
            }
            return;
        }
        for (int i2 = this.f47658a - 1; i2 >= 0; i2--) {
            m46411c(this.f47659b[i2], this.f47660c[i2], interfaceC21048mH2);
        }
    }

    public final void zzc() {
        this.f47662e = false;
    }

    public final int zzd() {
        int i = this.f47661d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f47658a; i3++) {
            i2 += zzii.zzd(this.f47659b[i3] >>> 3, (zzht) this.f47660c[i3]);
        }
        this.f47661d = i2;
        return i2;
    }

    public final int zze() {
        int zze;
        int i = this.f47661d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f47658a; i3++) {
            int i4 = this.f47659b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 == 5) {
                                zze = zzii.zzi(i5, ((Integer) this.f47660c[i3]).intValue());
                            } else {
                                throw new IllegalStateException(zzjk.zzf());
                            }
                        } else {
                            zze = (zzii.zze(i5) << 1) + ((zzlx) this.f47660c[i3]).zze();
                        }
                    } else {
                        zze = zzii.zzc(i5, (zzht) this.f47660c[i3]);
                    }
                } else {
                    zze = zzii.zzg(i5, ((Long) this.f47660c[i3]).longValue());
                }
            } else {
                zze = zzii.zze(i5, ((Long) this.f47660c[i3]).longValue());
            }
            i2 += zze;
        }
        this.f47661d = i2;
        return i2;
    }

    public zzlx(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f47661d = -1;
        this.f47658a = i;
        this.f47659b = iArr;
        this.f47660c = objArr;
        this.f47662e = z;
    }
}
