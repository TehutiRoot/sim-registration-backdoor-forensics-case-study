package p000;

import com.google.android.gms.internal.vision.AbstractC6610F;
import com.google.android.gms.internal.vision.zzht;
import com.google.android.gms.internal.vision.zzif;
import com.google.android.gms.internal.vision.zzio;
import com.google.android.gms.internal.vision.zzjf;
import com.google.android.gms.internal.vision.zzjk;
import com.google.android.gms.internal.vision.zzjv;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* renamed from: Pv2 */
/* loaded from: classes3.dex */
public final class Pv2 extends Fv2 {

    /* renamed from: a */
    public final boolean f5058a;

    /* renamed from: b */
    public final byte[] f5059b;

    /* renamed from: c */
    public int f5060c;

    /* renamed from: d */
    public final int f5061d;

    /* renamed from: e */
    public int f5062e;

    /* renamed from: f */
    public int f5063f;

    /* renamed from: g */
    public int f5064g;

    public Pv2(ByteBuffer byteBuffer, boolean z) {
        super();
        this.f5058a = true;
        this.f5059b = byteBuffer.array();
        int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
        this.f5060c = arrayOffset;
        this.f5061d = arrayOffset;
        this.f5062e = byteBuffer.arrayOffset() + byteBuffer.limit();
    }

    /* renamed from: A */
    public final int m66890A() {
        int i = this.f5060c;
        byte[] bArr = this.f5059b;
        this.f5060c = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: B */
    public final long m66889B() {
        int i = this.f5060c;
        byte[] bArr = this.f5059b;
        this.f5060c = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* renamed from: C */
    public final void m66888C(int i) {
        if (i >= 0 && i <= this.f5062e - this.f5060c) {
            return;
        }
        throw zzjk.zza();
    }

    /* renamed from: D */
    public final Object m66887D(InterfaceC19370cF2 interfaceC19370cF2, zzio zzioVar) {
        int m66880K = m66880K();
        m66888C(m66880K);
        int i = this.f5062e;
        int i2 = this.f5060c + m66880K;
        this.f5062e = i2;
        try {
            Object zza = interfaceC19370cF2.zza();
            interfaceC19370cF2.mo46597d(zza, this, zzioVar);
            interfaceC19370cF2.zzc(zza);
            if (this.f5060c == i2) {
                return zza;
            }
            throw zzjk.zzg();
        } finally {
            this.f5062e = i;
        }
    }

    /* renamed from: E */
    public final void m66886E(int i) {
        if ((this.f5063f & 7) == i) {
            return;
        }
        throw zzjk.zzf();
    }

    /* renamed from: F */
    public final Object m66885F(InterfaceC19370cF2 interfaceC19370cF2, zzio zzioVar) {
        int i = this.f5064g;
        this.f5064g = ((this.f5063f >>> 3) << 3) | 4;
        try {
            Object zza = interfaceC19370cF2.zza();
            interfaceC19370cF2.mo46597d(zza, this, zzioVar);
            interfaceC19370cF2.zzc(zza);
            if (this.f5063f == this.f5064g) {
                return zza;
            }
            throw zzjk.zzg();
        } finally {
            this.f5064g = i;
        }
    }

    /* renamed from: G */
    public final void m66884G(int i) {
        m66888C(i);
        if ((i & 7) == 0) {
            return;
        }
        throw zzjk.zzg();
    }

    /* renamed from: H */
    public final void m66883H(int i) {
        m66888C(i);
        if ((i & 3) == 0) {
            return;
        }
        throw zzjk.zzg();
    }

    /* renamed from: I */
    public final void m66882I(int i) {
        if (this.f5060c == i) {
            return;
        }
        throw zzjk.zza();
    }

    /* renamed from: J */
    public final boolean m66881J() {
        if (this.f5060c == this.f5062e) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    public final int m66880K() {
        int i;
        int i2 = this.f5060c;
        int i3 = this.f5062e;
        if (i3 != i2) {
            byte[] bArr = this.f5059b;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f5060c = i4;
                return b;
            } else if (i3 - i4 < 9) {
                return (int) m66878M();
            } else {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << Ascii.NAK);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << Ascii.f52698FS)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                } else {
                                                    throw zzjk.zzc();
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.f5060c = i5;
                return i;
            }
        }
        throw zzjk.zza();
    }

