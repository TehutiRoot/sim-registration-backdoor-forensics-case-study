package io.grpc;

import androidx.core.app.NotificationCompat;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.firebase.messaging.Constants;
import javax.annotation.Nullable;

@ExperimentalApi("https://github.com/grpc/grpc-java/issues/11563")
/* loaded from: classes5.dex */
public class StatusOr<T> {

    /* renamed from: a */
    public final Status f63411a;

    /* renamed from: b */
    public final Object f63412b;

    public StatusOr(Status status, Object obj) {
        this.f63411a = status;
        this.f63412b = obj;
    }

    public static <T> StatusOr<T> fromStatus(Status status) {
        StatusOr<T> statusOr = new StatusOr<>((Status) Preconditions.checkNotNull(status, NotificationCompat.CATEGORY_STATUS), null);
        Preconditions.checkArgument(!status.isOk(), "cannot use OK status: %s", status);
        return statusOr;
    }

    public static <T> StatusOr<T> fromValue(@Nullable T t) {
        return new StatusOr<>(null, t);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StatusOr)) {
            return false;
        }
        StatusOr statusOr = (StatusOr) obj;
        if (hasValue() != statusOr.hasValue()) {
            return false;
        }
        if (hasValue()) {
            return Objects.equal(this.f63412b, statusOr.f63412b);
        }
        return Objects.equal(this.f63411a, statusOr.f63411a);
    }

    public Status getStatus() {
        Status status = this.f63411a;
        if (status == null) {
            return Status.f63401OK;
        }
        return status;
    }

    @Nullable
    public T getValue() {
        if (this.f63411a == null) {
            return (T) this.f63412b;
        }
        throw new IllegalStateException("No value present.");
    }

    public boolean hasValue() {
        if (this.f63411a == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f63411a, this.f63412b);
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        Status status = this.f63411a;
        if (status == null) {
            stringHelper.add("value", this.f63412b);
        } else {
            stringHelper.add(Constants.IPC_BUNDLE_KEY_SEND_ERROR, status);
        }
        return stringHelper.toString();
    }
}
