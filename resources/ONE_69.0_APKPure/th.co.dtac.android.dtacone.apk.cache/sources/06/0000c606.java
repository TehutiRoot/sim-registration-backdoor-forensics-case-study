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

/* renamed from: el2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19799el2 implements InterfaceC21777qA2 {

    /* renamed from: a */
    public final /* synthetic */ Account f61652a;

    /* renamed from: b */
    public final /* synthetic */ String f61653b;

    /* renamed from: c */
    public final /* synthetic */ Bundle f61654c;

    public C19799el2(Account account, String str, Bundle bundle) {
        this.f61652a = account;
        this.f61653b = str;
        this.f61654c = bundle;
    }

    @Override // p000.InterfaceC21777qA2
    /* renamed from: a */
    public final /* synthetic */ Object mo23687a(IBinder iBinder) {
        Object m48698d;
        Logger logger;
        m48698d = zzd.m48698d(zzf.zza(iBinder).zza(this.f61652a, this.f61653b, this.f61654c));
        Bundle bundle = (Bundle) m48698d;
        TokenData zza = TokenData.zza(bundle, "tokenDetails");
        if (zza != null) {
            return zza;
        }
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        zzay zzc = zzay.zzc(string);
        if (zzay.zza(zzc)) {
            logger = zzd.f44567c;
            String valueOf = String.valueOf(zzc);
            StringBuilder sb = new StringBuilder(valueOf.length() + 31);
            sb.append("isUserRecoverableError status: ");
            sb.append(valueOf);
            logger.m48367w("GoogleAuthUtil", sb.toString());
            throw new UserRecoverableAuthException(string, intent);
        } else if (!zzay.NETWORK_ERROR.equals(zzc) && !zzay.SERVICE_UNAVAILABLE.equals(zzc) && !zzay.INTNERNAL_ERROR.equals(zzc)) {
            throw new GoogleAuthException(string);
        } else {
            throw new IOException(string);
        }
    }
}