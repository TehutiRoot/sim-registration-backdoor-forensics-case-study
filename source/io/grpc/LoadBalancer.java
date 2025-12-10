package io.grpc;

import androidx.core.app.NotificationCompat;
import ch.qos.logback.core.joran.action.Action;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.firebase.messaging.Constants;
import io.grpc.Attributes;
import io.grpc.ClientStreamTracer;
import io.grpc.MetricRecorder;
import io.grpc.NameResolver;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import javax.annotation.concurrent.ThreadSafe;

@ExperimentalApi("https://github.com/grpc/grpc-java/issues/1771")
@NotThreadSafe
/* loaded from: classes5.dex */
public abstract class LoadBalancer {

    /* renamed from: a */
    public int f63253a;
    @Internal
    public static final Attributes.Key<Map<String, ?>> ATTR_HEALTH_CHECKING_CONFIG = Attributes.Key.create("internal:health-checking-config");
    @Internal
    public static final CreateSubchannelArgs.Key<SubchannelStateListener> HEALTH_CONSUMER_LISTENER_ARG_KEY = CreateSubchannelArgs.Key.create("internal:health-check-consumer-listener");
    @Internal
    public static final CreateSubchannelArgs.Key<Boolean> DISABLE_SUBCHANNEL_RECONNECT_KEY = CreateSubchannelArgs.Key.createWithDefault("internal:disable-subchannel-reconnect", Boolean.FALSE);
    @Internal
    public static final Attributes.Key<Boolean> HAS_HEALTH_PRODUCER_LISTENER_KEY = Attributes.Key.create("internal:has-health-check-producer-listener");
    public static final Attributes.Key<Boolean> IS_PETIOLE_POLICY = Attributes.Key.create("io.grpc.IS_PETIOLE_POLICY");
    @Deprecated
    public static final SubchannelPicker EMPTY_PICKER = new C10527a();

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/1771")
    /* loaded from: classes5.dex */
    public static final class CreateSubchannelArgs {

        /* renamed from: a */
        public final List f63254a;

        /* renamed from: b */
        public final Attributes f63255b;

        /* renamed from: c */
        public final Object[][] f63256c;

        @ExperimentalApi("https://github.com/grpc/grpc-java/issues/1771")
        /* loaded from: classes5.dex */
        public static final class Builder {

            /* renamed from: a */
            public List f63257a;

            /* renamed from: b */
            public Attributes f63258b = Attributes.EMPTY;

            /* renamed from: c */
            public Object[][] f63259c = (Object[][]) Array.newInstance(Object.class, 0, 2);

            public <T> Builder addOption(Key<T> key, T t) {
                Preconditions.checkNotNull(key, Action.KEY_ATTRIBUTE);
                Preconditions.checkNotNull(t, "value");
                int i = 0;
                while (true) {
                    Object[][] objArr = this.f63259c;
                    if (i < objArr.length) {
                        if (key.equals(objArr[i][0])) {
                            break;
                        }
                        i++;
                    } else {
                        i = -1;
                        break;
                    }
                }
                if (i == -1) {
                    Object[][] objArr2 = (Object[][]) Array.newInstance(Object.class, this.f63259c.length + 1, 2);
                    Object[][] objArr3 = this.f63259c;
                    System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
                    this.f63259c = objArr2;
                    i = objArr2.length - 1;
                }
                Object[][] objArr4 = this.f63259c;
                Object[] objArr5 = new Object[2];
                objArr5[0] = key;
                objArr5[1] = t;
                objArr4[i] = objArr5;
                return this;
            }

            /* renamed from: b */
            public final Builder m30422b(Object[][] objArr) {
                Object[][] objArr2 = (Object[][]) Array.newInstance(Object.class, objArr.length, 2);
                this.f63259c = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
                return this;
            }

            public CreateSubchannelArgs build() {
                return new CreateSubchannelArgs(this.f63257a, this.f63258b, this.f63259c, null);
            }

