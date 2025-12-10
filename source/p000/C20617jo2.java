package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfi;
import java.util.Iterator;
import java.util.Map;

/* renamed from: jo2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20617jo2 {
    /* renamed from: a */
    public static final int m29132a(int i, Object obj, Object obj2) {
        zzfi zzfiVar = (zzfi) obj;
        zzfh zzfhVar = (zzfh) obj2;
        if (!zzfiVar.isEmpty()) {
            Iterator it = zzfiVar.entrySet().iterator();
            if (!it.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
        return 0;
    }

    /* renamed from: b */
    public static final Object m29131b(Object obj, Object obj2) {
        zzfi zzfiVar = (zzfi) obj;
        zzfi zzfiVar2 = (zzfi) obj2;
        if (!zzfiVar2.isEmpty()) {
            if (!zzfiVar.zze()) {
                zzfiVar = zzfiVar.zzb();
            }
            zzfiVar.zzd(zzfiVar2);
        }
        return zzfiVar;
    }
}
