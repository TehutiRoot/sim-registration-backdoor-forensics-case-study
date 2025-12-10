package p000;

import com.google.android.gms.internal.firebase_ml.zzwd;
import com.google.android.gms.internal.firebase_ml.zzwq;
import com.google.android.gms.internal.firebase_ml.zzxh;
import com.google.android.gms.internal.firebase_ml.zzxl;
import com.google.android.gms.internal.firebase_ml.zzyd;
import com.google.android.gms.internal.firebase_ml.zzyk;
import com.google.android.gms.internal.firebase_ml.zzys;
import java.util.List;
import java.util.Map;

/* renamed from: IL2 */
/* loaded from: classes3.dex */
public final class IL2 implements InterfaceC17874Jb2 {

    /* renamed from: a */
    public final zzwq f2670a;

    public IL2(zzwq zzwqVar) {
        zzwq zzwqVar2 = (zzwq) zzxl.m47430b(zzwqVar, "output");
        this.f2670a = zzwqVar2;
        zzwqVar2.f46108a = this;
    }

    /* renamed from: h */
    public static IL2 m68020h(zzwq zzwqVar) {
        IL2 il2 = zzwqVar.f46108a;
        if (il2 != null) {
            return il2;
        }
        return new IL2(zzwqVar);
    }

    @Override // p000.InterfaceC17874Jb2
    /* renamed from: A */
    public final void mo67859A(int i, boolean z) {
        this.f2670a.zza(i, z);
    }

    @Override // p000.InterfaceC17874Jb2
    /* renamed from: C */
    public final void mo67858C(int i, long j) {
        this.f2670a.zzc(i, j);
    }

    @Override // p000.InterfaceC17874Jb2
    /* renamed from: D */
    public final void mo67857D(int i, long j) {
        this.f2670a.zza(i, j);
    }

    @Override // p000.InterfaceC17874Jb2
    /* renamed from: E */
    public final void mo67856E(int i, zzwd zzwdVar) {
        this.f2670a.zza(i, zzwdVar);
    }

    @Override // p000.InterfaceC17874Jb2
    /* renamed from: F */
    public final void mo67855F(int i, int i2) {
        this.f2670a.zzj(i, i2);
    }

    @Override // p000.InterfaceC17874Jb2
    /* renamed from: G */
    public final void mo67854G(int i, int i2) {
        this.f2670a.zzh(i, i2);
    }

    @Override // p000.InterfaceC17874Jb2
    /* renamed from: H */
    public final void mo67853H(int i, String str) {
        this.f2670a.zzb(i, str);
    }

