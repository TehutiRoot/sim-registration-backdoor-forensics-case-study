package io.grpc;

import androidx.core.app.NotificationCompat;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.InlineMe;
import com.google.firebase.messaging.Constants;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ExperimentalApi("https://github.com/grpc/grpc-java/issues/1770")
/* loaded from: classes5.dex */
public abstract class NameResolver {

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/1770")
    /* loaded from: classes5.dex */
    public static final class Args {

        /* renamed from: a */
        public final int f63336a;

        /* renamed from: b */
        public final ProxyDetector f63337b;

        /* renamed from: c */
        public final SynchronizationContext f63338c;

        /* renamed from: d */
        public final ServiceConfigParser f63339d;

        /* renamed from: e */
        public final ScheduledExecutorService f63340e;

        /* renamed from: f */
        public final ChannelLogger f63341f;

        /* renamed from: g */
        public final Executor f63342g;

        /* renamed from: h */
        public final String f63343h;

        /* loaded from: classes5.dex */
        public static final class Builder {

            /* renamed from: a */
            public Integer f63344a;

            /* renamed from: b */
            public ProxyDetector f63345b;

            /* renamed from: c */
            public SynchronizationContext f63346c;

            /* renamed from: d */
            public ServiceConfigParser f63347d;

            /* renamed from: e */
            public ScheduledExecutorService f63348e;

            /* renamed from: f */
            public ChannelLogger f63349f;

            /* renamed from: g */
            public Executor f63350g;

            /* renamed from: h */
            public String f63351h;

            public Args build() {
                return new Args(this.f63344a, this.f63345b, this.f63346c, this.f63347d, this.f63348e, this.f63349f, this.f63350g, this.f63351h, null);
            }

            @ExperimentalApi("https://github.com/grpc/grpc-java/issues/6438")
            public Builder setChannelLogger(ChannelLogger channelLogger) {
                this.f63349f = (ChannelLogger) Preconditions.checkNotNull(channelLogger);
                return this;
            }

            public Builder setDefaultPort(int i) {
                this.f63344a = Integer.valueOf(i);
                return this;
            }

            public Builder setOffloadExecutor(Executor executor) {
                this.f63350g = executor;
                return this;
            }

            @ExperimentalApi("https://github.com/grpc/grpc-java/issues/9406")
            public Builder setOverrideAuthority(String str) {
                this.f63351h = str;
                return this;
            }

            public Builder setProxyDetector(ProxyDetector proxyDetector) {
                this.f63345b = (ProxyDetector) Preconditions.checkNotNull(proxyDetector);
                return this;
            }

            @ExperimentalApi("https://github.com/grpc/grpc-java/issues/6454")
            public Builder setScheduledExecutorService(ScheduledExecutorService scheduledExecutorService) {
                this.f63348e = (ScheduledExecutorService) Preconditions.checkNotNull(scheduledExecutorService);
                return this;
            }

            public Builder setServiceConfigParser(ServiceConfigParser serviceConfigParser) {
                this.f63347d = (ServiceConfigParser) Preconditions.checkNotNull(serviceConfigParser);
                return this;
            }

            public Builder setSynchronizationContext(SynchronizationContext synchronizationContext) {
                this.f63346c = (SynchronizationContext) Preconditions.checkNotNull(synchronizationContext);
                return this;
            }
        }