            public Builder setAddresses(EquivalentAddressGroup equivalentAddressGroup) {
                this.f63257a = Collections.singletonList(equivalentAddressGroup);
                return this;
            }

            public Builder setAttributes(Attributes attributes) {
                this.f63258b = (Attributes) Preconditions.checkNotNull(attributes, "attrs");
                return this;
            }

            public Builder setAddresses(List<EquivalentAddressGroup> list) {
                Preconditions.checkArgument(!list.isEmpty(), "addrs is empty");
                this.f63257a = Collections.unmodifiableList(new ArrayList(list));
                return this;
            }
        }

        @ExperimentalApi("https://github.com/grpc/grpc-java/issues/1771")
        /* loaded from: classes5.dex */
        public static final class Key<T> {

            /* renamed from: a */
            public final String f63260a;

            /* renamed from: b */
            public final Object f63261b;

            public Key(String str, Object obj) {
                this.f63260a = str;
                this.f63261b = obj;
            }

            public static <T> Key<T> create(String str) {
                Preconditions.checkNotNull(str, "debugString");
                return new Key<>(str, null);
            }

            public static <T> Key<T> createWithDefault(String str, T t) {
                Preconditions.checkNotNull(str, "debugString");
                return new Key<>(str, t);
            }

            public T getDefault() {
                return (T) this.f63261b;
            }

            public String toString() {
                return this.f63260a;
            }
        }

        public /* synthetic */ CreateSubchannelArgs(List list, Attributes attributes, Object[][] objArr, C10527a c10527a) {
            this(list, attributes, objArr);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public List<EquivalentAddressGroup> getAddresses() {
            return this.f63254a;
        }

        public Attributes getAttributes() {
            return this.f63255b;
        }

        public <T> T getOption(Key<T> key) {
            Preconditions.checkNotNull(key, Action.KEY_ATTRIBUTE);
            int i = 0;
            while (true) {
                Object[][] objArr = this.f63256c;
                if (i >= objArr.length) {
                    return (T) key.f63261b;
                }
                if (key.equals(objArr[i][0])) {
                    return (T) this.f63256c[i][1];
                }
                i++;
            }
        }

        public Builder toBuilder() {
            return newBuilder().setAddresses(this.f63254a).setAttributes(this.f63255b).m30422b(this.f63256c);
        }

        public String toString() {
            return MoreObjects.toStringHelper(this).add("addrs", this.f63254a).add("attrs", this.f63255b).add("customOptions", Arrays.deepToString(this.f63256c)).toString();
        }

        public CreateSubchannelArgs(List list, Attributes attributes, Object[][] objArr) {
            this.f63254a = (List) Preconditions.checkNotNull(list, "addresses are not set");
            this.f63255b = (Attributes) Preconditions.checkNotNull(attributes, "attrs");
            this.f63256c = (Object[][]) Preconditions.checkNotNull(objArr, "customOptions");
        }
    }

    @Deprecated
    /* loaded from: classes5.dex */
    public static final class ErrorPicker extends SubchannelPicker {

        /* renamed from: a */
        public final Status f63262a;

        public ErrorPicker(Status status) {
            this.f63262a = (Status) Preconditions.checkNotNull(status, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        }

        @Override // io.grpc.LoadBalancer.SubchannelPicker
        public PickResult pickSubchannel(PickSubchannelArgs pickSubchannelArgs) {
            return PickResult.withError(this.f63262a);
        }

        public String toString() {
            return MoreObjects.toStringHelper(this).add(Constants.IPC_BUNDLE_KEY_SEND_ERROR, this.f63262a).toString();
        }
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/1771")
    @ThreadSafe
    /* loaded from: classes5.dex */
    public static abstract class Factory {
        public abstract LoadBalancer newLoadBalancer(Helper helper);
    }

    /* loaded from: classes5.dex */
    public static final class FixedResultPicker extends SubchannelPicker {

        /* renamed from: a */
        public final PickResult f63263a;

        public FixedResultPicker(PickResult pickResult) {
            this.f63263a = (PickResult) Preconditions.checkNotNull(pickResult, "result");
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof FixedResultPicker)) {
                return false;
            }
            return this.f63263a.equals(((FixedResultPicker) obj).f63263a);
        }

