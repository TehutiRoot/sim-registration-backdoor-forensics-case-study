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
    public final String f45200a;

    /* renamed from: b */
    public final String f45201b;

    /* renamed from: c */
    public final GmsLogger f45202c;

    /* renamed from: d */
    public final int f45203d;

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
        this.f45201b = sb;
        this.f45200a = str;
        this.f45202c = new GmsLogger(str);
        int i = 2;
        while (i <= 7 && !Log.isLoggable(this.f45200a, i)) {
            i++;
        }
        this.f45203d = i;
    }

    @KeepForSdk
    /* renamed from: d */
    public void m48376d(@NonNull String str, @NonNull Object... objArr) {
        if (isLoggable(3)) {
            format(str, objArr);
        }
    }

    @KeepForSdk
    /* renamed from: e */
    public void m48375e(@NonNull String str, @NonNull Throwable th2, @NonNull Object... objArr) {
        format(str, objArr);
    }

    @NonNull
    @KeepForSdk
    public String format(@NonNull String str, @NonNull Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f45201b.concat(str);
    }

    @NonNull
    @KeepForSdk
    public String getTag() {
        return this.f45200a;
    }

    @KeepForSdk
    /* renamed from: i */
    public void m48373i(@NonNull String str, @NonNull Object... objArr) {
        format(str, objArr);
    }

    @KeepForSdk
    public boolean isLoggable(int i) {
        return this.f45203d <= i;
    }

    @KeepForSdk
    /* renamed from: v */
    public void m48372v(@NonNull String str, @NonNull Throwable th2, @NonNull Object... objArr) {
        if (isLoggable(2)) {
            format(str, objArr);
        }
    }

    @KeepForSdk
    /* renamed from: w */
    public void m48370w(@NonNull String str, @NonNull Object... objArr) {
        Log.w(this.f45200a, format(str, objArr));
    }

    @KeepForSdk
    public void wtf(@NonNull Throwable th2) {
    }

    @KeepForSdk
    /* renamed from: e */
    public void m48374e(@NonNull String str, @NonNull Object... objArr) {
        format(str, objArr);
    }

    @KeepForSdk
    public void wtf(@NonNull String str, @NonNull Throwable th2, @NonNull Object... objArr) {
        format(str, objArr);
    }

    @KeepForSdk
    /* renamed from: v */
    public void m48371v(@NonNull String str, @NonNull Object... objArr) {
        if (isLoggable(2)) {
            format(str, objArr);
        }
    }
}
