package p000;

import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.auth.zzd;
import com.google.android.gms.internal.auth.zzf;

/* renamed from: Um2 */
/* loaded from: classes3.dex */
public final class Um2 implements InterfaceC22370tz2 {

    /* renamed from: a */
    public final /* synthetic */ String f6448a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f6449b;

    public Um2(String str, Bundle bundle) {
        this.f6448a = str;
        this.f6449b = bundle;
    }

    @Override // p000.InterfaceC22370tz2
    /* renamed from: a */
    public final /* synthetic */ Object mo1348a(IBinder iBinder) {
        Object m48701d;
        m48701d = zzd.m48701d(zzf.zza(iBinder).zza(this.f6448a, this.f6449b));
        Bundle bundle = (Bundle) m48701d;
        String string = bundle.getString("Error");
        if (bundle.getBoolean("booleanResult")) {
            return null;
        }
        throw new GoogleAuthException(string);
    }
}