        public int hashCode() {
            return this.f63263a.hashCode();
        }

        @Override // io.grpc.LoadBalancer.SubchannelPicker
        public PickResult pickSubchannel(PickSubchannelArgs pickSubchannelArgs) {
            return this.f63263a;
        }

        public String toString() {
            return "FixedResultPicker(" + this.f63263a + ")";
        }
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/1771")
    @ThreadSafe
    /* loaded from: classes5.dex */
    public static abstract class Helper {

        /* renamed from: io.grpc.LoadBalancer$Helper$a */
        /* loaded from: classes5.dex */
        public class C10525a implements MetricRecorder {
            public C10525a() {
            }

            @Override // io.grpc.MetricRecorder
            public /* synthetic */ void addDoubleCounter(DoubleCounterMetricInstrument doubleCounterMetricInstrument, double d, List list, List list2) {
                AbstractC23379zs0.m28a(this, doubleCounterMetricInstrument, d, list, list2);
            }

            @Override // io.grpc.MetricRecorder
            public /* synthetic */ void addLongCounter(LongCounterMetricInstrument longCounterMetricInstrument, long j, List list, List list2) {
                AbstractC23379zs0.m27b(this, longCounterMetricInstrument, j, list, list2);
            }

            @Override // io.grpc.MetricRecorder
            public /* synthetic */ void recordDoubleHistogram(DoubleHistogramMetricInstrument doubleHistogramMetricInstrument, double d, List list, List list2) {
                AbstractC23379zs0.m26c(this, doubleHistogramMetricInstrument, d, list, list2);
            }

            @Override // io.grpc.MetricRecorder
            public /* synthetic */ void recordLongHistogram(LongHistogramMetricInstrument longHistogramMetricInstrument, long j, List list, List list2) {
                AbstractC23379zs0.m25d(this, longHistogramMetricInstrument, j, list, list2);
            }

            @Override // io.grpc.MetricRecorder
            public /* synthetic */ MetricRecorder.Registration registerBatchCallback(MetricRecorder.BatchCallback batchCallback, CallbackMetricInstrument... callbackMetricInstrumentArr) {
                return AbstractC23379zs0.m24e(this, batchCallback, callbackMetricInstrumentArr);
            }
        }

        public abstract ManagedChannel createOobChannel(EquivalentAddressGroup equivalentAddressGroup, String str);

        public ManagedChannel createOobChannel(List<EquivalentAddressGroup> list, String str) {
            throw new UnsupportedOperationException();
        }

        public ManagedChannel createResolvingOobChannel(String str) {
            return createResolvingOobChannelBuilder(str).build();
        }

        @Deprecated
        public ManagedChannelBuilder<?> createResolvingOobChannelBuilder(String str) {
            throw new UnsupportedOperationException("Not implemented");
        }

        public Subchannel createSubchannel(CreateSubchannelArgs createSubchannelArgs) {
            throw new UnsupportedOperationException();
        }

        public abstract String getAuthority();

        public ChannelCredentials getChannelCredentials() {
            return getUnsafeChannelCredentials().withoutBearerTokens();
        }

        public ChannelLogger getChannelLogger() {
            throw new UnsupportedOperationException();
        }

        public String getChannelTarget() {
            throw new UnsupportedOperationException();
        }

        @Internal
        public MetricRecorder getMetricRecorder() {
            return new C10525a();
        }

        public NameResolver.Args getNameResolverArgs() {
            throw new UnsupportedOperationException();
        }

        public NameResolverRegistry getNameResolverRegistry() {
            throw new UnsupportedOperationException();
        }

