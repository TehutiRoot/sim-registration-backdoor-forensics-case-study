package p000;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.zzd;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.auth.zzay;
import com.google.android.gms.internal.auth.zzf;
import java.io.IOException;

/* renamed from: hk2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20261hk2 implements InterfaceC22370tz2 {

    /* renamed from: a */
    public final /* synthetic */ Account f62577a;

    /* renamed from: b */
    public final /* synthetic */ String f62578b;

    /* renamed from: c */
    public final /* synthetic */ Bundle f62579c;

    public C20261hk2(Account account, String str, Bundle bundle) {
        this.f62577a = account;
        this.f62578b = str;
        this.f62579c = bundle;
    }

    @Override // p000.InterfaceC22370tz2
    /* renamed from: a */
    public final /* synthetic */ Object mo1348a(IBinder iBinder) {
        Object m48701d;
        Logger logger;
        m48701d = zzd.m48701d(zzf.zza(iBinder).zza(this.f62577a, this.f62578b, this.f62579c));
        Bundle bundle = (Bundle) m48701d;
        TokenData zza = TokenData.zza(bundle, "tokenDetails");
        if (zza != null) {
            return zza;
        }
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        zzay zzc = zzay.zzc(string);
        if (zzay.zza(zzc)) {
            logger = zzd.f44555c;
            String valueOf = String.valueOf(zzc);
            StringBuilder sb = new StringBuilder(valueOf.length() + 31);
            sb.append("isUserRecoverableError status: ");
            sb.append(valueOf);
            logger.m48370w("GoogleAuthUtil", sb.toString());
            throw new UserRecoverableAuthException(string, intent);
        } else if (!zzay.NETWORK_ERROR.equals(zzc) && !zzay.SERVICE_UNAVAILABLE.equals(zzc) && !zzay.INTNERNAL_ERROR.equals(zzc)) {
            throw new GoogleAuthException(string);
        } else {
            throw new IOException(string);
        }
    }
}
