package com.jakewharton.rxbinding2.widget;

import android.widget.Adapter;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding2.InitialValueObservable;
import com.jakewharton.rxbinding2.internal.Preconditions;

/* loaded from: classes5.dex */
public final class RxAdapter {
    @NonNull
    @CheckResult
    public static <T extends Adapter> InitialValueObservable<T> dataChanges(@NonNull T t) {
        Preconditions.checkNotNull(t, "adapter == null");
        return new C1864a2(t);
    }
}
