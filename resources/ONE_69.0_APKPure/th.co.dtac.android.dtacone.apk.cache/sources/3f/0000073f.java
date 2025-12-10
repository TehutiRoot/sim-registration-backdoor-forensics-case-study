package p000;

import com.google.android.gms.internal.measurement.zzai;
import com.google.android.gms.internal.measurement.zzap;
import com.google.android.gms.internal.measurement.zzau;
import com.google.android.gms.internal.measurement.zzg;
import com.google.android.gms.internal.measurement.zzh;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: He2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17753He2 implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ zzai f2441a;

    /* renamed from: b */
    public final /* synthetic */ zzg f2442b;

    public C17753He2(zzai zzaiVar, zzg zzgVar) {
        this.f2441a = zzaiVar;
        this.f2442b = zzgVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzap zzapVar = (zzap) obj;
        zzap zzapVar2 = (zzap) obj2;
        zzai zzaiVar = this.f2441a;
        zzg zzgVar = this.f2442b;
        if (zzapVar instanceof zzau) {
            if (zzapVar2 instanceof zzau) {
                return 0;
            }
            return 1;
        } else if (zzapVar2 instanceof zzau) {
            return -1;
        } else {
            if (zzaiVar == null) {
                return zzapVar.zzi().compareTo(zzapVar2.zzi());
            }
            return (int) zzh.zza(zzaiVar.zza(zzgVar, Arrays.asList(zzapVar, zzapVar2)).zzh().doubleValue());
        }
    }
}