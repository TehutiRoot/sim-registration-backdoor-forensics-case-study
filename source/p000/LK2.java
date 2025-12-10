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

/* renamed from: LK2 */
/* loaded from: classes3.dex */
public final class LK2 implements InterfaceC18031Ma2 {

    /* renamed from: a */
    public final zzwq f3446a;

    public LK2(zzwq zzwqVar) {
        zzwq zzwqVar2 = (zzwq) zzxl.m47421b(zzwqVar, "output");
        this.f3446a = zzwqVar2;
        zzwqVar2.f46096a = this;
    }

    /* renamed from: h */
    public static LK2 m67531h(zzwq zzwqVar) {
        LK2 lk2 = zzwqVar.f46096a;
        if (lk2 != null) {
            return lk2;
        }
        return new LK2(zzwqVar);
    }

    @Override // p000.InterfaceC18031Ma2
    /* renamed from: A */
    public final void mo67365A(int i, boolean z) {
        this.f3446a.zza(i, z);
    }

    @Override // p000.InterfaceC18031Ma2
    /* renamed from: C */
    public final void mo67364C(int i, long j) {
        this.f3446a.zzc(i, j);
    }

    @Override // p000.InterfaceC18031Ma2
    /* renamed from: D */
    public final void mo67363D(int i, long j) {
        this.f3446a.zza(i, j);
    }

    @Override // p000.InterfaceC18031Ma2
    /* renamed from: E */
    public final void mo67362E(int i, zzwd zzwdVar) {
        this.f3446a.zza(i, zzwdVar);
    }

    @Override // p000.InterfaceC18031Ma2
    /* renamed from: F */
    public final void mo67361F(int i, int i2) {
        this.f3446a.zzj(i, i2);
    }

    @Override // p000.InterfaceC18031Ma2
    /* renamed from: G */
    public final void mo67360G(int i, int i2) {
        this.f3446a.zzh(i, i2);
    }

    @Override // p000.InterfaceC18031Ma2
    /* renamed from: H */
    public final void mo67359H(int i, String str) {
        this.f3446a.zzb(i, str);
    }

