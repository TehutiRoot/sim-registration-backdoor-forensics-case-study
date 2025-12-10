package p000;

import com.google.android.gms.internal.measurement.zzhx;
import com.google.android.gms.internal.measurement.zzia;

/* renamed from: wv2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22874wv2 extends zzia {
    public C22874wv2(zzhx zzhxVar, String str, Long l, boolean z) {
        super(zzhxVar, str, l, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzia
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo361a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String zzc = super.zzc();
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid long value for ");
            sb.append(zzc);
            sb.append(": ");
            sb.append((String) obj);
            return null;
        }
    }
}
