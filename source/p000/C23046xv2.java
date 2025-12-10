package p000;

import com.google.android.gms.internal.measurement.zzgz;
import com.google.android.gms.internal.measurement.zzhx;
import com.google.android.gms.internal.measurement.zzia;

/* renamed from: xv2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23046xv2 extends zzia {
    public C23046xv2(zzhx zzhxVar, String str, Boolean bool, boolean z) {
        super(zzhxVar, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzia
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo361a(Object obj) {
        if (zzgz.zzc.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (zzgz.zzd.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        String zzc = super.zzc();
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid boolean value for ");
        sb.append(zzc);
        sb.append(": ");
        sb.append((String) obj);
        return null;
    }
}
