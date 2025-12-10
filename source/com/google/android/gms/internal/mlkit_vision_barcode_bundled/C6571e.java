package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.e */
/* loaded from: classes3.dex */
public final class C6571e implements Rq2 {

    /* renamed from: a */
    public final zzfo f46862a;

    /* renamed from: b */
    public final Js2 f46863b;

    /* renamed from: c */
    public final boolean f46864c;

    /* renamed from: d */
    public final AbstractC20602jj2 f46865d;

    public C6571e(Js2 js2, AbstractC20602jj2 abstractC20602jj2, zzfo zzfoVar) {
        this.f46863b = js2;
        this.f46864c = abstractC20602jj2.mo29136g(zzfoVar);
        this.f46865d = abstractC20602jj2;
        this.f46862a = zzfoVar;
    }

    /* renamed from: c */
    public static C6571e m46920c(Js2 js2, AbstractC20602jj2 abstractC20602jj2, zzfo zzfoVar) {
        return new C6571e(js2, abstractC20602jj2, zzfoVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf A[EDGE_INSN: B:56:0x00bf->B:33:0x00bf ?: BREAK  , SYNTHETIC] */
    @Override // p000.Rq2
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo46922a(java.lang.Object r11, byte[] r12, int r13, int r14, p000.C22657vg2 r15) {
        /*
            r10 = this;
            r0 = r11
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed r0 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed) r0
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz r1 = r0.zzc
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz r2 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzc()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.m46865c()
            r0.zzc = r1
        L11:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdz r11 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdz) r11
            yj2 r11 = r11.m46882k()
            r0 = 0
            r2 = r0
        L19:
            if (r13 >= r14) goto Lca
            int r4 = p000.AbstractC23345zg2.m50j(r12, r13, r15)
            int r13 = r15.f107746a
            r3 = 11
            r5 = 2
            if (r13 == r3) goto L65
            r3 = r13 & 7
            if (r3 != r5) goto L60
            jj2 r2 = r10.f46865d
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdo r3 = r15.f107749d
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo r5 = r10.f46862a
            int r6 = r13 >>> 3
            java.lang.Object r8 = r2.mo29139d(r3, r5, r6)
            if (r8 == 0) goto L56
            Bp2 r13 = p000.Bp2.m68857a()
            r2 = r8
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeb r2 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeb) r2
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo r3 = r2.f46967c
            java.lang.Class r3 = r3.getClass()
            Rq2 r13 = r13.m68856b(r3)
            int r13 = p000.AbstractC23345zg2.m56d(r13, r12, r4, r14, r15)
            uk2 r2 = r2.f46968d
            java.lang.Object r3 = r15.f107748c
            r11.m196i(r2, r3)
        L54:
            r2 = r8
            goto L19
        L56:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = p000.AbstractC23345zg2.m51i(r2, r3, r4, r5, r6, r7)
            goto L54
        L60:
            int r13 = p000.AbstractC23345zg2.m44p(r13, r12, r4, r14, r15)
            goto L19
        L65:
            r13 = 0
            r3 = r0
        L67:
            if (r4 >= r14) goto Lbf
            int r4 = p000.AbstractC23345zg2.m50j(r12, r4, r15)
            int r6 = r15.f107746a
            int r7 = r6 >>> 3
            r8 = r6 & 7
            if (r7 == r5) goto La3
            r9 = 3
            if (r7 == r9) goto L79
            goto Lb6
        L79:
            if (r2 == 0) goto L98
            Bp2 r6 = p000.Bp2.m68857a()
            r7 = r2
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeb r7 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeb) r7
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo r8 = r7.f46967c
            java.lang.Class r8 = r8.getClass()
            Rq2 r6 = r6.m68856b(r8)
            int r4 = p000.AbstractC23345zg2.m56d(r6, r12, r4, r14, r15)
            uk2 r6 = r7.f46968d
            java.lang.Object r7 = r15.f107748c
            r11.m196i(r6, r7)
            goto L67
        L98:
            if (r8 != r5) goto Lb6
            int r4 = p000.AbstractC23345zg2.m59a(r12, r4, r15)
            java.lang.Object r3 = r15.f107748c
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb r3 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb) r3
            goto L67
        La3:
            if (r8 != 0) goto Lb6
            int r4 = p000.AbstractC23345zg2.m50j(r12, r4, r15)
            int r13 = r15.f107746a
            jj2 r2 = r10.f46865d
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdo r6 = r15.f107749d
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo r7 = r10.f46862a
            java.lang.Object r2 = r2.mo29139d(r6, r7, r13)
            goto L67
        Lb6:
            r7 = 12
            if (r6 == r7) goto Lbf
            int r4 = p000.AbstractC23345zg2.m44p(r6, r12, r4, r14, r15)
            goto L67
        Lbf:
            if (r3 == 0) goto Lc7
            int r13 = r13 << 3
            r13 = r13 | r5
            r1.m46862f(r13, r3)
        Lc7:
            r13 = r4
            goto L19
        Lca:
            if (r13 != r14) goto Lcd
            return
        Lcd:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo r11 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo.zze()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.C6571e.mo46922a(java.lang.Object, byte[], int, int, vg2):void");
    }

    @Override // p000.Rq2
    /* renamed from: b */
    public final void mo46921b(Object obj, InterfaceC19090av2 interfaceC19090av2) {
        Iterator m199f = this.f46865d.mo29141b(obj).m199f();
        while (m199f.hasNext()) {
            Map.Entry entry = (Map.Entry) m199f.next();
            zzds zzdsVar = (zzds) entry.getKey();
            if (zzdsVar.zze() == zzhp.MESSAGE) {
                zzdsVar.zzg();
                zzdsVar.zzf();
                if (entry instanceof C18832Yl2) {
                    interfaceC19090av2.mo52115B(zzdsVar.zza(), ((C18832Yl2) entry).m65319a().zzb());
                } else {
                    interfaceC19090av2.mo52115B(zzdsVar.zza(), entry.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        Js2 js2 = this.f46863b;
        js2.mo46905i(js2.mo46910d(obj), interfaceC19090av2);
    }

    @Override // p000.Rq2
    public final int zza(Object obj) {
        Js2 js2 = this.f46863b;
        int mo46912b = js2.mo46912b(js2.mo46910d(obj));
        if (this.f46864c) {
            return mo46912b + this.f46865d.mo29141b(obj).m203b();
        }
        return mo46912b;
    }

    @Override // p000.Rq2
    public final int zzb(Object obj) {
        int hashCode = this.f46863b.mo46910d(obj).hashCode();
        if (this.f46864c) {
            return (hashCode * 53) + this.f46865d.mo29141b(obj).f108836a.hashCode();
        }
        return hashCode;
    }

    @Override // p000.Rq2
    public final Object zze() {
        zzfo zzfoVar = this.f46862a;
        if (zzfoVar instanceof zzed) {
            return ((zzed) zzfoVar).m46878d();
        }
        return zzfoVar.zzY().zzk();
    }

    @Override // p000.Rq2
    public final void zzf(Object obj) {
        this.f46863b.mo46907g(obj);
        this.f46865d.mo29138e(obj);
    }

    @Override // p000.Rq2
    public final void zzg(Object obj, Object obj2) {
        AbstractC19766er2.m31462c(this.f46863b, obj, obj2);
        if (this.f46864c) {
            AbstractC19766er2.m31463b(this.f46865d, obj, obj2);
        }
    }

    @Override // p000.Rq2
    public final boolean zzj(Object obj, Object obj2) {
        if (!this.f46863b.mo46910d(obj).equals(this.f46863b.mo46910d(obj2))) {
            return false;
        }
        if (this.f46864c) {
            return this.f46865d.mo29141b(obj).equals(this.f46865d.mo29141b(obj2));
        }
        return true;
    }

    @Override // p000.Rq2
    public final boolean zzk(Object obj) {
        return this.f46865d.mo29141b(obj).m194k();
    }
}
