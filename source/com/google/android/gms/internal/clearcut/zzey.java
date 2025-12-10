package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcg;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzey {

    /* renamed from: f */
    public static final zzey f45584f = new zzey(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f45585a;

    /* renamed from: b */
    public int[] f45586b;

    /* renamed from: c */
    public Object[] f45587c;

    /* renamed from: d */
    public int f45588d;

    /* renamed from: e */
    public boolean f45589e;

    public zzey() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public static zzey m48151a(zzey zzeyVar, zzey zzeyVar2) {
        int i = zzeyVar.f45585a + zzeyVar2.f45585a;
        int[] copyOf = Arrays.copyOf(zzeyVar.f45586b, i);
        System.arraycopy(zzeyVar2.f45586b, 0, copyOf, zzeyVar.f45585a, zzeyVar2.f45585a);
        Object[] copyOf2 = Arrays.copyOf(zzeyVar.f45587c, i);
        System.arraycopy(zzeyVar2.f45587c, 0, copyOf2, zzeyVar.f45585a, zzeyVar2.f45585a);
        return new zzey(i, copyOf, copyOf2, true);
    }

    /* renamed from: e */
    public static void m48147e(int i, Object obj, InterfaceC19588dp2 interfaceC19588dp2) {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 5) {
                            interfaceC19588dp2.mo31641r(i2, ((Integer) obj).intValue());
                            return;
                        }
                        throw new RuntimeException(zzco.zzbn());
                    } else if (interfaceC19588dp2.mo31661N() == zzcg.zzg.zzko) {
                        interfaceC19588dp2.mo31665J(i2);
                        ((zzey) obj).zzb(interfaceC19588dp2);
                        interfaceC19588dp2.mo31663L(i2);
                        return;
                    } else {
                        interfaceC19588dp2.mo31663L(i2);
                        ((zzey) obj).zzb(interfaceC19588dp2);
                        interfaceC19588dp2.mo31665J(i2);
                        return;
                    }
                }
                interfaceC19588dp2.mo31662M(i2, (zzbb) obj);
                return;
            }
            interfaceC19588dp2.mo31650i(i2, ((Long) obj).longValue());
            return;
        }
        interfaceC19588dp2.mo31671D(i2, ((Long) obj).longValue());
    }

    /* renamed from: f */
    public static zzey m48146f() {
        return new zzey();
    }

    public static zzey zzea() {
        return f45584f;
    }

    /* renamed from: b */
    public final void m48150b(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f45585a; i2++) {
            AbstractC6398f.m48291c(sb, i, String.valueOf(this.f45586b[i2] >>> 3), this.f45587c[i2]);
        }
    }

    /* renamed from: c */
    public final void m48149c(InterfaceC19588dp2 interfaceC19588dp2) {
        if (interfaceC19588dp2.mo31661N() == zzcg.zzg.zzkp) {
            for (int i = this.f45585a - 1; i >= 0; i--) {
                interfaceC19588dp2.mo31649j(this.f45586b[i] >>> 3, this.f45587c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f45585a; i2++) {
            interfaceC19588dp2.mo31649j(this.f45586b[i2] >>> 3, this.f45587c[i2]);
        }
    }

    /* renamed from: d */
    public final void m48148d(int i, Object obj) {
        if (!this.f45589e) {
            throw new UnsupportedOperationException();
        }
        int i2 = this.f45585a;
        int[] iArr = this.f45586b;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.f45586b = Arrays.copyOf(iArr, i3);
            this.f45587c = Arrays.copyOf(this.f45587c, i3);
        }
        int[] iArr2 = this.f45586b;
        int i4 = this.f45585a;
        iArr2[i4] = i;
        this.f45587c[i4] = obj;
        this.f45585a = i4 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof zzey)) {
            zzey zzeyVar = (zzey) obj;
            int i = this.f45585a;
            if (i == zzeyVar.f45585a) {
                int[] iArr = this.f45586b;
                int[] iArr2 = zzeyVar.f45586b;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        Object[] objArr = this.f45587c;
                        Object[] objArr2 = zzeyVar.f45587c;
                        int i3 = this.f45585a;
                        for (int i4 = 0; i4 < i3; i4++) {
                            if (objArr[i4].equals(objArr2[i4])) {
                            }
                        }
                        return true;
                    } else if (iArr[i2] != iArr2[i2]) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f45585a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f45586b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f45587c;
        int i7 = this.f45585a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final int zzas() {
        int zze;
        int i = this.f45588d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f45585a; i3++) {
            int i4 = this.f45586b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                zze = zzbn.zze(i5, ((Long) this.f45587c[i3]).longValue());
            } else if (i6 == 1) {
                zze = zzbn.zzg(i5, ((Long) this.f45587c[i3]).longValue());
            } else if (i6 == 2) {
                zze = zzbn.zzc(i5, (zzbb) this.f45587c[i3]);
            } else if (i6 == 3) {
                zze = (zzbn.zzr(i5) << 1) + ((zzey) this.f45587c[i3]).zzas();
            } else if (i6 != 5) {
                throw new IllegalStateException(zzco.zzbn());
            } else {
                zze = zzbn.zzj(i5, ((Integer) this.f45587c[i3]).intValue());
            }
            i2 += zze;
        }
        this.f45588d = i2;
        return i2;
    }

    public final void zzb(InterfaceC19588dp2 interfaceC19588dp2) throws IOException {
        if (this.f45585a == 0) {
            return;
        }
        if (interfaceC19588dp2.mo31661N() == zzcg.zzg.zzko) {
            for (int i = 0; i < this.f45585a; i++) {
                m48147e(this.f45586b[i], this.f45587c[i], interfaceC19588dp2);
            }
            return;
        }
        for (int i2 = this.f45585a - 1; i2 >= 0; i2--) {
            m48147e(this.f45586b[i2], this.f45587c[i2], interfaceC19588dp2);
        }
    }

    public final int zzec() {
        int i = this.f45588d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f45585a; i3++) {
            i2 += zzbn.zzd(this.f45586b[i3] >>> 3, (zzbb) this.f45587c[i3]);
        }
        this.f45588d = i2;
        return i2;
    }

    public final void zzv() {
        this.f45589e = false;
    }

    public zzey(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f45588d = -1;
        this.f45585a = i;
        this.f45586b = iArr;
        this.f45587c = objArr;
        this.f45589e = z;
    }
}