    @Override // p000.InterfaceC18031Ma2
    /* renamed from: I */
    public final void mo67358I(int i, C21920rL2 c21920rL2, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f3446a.writeTag(i, 2);
            this.f3446a.zzdh(zzyk.m47415a(c21920rL2, entry.getKey(), entry.getValue()));
            zzyk.m47414b(this.f3446a, c21920rL2, entry.getKey(), entry.getValue());
        }
    }

    @Override // p000.InterfaceC18031Ma2
    /* renamed from: J */
    public final void mo67357J(int i, int i2) {
        this.f3446a.zzh(i, i2);
    }

    @Override // p000.InterfaceC18031Ma2
    /* renamed from: K */
    public final void mo67356K(int i, Object obj, OL2 ol2) {
        zzwq zzwqVar = this.f3446a;
        zzwqVar.writeTag(i, 3);
        ol2.mo48001f((zzys) obj, zzwqVar.f46096a);
        zzwqVar.writeTag(i, 4);
    }

    @Override // p000.InterfaceC18031Ma2
    /* renamed from: L */
    public final void mo67355L(int i, Object obj, OL2 ol2) {
        this.f3446a.mo47434b(i, (zzys) obj, ol2);
    }

    @Override // p000.InterfaceC18031Ma2
    /* renamed from: M */
    public final void mo67354M(int i, List list, OL2 ol2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo67355L(i, list.get(i2), ol2);
        }
    }

    @Override // p000.InterfaceC18031Ma2
    /* renamed from: N */
    public final void mo67353N(int i, List list, OL2 ol2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo67356K(i, list.get(i2), ol2);
        }
    }

    @Override // p000.InterfaceC18031Ma2
    /* renamed from: O */
    public final void mo67352O(int i) {
        this.f3446a.writeTag(i, 4);
    }

    @Override // p000.InterfaceC18031Ma2
    /* renamed from: P */
    public final void mo67351P(int i) {
        this.f3446a.writeTag(i, 3);
    }

    @Override // p000.InterfaceC18031Ma2
    /* renamed from: Q */
    public final int mo67350Q() {
        return zzxh.zzg.zzcph;
    }

    @Override // p000.InterfaceC18031Ma2
    /* renamed from: a */
    public final void mo67349a(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f3446a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzwq.zzz(((Long) list.get(i4)).longValue());
            }
            this.f3446a.zzdh(i3);
            while (i2 < list.size()) {
                this.f3446a.zzw(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f3446a.zza(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC18031Ma2
    /* renamed from: b */
    public final void mo67348b(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f3446a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzwq.zzad(((Long) list.get(i4)).longValue());
            }
            this.f3446a.zzdh(i3);
            while (i2 < list.size()) {
                this.f3446a.zzy(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f3446a.zzc(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC18031Ma2
    /* renamed from: c */
    public final void mo67347c(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f3446a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzwq.zzdm(((Integer) list.get(i4)).intValue());
            }
            this.f3446a.zzdh(i3);
            while (i2 < list.size()) {
                this.f3446a.zzdh(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f3446a.zzi(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC18031Ma2
    /* renamed from: d */
    public final void mo67346d(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f3446a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzwq.zzd(((Double) list.get(i4)).doubleValue());
            }
            this.f3446a.zzdh(i3);
            while (i2 < list.size()) {
                this.f3446a.zzc(((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f3446a.zza(i, ((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC18031Ma2
    /* renamed from: e */
    public final void mo67345e(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f3446a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzwq.zzab(((Long) list.get(i4)).longValue());
            }
            this.f3446a.zzdh(i3);
            while (i2 < list.size()) {
                this.f3446a.zzx(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f3446a.zzb(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC18031Ma2
    /* renamed from: f */
    public final void mo67344f(int i, long j) {
        this.f3446a.zzb(i, j);
    }

    @Override // p000.InterfaceC18031Ma2
    /* renamed from: g */
    public final void mo67343g(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f3446a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzwq.zzdl(((Integer) list.get(i4)).intValue());
            }
            this.f3446a.zzdh(i3);
            while (i2 < list.size()) {
                this.f3446a.zzdg(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f3446a.zzh(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC18031Ma2
    /* renamed from: i */
    public final void mo67342i(int i, long j) {
        this.f3446a.zzc(i, j);
    }

    @Override // p000.InterfaceC18031Ma2
    /* renamed from: j */
    public final void mo67341j(int i, Object obj) {
        if (obj instanceof zzwd) {
            this.f3446a.zzb(i, (zzwd) obj);
        } else {
            this.f3446a.zza(i, (zzys) obj);
        }
    }

    @Override // p000.InterfaceC18031Ma2
    /* renamed from: k */
    public final void mo67340k(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f3446a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzwq.zzdo(((Integer) list.get(i4)).intValue());
            }
            this.f3446a.zzdh(i3);
            while (i2 < list.size()) {
                this.f3446a.zzdj(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f3446a.zzk(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC18031Ma2
    /* renamed from: l */
    public final void mo67339l(int i, long j) {
        this.f3446a.zza(i, j);
    }

    @Override // p000.InterfaceC18031Ma2
    /* renamed from: m */
    public final void mo67338m(int i, double d) {
        this.f3446a.zza(i, d);
    }

    @Override // p000.InterfaceC18031Ma2
    /* renamed from: n */
    public final void mo67337n(int i, float f) {
        this.f3446a.zza(i, f);
    }

    @Override // p000.InterfaceC18031Ma2
    /* renamed from: o */
    public final void mo67336o(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f3446a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzwq.zzay(((Boolean) list.get(i4)).booleanValue());
            }
            this.f3446a.zzdh(i3);
            while (i2 < list.size()) {
                this.f3446a.zzax(((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f3446a.zza(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC18031Ma2
    /* renamed from: p */
    public final void mo67335p(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f3446a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzwq.zzdq(((Integer) list.get(i4)).intValue());
            }
            this.f3446a.zzdh(i3);
            while (i2 < list.size()) {
                this.f3446a.zzdg(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f3446a.zzh(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC18031Ma2
    /* renamed from: q */
    public final void mo67334q(int i, int i2) {
        this.f3446a.zzk(i, i2);
    }

    @Override // p000.InterfaceC18031Ma2
    /* renamed from: r */
    public final void mo67333r(int i, int i2) {
        this.f3446a.zzi(i, i2);
    }

    @Override // p000.InterfaceC18031Ma2
    /* renamed from: s */
    public final void mo67332s(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f3446a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzwq.zzdp(((Integer) list.get(i4)).intValue());
            }
            this.f3446a.zzdh(i3);
            while (i2 < list.size()) {
                this.f3446a.zzdj(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f3446a.zzk(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC18031Ma2
    /* renamed from: t */
    public final void mo67331t(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f3446a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzwq.zzac(((Long) list.get(i4)).longValue());
            }
            this.f3446a.zzdh(i3);
            while (i2 < list.size()) {
                this.f3446a.zzy(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f3446a.zzc(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC18031Ma2
    /* renamed from: u */
    public final void mo67330u(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f3446a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzwq.zzaa(((Long) list.get(i4)).longValue());
            }
            this.f3446a.zzdh(i3);
            while (i2 < list.size()) {
                this.f3446a.zzw(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f3446a.zza(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC18031Ma2
    /* renamed from: v */
    public final void mo67329v(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f3446a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzwq.zzr(((Float) list.get(i4)).floatValue());
            }
            this.f3446a.zzdh(i3);
            while (i2 < list.size()) {
                this.f3446a.zzq(((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f3446a.zza(i, ((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC18031Ma2
    /* renamed from: w */
    public final void mo67328w(int i, int i2) {
        this.f3446a.zzk(i, i2);
    }

    @Override // p000.InterfaceC18031Ma2
    /* renamed from: x */
    public final void mo67327x(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f3446a.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzwq.zzdn(((Integer) list.get(i4)).intValue());
            }
            this.f3446a.zzdh(i3);
            while (i2 < list.size()) {
                this.f3446a.zzdi(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f3446a.zzj(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC18031Ma2
    /* renamed from: y */
    public final void mo67326y(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f3446a.zza(i, (zzwd) list.get(i2));
        }
    }

    @Override // p000.InterfaceC18031Ma2
    /* renamed from: z */
    public final void mo67325z(int i, List list) {
        int i2 = 0;
        if (list instanceof zzyd) {
            zzyd zzydVar = (zzyd) list;
            while (i2 < list.size()) {
                Object raw = zzydVar.getRaw(i2);
                if (raw instanceof String) {
                    this.f3446a.zzb(i, (String) raw);
                } else {
                    this.f3446a.zza(i, (zzwd) raw);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f3446a.zzb(i, (String) list.get(i2));
            i2++;
        }
    }
}
