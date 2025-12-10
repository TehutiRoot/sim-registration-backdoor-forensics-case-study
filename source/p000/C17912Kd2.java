package p000;

import com.google.android.gms.internal.measurement.zzai;
import com.google.android.gms.internal.measurement.zzap;
import com.google.android.gms.internal.measurement.zzau;
import com.google.android.gms.internal.measurement.zzg;
import com.google.android.gms.internal.measurement.zzh;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: Kd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17912Kd2 implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ zzai f3237a;

    /* renamed from: b */
    public final /* synthetic */ zzg f3238b;

    public C17912Kd2(zzai zzaiVar, zzg zzgVar) {
        this.f3237a = zzaiVar;
        this.f3238b = zzgVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzap zzapVar = (zzap) obj;
        zzap zzapVar2 = (zzap) obj2;
        zzai zzaiVar = this.f3237a;
        zzg zzgVar = this.f3238b;
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
