package com.google.android.gms.measurement.internal;

import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzgg;
import com.google.android.gms.internal.measurement.zzgh;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzgj;
import com.google.android.gms.internal.measurement.zzny;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.j0 */
/* loaded from: classes3.dex */
public final class C6737j0 {

    /* renamed from: a */
    public String f48181a;

    /* renamed from: b */
    public boolean f48182b;

    /* renamed from: c */
    public zzgh f48183c;

    /* renamed from: d */
    public BitSet f48184d;

    /* renamed from: e */
    public BitSet f48185e;

    /* renamed from: f */
    public Map f48186f;

    /* renamed from: g */
    public Map f48187g;

    /* renamed from: h */
    public final /* synthetic */ C22467ua2 f48188h;

    public /* synthetic */ C6737j0(C22467ua2 c22467ua2, String str, zzt zztVar) {
        this.f48188h = c22467ua2;
        this.f48181a = str;
        this.f48182b = true;
        this.f48184d = new BitSet();
        this.f48185e = new BitSet();
        this.f48186f = new ArrayMap();
        this.f48187g = new ArrayMap();
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ BitSet m46365b(C6737j0 c6737j0) {
        return c6737j0.f48184d;
    }

    /* renamed from: a */
    public final zzfo m46366a(int i) {
        ArrayList arrayList;
        List list;
        zzfn zzb = zzfo.zzb();
        zzb.zza(i);
        zzb.zzc(this.f48182b);
        zzgh zzghVar = this.f48183c;
        if (zzghVar != null) {
            zzb.zzd(zzghVar);
        }
        zzgg zzf = zzgh.zzf();
        zzf.zzb(zzlb.m46134w(this.f48184d));
        zzf.zzd(zzlb.m46134w(this.f48185e));
        Map map = this.f48186f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer num : this.f48186f.keySet()) {
                int intValue = num.intValue();
                Long l = (Long) this.f48186f.get(num);
                if (l != null) {
                    com.google.android.gms.internal.measurement.zzfp zzc = com.google.android.gms.internal.measurement.zzfq.zzc();
                    zzc.zzb(intValue);
                    zzc.zza(l.longValue());
                    arrayList2.add((com.google.android.gms.internal.measurement.zzfq) zzc.zzaE());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            zzf.zza(arrayList);
        }
        Map map2 = this.f48187g;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num2 : this.f48187g.keySet()) {
                zzgi zzd = zzgj.zzd();
                zzd.zzb(num2.intValue());
                List list2 = (List) this.f48187g.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    zzd.zza(list2);
                }
                arrayList3.add((zzgj) zzd.zzaE());
            }
            list = arrayList3;
        }
        zzf.zzc(list);
        zzb.zzb(zzf);
        return (zzfo) zzb.zzaE();
    }

    /* renamed from: c */
    public final void m46364c(AbstractC20200hL2 abstractC20200hL2) {
        int mo30883a = abstractC20200hL2.mo30883a();
        Boolean bool = abstractC20200hL2.f62481c;
        if (bool != null) {
            this.f48185e.set(mo30883a, bool.booleanValue());
        }
        Boolean bool2 = abstractC20200hL2.f62482d;
        if (bool2 != null) {
            this.f48184d.set(mo30883a, bool2.booleanValue());
        }
        if (abstractC20200hL2.f62483e != null) {
            Map map = this.f48186f;
            Integer valueOf = Integer.valueOf(mo30883a);
            Long l = (Long) map.get(valueOf);
            long longValue = abstractC20200hL2.f62483e.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.f48186f.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (abstractC20200hL2.f62484f != null) {
            Map map2 = this.f48187g;
            Integer valueOf2 = Integer.valueOf(mo30883a);
            List list = (List) map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.f48187g.put(valueOf2, list);
            }
            if (abstractC20200hL2.mo30881c()) {
                list.clear();
            }
            zzny.zzc();
            zzag zzf = this.f48188h.zzs.zzf();
            String str = this.f48181a;
            zzea zzeaVar = zzeb.zzW;
            if (zzf.zzs(str, zzeaVar) && abstractC20200hL2.mo30882b()) {
                list.clear();
            }
            zzny.zzc();
            if (this.f48188h.zzs.zzf().zzs(this.f48181a, zzeaVar)) {
                Long valueOf3 = Long.valueOf(abstractC20200hL2.f62484f.longValue() / 1000);
                if (!list.contains(valueOf3)) {
                    list.add(valueOf3);
                    return;
                }
                return;
            }
            list.add(Long.valueOf(abstractC20200hL2.f62484f.longValue() / 1000));
        }
    }

    public /* synthetic */ C6737j0(C22467ua2 c22467ua2, String str, zzgh zzghVar, BitSet bitSet, BitSet bitSet2, Map map, Map map2, zzt zztVar) {
        this.f48188h = c22467ua2;
        this.f48181a = str;
        this.f48184d = bitSet;
        this.f48185e = bitSet2;
        this.f48186f = map;
        this.f48187g = new ArrayMap();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f48187g.put(num, arrayList);
        }
        this.f48182b = false;
        this.f48183c = zzghVar;
    }
}