    @Override // p000.InterfaceC17874Jb2
    /* renamed from: I */
    public final void mo67852I(int i, C21467oM2 c21467oM2, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f2670a.writeTag(i, 2);
            this.f2670a.zzdh(zzyk.m47424a(c21467oM2, entry.getKey(), entry.getValue()));
            zzyk.m47423b(this.f2670a, c21467oM2, entry.getKey(), entry.getValue());
        }
    }

    @Override // p000.InterfaceC17874Jb2
    /* renamed from: J */
    public final void mo67851J(int i, int i2) {
        this.f2670a.zzh(i, i2);
    }

    @Override // p000.InterfaceC17874Jb2
    /* renamed from: K */
    public final void mo67850K(int i, Object obj, LM2 lm2) {
        zzwq zzwqVar = this.f2670a;
        zzwqVar.writeTag(i, 3);
        lm2.mo47998f((zzys) obj, zzwqVar.f46108a);
        zzwqVar.writeTag(i, 4);
    }

    @Override // p000.InterfaceC17874Jb2
    /* renamed from: L */
    public final void mo67849L(int i, Object obj, LM2 lm2) {
        this.f2670a.mo47443b(i, (zzys) obj, lm2);
    }

    @Override // p000.InterfaceC17874Jb2
    /* renamed from: M */
    public final void mo67848M(int i, List list, LM2 lm2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo67849L(i, list.get(i2), lm2);
        }
    }

    @Override // p000.InterfaceC17874Jb2
    /* renamed from: N */
    public final void mo67847N(int i, List list, LM2 lm2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo67850K(i, list.get(i2), lm2);
        }
    }

    @Override // p000.InterfaceC17874Jb2
    /* renamed from: O */
    public final void mo67846O(int i) {
        this.f2670a.writeTag(i, 4);
    }

    @Override // p000.InterfaceC17874Jb2
    /* renamed from: P */
    public final void mo67845P(int i) {
        this.f2670a.writeTag(i, 3);
    }

    @Override // p000.InterfaceC17874Jb2
    /* renamed from: Q */
    public final int mo67844Q() {
        return zzxh.zzg.zzcph;
    }

    @Override // p000.InterfaceC17874Jb2
    /* renamed from: a */
    public final void mo67843a(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f2670a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzwq.zzz(((Long) list.get(i4)).longValue());
            }
            this.f2670a.zzdh(i3);
            while (i2 < list.size()) {
                this.f2670a.zzw(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f2670a.zza(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC17874Jb2
    /* renamed from: b */
    public final void mo67842b(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f2670a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzwq.zzad(((Long) list.get(i4)).longValue());
            }
            this.f2670a.zzdh(i3);
            while (i2 < list.size()) {
                this.f2670a.zzy(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f2670a.zzc(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC17874Jb2
    /* renamed from: c */
    public final void mo67841c(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f2670a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzwq.zzdm(((Integer) list.get(i4)).intValue());
            }
            this.f2670a.zzdh(i3);
            while (i2 < list.size()) {
                this.f2670a.zzdh(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f2670a.zzi(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC17874Jb2
    /* renamed from: d */
    public final void mo67840d(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f2670a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzwq.zzd(((Double) list.get(i4)).doubleValue());
            }
            this.f2670a.zzdh(i3);
            while (i2 < list.size()) {
                this.f2670a.zzc(((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f2670a.zza(i, ((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC17874Jb2
    /* renamed from: e */
    public final void mo67839e(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f2670a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzwq.zzab(((Long) list.get(i4)).longValue());
            }
            this.f2670a.zzdh(i3);
            while (i2 < list.size()) {
                this.f2670a.zzx(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f2670a.zzb(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC17874Jb2
    /* renamed from: f */
    public final void mo67838f(int i, long j) {
        this.f2670a.zzb(i, j);
    }

    @Override // p000.InterfaceC17874Jb2
    /* renamed from: g */
    public final void mo67837g(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f2670a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzwq.zzdl(((Integer) list.get(i4)).intValue());
            }
            this.f2670a.zzdh(i3);
            while (i2 < list.size()) {
                this.f2670a.zzdg(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f2670a.zzh(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC17874Jb2
    /* renamed from: i */
    public final void mo67836i(int i, long j) {
        this.f2670a.zzc(i, j);
    }

    @Override // p000.InterfaceC17874Jb2
    /* renamed from: j */
    public final void mo67835j(int i, Object obj) {
        if (obj instanceof zzwd) {
            this.f2670a.zzb(i, (zzwd) obj);
        } else {
            this.f2670a.zza(i, (zzys) obj);
        }
    }

    @Override // p000.InterfaceC17874Jb2
    /* renamed from: k */
    public final void mo67834k(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f2670a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzwq.zzdo(((Integer) list.get(i4)).intValue());
            }
            this.f2670a.zzdh(i3);
            while (i2 < list.size()) {
                this.f2670a.zzdj(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f2670a.zzk(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC17874Jb2
    /* renamed from: l */
    public final void mo67833l(int i, long j) {
        this.f2670a.zza(i, j);
    }

    @Override // p000.InterfaceC17874Jb2
    /* renamed from: m */
    public final void mo67832m(int i, double d) {
        this.f2670a.zza(i, d);
    }

    @Override // p000.InterfaceC17874Jb2
    /* renamed from: n */
    public final void mo67831n(int i, float f) {
        this.f2670a.zza(i, f);
    }

    @Override // p000.InterfaceC17874Jb2
    /* renamed from: o */
    public final void mo67830o(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f2670a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzwq.zzay(((Boolean) list.get(i4)).booleanValue());
            }
            this.f2670a.zzdh(i3);
            while (i2 < list.size()) {
                this.f2670a.zzax(((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f2670a.zza(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC17874Jb2
    /* renamed from: p */
    public final void mo67829p(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f2670a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzwq.zzdq(((Integer) list.get(i4)).intValue());
            }
            this.f2670a.zzdh(i3);
            while (i2 < list.size()) {
                this.f2670a.zzdg(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f2670a.zzh(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC17874Jb2
    /* renamed from: q */
    public final void mo67828q(int i, int i2) {
        this.f2670a.zzk(i, i2);
    }

    @Override // p000.InterfaceC17874Jb2
    /* renamed from: r */
    public final void mo67827r(int i, int i2) {
        this.f2670a.zzi(i, i2);
    }

    @Override // p000.InterfaceC17874Jb2
    /* renamed from: s */
    public final void mo67826s(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f2670a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzwq.zzdp(((Integer) list.get(i4)).intValue());
            }
            this.f2670a.zzdh(i3);
            while (i2 < list.size()) {
                this.f2670a.zzdj(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f2670a.zzk(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC17874Jb2
    /* renamed from: t */
    public final void mo67825t(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f2670a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzwq.zzac(((Long) list.get(i4)).longValue());
            }
            this.f2670a.zzdh(i3);
            while (i2 < list.size()) {
                this.f2670a.zzy(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f2670a.zzc(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC17874Jb2
    /* renamed from: u */
    public final void mo67824u(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f2670a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzwq.zzaa(((Long) list.get(i4)).longValue());
            }
            this.f2670a.zzdh(i3);
            while (i2 < list.size()) {
                this.f2670a.zzw(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f2670a.zza(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC17874Jb2
    /* renamed from: v */
    public final void mo67823v(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f2670a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzwq.zzr(((Float) list.get(i4)).floatValue());
            }
            this.f2670a.zzdh(i3);
            while (i2 < list.size()) {
                this.f2670a.zzq(((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f2670a.zza(i, ((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC17874Jb2
    /* renamed from: w */
    public final void mo67822w(int i, int i2) {
        this.f2670a.zzk(i, i2);
    }

    @Override // p000.InterfaceC17874Jb2
    /* renamed from: x */
    public final void mo67821x(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f2670a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzwq.zzdn(((Integer) list.get(i4)).intValue());
            }
            this.f2670a.zzdh(i3);
            while (i2 < list.size()) {
                this.f2670a.zzdi(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f2670a.zzj(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC17874Jb2
    /* renamed from: y */
    public final void mo67820y(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f2670a.zza(i, (zzwd) list.get(i2));
        }
    }

    @Override // p000.InterfaceC17874Jb2
    /* renamed from: z */
    public final void mo67819z(int i, List list) {
        int i2 = 0;
        if (list instanceof zzyd) {
            zzyd zzydVar = (zzyd) list;
            while (i2 < list.size()) {
                Object raw = zzydVar.getRaw(i2);
                if (raw instanceof String) {
                    this.f2670a.zzb(i, (String) raw);
                } else {
                    this.f2670a.zza(i, (zzwd) raw);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f2670a.zzb(i, (String) list.get(i2));
            i2++;
        }
    }
}