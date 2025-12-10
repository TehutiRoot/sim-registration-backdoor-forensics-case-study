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

/* renamed from: Cx2 */
/* loaded from: classes3.dex */
public final class Cx2 implements InterfaceC21048mH2 {

    /* renamed from: a */
    public final zzii f872a;

    public Cx2(zzii zziiVar) {
        zzii zziiVar2 = (zzii) zzjf.m46419d(zziiVar, "output");
        this.f872a = zziiVar2;
        zziiVar2.f47621a = this;
    }

    /* renamed from: K */
    public static Cx2 m68717K(zzii zziiVar) {
        Cx2 cx2 = zziiVar.f47621a;
        if (cx2 != null) {
            return cx2;
        }
        return new Cx2(zziiVar);
    }

    @Override // p000.InterfaceC21048mH2
    /* renamed from: A */
    public final void mo26310A(int i, boolean z) {
        this.f872a.zza(i, z);
    }

    @Override // p000.InterfaceC21048mH2
    /* renamed from: B */
    public final void mo26309B(int i, int i2) {
        this.f872a.zzc(i, i2);
    }

    @Override // p000.InterfaceC21048mH2
    /* renamed from: C */
    public final void mo26308C(int i, long j) {
        this.f872a.zzc(i, j);
    }

    @Override // p000.InterfaceC21048mH2
    /* renamed from: D */
    public final void mo26307D(int i, long j) {
        this.f872a.zzb(i, j);
    }

    @Override // p000.InterfaceC21048mH2
    /* renamed from: E */
    public final void mo26306E(int i, String str) {
        this.f872a.zza(i, str);
    }

    @Override // p000.InterfaceC21048mH2
    /* renamed from: F */
    public final void mo26305F(int i, Object obj, InterfaceC19835fE2 interfaceC19835fE2) {
        zzii zziiVar = this.f872a;
        zziiVar.zza(i, 3);
        interfaceC19835fE2.mo31333c((zzkk) obj, zziiVar.f47621a);
        zziiVar.zza(i, 4);
    }

    @Override // p000.InterfaceC21048mH2
    /* renamed from: G */
    public final void mo26304G(int i, zzht zzhtVar) {
        this.f872a.zza(i, zzhtVar);
    }

    @Override // p000.InterfaceC21048mH2
    /* renamed from: H */
    public final void mo26303H(int i, Object obj, InterfaceC19835fE2 interfaceC19835fE2) {
        this.f872a.mo46437b(i, (zzkk) obj, interfaceC19835fE2);
    }

