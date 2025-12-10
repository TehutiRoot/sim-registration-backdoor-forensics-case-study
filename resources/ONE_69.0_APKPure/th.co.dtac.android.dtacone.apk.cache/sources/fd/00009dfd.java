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
public final class C6726j0 {

    /* renamed from: a */
    public String f48193a;

    /* renamed from: b */
    public boolean f48194b;

    /* renamed from: c */
    public zzgh f48195c;

    /* renamed from: d */
    public BitSet f48196d;

    /* renamed from: e */
    public BitSet f48197e;

    /* renamed from: f */
    public Map f48198f;

    /* renamed from: g */
    public Map f48199g;

    /* renamed from: h */
    public final /* synthetic */ C22018rb2 f48200h;

    public /* synthetic */ C6726j0(C22018rb2 c22018rb2, String str, zzt zztVar) {
        this.f48200h = c22018rb2;
        this.f48193a = str;
        this.f48194b = true;
        this.f48196d = new BitSet();
        this.f48197e = new BitSet();
        this.f48198f = new ArrayMap();
        this.f48199g = new ArrayMap();
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ BitSet m46350b(C6726j0 c6726j0) {
        return c6726j0.f48196d;
    }

    /* renamed from: a */
    public final zzfo m46351a(int i) {
        ArrayList arrayList;
        List list;
        zzfn zzb = zzfo.zzb();
        zzb.zza(i);
        zzb.zzc(this.f48194b);
        zzgh zzghVar = this.f48195c;
        if (zzghVar != null) {
            zzb.zzd(zzghVar);
        }
        zzgg zzf = zzgh.zzf();
        zzf.zzb(zzlb.m46119w(this.f48196d));
        zzf.zzd(zzlb.m46119w(this.f48197e));
        Map map = this.f48198f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer num : this.f48198f.keySet()) {
                int intValue = num.intValue();
                Long l = (Long) this.f48198f.get(num);
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
        Map map2 = this.f48199g;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num2 : this.f48199g.keySet()) {
                zzgi zzd = zzgj.zzd();
                zzd.zzb(num2.intValue());
                List list2 = (List) this.f48199g.get(num2);
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
    public final void m46349c(AbstractC19737eM2 abstractC19737eM2) {
        int mo31710a = abstractC19737eM2.mo31710a();
        Boolean bool = abstractC19737eM2.f61559c;
        if (bool != null) {
            this.f48197e.set(mo31710a, bool.booleanValue());
        }
        Boolean bool2 = abstractC19737eM2.f61560d;
        if (bool2 != null) {
            this.f48196d.set(mo31710a, bool2.booleanValue());
        }
        if (abstractC19737eM2.f61561e != null) {
            Map map = this.f48198f;
            Integer valueOf = Integer.valueOf(mo31710a);
            Long l = (Long) map.get(valueOf);
            long longValue = abstractC19737eM2.f61561e.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.f48198f.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (abstractC19737eM2.f61562f != null) {
            Map map2 = this.f48199g;
            Integer valueOf2 = Integer.valueOf(mo31710a);
            List list = (List) map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.f48199g.put(valueOf2, list);
            }
            if (abstractC19737eM2.mo31708c()) {
                list.clear();
            }
            zzny.zzc();
            zzag zzf = this.f48200h.zzs.zzf();
            String str = this.f48193a;
            zzea zzeaVar = zzeb.zzW;
            if (zzf.zzs(str, zzeaVar) && abstractC19737eM2.mo31709b()) {
                list.clear();
            }
            zzny.zzc();
            if (this.f48200h.zzs.zzf().zzs(this.f48193a, zzeaVar)) {
                Long valueOf3 = Long.valueOf(abstractC19737eM2.f61562f.longValue() / 1000);
                if (!list.contains(valueOf3)) {
                    list.add(valueOf3);
                    return;
                }
                return;
            }
            list.add(Long.valueOf(abstractC19737eM2.f61562f.longValue() / 1000));
        }
    }

    public /* synthetic */ C6726j0(C22018rb2 c22018rb2, String str, zzgh zzghVar, BitSet bitSet, BitSet bitSet2, Map map, Map map2, zzt zztVar) {
        this.f48200h = c22018rb2;
        this.f48193a = str;
        this.f48196d = bitSet;
        this.f48197e = bitSet2;
        this.f48198f = map;
        this.f48199g = new ArrayMap();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f48199g.put(num, arrayList);
        }
        this.f48194b = false;
        this.f48195c = zzghVar;
    }
}