        public ScheduledExecutorService getScheduledExecutorService() {
            throw new UnsupportedOperationException();
        }

        public SynchronizationContext getSynchronizationContext() {
            throw new UnsupportedOperationException();
        }

        public ChannelCredentials getUnsafeChannelCredentials() {
            throw new UnsupportedOperationException();
        }

        @ExperimentalApi("https://github.com/grpc/grpc-java/issues/8088")
        @Deprecated
        public void ignoreRefreshNameResolutionCheck() {
        }

        public void refreshNameResolution() {
            throw new UnsupportedOperationException();
        }

        public abstract void updateBalancingState(@Nonnull ConnectivityState connectivityState, @Nonnull SubchannelPicker subchannelPicker);

        public void updateOobChannelAddresses(ManagedChannel managedChannel, EquivalentAddressGroup equivalentAddressGroup) {
            throw new UnsupportedOperationException();
        }

        public ManagedChannelBuilder<?> createResolvingOobChannelBuilder(String str, ChannelCredentials channelCredentials) {
            throw new UnsupportedOperationException();
        }

        public void updateOobChannelAddresses(ManagedChannel managedChannel, List<EquivalentAddressGroup> list) {
            throw new UnsupportedOperationException();
        }
    }

    @Internal
    /* loaded from: classes5.dex */
    public interface PickDetailsConsumer {
        void addOptionalLabel(String str, String str2);
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/1771")
    /* loaded from: classes5.dex */
    public static abstract class PickSubchannelArgs {

        /* renamed from: io.grpc.LoadBalancer$PickSubchannelArgs$a */
        /* loaded from: classes5.dex */
        public class C10526a implements PickDetailsConsumer {
            public C10526a() {
            }

            @Override // io.grpc.LoadBalancer.PickDetailsConsumer
            public /* synthetic */ void addOptionalLabel(String str, String str2) {
                AbstractC21976rj0.m23280a(this, str, str2);
            }
        }

        public abstract CallOptions getCallOptions();

        public abstract Metadata getHeaders();

        public abstract MethodDescriptor<?, ?> getMethodDescriptor();

        @Internal
        public PickDetailsConsumer getPickDetailsConsumer() {
            return new C10526a();
        }
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/1771")
    /* loaded from: classes5.dex */
    public static final class ResolvedAddresses {

        /* renamed from: a */
        public final List f63271a;

        /* renamed from: b */
        public final Attributes f63272b;

        /* renamed from: c */
        public final Object f63273c;

        @ExperimentalApi("https://github.com/grpc/grpc-java/issues/1771")
        /* loaded from: classes5.dex */
        public static final class Builder {

            /* renamed from: a */
            public List f63274a;

            /* renamed from: b */
            public Attributes f63275b = Attributes.EMPTY;

            /* renamed from: c */
            public Object f63276c;

            public ResolvedAddresses build() {
                return new ResolvedAddresses(this.f63274a, this.f63275b, this.f63276c, null);
            }

            public Builder setAddresses(List<EquivalentAddressGroup> list) {
                this.f63274a = list;
                return this;
            }

            public Builder setAttributes(Attributes attributes) {
                this.f63275b = attributes;
                return this;
            }

            public Builder setLoadBalancingPolicyConfig(@Nullable Object obj) {
                this.f63276c = obj;
                return this;
            }
        }

        public /* synthetic */ ResolvedAddresses(List list, Attributes attributes, Object obj, C10527a c10527a) {
            this(list, attributes, obj);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ResolvedAddresses)) {
                return false;
            }
            ResolvedAddresses resolvedAddresses = (ResolvedAddresses) obj;
            if (!Objects.equal(this.f63271a, resolvedAddresses.f63271a) || !Objects.equal(this.f63272b, resolvedAddresses.f63272b) || !Objects.equal(this.f63273c, resolvedAddresses.f63273c)) {
                return false;
            }
            return true;
        }

        public List<EquivalentAddressGroup> getAddresses() {
            return this.f63271a;
        }

