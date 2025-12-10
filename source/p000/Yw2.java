package p000;

import com.google.android.gms.internal.vision.zzht;
import com.google.android.gms.internal.vision.zzif;
import com.google.android.gms.internal.vision.zzio;
import com.google.android.gms.internal.vision.zzjf;
import com.google.android.gms.internal.vision.zzjk;
import com.google.android.gms.internal.vision.zzjv;
import java.util.List;
import java.util.Map;

/* renamed from: Yw2 */
/* loaded from: classes3.dex */
public final class Yw2 implements InterfaceC20523jE2 {

    /* renamed from: a */
    public final zzif f7911a;

    /* renamed from: b */
    public int f7912b;

    /* renamed from: c */
    public int f7913c;

    /* renamed from: d */
    public int f7914d = 0;

    public Yw2(zzif zzifVar) {
        zzif zzifVar2 = (zzif) zzjf.m46419d(zzifVar, "input");
        this.f7911a = zzifVar2;
        zzifVar2.f47617d = this;
    }

    /* renamed from: A */
    private final Object m65284A(InterfaceC19835fE2 interfaceC19835fE2, zzio zzioVar) {
        zzif zzifVar;
        int zzm = this.f7911a.zzm();
        zzif zzifVar2 = this.f7911a;
        if (zzifVar2.f47614a < zzifVar2.f47615b) {
            int zzc = zzifVar2.zzc(zzm);
            Object zza = interfaceC19835fE2.zza();
            this.f7911a.f47614a++;
            interfaceC19835fE2.mo31332d(zza, this, zzioVar);
            interfaceC19835fE2.zzc(zza);
            this.f7911a.zza(0);
            zzifVar.f47614a--;
            this.f7911a.zzd(zzc);
            return zza;
        }
        throw new zzjk("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: B */
    private static void m65283B(int i) {
        if ((i & 3) == 0) {
            return;
        }
        throw zzjk.zzg();
    }

    /* renamed from: C */
    private final Object m65282C(InterfaceC19835fE2 interfaceC19835fE2, zzio zzioVar) {
        int i = this.f7913c;
        this.f7913c = ((this.f7912b >>> 3) << 3) | 4;
        try {
            Object zza = interfaceC19835fE2.zza();
            interfaceC19835fE2.mo31332d(zza, this, zzioVar);
            interfaceC19835fE2.zzc(zza);
            if (this.f7912b == this.f7913c) {
                return zza;
            }
            throw zzjk.zzg();
        } finally {
            this.f7913c = i;
        }
    }

    /* renamed from: D */
    private final void m65281D(int i) {
        if (this.f7911a.zzu() == i) {
            return;
        }
        throw zzjk.zza();
    }

    /* renamed from: w */
    public static Yw2 m65280w(zzif zzifVar) {
        Yw2 yw2 = zzifVar.f47617d;
        if (yw2 != null) {
            return yw2;
        }
        return new Yw2(zzifVar);
    }

    /* renamed from: x */
    private final void m65279x(int i) {
        if ((this.f7912b & 7) == i) {
            return;
        }
        throw zzjk.zzf();
    }

    /* renamed from: y */
    private final void m65278y(List list, boolean z) {
        String zzl;
        int zza;
        int zza2;
        if ((this.f7912b & 7) == 2) {
            if ((list instanceof zzjv) && !z) {
                zzjv zzjvVar = (zzjv) list;
                do {
                    zzjvVar.zza(zzn());
                    if (this.f7911a.zzt()) {
                        return;
                    }
                    zza2 = this.f7911a.zza();
                } while (zza2 == this.f7912b);
                this.f7914d = zza2;
                return;
            }
            do {
                if (z) {
                    zzl = zzm();
                } else {
                    zzl = zzl();
                }
                list.add(zzl);
                if (this.f7911a.zzt()) {
                    return;
                }
                zza = this.f7911a.zza();
            } while (zza == this.f7912b);
            this.f7914d = zza;
            return;
        }
        throw zzjk.zzf();
    }

    /* renamed from: z */
    private static void m65277z(int i) {
        if ((i & 7) == 0) {
            return;
        }
        throw zzjk.zzg();
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: a */
    public final void mo29276a(List list, InterfaceC19835fE2 interfaceC19835fE2, zzio zzioVar) {
        int zza;
        int i = this.f7912b;
        if ((i & 7) == 2) {
            do {
                list.add(m65284A(interfaceC19835fE2, zzioVar));
                if (!this.f7911a.zzt() && this.f7914d == 0) {
                    zza = this.f7911a.zza();
                } else {
                    return;
                }
            } while (zza == i);
            this.f7914d = zza;
            return;
        }
        throw zzjk.zzf();
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: b */
    public final void mo29275b(Map map, AbstractC21033mC2 abstractC21033mC2, zzio zzioVar) {
        m65279x(2);
        this.f7911a.zzc(this.f7911a.zzm());
        throw null;
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: c */
    public final Object mo29274c(InterfaceC19835fE2 interfaceC19835fE2, zzio zzioVar) {
        m65279x(2);
        return m65284A(interfaceC19835fE2, zzioVar);
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: d */
    public final void mo29273d(List list) {
        int zza;
        int zza2;
        if (list instanceof Oz2) {
            Oz2 oz2 = (Oz2) list;
            int i = this.f7912b & 7;
            if (i != 0) {
                if (i == 2) {
                    int zzu = this.f7911a.zzu() + this.f7911a.zzm();
                    do {
                        oz2.m66936b(this.f7911a.zzq());
                    } while (this.f7911a.zzu() < zzu);
                    m65281D(zzu);
                    return;
                }
                throw zzjk.zzf();
            }
            do {
                oz2.m66936b(this.f7911a.zzq());
                if (this.f7911a.zzt()) {
                    return;
                }
                zza2 = this.f7911a.zza();
            } while (zza2 == this.f7912b);
            this.f7914d = zza2;
            return;
        }
        int i2 = this.f7912b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int zzu2 = this.f7911a.zzu() + this.f7911a.zzm();
                do {
                    list.add(Integer.valueOf(this.f7911a.zzq()));
                } while (this.f7911a.zzu() < zzu2);
                m65281D(zzu2);
                return;
            }
            throw zzjk.zzf();
        }
        do {
            list.add(Integer.valueOf(this.f7911a.zzq()));
            if (this.f7911a.zzt()) {
                return;
            }
            zza = this.f7911a.zza();
        } while (zza == this.f7912b);
        this.f7914d = zza;
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: e */
    public final void mo29272e(List list) {
        int zza;
        if (list instanceof AbstractC22922xB2) {
            AbstractC22494uj2.m1214a(list);
            int i = this.f7912b & 7;
            if (i != 1) {
                if (i != 2) {
                    throw zzjk.zzf();
                }
                m65277z(this.f7911a.zzm());
                this.f7911a.zzu();
                this.f7911a.zzp();
                throw null;
            }
            this.f7911a.zzp();
            throw null;
        }
        int i2 = this.f7912b & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int zzm = this.f7911a.zzm();
                m65277z(zzm);
                int zzu = this.f7911a.zzu() + zzm;
                do {
                    list.add(Long.valueOf(this.f7911a.zzp()));
                } while (this.f7911a.zzu() < zzu);
                return;
            }
            throw zzjk.zzf();
        }
        do {
            list.add(Long.valueOf(this.f7911a.zzp()));
            if (this.f7911a.zzt()) {
                return;
            }
            zza = this.f7911a.zza();
        } while (zza == this.f7912b);
        this.f7914d = zza;
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: f */
    public final Object mo29271f(InterfaceC19835fE2 interfaceC19835fE2, zzio zzioVar) {
        m65279x(3);
        return m65282C(interfaceC19835fE2, zzioVar);
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: g */
    public final void mo29270g(List list) {
        int zza;
        if (list instanceof AbstractC22922xB2) {
            AbstractC22494uj2.m1214a(list);
            int i = this.f7912b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zzjk.zzf();
                }
                this.f7911a.zzm();
                this.f7911a.zzu();
                this.f7911a.zzr();
                throw null;
            }
            this.f7911a.zzr();
            throw null;
        }
        int i2 = this.f7912b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int zzu = this.f7911a.zzu() + this.f7911a.zzm();
                do {
                    list.add(Long.valueOf(this.f7911a.zzr()));
                } while (this.f7911a.zzu() < zzu);
                m65281D(zzu);
                return;
            }
            throw zzjk.zzf();
        }
        do {
            list.add(Long.valueOf(this.f7911a.zzr()));
            if (this.f7911a.zzt()) {
                return;
            }
            zza = this.f7911a.zza();
        } while (zza == this.f7912b);
        this.f7914d = zza;
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: h */
    public final void mo29269h(List list) {
        int zza;
        int zza2;
        if (list instanceof Oz2) {
            Oz2 oz2 = (Oz2) list;
            int i = this.f7912b & 7;
            if (i != 0) {
                if (i == 2) {
                    int zzu = this.f7911a.zzu() + this.f7911a.zzm();
                    do {
                        oz2.m66936b(this.f7911a.zzm());
                    } while (this.f7911a.zzu() < zzu);
                    m65281D(zzu);
                    return;
                }
                throw zzjk.zzf();
            }
            do {
                oz2.m66936b(this.f7911a.zzm());
                if (this.f7911a.zzt()) {
                    return;
                }
                zza2 = this.f7911a.zza();
            } while (zza2 == this.f7912b);
            this.f7914d = zza2;
            return;
        }
        int i2 = this.f7912b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int zzu2 = this.f7911a.zzu() + this.f7911a.zzm();
                do {
                    list.add(Integer.valueOf(this.f7911a.zzm()));
                } while (this.f7911a.zzu() < zzu2);
                m65281D(zzu2);
                return;
            }
            throw zzjk.zzf();
        }
        do {
            list.add(Integer.valueOf(this.f7911a.zzm()));
            if (this.f7911a.zzt()) {
                return;
            }
            zza = this.f7911a.zza();
        } while (zza == this.f7912b);
        this.f7914d = zza;
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: i */
    public final void mo29268i(List list) {
        int zza;
        if ((this.f7912b & 7) == 2) {
            do {
                list.add(zzn());
                if (this.f7911a.zzt()) {
                    return;
                }
                zza = this.f7911a.zza();
            } while (zza == this.f7912b);
            this.f7914d = zza;
            return;
        }
        throw zzjk.zzf();
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: j */
    public final void mo29267j(List list) {
        int zza;
        int zza2;
        if (list instanceof Oz2) {
            Oz2 oz2 = (Oz2) list;
            int i = this.f7912b & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        oz2.m66936b(this.f7911a.zzo());
                        if (this.f7911a.zzt()) {
                            return;
                        }
                        zza2 = this.f7911a.zza();
                    } while (zza2 == this.f7912b);
                    this.f7914d = zza2;
                    return;
                }
                throw zzjk.zzf();
            }
            int zzm = this.f7911a.zzm();
            m65283B(zzm);
            int zzu = this.f7911a.zzu() + zzm;
            do {
                oz2.m66936b(this.f7911a.zzo());
            } while (this.f7911a.zzu() < zzu);
            return;
        }
        int i2 = this.f7912b & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f7911a.zzo()));
                    if (this.f7911a.zzt()) {
                        return;
                    }
                    zza = this.f7911a.zza();
                } while (zza == this.f7912b);
                this.f7914d = zza;
                return;
            }
            throw zzjk.zzf();
        }
        int zzm2 = this.f7911a.zzm();
        m65283B(zzm2);
        int zzu2 = this.f7911a.zzu() + zzm2;
        do {
            list.add(Integer.valueOf(this.f7911a.zzo()));
        } while (this.f7911a.zzu() < zzu2);
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: k */
    public final void mo29266k(List list, InterfaceC19835fE2 interfaceC19835fE2, zzio zzioVar) {
        int zza;
        int i = this.f7912b;
        if ((i & 7) == 3) {
            do {
                list.add(m65282C(interfaceC19835fE2, zzioVar));
                if (!this.f7911a.zzt() && this.f7914d == 0) {
                    zza = this.f7911a.zza();
                } else {
                    return;
                }
            } while (zza == i);
            this.f7914d = zza;
            return;
        }
        throw zzjk.zzf();
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: l */
    public final void mo29265l(List list) {
        int zza;
        int zza2;
        if (list instanceof Oz2) {
            Oz2 oz2 = (Oz2) list;
            int i = this.f7912b & 7;
            if (i != 0) {
                if (i == 2) {
                    int zzu = this.f7911a.zzu() + this.f7911a.zzm();
                    do {
                        oz2.m66936b(this.f7911a.zzn());
                    } while (this.f7911a.zzu() < zzu);
                    m65281D(zzu);
                    return;
                }
                throw zzjk.zzf();
            }
            do {
                oz2.m66936b(this.f7911a.zzn());
                if (this.f7911a.zzt()) {
                    return;
                }
                zza2 = this.f7911a.zza();
            } while (zza2 == this.f7912b);
            this.f7914d = zza2;
            return;
        }
        int i2 = this.f7912b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int zzu2 = this.f7911a.zzu() + this.f7911a.zzm();
                do {
                    list.add(Integer.valueOf(this.f7911a.zzn()));
                } while (this.f7911a.zzu() < zzu2);
                m65281D(zzu2);
                return;
            }
            throw zzjk.zzf();
        }
        do {
            list.add(Integer.valueOf(this.f7911a.zzn()));
            if (this.f7911a.zzt()) {
                return;
            }
            zza = this.f7911a.zza();
        } while (zza == this.f7912b);
        this.f7914d = zza;
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: m */
    public final void mo29264m(List list) {
        int zza;
        if (list instanceof AbstractC20638jv2) {
            AbstractC22494uj2.m1214a(list);
            int i = this.f7912b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zzjk.zzf();
                }
                this.f7911a.zzm();
                this.f7911a.zzu();
                this.f7911a.zzi();
                throw null;
            }
            this.f7911a.zzi();
            throw null;
        }
        int i2 = this.f7912b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int zzu = this.f7911a.zzu() + this.f7911a.zzm();
                do {
                    list.add(Boolean.valueOf(this.f7911a.zzi()));
                } while (this.f7911a.zzu() < zzu);
                m65281D(zzu);
                return;
            }
            throw zzjk.zzf();
        }
        do {
            list.add(Boolean.valueOf(this.f7911a.zzi()));
            if (this.f7911a.zzt()) {
                return;
            }
            zza = this.f7911a.zza();
        } while (zza == this.f7912b);
        this.f7914d = zza;
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: n */
    public final void mo29263n(List list) {
        int zza;
        int zza2;
        if (list instanceof Oz2) {
            Oz2 oz2 = (Oz2) list;
            int i = this.f7912b & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        oz2.m66936b(this.f7911a.zzh());
                        if (this.f7911a.zzt()) {
                            return;
                        }
                        zza2 = this.f7911a.zza();
                    } while (zza2 == this.f7912b);
                    this.f7914d = zza2;
                    return;
                }
                throw zzjk.zzf();
            }
            int zzm = this.f7911a.zzm();
            m65283B(zzm);
            int zzu = this.f7911a.zzu() + zzm;
            do {
                oz2.m66936b(this.f7911a.zzh());
            } while (this.f7911a.zzu() < zzu);
            return;
        }
        int i2 = this.f7912b & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f7911a.zzh()));
                    if (this.f7911a.zzt()) {
                        return;
                    }
                    zza = this.f7911a.zza();
                } while (zza == this.f7912b);
                this.f7914d = zza;
                return;
            }
            throw zzjk.zzf();
        }
        int zzm2 = this.f7911a.zzm();
        m65283B(zzm2);
        int zzu2 = this.f7911a.zzu() + zzm2;
        do {
            list.add(Integer.valueOf(this.f7911a.zzh()));
        } while (this.f7911a.zzu() < zzu2);
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: o */
    public final void mo29262o(List list) {
        int zza;
        if (list instanceof AbstractC22922xB2) {
            AbstractC22494uj2.m1214a(list);
            int i = this.f7912b & 7;
            if (i != 1) {
                if (i != 2) {
                    throw zzjk.zzf();
                }
                m65277z(this.f7911a.zzm());
                this.f7911a.zzu();
                this.f7911a.zzg();
                throw null;
            }
            this.f7911a.zzg();
            throw null;
        }
        int i2 = this.f7912b & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int zzm = this.f7911a.zzm();
                m65277z(zzm);
                int zzu = this.f7911a.zzu() + zzm;
                do {
                    list.add(Long.valueOf(this.f7911a.zzg()));
                } while (this.f7911a.zzu() < zzu);
                return;
            }
            throw zzjk.zzf();
        }
        do {
            list.add(Long.valueOf(this.f7911a.zzg()));
            if (this.f7911a.zzt()) {
                return;
            }
            zza = this.f7911a.zza();
        } while (zza == this.f7912b);
        this.f7914d = zza;
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: p */
    public final void mo29261p(List list) {
        m65278y(list, true);
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: q */
    public final void mo29260q(List list) {
        m65278y(list, false);
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: r */
    public final void mo29259r(List list) {
        int zza;
        if (list instanceof AbstractC22922xB2) {
            AbstractC22494uj2.m1214a(list);
            int i = this.f7912b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zzjk.zzf();
                }
                this.f7911a.zzm();
                this.f7911a.zzu();
                this.f7911a.zzd();
                throw null;
            }
            this.f7911a.zzd();
            throw null;
        }
        int i2 = this.f7912b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int zzu = this.f7911a.zzu() + this.f7911a.zzm();
                do {
                    list.add(Long.valueOf(this.f7911a.zzd()));
                } while (this.f7911a.zzu() < zzu);
                m65281D(zzu);
                return;
            }
            throw zzjk.zzf();
        }
        do {
            list.add(Long.valueOf(this.f7911a.zzd()));
            if (this.f7911a.zzt()) {
                return;
            }
            zza = this.f7911a.zza();
        } while (zza == this.f7912b);
        this.f7914d = zza;
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: s */
    public final void mo29258s(List list) {
        int zza;
        if (list instanceof AbstractC23230yz2) {
            AbstractC22494uj2.m1214a(list);
            int i = this.f7912b & 7;
            if (i != 2) {
                if (i != 5) {
                    throw zzjk.zzf();
                }
                this.f7911a.zzc();
                throw null;
            }
            m65283B(this.f7911a.zzm());
            this.f7911a.zzu();
            this.f7911a.zzc();
            throw null;
        }
        int i2 = this.f7912b & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.f7911a.zzc()));
                    if (this.f7911a.zzt()) {
                        return;
                    }
                    zza = this.f7911a.zza();
                } while (zza == this.f7912b);
                this.f7914d = zza;
                return;
            }
            throw zzjk.zzf();
        }
        int zzm = this.f7911a.zzm();
        m65283B(zzm);
        int zzu = this.f7911a.zzu() + zzm;
        do {
            list.add(Float.valueOf(this.f7911a.zzc()));
        } while (this.f7911a.zzu() < zzu);
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: t */
    public final Object mo29257t(Class cls, zzio zzioVar) {
        m65279x(3);
        return m65282C(DD2.m68673a().m68672b(cls), zzioVar);
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: u */
    public final Object mo29256u(Class cls, zzio zzioVar) {
        m65279x(2);
        return m65284A(DD2.m68673a().m68672b(cls), zzioVar);
    }

    @Override // p000.InterfaceC20523jE2
    /* renamed from: v */
    public final void mo29255v(List list) {
        int zza;
        if (list instanceof AbstractC22922xB2) {
            AbstractC22494uj2.m1214a(list);
            int i = this.f7912b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zzjk.zzf();
                }
                this.f7911a.zzm();
                this.f7911a.zzu();
                this.f7911a.zze();
                throw null;
            }
            this.f7911a.zze();
            throw null;
        }
        int i2 = this.f7912b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int zzu = this.f7911a.zzu() + this.f7911a.zzm();
                do {
                    list.add(Long.valueOf(this.f7911a.zze()));
                } while (this.f7911a.zzu() < zzu);
                m65281D(zzu);
                return;
            }
            throw zzjk.zzf();
        }
        do {
            list.add(Long.valueOf(this.f7911a.zze()));
            if (this.f7911a.zzt()) {
                return;
            }
            zza = this.f7911a.zza();
        } while (zza == this.f7912b);
        this.f7914d = zza;
    }

    @Override // p000.InterfaceC20523jE2
    public final int zza() {
        int i = this.f7914d;
        if (i != 0) {
            this.f7912b = i;
            this.f7914d = 0;
        } else {
            this.f7912b = this.f7911a.zza();
        }
        int i2 = this.f7912b;
        if (i2 == 0 || i2 == this.f7913c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    @Override // p000.InterfaceC20523jE2
    public final int zzb() {
        return this.f7912b;
    }

    @Override // p000.InterfaceC20523jE2
    public final boolean zzc() {
        int i;
        if (!this.f7911a.zzt() && (i = this.f7912b) != this.f7913c) {
            return this.f7911a.zzb(i);
        }
        return false;
    }

    @Override // p000.InterfaceC20523jE2
    public final double zzd() {
        m65279x(1);
        return this.f7911a.zzb();
    }

    @Override // p000.InterfaceC20523jE2
    public final float zze() {
        m65279x(5);
        return this.f7911a.zzc();
    }

    @Override // p000.InterfaceC20523jE2
    public final long zzf() {
        m65279x(0);
        return this.f7911a.zzd();
    }

    @Override // p000.InterfaceC20523jE2
    public final long zzg() {
        m65279x(0);
        return this.f7911a.zze();
    }

    @Override // p000.InterfaceC20523jE2
    public final int zzh() {
        m65279x(0);
        return this.f7911a.zzf();
    }

    @Override // p000.InterfaceC20523jE2
    public final long zzi() {
        m65279x(1);
        return this.f7911a.zzg();
    }

    @Override // p000.InterfaceC20523jE2
    public final int zzj() {
        m65279x(5);
        return this.f7911a.zzh();
    }

    @Override // p000.InterfaceC20523jE2
    public final boolean zzk() {
        m65279x(0);
        return this.f7911a.zzi();
    }

    @Override // p000.InterfaceC20523jE2
    public final String zzl() {
        m65279x(2);
        return this.f7911a.zzj();
    }

    @Override // p000.InterfaceC20523jE2
    public final String zzm() {
        m65279x(2);
        return this.f7911a.zzk();
    }

    @Override // p000.InterfaceC20523jE2
    public final zzht zzn() {
        m65279x(2);
        return this.f7911a.zzl();
    }

    @Override // p000.InterfaceC20523jE2
    public final int zzo() {
        m65279x(0);
        return this.f7911a.zzm();
    }

    @Override // p000.InterfaceC20523jE2
    public final int zzp() {
        m65279x(0);
        return this.f7911a.zzn();
    }

    @Override // p000.InterfaceC20523jE2
    public final int zzq() {
        m65279x(5);
        return this.f7911a.zzo();
    }

    @Override // p000.InterfaceC20523jE2
    public final long zzr() {
        m65279x(1);
        return this.f7911a.zzp();
    }

    @Override // p000.InterfaceC20523jE2
    public final int zzs() {
        m65279x(0);
        return this.f7911a.zzq();
    }

    @Override // p000.InterfaceC20523jE2
    public final long zzt() {
        m65279x(0);
        return this.f7911a.zzr();
    }

    @Override // p000.InterfaceC20523jE2
    public final void zze(List list) {
        int zza;
        int zza2;
        if (list instanceof Oz2) {
            Oz2 oz2 = (Oz2) list;
            int i = this.f7912b & 7;
            if (i == 0) {
                do {
                    oz2.m66936b(this.f7911a.zzf());
                    if (this.f7911a.zzt()) {
                        return;
                    }
                    zza2 = this.f7911a.zza();
                } while (zza2 == this.f7912b);
                this.f7914d = zza2;
                return;
            } else if (i == 2) {
                int zzu = this.f7911a.zzu() + this.f7911a.zzm();
                do {
                    oz2.m66936b(this.f7911a.zzf());
                } while (this.f7911a.zzu() < zzu);
                m65281D(zzu);
                return;
            } else {
                throw zzjk.zzf();
            }
        }
        int i2 = this.f7912b & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.f7911a.zzf()));
                if (this.f7911a.zzt()) {
                    return;
                }
                zza = this.f7911a.zza();
            } while (zza == this.f7912b);
            this.f7914d = zza;
        } else if (i2 == 2) {
            int zzu2 = this.f7911a.zzu() + this.f7911a.zzm();
            do {
                list.add(Integer.valueOf(this.f7911a.zzf()));
            } while (this.f7911a.zzu() < zzu2);
            m65281D(zzu2);
        } else {
            throw zzjk.zzf();
        }
    }

    @Override // p000.InterfaceC20523jE2
    public final void zza(List list) {
        int zza;
        if (list instanceof Nx2) {
            AbstractC22494uj2.m1214a(list);
            int i = this.f7912b & 7;
            if (i == 1) {
                this.f7911a.zzb();
                throw null;
            } else if (i != 2) {
                throw zzjk.zzf();
            } else {
                m65277z(this.f7911a.zzm());
                this.f7911a.zzu();
                this.f7911a.zzb();
                throw null;
            }
        }
        int i2 = this.f7912b & 7;
        if (i2 == 1) {
            do {
                list.add(Double.valueOf(this.f7911a.zzb()));
                if (this.f7911a.zzt()) {
                    return;
                }
                zza = this.f7911a.zza();
            } while (zza == this.f7912b);
            this.f7914d = zza;
        } else if (i2 == 2) {
            int zzm = this.f7911a.zzm();
            m65277z(zzm);
            int zzu = this.f7911a.zzu() + zzm;
            do {
                list.add(Double.valueOf(this.f7911a.zzb()));
            } while (this.f7911a.zzu() < zzu);
        } else {
            throw zzjk.zzf();
        }
    }
}
