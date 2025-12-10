package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzxh;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzaah {

    /* renamed from: f */
    public static final zzaah f45741f = new zzaah(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f45742a;

    /* renamed from: b */
    public int[] f45743b;

    /* renamed from: c */
    public Object[] f45744c;

    /* renamed from: d */
    public int f45745d;

    /* renamed from: e */
    public boolean f45746e;

    public zzaah() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public static zzaah m47959a(zzaah zzaahVar, zzaah zzaahVar2) {
        int i = zzaahVar.f45742a + zzaahVar2.f45742a;
        int[] copyOf = Arrays.copyOf(zzaahVar.f45743b, i);
        System.arraycopy(zzaahVar2.f45743b, 0, copyOf, zzaahVar.f45742a, zzaahVar2.f45742a);
        Object[] copyOf2 = Arrays.copyOf(zzaahVar.f45744c, i);
        System.arraycopy(zzaahVar2.f45744c, 0, copyOf2, zzaahVar.f45742a, zzaahVar2.f45742a);
        return new zzaah(i, copyOf, copyOf2, true);
    }

    /* renamed from: d */
    public static void m47956d(int i, Object obj, InterfaceC18031Ma2 interfaceC18031Ma2) {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 5) {
                            interfaceC18031Ma2.mo67334q(i2, ((Integer) obj).intValue());
                            return;
                        }
                        throw new RuntimeException(zzxs.zzvt());
                    } else if (interfaceC18031Ma2.mo67350Q() == zzxh.zzg.zzcph) {
                        interfaceC18031Ma2.mo67351P(i2);
                        ((zzaah) obj).zzb(interfaceC18031Ma2);
                        interfaceC18031Ma2.mo67352O(i2);
                        return;
                    } else {
                        interfaceC18031Ma2.mo67352O(i2);
                        ((zzaah) obj).zzb(interfaceC18031Ma2);
                        interfaceC18031Ma2.mo67351P(i2);
                        return;
                    }
                }
                interfaceC18031Ma2.mo67362E(i2, (zzwd) obj);
                return;
            }
            interfaceC18031Ma2.mo67342i(i2, ((Long) obj).longValue());
            return;
        }
        interfaceC18031Ma2.mo67363D(i2, ((Long) obj).longValue());
    }

    /* renamed from: f */
    public static zzaah m47954f() {
        return new zzaah();
    }

    public static zzaah zzxl() {
        return f45741f;
    }

    /* renamed from: b */
    public final void m47958b(InterfaceC18031Ma2 interfaceC18031Ma2) {
        if (interfaceC18031Ma2.mo67350Q() == zzxh.zzg.zzcpi) {
            for (int i = this.f45742a - 1; i >= 0; i--) {
                interfaceC18031Ma2.mo67341j(this.f45743b[i] >>> 3, this.f45744c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f45742a; i2++) {
            interfaceC18031Ma2.mo67341j(this.f45743b[i2] >>> 3, this.f45744c[i2]);
        }
    }

    /* renamed from: c */
    public final void m47957c(int i, Object obj) {
        int i2;
        if (this.f45746e) {
            int i3 = this.f45742a;
            int[] iArr = this.f45743b;
            if (i3 == iArr.length) {
                if (i3 < 4) {
                    i2 = 8;
                } else {
                    i2 = i3 >> 1;
                }
                int i4 = i3 + i2;
                this.f45743b = Arrays.copyOf(iArr, i4);
                this.f45744c = Arrays.copyOf(this.f45744c, i4);
            }
            int[] iArr2 = this.f45743b;
            int i5 = this.f45742a;
            iArr2[i5] = i;
            this.f45744c[i5] = obj;
            this.f45742a = i5 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public final void m47955e(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f45742a; i2++) {
            AbstractC6439H0.m48008c(sb, i, String.valueOf(this.f45743b[i2] >>> 3), this.f45744c[i2]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzaah)) {
            return false;
        }
        zzaah zzaahVar = (zzaah) obj;
        int i = this.f45742a;
        if (i == zzaahVar.f45742a) {
            int[] iArr = this.f45743b;
            int[] iArr2 = zzaahVar.f45743b;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (iArr[i2] != iArr2[i2]) {
                        break;
                    }
                    i2++;
                } else {
                    Object[] objArr = this.f45744c;
                    Object[] objArr2 = zzaahVar.f45744c;
                    int i3 = this.f45742a;
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
        int i = this.f45742a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f45743b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f45744c;
        int i7 = this.f45742a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final void zzb(InterfaceC18031Ma2 interfaceC18031Ma2) throws IOException {
        if (this.f45742a == 0) {
            return;
        }
        if (interfaceC18031Ma2.mo67350Q() == zzxh.zzg.zzcph) {
            for (int i = 0; i < this.f45742a; i++) {
                m47956d(this.f45743b[i], this.f45744c[i], interfaceC18031Ma2);
            }
            return;
        }
        for (int i2 = this.f45742a - 1; i2 >= 0; i2--) {
            m47956d(this.f45743b[i2], this.f45744c[i2], interfaceC18031Ma2);
        }
    }

    public final void zzty() {
        this.f45746e = false;
    }

    public final int zzva() {
        int zze;
        int i = this.f45745d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f45742a; i3++) {
            int i4 = this.f45743b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 == 5) {
                                zze = zzwq.zzo(i5, ((Integer) this.f45744c[i3]).intValue());
                            } else {
                                throw new IllegalStateException(zzxs.zzvt());
                            }
                        } else {
                            zze = (zzwq.zzdk(i5) << 1) + ((zzaah) this.f45744c[i3]).zzva();
                        }
                    } else {
                        zze = zzwq.zzc(i5, (zzwd) this.f45744c[i3]);
                    }
                } else {
                    zze = zzwq.zzg(i5, ((Long) this.f45744c[i3]).longValue());
                }
            } else {
                zze = zzwq.zze(i5, ((Long) this.f45744c[i3]).longValue());
            }
            i2 += zze;
        }
        this.f45745d = i2;
        return i2;
    }

    public final int zzxn() {
        int i = this.f45745d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f45742a; i3++) {
            i2 += zzwq.zzd(this.f45743b[i3] >>> 3, (zzwd) this.f45744c[i3]);
        }
        this.f45745d = i2;
        return i2;
    }

    public zzaah(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f45745d = -1;
        this.f45742a = i;
        this.f45743b = iArr;
        this.f45744c = objArr;
        this.f45746e = z;
    }
}
