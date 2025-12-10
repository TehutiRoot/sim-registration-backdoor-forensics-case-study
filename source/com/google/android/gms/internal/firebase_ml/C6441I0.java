package com.google.android.gms.internal.firebase_ml;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase_ml.I0 */
/* loaded from: classes3.dex */
public final class C6441I0 implements OL2 {

    /* renamed from: a */
    public final zzys f45701a;

    /* renamed from: b */
    public final AbstractC17327Ba2 f45702b;

    /* renamed from: c */
    public final boolean f45703c;

    /* renamed from: d */
    public final NK2 f45704d;

    public C6441I0(AbstractC17327Ba2 abstractC17327Ba2, NK2 nk2, zzys zzysVar) {
        this.f45702b = abstractC17327Ba2;
        this.f45703c = nk2.mo48051d(zzysVar);
        this.f45704d = nk2;
        this.f45701a = zzysVar;
    }

    /* renamed from: i */
    public static C6441I0 m47998i(AbstractC17327Ba2 abstractC17327Ba2, NK2 nk2, zzys zzysVar) {
        return new C6441I0(abstractC17327Ba2, nk2, zzysVar);
    }

    @Override // p000.OL2
    /* renamed from: a */
    public final boolean mo48006a(Object obj, Object obj2) {
        if (!this.f45702b.mo47986e(obj).equals(this.f45702b.mo47986e(obj2))) {
            return false;
        }
        if (this.f45703c) {
            return this.f45704d.mo48050e(obj).equals(this.f45704d.mo48050e(obj2));
        }
        return true;
    }

    @Override // p000.OL2
    /* renamed from: b */
    public final int mo48005b(Object obj) {
        AbstractC17327Ba2 abstractC17327Ba2 = this.f45702b;
        int mo47985f = abstractC17327Ba2.mo47985f(abstractC17327Ba2.mo47986e(obj));
        if (this.f45703c) {
            return mo47985f + this.f45704d.mo48050e(obj).m67076s();
        }
        return mo47985f;
    }

    @Override // p000.OL2
    /* renamed from: c */
    public final int mo48004c(Object obj) {
        int hashCode = this.f45702b.mo47986e(obj).hashCode();
        if (this.f45703c) {
            return (hashCode * 53) + this.f45704d.mo48050e(obj).hashCode();
        }
        return hashCode;
    }

