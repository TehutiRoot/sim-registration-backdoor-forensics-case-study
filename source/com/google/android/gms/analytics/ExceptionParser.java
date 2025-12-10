package com.google.android.gms.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public interface ExceptionParser {
    @NonNull
    String getDescription(@Nullable String str, @NonNull Throwable th2);
}
