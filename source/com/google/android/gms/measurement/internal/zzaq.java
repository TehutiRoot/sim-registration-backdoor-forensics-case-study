package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import androidx.core.content.ContextCompat;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes3.dex */
public final class zzaq extends AbstractC20285hs2 {

    /* renamed from: b */
    public long f48256b;

    /* renamed from: c */
    public String f48257c;

    /* renamed from: d */
    public AccountManager f48258d;

    /* renamed from: e */
    public Boolean f48259e;

    /* renamed from: f */
    public long f48260f;

    public zzaq(zzfy zzfyVar) {
        super(zzfyVar);
    }

    /* renamed from: b */
    public final long m46348b() {
        zzg();
        return this.f48260f;
    }

    /* renamed from: c */
    public final boolean m46347c() {
        Account[] result;
        zzg();
        long currentTimeMillis = this.zzs.zzav().currentTimeMillis();
        if (currentTimeMillis - this.f48260f > 86400000) {
            this.f48259e = null;
        }
        Boolean bool = this.f48259e;
        if (bool == null) {
            if (ContextCompat.checkSelfPermission(this.zzs.zzau(), "android.permission.GET_ACCOUNTS") != 0) {
                this.zzs.zzay().zzm().zza("Permission error checking for dasher/unicorn accounts");
                this.f48260f = currentTimeMillis;
                this.f48259e = Boolean.FALSE;
                return false;
            }
            if (this.f48258d == null) {
                this.f48258d = AccountManager.get(this.zzs.zzau());
            }
            try {
                result = this.f48258d.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
            } catch (AuthenticatorException e) {
                e = e;
                this.zzs.zzay().zzh().zzb("Exception checking account types", e);
                this.f48260f = currentTimeMillis;
                this.f48259e = Boolean.FALSE;
                return false;
            } catch (OperationCanceledException e2) {
                e = e2;
                this.zzs.zzay().zzh().zzb("Exception checking account types", e);
                this.f48260f = currentTimeMillis;
                this.f48259e = Boolean.FALSE;
                return false;
            } catch (IOException e3) {
                e = e3;
                this.zzs.zzay().zzh().zzb("Exception checking account types", e);
                this.f48260f = currentTimeMillis;
                this.f48259e = Boolean.FALSE;
                return false;
            }
            if (result != null && result.length > 0) {
                this.f48259e = Boolean.TRUE;
                this.f48260f = currentTimeMillis;
                return true;
            }
            Account[] result2 = this.f48258d.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
            if (result2 != null && result2.length > 0) {
                this.f48259e = Boolean.TRUE;
                this.f48260f = currentTimeMillis;
                return true;
            }
            this.f48260f = currentTimeMillis;
            this.f48259e = Boolean.FALSE;
            return false;
        }
        return bool.booleanValue();
    }

    public final long zzb() {
        zzu();
        return this.f48256b;
    }

    public final String zzc() {
        zzu();
        return this.f48257c;
    }

    public final void zzd() {
        zzg();
        this.f48259e = null;
        this.f48260f = 0L;
    }

    @Override // p000.AbstractC20285hs2
    public final boolean zzf() {
        Calendar calendar = Calendar.getInstance();
        this.f48256b = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f48257c = lowerCase + HelpFormatter.DEFAULT_OPT_PREFIX + lowerCase2;
        return false;
    }
}
