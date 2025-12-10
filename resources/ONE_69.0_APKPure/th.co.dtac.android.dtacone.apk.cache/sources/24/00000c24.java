package p000;

import com.google.android.gms.internal.measurement.zzo;
import com.google.android.gms.measurement.internal.zzfp;
import java.util.Map;

/* renamed from: Mp2 */
/* loaded from: classes3.dex */
public final class Mp2 implements zzo {

    /* renamed from: a */
    public final /* synthetic */ String f3980a;

    /* renamed from: b */
    public final /* synthetic */ zzfp f3981b;

    public Mp2(zzfp zzfpVar, String str) {
        this.f3981b = zzfpVar;
        this.f3980a = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzo
    public final String zza(String str) {
        Map map;
        map = this.f3981b.f48354b;
        Map map2 = (Map) map.get(this.f3980a);
        if (map2 != null && map2.containsKey(str)) {
            return (String) map2.get(str);
        }
        return null;
    }
}