    /* renamed from: L */
    public final long m66879L() {
        long j;
        long j2;
        long j3;
        int i = this.f5060c;
        int i2 = this.f5062e;
        if (i2 != i) {
            byte[] bArr = this.f5059b;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.f5060c = i3;
                return b;
            } else if (i2 - i3 < 9) {
                return m66878M();
            } else {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << Ascii.NAK);
                        if (i9 < 0) {
                            i4 = i8;
                            j = (-2080896) ^ i9;
                        } else {
                            long j4 = i9;
                            i4 = i + 5;
                            long j5 = j4 ^ (bArr[i8] << 28);
                            if (j5 >= 0) {
                                j3 = 266354560;
                            } else {
                                int i10 = i + 6;
                                long j6 = j5 ^ (bArr[i4] << 35);
                                if (j6 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j5 = j6 ^ (bArr[i10] << 42);
                                    if (j5 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i10 = i + 8;
                                        j6 = j5 ^ (bArr[i4] << 49);
                                        if (j6 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j7 = (j6 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
                                            if (j7 < 0) {
                                                int i11 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i11;
                                                } else {
                                                    throw zzjk.zzc();
                                                }
                                            }
                                            j = j7;
                                        }
                                    }
                                }
                                j = j6 ^ j2;
                                i4 = i10;
                            }
                            j = j5 ^ j3;
                        }
                    }
                }
                this.f5060c = i4;
                return j;
            }
        }
        throw zzjk.zza();
    }

    /* renamed from: M */
    public final long m66878M() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte m66877N = m66877N();
            j |= (m66877N & Byte.MAX_VALUE) << i;
            if ((m66877N & 128) == 0) {
                return j;
            }
        }
        throw zzjk.zzc();
    }

    /* renamed from: N */
    public final byte m66877N() {
        int i = this.f5060c;
        if (i != this.f5062e) {
            byte[] bArr = this.f5059b;
            this.f5060c = i + 1;
            return bArr[i];
        }
        throw zzjk.zza();
    }

    /* renamed from: O */
    public final int m66876O() {
        m66888C(4);
        return m66890A();
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: a */
    public final void mo31422a(List list, InterfaceC19370cF2 interfaceC19370cF2, zzio zzioVar) {
        int i;
        int i2 = this.f5063f;
        if ((i2 & 7) == 2) {
            do {
                list.add(m66887D(interfaceC19370cF2, zzioVar));
                if (m66881J()) {
                    return;
                }
                i = this.f5060c;
            } while (m66880K() == i2);
            this.f5060c = i;
            return;
        }
        throw zzjk.zzf();
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: b */
    public final void mo31421b(Map map, AbstractC20575jD2 abstractC20575jD2, zzio zzioVar) {
        m66886E(2);
        int m66880K = m66880K();
        m66888C(m66880K);
        int i = this.f5062e;
        this.f5062e = this.f5060c + m66880K;
        try {
            throw null;
        } catch (Throwable th2) {
            this.f5062e = i;
            throw th2;
        }
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: c */
    public final Object mo31420c(InterfaceC19370cF2 interfaceC19370cF2, zzio zzioVar) {
        m66886E(2);
        return m66887D(interfaceC19370cF2, zzioVar);
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: d */
    public final void mo31419d(List list) {
        int i;
        int i2;
        if (list instanceof LA2) {
            LA2 la2 = (LA2) list;
            int i3 = this.f5063f & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int m66880K = this.f5060c + m66880K();
                    while (this.f5060c < m66880K) {
                        la2.m67617b(zzif.zze(m66880K()));
                    }
                    return;
                }
                throw zzjk.zzf();
            }
            do {
                la2.m67617b(zzs());
                if (m66881J()) {
                    return;
                }
                i2 = this.f5060c;
            } while (m66880K() == this.f5063f);
            this.f5060c = i2;
            return;
        }
        int i4 = this.f5063f & 7;
        if (i4 != 0) {
            if (i4 == 2) {
                int m66880K2 = this.f5060c + m66880K();
                while (this.f5060c < m66880K2) {
                    list.add(Integer.valueOf(zzif.zze(m66880K())));
                }
                return;
            }
            throw zzjk.zzf();
        }
        do {
            list.add(Integer.valueOf(zzs()));
            if (m66881J()) {
                return;
            }
            i = this.f5060c;
        } while (m66880K() == this.f5063f);
        this.f5060c = i;
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: e */
    public final void mo31418e(List list) {
        int i;
        if (list instanceof AbstractC22475uC2) {
            AbstractC22045rk2.m23445a(list);
            int i2 = this.f5063f & 7;
            if (i2 != 1) {
                if (i2 == 2) {
                    int m66880K = m66880K();
                    m66884G(m66880K);
                    int i3 = this.f5060c;
                    if (i3 >= m66880K + i3) {
                        return;
                    }
                    m66889B();
                    throw null;
                }
                throw zzjk.zzf();
            }
            zzr();
            throw null;
        }
        int i4 = this.f5063f & 7;
        if (i4 != 1) {
            if (i4 == 2) {
                int m66880K2 = m66880K();
                m66884G(m66880K2);
                int i5 = this.f5060c + m66880K2;
                while (this.f5060c < i5) {
                    list.add(Long.valueOf(m66889B()));
                }
                return;
            }
            throw zzjk.zzf();
        }
        do {
            list.add(Long.valueOf(zzr()));
            if (m66881J()) {
                return;
            }
            i = this.f5060c;
        } while (m66880K() == this.f5063f);
        this.f5060c = i;
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: f */
    public final Object mo31417f(InterfaceC19370cF2 interfaceC19370cF2, zzio zzioVar) {
        m66886E(3);
        return m66885F(interfaceC19370cF2, zzioVar);
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: g */
    public final void mo31416g(List list) {
        int i;
        if (list instanceof AbstractC22475uC2) {
            AbstractC22045rk2.m23445a(list);
            int i2 = this.f5063f & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int m66880K = m66880K();
                    int i3 = this.f5060c;
                    if (i3 >= m66880K + i3) {
                        return;
                    }
                    zzif.zza(m66879L());
                    throw null;
                }
                throw zzjk.zzf();
            }
            zzt();
            throw null;
        }
        int i4 = this.f5063f & 7;
        if (i4 != 0) {
            if (i4 == 2) {
                int m66880K2 = this.f5060c + m66880K();
                while (this.f5060c < m66880K2) {
                    list.add(Long.valueOf(zzif.zza(m66879L())));
                }
                return;
            }
            throw zzjk.zzf();
        }
        do {
            list.add(Long.valueOf(zzt()));
            if (m66881J()) {
                return;
            }
            i = this.f5060c;
        } while (m66880K() == this.f5063f);
        this.f5060c = i;
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: h */
    public final void mo31415h(List list) {
        int i;
        int i2;
        if (list instanceof LA2) {
            LA2 la2 = (LA2) list;
            int i3 = this.f5063f & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int m66880K = this.f5060c + m66880K();
                    while (this.f5060c < m66880K) {
                        la2.m67617b(m66880K());
                    }
                    return;
                }
                throw zzjk.zzf();
            }
            do {
                la2.m67617b(zzo());
                if (m66881J()) {
                    return;
                }
                i2 = this.f5060c;
            } while (m66880K() == this.f5063f);
            this.f5060c = i2;
            return;
        }
        int i4 = this.f5063f & 7;
        if (i4 != 0) {
            if (i4 == 2) {
                int m66880K2 = this.f5060c + m66880K();
                while (this.f5060c < m66880K2) {
                    list.add(Integer.valueOf(m66880K()));
                }
                return;
            }
            throw zzjk.zzf();
        }
        do {
            list.add(Integer.valueOf(zzo()));
            if (m66881J()) {
                return;
            }
            i = this.f5060c;
        } while (m66880K() == this.f5063f);
        this.f5060c = i;
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: i */
    public final void mo31414i(List list) {
        int i;
        if ((this.f5063f & 7) == 2) {
            do {
                list.add(zzn());
                if (m66881J()) {
                    return;
                }
                i = this.f5060c;
            } while (m66880K() == this.f5063f);
            this.f5060c = i;
            return;
        }
        throw zzjk.zzf();
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: j */
    public final void mo31413j(List list) {
        int i;
        int i2;
        if (list instanceof LA2) {
            LA2 la2 = (LA2) list;
            int i3 = this.f5063f & 7;
            if (i3 != 2) {
                if (i3 == 5) {
                    do {
                        la2.m67617b(zzq());
                        if (m66881J()) {
                            return;
                        }
                        i2 = this.f5060c;
                    } while (m66880K() == this.f5063f);
                    this.f5060c = i2;
                    return;
                }
                throw zzjk.zzf();
            }
            int m66880K = m66880K();
            m66883H(m66880K);
            int i4 = this.f5060c + m66880K;
            while (this.f5060c < i4) {
                la2.m67617b(m66890A());
            }
            return;
        }
        int i5 = this.f5063f & 7;
        if (i5 != 2) {
            if (i5 == 5) {
                do {
                    list.add(Integer.valueOf(zzq()));
                    if (m66881J()) {
                        return;
                    }
                    i = this.f5060c;
                } while (m66880K() == this.f5063f);
                this.f5060c = i;
                return;
            }
            throw zzjk.zzf();
        }
        int m66880K2 = m66880K();
        m66883H(m66880K2);
        int i6 = this.f5060c + m66880K2;
        while (this.f5060c < i6) {
            list.add(Integer.valueOf(m66890A()));
        }
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: k */
    public final void mo31412k(List list, InterfaceC19370cF2 interfaceC19370cF2, zzio zzioVar) {
        int i;
        int i2 = this.f5063f;
        if ((i2 & 7) == 3) {
            do {
                list.add(m66885F(interfaceC19370cF2, zzioVar));
                if (m66881J()) {
                    return;
                }
                i = this.f5060c;
            } while (m66880K() == i2);
            this.f5060c = i;
            return;
        }
        throw zzjk.zzf();
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: l */
    public final void mo31411l(List list) {
        int i;
        int i2;
        if (list instanceof LA2) {
            LA2 la2 = (LA2) list;
            int i3 = this.f5063f & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int m66880K = this.f5060c + m66880K();
                    while (this.f5060c < m66880K) {
                        la2.m67617b(m66880K());
                    }
                    return;
                }
                throw zzjk.zzf();
            }
            do {
                la2.m67617b(zzp());
                if (m66881J()) {
                    return;
                }
                i2 = this.f5060c;
            } while (m66880K() == this.f5063f);
            this.f5060c = i2;
            return;
        }
        int i4 = this.f5063f & 7;
        if (i4 != 0) {
            if (i4 == 2) {
                int m66880K2 = this.f5060c + m66880K();
                while (this.f5060c < m66880K2) {
                    list.add(Integer.valueOf(m66880K()));
                }
                return;
            }
            throw zzjk.zzf();
        }
        do {
            list.add(Integer.valueOf(zzp()));
            if (m66881J()) {
                return;
            }
            i = this.f5060c;
        } while (m66880K() == this.f5063f);
        this.f5060c = i;
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: m */
    public final void mo31410m(List list) {
        int i;
        boolean z;
        if (list instanceof AbstractC20178gw2) {
            AbstractC22045rk2.m23445a(list);
            int i2 = this.f5063f & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int m66880K = m66880K();
                    int i3 = this.f5060c;
                    int i4 = m66880K + i3;
                    if (i3 >= i4) {
                        m66882I(i4);
                        return;
                    } else {
                        m66880K();
                        throw null;
                    }
                }
                throw zzjk.zzf();
            }
            zzk();
            throw null;
        }
        int i5 = this.f5063f & 7;
        if (i5 != 0) {
            if (i5 == 2) {
                int m66880K2 = this.f5060c + m66880K();
                while (this.f5060c < m66880K2) {
                    if (m66880K() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    list.add(Boolean.valueOf(z));
                }
                m66882I(m66880K2);
                return;
            }
            throw zzjk.zzf();
        }
        do {
            list.add(Boolean.valueOf(zzk()));
            if (m66881J()) {
                return;
            }
            i = this.f5060c;
        } while (m66880K() == this.f5063f);
        this.f5060c = i;
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: n */
    public final void mo31409n(List list) {
        int i;
        int i2;
        if (list instanceof LA2) {
            LA2 la2 = (LA2) list;
            int i3 = this.f5063f & 7;
            if (i3 != 2) {
                if (i3 == 5) {
                    do {
                        la2.m67617b(zzj());
                        if (m66881J()) {
                            return;
                        }
                        i2 = this.f5060c;
                    } while (m66880K() == this.f5063f);
                    this.f5060c = i2;
                    return;
                }
                throw zzjk.zzf();
            }
            int m66880K = m66880K();
            m66883H(m66880K);
            int i4 = this.f5060c + m66880K;
            while (this.f5060c < i4) {
                la2.m67617b(m66890A());
            }
            return;
        }
        int i5 = this.f5063f & 7;
        if (i5 != 2) {
            if (i5 == 5) {
                do {
                    list.add(Integer.valueOf(zzj()));
                    if (m66881J()) {
                        return;
                    }
                    i = this.f5060c;
                } while (m66880K() == this.f5063f);
                this.f5060c = i;
                return;
            }
            throw zzjk.zzf();
        }
        int m66880K2 = m66880K();
        m66883H(m66880K2);
        int i6 = this.f5060c + m66880K2;
        while (this.f5060c < i6) {
            list.add(Integer.valueOf(m66890A()));
        }
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: o */
    public final void mo31408o(List list) {
        int i;
        if (list instanceof AbstractC22475uC2) {
            AbstractC22045rk2.m23445a(list);
            int i2 = this.f5063f & 7;
            if (i2 != 1) {
                if (i2 == 2) {
                    int m66880K = m66880K();
                    m66884G(m66880K);
                    int i3 = this.f5060c;
                    if (i3 >= m66880K + i3) {
                        return;
                    }
                    m66889B();
                    throw null;
                }
                throw zzjk.zzf();
            }
            zzi();
            throw null;
        }
        int i4 = this.f5063f & 7;
        if (i4 != 1) {
            if (i4 == 2) {
                int m66880K2 = m66880K();
                m66884G(m66880K2);
                int i5 = this.f5060c + m66880K2;
                while (this.f5060c < i5) {
                    list.add(Long.valueOf(m66889B()));
                }
                return;
            }
            throw zzjk.zzf();
        }
        do {
            list.add(Long.valueOf(zzi()));
            if (m66881J()) {
                return;
            }
            i = this.f5060c;
        } while (m66880K() == this.f5063f);
        this.f5060c = i;
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: p */
    public final void mo31407p(List list) {
        m66873y(list, true);
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: q */
    public final void mo31406q(List list) {
        m66873y(list, false);
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: r */
    public final void mo31405r(List list) {
        int i;
        if (list instanceof AbstractC22475uC2) {
            AbstractC22045rk2.m23445a(list);
            int i2 = this.f5063f & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int m66880K = m66880K();
                    int i3 = this.f5060c;
                    int i4 = m66880K + i3;
                    if (i3 >= i4) {
                        m66882I(i4);
                        return;
                    } else {
                        m66879L();
                        throw null;
                    }
                }
                throw zzjk.zzf();
            }
            zzf();
            throw null;
        }
        int i5 = this.f5063f & 7;
        if (i5 != 0) {
            if (i5 == 2) {
                int m66880K2 = this.f5060c + m66880K();
                while (this.f5060c < m66880K2) {
                    list.add(Long.valueOf(m66879L()));
                }
                m66882I(m66880K2);
                return;
            }
            throw zzjk.zzf();
        }
        do {
            list.add(Long.valueOf(zzf()));
            if (m66881J()) {
                return;
            }
            i = this.f5060c;
        } while (m66880K() == this.f5063f);
        this.f5060c = i;
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: s */
    public final void mo31404s(List list) {
        int i;
        if (list instanceof AbstractC22642vA2) {
            AbstractC22045rk2.m23445a(list);
            int i2 = this.f5063f & 7;
            if (i2 != 2) {
                if (i2 != 5) {
                    throw zzjk.zzf();
                }
                zze();
                throw null;
            }
            int m66880K = m66880K();
            m66883H(m66880K);
            int i3 = this.f5060c;
            if (i3 >= m66880K + i3) {
                return;
            }
            Float.intBitsToFloat(m66890A());
            throw null;
        }
        int i4 = this.f5063f & 7;
        if (i4 != 2) {
            if (i4 == 5) {
                do {
                    list.add(Float.valueOf(zze()));
                    if (m66881J()) {
                        return;
                    }
                    i = this.f5060c;
                } while (m66880K() == this.f5063f);
                this.f5060c = i;
                return;
            }
            throw zzjk.zzf();
        }
        int m66880K2 = m66880K();
        m66883H(m66880K2);
        int i5 = this.f5060c + m66880K2;
        while (this.f5060c < i5) {
            list.add(Float.valueOf(Float.intBitsToFloat(m66890A())));
        }
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: t */
    public final Object mo31403t(Class cls, zzio zzioVar) {
        m66886E(3);
        return m66885F(AE2.m69300a().m69299b(cls), zzioVar);
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: u */
    public final Object mo31402u(Class cls, zzio zzioVar) {
        m66886E(2);
        return m66887D(AE2.m69300a().m69299b(cls), zzioVar);
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: v */
    public final void mo31401v(List list) {
        int i;
        if (list instanceof AbstractC22475uC2) {
            AbstractC22045rk2.m23445a(list);
            int i2 = this.f5063f & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int m66880K = m66880K();
                    int i3 = this.f5060c;
                    int i4 = m66880K + i3;
                    if (i3 >= i4) {
                        m66882I(i4);
                        return;
                    } else {
                        m66879L();
                        throw null;
                    }
                }
                throw zzjk.zzf();
            }
            zzg();
            throw null;
        }
        int i5 = this.f5063f & 7;
        if (i5 != 0) {
            if (i5 == 2) {
                int m66880K2 = this.f5060c + m66880K();
                while (this.f5060c < m66880K2) {
                    list.add(Long.valueOf(m66879L()));
                }
                m66882I(m66880K2);
                return;
            }
            throw zzjk.zzf();
        }
        do {
            list.add(Long.valueOf(zzg()));
            if (m66881J()) {
                return;
            }
            i = this.f5060c;
        } while (m66880K() == this.f5063f);
        this.f5060c = i;
    }

    /* renamed from: w */
    public final String m66875w(boolean z) {
        m66886E(2);
        int m66880K = m66880K();
        if (m66880K == 0) {
            return "";
        }
        m66888C(m66880K);
        if (z) {
            byte[] bArr = this.f5059b;
            int i = this.f5060c;
            if (!AbstractC6610F.m46587g(bArr, i, i + m66880K)) {
                throw zzjk.zzh();
            }
        }
        String str = new String(this.f5059b, this.f5060c, m66880K, zzjf.f47656a);
        this.f5060c += m66880K;
        return str;
    }

    /* renamed from: x */
    public final void m66874x(int i) {
        m66888C(i);
        this.f5060c += i;
    }

    /* renamed from: y */
    public final void m66873y(List list, boolean z) {
        int i;
        int i2;
        if ((this.f5063f & 7) == 2) {
            if ((list instanceof zzjv) && !z) {
                zzjv zzjvVar = (zzjv) list;
                do {
                    zzjvVar.zza(zzn());
                    if (m66881J()) {
                        return;
                    }
                    i2 = this.f5060c;
                } while (m66880K() == this.f5063f);
                this.f5060c = i2;
                return;
            }
            do {
                list.add(m66875w(z));
                if (m66881J()) {
                    return;
                }
                i = this.f5060c;
            } while (m66880K() == this.f5063f);
            this.f5060c = i;
            return;
        }
        throw zzjk.zzf();
    }

    /* renamed from: z */
    public final long m66872z() {
        m66888C(8);
        return m66889B();
    }

    @Override // p000.InterfaceC20062gF2
    public final int zza() {
        if (m66881J()) {
            return Integer.MAX_VALUE;
        }
        int m66880K = m66880K();
        this.f5063f = m66880K;
        if (m66880K == this.f5064g) {
            return Integer.MAX_VALUE;
        }
        return m66880K >>> 3;
    }

    @Override // p000.InterfaceC20062gF2
    public final int zzb() {
        return this.f5063f;
    }

    @Override // p000.InterfaceC20062gF2
    public final boolean zzc() {
        int i;
        int i2;
        if (m66881J() || (i = this.f5063f) == (i2 = this.f5064g)) {
            return false;
        }
        int i3 = i & 7;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 5) {
                            m66874x(4);
                            return true;
                        }
                        throw zzjk.zzf();
                    }
                    this.f5064g = ((i >>> 3) << 3) | 4;
                    while (zza() != Integer.MAX_VALUE && zzc()) {
                    }
                    if (this.f5063f == this.f5064g) {
                        this.f5064g = i2;
                        return true;
                    }
                    throw zzjk.zzg();
                }
                m66874x(m66880K());
                return true;
            }
            m66874x(8);
            return true;
        }
        int i4 = this.f5062e;
        int i5 = this.f5060c;
        if (i4 - i5 >= 10) {
            byte[] bArr = this.f5059b;
            int i6 = 0;
            while (i6 < 10) {
                int i7 = i5 + 1;
                if (bArr[i5] >= 0) {
                    this.f5060c = i7;
                    break;
                }
                i6++;
                i5 = i7;
            }
        }
        for (int i8 = 0; i8 < 10; i8++) {
            if (m66877N() >= 0) {
                return true;
            }
        }
        throw zzjk.zzc();
    }

    @Override // p000.InterfaceC20062gF2
    public final double zzd() {
        m66886E(1);
        return Double.longBitsToDouble(m66872z());
    }

    @Override // p000.InterfaceC20062gF2
    public final float zze() {
        m66886E(5);
        return Float.intBitsToFloat(m66876O());
    }

    @Override // p000.InterfaceC20062gF2
    public final long zzf() {
        m66886E(0);
        return m66879L();
    }

    @Override // p000.InterfaceC20062gF2
    public final long zzg() {
        m66886E(0);
        return m66879L();
    }

    @Override // p000.InterfaceC20062gF2
    public final int zzh() {
        m66886E(0);
        return m66880K();
    }

    @Override // p000.InterfaceC20062gF2
    public final long zzi() {
        m66886E(1);
        return m66872z();
    }

    @Override // p000.InterfaceC20062gF2
    public final int zzj() {
        m66886E(5);
        return m66876O();
    }

    @Override // p000.InterfaceC20062gF2
    public final boolean zzk() {
        m66886E(0);
        if (m66880K() == 0) {
            return false;
        }
        return true;
    }

    @Override // p000.InterfaceC20062gF2
    public final String zzl() {
        return m66875w(false);
    }

    @Override // p000.InterfaceC20062gF2
    public final String zzm() {
        return m66875w(true);
    }

    @Override // p000.InterfaceC20062gF2
    public final zzht zzn() {
        zzht zza;
        m66886E(2);
        int m66880K = m66880K();
        if (m66880K == 0) {
            return zzht.zza;
        }
        m66888C(m66880K);
        if (this.f5058a) {
            zza = zzht.zzb(this.f5059b, this.f5060c, m66880K);
        } else {
            zza = zzht.zza(this.f5059b, this.f5060c, m66880K);
        }
        this.f5060c += m66880K;
        return zza;
    }

    @Override // p000.InterfaceC20062gF2
    public final int zzo() {
        m66886E(0);
        return m66880K();
    }

    @Override // p000.InterfaceC20062gF2
    public final int zzp() {
        m66886E(0);
        return m66880K();
    }

    @Override // p000.InterfaceC20062gF2
    public final int zzq() {
        m66886E(5);
        return m66876O();
    }

    @Override // p000.InterfaceC20062gF2
    public final long zzr() {
        m66886E(1);
        return m66872z();
    }

    @Override // p000.InterfaceC20062gF2
    public final int zzs() {
        m66886E(0);
        return zzif.zze(m66880K());
    }

    @Override // p000.InterfaceC20062gF2
    public final long zzt() {
        m66886E(0);
        return zzif.zza(m66879L());
    }

    @Override // p000.InterfaceC20062gF2
    public final void zze(List list) {
        int i;
        int i2;
        if (list instanceof LA2) {
            LA2 la2 = (LA2) list;
            int i3 = this.f5063f & 7;
            if (i3 == 0) {
                do {
                    la2.m67617b(zzh());
                    if (m66881J()) {
                        return;
                    }
                    i2 = this.f5060c;
                } while (m66880K() == this.f5063f);
                this.f5060c = i2;
                return;
            } else if (i3 == 2) {
                int m66880K = this.f5060c + m66880K();
                while (this.f5060c < m66880K) {
                    la2.m67617b(m66880K());
                }
                m66882I(m66880K);
                return;
            } else {
                throw zzjk.zzf();
            }
        }
        int i4 = this.f5063f & 7;
        if (i4 == 0) {
            do {
                list.add(Integer.valueOf(zzh()));
                if (m66881J()) {
                    return;
                }
                i = this.f5060c;
            } while (m66880K() == this.f5063f);
            this.f5060c = i;
        } else if (i4 == 2) {
            int m66880K2 = this.f5060c + m66880K();
            while (this.f5060c < m66880K2) {
                list.add(Integer.valueOf(m66880K()));
            }
            m66882I(m66880K2);
        } else {
            throw zzjk.zzf();
        }
    }

    @Override // p000.InterfaceC20062gF2
    public final void zza(List list) {
        int i;
        if (list instanceof Ky2) {
            AbstractC22045rk2.m23445a(list);
            int i2 = this.f5063f & 7;
            if (i2 == 1) {
                zzd();
                throw null;
            } else if (i2 == 2) {
                int m66880K = m66880K();
                m66884G(m66880K);
                int i3 = this.f5060c;
                if (i3 >= m66880K + i3) {
                    return;
                }
                Double.longBitsToDouble(m66889B());
                throw null;
            } else {
                throw zzjk.zzf();
            }
        }
        int i4 = this.f5063f & 7;
        if (i4 == 1) {
            do {
                list.add(Double.valueOf(zzd()));
                if (m66881J()) {
                    return;
                }
                i = this.f5060c;
            } while (m66880K() == this.f5063f);
            this.f5060c = i;
        } else if (i4 == 2) {
            int m66880K2 = m66880K();
            m66884G(m66880K2);
            int i5 = this.f5060c + m66880K2;
            while (this.f5060c < i5) {
                list.add(Double.valueOf(Double.longBitsToDouble(m66889B())));
            }
        } else {
            throw zzjk.zzf();
        }
    }
}