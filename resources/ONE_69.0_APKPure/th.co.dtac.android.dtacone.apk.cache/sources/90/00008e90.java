package com.google.android.gms.internal.firebase_ml;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase_ml.I0 */
/* loaded from: classes3.dex */
public final class C6430I0 implements LM2 {

    /* renamed from: a */
    public final zzys f45713a;

    /* renamed from: b */
    public final AbstractC23229yb2 f45714b;

    /* renamed from: c */
    public final boolean f45715c;

    /* renamed from: d */
    public final KL2 f45716d;

    public C6430I0(AbstractC23229yb2 abstractC23229yb2, KL2 kl2, zzys zzysVar) {
        this.f45714b = abstractC23229yb2;
        this.f45715c = kl2.mo48048d(zzysVar);
        this.f45716d = kl2;
        this.f45713a = zzysVar;
    }

    /* renamed from: i */
    public static C6430I0 m47995i(AbstractC23229yb2 abstractC23229yb2, KL2 kl2, zzys zzysVar) {
        return new C6430I0(abstractC23229yb2, kl2, zzysVar);
    }

    @Override // p000.LM2
    /* renamed from: a */
    public final boolean mo48003a(Object obj, Object obj2) {
        if (!this.f45714b.mo278e(obj).equals(this.f45714b.mo278e(obj2))) {
            return false;
        }
        if (this.f45715c) {
            return this.f45716d.mo48047e(obj).equals(this.f45716d.mo48047e(obj2));
        }
        return true;
    }

    @Override // p000.LM2
    /* renamed from: b */
    public final int mo48002b(Object obj) {
        AbstractC23229yb2 abstractC23229yb2 = this.f45714b;
        int mo277f = abstractC23229yb2.mo277f(abstractC23229yb2.mo278e(obj));
        if (this.f45715c) {
            return mo277f + this.f45716d.mo48047e(obj).m67588s();
        }
        return mo277f;
    }

    @Override // p000.LM2
    /* renamed from: c */
    public final int mo48001c(Object obj) {
        int hashCode = this.f45714b.mo278e(obj).hashCode();
        if (this.f45715c) {
            return (hashCode * 53) + this.f45716d.mo48047e(obj).hashCode();
        }
        return hashCode;
    }

