package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.C */
/* loaded from: classes3.dex */
public final class C6618C implements InterfaceC19835fE2 {

    /* renamed from: a */
    public final zzkk f47502a;

    /* renamed from: b */
    public final AbstractC22590vF2 f47503b;

    /* renamed from: c */
    public final boolean f47504c;

    /* renamed from: d */
    public final AbstractC20303hy2 f47505d;

    public C6618C(AbstractC22590vF2 abstractC22590vF2, AbstractC20303hy2 abstractC20303hy2, zzkk zzkkVar) {
        this.f47503b = abstractC22590vF2;
        this.f47504c = abstractC20303hy2.mo30689h(zzkkVar);
        this.f47505d = abstractC20303hy2;
        this.f47502a = zzkkVar;
    }

    /* renamed from: f */
    public static C6618C m46609f(AbstractC22590vF2 abstractC22590vF2, AbstractC20303hy2 abstractC20303hy2, zzkk zzkkVar) {
        return new C6618C(abstractC22590vF2, abstractC20303hy2, zzkkVar);
    }

    @Override // p000.InterfaceC19835fE2
    /* renamed from: a */
    public final boolean mo31335a(Object obj) {
        return this.f47505d.mo30693d(obj).m67818r();
    }

    @Override // p000.InterfaceC19835fE2
    /* renamed from: b */
    public final void mo31334b(Object obj, Object obj2) {
        AbstractC21039mE2.m26321p(this.f47503b, obj, obj2);
        if (this.f47504c) {
            AbstractC21039mE2.m26323n(this.f47505d, obj, obj2);
        }
    }