        public Attributes getAttributes() {
            return this.f63272b;
        }

        @Nullable
        public Object getLoadBalancingPolicyConfig() {
            return this.f63273c;
        }

        public int hashCode() {
            return Objects.hashCode(this.f63271a, this.f63272b, this.f63273c);
        }

        public Builder toBuilder() {
            return newBuilder().setAddresses(this.f63271a).setAttributes(this.f63272b).setLoadBalancingPolicyConfig(this.f63273c);
        }

        public String toString() {
            return MoreObjects.toStringHelper(this).add("addresses", this.f63271a).add("attributes", this.f63272b).add("loadBalancingPolicyConfig", this.f63273c).toString();
        }

        public ResolvedAddresses(List list, Attributes attributes, Object obj) {
            this.f63271a = Collections.unmodifiableList(new ArrayList((Collection) Preconditions.checkNotNull(list, "addresses")));
            this.f63272b = (Attributes) Preconditions.checkNotNull(attributes, "attributes");
            this.f63273c = obj;
        }
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/1771")
    /* loaded from: classes5.dex */
    public static abstract class Subchannel {
        @Internal
        public Channel asChannel() {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
            if (r0.size() == 1) goto L5;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final io.grpc.EquivalentAddressGroup getAddresses() {
            /*
                r4 = this;
                java.util.List r0 = r4.getAllAddresses()
                r1 = 0
                if (r0 == 0) goto Lf
                int r2 = r0.size()
                r3 = 1
                if (r2 != r3) goto Lf
                goto L10
            Lf:
                r3 = 0
            L10:
                java.lang.String r2 = "%s does not have exactly one group"
                com.google.common.base.Preconditions.checkState(r3, r2, r0)
                java.lang.Object r0 = r0.get(r1)
                io.grpc.EquivalentAddressGroup r0 = (io.grpc.EquivalentAddressGroup) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.LoadBalancer.Subchannel.getAddresses():io.grpc.EquivalentAddressGroup");
        }

        public List<EquivalentAddressGroup> getAllAddresses() {
            throw new UnsupportedOperationException();
        }

        public abstract Attributes getAttributes();

        public ChannelLogger getChannelLogger() {
            throw new UnsupportedOperationException();
        }

        @Internal
        public Attributes getConnectedAddressAttributes() {
            throw new UnsupportedOperationException();
        }

        @Internal
        public Object getInternalSubchannel() {
            throw new UnsupportedOperationException();
        }

        public abstract void requestConnection();

        public abstract void shutdown();

        public void start(SubchannelStateListener subchannelStateListener) {
            throw new UnsupportedOperationException("Not implemented");
        }

        public void updateAddresses(List<EquivalentAddressGroup> list) {
            throw new UnsupportedOperationException();
        }
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/1771")
    @ThreadSafe
    /* loaded from: classes5.dex */
    public static abstract class SubchannelPicker {
        public abstract PickResult pickSubchannel(PickSubchannelArgs pickSubchannelArgs);

        @Deprecated
        public void requestConnection() {
        }
    }

    /* loaded from: classes5.dex */
    public interface SubchannelStateListener {
        void onSubchannelState(ConnectivityStateInfo connectivityStateInfo);
    }

    /* renamed from: io.grpc.LoadBalancer$a */
    /* loaded from: classes5.dex */
    public class C10527a extends SubchannelPicker {
        @Override // io.grpc.LoadBalancer.SubchannelPicker
        public PickResult pickSubchannel(PickSubchannelArgs pickSubchannelArgs) {
            return PickResult.withNoResult();
        }

        public String toString() {
            return "EMPTY_PICKER";
        }
    }

    public Status acceptResolvedAddresses(ResolvedAddresses resolvedAddresses) {
        if (resolvedAddresses.getAddresses().isEmpty() && !canHandleEmptyAddressListFromNameResolution()) {
            Status status = Status.UNAVAILABLE;
            Status withDescription = status.withDescription("NameResolver returned no usable address. addrs=" + resolvedAddresses.getAddresses() + ", attrs=" + resolvedAddresses.getAttributes());
            handleNameResolutionError(withDescription);
            return withDescription;
        }
        int i = this.f63253a;
        this.f63253a = i + 1;
        if (i == 0) {
            handleResolvedAddresses(resolvedAddresses);
        }
        this.f63253a = 0;
        return Status.f63401OK;
    }

    public boolean canHandleEmptyAddressListFromNameResolution() {
        return false;
    }

    public abstract void handleNameResolutionError(Status status);

    public void handleResolvedAddresses(ResolvedAddresses resolvedAddresses) {
        int i = this.f63253a;
        this.f63253a = i + 1;
        if (i == 0) {
            acceptResolvedAddresses(resolvedAddresses);
        }
        this.f63253a = 0;
    }

    @Deprecated
    public void handleSubchannelState(Subchannel subchannel, ConnectivityStateInfo connectivityStateInfo) {
    }

    public void requestConnection() {
    }

    public abstract void shutdown();

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/1771")
    @Immutable
    /* loaded from: classes5.dex */
    public static final class PickResult {

        /* renamed from: e */
        public static final PickResult f63265e = new PickResult(null, null, Status.f63401OK, false);

        /* renamed from: a */
        public final Subchannel f63266a;

        /* renamed from: b */
        public final ClientStreamTracer.Factory f63267b;

        /* renamed from: c */
        public final Status f63268c;

        /* renamed from: d */
        public final boolean f63269d;

        public PickResult(Subchannel subchannel, ClientStreamTracer.Factory factory, Status status, boolean z) {
            this.f63266a = subchannel;
            this.f63267b = factory;
            this.f63268c = (Status) Preconditions.checkNotNull(status, NotificationCompat.CATEGORY_STATUS);
            this.f63269d = z;
        }

        public static PickResult withDrop(Status status) {
            Preconditions.checkArgument(!status.isOk(), "drop status shouldn't be OK");
            return new PickResult(null, null, status, true);
        }

        public static PickResult withError(Status status) {
            Preconditions.checkArgument(!status.isOk(), "error status shouldn't be OK");
            return new PickResult(null, null, status, false);
        }

        public static PickResult withNoResult() {
            return f63265e;
        }

        public static PickResult withSubchannel(Subchannel subchannel, @Nullable ClientStreamTracer.Factory factory) {
            return new PickResult((Subchannel) Preconditions.checkNotNull(subchannel, "subchannel"), factory, Status.f63401OK, false);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof PickResult)) {
                return false;
            }
            PickResult pickResult = (PickResult) obj;
            if (!Objects.equal(this.f63266a, pickResult.f63266a) || !Objects.equal(this.f63268c, pickResult.f63268c) || !Objects.equal(this.f63267b, pickResult.f63267b) || this.f63269d != pickResult.f63269d) {
                return false;
            }
            return true;
        }

        public Status getStatus() {
            return this.f63268c;
        }

        @Nullable
        public ClientStreamTracer.Factory getStreamTracerFactory() {
            return this.f63267b;
        }

        @Nullable
        public Subchannel getSubchannel() {
            return this.f63266a;
        }

        public boolean hasResult() {
            if (this.f63266a == null && this.f63268c.isOk()) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Objects.hashCode(this.f63266a, this.f63268c, this.f63267b, Boolean.valueOf(this.f63269d));
        }

        public boolean isDrop() {
            return this.f63269d;
        }

        public String toString() {
            return MoreObjects.toStringHelper(this).add("subchannel", this.f63266a).add("streamTracerFactory", this.f63267b).add(NotificationCompat.CATEGORY_STATUS, this.f63268c).add("drop", this.f63269d).toString();
        }

        public static PickResult withSubchannel(Subchannel subchannel) {
            return withSubchannel(subchannel, null);
        }
    }
}
