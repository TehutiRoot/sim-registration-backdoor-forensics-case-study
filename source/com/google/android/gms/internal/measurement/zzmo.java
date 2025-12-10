package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzmo {

    /* renamed from: f */
    public static final zzmo f46338f = new zzmo(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f46339a;

    /* renamed from: b */
    public int[] f46340b;

    /* renamed from: c */
    public Object[] f46341c;

    /* renamed from: d */
    public int f46342d = -1;

    /* renamed from: e */
    public boolean f46343e;

    public zzmo(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f46339a = i;
        this.f46340b = iArr;
        this.f46341c = objArr;
        this.f46343e = z;
    }

    /* renamed from: a */
    public static zzmo m47148a(zzmo zzmoVar, zzmo zzmoVar2) {
        int i = zzmoVar.f46339a + zzmoVar2.f46339a;
        int[] copyOf = Arrays.copyOf(zzmoVar.f46340b, i);
        System.arraycopy(zzmoVar2.f46340b, 0, copyOf, zzmoVar.f46339a, zzmoVar2.f46339a);
        Object[] copyOf2 = Arrays.copyOf(zzmoVar.f46341c, i);
        System.arraycopy(zzmoVar2.f46341c, 0, copyOf2, zzmoVar.f46339a, zzmoVar2.f46339a);
        return new zzmo(i, copyOf, copyOf2, true);
    }

    /* renamed from: b */
    public static zzmo m47147b() {
        return new zzmo(0, new int[8], new Object[8], true);
    }

    public static zzmo zzc() {
        return f46338f;
    }

    /* renamed from: c */
    public final void m47146c(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f46339a; i2++) {
            AbstractC6530d.m47400b(sb, i, String.valueOf(this.f46340b[i2] >>> 3), this.f46341c[i2]);
        }
    }

    /* renamed from: d */
    public final void m47145d(int i, Object obj) {
        int i2;
        if (this.f46343e) {
            int i3 = this.f46339a;
            int[] iArr = this.f46340b;
            if (i3 == iArr.length) {
                if (i3 < 4) {
                    i2 = 8;
                } else {
                    i2 = i3 >> 1;
                }
                int i4 = i3 + i2;
                this.f46340b = Arrays.copyOf(iArr, i4);
                this.f46341c = Arrays.copyOf(this.f46341c, i4);
            }
            int[] iArr2 = this.f46340b;
            int i5 = this.f46339a;
            iArr2[i5] = i;
            this.f46341c[i5] = obj;
            this.f46339a = i5 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzmo)) {
            return false;
        }
        zzmo zzmoVar = (zzmo) obj;
        int i = this.f46339a;
        if (i == zzmoVar.f46339a) {
            int[] iArr = this.f46340b;
            int[] iArr2 = zzmoVar.f46340b;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (iArr[i2] != iArr2[i2]) {
                        break;
                    }
                    i2++;
                } else {
                    Object[] objArr = this.f46341c;
                    Object[] objArr2 = zzmoVar.f46341c;
                    int i3 = this.f46339a;
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
        int i = this.f46339a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f46340b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f46341c;
        int i7 = this.f46339a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final int zza() {
        int zzA;
        int zzB;
        int i;
        int i2 = this.f46342d;
        if (i2 == -1) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.f46339a; i4++) {
                int i5 = this.f46340b[i4];
                int i6 = i5 >>> 3;
                int i7 = i5 & 7;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                if (i7 == 5) {
                                    ((Integer) this.f46341c[i4]).intValue();
                                    i = zzjl.zzA(i6 << 3) + 4;
                                } else {
                                    throw new IllegalStateException(zzko.zza());
                                }
                            } else {
                                int zzz = zzjl.zzz(i6);
                                zzA = zzz + zzz;
                                zzB = ((zzmo) this.f46341c[i4]).zza();
                            }
                        } else {
                            int zzA2 = zzjl.zzA(i6 << 3);
                            int zzd = ((zzjd) this.f46341c[i4]).zzd();
                            i3 += zzA2 + zzjl.zzA(zzd) + zzd;
                        }
                    } else {
                        ((Long) this.f46341c[i4]).longValue();
                        i = zzjl.zzA(i6 << 3) + 8;
                    }
                    i3 += i;
                } else {
                    long longValue = ((Long) this.f46341c[i4]).longValue();
                    zzA = zzjl.zzA(i6 << 3);
                    zzB = zzjl.zzB(longValue);
                }
                i = zzA + zzB;
                i3 += i;
            }
            this.f46342d = i3;
            return i3;
        }
        return i2;
    }

    public final int zzb() {
        int i = this.f46342d;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.f46339a; i3++) {
                int i4 = this.f46340b[i3];
                int zzA = zzjl.zzA(8);
                int zzd = ((zzjd) this.f46341c[i3]).zzd();
                i2 += zzA + zzA + zzjl.zzA(16) + zzjl.zzA(i4 >>> 3) + zzjl.zzA(24) + zzjl.zzA(zzd) + zzd;
            }
            this.f46342d = i2;
            return i2;
        }
        return i;
    }

    public final void zzf() {
        this.f46343e = false;
    }

    public final void zzi(InterfaceC18981aI2 interfaceC18981aI2) throws IOException {
        if (this.f46339a != 0) {
            for (int i = 0; i < this.f46339a; i++) {
                int i2 = this.f46340b[i];
                Object obj = this.f46341c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 == 5) {
                                    interfaceC18981aI2.mo22667q(i3, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(zzko.zza());
                                }
                            } else {
                                interfaceC18981aI2.mo22664t(i3);
                                ((zzmo) obj).zzi(interfaceC18981aI2);
                                interfaceC18981aI2.zzh(i3);
                            }
                        } else {
                            interfaceC18981aI2.mo22665s(i3, (zzjd) obj);
                        }
                    } else {
                        interfaceC18981aI2.mo22675i(i3, ((Long) obj).longValue());
                    }
                } else {
                    interfaceC18981aI2.mo22673k(i3, ((Long) obj).longValue());
                }
            }
        }
    }
}
