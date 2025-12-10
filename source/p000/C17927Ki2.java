package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C6567a;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzck;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzem;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzew;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: Ki2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17927Ki2 implements InterfaceC19090av2 {

    /* renamed from: a */
    public final zzdj f3261a;

    public C17927Ki2(zzdj zzdjVar) {
        Charset charset = zzem.f46969a;
        this.f3261a = zzdjVar;
        zzdjVar.f46961a = this;
    }

    /* renamed from: K */
    public static C17927Ki2 m67597K(zzdj zzdjVar) {
        C17927Ki2 c17927Ki2 = zzdjVar.f46961a;
        if (c17927Ki2 != null) {
            return c17927Ki2;
        }
        return new C17927Ki2(zzdjVar);
    }

    @Override // p000.InterfaceC19090av2
    /* renamed from: A */
    public final void mo52116A(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f3261a.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = ((Integer) list.get(i4)).intValue();
                i3 += zzdj.zzy((intValue >> 31) ^ (intValue + intValue));
            }
            this.f3261a.zzq(i3);
            while (i2 < list.size()) {
                zzdj zzdjVar = this.f3261a;
                int intValue2 = ((Integer) list.get(i2)).intValue();
                zzdjVar.zzq((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            zzdj zzdjVar2 = this.f3261a;
            int intValue3 = ((Integer) list.get(i2)).intValue();
            zzdjVar2.zzp(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    @Override // p000.InterfaceC19090av2
    /* renamed from: B */
    public final void mo52115B(int i, Object obj) {
        if (obj instanceof zzdb) {
            C6567a c6567a = (C6567a) this.f3261a;
            c6567a.zzq(11);
            c6567a.zzp(2, i);
            c6567a.zze(3, (zzdb) obj);
            c6567a.zzq(12);
            return;
        }
        zzdj zzdjVar = this.f3261a;
        zzfo zzfoVar = (zzfo) obj;
        C6567a c6567a2 = (C6567a) zzdjVar;
        c6567a2.zzq(11);
        c6567a2.zzp(2, i);
        c6567a2.zzq(26);
        c6567a2.zzq(zzfoVar.zzE());
        zzfoVar.zzaa(zzdjVar);
        c6567a2.zzq(12);
    }

    @Override // p000.InterfaceC19090av2
    /* renamed from: C */
    public final void mo52114C(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f3261a.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = ((Long) list.get(i4)).longValue();
                i3 += zzdj.zzz((longValue >> 63) ^ (longValue + longValue));
            }
            this.f3261a.zzq(i3);
            while (i2 < list.size()) {
                zzdj zzdjVar = this.f3261a;
                long longValue2 = ((Long) list.get(i2)).longValue();
                zzdjVar.zzs((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            zzdj zzdjVar2 = this.f3261a;
            long longValue3 = ((Long) list.get(i2)).longValue();
            zzdjVar2.zzr(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    @Override // p000.InterfaceC19090av2
    /* renamed from: D */
    public final void mo52113D(int i, List list) {
        int i2 = 0;
        if (list instanceof zzew) {
            zzew zzewVar = (zzew) list;
            while (i2 < list.size()) {
                Object zzf = zzewVar.zzf(i2);
                if (zzf instanceof String) {
                    this.f3261a.zzm(i, (String) zzf);
                } else {
                    this.f3261a.zze(i, (zzdb) zzf);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f3261a.zzm(i, (String) list.get(i2));
            i2++;
        }
    }

    @Override // p000.InterfaceC19090av2
    /* renamed from: E */
    public final void mo52112E(int i, long j) {
        this.f3261a.zzr(i, j);
    }

    @Override // p000.InterfaceC19090av2
    /* renamed from: F */
    public final void mo52111F(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f3261a.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdj.zzz(((Long) list.get(i4)).longValue());
            }
            this.f3261a.zzq(i3);
            while (i2 < list.size()) {
                this.f3261a.zzs(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f3261a.zzr(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC19090av2
    /* renamed from: G */
    public final void mo52110G(int i, int i2) {
        this.f3261a.zzf(i, i2);
    }

    @Override // p000.InterfaceC19090av2
    /* renamed from: H */
    public final void mo52109H(int i, zzdb zzdbVar) {
        this.f3261a.zze(i, zzdbVar);
    }

    @Override // p000.InterfaceC19090av2
    /* renamed from: I */
    public final void mo52108I(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f3261a.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f3261a.zzq(i3);
            while (i2 < list.size()) {
                this.f3261a.zzg(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f3261a.zzf(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC19090av2
    /* renamed from: J */
    public final void mo52107J(int i, long j) {
        this.f3261a.zzh(i, j);
    }

    @Override // p000.InterfaceC19090av2
    /* renamed from: a */
    public final void mo52106a(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f3261a.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            this.f3261a.zzq(i3);
            while (i2 < list.size()) {
                this.f3261a.zzb(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f3261a.zzd(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC19090av2
    /* renamed from: b */
    public final void mo52105b(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f3261a.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f3261a.zzq(i3);
            while (i2 < list.size()) {
                this.f3261a.zzg(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f3261a.zzf(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC19090av2
    /* renamed from: c */
    public final void mo52104c(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f3261a.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdj.zzu(((Integer) list.get(i4)).intValue());
            }
            this.f3261a.zzq(i3);
            while (i2 < list.size()) {
                this.f3261a.zzk(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f3261a.zzj(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC19090av2
    /* renamed from: d */
    public final void mo52103d(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f3261a.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            this.f3261a.zzq(i3);
            while (i2 < list.size()) {
                this.f3261a.zzi(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f3261a.zzh(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    @Override // p000.InterfaceC19090av2
    /* renamed from: e */
    public final void mo52102e(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f3261a.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f3261a.zzq(i3);
            while (i2 < list.size()) {
                this.f3261a.zzi(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f3261a.zzh(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC19090av2
    /* renamed from: f */
    public final void mo52101f(int i, double d) {
        this.f3261a.zzh(i, Double.doubleToRawLongBits(d));
    }

    @Override // p000.InterfaceC19090av2
    /* renamed from: g */
    public final void mo52100g(int i, float f) {
        this.f3261a.zzf(i, Float.floatToRawIntBits(f));
    }

    @Override // p000.InterfaceC19090av2
    /* renamed from: h */
    public final void mo52099h(int i, boolean z) {
        this.f3261a.zzd(i, z);
    }

    @Override // p000.InterfaceC19090av2
    /* renamed from: i */
    public final void mo52098i(int i, long j) {
        this.f3261a.zzh(i, j);
    }

    @Override // p000.InterfaceC19090av2
    /* renamed from: j */
    public final void mo52097j(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f3261a.zze(i, (zzdb) list.get(i2));
        }
    }

    @Override // p000.InterfaceC19090av2
    /* renamed from: k */
    public final void mo52096k(int i, long j) {
        this.f3261a.zzr(i, j);
    }

    @Override // p000.InterfaceC19090av2
    /* renamed from: l */
    public final void mo52095l(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f3261a.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdj.zzu(((Integer) list.get(i4)).intValue());
            }
            this.f3261a.zzq(i3);
            while (i2 < list.size()) {
                this.f3261a.zzk(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f3261a.zzj(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC19090av2
    /* renamed from: m */
    public final void mo52094m(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f3261a.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            this.f3261a.zzq(i3);
            while (i2 < list.size()) {
                this.f3261a.zzg(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f3261a.zzf(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    @Override // p000.InterfaceC19090av2
    /* renamed from: n */
    public final void mo52093n(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f3261a.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdj.zzz(((Long) list.get(i4)).longValue());
            }
            this.f3261a.zzq(i3);
            while (i2 < list.size()) {
                this.f3261a.zzs(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f3261a.zzr(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC19090av2
    /* renamed from: o */
    public final void mo52092o(int i, String str) {
        this.f3261a.zzm(i, str);
    }

    @Override // p000.InterfaceC19090av2
    /* renamed from: p */
    public final void mo52091p(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f3261a.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f3261a.zzq(i3);
            while (i2 < list.size()) {
                this.f3261a.zzi(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f3261a.zzh(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC19090av2
    /* renamed from: q */
    public final void mo52090q(int i, int i2) {
        this.f3261a.zzf(i, i2);
    }

    @Override // p000.InterfaceC19090av2
    /* renamed from: r */
    public final void mo52089r(int i, int i2) {
        this.f3261a.zzj(i, i2);
    }

    @Override // p000.InterfaceC19090av2
    /* renamed from: s */
    public final void mo52088s(int i, long j) {
        this.f3261a.zzr(i, (j >> 63) ^ (j + j));
    }

    @Override // p000.InterfaceC19090av2
    /* renamed from: t */
    public final void mo52087t(int i, Object obj, Rq2 rq2) {
        zzfo zzfoVar = (zzfo) obj;
        C6567a c6567a = (C6567a) this.f3261a;
        c6567a.zzq((i << 3) | 2);
        c6567a.zzq(((zzck) zzfoVar).mo46881a(rq2));
        rq2.mo46921b(zzfoVar, c6567a.f46961a);
    }

    @Override // p000.InterfaceC19090av2
    /* renamed from: u */
    public final void mo52086u(int i, int i2) {
        this.f3261a.zzp(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // p000.InterfaceC19090av2
    /* renamed from: v */
    public final void mo52085v(int i) {
        this.f3261a.zzo(i, 3);
    }

    @Override // p000.InterfaceC19090av2
    /* renamed from: w */
    public final void mo52084w(int i, int i2) {
        this.f3261a.zzj(i, i2);
    }

    @Override // p000.InterfaceC19090av2
    /* renamed from: x */
    public final void mo52083x(int i, Object obj, Rq2 rq2) {
        zzdj zzdjVar = this.f3261a;
        zzdjVar.zzo(i, 3);
        rq2.mo46921b((zzfo) obj, zzdjVar.f46961a);
        zzdjVar.zzo(i, 4);
    }

    @Override // p000.InterfaceC19090av2
    /* renamed from: y */
    public final void mo52082y(int i, int i2) {
        this.f3261a.zzp(i, i2);
    }

    @Override // p000.InterfaceC19090av2
    /* renamed from: z */
    public final void mo52081z(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f3261a.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdj.zzy(((Integer) list.get(i4)).intValue());
            }
            this.f3261a.zzq(i3);
            while (i2 < list.size()) {
                this.f3261a.zzq(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f3261a.zzp(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC19090av2
    public final void zzh(int i) {
        this.f3261a.zzo(i, 4);
    }
}
