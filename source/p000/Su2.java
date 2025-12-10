package p000;

import com.google.android.gms.internal.vision.AbstractC6621F;
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

/* renamed from: Su2 */
/* loaded from: classes3.dex */
public final class Su2 extends Iu2 {

    /* renamed from: a */
    public final boolean f5859a;

    /* renamed from: b */
    public final byte[] f5860b;

    /* renamed from: c */
    public int f5861c;

    /* renamed from: d */
    public final int f5862d;

    /* renamed from: e */
    public int f5863e;

    /* renamed from: f */
    public int f5864f;

    /* renamed from: g */
    public int f5865g;

    public Su2(ByteBuffer byteBuffer, boolean z) {
        super();
        this.f5859a = true;
        this.f5860b = byteBuffer.array();
        int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
        this.f5861c = arrayOffset;
        this.f5862d = arrayOffset;
        this.f5863e = byteBuffer.arrayOffset() + byteBuffer.limit();
    }

    /* renamed from: A */
    public final int m66277A() {
        int i = this.f5861c;
        byte[] bArr = this.f5860b;
        this.f5861c = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: B */
    public final long m66276B() {
        int i = this.f5861c;
        byte[] bArr = this.f5860b;
        this.f5861c = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* renamed from: C */
    public final void m66275C(int i) {
        if (i >= 0 && i <= this.f5863e - this.f5861c) {
            return;
        }
        throw zzjk.zza();
    }

    /* renamed from: D */
    public final Object m66274D(InterfaceC19835fE2 interfaceC19835fE2, zzio zzioVar) {
        int m66267K = m66267K();
        m66275C(m66267K);
        int i = this.f5863e;
        int i2 = this.f5861c + m66267K;
        this.f5863e = i2;
        try {
            Object zza = interfaceC19835fE2.zza();
            interfaceC19835fE2.mo31332d(zza, this, zzioVar);
            interfaceC19835fE2.zzc(zza);
            if (this.f5861c == i2) {
                return zza;
            }
            throw zzjk.zzg();
        } finally {
            this.f5863e = i;
        }
    }

    /* renamed from: E */
    public final void m66273E(int i) {
        if ((this.f5864f & 7) == i) {
            return;
        }
        throw zzjk.zzf();
    }

    /* renamed from: F */
    public final Object m66272F(InterfaceC19835fE2 interfaceC19835fE2, zzio zzioVar) {
        int i = this.f5865g;
        this.f5865g = ((this.f5864f >>> 3) << 3) | 4;
        try {
            Object zza = interfaceC19835fE2.zza();
            interfaceC19835fE2.mo31332d(zza, this, zzioVar);
            interfaceC19835fE2.zzc(zza);
            if (this.f5864f == this.f5865g) {
                return zza;
            }
            throw zzjk.zzg();
        } finally {
            this.f5865g = i;
        }
    }

    /* renamed from: G */
    public final void m66271G(int i) {
        m66275C(i);
        if ((i & 7) == 0) {
            return;
        }
        throw zzjk.zzg();
    }

    /* renamed from: H */
    public final void m66270H(int i) {
        m66275C(i);
        if ((i & 3) == 0) {
            return;
        }
        throw zzjk.zzg();
    }

    /* renamed from: I */
    public final void m66269I(int i) {
        if (this.f5861c == i) {
            return;
        }
        throw zzjk.zza();
    }

    /* renamed from: J */
    public final boolean m66268J() {
        if (this.f5861c == this.f5863e) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    public final int m66267K() {
        int i;
        int i2 = this.f5861c;
        int i3 = this.f5863e;
        if (i3 != i2) {
            byte[] bArr = this.f5860b;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f5861c = i4;
                return b;
            } else if (i3 - i4 < 9) {
                return (int) m66265M();
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
                            int i11 = (i10 ^ (b2 << Ascii.f52686FS)) ^ 266354560;
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
                this.f5861c = i5;
                return i;
            }
        }
        throw zzjk.zza();
    }

    /* renamed from: L */
    public final long m66266L() {
        long j;
        long j2;
        long j3;
        int i = this.f5861c;
        int i2 = this.f5863e;
        if (i2 != i) {
            byte[] bArr = this.f5860b;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.f5861c = i3;
                return b;
            } else if (i2 - i3 < 9) {
                return m66265M();
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
                this.f5861c = i4;
                return j;
            }
        }
        throw zzjk.zza();
    }

    /* renamed from: M */
    public final long m66265M() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte m66264N = m66264N();
            j |= (m66264N & Byte.MAX_VALUE) << i;
            if ((m66264N & 128) == 0) {
                return j;
            }
        }
        throw zzjk.zzc();
    }

    /* renamed from: N */
    public final byte m66264N() {
        int i = this.f5861c;
        if (i != this.f5863e) {
            byte[] bArr = this.f5860b;
            this.f5861c = i + 1;
            return bArr[i];
        }
        throw zzjk.zza();
    }

    /* renamed from: O */
    public final int m66263O() {
        m66275C(4);
        return m66277A();
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: a */
    public final void mo29276a(List list, InterfaceC19835fE2 interfaceC19835fE2, zzio zzioVar) {
        int i;
        int i2 = this.f5864f;
        if ((i2 & 7) == 2) {
            do {
                list.add(m66274D(interfaceC19835fE2, zzioVar));
                if (m66268J()) {
                    return;
                }
                i = this.f5861c;
            } while (m66267K() == i2);
            this.f5861c = i;
            return;
        }
        throw zzjk.zzf();
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: b */
    public final void mo29275b(Map map, AbstractC21033mC2 abstractC21033mC2, zzio zzioVar) {
        m66273E(2);
        int m66267K = m66267K();
        m66275C(m66267K);
        int i = this.f5863e;
        this.f5863e = this.f5861c + m66267K;
        try {
            throw null;
        } catch (Throwable th2) {
            this.f5863e = i;
            throw th2;
        }
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: c */
    public final Object mo29274c(InterfaceC19835fE2 interfaceC19835fE2, zzio zzioVar) {
        m66273E(2);
        return m66274D(interfaceC19835fE2, zzioVar);
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: d */
    public final void mo29273d(List list) {
        int i;
        int i2;
        if (list instanceof Oz2) {
            Oz2 oz2 = (Oz2) list;
            int i3 = this.f5864f & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int m66267K = this.f5861c + m66267K();
                    while (this.f5861c < m66267K) {
                        oz2.m66936b(zzif.zze(m66267K()));
                    }
                    return;
                }
                throw zzjk.zzf();
            }
            do {
                oz2.m66936b(zzs());
                if (m66268J()) {
                    return;
                }
                i2 = this.f5861c;
            } while (m66267K() == this.f5864f);
            this.f5861c = i2;
            return;
        }
        int i4 = this.f5864f & 7;
        if (i4 != 0) {
            if (i4 == 2) {
                int m66267K2 = this.f5861c + m66267K();
                while (this.f5861c < m66267K2) {
                    list.add(Integer.valueOf(zzif.zze(m66267K())));
                }
                return;
            }
            throw zzjk.zzf();
        }
        do {
            list.add(Integer.valueOf(zzs()));
            if (m66268J()) {
                return;
            }
            i = this.f5861c;
        } while (m66267K() == this.f5864f);
        this.f5861c = i;
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: e */
    public final void mo29272e(List list) {
        int i;
        if (list instanceof AbstractC22922xB2) {
            AbstractC22494uj2.m1214a(list);
            int i2 = this.f5864f & 7;
            if (i2 != 1) {
                if (i2 == 2) {
                    int m66267K = m66267K();
                    m66271G(m66267K);
                    int i3 = this.f5861c;
                    if (i3 >= m66267K + i3) {
                        return;
                    }
                    m66276B();
                    throw null;
                }
                throw zzjk.zzf();
            }
            zzr();
            throw null;
        }
        int i4 = this.f5864f & 7;
        if (i4 != 1) {
            if (i4 == 2) {
                int m66267K2 = m66267K();
                m66271G(m66267K2);
                int i5 = this.f5861c + m66267K2;
                while (this.f5861c < i5) {
                    list.add(Long.valueOf(m66276B()));
                }
                return;
            }
            throw zzjk.zzf();
        }
        do {
            list.add(Long.valueOf(zzr()));
            if (m66268J()) {
                return;
            }
            i = this.f5861c;
        } while (m66267K() == this.f5864f);
        this.f5861c = i;
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: f */
    public final Object mo29271f(InterfaceC19835fE2 interfaceC19835fE2, zzio zzioVar) {
        m66273E(3);
        return m66272F(interfaceC19835fE2, zzioVar);
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: g */
    public final void mo29270g(List list) {
        int i;
        if (list instanceof AbstractC22922xB2) {
            AbstractC22494uj2.m1214a(list);
            int i2 = this.f5864f & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int m66267K = m66267K();
                    int i3 = this.f5861c;
                    if (i3 >= m66267K + i3) {
                        return;
                    }
                    zzif.zza(m66266L());
                    throw null;
                }
                throw zzjk.zzf();
            }
            zzt();
            throw null;
        }
        int i4 = this.f5864f & 7;
        if (i4 != 0) {
            if (i4 == 2) {
                int m66267K2 = this.f5861c + m66267K();
                while (this.f5861c < m66267K2) {
                    list.add(Long.valueOf(zzif.zza(m66266L())));
                }
                return;
            }
            throw zzjk.zzf();
        }
        do {
            list.add(Long.valueOf(zzt()));
            if (m66268J()) {
                return;
            }
            i = this.f5861c;
        } while (m66267K() == this.f5864f);
        this.f5861c = i;
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: h */
    public final void mo29269h(List list) {
        int i;
        int i2;
        if (list instanceof Oz2) {
            Oz2 oz2 = (Oz2) list;
            int i3 = this.f5864f & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int m66267K = this.f5861c + m66267K();
                    while (this.f5861c < m66267K) {
                        oz2.m66936b(m66267K());
                    }
                    return;
                }
                throw zzjk.zzf();
            }
            do {
                oz2.m66936b(zzo());
                if (m66268J()) {
                    return;
                }
                i2 = this.f5861c;
            } while (m66267K() == this.f5864f);
            this.f5861c = i2;
            return;
        }
        int i4 = this.f5864f & 7;
        if (i4 != 0) {
            if (i4 == 2) {
                int m66267K2 = this.f5861c + m66267K();
                while (this.f5861c < m66267K2) {
                    list.add(Integer.valueOf(m66267K()));
                }
                return;
            }
            throw zzjk.zzf();
        }
        do {
            list.add(Integer.valueOf(zzo()));
            if (m66268J()) {
                return;
            }
            i = this.f5861c;
        } while (m66267K() == this.f5864f);
        this.f5861c = i;
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: i */
    public final void mo29268i(List list) {
        int i;
        if ((this.f5864f & 7) == 2) {
            do {
                list.add(zzn());
                if (m66268J()) {
                    return;
                }
                i = this.f5861c;
            } while (m66267K() == this.f5864f);
            this.f5861c = i;
            return;
        }
        throw zzjk.zzf();
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: j */
    public final void mo29267j(List list) {
        int i;
        int i2;
        if (list instanceof Oz2) {
            Oz2 oz2 = (Oz2) list;
            int i3 = this.f5864f & 7;
            if (i3 != 2) {
                if (i3 == 5) {
                    do {
                        oz2.m66936b(zzq());
                        if (m66268J()) {
                            return;
                        }
                        i2 = this.f5861c;
                    } while (m66267K() == this.f5864f);
                    this.f5861c = i2;
                    return;
                }
                throw zzjk.zzf();
            }
            int m66267K = m66267K();
            m66270H(m66267K);
            int i4 = this.f5861c + m66267K;
            while (this.f5861c < i4) {
                oz2.m66936b(m66277A());
            }
            return;
        }
        int i5 = this.f5864f & 7;
        if (i5 != 2) {
            if (i5 == 5) {
                do {
                    list.add(Integer.valueOf(zzq()));
                    if (m66268J()) {
                        return;
                    }
                    i = this.f5861c;
                } while (m66267K() == this.f5864f);
                this.f5861c = i;
                return;
            }
            throw zzjk.zzf();
        }
        int m66267K2 = m66267K();
        m66270H(m66267K2);
        int i6 = this.f5861c + m66267K2;
        while (this.f5861c < i6) {
            list.add(Integer.valueOf(m66277A()));
        }
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: k */
    public final void mo29266k(List list, InterfaceC19835fE2 interfaceC19835fE2, zzio zzioVar) {
        int i;
        int i2 = this.f5864f;
        if ((i2 & 7) == 3) {
            do {
                list.add(m66272F(interfaceC19835fE2, zzioVar));
                if (m66268J()) {
                    return;
                }
                i = this.f5861c;
            } while (m66267K() == i2);
            this.f5861c = i;
            return;
        }
        throw zzjk.zzf();
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: l */
    public final void mo29265l(List list) {
        int i;
        int i2;
        if (list instanceof Oz2) {
            Oz2 oz2 = (Oz2) list;
            int i3 = this.f5864f & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int m66267K = this.f5861c + m66267K();
                    while (this.f5861c < m66267K) {
                        oz2.m66936b(m66267K());
                    }
                    return;
                }
                throw zzjk.zzf();
            }
            do {
                oz2.m66936b(zzp());
                if (m66268J()) {
                    return;
                }
                i2 = this.f5861c;
            } while (m66267K() == this.f5864f);
            this.f5861c = i2;
            return;
        }
        int i4 = this.f5864f & 7;
        if (i4 != 0) {
            if (i4 == 2) {
                int m66267K2 = this.f5861c + m66267K();
                while (this.f5861c < m66267K2) {
                    list.add(Integer.valueOf(m66267K()));
                }
                return;
            }
            throw zzjk.zzf();
        }
        do {
            list.add(Integer.valueOf(zzp()));
            if (m66268J()) {
                return;
            }
            i = this.f5861c;
        } while (m66267K() == this.f5864f);
        this.f5861c = i;
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: m */
    public final void mo29264m(List list) {
        int i;
        boolean z;
        if (list instanceof AbstractC20638jv2) {
            AbstractC22494uj2.m1214a(list);
            int i2 = this.f5864f & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int m66267K = m66267K();
                    int i3 = this.f5861c;
                    int i4 = m66267K + i3;
                    if (i3 >= i4) {
                        m66269I(i4);
                        return;
                    } else {
                        m66267K();
                        throw null;
                    }
                }
                throw zzjk.zzf();
            }
            zzk();
            throw null;
        }
        int i5 = this.f5864f & 7;
        if (i5 != 0) {
            if (i5 == 2) {
                int m66267K2 = this.f5861c + m66267K();
                while (this.f5861c < m66267K2) {
                    if (m66267K() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    list.add(Boolean.valueOf(z));
                }
                m66269I(m66267K2);
                return;
            }
            throw zzjk.zzf();
        }
        do {
            list.add(Boolean.valueOf(zzk()));
            if (m66268J()) {
                return;
            }
            i = this.f5861c;
        } while (m66267K() == this.f5864f);
        this.f5861c = i;
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: n */
    public final void mo29263n(List list) {
        int i;
        int i2;
        if (list instanceof Oz2) {
            Oz2 oz2 = (Oz2) list;
            int i3 = this.f5864f & 7;
            if (i3 != 2) {
                if (i3 == 5) {
                    do {
                        oz2.m66936b(zzj());
                        if (m66268J()) {
                            return;
                        }
                        i2 = this.f5861c;
                    } while (m66267K() == this.f5864f);
                    this.f5861c = i2;
                    return;
                }
                throw zzjk.zzf();
            }
            int m66267K = m66267K();
            m66270H(m66267K);
            int i4 = this.f5861c + m66267K;
            while (this.f5861c < i4) {
                oz2.m66936b(m66277A());
            }
            return;
        }
        int i5 = this.f5864f & 7;
        if (i5 != 2) {
            if (i5 == 5) {
                do {
                    list.add(Integer.valueOf(zzj()));
                    if (m66268J()) {
                        return;
                    }
                    i = this.f5861c;
                } while (m66267K() == this.f5864f);
                this.f5861c = i;
                return;
            }
            throw zzjk.zzf();
        }
        int m66267K2 = m66267K();
        m66270H(m66267K2);
        int i6 = this.f5861c + m66267K2;
        while (this.f5861c < i6) {
            list.add(Integer.valueOf(m66277A()));
        }
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: o */
    public final void mo29262o(List list) {
        int i;
        if (list instanceof AbstractC22922xB2) {
            AbstractC22494uj2.m1214a(list);
            int i2 = this.f5864f & 7;
            if (i2 != 1) {
                if (i2 == 2) {
                    int m66267K = m66267K();
                    m66271G(m66267K);
                    int i3 = this.f5861c;
                    if (i3 >= m66267K + i3) {
                        return;
                    }
                    m66276B();
                    throw null;
                }
                throw zzjk.zzf();
            }
            zzi();
            throw null;
        }
        int i4 = this.f5864f & 7;
        if (i4 != 1) {
            if (i4 == 2) {
                int m66267K2 = m66267K();
                m66271G(m66267K2);
                int i5 = this.f5861c + m66267K2;
                while (this.f5861c < i5) {
                    list.add(Long.valueOf(m66276B()));
                }
                return;
            }
            throw zzjk.zzf();
        }
        do {
            list.add(Long.valueOf(zzi()));
            if (m66268J()) {
                return;
            }
            i = this.f5861c;
        } while (m66267K() == this.f5864f);
        this.f5861c = i;
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: p */
    public final void mo29261p(List list) {
        m66260y(list, true);
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: q */
    public final void mo29260q(List list) {
        m66260y(list, false);
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: r */
    public final void mo29259r(List list) {
        int i;
        if (list instanceof AbstractC22922xB2) {
            AbstractC22494uj2.m1214a(list);
            int i2 = this.f5864f & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int m66267K = m66267K();
                    int i3 = this.f5861c;
                    int i4 = m66267K + i3;
                    if (i3 >= i4) {
                        m66269I(i4);
                        return;
                    } else {
                        m66266L();
                        throw null;
                    }
                }
                throw zzjk.zzf();
            }
            zzf();
            throw null;
        }
        int i5 = this.f5864f & 7;
        if (i5 != 0) {
            if (i5 == 2) {
                int m66267K2 = this.f5861c + m66267K();
                while (this.f5861c < m66267K2) {
                    list.add(Long.valueOf(m66266L()));
                }
                m66269I(m66267K2);
                return;
            }
            throw zzjk.zzf();
        }
        do {
            list.add(Long.valueOf(zzf()));
            if (m66268J()) {
                return;
            }
            i = this.f5861c;
        } while (m66267K() == this.f5864f);
        this.f5861c = i;
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: s */
    public final void mo29258s(List list) {
        int i;
        if (list instanceof AbstractC23230yz2) {
            AbstractC22494uj2.m1214a(list);
            int i2 = this.f5864f & 7;
            if (i2 != 2) {
                if (i2 != 5) {
                    throw zzjk.zzf();
                }
                zze();
                throw null;
            }
            int m66267K = m66267K();
            m66270H(m66267K);
            int i3 = this.f5861c;
            if (i3 >= m66267K + i3) {
                return;
            }
            Float.intBitsToFloat(m66277A());
            throw null;
        }
        int i4 = this.f5864f & 7;
        if (i4 != 2) {
            if (i4 == 5) {
                do {
                    list.add(Float.valueOf(zze()));
                    if (m66268J()) {
                        return;
                    }
                    i = this.f5861c;
                } while (m66267K() == this.f5864f);
                this.f5861c = i;
                return;
            }
            throw zzjk.zzf();
        }
        int m66267K2 = m66267K();
        m66270H(m66267K2);
        int i5 = this.f5861c + m66267K2;
        while (this.f5861c < i5) {
            list.add(Float.valueOf(Float.intBitsToFloat(m66277A())));
        }
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: t */
    public final Object mo29257t(Class cls, zzio zzioVar) {
        m66273E(3);
        return m66272F(DD2.m68673a().m68672b(cls), zzioVar);
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: u */
    public final Object mo29256u(Class cls, zzio zzioVar) {
        m66273E(2);
        return m66274D(DD2.m68673a().m68672b(cls), zzioVar);
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: v */
    public final void mo29255v(List list) {
        int i;
        if (list instanceof AbstractC22922xB2) {
            AbstractC22494uj2.m1214a(list);
            int i2 = this.f5864f & 7;
            if (i2 != 0) {
                if (i2 == 2) {
                    int m66267K = m66267K();
                    int i3 = this.f5861c;
                    int i4 = m66267K + i3;
                    if (i3 >= i4) {
                        m66269I(i4);
                        return;
                    } else {
                        m66266L();
                        throw null;
                    }
                }
                throw zzjk.zzf();
            }
            zzg();
            throw null;
        }
        int i5 = this.f5864f & 7;
        if (i5 != 0) {
            if (i5 == 2) {
                int m66267K2 = this.f5861c + m66267K();
                while (this.f5861c < m66267K2) {
                    list.add(Long.valueOf(m66266L()));
                }
                m66269I(m66267K2);
                return;
            }
            throw zzjk.zzf();
        }
        do {
            list.add(Long.valueOf(zzg()));
            if (m66268J()) {
                return;
            }
            i = this.f5861c;
        } while (m66267K() == this.f5864f);
        this.f5861c = i;
    }

    /* renamed from: w */
    public final String m66262w(boolean z) {
        m66273E(2);
        int m66267K = m66267K();
        if (m66267K == 0) {
            return "";
        }
        m66275C(m66267K);
        if (z) {
            byte[] bArr = this.f5860b;
            int i = this.f5861c;
            if (!AbstractC6621F.m46601g(bArr, i, i + m66267K)) {
                throw zzjk.zzh();
            }
        }
        String str = new String(this.f5860b, this.f5861c, m66267K, zzjf.f47644a);
        this.f5861c += m66267K;
        return str;
    }

    /* renamed from: x */
    public final void m66261x(int i) {
        m66275C(i);
        this.f5861c += i;
    }

    /* renamed from: y */
    public final void m66260y(List list, boolean z) {
        int i;
        int i2;
        if ((this.f5864f & 7) == 2) {
            if ((list instanceof zzjv) && !z) {
                zzjv zzjvVar = (zzjv) list;
                do {
                    zzjvVar.zza(zzn());
                    if (m66268J()) {
                        return;
                    }
                    i2 = this.f5861c;
                } while (m66267K() == this.f5864f);
                this.f5861c = i2;
                return;
            }
            do {
                list.add(m66262w(z));
                if (m66268J()) {
                    return;
                }
                i = this.f5861c;
            } while (m66267K() == this.f5864f);
            this.f5861c = i;
            return;
        }
        throw zzjk.zzf();
    }

    /* renamed from: z */
    public final long m66259z() {
        m66275C(8);
        return m66276B();
    }

    @Override // p000.InterfaceC20523jE2
    public final int zza() {
        if (m66268J()) {
            return Integer.MAX_VALUE;
        }
        int m66267K = m66267K();
        this.f5864f = m66267K;
        if (m66267K == this.f5865g) {
            return Integer.MAX_VALUE;
        }
        return m66267K >>> 3;
    }

    @Override // p000.InterfaceC20523jE2
    public final int zzb() {
        return this.f5864f;
    }

    @Override // p000.InterfaceC20523jE2
    public final boolean zzc() {
        int i;
        int i2;
        if (m66268J() || (i = this.f5864f) == (i2 = this.f5865g)) {
            return false;
        }
        int i3 = i & 7;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 5) {
                            m66261x(4);
                            return true;
                        }
                        throw zzjk.zzf();
                    }
                    this.f5865g = ((i >>> 3) << 3) | 4;
                    while (zza() != Integer.MAX_VALUE && zzc()) {
                    }
                    if (this.f5864f == this.f5865g) {
                        this.f5865g = i2;
                        return true;
                    }
                    throw zzjk.zzg();
                }
                m66261x(m66267K());
                return true;
            }
            m66261x(8);
            return true;
        }
        int i4 = this.f5863e;
        int i5 = this.f5861c;
        if (i4 - i5 >= 10) {
            byte[] bArr = this.f5860b;
            int i6 = 0;
            while (i6 < 10) {
                int i7 = i5 + 1;
                if (bArr[i5] >= 0) {
                    this.f5861c = i7;
                    break;
                }
                i6++;
                i5 = i7;
            }
        }
        for (int i8 = 0; i8 < 10; i8++) {
            if (m66264N() >= 0) {
                return true;
            }
        }
        throw zzjk.zzc();
    }

    @Override // p000.InterfaceC20523jE2
    public final double zzd() {
        m66273E(1);
        return Double.longBitsToDouble(m66259z());
    }

    @Override // p000.InterfaceC20523jE2
    public final float zze() {
        m66273E(5);
        return Float.intBitsToFloat(m66263O());
    }

    @Override // p000.InterfaceC20523jE2
    public final long zzf() {
        m66273E(0);
        return m66266L();
    }

    @Override // p000.InterfaceC20523jE2
    public final long zzg() {
        m66273E(0);
        return m66266L();
    }

    @Override // p000.InterfaceC20523jE2
    public final int zzh() {
        m66273E(0);
        return m66267K();
    }

    @Override // p000.InterfaceC20523jE2
    public final long zzi() {
        m66273E(1);
        return m66259z();
    }

    @Override // p000.InterfaceC20523jE2
    public final int zzj() {
        m66273E(5);
        return m66263O();
    }

    @Override // p000.InterfaceC20523jE2
    public final boolean zzk() {
        m66273E(0);
        if (m66267K() == 0) {
            return false;
        }
        return true;
    }

    @Override // p000.InterfaceC20523jE2
    public final String zzl() {
        return m66262w(false);
    }

    @Override // p000.InterfaceC20523jE2
    public final String zzm() {
        return m66262w(true);
    }

    @Override // p000.InterfaceC20523jE2
    public final zzht zzn() {
        zzht zza;
        m66273E(2);
        int m66267K = m66267K();
        if (m66267K == 0) {
            return zzht.zza;
        }
        m66275C(m66267K);
        if (this.f5859a) {
            zza = zzht.zzb(this.f5860b, this.f5861c, m66267K);
        } else {
            zza = zzht.zza(this.f5860b, this.f5861c, m66267K);
        }
        this.f5861c += m66267K;
        return zza;
    }

    @Override // p000.InterfaceC20523jE2
    public final int zzo() {
        m66273E(0);
        return m66267K();
    }

    @Override // p000.InterfaceC20523jE2
    public final int zzp() {
        m66273E(0);
        return m66267K();
    }

    @Override // p000.InterfaceC20523jE2
    public final int zzq() {
        m66273E(5);
        return m66263O();
    }

    @Override // p000.InterfaceC20523jE2
    public final long zzr() {
        m66273E(1);
        return m66259z();
    }

    @Override // p000.InterfaceC20523jE2
    public final int zzs() {
        m66273E(0);
        return zzif.zze(m66267K());
    }

    @Override // p000.InterfaceC20523jE2
    public final long zzt() {
        m66273E(0);
        return zzif.zza(m66266L());
    }

    @Override // p000.InterfaceC20523jE2
    public final void zze(List list) {
        int i;
        int i2;
        if (list instanceof Oz2) {
            Oz2 oz2 = (Oz2) list;
            int i3 = this.f5864f & 7;
            if (i3 == 0) {
                do {
                    oz2.m66936b(zzh());
                    if (m66268J()) {
                        return;
                    }
                    i2 = this.f5861c;
                } while (m66267K() == this.f5864f);
                this.f5861c = i2;
                return;
            } else if (i3 == 2) {
                int m66267K = this.f5861c + m66267K();
                while (this.f5861c < m66267K) {
                    oz2.m66936b(m66267K());
                }
                m66269I(m66267K);
                return;
            } else {
                throw zzjk.zzf();
            }
        }
        int i4 = this.f5864f & 7;
        if (i4 == 0) {
            do {
                list.add(Integer.valueOf(zzh()));
                if (m66268J()) {
                    return;
                }
                i = this.f5861c;
            } while (m66267K() == this.f5864f);
            this.f5861c = i;
        } else if (i4 == 2) {
            int m66267K2 = this.f5861c + m66267K();
            while (this.f5861c < m66267K2) {
                list.add(Integer.valueOf(m66267K()));
            }
            m66269I(m66267K2);
        } else {
            throw zzjk.zzf();
        }
    }

    @Override // p000.InterfaceC20523jE2
    public final void zza(List list) {
        int i;
        if (list instanceof Nx2) {
            AbstractC22494uj2.m1214a(list);
            int i2 = this.f5864f & 7;
            if (i2 == 1) {
                zzd();
                throw null;
            } else if (i2 == 2) {
                int m66267K = m66267K();
                m66271G(m66267K);
                int i3 = this.f5861c;
                if (i3 >= m66267K + i3) {
                    return;
                }
                Double.longBitsToDouble(m66276B());
                throw null;
            } else {
                throw zzjk.zzf();
            }
        }
        int i4 = this.f5864f & 7;
        if (i4 == 1) {
            do {
                list.add(Double.valueOf(zzd()));
                if (m66268J()) {
                    return;
                }
                i = this.f5861c;
            } while (m66267K() == this.f5864f);
            this.f5861c = i;
        } else if (i4 == 2) {
            int m66267K2 = m66267K();
            m66271G(m66267K2);
            int i5 = this.f5861c + m66267K2;
            while (this.f5861c < i5) {
                list.add(Double.valueOf(Double.longBitsToDouble(m66276B())));
            }
        } else {
            throw zzjk.zzf();
        }
    }
}