        public /* synthetic */ Args(Integer num, ProxyDetector proxyDetector, SynchronizationContext synchronizationContext, ServiceConfigParser serviceConfigParser, ScheduledExecutorService scheduledExecutorService, ChannelLogger channelLogger, Executor executor, String str, C10543a c10543a) {
            this(num, proxyDetector, synchronizationContext, serviceConfigParser, scheduledExecutorService, channelLogger, executor, str);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @ExperimentalApi("https://github.com/grpc/grpc-java/issues/6438")
        public ChannelLogger getChannelLogger() {
            ChannelLogger channelLogger = this.f63341f;
            if (channelLogger != null) {
                return channelLogger;
            }
            throw new IllegalStateException("ChannelLogger is not set in Builder");
        }

        public int getDefaultPort() {
            return this.f63336a;
        }

        @Nullable
        public Executor getOffloadExecutor() {
            return this.f63342g;
        }

        @ExperimentalApi("https://github.com/grpc/grpc-java/issues/9406")
        @Nullable
        public String getOverrideAuthority() {
            return this.f63343h;
        }

        public ProxyDetector getProxyDetector() {
            return this.f63337b;
        }

        @ExperimentalApi("https://github.com/grpc/grpc-java/issues/6454")
        public ScheduledExecutorService getScheduledExecutorService() {
            ScheduledExecutorService scheduledExecutorService = this.f63340e;
            if (scheduledExecutorService != null) {
                return scheduledExecutorService;
            }
            throw new IllegalStateException("ScheduledExecutorService not set in Builder");
        }

        public ServiceConfigParser getServiceConfigParser() {
            return this.f63339d;
        }

        public SynchronizationContext getSynchronizationContext() {
            return this.f63338c;
        }

        public Builder toBuilder() {
            Builder builder = new Builder();
            builder.setDefaultPort(this.f63336a);
            builder.setProxyDetector(this.f63337b);
            builder.setSynchronizationContext(this.f63338c);
            builder.setServiceConfigParser(this.f63339d);
            builder.setScheduledExecutorService(this.f63340e);
            builder.setChannelLogger(this.f63341f);
            builder.setOffloadExecutor(this.f63342g);
            builder.setOverrideAuthority(this.f63343h);
            return builder;
        }

        public String toString() {
            return MoreObjects.toStringHelper(this).add("defaultPort", this.f63336a).add("proxyDetector", this.f63337b).add("syncContext", this.f63338c).add("serviceConfigParser", this.f63339d).add("scheduledExecutorService", this.f63340e).add("channelLogger", this.f63341f).add("executor", this.f63342g).add("overrideAuthority", this.f63343h).toString();
        }

        public Args(Integer num, ProxyDetector proxyDetector, SynchronizationContext synchronizationContext, ServiceConfigParser serviceConfigParser, ScheduledExecutorService scheduledExecutorService, ChannelLogger channelLogger, Executor executor, String str) {
            this.f63336a = ((Integer) Preconditions.checkNotNull(num, "defaultPort not set")).intValue();
            this.f63337b = (ProxyDetector) Preconditions.checkNotNull(proxyDetector, "proxyDetector not set");
            this.f63338c = (SynchronizationContext) Preconditions.checkNotNull(synchronizationContext, "syncContext not set");
            this.f63339d = (ServiceConfigParser) Preconditions.checkNotNull(serviceConfigParser, "serviceConfigParser not set");
            this.f63340e = scheduledExecutorService;
            this.f63341f = channelLogger;
            this.f63342g = executor;
            this.f63343h = str;
        }
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/1770")
    /* loaded from: classes5.dex */
    public static abstract class Factory {
        public abstract String getDefaultScheme();

        public abstract NameResolver newNameResolver(URI uri, Args args);
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/1770")
    @ThreadSafe
    /* loaded from: classes5.dex */
    public interface Listener {
        void onAddresses(List<EquivalentAddressGroup> list, Attributes attributes);

        void onError(Status status);
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/1770")
    /* loaded from: classes5.dex */
    public static abstract class Listener2 implements Listener {
        @Override // io.grpc.NameResolver.Listener
        @InlineMe(imports = {"io.grpc.NameResolver.ResolutionResult", "io.grpc.StatusOr"}, replacement = "this.onResult(ResolutionResult.newBuilder().setAddressesOrError(StatusOr.fromValue(servers)).setAttributes(attributes).build())")
        @Deprecated
        public final void onAddresses(List<EquivalentAddressGroup> list, Attributes attributes) {
            onResult(ResolutionResult.newBuilder().setAddressesOrError(StatusOr.fromValue(list)).setAttributes(attributes).build());
        }

        @Override // io.grpc.NameResolver.Listener
        public abstract void onError(Status status);

        public abstract void onResult(ResolutionResult resolutionResult);

        public Status onResult2(ResolutionResult resolutionResult) {
            onResult(resolutionResult);
            return Status.f63401OK;
        }
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/1770")
    /* loaded from: classes5.dex */
    public static final class ResolutionResult {

        /* renamed from: a */
        public final StatusOr f63354a;

        /* renamed from: b */
        public final Attributes f63355b;

        /* renamed from: c */
        public final ConfigOrError f63356c;

        @ExperimentalApi("https://github.com/grpc/grpc-java/issues/1770")
        /* loaded from: classes5.dex */
        public static final class Builder {

            /* renamed from: a */
            public StatusOr f63357a = StatusOr.fromValue(Collections.emptyList());

            /* renamed from: b */
            public Attributes f63358b = Attributes.EMPTY;

            /* renamed from: c */
            public ConfigOrError f63359c;

            public ResolutionResult build() {
                return new ResolutionResult(this.f63357a, this.f63358b, this.f63359c);
            }

            @Deprecated
            public Builder setAddresses(List<EquivalentAddressGroup> list) {
                setAddressesOrError(StatusOr.fromValue(list));
                return this;
            }

            public Builder setAddressesOrError(StatusOr<List<EquivalentAddressGroup>> statusOr) {
                this.f63357a = (StatusOr) Preconditions.checkNotNull(statusOr, "StatusOr addresses cannot be null.");
                return this;
            }

            public Builder setAttributes(Attributes attributes) {
                this.f63358b = attributes;
                return this;
            }

            public Builder setServiceConfig(@Nullable ConfigOrError configOrError) {
                this.f63359c = configOrError;
                return this;
            }
        }

        public ResolutionResult(StatusOr statusOr, Attributes attributes, ConfigOrError configOrError) {
            this.f63354a = statusOr;
            this.f63355b = (Attributes) Preconditions.checkNotNull(attributes, "attributes");
            this.f63356c = configOrError;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ResolutionResult)) {
                return false;
            }
            ResolutionResult resolutionResult = (ResolutionResult) obj;
            if (!Objects.equal(this.f63354a, resolutionResult.f63354a) || !Objects.equal(this.f63355b, resolutionResult.f63355b) || !Objects.equal(this.f63356c, resolutionResult.f63356c)) {
                return false;
            }
            return true;
        }

        @Deprecated
        public List<EquivalentAddressGroup> getAddresses() {
            return (List) this.f63354a.getValue();
        }

        public StatusOr<List<EquivalentAddressGroup>> getAddressesOrError() {
            return this.f63354a;
        }

        public Attributes getAttributes() {
            return this.f63355b;
        }

        @Nullable
        public ConfigOrError getServiceConfig() {
            return this.f63356c;
        }

        public int hashCode() {
            return Objects.hashCode(this.f63354a, this.f63355b, this.f63356c);
        }

        public Builder toBuilder() {
            return newBuilder().setAddressesOrError(this.f63354a).setAttributes(this.f63355b).setServiceConfig(this.f63356c);
        }

        public String toString() {
            MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
            stringHelper.add("addressesOrError", this.f63354a.toString());
            stringHelper.add("attributes", this.f63355b);
            stringHelper.add("serviceConfigOrError", this.f63356c);
            return stringHelper.toString();
        }
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/4972")
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface ResolutionResultAttr {
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/1770")
    /* loaded from: classes5.dex */
    public static abstract class ServiceConfigParser {
        public abstract ConfigOrError parseServiceConfig(Map<String, ?> map);
    }

    /* renamed from: io.grpc.NameResolver$a */
    /* loaded from: classes5.dex */
    public class C10543a extends Listener2 {

        /* renamed from: a */
        public final /* synthetic */ Listener f63360a;

        public C10543a(Listener listener) {
            this.f63360a = listener;
        }

        @Override // io.grpc.NameResolver.Listener2, io.grpc.NameResolver.Listener
        public void onError(Status status) {
            this.f63360a.onError(status);
        }

        @Override // io.grpc.NameResolver.Listener2
        public void onResult(ResolutionResult resolutionResult) {
            this.f63360a.onAddresses(resolutionResult.getAddressesOrError().getValue(), resolutionResult.getAttributes());
        }
    }

    public abstract String getServiceAuthority();

    public void refresh() {
    }

    public abstract void shutdown();

    public void start(Listener listener) {
        if (listener instanceof Listener2) {
            start((Listener2) listener);
        } else {
            start((Listener2) new C10543a(listener));
        }
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/1770")
    /* loaded from: classes5.dex */
    public static final class ConfigOrError {

        /* renamed from: a */
        public final Status f63352a;

        /* renamed from: b */
        public final Object f63353b;

        public ConfigOrError(Object obj) {
            this.f63353b = Preconditions.checkNotNull(obj, "config");
            this.f63352a = null;
        }

        public static ConfigOrError fromConfig(Object obj) {
            return new ConfigOrError(obj);
        }

        public static ConfigOrError fromError(Status status) {
            return new ConfigOrError(status);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || ConfigOrError.class != obj.getClass()) {
                return false;
            }
            ConfigOrError configOrError = (ConfigOrError) obj;
            if (Objects.equal(this.f63352a, configOrError.f63352a) && Objects.equal(this.f63353b, configOrError.f63353b)) {
                return true;
            }
            return false;
        }

        @Nullable
        public Object getConfig() {
            return this.f63353b;
        }

        @Nullable
        public Status getError() {
            return this.f63352a;
        }

        public int hashCode() {
            return Objects.hashCode(this.f63352a, this.f63353b);
        }

        public String toString() {
            if (this.f63353b != null) {
                return MoreObjects.toStringHelper(this).add("config", this.f63353b).toString();
            }
            return MoreObjects.toStringHelper(this).add(Constants.IPC_BUNDLE_KEY_SEND_ERROR, this.f63352a).toString();
        }

        public ConfigOrError(Status status) {
            this.f63353b = null;
            this.f63352a = (Status) Preconditions.checkNotNull(status, NotificationCompat.CATEGORY_STATUS);
            Preconditions.checkArgument(!status.isOk(), "cannot use OK status: %s", status);
        }
    }

    public void start(Listener2 listener2) {
        start((Listener) listener2);
    }
}
