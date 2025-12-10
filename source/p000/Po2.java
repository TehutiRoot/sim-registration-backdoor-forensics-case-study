package p000;

import com.google.android.gms.internal.measurement.zzo;
import com.google.android.gms.measurement.internal.zzfp;
import java.util.Map;

/* renamed from: Po2 */
/* loaded from: classes3.dex */
public final class Po2 implements zzo {

    /* renamed from: a */
    public final /* synthetic */ String f4853a;

    /* renamed from: b */
    public final /* synthetic */ zzfp f4854b;

    public Po2(zzfp zzfpVar, String str) {
        this.f4854b = zzfpVar;
        this.f4853a = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzo
    public final String zza(String str) {
        Map map;
        map = this.f4854b.f48342b;
        Map map2 = (Map) map.get(this.f4853a);
        if (map2 != null && map2.containsKey(str)) {
            return (String) map2.get(str);
        }
        return null;
    }
}
