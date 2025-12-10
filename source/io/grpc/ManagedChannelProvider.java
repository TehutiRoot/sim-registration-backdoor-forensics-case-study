package io.grpc;

import com.google.common.base.Preconditions;
import java.net.SocketAddress;
import java.util.Collection;

@Internal
/* loaded from: classes5.dex */
public abstract class ManagedChannelProvider {

    /* loaded from: classes5.dex */
    public static final class NewChannelBuilderResult {

        /* renamed from: a */
        public final ManagedChannelBuilder f63284a;

        /* renamed from: b */
        public final String f63285b;

        public NewChannelBuilderResult(ManagedChannelBuilder managedChannelBuilder, String str) {
            this.f63284a = managedChannelBuilder;
            this.f63285b = str;
        }

        public static NewChannelBuilderResult channelBuilder(ManagedChannelBuilder<?> managedChannelBuilder) {
            return new NewChannelBuilderResult((ManagedChannelBuilder) Preconditions.checkNotNull(managedChannelBuilder), null);
        }

        public static NewChannelBuilderResult error(String str) {
            return new NewChannelBuilderResult(null, (String) Preconditions.checkNotNull(str));
        }

        public ManagedChannelBuilder<?> getChannelBuilder() {
            return this.f63284a;
        }

        public String getError() {
            return this.f63285b;
        }
    }

    /* loaded from: classes5.dex */
    public static final class ProviderNotFoundException extends RuntimeException {
        private static final long serialVersionUID = 1;

        public ProviderNotFoundException(String str) {
            super(str);
        }
    }

    public static ManagedChannelProvider provider() {
        ManagedChannelProvider m30410e = ManagedChannelRegistry.getDefaultRegistry().m30410e();
        if (m30410e != null) {
            return m30410e;
        }
        throw new ProviderNotFoundException("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact");
    }

    public abstract ManagedChannelBuilder<?> builderForAddress(String str, int i);

    public abstract ManagedChannelBuilder<?> builderForTarget(String str);

    public abstract Collection<Class<? extends SocketAddress>> getSupportedSocketAddressTypes();

    public abstract boolean isAvailable();

    public NewChannelBuilderResult newChannelBuilder(String str, ChannelCredentials channelCredentials) {
        return NewChannelBuilderResult.error("ChannelCredentials are unsupported");
    }

    public abstract int priority();
}
