package p000;

import com.google.android.gms.internal.measurement.zzai;
import com.google.android.gms.internal.measurement.zzap;
import com.google.android.gms.internal.measurement.zzg;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.internal.measurement.zzr;
import com.google.android.gms.internal.measurement.zzt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: oK2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21461oK2 extends zzai {

    /* renamed from: a */
    public final boolean f72757a;

    /* renamed from: b */
    public final boolean f72758b;

    /* renamed from: c */
    public final /* synthetic */ zzt f72759c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21461oK2(zzt zztVar, boolean z, boolean z2) {
        super("log");
        this.f72759c = zztVar;
        this.f72757a = z;
        this.f72758b = z2;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        int i;
        zzr zzrVar;
        zzr zzrVar2;
        zzr zzrVar3;
        zzh.zzi("log", 1, list);
        if (list.size() == 1) {
            zzrVar3 = this.f72759c.f46398a;
            zzrVar3.zza(3, zzgVar.zzb((zzap) list.get(0)).zzi(), Collections.emptyList(), this.f72757a, this.f72758b);
            return zzap.zzf;
        }
        int zzb = zzh.zzb(zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue());
        if (zzb != 2) {
            if (zzb != 3) {
                if (zzb != 5) {
                    if (zzb != 6) {
                        i = 3;
                    } else {
                        i = 2;
                    }
                } else {
                    i = 5;
                }
            } else {
                i = 1;
            }
        } else {
            i = 4;
        }
        String zzi = zzgVar.zzb((zzap) list.get(1)).zzi();
        if (list.size() == 2) {
            zzrVar2 = this.f72759c.f46398a;
            zzrVar2.zza(i, zzi, Collections.emptyList(), this.f72757a, this.f72758b);
            return zzap.zzf;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 2; i2 < Math.min(list.size(), 5); i2++) {
            arrayList.add(zzgVar.zzb((zzap) list.get(i2)).zzi());
        }
        zzrVar = this.f72759c.f46398a;
        zzrVar.zza(i, zzi, arrayList, this.f72757a, this.f72758b);
        return zzap.zzf;
    }
}