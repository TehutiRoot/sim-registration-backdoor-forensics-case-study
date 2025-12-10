package p000;

import com.google.android.gms.internal.clearcut.zzbb;
import com.google.android.gms.internal.clearcut.zzbn;
import com.google.android.gms.internal.clearcut.zzcg;
import com.google.android.gms.internal.clearcut.zzci;
import com.google.android.gms.internal.clearcut.zzcx;
import com.google.android.gms.internal.clearcut.zzdg;
import com.google.android.gms.internal.clearcut.zzdo;
import java.util.List;
import java.util.Map;

/* renamed from: Bf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17366Bf2 implements InterfaceC19122aq2 {

    /* renamed from: a */
    public final zzbn f458a;

    public C17366Bf2(zzbn zzbnVar) {
        zzbn zzbnVar2 = (zzbn) zzci.m48154d(zzbnVar, "output");
        this.f458a = zzbnVar2;
        zzbnVar2.f45549a = this;
    }

    /* renamed from: A */
    public static C17366Bf2 m69092A(zzbn zzbnVar) {
        C17366Bf2 c17366Bf2 = zzbnVar.f45549a;
        if (c17366Bf2 != null) {
            return c17366Bf2;
        }
        return new C17366Bf2(zzbnVar);
    }

    @Override // p000.InterfaceC19122aq2
    /* renamed from: B */
    public final void mo52056B(int i, int i2) {
        this.f458a.zze(i, i2);
    }

    @Override // p000.InterfaceC19122aq2
    /* renamed from: C */
    public final void mo52055C(int i, long j) {
        this.f458a.zzc(i, j);
    }

    @Override // p000.InterfaceC19122aq2
    /* renamed from: D */
    public final void mo52054D(int i, long j) {
        this.f458a.zza(i, j);
    }

    @Override // p000.InterfaceC19122aq2
    /* renamed from: E */
    public final void mo52053E(int i, String str) {
        this.f458a.zza(i, str);
    }

    @Override // p000.InterfaceC19122aq2
    /* renamed from: F */
    public final void mo52052F(int i, List list, InterfaceC18489Sl2 interfaceC18489Sl2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo52042P(i, list.get(i2), interfaceC18489Sl2);
        }
    }

    @Override // p000.InterfaceC19122aq2
    /* renamed from: G */
    public final void mo52051G(int i, AbstractC22907wj2 abstractC22907wj2, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f458a.zzb(i, 2);
            this.f458a.zzo(zzdg.m48150a(abstractC22907wj2, entry.getKey(), entry.getValue()));
            zzdg.m48149b(this.f458a, abstractC22907wj2, entry.getKey(), entry.getValue());
        }
    }

    @Override // p000.InterfaceC19122aq2
    /* renamed from: H */
    public final void mo52050H(int i, List list, InterfaceC18489Sl2 interfaceC18489Sl2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo52043O(i, list.get(i2), interfaceC18489Sl2);
        }
    }

    @Override // p000.InterfaceC19122aq2
    /* renamed from: I */
    public final void mo52049I(int i, int i2) {
        this.f458a.zzc(i, i2);
    }

    @Override // p000.InterfaceC19122aq2
    /* renamed from: J */
    public final void mo52048J(int i) {
        this.f458a.zzb(i, 3);
    }

    @Override // p000.InterfaceC19122aq2
    /* renamed from: K */
    public final void mo52047K(int i, int i2) {
        this.f458a.zzf(i, i2);
    }

    @Override // p000.InterfaceC19122aq2
    /* renamed from: L */
    public final void mo52046L(int i) {
        this.f458a.zzb(i, 4);
    }

    @Override // p000.InterfaceC19122aq2
    /* renamed from: M */
    public final void mo52045M(int i, zzbb zzbbVar) {
        this.f458a.zza(i, zzbbVar);
    }

    @Override // p000.InterfaceC19122aq2
    /* renamed from: N */
    public final int mo52044N() {
        return zzcg.zzg.zzko;
    }

    @Override // p000.InterfaceC19122aq2
    /* renamed from: O */
    public final void mo52043O(int i, Object obj, InterfaceC18489Sl2 interfaceC18489Sl2) {
        zzbn zzbnVar = this.f458a;
        zzbnVar.zzb(i, 3);
        interfaceC18489Sl2.mo48248b((zzdo) obj, zzbnVar.f45549a);
        zzbnVar.zzb(i, 4);
    }

    @Override // p000.InterfaceC19122aq2
    /* renamed from: P */
    public final void mo52042P(int i, Object obj, InterfaceC18489Sl2 interfaceC18489Sl2) {
        this.f458a.mo48169a(i, (zzdo) obj, interfaceC18489Sl2);
    }

    @Override // p000.InterfaceC19122aq2
    /* renamed from: a */
    public final void mo52041a(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f458a.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.zze(((Long) list.get(i4)).longValue());
            }
            this.f458a.zzo(i3);
            while (i2 < list.size()) {
                this.f458a.zzb(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f458a.zza(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC19122aq2
    /* renamed from: b */
    public final void mo52040b(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f458a.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.zzi(((Long) list.get(i4)).longValue());
            }
            this.f458a.zzo(i3);
            while (i2 < list.size()) {
                this.f458a.zzd(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f458a.zzc(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC19122aq2
    /* renamed from: c */
    public final void mo52039c(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f458a.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.zzt(((Integer) list.get(i4)).intValue());
            }
            this.f458a.zzo(i3);
            while (i2 < list.size()) {
                this.f458a.zzo(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f458a.zzd(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC19122aq2
    /* renamed from: d */
    public final void mo52038d(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f458a.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.zzb(((Double) list.get(i4)).doubleValue());
            }
            this.f458a.zzo(i3);
            while (i2 < list.size()) {
                this.f458a.zza(((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f458a.zza(i, ((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC19122aq2
    /* renamed from: e */
    public final void mo52037e(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f458a.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.zzg(((Long) list.get(i4)).longValue());
            }
            this.f458a.zzo(i3);
            while (i2 < list.size()) {
                this.f458a.zzc(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f458a.zzb(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC19122aq2
    /* renamed from: f */
    public final void mo52036f(int i, long j) {
        this.f458a.zzb(i, j);
    }

    @Override // p000.InterfaceC19122aq2
    /* renamed from: g */
    public final void mo52035g(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f458a.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.zzs(((Integer) list.get(i4)).intValue());
            }
            this.f458a.zzo(i3);
            while (i2 < list.size()) {
                this.f458a.zzn(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f458a.zzc(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC19122aq2
    /* renamed from: h */
    public final void mo52034h(int i, boolean z) {
        this.f458a.zzb(i, z);
    }

    @Override // p000.InterfaceC19122aq2
    /* renamed from: i */
    public final void mo52033i(int i, long j) {
        this.f458a.zzc(i, j);
    }

    @Override // p000.InterfaceC19122aq2
    /* renamed from: j */
    public final void mo52032j(int i, Object obj) {
        if (obj instanceof zzbb) {
            this.f458a.zzb(i, (zzbb) obj);
        } else {
            this.f458a.zzb(i, (zzdo) obj);
        }
    }

    @Override // p000.InterfaceC19122aq2
    /* renamed from: k */
    public final void mo52031k(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f458a.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.zzv(((Integer) list.get(i4)).intValue());
            }
            this.f458a.zzo(i3);
            while (i2 < list.size()) {
                this.f458a.zzq(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f458a.zzf(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC19122aq2
    /* renamed from: l */
    public final void mo52030l(int i, long j) {
        this.f458a.zza(i, j);
    }

    @Override // p000.InterfaceC19122aq2
    /* renamed from: m */
    public final void mo52029m(int i, double d) {
        this.f458a.zza(i, d);
    }

    @Override // p000.InterfaceC19122aq2
    /* renamed from: n */
    public final void mo52028n(int i, float f) {
        this.f458a.zza(i, f);
    }

    @Override // p000.InterfaceC19122aq2
    /* renamed from: o */
    public final void mo52027o(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f458a.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.zzb(((Boolean) list.get(i4)).booleanValue());
            }
            this.f458a.zzo(i3);
            while (i2 < list.size()) {
                this.f458a.zza(((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f458a.zzb(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC19122aq2
    /* renamed from: p */
    public final void mo52026p(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f458a.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.zzx(((Integer) list.get(i4)).intValue());
            }
            this.f458a.zzo(i3);
            while (i2 < list.size()) {
                this.f458a.zzn(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f458a.zzc(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC19122aq2
    /* renamed from: q */
    public final void mo52025q(int i, int i2) {
        this.f458a.zzc(i, i2);
    }

    @Override // p000.InterfaceC19122aq2
    /* renamed from: r */
    public final void mo52024r(int i, int i2) {
        this.f458a.zzf(i, i2);
    }

    @Override // p000.InterfaceC19122aq2
    /* renamed from: s */
    public final void mo52023s(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f458a.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.zzw(((Integer) list.get(i4)).intValue());
            }
            this.f458a.zzo(i3);
            while (i2 < list.size()) {
                this.f458a.zzq(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f458a.zzf(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC19122aq2
    /* renamed from: t */
    public final void mo52022t(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f458a.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.zzh(((Long) list.get(i4)).longValue());
            }
            this.f458a.zzo(i3);
            while (i2 < list.size()) {
                this.f458a.zzd(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f458a.zzc(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC19122aq2
    /* renamed from: u */
    public final void mo52021u(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f458a.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.zzf(((Long) list.get(i4)).longValue());
            }
            this.f458a.zzo(i3);
            while (i2 < list.size()) {
                this.f458a.zzb(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f458a.zza(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC19122aq2
    /* renamed from: v */
    public final void mo52020v(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f458a.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.zzb(((Float) list.get(i4)).floatValue());
            }
            this.f458a.zzo(i3);
            while (i2 < list.size()) {
                this.f458a.zza(((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f458a.zza(i, ((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC19122aq2
    /* renamed from: w */
    public final void mo52019w(int i, int i2) {
        this.f458a.zzd(i, i2);
    }

    @Override // p000.InterfaceC19122aq2
    /* renamed from: x */
    public final void mo52018x(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f458a.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.zzu(((Integer) list.get(i4)).intValue());
            }
            this.f458a.zzo(i3);
            while (i2 < list.size()) {
                this.f458a.zzp(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f458a.zze(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC19122aq2
    /* renamed from: y */
    public final void mo52017y(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f458a.zza(i, (zzbb) list.get(i2));
        }
    }

    @Override // p000.InterfaceC19122aq2
    /* renamed from: z */
    public final void mo52016z(int i, List list) {
        int i2 = 0;
        if (list instanceof zzcx) {
            zzcx zzcxVar = (zzcx) list;
            while (i2 < list.size()) {
                Object raw = zzcxVar.getRaw(i2);
                if (raw instanceof String) {
                    this.f458a.zza(i, (String) raw);
                } else {
                    this.f458a.zza(i, (zzbb) raw);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f458a.zza(i, (String) list.get(i2));
            i2++;
        }
    }
}