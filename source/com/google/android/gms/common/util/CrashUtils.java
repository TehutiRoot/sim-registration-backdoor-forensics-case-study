package com.google.android.gms.common.util;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

@KeepForSdk
/* loaded from: classes3.dex */
public final class CrashUtils {

    /* renamed from: a */
    public static final String[] f45299a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public static boolean addDynamiteErrorToDropBox(@NonNull Context context, @NonNull Throwable th2) {
        try {
            Preconditions.checkNotNull(context);
            Preconditions.checkNotNull(th2);
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
