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
    public final String f45110a;

    /* renamed from: b */
    public final String f45111b;

    @KeepForSdk
    public GmsLogger(@NonNull String str) {
        this(str, null);
    }

    /* renamed from: a */
    public final String m48407a(String str) {
        String str2 = this.f45111b;
        if (str2 == null) {
            return str;
        }
        return str2.concat(str);
    }

    /* renamed from: b */
    public final String m48406b(String str, Object... objArr) {
        String str2 = this.f45111b;
        String format = String.format(str, objArr);
        if (str2 == null) {
            return format;
        }
        return str2.concat(format);
    }

    @KeepForSdk
    public boolean canLog(int i) {
        return Log.isLoggable(this.f45110a, i);
    }

    @KeepForSdk
    public boolean canLogPii() {
        return false;
    }

    @KeepForSdk
    /* renamed from: d */
    public void m48405d(@NonNull String str, @NonNull String str2) {
        if (canLog(3)) {
            m48407a(str2);
        }
    }

    @KeepForSdk
    /* renamed from: e */
    public void m48403e(@NonNull String str, @NonNull String str2) {
        if (canLog(6)) {
            m48407a(str2);
        }
    }

    @KeepForSdk
    @FormatMethod
    public void efmt(@NonNull String str, @NonNull @FormatString String str2, @NonNull Object... objArr) {
        if (canLog(6)) {
            m48406b(str2, objArr);
        }
    }

    @KeepForSdk
    /* renamed from: i */
    public void m48401i(@NonNull String str, @NonNull String str2) {
        if (canLog(4)) {
            m48407a(str2);
        }
    }

    @KeepForSdk
    public void pii(@NonNull String str, @NonNull String str2) {
    }

    @KeepForSdk
    /* renamed from: v */
    public void m48399v(@NonNull String str, @NonNull String str2) {
        if (canLog(2)) {
            m48407a(str2);
        }
    }

    @KeepForSdk
    /* renamed from: w */
    public void m48397w(@NonNull String str, @NonNull String str2) {
        if (canLog(5)) {
            Log.w(str, m48407a(str2));
        }
    }

    @KeepForSdk
    @FormatMethod
    public void wfmt(@NonNull String str, @NonNull @FormatString String str2, @NonNull Object... objArr) {
        if (canLog(5)) {
            Log.w(this.f45110a, m48406b(str2, objArr));
        }
    }

    @KeepForSdk
    public void wtf(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (canLog(7)) {
            m48407a(str2);
            m48407a(str2);
        }
    }

    @KeepForSdk
    public GmsLogger(@NonNull String str, @Nullable String str2) {
        Preconditions.checkNotNull(str, "log tag cannot be null");
        Preconditions.checkArgument(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f45110a = str;
        this.f45111b = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    @KeepForSdk
    public void pii(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
    }

    @KeepForSdk
    /* renamed from: d */
    public void m48404d(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (canLog(3)) {
            m48407a(str2);
        }
    }

    @KeepForSdk
    /* renamed from: e */
    public void m48402e(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (canLog(6)) {
            m48407a(str2);
        }
    }

    @KeepForSdk
    /* renamed from: i */
    public void m48400i(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (canLog(4)) {
            m48407a(str2);
        }
    }

    @KeepForSdk
    /* renamed from: v */
    public void m48398v(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (canLog(2)) {
            m48407a(str2);
        }
    }

    @KeepForSdk
    /* renamed from: w */
    public void m48396w(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (canLog(5)) {
            Log.w(str, m48407a(str2), th2);
        }
    }
}