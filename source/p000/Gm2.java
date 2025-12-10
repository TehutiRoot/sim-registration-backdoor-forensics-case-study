package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzev;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzew;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzex;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: Gm2 */
/* loaded from: classes3.dex */
public final class Gm2 extends AbstractC21990rn2 {

    /* renamed from: c */
    public static final Class f2003c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ Gm2(zzex zzexVar) {
        super(null);
    }

    @Override // p000.AbstractC21990rn2
    /* renamed from: a */
    public final void mo23269a(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) AbstractC19775eu2.m31401k(obj, j);
        if (list instanceof zzew) {
            unmodifiableList = ((zzew) list).zze();
        } else if (f2003c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof InterfaceC22856wp2) && (list instanceof zzel)) {
                zzel zzelVar = (zzel) list;
                if (zzelVar.zzc()) {
                    zzelVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        AbstractC19775eu2.m31388x(obj, j, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC21990rn2
    /* renamed from: b */
    public final void mo23268b(Object obj, Object obj2, long j) {
        zzev zzevVar;
        List list = (List) AbstractC19775eu2.m31401k(obj2, j);
        int size = list.size();
        List list2 = (List) AbstractC19775eu2.m31401k(obj, j);
        if (list2.isEmpty()) {
            if (list2 instanceof zzew) {
                list2 = new zzev(size);
            } else if ((list2 instanceof InterfaceC22856wp2) && (list2 instanceof zzel)) {
                list2 = ((zzel) list2).zzd(size);
            } else {
                list2 = new ArrayList(size);
            }
            AbstractC19775eu2.m31388x(obj, j, list2);
        } else {
            if (f2003c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                AbstractC19775eu2.m31388x(obj, j, arrayList);
                zzevVar = arrayList;
            } else if (list2 instanceof zzhd) {
                zzev zzevVar2 = new zzev(list2.size() + size);
                zzevVar2.addAll(zzevVar2.size(), (zzhd) list2);
                AbstractC19775eu2.m31388x(obj, j, zzevVar2);
                zzevVar = zzevVar2;
            } else if ((list2 instanceof InterfaceC22856wp2) && (list2 instanceof zzel)) {
                zzel zzelVar = (zzel) list2;
                if (!zzelVar.zzc()) {
                    list2 = zzelVar.zzd(list2.size() + size);
                    AbstractC19775eu2.m31388x(obj, j, list2);
                }
            }
            list2 = zzevVar;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        AbstractC19775eu2.m31388x(obj, j, list);
    }
}
