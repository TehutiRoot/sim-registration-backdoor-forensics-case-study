package p000;

import com.google.android.gms.internal.measurement.C6528b;
import com.google.android.gms.internal.measurement.zzin;
import com.google.android.gms.internal.measurement.zzjd;
import com.google.android.gms.internal.measurement.zzjl;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.measurement.zzkt;
import com.google.android.gms.internal.measurement.zzll;
import java.util.List;

/* renamed from: sA2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22059sA2 implements InterfaceC18981aI2 {

    /* renamed from: a */
    public final zzjl f79606a;

    public C22059sA2(zzjl zzjlVar) {
        zzkm.m47151c(zzjlVar, "output");
        this.f79606a = zzjlVar;
        zzjlVar.f46324a = this;
    }

    /* renamed from: J */
    public static C22059sA2 m22684J(zzjl zzjlVar) {
        C22059sA2 c22059sA2 = zzjlVar.f46324a;
        if (c22059sA2 != null) {
            return c22059sA2;
        }
        return new C22059sA2(zzjlVar);
    }

    @Override // p000.InterfaceC18981aI2
    /* renamed from: A */
    public final void mo22693A(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f79606a.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = ((Integer) list.get(i4)).intValue();
                i3 += zzjl.zzA((intValue >> 31) ^ (intValue + intValue));
            }
            this.f79606a.zzq(i3);
            while (i2 < list.size()) {
                zzjl zzjlVar = this.f79606a;
                int intValue2 = ((Integer) list.get(i2)).intValue();
                zzjlVar.zzq((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            zzjl zzjlVar2 = this.f79606a;
            int intValue3 = ((Integer) list.get(i2)).intValue();
            zzjlVar2.zzp(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    @Override // p000.InterfaceC18981aI2
    /* renamed from: B */
    public final void mo22692B(int i, long j) {
        this.f79606a.zzr(i, j);
    }

    @Override // p000.InterfaceC18981aI2
    /* renamed from: C */
    public final void mo22691C(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f79606a.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = ((Long) list.get(i4)).longValue();
                i3 += zzjl.zzB((longValue >> 63) ^ (longValue + longValue));
            }
            this.f79606a.zzq(i3);
            while (i2 < list.size()) {
                zzjl zzjlVar = this.f79606a;
                long longValue2 = ((Long) list.get(i2)).longValue();
                zzjlVar.zzs((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            zzjl zzjlVar2 = this.f79606a;
            long longValue3 = ((Long) list.get(i2)).longValue();
            zzjlVar2.zzr(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    @Override // p000.InterfaceC18981aI2
    /* renamed from: D */
    public final void mo22690D(int i, Object obj, DF2 df2) {
        zzjl zzjlVar = this.f79606a;
        zzjlVar.zzo(i, 3);
        df2.mo47360a((zzll) obj, zzjlVar.f46324a);
        zzjlVar.zzo(i, 4);
    }

    @Override // p000.InterfaceC18981aI2
    /* renamed from: E */
    public final void mo22689E(int i, int i2) {
        this.f79606a.zzf(i, i2);
    }

    @Override // p000.InterfaceC18981aI2
    /* renamed from: F */
    public final void mo22688F(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f79606a.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzjl.zzB(((Long) list.get(i4)).longValue());
            }
            this.f79606a.zzq(i3);
            while (i2 < list.size()) {
                this.f79606a.zzs(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f79606a.zzr(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC18981aI2
    /* renamed from: G */
    public final void mo22687G(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f79606a.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f79606a.zzq(i3);
            while (i2 < list.size()) {
                this.f79606a.zzi(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f79606a.zzh(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC18981aI2
    /* renamed from: H */
    public final void mo22686H(int i, long j) {
        this.f79606a.zzh(i, j);
    }

    @Override // p000.InterfaceC18981aI2
    /* renamed from: I */
    public final void mo22685I(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f79606a.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f79606a.zzq(i3);
            while (i2 < list.size()) {
                this.f79606a.zzg(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f79606a.zzf(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC18981aI2
    /* renamed from: a */
    public final void mo22683a(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f79606a.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            this.f79606a.zzq(i3);
            while (i2 < list.size()) {
                this.f79606a.zzb(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f79606a.zzd(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC18981aI2
    /* renamed from: b */
    public final void mo22682b(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f79606a.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f79606a.zzq(i3);
            while (i2 < list.size()) {
                this.f79606a.zzg(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f79606a.zzf(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC18981aI2
    /* renamed from: c */
    public final void mo22681c(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f79606a.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzjl.zzv(((Integer) list.get(i4)).intValue());
            }
            this.f79606a.zzq(i3);
            while (i2 < list.size()) {
                this.f79606a.zzk(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f79606a.zzj(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC18981aI2
    /* renamed from: d */
    public final void mo22680d(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f79606a.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            this.f79606a.zzq(i3);
            while (i2 < list.size()) {
                this.f79606a.zzi(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f79606a.zzh(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    @Override // p000.InterfaceC18981aI2
    /* renamed from: e */
    public final void mo22679e(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f79606a.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f79606a.zzq(i3);
            while (i2 < list.size()) {
                this.f79606a.zzi(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f79606a.zzh(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC18981aI2
    /* renamed from: f */
    public final void mo22678f(int i, double d) {
        this.f79606a.zzh(i, Double.doubleToRawLongBits(d));
    }

    @Override // p000.InterfaceC18981aI2
    /* renamed from: g */
    public final void mo22677g(int i, float f) {
        this.f79606a.zzf(i, Float.floatToRawIntBits(f));
    }

    @Override // p000.InterfaceC18981aI2
    /* renamed from: h */
    public final void mo22676h(int i, boolean z) {
        this.f79606a.zzd(i, z);
    }

    @Override // p000.InterfaceC18981aI2
    /* renamed from: i */
    public final void mo22675i(int i, long j) {
        this.f79606a.zzh(i, j);
    }

    @Override // p000.InterfaceC18981aI2
    /* renamed from: j */
    public final void mo22674j(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f79606a.zze(i, (zzjd) list.get(i2));
        }
    }

    @Override // p000.InterfaceC18981aI2
    /* renamed from: k */
    public final void mo22673k(int i, long j) {
        this.f79606a.zzr(i, j);
    }

    @Override // p000.InterfaceC18981aI2
    /* renamed from: l */
    public final void mo22672l(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f79606a.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzjl.zzv(((Integer) list.get(i4)).intValue());
            }
            this.f79606a.zzq(i3);
            while (i2 < list.size()) {
                this.f79606a.zzk(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f79606a.zzj(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC18981aI2
    /* renamed from: m */
    public final void mo22671m(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f79606a.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            this.f79606a.zzq(i3);
            while (i2 < list.size()) {
                this.f79606a.zzg(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f79606a.zzf(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    @Override // p000.InterfaceC18981aI2
    /* renamed from: n */
    public final void mo22670n(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f79606a.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzjl.zzB(((Long) list.get(i4)).longValue());
            }
            this.f79606a.zzq(i3);
            while (i2 < list.size()) {
                this.f79606a.zzs(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f79606a.zzr(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC18981aI2
    /* renamed from: o */
    public final void mo22669o(int i, int i2) {
        this.f79606a.zzp(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // p000.InterfaceC18981aI2
    /* renamed from: p */
    public final void mo22668p(int i, String str) {
        this.f79606a.zzm(i, str);
    }

    @Override // p000.InterfaceC18981aI2
    /* renamed from: q */
    public final void mo22667q(int i, int i2) {
        this.f79606a.zzf(i, i2);
    }

    @Override // p000.InterfaceC18981aI2
    /* renamed from: r */
    public final void mo22666r(int i, int i2) {
        this.f79606a.zzj(i, i2);
    }

    @Override // p000.InterfaceC18981aI2
    /* renamed from: s */
    public final void mo22665s(int i, zzjd zzjdVar) {
        this.f79606a.zze(i, zzjdVar);
    }

    @Override // p000.InterfaceC18981aI2
    /* renamed from: t */
    public final void mo22664t(int i) {
        this.f79606a.zzo(i, 3);
    }

    @Override // p000.InterfaceC18981aI2
    /* renamed from: u */
    public final void mo22663u(int i, long j) {
        this.f79606a.zzr(i, (j >> 63) ^ (j + j));
    }

    @Override // p000.InterfaceC18981aI2
    /* renamed from: v */
    public final void mo22662v(int i, int i2) {
        this.f79606a.zzp(i, i2);
    }

    @Override // p000.InterfaceC18981aI2
    /* renamed from: w */
    public final void mo22661w(int i, int i2) {
        this.f79606a.zzj(i, i2);
    }

    @Override // p000.InterfaceC18981aI2
    /* renamed from: x */
    public final void mo22660x(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f79606a.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzjl.zzA(((Integer) list.get(i4)).intValue());
            }
            this.f79606a.zzq(i3);
            while (i2 < list.size()) {
                this.f79606a.zzq(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f79606a.zzp(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC18981aI2
    /* renamed from: y */
    public final void mo22659y(int i, Object obj, DF2 df2) {
        Object obj2 = (zzll) obj;
        C6528b c6528b = (C6528b) this.f79606a;
        c6528b.zzq((i << 3) | 2);
        zzin zzinVar = (zzin) obj2;
        int mo47157a = zzinVar.mo47157a();
        if (mo47157a == -1) {
            mo47157a = df2.zza(zzinVar);
            zzinVar.mo47156b(mo47157a);
        }
        c6528b.zzq(mo47157a);
        df2.mo47360a(obj2, c6528b.f46324a);
    }

    @Override // p000.InterfaceC18981aI2
    /* renamed from: z */
    public final void mo22658z(int i, List list) {
        int i2 = 0;
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            while (i2 < list.size()) {
                Object zzf = zzktVar.zzf(i2);
                if (zzf instanceof String) {
                    this.f79606a.zzm(i, (String) zzf);
                } else {
                    this.f79606a.zze(i, (zzjd) zzf);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f79606a.zzm(i, (String) list.get(i2));
            i2++;
        }
    }

    @Override // p000.InterfaceC18981aI2
    public final void zzh(int i) {
        this.f79606a.zzo(i, 4);
    }
}
