package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.clearcut.h */
/* loaded from: classes3.dex */
public final class C6400h implements InterfaceC18637Vk2 {

    /* renamed from: a */
    public final zzdo f45490a;

    /* renamed from: b */
    public final Em2 f45491b;

    /* renamed from: c */
    public final boolean f45492c;

    /* renamed from: d */
    public final AbstractC18171Oe2 f45493d;

    public C6400h(Em2 em2, AbstractC18171Oe2 abstractC18171Oe2, zzdo zzdoVar) {
        this.f45491b = em2;
        this.f45492c = abstractC18171Oe2.mo48294g(zzdoVar);
        this.f45493d = abstractC18171Oe2;
        this.f45490a = zzdoVar;
    }

    /* renamed from: h */
    public static C6400h m48245h(Em2 em2, AbstractC18171Oe2 abstractC18171Oe2, zzdo zzdoVar) {
        return new C6400h(em2, abstractC18171Oe2, zzdoVar);
    }

    @Override // p000.InterfaceC18637Vk2
    /* renamed from: a */
    public final boolean mo48252a(Object obj, Object obj2) {
        if (this.f45491b.mo48233k(obj).equals(this.f45491b.mo48233k(obj2))) {
            if (this.f45492c) {
                return this.f45493d.mo48299b(obj).equals(this.f45493d.mo48299b(obj2));
            }
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC18637Vk2
    /* renamed from: b */
    public final void mo48251b(Object obj, InterfaceC19588dp2 interfaceC19588dp2) {
        Object value;
        Iterator m26443e = this.f45493d.mo48299b(obj).m26443e();
        while (m26443e.hasNext()) {
            Map.Entry entry = (Map.Entry) m26443e.next();
            zzca zzcaVar = (zzca) entry.getKey();
            if (zzcaVar.zzav() == zzfq.MESSAGE && !zzcaVar.zzaw() && !zzcaVar.zzax()) {
                boolean z = entry instanceof C18433Sg2;
                int zzc = zzcaVar.zzc();
                if (z) {
                    value = ((C18433Sg2) entry).m66304a().zzr();
                } else {
                    value = entry.getValue();
                }
                interfaceC19588dp2.mo31649j(zzc, value);
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        Em2 em2 = this.f45491b;
        em2.mo48239e(em2.mo48233k(obj), interfaceC19588dp2);
    }

    @Override // p000.InterfaceC18637Vk2
    /* renamed from: c */
    public final int mo48250c(Object obj) {
        int hashCode = this.f45491b.mo48233k(obj).hashCode();
        return this.f45492c ? (hashCode * 53) + this.f45493d.mo48299b(obj).hashCode() : hashCode;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0061 A[EDGE_INSN: B:49:0x0061->B:27:0x0061 ?: BREAK  , SYNTHETIC] */
    @Override // p000.InterfaceC18637Vk2
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo48249d(java.lang.Object r8, byte[] r9, int r10, int r11, p000.C20412id2 r12) {
        /*
            r7 = this;
            com.google.android.gms.internal.clearcut.zzcg r8 = (com.google.android.gms.internal.clearcut.zzcg) r8
            com.google.android.gms.internal.clearcut.zzey r0 = r8.zzjp
            com.google.android.gms.internal.clearcut.zzey r1 = com.google.android.gms.internal.clearcut.zzey.zzea()
            if (r0 != r1) goto L10
            com.google.android.gms.internal.clearcut.zzey r0 = com.google.android.gms.internal.clearcut.zzey.m48146f()
            r8.zzjp = r0
        L10:
            r8 = r0
        L11:
            if (r10 >= r11) goto L6b
            int r2 = p000.AbstractC19552dd2.m31834f(r9, r10, r12)
            int r0 = r12.f62846a
            r10 = 11
            r1 = 2
            if (r0 == r10) goto L30
            r10 = r0 & 7
            if (r10 != r1) goto L2b
            r1 = r9
            r3 = r11
            r4 = r8
            r5 = r12
            int r10 = p000.AbstractC19552dd2.m31838b(r0, r1, r2, r3, r4, r5)
            goto L11
        L2b:
            int r10 = p000.AbstractC19552dd2.m31837c(r0, r9, r2, r11, r12)
            goto L11
        L30:
            r10 = 0
            r0 = 0
        L32:
            if (r2 >= r11) goto L61
            int r2 = p000.AbstractC19552dd2.m31834f(r9, r2, r12)
            int r3 = r12.f62846a
            int r4 = r3 >>> 3
            r5 = r3 & 7
            if (r4 == r1) goto L4f
            r6 = 3
            if (r4 == r6) goto L44
            goto L58
        L44:
            if (r5 != r1) goto L58
            int r2 = p000.AbstractC19552dd2.m31827m(r9, r2, r12)
            java.lang.Object r0 = r12.f62848c
            com.google.android.gms.internal.clearcut.zzbb r0 = (com.google.android.gms.internal.clearcut.zzbb) r0
            goto L32
        L4f:
            if (r5 != 0) goto L58
            int r2 = p000.AbstractC19552dd2.m31834f(r9, r2, r12)
            int r10 = r12.f62846a
            goto L32
        L58:
            r4 = 12
            if (r3 == r4) goto L61
            int r2 = p000.AbstractC19552dd2.m31837c(r3, r9, r2, r11, r12)
            goto L32
        L61:
            if (r0 == 0) goto L69
            int r10 = r10 << 3
            r10 = r10 | r1
            r8.m48148d(r10, r0)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C6400h.mo48249d(java.lang.Object, byte[], int, int, id2):void");
    }

    @Override // p000.InterfaceC18637Vk2
    /* renamed from: e */
    public final boolean mo48248e(Object obj) {
        return this.f45493d.mo48299b(obj).m26444d();
    }

    @Override // p000.InterfaceC18637Vk2
    /* renamed from: f */
    public final void mo48247f(Object obj, Object obj2) {
        AbstractC19576dl2.m31747i(this.f45491b, obj, obj2);
        if (this.f45492c) {
            AbstractC19576dl2.m31749g(this.f45493d, obj, obj2);
        }
    }

    @Override // p000.InterfaceC18637Vk2
    /* renamed from: g */
    public final int mo48246g(Object obj) {
        Em2 em2 = this.f45491b;
        int mo48232l = em2.mo48232l(em2.mo48233k(obj));
        return this.f45492c ? mo48232l + this.f45493d.mo48299b(obj).m26435m() : mo48232l;
    }

    @Override // p000.InterfaceC18637Vk2
    public final Object newInstance() {
        return this.f45490a.zzbd().zzbi();
    }

    @Override // p000.InterfaceC18637Vk2
    public final void zzc(Object obj) {
        this.f45491b.mo48240d(obj);
        this.f45493d.mo48295f(obj);
    }
}
