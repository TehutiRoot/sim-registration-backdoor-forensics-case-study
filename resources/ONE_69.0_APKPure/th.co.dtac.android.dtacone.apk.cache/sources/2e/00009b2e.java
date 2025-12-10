package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.C */
/* loaded from: classes3.dex */
public final class C6607C implements InterfaceC19370cF2 {

    /* renamed from: a */
    public final zzkk f47514a;

    /* renamed from: b */
    public final AbstractC22141sG2 f47515b;

    /* renamed from: c */
    public final boolean f47516c;

    /* renamed from: d */
    public final AbstractC19841ez2 f47517d;

    public C6607C(AbstractC22141sG2 abstractC22141sG2, AbstractC19841ez2 abstractC19841ez2, zzkk zzkkVar) {
        this.f47515b = abstractC22141sG2;
        this.f47516c = abstractC19841ez2.mo31563h(zzkkVar);
        this.f47517d = abstractC19841ez2;
        this.f47514a = zzkkVar;
    }

    /* renamed from: f */
    public static C6607C m46595f(AbstractC22141sG2 abstractC22141sG2, AbstractC19841ez2 abstractC19841ez2, zzkk zzkkVar) {
        return new C6607C(abstractC22141sG2, abstractC19841ez2, zzkkVar);
    }

    @Override // p000.InterfaceC19370cF2
    /* renamed from: a */
    public final boolean mo46600a(Object obj) {
        return this.f47517d.mo31567d(obj).m68340r();
    }

    @Override // p000.InterfaceC19370cF2
    /* renamed from: b */
    public final void mo46599b(Object obj, Object obj2) {
        AbstractC20581jF2.m29556p(this.f47515b, obj, obj2);
        if (this.f47516c) {
            AbstractC20581jF2.m29558n(this.f47517d, obj, obj2);
        }
    }

