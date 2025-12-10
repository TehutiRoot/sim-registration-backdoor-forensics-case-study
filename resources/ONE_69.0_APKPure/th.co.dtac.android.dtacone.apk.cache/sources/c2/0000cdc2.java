package io.reactivex;

import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.NotificationLite;

/* loaded from: classes5.dex */
public final class Notification<T> {

    /* renamed from: b */
    public static final Notification f63855b = new Notification(null);

    /* renamed from: a */
    public final Object f63856a;

    public Notification(Object obj) {
        this.f63856a = obj;
    }

    @NonNull
    public static <T> Notification<T> createOnComplete() {
        return f63855b;
    }

    @NonNull
    public static <T> Notification<T> createOnError(@NonNull Throwable th2) {
        ObjectHelper.requireNonNull(th2, "error is null");
        return new Notification<>(NotificationLite.error(th2));
    }

    @NonNull
    public static <T> Notification<T> createOnNext(@NonNull T t) {
        ObjectHelper.requireNonNull(t, "value is null");
        return new Notification<>(t);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Notification) {
            return ObjectHelper.equals(this.f63856a, ((Notification) obj).f63856a);
        }
        return false;
    }

    @Nullable
    public Throwable getError() {
        Object obj = this.f63856a;
        if (NotificationLite.isError(obj)) {
            return NotificationLite.getError(obj);
        }
        return null;
    }

    @Nullable
    public T getValue() {
        Object obj = this.f63856a;
        if (obj != null && !NotificationLite.isError(obj)) {
            return (T) this.f63856a;
        }
        return null;
    }

    public int hashCode() {
        Object obj = this.f63856a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public boolean isOnComplete() {
        if (this.f63856a == null) {
            return true;
        }
        return false;
    }

    public boolean isOnError() {
        return NotificationLite.isError(this.f63856a);
    }

    public boolean isOnNext() {
        Object obj = this.f63856a;
        if (obj != null && !NotificationLite.isError(obj)) {
            return true;
        }
        return false;
    }

    public String toString() {
        Object obj = this.f63856a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (NotificationLite.isError(obj)) {
            return "OnErrorNotification[" + NotificationLite.getError(obj) + "]";
        }
        return "OnNextNotification[" + this.f63856a + "]";
    }
}