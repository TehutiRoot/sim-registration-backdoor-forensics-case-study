package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C6556a;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzck;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzem;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzew;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: Hj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17768Hj2 implements Xv2 {

    /* renamed from: a */
    public final zzdj f2462a;

    public C17768Hj2(zzdj zzdjVar) {
        Charset charset = zzem.f46981a;
        this.f2462a = zzdjVar;
        zzdjVar.f46973a = this;
    }

    /* renamed from: K */
    public static C17768Hj2 m68098K(zzdj zzdjVar) {
        C17768Hj2 c17768Hj2 = zzdjVar.f46973a;
        if (c17768Hj2 != null) {
            return c17768Hj2;
        }
        return new C17768Hj2(zzdjVar);
    }

    @Override // p000.Xv2
    /* renamed from: A */
    public final void mo65561A(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f2462a.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = ((Integer) list.get(i4)).intValue();
                i3 += zzdj.zzy((intValue >> 31) ^ (intValue + intValue));
            }
            this.f2462a.zzq(i3);
            while (i2 < list.size()) {
                zzdj zzdjVar = this.f2462a;
                int intValue2 = ((Integer) list.get(i2)).intValue();
                zzdjVar.zzq((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            zzdj zzdjVar2 = this.f2462a;
            int intValue3 = ((Integer) list.get(i2)).intValue();
            zzdjVar2.zzp(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    @Override // p000.Xv2
    /* renamed from: B */
    public final void mo65560B(int i, Object obj) {
        if (obj instanceof zzdb) {
            C6556a c6556a = (C6556a) this.f2462a;
            c6556a.zzq(11);
            c6556a.zzp(2, i);
            c6556a.zze(3, (zzdb) obj);
            c6556a.zzq(12);
            return;
        }
        zzdj zzdjVar = this.f2462a;
        zzfo zzfoVar = (zzfo) obj;
        C6556a c6556a2 = (C6556a) zzdjVar;
        c6556a2.zzq(11);
        c6556a2.zzp(2, i);
        c6556a2.zzq(26);
        c6556a2.zzq(zzfoVar.zzE());
        zzfoVar.zzaa(zzdjVar);
        c6556a2.zzq(12);
    }

    @Override // p000.Xv2
    /* renamed from: C */
    public final void mo65559C(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f2462a.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = ((Long) list.get(i4)).longValue();
                i3 += zzdj.zzz((longValue >> 63) ^ (longValue + longValue));
            }
            this.f2462a.zzq(i3);
            while (i2 < list.size()) {
                zzdj zzdjVar = this.f2462a;
                long longValue2 = ((Long) list.get(i2)).longValue();
                zzdjVar.zzs((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            zzdj zzdjVar2 = this.f2462a;
            long longValue3 = ((Long) list.get(i2)).longValue();
            zzdjVar2.zzr(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    @Override // p000.Xv2
    /* renamed from: D */
    public final void mo65558D(int i, List list) {
        int i2 = 0;
        if (list instanceof zzew) {
            zzew zzewVar = (zzew) list;
            while (i2 < list.size()) {
                Object zzf = zzewVar.zzf(i2);
                if (zzf instanceof String) {
                    this.f2462a.zzm(i, (String) zzf);
                } else {
                    this.f2462a.zze(i, (zzdb) zzf);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f2462a.zzm(i, (String) list.get(i2));
            i2++;
        }
    }

    @Override // p000.Xv2
    /* renamed from: E */
    public final void mo65557E(int i, long j) {
        this.f2462a.zzr(i, j);
    }

    @Override // p000.Xv2
    /* renamed from: F */
    public final void mo65556F(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f2462a.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdj.zzz(((Long) list.get(i4)).longValue());
            }
            this.f2462a.zzq(i3);
            while (i2 < list.size()) {
                this.f2462a.zzs(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f2462a.zzr(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.Xv2
    /* renamed from: G */
    public final void mo65555G(int i, int i2) {
        this.f2462a.zzf(i, i2);
    }

    @Override // p000.Xv2
    /* renamed from: H */
    public final void mo65554H(int i, zzdb zzdbVar) {
        this.f2462a.zze(i, zzdbVar);
    }

    @Override // p000.Xv2
    /* renamed from: I */
    public final void mo65553I(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f2462a.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f2462a.zzq(i3);
            while (i2 < list.size()) {
                this.f2462a.zzg(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f2462a.zzf(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.Xv2
    /* renamed from: J */
    public final void mo65552J(int i, long j) {
        this.f2462a.zzh(i, j);
    }

    @Override // p000.Xv2
    /* renamed from: a */
    public final void mo65551a(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f2462a.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            this.f2462a.zzq(i3);
            while (i2 < list.size()) {
                this.f2462a.zzb(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f2462a.zzd(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    @Override // p000.Xv2
    /* renamed from: b */
    public final void mo65550b(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f2462a.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f2462a.zzq(i3);
            while (i2 < list.size()) {
                this.f2462a.zzg(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f2462a.zzf(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.Xv2
    /* renamed from: c */
    public final void mo65549c(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f2462a.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdj.zzu(((Integer) list.get(i4)).intValue());
            }
            this.f2462a.zzq(i3);
            while (i2 < list.size()) {
                this.f2462a.zzk(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f2462a.zzj(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.Xv2
    /* renamed from: d */
    public final void mo65548d(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f2462a.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            this.f2462a.zzq(i3);
            while (i2 < list.size()) {
                this.f2462a.zzi(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f2462a.zzh(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    @Override // p000.Xv2
    /* renamed from: e */
    public final void mo65547e(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f2462a.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f2462a.zzq(i3);
            while (i2 < list.size()) {
                this.f2462a.zzi(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f2462a.zzh(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.Xv2
    /* renamed from: f */
    public final void mo65546f(int i, double d) {
        this.f2462a.zzh(i, Double.doubleToRawLongBits(d));
    }

    @Override // p000.Xv2
    /* renamed from: g */
    public final void mo65545g(int i, float f) {
        this.f2462a.zzf(i, Float.floatToRawIntBits(f));
    }

    @Override // p000.Xv2
    /* renamed from: h */
    public final void mo65544h(int i, boolean z) {
        this.f2462a.zzd(i, z);
    }

    @Override // p000.Xv2
    /* renamed from: i */
    public final void mo65543i(int i, long j) {
        this.f2462a.zzh(i, j);
    }

    @Override // p000.Xv2
    /* renamed from: j */
    public final void mo65542j(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f2462a.zze(i, (zzdb) list.get(i2));
        }
    }

    @Override // p000.Xv2
    /* renamed from: k */
    public final void mo65541k(int i, long j) {
        this.f2462a.zzr(i, j);
    }

    @Override // p000.Xv2
    /* renamed from: l */
    public final void mo65540l(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f2462a.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdj.zzu(((Integer) list.get(i4)).intValue());
            }
            this.f2462a.zzq(i3);
            while (i2 < list.size()) {
                this.f2462a.zzk(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f2462a.zzj(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.Xv2
    /* renamed from: m */
    public final void mo65539m(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f2462a.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            this.f2462a.zzq(i3);
            while (i2 < list.size()) {
                this.f2462a.zzg(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f2462a.zzf(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    @Override // p000.Xv2
    /* renamed from: n */
    public final void mo65538n(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f2462a.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdj.zzz(((Long) list.get(i4)).longValue());
            }
            this.f2462a.zzq(i3);
            while (i2 < list.size()) {
                this.f2462a.zzs(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f2462a.zzr(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.Xv2
    /* renamed from: o */
    public final void mo65537o(int i, String str) {
        this.f2462a.zzm(i, str);
    }

    @Override // p000.Xv2
    /* renamed from: p */
    public final void mo65536p(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f2462a.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f2462a.zzq(i3);
            while (i2 < list.size()) {
                this.f2462a.zzi(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f2462a.zzh(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.Xv2
    /* renamed from: q */
    public final void mo65535q(int i, int i2) {
        this.f2462a.zzf(i, i2);
    }

    @Override // p000.Xv2
    /* renamed from: r */
    public final void mo65534r(int i, int i2) {
        this.f2462a.zzj(i, i2);
    }

    @Override // p000.Xv2
    /* renamed from: s */
    public final void mo65533s(int i, long j) {
        this.f2462a.zzr(i, (j >> 63) ^ (j + j));
    }

    @Override // p000.Xv2
    /* renamed from: t */
    public final void mo65532t(int i, Object obj, Or2 or2) {
        zzfo zzfoVar = (zzfo) obj;
        C6556a c6556a = (C6556a) this.f2462a;
        c6556a.zzq((i << 3) | 2);
        c6556a.zzq(((zzck) zzfoVar).mo46873a(or2));
        or2.mo46913b(zzfoVar, c6556a.f46973a);
    }

    @Override // p000.Xv2
    /* renamed from: u */
    public final void mo65531u(int i, int i2) {
        this.f2462a.zzp(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // p000.Xv2
    /* renamed from: v */
    public final void mo65530v(int i) {
        this.f2462a.zzo(i, 3);
    }

    @Override // p000.Xv2
    /* renamed from: w */
    public final void mo65529w(int i, int i2) {
        this.f2462a.zzj(i, i2);
    }

    @Override // p000.Xv2
    /* renamed from: x */
    public final void mo65528x(int i, Object obj, Or2 or2) {
        zzdj zzdjVar = this.f2462a;
        zzdjVar.zzo(i, 3);
        or2.mo46913b((zzfo) obj, zzdjVar.f46973a);
        zzdjVar.zzo(i, 4);
    }

    @Override // p000.Xv2
    /* renamed from: y */
    public final void mo65527y(int i, int i2) {
        this.f2462a.zzp(i, i2);
    }

    @Override // p000.Xv2
    /* renamed from: z */
    public final void mo65526z(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f2462a.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdj.zzy(((Integer) list.get(i4)).intValue());
            }
            this.f2462a.zzq(i3);
            while (i2 < list.size()) {
                this.f2462a.zzq(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f2462a.zzp(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.Xv2
    public final void zzh(int i) {
        this.f2462a.zzo(i, 4);
    }
}