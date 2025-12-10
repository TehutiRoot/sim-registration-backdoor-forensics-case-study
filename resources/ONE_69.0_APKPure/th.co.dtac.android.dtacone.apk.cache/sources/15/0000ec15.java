package p000;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.zzd;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.auth.zzay;
import com.google.android.gms.internal.auth.zzf;

/* renamed from: nx2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21392nx2 implements InterfaceC21777qA2 {

    /* renamed from: a */
    public final /* synthetic */ String f72644a;

    public C21392nx2(String str) {
        this.f72644a = str;
    }

    @Override // p000.InterfaceC21777qA2
    /* renamed from: a */
    public final /* synthetic */ Object mo23687a(IBinder iBinder) {
        Object m48698d;
        Logger logger;
        m48698d = zzd.m48698d(zzf.zza(iBinder).zza(this.f72644a));
        Bundle bundle = (Bundle) m48698d;
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        zzay zzc = zzay.zzc(string);
        if (zzay.SUCCESS.equals(zzc)) {
            return Boolean.TRUE;
        }
        if (zzay.zza(zzc)) {
            logger = zzd.f44567c;
            String valueOf = String.valueOf(zzc);
            StringBuilder sb = new StringBuilder(valueOf.length() + 31);
            sb.append("isUserRecoverableError status: ");
            sb.append(valueOf);
            logger.m48367w("GoogleAuthUtil", sb.toString());
            throw new UserRecoverableAuthException(string, intent);
        }
        throw new GoogleAuthException(string);
    }
}