package com.google.android.gms.common.logging;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@KeepForSdk
/* loaded from: classes3.dex */
public class Logger {

    /* renamed from: a */
    public final String f45212a;

    /* renamed from: b */
    public final String f45213b;

    /* renamed from: c */
    public final GmsLogger f45214c;

    /* renamed from: d */
    public final int f45215d;

    @KeepForSdk
    public Logger(@NonNull String str, @NonNull String... strArr) {
        String sb;
        if (strArr.length == 0) {
            sb = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            sb = sb2.toString();
        }
        this.f45213b = sb;
        this.f45212a = str;
        this.f45214c = new GmsLogger(str);
        int i = 2;
        while (i <= 7 && !Log.isLoggable(this.f45212a, i)) {
            i++;
        }
        this.f45215d = i;
    }

    @KeepForSdk
    /* renamed from: d */
    public void m48373d(@NonNull String str, @NonNull Object... objArr) {
        if (isLoggable(3)) {
            format(str, objArr);
        }
    }

    @KeepForSdk
    /* renamed from: e */
    public void m48372e(@NonNull String str, @NonNull Throwable th2, @NonNull Object... objArr) {
        format(str, objArr);
    }

    @NonNull
    @KeepForSdk
    public String format(@NonNull String str, @NonNull Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f45213b.concat(str);
    }

    @NonNull
    @KeepForSdk
    public String getTag() {
        return this.f45212a;
    }

    @KeepForSdk
    /* renamed from: i */
    public void m48370i(@NonNull String str, @NonNull Object... objArr) {
        format(str, objArr);
    }

    @KeepForSdk
    public boolean isLoggable(int i) {
        return this.f45215d <= i;
    }

    @KeepForSdk
    /* renamed from: v */
    public void m48369v(@NonNull String str, @NonNull Throwable th2, @NonNull Object... objArr) {
        if (isLoggable(2)) {
            format(str, objArr);
        }
    }

    @KeepForSdk
    /* renamed from: w */
    public void m48367w(@NonNull String str, @NonNull Object... objArr) {
        Log.w(this.f45212a, format(str, objArr));
    }

    @KeepForSdk
    public void wtf(@NonNull Throwable th2) {
    }

    @KeepForSdk
    /* renamed from: e */
    public void m48371e(@NonNull String str, @NonNull Object... objArr) {
        format(str, objArr);
    }

    @KeepForSdk
    public void wtf(@NonNull String str, @NonNull Throwable th2, @NonNull Object... objArr) {
        format(str, objArr);
    }

    @KeepForSdk
    /* renamed from: v */
    public void m48368v(@NonNull String str, @NonNull Object... objArr) {
        if (isLoggable(2)) {
            format(str, objArr);
        }
    }
}