    @Override // p000.InterfaceC21048mH2
    /* renamed from: I */
    public final void mo26302I(int i, List list, InterfaceC19835fE2 interfaceC19835fE2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo26305F(i, list.get(i2), interfaceC19835fE2);
        }
    }

    @Override // p000.InterfaceC21048mH2
    /* renamed from: J */
    public final void mo26301J(int i, List list, InterfaceC19835fE2 interfaceC19835fE2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo26303H(i, list.get(i2), interfaceC19835fE2);
        }
    }

    @Override // p000.InterfaceC21048mH2
    /* renamed from: a */
    public final void mo26300a(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f872a.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.zzd(((Long) list.get(i4)).longValue());
            }
            this.f872a.zzb(i3);
            while (i2 < list.size()) {
                this.f872a.zza(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f872a.zza(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC21048mH2
    /* renamed from: b */
    public final void mo26299b(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f872a.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.zzh(((Long) list.get(i4)).longValue());
            }
            this.f872a.zzb(i3);
            while (i2 < list.size()) {
                this.f872a.zzc(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f872a.zzc(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC21048mH2
    /* renamed from: c */
    public final void mo26298c(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f872a.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.zzg(((Integer) list.get(i4)).intValue());
            }
            this.f872a.zzb(i3);
            while (i2 < list.size()) {
                this.f872a.zzb(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f872a.zzc(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC21048mH2
    /* renamed from: d */
    public final void mo26297d(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f872a.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.zzb(((Double) list.get(i4)).doubleValue());
            }
            this.f872a.zzb(i3);
            while (i2 < list.size()) {
                this.f872a.zza(((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f872a.zza(i, ((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC21048mH2
    /* renamed from: e */
    public final void mo26296e(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f872a.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.zzf(((Long) list.get(i4)).longValue());
            }
            this.f872a.zzb(i3);
            while (i2 < list.size()) {
                this.f872a.zzb(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f872a.zzb(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC21048mH2
    /* renamed from: f */
    public final void mo26295f(int i, long j) {
        this.f872a.zzc(i, j);
    }

    @Override // p000.InterfaceC21048mH2
    /* renamed from: g */
    public final void mo26294g(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f872a.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.zzf(((Integer) list.get(i4)).intValue());
            }
            this.f872a.zzb(i3);
            while (i2 < list.size()) {
                this.f872a.zza(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f872a.zzb(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC21048mH2
    /* renamed from: h */
    public final void mo26293h(int i, AbstractC21033mC2 abstractC21033mC2, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f872a.zza(i, 2);
            this.f872a.zzb(zzkc.m46415a(abstractC21033mC2, entry.getKey(), entry.getValue()));
            zzkc.m46414b(this.f872a, abstractC21033mC2, entry.getKey(), entry.getValue());
        }
    }

    @Override // p000.InterfaceC21048mH2
    /* renamed from: i */
    public final void mo26292i(int i, long j) {
        this.f872a.zza(i, j);
    }

    @Override // p000.InterfaceC21048mH2
    /* renamed from: j */
    public final void mo26291j(int i, Object obj) {
        if (obj instanceof zzht) {
            this.f872a.zzb(i, (zzht) obj);
        } else {
            this.f872a.zza(i, (zzkk) obj);
        }
    }

    @Override // p000.InterfaceC21048mH2
    /* renamed from: k */
    public final void mo26290k(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f872a.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.zzi(((Integer) list.get(i4)).intValue());
            }
            this.f872a.zzb(i3);
            while (i2 < list.size()) {
                this.f872a.zzd(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f872a.zze(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC21048mH2
    /* renamed from: l */
    public final void mo26289l(int i, long j) {
        this.f872a.zza(i, j);
    }

    @Override // p000.InterfaceC21048mH2
    /* renamed from: m */
    public final void mo26288m(int i, double d) {
        this.f872a.zza(i, d);
    }

    @Override // p000.InterfaceC21048mH2
    /* renamed from: n */
    public final void mo26287n(int i, float f) {
        this.f872a.zza(i, f);
    }

    @Override // p000.InterfaceC21048mH2
    /* renamed from: o */
    public final void mo26286o(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f872a.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.zzb(((Boolean) list.get(i4)).booleanValue());
            }
            this.f872a.zzb(i3);
            while (i2 < list.size()) {
                this.f872a.zza(((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f872a.zza(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC21048mH2
    /* renamed from: p */
    public final void mo26285p(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f872a.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.zzk(((Integer) list.get(i4)).intValue());
            }
            this.f872a.zzb(i3);
            while (i2 < list.size()) {
                this.f872a.zza(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f872a.zzb(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC21048mH2
    /* renamed from: q */
    public final void mo26284q(int i, int i2) {
        this.f872a.zzb(i, i2);
    }

    @Override // p000.InterfaceC21048mH2
    /* renamed from: r */
    public final void mo26283r(int i, int i2) {
        this.f872a.zzd(i, i2);
    }

    @Override // p000.InterfaceC21048mH2
    /* renamed from: s */
    public final void mo26282s(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f872a.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.zzj(((Integer) list.get(i4)).intValue());
            }
            this.f872a.zzb(i3);
            while (i2 < list.size()) {
                this.f872a.zzd(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f872a.zze(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC21048mH2
    /* renamed from: t */
    public final void mo26281t(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f872a.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.zzg(((Long) list.get(i4)).longValue());
            }
            this.f872a.zzb(i3);
            while (i2 < list.size()) {
                this.f872a.zzc(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f872a.zzc(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC21048mH2
    /* renamed from: u */
    public final void mo26280u(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f872a.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.zze(((Long) list.get(i4)).longValue());
            }
            this.f872a.zzb(i3);
            while (i2 < list.size()) {
                this.f872a.zza(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f872a.zza(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC21048mH2
    /* renamed from: v */
    public final void mo26279v(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f872a.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.zzb(((Float) list.get(i4)).floatValue());
            }
            this.f872a.zzb(i3);
            while (i2 < list.size()) {
                this.f872a.zza(((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f872a.zza(i, ((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC21048mH2
    /* renamed from: w */
    public final void mo26278w(int i, int i2) {
        this.f872a.zze(i, i2);
    }

    @Override // p000.InterfaceC21048mH2
    /* renamed from: x */
    public final void mo26277x(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f872a.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.zzh(((Integer) list.get(i4)).intValue());
            }
            this.f872a.zzb(i3);
            while (i2 < list.size()) {
                this.f872a.zzc(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f872a.zzd(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC21048mH2
    /* renamed from: y */
    public final void mo26276y(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f872a.zza(i, (zzht) list.get(i2));
        }
    }

    @Override // p000.InterfaceC21048mH2
    /* renamed from: z */
    public final void mo26275z(int i, List list) {
        int i2 = 0;
        if (list instanceof zzjv) {
            zzjv zzjvVar = (zzjv) list;
            while (i2 < list.size()) {
                Object zzb = zzjvVar.zzb(i2);
                if (zzb instanceof String) {
                    this.f872a.zza(i, (String) zzb);
                } else {
                    this.f872a.zza(i, (zzht) zzb);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f872a.zza(i, (String) list.get(i2));
            i2++;
        }
    }

    @Override // p000.InterfaceC21048mH2
    public final int zza() {
        return zzmq.zza;
    }

    @Override // p000.InterfaceC21048mH2
    public final void zzb(int i, int i2) {
        this.f872a.zzb(i, i2);
    }

    @Override // p000.InterfaceC21048mH2
    public final void zza(int i, int i2) {
        this.f872a.zze(i, i2);
    }

    @Override // p000.InterfaceC21048mH2
    public final void zzb(int i) {
        this.f872a.zza(i, 4);
    }

    @Override // p000.InterfaceC21048mH2
    public final void zza(int i) {
        this.f872a.zza(i, 3);
    }
}
