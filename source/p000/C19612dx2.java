package p000;

import com.google.android.gms.internal.vision.AbstractC6621F;
import com.google.android.gms.internal.vision.zzht;
import com.google.android.gms.internal.vision.zzif;
import com.google.android.gms.internal.vision.zzjf;
import com.google.android.gms.internal.vision.zzjk;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* renamed from: dx2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19612dx2 extends zzif {

    /* renamed from: f */
    public final byte[] f61364f;

    /* renamed from: g */
    public final boolean f61365g;

    /* renamed from: h */
    public int f61366h;

    /* renamed from: i */
    public int f61367i;

    /* renamed from: j */
    public int f61368j;

    /* renamed from: k */
    public int f61369k;

    /* renamed from: l */
    public int f61370l;

    /* renamed from: m */
    public int f61371m;

    public C19612dx2(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.f61371m = Integer.MAX_VALUE;
        this.f61364f = bArr;
        this.f61366h = i2 + i;
        this.f61368j = i;
        this.f61369k = i;
        this.f61365g = z;
    }

    @Override // com.google.android.gms.internal.vision.zzif
    /* renamed from: b */
    public final long mo31615b() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte m31614c = m31614c();
            j |= (m31614c & Byte.MAX_VALUE) << i;
            if ((m31614c & 128) == 0) {
                return j;
            }
        }
        throw zzjk.zzc();
    }

    /* renamed from: c */
    public final byte m31614c() {
        int i = this.f61368j;
        if (i != this.f61366h) {
            byte[] bArr = this.f61364f;
            this.f61368j = i + 1;
            return bArr[i];
        }
        throw zzjk.zza();
    }

    /* renamed from: d */
    public final void m31613d(int i) {
        if (i >= 0) {
            int i2 = this.f61366h;
            int i3 = this.f61368j;
            if (i <= i2 - i3) {
                this.f61368j = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw zzjk.zzb();
        }
        throw zzjk.zza();
    }

    /* renamed from: e */
    public final int m31612e() {
        int i;
        int i2 = this.f61368j;
        int i3 = this.f61366h;
        if (i3 != i2) {
            byte[] bArr = this.f61364f;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f61368j = i4;
                return b;
            } else if (i3 - i4 >= 9) {
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
                this.f61368j = i5;
                return i;
            }
        }
        return (int) mo31615b();
    }

    /* renamed from: f */
    public final long m31611f() {
        long j;
        long j2;
        long j3;
        int i = this.f61368j;
        int i2 = this.f61366h;
        if (i2 != i) {
            byte[] bArr = this.f61364f;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.f61368j = i3;
                return b;
            } else if (i2 - i3 >= 9) {
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
                this.f61368j = i4;
                return j;
            }
        }
        return mo31615b();
    }

    /* renamed from: g */
    public final int m31610g() {
        int i = this.f61368j;
        if (this.f61366h - i >= 4) {
            byte[] bArr = this.f61364f;
            this.f61368j = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw zzjk.zza();
    }

    /* renamed from: h */
    public final long m31609h() {
        int i = this.f61368j;
        if (this.f61366h - i >= 8) {
            byte[] bArr = this.f61364f;
            this.f61368j = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }
        throw zzjk.zza();
    }

    /* renamed from: i */
    public final void m31608i() {
        int i = this.f61366h + this.f61367i;
        this.f61366h = i;
        int i2 = i - this.f61369k;
        int i3 = this.f61371m;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f61367i = i4;
            this.f61366h = i - i4;
            return;
        }
        this.f61367i = 0;
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final int zza() {
        if (zzt()) {
            this.f61370l = 0;
            return 0;
        }
        int m31612e = m31612e();
        this.f61370l = m31612e;
        if ((m31612e >>> 3) != 0) {
            return m31612e;
        }
        throw zzjk.zzd();
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final boolean zzb(int i) {
        int zza;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.f61366h - this.f61368j >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.f61364f;
                    int i4 = this.f61368j;
                    this.f61368j = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw zzjk.zzc();
            }
            while (i3 < 10) {
                if (m31614c() < 0) {
                    i3++;
                }
            }
            throw zzjk.zzc();
            return true;
        } else if (i2 == 1) {
            m31613d(8);
            return true;
        } else if (i2 == 2) {
            m31613d(m31612e());
            return true;
        } else if (i2 != 3) {
            if (i2 != 4) {
                if (i2 == 5) {
                    m31613d(4);
                    return true;
                }
                throw zzjk.zzf();
            }
            return false;
        } else {
            do {
                zza = zza();
                if (zza == 0) {
                    break;
                }
            } while (zzb(zza));
            zza(((i >>> 3) << 3) | 4);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final float zzc() {
        return Float.intBitsToFloat(m31610g());
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final long zzd() {
        return m31611f();
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final long zze() {
        return m31611f();
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final int zzf() {
        return m31612e();
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final long zzg() {
        return m31609h();
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final int zzh() {
        return m31610g();
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final boolean zzi() {
        if (m31611f() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final String zzj() {
        int m31612e = m31612e();
        if (m31612e > 0) {
            int i = this.f61366h;
            int i2 = this.f61368j;
            if (m31612e <= i - i2) {
                String str = new String(this.f61364f, i2, m31612e, zzjf.f47644a);
                this.f61368j += m31612e;
                return str;
            }
        }
        if (m31612e == 0) {
            return "";
        }
        if (m31612e < 0) {
            throw zzjk.zzb();
        }
        throw zzjk.zza();
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final String zzk() {
        int m31612e = m31612e();
        if (m31612e > 0) {
            int i = this.f61366h;
            int i2 = this.f61368j;
            if (m31612e <= i - i2) {
                String m46597k = AbstractC6621F.m46597k(this.f61364f, i2, m31612e);
                this.f61368j += m31612e;
                return m46597k;
            }
        }
        if (m31612e == 0) {
            return "";
        }
        if (m31612e <= 0) {
            throw zzjk.zzb();
        }
        throw zzjk.zza();
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final zzht zzl() {
        byte[] bArr;
        int m31612e = m31612e();
        if (m31612e > 0) {
            int i = this.f61366h;
            int i2 = this.f61368j;
            if (m31612e <= i - i2) {
                zzht zza = zzht.zza(this.f61364f, i2, m31612e);
                this.f61368j += m31612e;
                return zza;
            }
        }
        if (m31612e == 0) {
            return zzht.zza;
        }
        if (m31612e > 0) {
            int i3 = this.f61366h;
            int i4 = this.f61368j;
            if (m31612e <= i3 - i4) {
                int i5 = m31612e + i4;
                this.f61368j = i5;
                bArr = Arrays.copyOfRange(this.f61364f, i4, i5);
                return zzht.zza(bArr);
            }
        }
        if (m31612e <= 0) {
            if (m31612e == 0) {
                bArr = zzjf.zzb;
                return zzht.zza(bArr);
            }
            throw zzjk.zzb();
        }
        throw zzjk.zza();
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final int zzm() {
        return m31612e();
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final int zzn() {
        return m31612e();
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final int zzo() {
        return m31610g();
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final long zzp() {
        return m31609h();
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final int zzq() {
        return zzif.zze(m31612e());
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final long zzr() {
        return zzif.zza(m31611f());
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final boolean zzt() {
        if (this.f61368j == this.f61366h) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final int zzu() {
        return this.f61368j - this.f61369k;
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final int zzc(int i) {
        if (i >= 0) {
            int zzu = i + zzu();
            int i2 = this.f61371m;
            if (zzu <= i2) {
                this.f61371m = zzu;
                m31608i();
                return i2;
            }
            throw zzjk.zza();
        }
        throw zzjk.zzb();
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final void zzd(int i) {
        this.f61371m = i;
        m31608i();
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final void zza(int i) {
        if (this.f61370l != i) {
            throw zzjk.zze();
        }
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final double zzb() {
        return Double.longBitsToDouble(m31609h());
    }
}
