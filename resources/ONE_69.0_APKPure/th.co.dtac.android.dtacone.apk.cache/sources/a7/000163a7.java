package p000;

import com.google.android.gms.internal.vision.zzht;
import com.google.android.gms.internal.vision.zzii;
import com.google.android.gms.internal.vision.zzjf;
import com.google.android.gms.internal.vision.zzjv;
import com.google.android.gms.internal.vision.zzkc;
import com.google.android.gms.internal.vision.zzkk;
import com.google.android.gms.internal.vision.zzmq;
import java.util.List;
import java.util.Map;

/* renamed from: zy2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23471zy2 implements InterfaceC20590jI2 {

    /* renamed from: a */
    public final zzii f109545a;

    public C23471zy2(zzii zziiVar) {
        zzii zziiVar2 = (zzii) zzjf.m46404d(zziiVar, "output");
        this.f109545a = zziiVar2;
        zziiVar2.f47633a = this;
    }

    /* renamed from: K */
    public static C23471zy2 m26K(zzii zziiVar) {
        C23471zy2 c23471zy2 = zziiVar.f47633a;
        if (c23471zy2 != null) {
            return c23471zy2;
        }
        return new C23471zy2(zziiVar);
    }

    @Override // p000.InterfaceC20590jI2
    /* renamed from: A */
    public final void mo36A(int i, boolean z) {
        this.f109545a.zza(i, z);
    }

    @Override // p000.InterfaceC20590jI2
    /* renamed from: B */
    public final void mo35B(int i, int i2) {
        this.f109545a.zzc(i, i2);
    }

    @Override // p000.InterfaceC20590jI2
    /* renamed from: C */
    public final void mo34C(int i, long j) {
        this.f109545a.zzc(i, j);
    }

    @Override // p000.InterfaceC20590jI2
    /* renamed from: D */
    public final void mo33D(int i, long j) {
        this.f109545a.zzb(i, j);
    }

    @Override // p000.InterfaceC20590jI2
    /* renamed from: E */
    public final void mo32E(int i, String str) {
        this.f109545a.zza(i, str);
    }

    @Override // p000.InterfaceC20590jI2
    /* renamed from: F */
    public final void mo31F(int i, Object obj, InterfaceC19370cF2 interfaceC19370cF2) {
        zzii zziiVar = this.f109545a;
        zziiVar.zza(i, 3);
        interfaceC19370cF2.mo46598c((zzkk) obj, zziiVar.f47633a);
        zziiVar.zza(i, 4);
    }

    @Override // p000.InterfaceC20590jI2
    /* renamed from: G */
    public final void mo30G(int i, zzht zzhtVar) {
        this.f109545a.zza(i, zzhtVar);
    }

    @Override // p000.InterfaceC20590jI2
    /* renamed from: H */
    public final void mo29H(int i, Object obj, InterfaceC19370cF2 interfaceC19370cF2) {
        this.f109545a.mo46422b(i, (zzkk) obj, interfaceC19370cF2);
    }

    @Override // p000.InterfaceC20590jI2
    /* renamed from: I */
    public final void mo28I(int i, List list, InterfaceC19370cF2 interfaceC19370cF2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo31F(i, list.get(i2), interfaceC19370cF2);
        }
    }

    @Override // p000.InterfaceC20590jI2
    /* renamed from: J */
    public final void mo27J(int i, List list, InterfaceC19370cF2 interfaceC19370cF2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo29H(i, list.get(i2), interfaceC19370cF2);
        }
    }

    @Override // p000.InterfaceC20590jI2
    /* renamed from: a */
    public final void mo25a(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f109545a.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.zzd(((Long) list.get(i4)).longValue());
            }
            this.f109545a.zzb(i3);
            while (i2 < list.size()) {
                this.f109545a.zza(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f109545a.zza(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC20590jI2
    /* renamed from: b */
    public final void mo24b(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f109545a.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.zzh(((Long) list.get(i4)).longValue());
            }
            this.f109545a.zzb(i3);
            while (i2 < list.size()) {
                this.f109545a.zzc(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f109545a.zzc(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC20590jI2
    /* renamed from: c */
    public final void mo23c(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f109545a.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.zzg(((Integer) list.get(i4)).intValue());
            }
            this.f109545a.zzb(i3);
            while (i2 < list.size()) {
                this.f109545a.zzb(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f109545a.zzc(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC20590jI2
    /* renamed from: d */
    public final void mo22d(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f109545a.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.zzb(((Double) list.get(i4)).doubleValue());
            }
            this.f109545a.zzb(i3);
            while (i2 < list.size()) {
                this.f109545a.zza(((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f109545a.zza(i, ((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC20590jI2
    /* renamed from: e */
    public final void mo21e(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f109545a.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.zzf(((Long) list.get(i4)).longValue());
            }
            this.f109545a.zzb(i3);
            while (i2 < list.size()) {
                this.f109545a.zzb(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f109545a.zzb(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC20590jI2
    /* renamed from: f */
    public final void mo20f(int i, long j) {
        this.f109545a.zzc(i, j);
    }

    @Override // p000.InterfaceC20590jI2
    /* renamed from: g */
    public final void mo19g(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f109545a.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.zzf(((Integer) list.get(i4)).intValue());
            }
            this.f109545a.zzb(i3);
            while (i2 < list.size()) {
                this.f109545a.zza(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f109545a.zzb(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC20590jI2
    /* renamed from: h */
    public final void mo18h(int i, AbstractC20575jD2 abstractC20575jD2, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f109545a.zza(i, 2);
            this.f109545a.zzb(zzkc.m46400a(abstractC20575jD2, entry.getKey(), entry.getValue()));
            zzkc.m46399b(this.f109545a, abstractC20575jD2, entry.getKey(), entry.getValue());
        }
    }

    @Override // p000.InterfaceC20590jI2
    /* renamed from: i */
    public final void mo17i(int i, long j) {
        this.f109545a.zza(i, j);
    }

    @Override // p000.InterfaceC20590jI2
    /* renamed from: j */
    public final void mo16j(int i, Object obj) {
        if (obj instanceof zzht) {
            this.f109545a.zzb(i, (zzht) obj);
        } else {
            this.f109545a.zza(i, (zzkk) obj);
        }
    }

    @Override // p000.InterfaceC20590jI2
    /* renamed from: k */
    public final void mo15k(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f109545a.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.zzi(((Integer) list.get(i4)).intValue());
            }
            this.f109545a.zzb(i3);
            while (i2 < list.size()) {
                this.f109545a.zzd(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f109545a.zze(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC20590jI2
    /* renamed from: l */
    public final void mo14l(int i, long j) {
        this.f109545a.zza(i, j);
    }

    @Override // p000.InterfaceC20590jI2
    /* renamed from: m */
    public final void mo13m(int i, double d) {
        this.f109545a.zza(i, d);
    }

    @Override // p000.InterfaceC20590jI2
    /* renamed from: n */
    public final void mo12n(int i, float f) {
        this.f109545a.zza(i, f);
    }

    @Override // p000.InterfaceC20590jI2
    /* renamed from: o */
    public final void mo11o(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f109545a.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.zzb(((Boolean) list.get(i4)).booleanValue());
            }
            this.f109545a.zzb(i3);
            while (i2 < list.size()) {
                this.f109545a.zza(((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f109545a.zza(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC20590jI2
    /* renamed from: p */
    public final void mo10p(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f109545a.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.zzk(((Integer) list.get(i4)).intValue());
            }
            this.f109545a.zzb(i3);
            while (i2 < list.size()) {
                this.f109545a.zza(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f109545a.zzb(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC20590jI2
    /* renamed from: q */
    public final void mo9q(int i, int i2) {
        this.f109545a.zzb(i, i2);
    }

    @Override // p000.InterfaceC20590jI2
    /* renamed from: r */
    public final void mo8r(int i, int i2) {
        this.f109545a.zzd(i, i2);
    }

    @Override // p000.InterfaceC20590jI2
    /* renamed from: s */
    public final void mo7s(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f109545a.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.zzj(((Integer) list.get(i4)).intValue());
            }
            this.f109545a.zzb(i3);
            while (i2 < list.size()) {
                this.f109545a.zzd(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f109545a.zze(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC20590jI2
    /* renamed from: t */
    public final void mo6t(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f109545a.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.zzg(((Long) list.get(i4)).longValue());
            }
            this.f109545a.zzb(i3);
            while (i2 < list.size()) {
                this.f109545a.zzc(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f109545a.zzc(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC20590jI2
    /* renamed from: u */
    public final void mo5u(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f109545a.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.zze(((Long) list.get(i4)).longValue());
            }
            this.f109545a.zzb(i3);
            while (i2 < list.size()) {
                this.f109545a.zza(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f109545a.zza(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC20590jI2
    /* renamed from: v */
    public final void mo4v(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f109545a.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.zzb(((Float) list.get(i4)).floatValue());
            }
            this.f109545a.zzb(i3);
            while (i2 < list.size()) {
                this.f109545a.zza(((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f109545a.zza(i, ((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC20590jI2
    /* renamed from: w */
    public final void mo3w(int i, int i2) {
        this.f109545a.zze(i, i2);
    }

    @Override // p000.InterfaceC20590jI2
    /* renamed from: x */
    public final void mo2x(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f109545a.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.zzh(((Integer) list.get(i4)).intValue());
            }
            this.f109545a.zzb(i3);
            while (i2 < list.size()) {
                this.f109545a.zzc(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f109545a.zzd(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC20590jI2
    /* renamed from: y */
    public final void mo1y(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f109545a.zza(i, (zzht) list.get(i2));
        }
    }

    @Override // p000.InterfaceC20590jI2
    /* renamed from: z */
    public final void mo0z(int i, List list) {
        int i2 = 0;
        if (list instanceof zzjv) {
            zzjv zzjvVar = (zzjv) list;
            while (i2 < list.size()) {
                Object zzb = zzjvVar.zzb(i2);
                if (zzb instanceof String) {
                    this.f109545a.zza(i, (String) zzb);
                } else {
                    this.f109545a.zza(i, (zzht) zzb);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f109545a.zza(i, (String) list.get(i2));
            i2++;
        }
    }

    @Override // p000.InterfaceC20590jI2
    public final int zza() {
        return zzmq.zza;
    }

    @Override // p000.InterfaceC20590jI2
    public final void zzb(int i, int i2) {
        this.f109545a.zzb(i, i2);
    }

    @Override // p000.InterfaceC20590jI2
    public final void zza(int i, int i2) {
        this.f109545a.zze(i, i2);
    }

    @Override // p000.InterfaceC20590jI2
    public final void zzb(int i) {
        this.f109545a.zza(i, 4);
    }

    @Override // p000.InterfaceC20590jI2
    public final void zza(int i) {
        this.f109545a.zza(i, 3);
    }
}