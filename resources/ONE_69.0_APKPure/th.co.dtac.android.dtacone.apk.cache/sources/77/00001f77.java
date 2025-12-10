package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: classes.dex */
public class MutableStateObservable<T> extends StateObservable<T> {
    public MutableStateObservable(Object obj, boolean z) {
        super(obj, z);
    }

    @NonNull
    public static <T> MutableStateObservable<T> withInitialError(@NonNull Throwable th2) {
        return new MutableStateObservable<>(th2, true);
    }

    @NonNull
    public static <T> MutableStateObservable<T> withInitialState(@Nullable T t) {
        return new MutableStateObservable<>(t, false);
    }

    public void setError(@NonNull Throwable th2) {
        m62858c(th2);
    }

    public void setState(@Nullable T t) {
        m62859b(t);
    }
}