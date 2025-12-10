package p000;

import com.google.android.gms.internal.measurement.zzhx;
import com.google.android.gms.internal.measurement.zzia;

/* renamed from: Jv2 */
/* loaded from: classes3.dex */
public final class Jv2 extends zzia {
    public Jv2(zzhx zzhxVar, String str, Double d, boolean z) {
        super(zzhxVar, "measurement.test.double_flag", d, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzia
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo361a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            String zzc = super.zzc();
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid double value for ");
            sb.append(zzc);
            sb.append(": ");
            sb.append((String) obj);
            return null;
        }
    }
}
