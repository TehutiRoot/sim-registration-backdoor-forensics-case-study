package p000;

import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.auth.zzd;
import com.google.android.gms.internal.auth.zzf;

/* renamed from: Rn2 */
/* loaded from: classes3.dex */
public final class Rn2 implements InterfaceC21777qA2 {

    /* renamed from: a */
    public final /* synthetic */ String f5644a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f5645b;

    public Rn2(String str, Bundle bundle) {
        this.f5644a = str;
        this.f5645b = bundle;
    }

    @Override // p000.InterfaceC21777qA2
    /* renamed from: a */
    public final /* synthetic */ Object mo23687a(IBinder iBinder) {
        Object m48698d;
        m48698d = zzd.m48698d(zzf.zza(iBinder).zza(this.f5644a, this.f5645b));
        Bundle bundle = (Bundle) m48698d;
        String string = bundle.getString("Error");
        if (bundle.getBoolean("booleanResult")) {
            return null;
        }
        throw new GoogleAuthException(string);
    }
}