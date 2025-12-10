package com.google.android.gms.common.internal;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.errorprone.annotations.FormatMethod;
import com.google.errorprone.annotations.FormatString;

@KeepForSdk
/* loaded from: classes3.dex */
public final class GmsLogger {

    /* renamed from: a */
    public final String f45098a;

    /* renamed from: b */
    public final String f45099b;

    @KeepForSdk
    public GmsLogger(@NonNull String str) {
        this(str, null);
    }

    /* renamed from: a */
    public final String m48410a(String str) {
        String str2 = this.f45099b;
        if (str2 == null) {
            return str;
        }
        return str2.concat(str);
    }

    /* renamed from: b */
    public final String m48409b(String str, Object... objArr) {
        String str2 = this.f45099b;
        String format = String.format(str, objArr);
        if (str2 == null) {
            return format;
        }
        return str2.concat(format);
    }

    @KeepForSdk
    public boolean canLog(int i) {
        return Log.isLoggable(this.f45098a, i);
    }

    @KeepForSdk
    public boolean canLogPii() {
        return false;
    }

    @KeepForSdk
    /* renamed from: d */
    public void m48408d(@NonNull String str, @NonNull String str2) {
        if (canLog(3)) {
            m48410a(str2);
        }
    }

    @KeepForSdk
    /* renamed from: e */
    public void m48406e(@NonNull String str, @NonNull String str2) {
        if (canLog(6)) {
            m48410a(str2);
        }
    }

    @KeepForSdk
    @FormatMethod
    public void efmt(@NonNull String str, @NonNull @FormatString String str2, @NonNull Object... objArr) {
        if (canLog(6)) {
            m48409b(str2, objArr);
        }
    }

    @KeepForSdk
    /* renamed from: i */
    public void m48404i(@NonNull String str, @NonNull String str2) {
        if (canLog(4)) {
            m48410a(str2);
        }
    }

    @KeepForSdk
    public void pii(@NonNull String str, @NonNull String str2) {
    }

    @KeepForSdk
    /* renamed from: v */
    public void m48402v(@NonNull String str, @NonNull String str2) {
        if (canLog(2)) {
            m48410a(str2);
        }
    }

    @KeepForSdk
    /* renamed from: w */
    public void m48400w(@NonNull String str, @NonNull String str2) {
        if (canLog(5)) {
            Log.w(str, m48410a(str2));
        }
    }

    @KeepForSdk
    @FormatMethod
    public void wfmt(@NonNull String str, @NonNull @FormatString String str2, @NonNull Object... objArr) {
        if (canLog(5)) {
            Log.w(this.f45098a, m48409b(str2, objArr));
        }
    }

    @KeepForSdk
    public void wtf(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (canLog(7)) {
            m48410a(str2);
            m48410a(str2);
        }
    }

    @KeepForSdk
    public GmsLogger(@NonNull String str, @Nullable String str2) {
        Preconditions.checkNotNull(str, "log tag cannot be null");
        Preconditions.checkArgument(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f45098a = str;
        this.f45099b = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    @KeepForSdk
    public void pii(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
    }

    @KeepForSdk
    /* renamed from: d */
    public void m48407d(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (canLog(3)) {
            m48410a(str2);
        }
    }

    @KeepForSdk
    /* renamed from: e */
    public void m48405e(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (canLog(6)) {
            m48410a(str2);
        }
    }

    @KeepForSdk
    /* renamed from: i */
    public void m48403i(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (canLog(4)) {
            m48410a(str2);
        }
    }

    @KeepForSdk
    /* renamed from: v */
    public void m48401v(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (canLog(2)) {
            m48410a(str2);
        }
    }

    @KeepForSdk
    /* renamed from: w */
    public void m48399w(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (canLog(5)) {
            Log.w(str, m48410a(str2), th2);
        }
    }
}
