package com.google.android.gms.vision;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* renamed from: com.google.android.gms.vision.L */
/* loaded from: classes4.dex */
public class C6768L {
    @RecentlyNonNull
    @KeepForSdk
    public static final String TAG = "Vision";

    @KeepForSdk
    /* renamed from: d */
    public static int m45996d(@RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (Log.isLoggable(TAG, 3)) {
            return Log.d(TAG, String.format(str, objArr));
        }
        return 0;
    }

    @KeepForSdk
    /* renamed from: e */
    public static int m45994e(@RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (Log.isLoggable(TAG, 6)) {
            return Log.e(TAG, String.format(str, objArr));
        }
        return 0;
    }

    @KeepForSdk
    /* renamed from: i */
    public static int m45992i(@RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (Log.isLoggable(TAG, 4)) {
            return Log.i(TAG, String.format(str, objArr));
        }
        return 0;
    }

    @KeepForSdk
    /* renamed from: v */
    public static int m45991v(@RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (Log.isLoggable(TAG, 2)) {
            return Log.v(TAG, String.format(str, objArr));
        }
        return 0;
    }

    @KeepForSdk
    /* renamed from: w */
    public static int m45990w(@RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (Log.isLoggable(TAG, 5)) {
            return Log.w(TAG, String.format(str, objArr));
        }
        return 0;
    }

    @KeepForSdk
    /* renamed from: d */
    public static int m45995d(@RecentlyNonNull Throwable th2, @RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (Log.isLoggable(TAG, 3)) {
            return Log.d(TAG, String.format(str, objArr), th2);
        }
        return 0;
    }

    @KeepForSdk
    @SuppressLint({"LogTagMismatch"})
    /* renamed from: e */
    public static int m45993e(@RecentlyNonNull Throwable th2, @RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (Log.isLoggable(TAG, 6)) {
            if (Log.isLoggable(TAG, 3)) {
                return Log.e(TAG, String.format(str, objArr), th2);
            }
            String format = String.format(str, objArr);
            String valueOf = String.valueOf(th2);
            StringBuilder sb = new StringBuilder(format.length() + 2 + valueOf.length());
            sb.append(format);
            sb.append(": ");
            sb.append(valueOf);
            return Log.e(TAG, sb.toString());
        }
        return 0;
    }

    @KeepForSdk
    @SuppressLint({"LogTagMismatch"})
    /* renamed from: w */
    public static int m45989w(@RecentlyNonNull Throwable th2, @RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (Log.isLoggable(TAG, 5)) {
            if (Log.isLoggable(TAG, 3)) {
                return Log.w(TAG, String.format(str, objArr), th2);
            }
            String format = String.format(str, objArr);
            String valueOf = String.valueOf(th2);
            StringBuilder sb = new StringBuilder(format.length() + 2 + valueOf.length());
            sb.append(format);
            sb.append(": ");
            sb.append(valueOf);
            return Log.w(TAG, sb.toString());
        }
        return 0;
    }
}