    @Override // p000.InterfaceC19370cF2
    /* renamed from: c */
    public final void mo46598c(Object obj, InterfaceC20590jI2 interfaceC20590jI2) {
        Iterator m68343o = this.f47517d.mo31567d(obj).m68343o();
        while (m68343o.hasNext()) {
            Map.Entry entry = (Map.Entry) m68343o.next();
            zziw zziwVar = (zziw) entry.getKey();
            if (zziwVar.zzc() == zzmo.MESSAGE && !zziwVar.zzd() && !zziwVar.zze()) {
                if (entry instanceof LB2) {
                    interfaceC20590jI2.mo16j(zziwVar.zza(), ((LB2) entry).m67613a().zzc());
                } else {
                    interfaceC20590jI2.mo16j(zziwVar.zza(), entry.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        AbstractC22141sG2 abstractC22141sG2 = this.f47515b;
        abstractC22141sG2.mo22840n(abstractC22141sG2.mo22843k(obj), interfaceC20590jI2);
    }

    @Override // p000.InterfaceC19370cF2
    /* renamed from: d */
    public final void mo46597d(Object obj, InterfaceC20062gF2 interfaceC20062gF2, zzio zzioVar) {
        boolean z;
        AbstractC22141sG2 abstractC22141sG2 = this.f47515b;
        AbstractC19841ez2 abstractC19841ez2 = this.f47517d;
        Object mo22839o = abstractC22141sG2.mo22839o(obj);
        Fz2 mo31562i = abstractC19841ez2.mo31562i(obj);
        do {
            try {
                if (interfaceC20062gF2.zza() == Integer.MAX_VALUE) {
                    abstractC22141sG2.mo22841m(obj, mo22839o);
                    return;
                }
                int zzb = interfaceC20062gF2.zzb();
                if (zzb != 11) {
                    if ((zzb & 7) == 2) {
                        Object mo31569b = abstractC19841ez2.mo31569b(zzioVar, this.f47514a, zzb >>> 3);
                        if (mo31569b != null) {
                            abstractC19841ez2.mo31565f(interfaceC20062gF2, mo31569b, zzioVar, mo31562i);
                        } else {
                            z = abstractC22141sG2.m22845i(mo22839o, interfaceC20062gF2);
                            continue;
                        }
                    } else {
                        z = interfaceC20062gF2.zzc();
                        continue;
                    }
                } else {
                    Object obj2 = null;
                    zzht zzhtVar = null;
                    int i = 0;
                    while (interfaceC20062gF2.zza() != Integer.MAX_VALUE) {
                        int zzb2 = interfaceC20062gF2.zzb();
                        if (zzb2 == 16) {
                            i = interfaceC20062gF2.zzo();
                            obj2 = abstractC19841ez2.mo31569b(zzioVar, this.f47514a, i);
                        } else if (zzb2 == 26) {
                            if (obj2 != null) {
                                abstractC19841ez2.mo31565f(interfaceC20062gF2, obj2, zzioVar, mo31562i);
                            } else {
                                zzhtVar = interfaceC20062gF2.zzn();
                            }
                        } else if (!interfaceC20062gF2.zzc()) {
                            break;
                        }
                    }
                    if (interfaceC20062gF2.zzb() == 12) {
                        if (zzhtVar != null) {
                            if (obj2 != null) {
                                abstractC19841ez2.mo31566e(zzhtVar, obj2, zzioVar, mo31562i);
                            } else {
                                abstractC22141sG2.mo22849e(mo22839o, i, zzhtVar);
                            }
                        }
                    } else {
                        throw zzjk.zze();
                    }
                }
                z = true;
                continue;
            } catch (Throwable th2) {
                abstractC22141sG2.mo22841m(obj, mo22839o);
                throw th2;
            }
        } while (z);
        abstractC22141sG2.mo22841m(obj, mo22839o);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00be A[EDGE_INSN: B:57:0x00be->B:33:0x00be ?: BREAK  , SYNTHETIC] */
    @Override // p000.InterfaceC19370cF2
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo46596e(java.lang.Object r11, byte[] r12, int r13, int r14, p000.Kv2 r15) {
        /*
            r10 = this;
            r0 = r11
            com.google.android.gms.internal.vision.zzjb r0 = (com.google.android.gms.internal.vision.zzjb) r0
            com.google.android.gms.internal.vision.zzlx r1 = r0.zzb
            com.google.android.gms.internal.vision.zzlx r2 = com.google.android.gms.internal.vision.zzlx.zza()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.vision.zzlx r1 = com.google.android.gms.internal.vision.zzlx.m46393f()
            r0.zzb = r1
        L11:
            com.google.android.gms.internal.vision.zzjb$zzc r11 = (com.google.android.gms.internal.vision.zzjb.zzc) r11
            Fz2 r11 = r11.m46409i()
            r0 = 0
            r2 = r0
        L19:
            if (r13 >= r14) goto Lc9
            int r4 = com.google.android.gms.internal.vision.AbstractC6635w.m46567j(r12, r13, r15)
            int r13 = r15.f3451a
            r3 = 11
            r5 = 2
            if (r13 == r3) goto L65
            r3 = r13 & 7
            if (r3 != r5) goto L60
            ez2 r2 = r10.f47517d
            com.google.android.gms.internal.vision.zzio r3 = r15.f3454d
            com.google.android.gms.internal.vision.zzkk r5 = r10.f47514a
            int r6 = r13 >>> 3
            java.lang.Object r2 = r2.mo31569b(r3, r5, r6)
            r8 = r2
            com.google.android.gms.internal.vision.zzjb$zze r8 = (com.google.android.gms.internal.vision.zzjb.zze) r8
            if (r8 == 0) goto L56
            AE2 r13 = p000.AE2.m69300a()
            com.google.android.gms.internal.vision.zzkk r2 = r8.f47653c
            java.lang.Class r2 = r2.getClass()
            cF2 r13 = r13.m69299b(r2)
            int r13 = com.google.android.gms.internal.vision.AbstractC6635w.m46570g(r13, r12, r4, r14, r15)
            com.google.android.gms.internal.vision.zzjb$a r2 = r8.f47654d
            java.lang.Object r3 = r15.f3453c
            r11.m68352f(r2, r3)
        L54:
            r2 = r8
            goto L19
        L56:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = com.google.android.gms.internal.vision.AbstractC6635w.m46575b(r2, r3, r4, r5, r6, r7)
            goto L54
        L60:
            int r13 = com.google.android.gms.internal.vision.AbstractC6635w.m46574c(r13, r12, r4, r14, r15)
            goto L19
        L65:
            r13 = 0
            r3 = r0
        L67:
            if (r4 >= r14) goto Lbe
            int r4 = com.google.android.gms.internal.vision.AbstractC6635w.m46567j(r12, r4, r15)
            int r6 = r15.f3451a
            int r7 = r6 >>> 3
            r8 = r6 & 7
            if (r7 == r5) goto La0
            r9 = 3
            if (r7 == r9) goto L79
            goto Lb5
        L79:
            if (r2 == 0) goto L95
            AE2 r6 = p000.AE2.m69300a()
            com.google.android.gms.internal.vision.zzkk r7 = r2.f47653c
            java.lang.Class r7 = r7.getClass()
            cF2 r6 = r6.m69299b(r7)
            int r4 = com.google.android.gms.internal.vision.AbstractC6635w.m46570g(r6, r12, r4, r14, r15)
            com.google.android.gms.internal.vision.zzjb$a r6 = r2.f47654d
            java.lang.Object r7 = r15.f3453c
            r11.m68352f(r6, r7)
            goto L67
        L95:
            if (r8 != r5) goto Lb5
            int r4 = com.google.android.gms.internal.vision.AbstractC6635w.m46560q(r12, r4, r15)
            java.lang.Object r3 = r15.f3453c
            com.google.android.gms.internal.vision.zzht r3 = (com.google.android.gms.internal.vision.zzht) r3
            goto L67
        La0:
            if (r8 != 0) goto Lb5
            int r4 = com.google.android.gms.internal.vision.AbstractC6635w.m46567j(r12, r4, r15)
            int r13 = r15.f3451a
            ez2 r2 = r10.f47517d
            com.google.android.gms.internal.vision.zzio r6 = r15.f3454d
            com.google.android.gms.internal.vision.zzkk r7 = r10.f47514a
            java.lang.Object r2 = r2.mo31569b(r6, r7, r13)
            com.google.android.gms.internal.vision.zzjb$zze r2 = (com.google.android.gms.internal.vision.zzjb.zze) r2
            goto L67
        Lb5:
            r7 = 12
            if (r6 == r7) goto Lbe
            int r4 = com.google.android.gms.internal.vision.AbstractC6635w.m46574c(r6, r12, r4, r14, r15)
            goto L67
        Lbe:
            if (r3 == 0) goto Lc6
            int r13 = r13 << 3
            r13 = r13 | r5
            r1.m46397b(r13, r3)
        Lc6:
            r13 = r4
            goto L19
        Lc9:
            if (r13 != r14) goto Lcc
            return
        Lcc:
            com.google.android.gms.internal.vision.zzjk r11 = com.google.android.gms.internal.vision.zzjk.zzg()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C6607C.mo46596e(java.lang.Object, byte[], int, int, Kv2):void");
    }

    @Override // p000.InterfaceC19370cF2
    public final Object zza() {
        return this.f47514a.zzq().zze();
    }

    @Override // p000.InterfaceC19370cF2
    public final int zzb(Object obj) {
        AbstractC22141sG2 abstractC22141sG2 = this.f47515b;
        int mo22836r = abstractC22141sG2.mo22836r(abstractC22141sG2.mo22843k(obj));
        if (this.f47516c) {
            return mo22836r + this.f47517d.mo31567d(obj).m68339s();
        }
        return mo22836r;
    }

    @Override // p000.InterfaceC19370cF2
    public final void zzc(Object obj) {
        this.f47515b.mo22837q(obj);
        this.f47517d.mo31561j(obj);
    }

    @Override // p000.InterfaceC19370cF2
    public final boolean zza(Object obj, Object obj2) {
        if (this.f47515b.mo22843k(obj).equals(this.f47515b.mo22843k(obj2))) {
            if (this.f47516c) {
                return this.f47517d.mo31567d(obj).equals(this.f47517d.mo31567d(obj2));
            }
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC19370cF2
    public final int zza(Object obj) {
        int hashCode = this.f47515b.mo22843k(obj).hashCode();
        return this.f47516c ? (hashCode * 53) + this.f47517d.mo31567d(obj).hashCode() : hashCode;
    }
}