    @Override // p000.OL2
    /* renamed from: d */
    public final boolean mo48003d(Object obj) {
        return this.f45704d.mo48050e(obj).m67092c();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099 A[EDGE_INSN: B:57:0x0099->B:34:0x0099 ?: BREAK  , SYNTHETIC] */
    @Override // p000.OL2
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo48002e(java.lang.Object r10, byte[] r11, int r12, int r13, p000.C22261tK2 r14) {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.firebase_ml.zzxh r0 = (com.google.android.gms.internal.firebase_ml.zzxh) r0
            com.google.android.gms.internal.firebase_ml.zzaah r1 = r0.zzcom
            com.google.android.gms.internal.firebase_ml.zzaah r2 = com.google.android.gms.internal.firebase_ml.zzaah.zzxl()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.firebase_ml.zzaah r1 = com.google.android.gms.internal.firebase_ml.zzaah.m47954f()
            r0.zzcom = r1
        L11:
            com.google.android.gms.internal.firebase_ml.zzxh$zzc r10 = (com.google.android.gms.internal.firebase_ml.zzxh.zzc) r10
            r10.m47424f()
            r10 = 0
            r0 = r10
        L18:
            if (r12 >= r13) goto La4
            int r4 = com.google.android.gms.internal.firebase_ml.AbstractC6429C0.m48064j(r11, r12, r14)
            int r2 = r14.f80075a
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L51
            r12 = r2 & 7
            if (r12 != r3) goto L4c
            NK2 r12 = r9.f45704d
            com.google.android.gms.internal.firebase_ml.zzww r0 = r14.f80078d
            com.google.android.gms.internal.firebase_ml.zzys r3 = r9.f45701a
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.mo48053b(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.firebase_ml.zzxh$zze r0 = (com.google.android.gms.internal.firebase_ml.zzxh.zze) r0
            if (r0 != 0) goto L43
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.firebase_ml.AbstractC6429C0.m48073a(r2, r3, r4, r5, r6, r7)
            goto L18
        L43:
            p000.ML2.m67395c()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L4c:
            int r12 = com.google.android.gms.internal.firebase_ml.AbstractC6429C0.m48071c(r2, r11, r4, r13, r14)
            goto L18
        L51:
            r12 = 0
            r2 = r10
        L53:
            if (r4 >= r13) goto L99
            int r4 = com.google.android.gms.internal.firebase_ml.AbstractC6429C0.m48064j(r11, r4, r14)
            int r5 = r14.f80075a
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L7b
            r8 = 3
            if (r6 == r8) goto L65
            goto L90
        L65:
            if (r0 != 0) goto L72
            if (r7 != r3) goto L90
            int r4 = com.google.android.gms.internal.firebase_ml.AbstractC6429C0.m48057q(r11, r4, r14)
            java.lang.Object r2 = r14.f80077c
            com.google.android.gms.internal.firebase_ml.zzwd r2 = (com.google.android.gms.internal.firebase_ml.zzwd) r2
            goto L53
        L72:
            p000.ML2.m67395c()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L7b:
            if (r7 != 0) goto L90
            int r4 = com.google.android.gms.internal.firebase_ml.AbstractC6429C0.m48064j(r11, r4, r14)
            int r12 = r14.f80075a
            NK2 r0 = r9.f45704d
            com.google.android.gms.internal.firebase_ml.zzww r5 = r14.f80078d
            com.google.android.gms.internal.firebase_ml.zzys r6 = r9.f45701a
            java.lang.Object r0 = r0.mo48053b(r5, r6, r12)
            com.google.android.gms.internal.firebase_ml.zzxh$zze r0 = (com.google.android.gms.internal.firebase_ml.zzxh.zze) r0
            goto L53
        L90:
            r6 = 12
            if (r5 == r6) goto L99
            int r4 = com.google.android.gms.internal.firebase_ml.AbstractC6429C0.m48071c(r5, r11, r4, r13, r14)
            goto L53
        L99:
            if (r2 == 0) goto La1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.m47957c(r12, r2)
        La1:
            r12 = r4
            goto L18
        La4:
            if (r12 != r13) goto La7
            return
        La7:
            com.google.android.gms.internal.firebase_ml.zzxs r10 = com.google.android.gms.internal.firebase_ml.zzxs.zzvu()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.C6441I0.mo48002e(java.lang.Object, byte[], int, int, tK2):void");
    }

    @Override // p000.OL2
    /* renamed from: f */
    public final void mo48001f(Object obj, InterfaceC18031Ma2 interfaceC18031Ma2) {
        Iterator m67091d = this.f45704d.mo48050e(obj).m67091d();
        while (m67091d.hasNext()) {
            Map.Entry entry = (Map.Entry) m67091d.next();
            zzxb zzxbVar = (zzxb) entry.getKey();
            if (zzxbVar.zzuv() == zzaay.MESSAGE && !zzxbVar.zzuw() && !zzxbVar.zzux()) {
                if (entry instanceof C19340cL2) {
                    interfaceC18031Ma2.mo67341j(zzxbVar.zzd(), ((C19340cL2) entry).m51689a().zzts());
                } else {
                    interfaceC18031Ma2.mo67341j(zzxbVar.zzd(), entry.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        AbstractC17327Ba2 abstractC17327Ba2 = this.f45702b;
        abstractC17327Ba2.mo47984g(abstractC17327Ba2.mo47986e(obj), interfaceC18031Ma2);
    }

    @Override // p000.OL2
    /* renamed from: g */
    public final void mo48000g(Object obj) {
        this.f45702b.mo47980k(obj);
        this.f45704d.mo48048g(obj);
    }

    @Override // p000.OL2
    /* renamed from: h */
    public final void mo47999h(Object obj, Object obj2) {
        PL2.m66823f(this.f45702b, obj, obj2);
        if (this.f45703c) {
            PL2.m66822g(this.f45704d, obj, obj2);
        }
    }

    @Override // p000.OL2
    public final Object newInstance() {
        return this.f45701a.zzvg().zzvm();
    }
}
