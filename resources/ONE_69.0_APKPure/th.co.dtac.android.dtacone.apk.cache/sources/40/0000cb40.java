package io.grpc;

import com.google.common.base.Preconditions;

@ExperimentalApi("https://github.com/grpc/grpc-java/issues/1771")
/* loaded from: classes5.dex */
public final class ConnectivityStateInfo {

    /* renamed from: a */
    public final ConnectivityState f63192a;

    /* renamed from: b */
    public final Status f63193b;

    public ConnectivityStateInfo(ConnectivityState connectivityState, Status status) {
        this.f63192a = (ConnectivityState) Preconditions.checkNotNull(connectivityState, "state is null");
        this.f63193b = (Status) Preconditions.checkNotNull(status, "status is null");
    }

    public static ConnectivityStateInfo forNonError(ConnectivityState connectivityState) {
        boolean z;
        if (connectivityState != ConnectivityState.TRANSIENT_FAILURE) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "state is TRANSIENT_ERROR. Use forError() instead");
        return new ConnectivityStateInfo(connectivityState, Status.f63464OK);
    }

    public static ConnectivityStateInfo forTransientFailure(Status status) {
        Preconditions.checkArgument(!status.isOk(), "The error status must not be OK");
        return new ConnectivityStateInfo(ConnectivityState.TRANSIENT_FAILURE, status);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ConnectivityStateInfo)) {
            return false;
        }
        ConnectivityStateInfo connectivityStateInfo = (ConnectivityStateInfo) obj;
        if (!this.f63192a.equals(connectivityStateInfo.f63192a) || !this.f63193b.equals(connectivityStateInfo.f63193b)) {
            return false;
        }
        return true;
    }

    public ConnectivityState getState() {
        return this.f63192a;
    }

    public Status getStatus() {
        return this.f63193b;
    }

    public int hashCode() {
        return this.f63192a.hashCode() ^ this.f63193b.hashCode();
    }

    public String toString() {
        if (this.f63193b.isOk()) {
            return this.f63192a.toString();
        }
        return this.f63192a + "(" + this.f63193b + ")";
    }
}