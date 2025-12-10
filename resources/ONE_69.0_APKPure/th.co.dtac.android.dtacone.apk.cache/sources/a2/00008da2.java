package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.clearcut.h */
/* loaded from: classes3.dex */
public final class C6389h implements InterfaceC18489Sl2 {

    /* renamed from: a */
    public final zzdo f45502a;

    /* renamed from: b */
    public final Bn2 f45503b;

    /* renamed from: c */
    public final boolean f45504c;

    /* renamed from: d */
    public final AbstractC18016Lf2 f45505d;

    public C6389h(Bn2 bn2, AbstractC18016Lf2 abstractC18016Lf2, zzdo zzdoVar) {
        this.f45503b = bn2;
        this.f45504c = abstractC18016Lf2.mo48291g(zzdoVar);
        this.f45505d = abstractC18016Lf2;
        this.f45502a = zzdoVar;
    }

    /* renamed from: h */
    public static C6389h m48242h(Bn2 bn2, AbstractC18016Lf2 abstractC18016Lf2, zzdo zzdoVar) {
        return new C6389h(bn2, abstractC18016Lf2, zzdoVar);
    }

    @Override // p000.InterfaceC18489Sl2
    /* renamed from: a */
    public final boolean mo48249a(Object obj, Object obj2) {
        if (this.f45503b.mo48230k(obj).equals(this.f45503b.mo48230k(obj2))) {
            if (this.f45504c) {
                return this.f45505d.mo48296b(obj).equals(this.f45505d.mo48296b(obj2));
            }
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC18489Sl2
    /* renamed from: b */
    public final void mo48248b(Object obj, InterfaceC19122aq2 interfaceC19122aq2) {
        Object value;
        Iterator m30939e = this.f45505d.mo48296b(obj).m30939e();
        while (m30939e.hasNext()) {
            Map.Entry entry = (Map.Entry) m30939e.next();
            zzca zzcaVar = (zzca) entry.getKey();
            if (zzcaVar.zzav() == zzfq.MESSAGE && !zzcaVar.zzaw() && !zzcaVar.zzax()) {
                boolean z = entry instanceof C18282Ph2;
                int zzc = zzcaVar.zzc();
                if (z) {
                    value = ((C18282Ph2) entry).m66936a().zzr();
                } else {
                    value = entry.getValue();
                }
                interfaceC19122aq2.mo52032j(zzc, value);
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        Bn2 bn2 = this.f45503b;
        bn2.mo48236e(bn2.mo48230k(obj), interfaceC19122aq2);
    }

    @Override // p000.InterfaceC18489Sl2
    /* renamed from: c */
    public final int mo48247c(Object obj) {
        int hashCode = this.f45503b.mo48230k(obj).hashCode();
        return this.f45504c ? (hashCode * 53) + this.f45505d.mo48296b(obj).hashCode() : hashCode;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0061 A[EDGE_INSN: B:49:0x0061->B:27:0x0061 ?: BREAK  , SYNTHETIC] */
    @Override // p000.InterfaceC18489Sl2
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo48246d(java.lang.Object r8, byte[] r9, int r10, int r11, p000.C19951fe2 r12) {
        /*
            r7 = this;
            com.google.android.gms.internal.clearcut.zzcg r8 = (com.google.android.gms.internal.clearcut.zzcg) r8
            com.google.android.gms.internal.clearcut.zzey r0 = r8.zzjp
            com.google.android.gms.internal.clearcut.zzey r1 = com.google.android.gms.internal.clearcut.zzey.zzea()
            if (r0 != r1) goto L10
            com.google.android.gms.internal.clearcut.zzey r0 = com.google.android.gms.internal.clearcut.zzey.m48143f()
            r8.zzjp = r0
        L10:
            r8 = r0
        L11:
            if (r10 >= r11) goto L6b
            int r2 = p000.AbstractC19081ae2.m65102f(r9, r10, r12)
            int r0 = r12.f61917a
            r10 = 11
            r1 = 2
            if (r0 == r10) goto L30
            r10 = r0 & 7
            if (r10 != r1) goto L2b
            r1 = r9
            r3 = r11
            r4 = r8
            r5 = r12
            int r10 = p000.AbstractC19081ae2.m65106b(r0, r1, r2, r3, r4, r5)
            goto L11
        L2b:
            int r10 = p000.AbstractC19081ae2.m65105c(r0, r9, r2, r11, r12)
            goto L11
        L30:
            r10 = 0
            r0 = 0
        L32:
            if (r2 >= r11) goto L61
            int r2 = p000.AbstractC19081ae2.m65102f(r9, r2, r12)
            int r3 = r12.f61917a
            int r4 = r3 >>> 3
            r5 = r3 & 7
            if (r4 == r1) goto L4f
            r6 = 3
            if (r4 == r6) goto L44
            goto L58
        L44:
            if (r5 != r1) goto L58
            int r2 = p000.AbstractC19081ae2.m65095m(r9, r2, r12)
            java.lang.Object r0 = r12.f61919c
            com.google.android.gms.internal.clearcut.zzbb r0 = (com.google.android.gms.internal.clearcut.zzbb) r0
            goto L32
        L4f:
            if (r5 != 0) goto L58
            int r2 = p000.AbstractC19081ae2.m65102f(r9, r2, r12)
            int r10 = r12.f61917a
            goto L32
        L58:
            r4 = 12
            if (r3 == r4) goto L61
            int r2 = p000.AbstractC19081ae2.m65105c(r3, r9, r2, r11, r12)
            goto L32
        L61:
            if (r0 == 0) goto L69
            int r10 = r10 << 3
            r10 = r10 | r1
            r8.m48145d(r10, r0)
        L69:
            r10 = r2
            goto L11
        L6b:
            if (r10 != r11) goto L6e
            return
        L6e:
            com.google.android.gms.internal.clearcut.zzco r8 = com.google.android.gms.internal.clearcut.zzco.zzbo()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C6389h.mo48246d(java.lang.Object, byte[], int, int, fe2):void");
    }

    @Override // p000.InterfaceC18489Sl2
    /* renamed from: e */
    public final boolean mo48245e(Object obj) {
        return this.f45505d.mo48296b(obj).m30940d();
    }

    @Override // p000.InterfaceC18489Sl2
    /* renamed from: f */
    public final void mo48244f(Object obj, Object obj2) {
        AbstractC19105am2.m65014i(this.f45503b, obj, obj2);
        if (this.f45504c) {
            AbstractC19105am2.m65016g(this.f45505d, obj, obj2);
        }
    }

    @Override // p000.InterfaceC18489Sl2
    /* renamed from: g */
    public final int mo48243g(Object obj) {
        Bn2 bn2 = this.f45503b;
        int mo48229l = bn2.mo48229l(bn2.mo48230k(obj));
        return this.f45504c ? mo48229l + this.f45505d.mo48296b(obj).m30931m() : mo48229l;
    }

    @Override // p000.InterfaceC18489Sl2
    public final Object newInstance() {
        return this.f45502a.zzbd().zzbi();
    }

    @Override // p000.InterfaceC18489Sl2
    public final void zzc(Object obj) {
        this.f45503b.mo48237d(obj);
        this.f45505d.mo48292f(obj);
    }
}