    @Override // p000.LM2
    /* renamed from: d */
    public final boolean mo48000d(Object obj) {
        return this.f45716d.mo48047e(obj).m67604c();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099 A[EDGE_INSN: B:57:0x0099->B:34:0x0099 ?: BREAK  , SYNTHETIC] */
    @Override // p000.LM2
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo47999e(java.lang.Object r10, byte[] r11, int r12, int r13, p000.C21810qL2 r14) {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.firebase_ml.zzxh r0 = (com.google.android.gms.internal.firebase_ml.zzxh) r0
            com.google.android.gms.internal.firebase_ml.zzaah r1 = r0.zzcom
            com.google.android.gms.internal.firebase_ml.zzaah r2 = com.google.android.gms.internal.firebase_ml.zzaah.zzxl()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.firebase_ml.zzaah r1 = com.google.android.gms.internal.firebase_ml.zzaah.m47963f()
            r0.zzcom = r1
        L11:
            com.google.android.gms.internal.firebase_ml.zzxh$zzc r10 = (com.google.android.gms.internal.firebase_ml.zzxh.zzc) r10
            r10.m47433f()
            r10 = 0
            r0 = r10
        L18:
            if (r12 >= r13) goto La4
            int r4 = com.google.android.gms.internal.firebase_ml.AbstractC6418C0.m48061j(r11, r12, r14)
            int r2 = r14.f77172a
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L51
            r12 = r2 & 7
            if (r12 != r3) goto L4c
            KL2 r12 = r9.f45716d
            com.google.android.gms.internal.firebase_ml.zzww r0 = r14.f77175d
            com.google.android.gms.internal.firebase_ml.zzys r3 = r9.f45713a
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.mo48050b(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.firebase_ml.zzxh$zze r0 = (com.google.android.gms.internal.firebase_ml.zzxh.zze) r0
            if (r0 != 0) goto L43
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.firebase_ml.AbstractC6418C0.m48070a(r2, r3, r4, r5, r6, r7)
            goto L18
        L43:
            p000.JM2.m67886c()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L4c:
            int r12 = com.google.android.gms.internal.firebase_ml.AbstractC6418C0.m48068c(r2, r11, r4, r13, r14)
            goto L18
        L51:
            r12 = 0
            r2 = r10
        L53:
            if (r4 >= r13) goto L99
            int r4 = com.google.android.gms.internal.firebase_ml.AbstractC6418C0.m48061j(r11, r4, r14)
            int r5 = r14.f77172a
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L7b
            r8 = 3
            if (r6 == r8) goto L65
            goto L90
        L65:
            if (r0 != 0) goto L72
            if (r7 != r3) goto L90
            int r4 = com.google.android.gms.internal.firebase_ml.AbstractC6418C0.m48054q(r11, r4, r14)
            java.lang.Object r2 = r14.f77174c
            com.google.android.gms.internal.firebase_ml.zzwd r2 = (com.google.android.gms.internal.firebase_ml.zzwd) r2
            goto L53
        L72:
            p000.JM2.m67886c()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L7b:
            if (r7 != 0) goto L90
            int r4 = com.google.android.gms.internal.firebase_ml.AbstractC6418C0.m48061j(r11, r4, r14)
            int r12 = r14.f77172a
            KL2 r0 = r9.f45716d
            com.google.android.gms.internal.firebase_ml.zzww r5 = r14.f77175d
            com.google.android.gms.internal.firebase_ml.zzys r6 = r9.f45713a
            java.lang.Object r0 = r0.mo48050b(r5, r6, r12)
            com.google.android.gms.internal.firebase_ml.zzxh$zze r0 = (com.google.android.gms.internal.firebase_ml.zzxh.zze) r0
            goto L53
        L90:
            r6 = 12
            if (r5 == r6) goto L99
            int r4 = com.google.android.gms.internal.firebase_ml.AbstractC6418C0.m48068c(r5, r11, r4, r13, r14)
            goto L53
        L99:
            if (r2 == 0) goto La1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.m47966c(r12, r2)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.C6430I0.mo47999e(java.lang.Object, byte[], int, int, qL2):void");
    }

    @Override // p000.LM2
    /* renamed from: f */
    public final void mo47998f(Object obj, InterfaceC17874Jb2 interfaceC17874Jb2) {
        Iterator m67603d = this.f45716d.mo48047e(obj).m67603d();
        while (m67603d.hasNext()) {
            Map.Entry entry = (Map.Entry) m67603d.next();
            zzxb zzxbVar = (zzxb) entry.getKey();
            if (zzxbVar.zzuv() == zzaay.MESSAGE && !zzxbVar.zzuw() && !zzxbVar.zzux()) {
                if (entry instanceof ZL2) {
                    interfaceC17874Jb2.mo67835j(zzxbVar.zzd(), ((ZL2) entry).m65235a().zzts());
                } else {
                    interfaceC17874Jb2.mo67835j(zzxbVar.zzd(), entry.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        AbstractC23229yb2 abstractC23229yb2 = this.f45714b;
        abstractC23229yb2.mo276g(abstractC23229yb2.mo278e(obj), interfaceC17874Jb2);
    }

    @Override // p000.LM2
    /* renamed from: g */
    public final void mo47997g(Object obj) {
        this.f45714b.mo272k(obj);
        this.f45716d.mo48045g(obj);
    }

    @Override // p000.LM2
    /* renamed from: h */
    public final void mo47996h(Object obj, Object obj2) {
        MM2.m67393f(this.f45714b, obj, obj2);
        if (this.f45715c) {
            MM2.m67392g(this.f45716d, obj, obj2);
        }
    }

    @Override // p000.LM2
    public final Object newInstance() {
        return this.f45713a.zzvg().zzvm();
    }
}