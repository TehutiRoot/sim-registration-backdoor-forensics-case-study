package p000;

import com.google.android.gms.internal.measurement.zzle;
import com.google.android.gms.internal.measurement.zzlf;
import java.util.Iterator;
import java.util.Map;

/* renamed from: wE2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22759wE2 {
    /* renamed from: a */
    public static final int m894a(int i, Object obj, Object obj2) {
        zzlf zzlfVar = (zzlf) obj;
        zzle zzleVar = (zzle) obj2;
        if (!zzlfVar.isEmpty()) {
            Iterator it = zzlfVar.entrySet().iterator();
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
    public static final Object m893b(Object obj, Object obj2) {
        zzlf zzlfVar = (zzlf) obj;
        zzlf zzlfVar2 = (zzlf) obj2;
        if (!zzlfVar2.isEmpty()) {
            if (!zzlfVar.zze()) {
                zzlfVar = zzlfVar.zzb();
            }
            zzlfVar.zzd(zzlfVar2);
        }
        return zzlfVar;
    }
}
