package io.grpc;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import io.grpc.CallOptions;
import javax.annotation.concurrent.ThreadSafe;

@ExperimentalApi("https://github.com/grpc/grpc-java/issues/2861")
@ThreadSafe
/* loaded from: classes5.dex */
public abstract class ClientStreamTracer extends StreamTracer {
    public static final CallOptions.Key<Long> NAME_RESOLUTION_DELAYED = CallOptions.Key.create("io.grpc.ClientStreamTracer.NAME_RESOLUTION_DELAYED");

    /* loaded from: classes5.dex */
    public static abstract class Factory {
        public ClientStreamTracer newClientStreamTracer(StreamInfo streamInfo, Metadata metadata) {
            throw new UnsupportedOperationException("Not implemented");
        }
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/2861")
    /* loaded from: classes5.dex */
    public static final class StreamInfo {

        /* renamed from: a */
        public final CallOptions f63173a;

        /* renamed from: b */
        public final int f63174b;

        /* renamed from: c */
        public final boolean f63175c;

        /* loaded from: classes5.dex */
        public static final class Builder {

            /* renamed from: a */
            public CallOptions f63176a = CallOptions.DEFAULT;

            /* renamed from: b */
            public int f63177b;

            /* renamed from: c */
            public boolean f63178c;

            public StreamInfo build() {
                return new StreamInfo(this.f63176a, this.f63177b, this.f63178c);
            }

            public Builder setCallOptions(CallOptions callOptions) {
                this.f63176a = (CallOptions) Preconditions.checkNotNull(callOptions, "callOptions cannot be null");
                return this;
            }

            public Builder setIsTransparentRetry(boolean z) {
                this.f63178c = z;
                return this;
            }

            public Builder setPreviousAttempts(int i) {
                this.f63177b = i;
                return this;
            }
        }

        public StreamInfo(CallOptions callOptions, int i, boolean z) {
            this.f63173a = (CallOptions) Preconditions.checkNotNull(callOptions, "callOptions");
            this.f63174b = i;
            this.f63175c = z;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public CallOptions getCallOptions() {
            return this.f63173a;
        }

        public int getPreviousAttempts() {
            return this.f63174b;
        }

        public boolean isTransparentRetry() {
            return this.f63175c;
        }

        public Builder toBuilder() {
            return new Builder().setCallOptions(this.f63173a).setPreviousAttempts(this.f63174b).setIsTransparentRetry(this.f63175c);
        }

        public String toString() {
            return MoreObjects.toStringHelper(this).add("callOptions", this.f63173a).add("previousAttempts", this.f63174b).add("isTransparentRetry", this.f63175c).toString();
        }
    }

    @Internal
    public void addOptionalLabel(String str, String str2) {
    }

    public void createPendingStream() {
    }

    public void inboundHeaders() {
    }

    public void inboundTrailers(Metadata metadata) {
    }

    public void outboundHeaders() {
    }

    public void streamCreated(Attributes attributes, Metadata metadata) {
    }

    public void inboundHeaders(Metadata metadata) {
        inboundHeaders();
    }
}