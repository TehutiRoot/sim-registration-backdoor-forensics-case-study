package p000;

import com.google.android.gms.internal.vision.zzht;
import com.google.android.gms.internal.vision.zzif;
import com.google.android.gms.internal.vision.zzio;
import com.google.android.gms.internal.vision.zzjf;
import com.google.android.gms.internal.vision.zzjk;
import com.google.android.gms.internal.vision.zzjv;
import java.util.List;
import java.util.Map;

/* renamed from: Vx2 */
/* loaded from: classes3.dex */
public final class Vx2 implements InterfaceC20062gF2 {

    /* renamed from: a */
    public final zzif f7144a;

    /* renamed from: b */
    public int f7145b;

    /* renamed from: c */
    public int f7146c;

    /* renamed from: d */
    public int f7147d = 0;

    public Vx2(zzif zzifVar) {
        zzif zzifVar2 = (zzif) zzjf.m46404d(zzifVar, "input");
        this.f7144a = zzifVar2;
        zzifVar2.f47629d = this;
    }

    /* renamed from: A */
    private final Object m65845A(InterfaceC19370cF2 interfaceC19370cF2, zzio zzioVar) {
        zzif zzifVar;
        int zzm = this.f7144a.zzm();
        zzif zzifVar2 = this.f7144a;
        if (zzifVar2.f47626a < zzifVar2.f47627b) {
            int zzc = zzifVar2.zzc(zzm);
            Object zza = interfaceC19370cF2.zza();
            this.f7144a.f47626a++;
            interfaceC19370cF2.mo46597d(zza, this, zzioVar);
            interfaceC19370cF2.zzc(zza);
            this.f7144a.zza(0);
            zzifVar.f47626a--;
            this.f7144a.zzd(zzc);
            return zza;
        }
        throw new zzjk("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: B */
    private static void m65844B(int i) {
        if ((i & 3) == 0) {
            return;
        }
        throw zzjk.zzg();
    }

    /* renamed from: C */
    private final Object m65843C(InterfaceC19370cF2 interfaceC19370cF2, zzio zzioVar) {
        int i = this.f7146c;
        this.f7146c = ((this.f7145b >>> 3) << 3) | 4;
        try {
            Object zza = interfaceC19370cF2.zza();
            interfaceC19370cF2.mo46597d(zza, this, zzioVar);
            interfaceC19370cF2.zzc(zza);
            if (this.f7145b == this.f7146c) {
                return zza;
            }
            throw zzjk.zzg();
        } finally {
            this.f7146c = i;
        }
    }

    /* renamed from: D */
    private final void m65842D(int i) {
        if (this.f7144a.zzu() == i) {
            return;
        }
        throw zzjk.zza();
    }

    /* renamed from: w */
    public static Vx2 m65841w(zzif zzifVar) {
        Vx2 vx2 = zzifVar.f47629d;
        if (vx2 != null) {
            return vx2;
        }
        return new Vx2(zzifVar);
    }

    /* renamed from: x */
    private final void m65840x(int i) {
        if ((this.f7145b & 7) == i) {
            return;
        }
        throw zzjk.zzf();
    }

    /* renamed from: y */
    private final void m65839y(List list, boolean z) {
        String zzl;
        int zza;
        int zza2;
        if ((this.f7145b & 7) == 2) {
            if ((list instanceof zzjv) && !z) {
                zzjv zzjvVar = (zzjv) list;
                do {
                    zzjvVar.zza(zzn());
                    if (this.f7144a.zzt()) {
                        return;
                    }
                    zza2 = this.f7144a.zza();
                } while (zza2 == this.f7145b);
                this.f7147d = zza2;
                return;
            }
            do {
                if (z) {
                    zzl = zzm();
                } else {
                    zzl = zzl();
                }
                list.add(zzl);
                if (this.f7144a.zzt()) {
                    return;
                }
                zza = this.f7144a.zza();
            } while (zza == this.f7145b);
            this.f7147d = zza;
            return;
        }
        throw zzjk.zzf();
    }

    /* renamed from: z */
    private static void m65838z(int i) {
        if ((i & 7) == 0) {
            return;
        }
        throw zzjk.zzg();
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: a */
    public final void mo31422a(List list, InterfaceC19370cF2 interfaceC19370cF2, zzio zzioVar) {
        int zza;
        int i = this.f7145b;
        if ((i & 7) == 2) {
            do {
                list.add(m65845A(interfaceC19370cF2, zzioVar));
                if (!this.f7144a.zzt() && this.f7147d == 0) {
                    zza = this.f7144a.zza();
                } else {
                    return;
                }
            } while (zza == i);
            this.f7147d = zza;
            return;
        }
        throw zzjk.zzf();
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: b */
    public final void mo31421b(Map map, AbstractC20575jD2 abstractC20575jD2, zzio zzioVar) {
        m65840x(2);
        this.f7144a.zzc(this.f7144a.zzm());
        throw null;
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: c */
    public final Object mo31420c(InterfaceC19370cF2 interfaceC19370cF2, zzio zzioVar) {
        m65840x(2);
        return m65845A(interfaceC19370cF2, zzioVar);
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: d */
    public final void mo31419d(List list) {
        int zza;
        int zza2;
        if (list instanceof LA2) {
            LA2 la2 = (LA2) list;
            int i = this.f7145b & 7;
            if (i != 0) {
                if (i == 2) {
                    int zzu = this.f7144a.zzu() + this.f7144a.zzm();
                    do {
                        la2.m67617b(this.f7144a.zzq());
                    } while (this.f7144a.zzu() < zzu);
                    m65842D(zzu);
                    return;
                }
                throw zzjk.zzf();
            }
            do {
                la2.m67617b(this.f7144a.zzq());
                if (this.f7144a.zzt()) {
                    return;
                }
                zza2 = this.f7144a.zza();
            } while (zza2 == this.f7145b);
            this.f7147d = zza2;
            return;
        }
        int i2 = this.f7145b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int zzu2 = this.f7144a.zzu() + this.f7144a.zzm();
                do {
                    list.add(Integer.valueOf(this.f7144a.zzq()));
                } while (this.f7144a.zzu() < zzu2);
                m65842D(zzu2);
                return;
            }
            throw zzjk.zzf();
        }
        do {
            list.add(Integer.valueOf(this.f7144a.zzq()));
            if (this.f7144a.zzt()) {
                return;
            }
            zza = this.f7144a.zza();
        } while (zza == this.f7145b);
        this.f7147d = zza;
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: e */
    public final void mo31418e(List list) {
        int zza;
        if (list instanceof AbstractC22475uC2) {
            AbstractC22045rk2.m23445a(list);
            int i = this.f7145b & 7;
            if (i != 1) {
                if (i != 2) {
                    throw zzjk.zzf();
                }
                m65838z(this.f7144a.zzm());
                this.f7144a.zzu();
                this.f7144a.zzp();
                throw null;
            }
            this.f7144a.zzp();
            throw null;
        }
        int i2 = this.f7145b & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int zzm = this.f7144a.zzm();
                m65838z(zzm);
                int zzu = this.f7144a.zzu() + zzm;
                do {
                    list.add(Long.valueOf(this.f7144a.zzp()));
                } while (this.f7144a.zzu() < zzu);
                return;
            }
            throw zzjk.zzf();
        }
        do {
            list.add(Long.valueOf(this.f7144a.zzp()));
            if (this.f7144a.zzt()) {
                return;
            }
            zza = this.f7144a.zza();
        } while (zza == this.f7145b);
        this.f7147d = zza;
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: f */
    public final Object mo31417f(InterfaceC19370cF2 interfaceC19370cF2, zzio zzioVar) {
        m65840x(3);
        return m65843C(interfaceC19370cF2, zzioVar);
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: g */
    public final void mo31416g(List list) {
        int zza;
        if (list instanceof AbstractC22475uC2) {
            AbstractC22045rk2.m23445a(list);
            int i = this.f7145b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zzjk.zzf();
                }
                this.f7144a.zzm();
                this.f7144a.zzu();
                this.f7144a.zzr();
                throw null;
            }
            this.f7144a.zzr();
            throw null;
        }
        int i2 = this.f7145b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int zzu = this.f7144a.zzu() + this.f7144a.zzm();
                do {
                    list.add(Long.valueOf(this.f7144a.zzr()));
                } while (this.f7144a.zzu() < zzu);
                m65842D(zzu);
                return;
            }
            throw zzjk.zzf();
        }
        do {
            list.add(Long.valueOf(this.f7144a.zzr()));
            if (this.f7144a.zzt()) {
                return;
            }
            zza = this.f7144a.zza();
        } while (zza == this.f7145b);
        this.f7147d = zza;
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: h */
    public final void mo31415h(List list) {
        int zza;
        int zza2;
        if (list instanceof LA2) {
            LA2 la2 = (LA2) list;
            int i = this.f7145b & 7;
            if (i != 0) {
                if (i == 2) {
                    int zzu = this.f7144a.zzu() + this.f7144a.zzm();
                    do {
                        la2.m67617b(this.f7144a.zzm());
                    } while (this.f7144a.zzu() < zzu);
                    m65842D(zzu);
                    return;
                }
                throw zzjk.zzf();
            }
            do {
                la2.m67617b(this.f7144a.zzm());
                if (this.f7144a.zzt()) {
                    return;
                }
                zza2 = this.f7144a.zza();
            } while (zza2 == this.f7145b);
            this.f7147d = zza2;
            return;
        }
        int i2 = this.f7145b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int zzu2 = this.f7144a.zzu() + this.f7144a.zzm();
                do {
                    list.add(Integer.valueOf(this.f7144a.zzm()));
                } while (this.f7144a.zzu() < zzu2);
                m65842D(zzu2);
                return;
            }
            throw zzjk.zzf();
        }
        do {
            list.add(Integer.valueOf(this.f7144a.zzm()));
            if (this.f7144a.zzt()) {
                return;
            }
            zza = this.f7144a.zza();
        } while (zza == this.f7145b);
        this.f7147d = zza;
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: i */
    public final void mo31414i(List list) {
        int zza;
        if ((this.f7145b & 7) == 2) {
            do {
                list.add(zzn());
                if (this.f7144a.zzt()) {
                    return;
                }
                zza = this.f7144a.zza();
            } while (zza == this.f7145b);
            this.f7147d = zza;
            return;
        }
        throw zzjk.zzf();
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: j */
    public final void mo31413j(List list) {
        int zza;
        int zza2;
        if (list instanceof LA2) {
            LA2 la2 = (LA2) list;
            int i = this.f7145b & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        la2.m67617b(this.f7144a.zzo());
                        if (this.f7144a.zzt()) {
                            return;
                        }
                        zza2 = this.f7144a.zza();
                    } while (zza2 == this.f7145b);
                    this.f7147d = zza2;
                    return;
                }
                throw zzjk.zzf();
            }
            int zzm = this.f7144a.zzm();
            m65844B(zzm);
            int zzu = this.f7144a.zzu() + zzm;
            do {
                la2.m67617b(this.f7144a.zzo());
            } while (this.f7144a.zzu() < zzu);
            return;
        }
        int i2 = this.f7145b & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f7144a.zzo()));
                    if (this.f7144a.zzt()) {
                        return;
                    }
                    zza = this.f7144a.zza();
                } while (zza == this.f7145b);
                this.f7147d = zza;
                return;
            }
            throw zzjk.zzf();
        }
        int zzm2 = this.f7144a.zzm();
        m65844B(zzm2);
        int zzu2 = this.f7144a.zzu() + zzm2;
        do {
            list.add(Integer.valueOf(this.f7144a.zzo()));
        } while (this.f7144a.zzu() < zzu2);
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: k */
    public final void mo31412k(List list, InterfaceC19370cF2 interfaceC19370cF2, zzio zzioVar) {
        int zza;
        int i = this.f7145b;
        if ((i & 7) == 3) {
            do {
                list.add(m65843C(interfaceC19370cF2, zzioVar));
                if (!this.f7144a.zzt() && this.f7147d == 0) {
                    zza = this.f7144a.zza();
                } else {
                    return;
                }
            } while (zza == i);
            this.f7147d = zza;
            return;
        }
        throw zzjk.zzf();
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: l */
    public final void mo31411l(List list) {
        int zza;
        int zza2;
        if (list instanceof LA2) {
            LA2 la2 = (LA2) list;
            int i = this.f7145b & 7;
            if (i != 0) {
                if (i == 2) {
                    int zzu = this.f7144a.zzu() + this.f7144a.zzm();
                    do {
                        la2.m67617b(this.f7144a.zzn());
                    } while (this.f7144a.zzu() < zzu);
                    m65842D(zzu);
                    return;
                }
                throw zzjk.zzf();
            }
            do {
                la2.m67617b(this.f7144a.zzn());
                if (this.f7144a.zzt()) {
                    return;
                }
                zza2 = this.f7144a.zza();
            } while (zza2 == this.f7145b);
            this.f7147d = zza2;
            return;
        }
        int i2 = this.f7145b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int zzu2 = this.f7144a.zzu() + this.f7144a.zzm();
                do {
                    list.add(Integer.valueOf(this.f7144a.zzn()));
                } while (this.f7144a.zzu() < zzu2);
                m65842D(zzu2);
                return;
            }
            throw zzjk.zzf();
        }
        do {
            list.add(Integer.valueOf(this.f7144a.zzn()));
            if (this.f7144a.zzt()) {
                return;
            }
            zza = this.f7144a.zza();
        } while (zza == this.f7145b);
        this.f7147d = zza;
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: m */
    public final void mo31410m(List list) {
        int zza;
        if (list instanceof AbstractC20178gw2) {
            AbstractC22045rk2.m23445a(list);
            int i = this.f7145b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zzjk.zzf();
                }
                this.f7144a.zzm();
                this.f7144a.zzu();
                this.f7144a.zzi();
                throw null;
            }
            this.f7144a.zzi();
            throw null;
        }
        int i2 = this.f7145b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int zzu = this.f7144a.zzu() + this.f7144a.zzm();
                do {
                    list.add(Boolean.valueOf(this.f7144a.zzi()));
                } while (this.f7144a.zzu() < zzu);
                m65842D(zzu);
                return;
            }
            throw zzjk.zzf();
        }
        do {
            list.add(Boolean.valueOf(this.f7144a.zzi()));
            if (this.f7144a.zzt()) {
                return;
            }
            zza = this.f7144a.zza();
        } while (zza == this.f7145b);
        this.f7147d = zza;
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: n */
    public final void mo31409n(List list) {
        int zza;
        int zza2;
        if (list instanceof LA2) {
            LA2 la2 = (LA2) list;
            int i = this.f7145b & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        la2.m67617b(this.f7144a.zzh());
                        if (this.f7144a.zzt()) {
                            return;
                        }
                        zza2 = this.f7144a.zza();
                    } while (zza2 == this.f7145b);
                    this.f7147d = zza2;
                    return;
                }
                throw zzjk.zzf();
            }
            int zzm = this.f7144a.zzm();
            m65844B(zzm);
            int zzu = this.f7144a.zzu() + zzm;
            do {
                la2.m67617b(this.f7144a.zzh());
            } while (this.f7144a.zzu() < zzu);
            return;
        }
        int i2 = this.f7145b & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f7144a.zzh()));
                    if (this.f7144a.zzt()) {
                        return;
                    }
                    zza = this.f7144a.zza();
                } while (zza == this.f7145b);
                this.f7147d = zza;
                return;
            }
            throw zzjk.zzf();
        }
        int zzm2 = this.f7144a.zzm();
        m65844B(zzm2);
        int zzu2 = this.f7144a.zzu() + zzm2;
        do {
            list.add(Integer.valueOf(this.f7144a.zzh()));
        } while (this.f7144a.zzu() < zzu2);
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: o */
    public final void mo31408o(List list) {
        int zza;
        if (list instanceof AbstractC22475uC2) {
            AbstractC22045rk2.m23445a(list);
            int i = this.f7145b & 7;
            if (i != 1) {
                if (i != 2) {
                    throw zzjk.zzf();
                }
                m65838z(this.f7144a.zzm());
                this.f7144a.zzu();
                this.f7144a.zzg();
                throw null;
            }
            this.f7144a.zzg();
            throw null;
        }
        int i2 = this.f7145b & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int zzm = this.f7144a.zzm();
                m65838z(zzm);
                int zzu = this.f7144a.zzu() + zzm;
                do {
                    list.add(Long.valueOf(this.f7144a.zzg()));
                } while (this.f7144a.zzu() < zzu);
                return;
            }
            throw zzjk.zzf();
        }
        do {
            list.add(Long.valueOf(this.f7144a.zzg()));
            if (this.f7144a.zzt()) {
                return;
            }
            zza = this.f7144a.zza();
        } while (zza == this.f7145b);
        this.f7147d = zza;
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: p */
    public final void mo31407p(List list) {
        m65839y(list, true);
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: q */
    public final void mo31406q(List list) {
        m65839y(list, false);
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: r */
    public final void mo31405r(List list) {
        int zza;
        if (list instanceof AbstractC22475uC2) {
            AbstractC22045rk2.m23445a(list);
            int i = this.f7145b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zzjk.zzf();
                }
                this.f7144a.zzm();
                this.f7144a.zzu();
                this.f7144a.zzd();
                throw null;
            }
            this.f7144a.zzd();
            throw null;
        }
        int i2 = this.f7145b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int zzu = this.f7144a.zzu() + this.f7144a.zzm();
                do {
                    list.add(Long.valueOf(this.f7144a.zzd()));
                } while (this.f7144a.zzu() < zzu);
                m65842D(zzu);
                return;
            }
            throw zzjk.zzf();
        }
        do {
            list.add(Long.valueOf(this.f7144a.zzd()));
            if (this.f7144a.zzt()) {
                return;
            }
            zza = this.f7144a.zza();
        } while (zza == this.f7145b);
        this.f7147d = zza;
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: s */
    public final void mo31404s(List list) {
        int zza;
        if (list instanceof AbstractC22642vA2) {
            AbstractC22045rk2.m23445a(list);
            int i = this.f7145b & 7;
            if (i != 2) {
                if (i != 5) {
                    throw zzjk.zzf();
                }
                this.f7144a.zzc();
                throw null;
            }
            m65844B(this.f7144a.zzm());
            this.f7144a.zzu();
            this.f7144a.zzc();
            throw null;
        }
        int i2 = this.f7145b & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.f7144a.zzc()));
                    if (this.f7144a.zzt()) {
                        return;
                    }
                    zza = this.f7144a.zza();
                } while (zza == this.f7145b);
                this.f7147d = zza;
                return;
            }
            throw zzjk.zzf();
        }
        int zzm = this.f7144a.zzm();
        m65844B(zzm);
        int zzu = this.f7144a.zzu() + zzm;
        do {
            list.add(Float.valueOf(this.f7144a.zzc()));
        } while (this.f7144a.zzu() < zzu);
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: t */
    public final Object mo31403t(Class cls, zzio zzioVar) {
        m65840x(3);
        return m65843C(AE2.m69300a().m69299b(cls), zzioVar);
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: u */
    public final Object mo31402u(Class cls, zzio zzioVar) {
        m65840x(2);
        return m65845A(AE2.m69300a().m69299b(cls), zzioVar);
    }

    @Override // p000.InterfaceC20062gF2
    /* renamed from: v */
    public final void mo31401v(List list) {
        int zza;
        if (list instanceof AbstractC22475uC2) {
            AbstractC22045rk2.m23445a(list);
            int i = this.f7145b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw zzjk.zzf();
                }
                this.f7144a.zzm();
                this.f7144a.zzu();
                this.f7144a.zze();
                throw null;
            }
            this.f7144a.zze();
            throw null;
        }
        int i2 = this.f7145b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int zzu = this.f7144a.zzu() + this.f7144a.zzm();
                do {
                    list.add(Long.valueOf(this.f7144a.zze()));
                } while (this.f7144a.zzu() < zzu);
                m65842D(zzu);
                return;
            }
            throw zzjk.zzf();
        }
        do {
            list.add(Long.valueOf(this.f7144a.zze()));
            if (this.f7144a.zzt()) {
                return;
            }
            zza = this.f7144a.zza();
        } while (zza == this.f7145b);
        this.f7147d = zza;
    }

    @Override // p000.InterfaceC20062gF2
    public final int zza() {
        int i = this.f7147d;
        if (i != 0) {
            this.f7145b = i;
            this.f7147d = 0;
        } else {
            this.f7145b = this.f7144a.zza();
        }
        int i2 = this.f7145b;
        if (i2 == 0 || i2 == this.f7146c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    @Override // p000.InterfaceC20062gF2
    public final int zzb() {
        return this.f7145b;
    }

    @Override // p000.InterfaceC20062gF2
    public final boolean zzc() {
        int i;
        if (!this.f7144a.zzt() && (i = this.f7145b) != this.f7146c) {
            return this.f7144a.zzb(i);
        }
        return false;
    }

    @Override // p000.InterfaceC20062gF2
    public final double zzd() {
        m65840x(1);
        return this.f7144a.zzb();
    }

    @Override // p000.InterfaceC20062gF2
    public final float zze() {
        m65840x(5);
        return this.f7144a.zzc();
    }

    @Override // p000.InterfaceC20062gF2
    public final long zzf() {
        m65840x(0);
        return this.f7144a.zzd();
    }

    @Override // p000.InterfaceC20062gF2
    public final long zzg() {
        m65840x(0);
        return this.f7144a.zze();
    }

    @Override // p000.InterfaceC20062gF2
    public final int zzh() {
        m65840x(0);
        return this.f7144a.zzf();
    }

    @Override // p000.InterfaceC20062gF2
    public final long zzi() {
        m65840x(1);
        return this.f7144a.zzg();
    }

    @Override // p000.InterfaceC20062gF2
    public final int zzj() {
        m65840x(5);
        return this.f7144a.zzh();
    }

    @Override // p000.InterfaceC20062gF2
    public final boolean zzk() {
        m65840x(0);
        return this.f7144a.zzi();
    }

    @Override // p000.InterfaceC20062gF2
    public final String zzl() {
        m65840x(2);
        return this.f7144a.zzj();
    }

    @Override // p000.InterfaceC20062gF2
    public final String zzm() {
        m65840x(2);
        return this.f7144a.zzk();
    }

    @Override // p000.InterfaceC20062gF2
    public final zzht zzn() {
        m65840x(2);
        return this.f7144a.zzl();
    }

    @Override // p000.InterfaceC20062gF2
    public final int zzo() {
        m65840x(0);
        return this.f7144a.zzm();
    }

    @Override // p000.InterfaceC20062gF2
    public final int zzp() {
        m65840x(0);
        return this.f7144a.zzn();
    }

    @Override // p000.InterfaceC20062gF2
    public final int zzq() {
        m65840x(5);
        return this.f7144a.zzo();
    }

    @Override // p000.InterfaceC20062gF2
    public final long zzr() {
        m65840x(1);
        return this.f7144a.zzp();
    }

    @Override // p000.InterfaceC20062gF2
    public final int zzs() {
        m65840x(0);
        return this.f7144a.zzq();
    }

    @Override // p000.InterfaceC20062gF2
    public final long zzt() {
        m65840x(0);
        return this.f7144a.zzr();
    }

    @Override // p000.InterfaceC20062gF2
    public final void zze(List list) {
        int zza;
        int zza2;
        if (list instanceof LA2) {
            LA2 la2 = (LA2) list;
            int i = this.f7145b & 7;
            if (i == 0) {
                do {
                    la2.m67617b(this.f7144a.zzf());
                    if (this.f7144a.zzt()) {
                        return;
                    }
                    zza2 = this.f7144a.zza();
                } while (zza2 == this.f7145b);
                this.f7147d = zza2;
                return;
            } else if (i == 2) {
                int zzu = this.f7144a.zzu() + this.f7144a.zzm();
                do {
                    la2.m67617b(this.f7144a.zzf());
                } while (this.f7144a.zzu() < zzu);
                m65842D(zzu);
                return;
            } else {
                throw zzjk.zzf();
            }
        }
        int i2 = this.f7145b & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.f7144a.zzf()));
                if (this.f7144a.zzt()) {
                    return;
                }
                zza = this.f7144a.zza();
            } while (zza == this.f7145b);
            this.f7147d = zza;
        } else if (i2 == 2) {
            int zzu2 = this.f7144a.zzu() + this.f7144a.zzm();
            do {
                list.add(Integer.valueOf(this.f7144a.zzf()));
            } while (this.f7144a.zzu() < zzu2);
            m65842D(zzu2);
        } else {
            throw zzjk.zzf();
        }
    }

    @Override // p000.InterfaceC20062gF2
    public final void zza(List list) {
        int zza;
        if (list instanceof Ky2) {
            AbstractC22045rk2.m23445a(list);
            int i = this.f7145b & 7;
            if (i == 1) {
                this.f7144a.zzb();
                throw null;
            } else if (i != 2) {
                throw zzjk.zzf();
            } else {
                m65838z(this.f7144a.zzm());
                this.f7144a.zzu();
                this.f7144a.zzb();
                throw null;
            }
        }
        int i2 = this.f7145b & 7;
        if (i2 == 1) {
            do {
                list.add(Double.valueOf(this.f7144a.zzb()));
                if (this.f7144a.zzt()) {
                    return;
                }
                zza = this.f7144a.zza();
            } while (zza == this.f7145b);
            this.f7147d = zza;
        } else if (i2 == 2) {
            int zzm = this.f7144a.zzm();
            m65838z(zzm);
            int zzu = this.f7144a.zzu() + zzm;
            do {
                list.add(Double.valueOf(this.f7144a.zzb()));
            } while (this.f7144a.zzu() < zzu);
        } else {
            throw zzjk.zzf();
        }
    }
}