    @Override // p000.InterfaceC19835fE2
    /* renamed from: c */
    public final void mo31333c(Object obj, InterfaceC21048mH2 interfaceC21048mH2) {
        Iterator m67821o = this.f47505d.mo30693d(obj).m67821o();
        while (m67821o.hasNext()) {
            Map.Entry entry = (Map.Entry) m67821o.next();
            zziw zziwVar = (zziw) entry.getKey();
            if (zziwVar.zzc() == zzmo.MESSAGE && !zziwVar.zzd() && !zziwVar.zze()) {
                if (entry instanceof OA2) {
                    interfaceC21048mH2.mo26291j(zziwVar.zza(), ((OA2) entry).m67109a().zzc());
                } else {
                    interfaceC21048mH2.mo26291j(zziwVar.zza(), entry.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        AbstractC22590vF2 abstractC22590vF2 = this.f47503b;
        abstractC22590vF2.mo1078n(abstractC22590vF2.mo1081k(obj), interfaceC21048mH2);
    }

    @Override // p000.InterfaceC19835fE2
    /* renamed from: d */
    public final void mo31332d(Object obj, InterfaceC20523jE2 interfaceC20523jE2, zzio zzioVar) {
        boolean z;
        AbstractC22590vF2 abstractC22590vF2 = this.f47503b;
        AbstractC20303hy2 abstractC20303hy2 = this.f47505d;
        Object mo1077o = abstractC22590vF2.mo1077o(obj);
        Iy2 mo30688i = abstractC20303hy2.mo30688i(obj);
        do {
            try {
                if (interfaceC20523jE2.zza() == Integer.MAX_VALUE) {
                    abstractC22590vF2.mo1079m(obj, mo1077o);
                    return;
                }
                int zzb = interfaceC20523jE2.zzb();
                if (zzb != 11) {
                    if ((zzb & 7) == 2) {
                        Object mo30695b = abstractC20303hy2.mo30695b(zzioVar, this.f47502a, zzb >>> 3);
                        if (mo30695b != null) {
                            abstractC20303hy2.mo30691f(interfaceC20523jE2, mo30695b, zzioVar, mo30688i);
                        } else {
                            z = abstractC22590vF2.m1083i(mo1077o, interfaceC20523jE2);
                            continue;
                        }
                    } else {
                        z = interfaceC20523jE2.zzc();
                        continue;
                    }
                } else {
                    Object obj2 = null;
                    zzht zzhtVar = null;
                    int i = 0;
                    while (interfaceC20523jE2.zza() != Integer.MAX_VALUE) {
                        int zzb2 = interfaceC20523jE2.zzb();
                        if (zzb2 == 16) {
                            i = interfaceC20523jE2.zzo();
                            obj2 = abstractC20303hy2.mo30695b(zzioVar, this.f47502a, i);
                        } else if (zzb2 == 26) {
                            if (obj2 != null) {
                                abstractC20303hy2.mo30691f(interfaceC20523jE2, obj2, zzioVar, mo30688i);
                            } else {
                                zzhtVar = interfaceC20523jE2.zzn();
                            }
                        } else if (!interfaceC20523jE2.zzc()) {
                            break;
                        }
                    }
                    if (interfaceC20523jE2.zzb() == 12) {
                        if (zzhtVar != null) {
                            if (obj2 != null) {
                                abstractC20303hy2.mo30692e(zzhtVar, obj2, zzioVar, mo30688i);
                            } else {
                                abstractC22590vF2.mo1087e(mo1077o, i, zzhtVar);
                            }
                        }
                    } else {
                        throw zzjk.zze();
                    }
                }
                z = true;
                continue;
            } catch (Throwable th2) {
                abstractC22590vF2.mo1079m(obj, mo1077o);
                throw th2;
            }
        } while (z);
        abstractC22590vF2.mo1079m(obj, mo1077o);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00be A[EDGE_INSN: B:57:0x00be->B:33:0x00be ?: BREAK  , SYNTHETIC] */
    @Override // p000.InterfaceC19835fE2
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo31331e(java.lang.Object r11, byte[] r12, int r13, int r14, p000.Nu2 r15) {
        /*
            r10 = this;
            r0 = r11
            com.google.android.gms.internal.vision.zzjb r0 = (com.google.android.gms.internal.vision.zzjb) r0
            com.google.android.gms.internal.vision.zzlx r1 = r0.zzb
            com.google.android.gms.internal.vision.zzlx r2 = com.google.android.gms.internal.vision.zzlx.zza()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.vision.zzlx r1 = com.google.android.gms.internal.vision.zzlx.m46408f()
            r0.zzb = r1
        L11:
            com.google.android.gms.internal.vision.zzjb$zzc r11 = (com.google.android.gms.internal.vision.zzjb.zzc) r11
            Iy2 r11 = r11.m46424i()
            r0 = 0
            r2 = r0
        L19:
            if (r13 >= r14) goto Lc9
            int r4 = com.google.android.gms.internal.vision.AbstractC6646w.m46581j(r12, r13, r15)
            int r13 = r15.f4235a
            r3 = 11
            r5 = 2
            if (r13 == r3) goto L65
            r3 = r13 & 7
            if (r3 != r5) goto L60
            hy2 r2 = r10.f47505d
            com.google.android.gms.internal.vision.zzio r3 = r15.f4238d
            com.google.android.gms.internal.vision.zzkk r5 = r10.f47502a
            int r6 = r13 >>> 3
            java.lang.Object r2 = r2.mo30695b(r3, r5, r6)
            r8 = r2
            com.google.android.gms.internal.vision.zzjb$zze r8 = (com.google.android.gms.internal.vision.zzjb.zze) r8
            if (r8 == 0) goto L56
            DD2 r13 = p000.DD2.m68673a()
            com.google.android.gms.internal.vision.zzkk r2 = r8.f47641c
            java.lang.Class r2 = r2.getClass()
            fE2 r13 = r13.m68672b(r2)
            int r13 = com.google.android.gms.internal.vision.AbstractC6646w.m46584g(r13, r12, r4, r14, r15)
            com.google.android.gms.internal.vision.zzjb$a r2 = r8.f47642d
            java.lang.Object r3 = r15.f4237c
            r11.m67830f(r2, r3)
        L54:
            r2 = r8
            goto L19
        L56:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = com.google.android.gms.internal.vision.AbstractC6646w.m46589b(r2, r3, r4, r5, r6, r7)
            goto L54
        L60:
            int r13 = com.google.android.gms.internal.vision.AbstractC6646w.m46588c(r13, r12, r4, r14, r15)
            goto L19
        L65:
            r13 = 0
            r3 = r0
        L67:
            if (r4 >= r14) goto Lbe
            int r4 = com.google.android.gms.internal.vision.AbstractC6646w.m46581j(r12, r4, r15)
            int r6 = r15.f4235a
            int r7 = r6 >>> 3
            r8 = r6 & 7
            if (r7 == r5) goto La0
            r9 = 3
            if (r7 == r9) goto L79
            goto Lb5
        L79:
            if (r2 == 0) goto L95
            DD2 r6 = p000.DD2.m68673a()
            com.google.android.gms.internal.vision.zzkk r7 = r2.f47641c
            java.lang.Class r7 = r7.getClass()
            fE2 r6 = r6.m68672b(r7)
            int r4 = com.google.android.gms.internal.vision.AbstractC6646w.m46584g(r6, r12, r4, r14, r15)
            com.google.android.gms.internal.vision.zzjb$a r6 = r2.f47642d
            java.lang.Object r7 = r15.f4237c
            r11.m67830f(r6, r7)
            goto L67
        L95:
            if (r8 != r5) goto Lb5
            int r4 = com.google.android.gms.internal.vision.AbstractC6646w.m46574q(r12, r4, r15)
            java.lang.Object r3 = r15.f4237c
            com.google.android.gms.internal.vision.zzht r3 = (com.google.android.gms.internal.vision.zzht) r3
            goto L67
        La0:
            if (r8 != 0) goto Lb5
            int r4 = com.google.android.gms.internal.vision.AbstractC6646w.m46581j(r12, r4, r15)
            int r13 = r15.f4235a
            hy2 r2 = r10.f47505d
            com.google.android.gms.internal.vision.zzio r6 = r15.f4238d
            com.google.android.gms.internal.vision.zzkk r7 = r10.f47502a
            java.lang.Object r2 = r2.mo30695b(r6, r7, r13)
            com.google.android.gms.internal.vision.zzjb$zze r2 = (com.google.android.gms.internal.vision.zzjb.zze) r2
            goto L67
        Lb5:
            r7 = 12
            if (r6 == r7) goto Lbe
            int r4 = com.google.android.gms.internal.vision.AbstractC6646w.m46588c(r6, r12, r4, r14, r15)
            goto L67
        Lbe:
            if (r3 == 0) goto Lc6
            int r13 = r13 << 3
            r13 = r13 | r5
            r1.m46412b(r13, r3)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C6618C.mo31331e(java.lang.Object, byte[], int, int, Nu2):void");
    }

    @Override // p000.InterfaceC19835fE2
    public final Object zza() {
        return this.f47502a.zzq().zze();
    }

    @Override // p000.InterfaceC19835fE2
    public final int zzb(Object obj) {
        AbstractC22590vF2 abstractC22590vF2 = this.f47503b;
        int mo1074r = abstractC22590vF2.mo1074r(abstractC22590vF2.mo1081k(obj));
        if (this.f47504c) {
            return mo1074r + this.f47505d.mo30693d(obj).m67817s();
        }
        return mo1074r;
    }

    @Override // p000.InterfaceC19835fE2
    public final void zzc(Object obj) {
        this.f47503b.mo1075q(obj);
        this.f47505d.mo30687j(obj);
    }

    @Override // p000.InterfaceC19835fE2
    public final boolean zza(Object obj, Object obj2) {
        if (this.f47503b.mo1081k(obj).equals(this.f47503b.mo1081k(obj2))) {
            if (this.f47504c) {
                return this.f47505d.mo30693d(obj).equals(this.f47505d.mo30693d(obj2));
            }
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC19835fE2
    public final int zza(Object obj) {
        int hashCode = this.f47503b.mo1081k(obj).hashCode();
        return this.f47504c ? (hashCode * 53) + this.f47505d.mo30693d(obj).hashCode() : hashCode;
    }
}
