package io.grpc;

import androidx.core.app.NotificationCompat;
import com.google.common.base.Preconditions;
import io.grpc.Attributes;
import io.grpc.LoadBalancer;
import javax.annotation.Nullable;

@Internal
/* loaded from: classes5.dex */
public abstract class InternalConfigSelector {
    public static final Attributes.Key<InternalConfigSelector> KEY = Attributes.Key.create("internal:io.grpc.config-selector");

    /* loaded from: classes5.dex */
    public static final class Result {

        /* renamed from: a */
        public final Status f63307a;

        /* renamed from: b */
        public final Object f63308b;
        @Nullable
        public ClientInterceptor interceptor;

        /* loaded from: classes5.dex */
        public static final class Builder {

            /* renamed from: a */
            public Object f63309a;

            /* renamed from: b */
            public ClientInterceptor f63310b;

            public Result build() {
                boolean z;
                if (this.f63309a != null) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.checkState(z, "config is not set");
                return new Result(Status.f63464OK, this.f63309a, this.f63310b);
            }

            public Builder setConfig(Object obj) {
                this.f63309a = Preconditions.checkNotNull(obj, "config");
                return this;
            }

            public Builder setInterceptor(ClientInterceptor clientInterceptor) {
                this.f63310b = (ClientInterceptor) Preconditions.checkNotNull(clientInterceptor, "interceptor");
                return this;
            }

            public Builder() {
            }
        }

        public static Result forError(Status status) {
            Preconditions.checkArgument(!status.isOk(), "status is OK");
            return new Result(status, null, null);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Object getConfig() {
            return this.f63308b;
        }

        @Nullable
        public ClientInterceptor getInterceptor() {
            return this.interceptor;
        }

        public Status getStatus() {
            return this.f63307a;
        }

        public Result(Status status, Object obj, ClientInterceptor clientInterceptor) {
            this.f63307a = (Status) Preconditions.checkNotNull(status, NotificationCompat.CATEGORY_STATUS);
            this.f63308b = obj;
            this.interceptor = clientInterceptor;
        }
    }

    public abstract Result selectConfig(LoadBalancer.PickSubchannelArgs pickSubchannelArgs);
}