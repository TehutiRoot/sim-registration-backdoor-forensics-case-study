package androidx.camera.core.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import androidx.core.util.Supplier;
import java.io.Serializable;

@RequiresApi(21)
/* loaded from: classes.dex */
public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    @NonNull
    public static <T> Optional<T> absent() {
        return Absent.withType();
    }

    @NonNull
    public static <T> Optional<T> fromNullable(@Nullable T t) {
        if (t == null) {
            return absent();
        }
        return new Present(t);
    }

    @NonNull
    /* renamed from: of */
    public static <T> Optional<T> m62850of(@NonNull T t) {
        return new Present(Preconditions.checkNotNull(t));
    }

    public abstract boolean equals(@Nullable Object obj);

    @NonNull
    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    @NonNull
    /* renamed from: or */
    public abstract Optional<T> mo62849or(@NonNull Optional<? extends T> optional);

    @NonNull
    /* renamed from: or */
    public abstract T mo62848or(@NonNull Supplier<? extends T> supplier);

    @NonNull
    /* renamed from: or */
    public abstract T mo62847or(@NonNull T t);

    @Nullable
    public abstract T orNull();

    @NonNull
    public abstract String toString();
}
