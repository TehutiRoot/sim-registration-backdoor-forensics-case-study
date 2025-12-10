package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

@KeepForSdk
/* loaded from: classes3.dex */
public class Storage {

    /* renamed from: c */
    public static final Lock f44561c = new ReentrantLock();

    /* renamed from: d */
    public static Storage f44562d;

    /* renamed from: a */
    public final Lock f44563a = new ReentrantLock();

    /* renamed from: b */
    public final SharedPreferences f44564b;

    public Storage(Context context) {
        this.f44564b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* renamed from: a */
    public static final String m48702a(String str, String str2) {
        return str + ":" + str2;
    }

    @NonNull
    @KeepForSdk
    public static Storage getInstance(@NonNull Context context) {
        Preconditions.checkNotNull(context);
        Lock lock = f44561c;
        lock.lock();
        try {
            if (f44562d == null) {
                f44562d = new Storage(context.getApplicationContext());
            }
            Storage storage = f44562d;
            lock.unlock();
            return storage;
        } catch (Throwable th2) {
            f44561c.unlock();
            throw th2;
        }
    }

    @KeepForSdk
    public void clear() {
        this.f44563a.lock();
        try {
            this.f44564b.edit().clear().apply();
        } finally {
            this.f44563a.unlock();
        }
    }

    @Nullable
    @KeepForSdk
    public GoogleSignInAccount getSavedDefaultGoogleSignInAccount() {
        String zaa;
        String zaa2 = zaa("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(zaa2) || (zaa = zaa(m48702a("googleSignInAccount", zaa2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.zab(zaa);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    @KeepForSdk
    public GoogleSignInOptions getSavedDefaultGoogleSignInOptions() {
        String zaa;
        String zaa2 = zaa("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(zaa2) || (zaa = zaa(m48702a("googleSignInOptions", zaa2))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.zab(zaa);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    @KeepForSdk
    public String getSavedRefreshToken() {
        return zaa("refreshToken");
    }

    @KeepForSdk
    public void saveDefaultGoogleSignInAccount(@NonNull GoogleSignInAccount googleSignInAccount, @NonNull GoogleSignInOptions googleSignInOptions) {
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        zad("defaultGoogleSignInAccount", googleSignInAccount.zac());
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        String zac = googleSignInAccount.zac();
        zad(m48702a("googleSignInAccount", zac), googleSignInAccount.zad());
        zad(m48702a("googleSignInOptions", zac), googleSignInOptions.zaf());
    }

    @Nullable
    public final String zaa(@NonNull String str) {
        this.f44563a.lock();
        try {
            return this.f44564b.getString(str, null);
        } finally {
            this.f44563a.unlock();
        }
    }

    public final void zab(@NonNull String str) {
        this.f44563a.lock();
        try {
            this.f44564b.edit().remove(str).apply();
        } finally {
            this.f44563a.unlock();
        }
    }

    public final void zac() {
        String zaa = zaa("defaultGoogleSignInAccount");
        zab("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(zaa)) {
            return;
        }
        zab(m48702a("googleSignInAccount", zaa));
        zab(m48702a("googleSignInOptions", zaa));
    }

    public final void zad(@NonNull String str, @NonNull String str2) {
        this.f44563a.lock();
        try {
            this.f44564b.edit().putString(str, str2).apply();
        } finally {
            this.f44563a.unlock();
        }
    }
}