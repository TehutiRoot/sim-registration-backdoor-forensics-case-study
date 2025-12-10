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

/* renamed from: Ee2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17531Ee2 implements InterfaceC19588dp2 {

    /* renamed from: a */
    public final zzbn f1348a;

    public C17531Ee2(zzbn zzbnVar) {
        zzbn zzbnVar2 = (zzbn) zzci.m48157d(zzbnVar, "output");
        this.f1348a = zzbnVar2;
        zzbnVar2.f45537a = this;
    }

    /* renamed from: A */
    public static C17531Ee2 m68476A(zzbn zzbnVar) {
        C17531Ee2 c17531Ee2 = zzbnVar.f45537a;
        if (c17531Ee2 != null) {
            return c17531Ee2;
        }
        return new C17531Ee2(zzbnVar);
    }

    @Override // p000.InterfaceC19588dp2
    /* renamed from: B */
    public final void mo31673B(int i, int i2) {
        this.f1348a.zze(i, i2);
    }

    @Override // p000.InterfaceC19588dp2
    /* renamed from: C */
    public final void mo31672C(int i, long j) {
        this.f1348a.zzc(i, j);
    }

    @Override // p000.InterfaceC19588dp2
    /* renamed from: D */
    public final void mo31671D(int i, long j) {
        this.f1348a.zza(i, j);
    }

    @Override // p000.InterfaceC19588dp2
    /* renamed from: E */
    public final void mo31670E(int i, String str) {
        this.f1348a.zza(i, str);
    }

    @Override // p000.InterfaceC19588dp2
    /* renamed from: F */
    public final void mo31669F(int i, List list, InterfaceC18637Vk2 interfaceC18637Vk2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo31659P(i, list.get(i2), interfaceC18637Vk2);
        }
    }

    @Override // p000.InterfaceC19588dp2
    /* renamed from: G */
    public final void mo31668G(int i, AbstractC23351zi2 abstractC23351zi2, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f1348a.zzb(i, 2);
            this.f1348a.zzo(zzdg.m48153a(abstractC23351zi2, entry.getKey(), entry.getValue()));
            zzdg.m48152b(this.f1348a, abstractC23351zi2, entry.getKey(), entry.getValue());
        }
    }

    @Override // p000.InterfaceC19588dp2
    /* renamed from: H */
    public final void mo31667H(int i, List list, InterfaceC18637Vk2 interfaceC18637Vk2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo31660O(i, list.get(i2), interfaceC18637Vk2);
        }
    }

    @Override // p000.InterfaceC19588dp2
    /* renamed from: I */
    public final void mo31666I(int i, int i2) {
        this.f1348a.zzc(i, i2);
    }

    @Override // p000.InterfaceC19588dp2
    /* renamed from: J */
    public final void mo31665J(int i) {
        this.f1348a.zzb(i, 3);
    }

    @Override // p000.InterfaceC19588dp2
    /* renamed from: K */
    public final void mo31664K(int i, int i2) {
        this.f1348a.zzf(i, i2);
    }

    @Override // p000.InterfaceC19588dp2
    /* renamed from: L */
    public final void mo31663L(int i) {
        this.f1348a.zzb(i, 4);
    }

    @Override // p000.InterfaceC19588dp2
    /* renamed from: M */
    public final void mo31662M(int i, zzbb zzbbVar) {
        this.f1348a.zza(i, zzbbVar);
    }

    @Override // p000.InterfaceC19588dp2
    /* renamed from: N */
    public final int mo31661N() {
        return zzcg.zzg.zzko;
    }

    @Override // p000.InterfaceC19588dp2
    /* renamed from: O */
    public final void mo31660O(int i, Object obj, InterfaceC18637Vk2 interfaceC18637Vk2) {
        zzbn zzbnVar = this.f1348a;
        zzbnVar.zzb(i, 3);
        interfaceC18637Vk2.mo48251b((zzdo) obj, zzbnVar.f45537a);
        zzbnVar.zzb(i, 4);
    }

    @Override // p000.InterfaceC19588dp2
    /* renamed from: P */
    public final void mo31659P(int i, Object obj, InterfaceC18637Vk2 interfaceC18637Vk2) {
        this.f1348a.mo48172a(i, (zzdo) obj, interfaceC18637Vk2);
    }

    @Override // p000.InterfaceC19588dp2
    /* renamed from: a */
    public final void mo31658a(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1348a.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.zze(((Long) list.get(i4)).longValue());
            }
            this.f1348a.zzo(i3);
            while (i2 < list.size()) {
                this.f1348a.zzb(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1348a.zza(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC19588dp2
    /* renamed from: b */
    public final void mo31657b(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1348a.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.zzi(((Long) list.get(i4)).longValue());
            }
            this.f1348a.zzo(i3);
            while (i2 < list.size()) {
                this.f1348a.zzd(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1348a.zzc(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC19588dp2
    /* renamed from: c */
    public final void mo31656c(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1348a.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.zzt(((Integer) list.get(i4)).intValue());
            }
            this.f1348a.zzo(i3);
            while (i2 < list.size()) {
                this.f1348a.zzo(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1348a.zzd(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC19588dp2
    /* renamed from: d */
    public final void mo31655d(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1348a.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.zzb(((Double) list.get(i4)).doubleValue());
            }
            this.f1348a.zzo(i3);
            while (i2 < list.size()) {
                this.f1348a.zza(((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1348a.zza(i, ((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC19588dp2
    /* renamed from: e */
    public final void mo31654e(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1348a.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.zzg(((Long) list.get(i4)).longValue());
            }
            this.f1348a.zzo(i3);
            while (i2 < list.size()) {
                this.f1348a.zzc(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1348a.zzb(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC19588dp2
    /* renamed from: f */
    public final void mo31653f(int i, long j) {
        this.f1348a.zzb(i, j);
    }

    @Override // p000.InterfaceC19588dp2
    /* renamed from: g */
    public final void mo31652g(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1348a.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.zzs(((Integer) list.get(i4)).intValue());
            }
            this.f1348a.zzo(i3);
            while (i2 < list.size()) {
                this.f1348a.zzn(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1348a.zzc(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC19588dp2
    /* renamed from: h */
    public final void mo31651h(int i, boolean z) {
        this.f1348a.zzb(i, z);
    }

    @Override // p000.InterfaceC19588dp2
    /* renamed from: i */
    public final void mo31650i(int i, long j) {
        this.f1348a.zzc(i, j);
    }

    @Override // p000.InterfaceC19588dp2
    /* renamed from: j */
    public final void mo31649j(int i, Object obj) {
        if (obj instanceof zzbb) {
            this.f1348a.zzb(i, (zzbb) obj);
        } else {
            this.f1348a.zzb(i, (zzdo) obj);
        }
    }

    @Override // p000.InterfaceC19588dp2
    /* renamed from: k */
    public final void mo31648k(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1348a.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.zzv(((Integer) list.get(i4)).intValue());
            }
            this.f1348a.zzo(i3);
            while (i2 < list.size()) {
                this.f1348a.zzq(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1348a.zzf(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC19588dp2
    /* renamed from: l */
    public final void mo31647l(int i, long j) {
        this.f1348a.zza(i, j);
    }

    @Override // p000.InterfaceC19588dp2
    /* renamed from: m */
    public final void mo31646m(int i, double d) {
        this.f1348a.zza(i, d);
    }

    @Override // p000.InterfaceC19588dp2
    /* renamed from: n */
    public final void mo31645n(int i, float f) {
        this.f1348a.zza(i, f);
    }

    @Override // p000.InterfaceC19588dp2
    /* renamed from: o */
    public final void mo31644o(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1348a.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.zzb(((Boolean) list.get(i4)).booleanValue());
            }
            this.f1348a.zzo(i3);
            while (i2 < list.size()) {
                this.f1348a.zza(((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1348a.zzb(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC19588dp2
    /* renamed from: p */
    public final void mo31643p(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1348a.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.zzx(((Integer) list.get(i4)).intValue());
            }
            this.f1348a.zzo(i3);
            while (i2 < list.size()) {
                this.f1348a.zzn(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1348a.zzc(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC19588dp2
    /* renamed from: q */
    public final void mo31642q(int i, int i2) {
        this.f1348a.zzc(i, i2);
    }

    @Override // p000.InterfaceC19588dp2
    /* renamed from: r */
    public final void mo31641r(int i, int i2) {
        this.f1348a.zzf(i, i2);
    }

    @Override // p000.InterfaceC19588dp2
    /* renamed from: s */
    public final void mo31640s(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1348a.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.zzw(((Integer) list.get(i4)).intValue());
            }
            this.f1348a.zzo(i3);
            while (i2 < list.size()) {
                this.f1348a.zzq(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1348a.zzf(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC19588dp2
    /* renamed from: t */
    public final void mo31639t(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1348a.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.zzh(((Long) list.get(i4)).longValue());
            }
            this.f1348a.zzo(i3);
            while (i2 < list.size()) {
                this.f1348a.zzd(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1348a.zzc(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC19588dp2
    /* renamed from: u */
    public final void mo31638u(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1348a.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.zzf(((Long) list.get(i4)).longValue());
            }
            this.f1348a.zzo(i3);
            while (i2 < list.size()) {
                this.f1348a.zzb(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1348a.zza(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC19588dp2
    /* renamed from: v */
    public final void mo31637v(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1348a.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.zzb(((Float) list.get(i4)).floatValue());
            }
            this.f1348a.zzo(i3);
            while (i2 < list.size()) {
                this.f1348a.zza(((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1348a.zza(i, ((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC19588dp2
    /* renamed from: w */
    public final void mo31636w(int i, int i2) {
        this.f1348a.zzd(i, i2);
    }

    @Override // p000.InterfaceC19588dp2
    /* renamed from: x */
    public final void mo31635x(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f1348a.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbn.zzu(((Integer) list.get(i4)).intValue());
            }
            this.f1348a.zzo(i3);
            while (i2 < list.size()) {
                this.f1348a.zzp(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1348a.zze(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC19588dp2
    /* renamed from: y */
    public final void mo31634y(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f1348a.zza(i, (zzbb) list.get(i2));
        }
    }

    @Override // p000.InterfaceC19588dp2
    /* renamed from: z */
    public final void mo31633z(int i, List list) {
        int i2 = 0;
        if (list instanceof zzcx) {
            zzcx zzcxVar = (zzcx) list;
            while (i2 < list.size()) {
                Object raw = zzcxVar.getRaw(i2);
                if (raw instanceof String) {
                    this.f1348a.zza(i, (String) raw);
                } else {
                    this.f1348a.zza(i, (zzbb) raw);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f1348a.zza(i, (String) list.get(i2));
            i2++;
        }
    }
}
