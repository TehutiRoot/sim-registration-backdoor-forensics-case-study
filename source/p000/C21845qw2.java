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

/* renamed from: qw2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21845qw2 implements InterfaceC22370tz2 {

    /* renamed from: a */
    public final /* synthetic */ String f77129a;

    public C21845qw2(String str) {
        this.f77129a = str;
    }

    @Override // p000.InterfaceC22370tz2
    /* renamed from: a */
    public final /* synthetic */ Object mo1348a(IBinder iBinder) {
        Object m48701d;
        Logger logger;
        m48701d = zzd.m48701d(zzf.zza(iBinder).zza(this.f77129a));
        Bundle bundle = (Bundle) m48701d;
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        zzay zzc = zzay.zzc(string);
        if (zzay.SUCCESS.equals(zzc)) {
            return Boolean.TRUE;
        }
        if (zzay.zza(zzc)) {
            logger = zzd.f44555c;
            String valueOf = String.valueOf(zzc);
            StringBuilder sb = new StringBuilder(valueOf.length() + 31);
            sb.append("isUserRecoverableError status: ");
            sb.append(valueOf);
            logger.m48370w("GoogleAuthUtil", sb.toString());
            throw new UserRecoverableAuthException(string, intent);
        }
        throw new GoogleAuthException(string);
    }
}
