package p000;

import com.google.android.gms.internal.measurement.zzkl;
import com.google.android.gms.internal.measurement.zzks;
import com.google.android.gms.internal.measurement.zzkt;
import com.google.android.gms.internal.measurement.zzku;
import com.google.android.gms.internal.measurement.zzms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: uD2 */
/* loaded from: classes3.dex */
public final class C22412uD2 extends ID2 {

    /* renamed from: c */
    public static final Class f107311c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ C22412uD2(zzku zzkuVar) {
        super(null);
    }

    @Override // p000.ID2
    /* renamed from: a */
    public final void mo1309a(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) BH2.m68939k(obj, j);
        if (list instanceof zzkt) {
            unmodifiableList = ((zzkt) list).zze();
        } else if (f107311c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof InterfaceC21042mF2) && (list instanceof zzkl)) {
                zzkl zzklVar = (zzkl) list;
                if (zzklVar.zzc()) {
                    zzklVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        BH2.m68926x(obj, j, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.ID2
    /* renamed from: b */
    public final void mo1308b(Object obj, Object obj2, long j) {
        zzks zzksVar;
        List list = (List) BH2.m68939k(obj2, j);
        int size = list.size();
        List list2 = (List) BH2.m68939k(obj, j);
        if (list2.isEmpty()) {
            if (list2 instanceof zzkt) {
                list2 = new zzks(size);
            } else if ((list2 instanceof InterfaceC21042mF2) && (list2 instanceof zzkl)) {
                list2 = ((zzkl) list2).zzd(size);
            } else {
                list2 = new ArrayList(size);
            }
            BH2.m68926x(obj, j, list2);
        } else {
            if (f107311c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                BH2.m68926x(obj, j, arrayList);
                zzksVar = arrayList;
            } else if (list2 instanceof zzms) {
                zzks zzksVar2 = new zzks(list2.size() + size);
                zzksVar2.addAll(zzksVar2.size(), (zzms) list2);
                BH2.m68926x(obj, j, zzksVar2);
                zzksVar = zzksVar2;
            } else if ((list2 instanceof InterfaceC21042mF2) && (list2 instanceof zzkl)) {
                zzkl zzklVar = (zzkl) list2;
                if (!zzklVar.zzc()) {
                    list2 = zzklVar.zzd(list2.size() + size);
                    BH2.m68926x(obj, j, list2);
                }
            }
            list2 = zzksVar;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        BH2.m68926x(obj, j, list);
    }
}
